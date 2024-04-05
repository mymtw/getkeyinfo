package com.fasterxml.jackson.databind.ser;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, beanSerializerBuilder, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    @Deprecated
    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, (BeanSerializerBuilder) null, BeanSerializerBase.NO_PROPS, (BeanPropertyWriter[]) null);
    }

    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new BeanAsArraySerializer(this) : this;
    }

    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.setCurrentValue(obj);
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, true);
            return;
        }
        jsonGenerator.writeStartObject(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BeanSerializer for ");
        h.append(handledType().getName());
        return h.toString();
    }

    public JsonSerializer<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, nameTransformer);
    }

    public BeanSerializerBase withIgnorals(Set<String> set) {
        return new BeanSerializer((BeanSerializerBase) this, set);
    }

    public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
        return new BeanSerializer((BeanSerializerBase) this, objectIdWriter, this._propertyFilterId);
    }

    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer((BeanSerializerBase) this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    public static BeanSerializer createDummy(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder) {
        return new BeanSerializer(javaType, beanSerializerBuilder, BeanSerializerBase.NO_PROPS, (BeanPropertyWriter[]) null);
    }

    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanSerializer((BeanSerializerBase) this, this._objectIdWriter, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter) {
        super(beanSerializerBase, objectIdWriter);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanSerializerBase, objectIdWriter, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        super(beanSerializerBase, set);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase, beanPropertyWriterArr, beanPropertyWriterArr2);
    }
}
