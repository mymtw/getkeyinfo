package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class CoreXMLDeserializers extends Deserializers.Base {
    public static final int TYPE_DURATION = 1;
    public static final int TYPE_G_CALENDAR = 2;
    public static final int TYPE_QNAME = 3;
    public static final DatatypeFactory _dataTypeFactory;

    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public final int _kind;

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            int i = this._kind;
            if (i == 1) {
                return CoreXMLDeserializers._dataTypeFactory.newDuration(str);
            }
            if (i == 2) {
                try {
                    return _gregorianFromDate(deserializationContext, _parseDate(str, deserializationContext));
                } catch (JsonMappingException unused) {
                    return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(str);
                }
            } else if (i == 3) {
                return QName.valueOf(str);
            } else {
                throw new IllegalStateException();
            }
        }

        public XMLGregorianCalendar _gregorianFromDate(DeserializationContext deserializationContext, Date date) {
            if (date == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        }

        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (this._kind != 2 || !jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) ? super.deserialize(jsonParser, deserializationContext) : _gregorianFromDate(deserializationContext, _parseDate(jsonParser, deserializationContext));
        }
    }

    static {
        try {
            _dataTypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == QName.class) {
            return new Std(rawClass, 3);
        }
        if (rawClass == XMLGregorianCalendar.class) {
            return new Std(rawClass, 2);
        }
        if (rawClass == Duration.class) {
            return new Std(rawClass, 1);
        }
        return null;
    }

    public boolean hasDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        return cls == QName.class || cls == XMLGregorianCalendar.class || cls == Duration.class;
    }
}
