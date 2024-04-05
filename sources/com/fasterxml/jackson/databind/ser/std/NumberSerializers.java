package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;

public class NumberSerializers {

    public static abstract class Base<T> extends StdScalarSerializer<T> implements ContextualSerializer {
        public final boolean _isInt;
        public final JsonParser.NumberType _numberType;
        public final String _schemaType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            boolean z = false;
            this._numberType = numberType;
            this._schemaType = str;
            this._isInt = (numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER) ? true : z;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
            if (this._isInt) {
                visitIntFormat(jsonFormatVisitorWrapper, javaType, this._numberType);
            } else {
                visitFloatFormat(jsonFormatVisitorWrapper, javaType, this._numberType);
            }
        }

        public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
            return (findFormatOverrides == null || C12581a.f27757a[findFormatOverrides.getShape().ordinal()] != 1) ? this : handledType() == BigDecimal.class ? NumberSerializer.bigDecimalAsStringSerializer() : ToStringSerializer.instance;
        }

        public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
            return createSchemaNode(this._schemaType, true);
        }
    }

    @JacksonStdImpl
    public static class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, "number");
        }

        public static boolean notFinite(double d) {
            return Double.isNaN(d) || Double.isInfinite(d);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Double) obj).doubleValue());
        }

        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            Double d = (Double) obj;
            if (notFinite(d.doubleValue())) {
                WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_NUMBER_FLOAT));
                jsonGenerator.writeNumber(d.doubleValue());
                typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
                return;
            }
            jsonGenerator.writeNumber(d.doubleValue());
        }
    }

    @JacksonStdImpl
    public static class FloatSerializer extends Base<Object> {
        public static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Float) obj).floatValue());
        }
    }

    @JacksonStdImpl
    public static class IntLikeSerializer extends Base<Object> {
        public static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, "integer");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Number) obj).intValue());
        }
    }

    @JacksonStdImpl
    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, "integer");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Integer) obj).intValue());
        }

        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            serialize(obj, jsonGenerator, serializerProvider);
        }
    }

    @JacksonStdImpl
    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Long) obj).longValue());
        }
    }

    @JacksonStdImpl
    public static class ShortSerializer extends Base<Object> {
        public static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, "number");
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(((Short) obj).shortValue());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$a */
    public static /* synthetic */ class C12581a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27757a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f27757a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void addAll(Map<String, JsonSerializer<?>> map) {
        Class<Double> cls = Double.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        map.put(cls3.getName(), new IntegerSerializer(cls3));
        Class cls4 = Integer.TYPE;
        map.put(cls4.getName(), new IntegerSerializer(cls4));
        map.put(cls2.getName(), new LongSerializer(cls2));
        Class cls5 = Long.TYPE;
        map.put(cls5.getName(), new LongSerializer(cls5));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(cls.getName(), new DoubleSerializer(cls));
        map.put(Double.TYPE.getName(), new DoubleSerializer(Double.TYPE));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }
}
