package com.fasterxml.jackson.databind.ser.std;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer {
    public final AnnotatedMember _accessor;
    public final boolean _forceTypeInformation;
    public final BeanProperty _property;
    public final JsonSerializer<Object> _valueSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer$a */
    public static class C12578a extends TypeSerializer {

        /* renamed from: a */
        public final TypeSerializer f27753a;

        /* renamed from: b */
        public final Object f27754b;

        public C12578a(TypeSerializer typeSerializer, Object obj) {
            this.f27753a = typeSerializer;
            this.f27754b = obj;
        }

        public final TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        public final String getPropertyName() {
            return this.f27753a.getPropertyName();
        }

        public final TypeIdResolver getTypeIdResolver() {
            return this.f27753a.getTypeIdResolver();
        }

        public final JsonTypeInfo.C12506As getTypeInclusion() {
            return this.f27753a.getTypeInclusion();
        }

        @Deprecated
        public final void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypePrefixForArray(this.f27754b, jsonGenerator, str);
        }

        @Deprecated
        public final void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypePrefixForObject(this.f27754b, jsonGenerator, str);
        }

        @Deprecated
        public final void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypePrefixForScalar(this.f27754b, jsonGenerator, str);
        }

        @Deprecated
        public final void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypeSuffixForArray(this.f27754b, jsonGenerator, str);
        }

        @Deprecated
        public final void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypeSuffixForObject(this.f27754b, jsonGenerator, str);
        }

        @Deprecated
        public final void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this.f27753a.writeCustomTypeSuffixForScalar(this.f27754b, jsonGenerator, str);
        }

        public final WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.forValue = this.f27754b;
            return this.f27753a.writeTypePrefix(jsonGenerator, writableTypeId);
        }

        @Deprecated
        public final void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypePrefixForArray(this.f27754b, jsonGenerator);
        }

        @Deprecated
        public final void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypePrefixForObject(this.f27754b, jsonGenerator);
        }

        @Deprecated
        public final void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypePrefixForScalar(this.f27754b, jsonGenerator);
        }

        public final WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this.f27753a.writeTypeSuffix(jsonGenerator, writableTypeId);
        }

        @Deprecated
        public final void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypeSuffixForArray(this.f27754b, jsonGenerator);
        }

        @Deprecated
        public final void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypeSuffixForObject(this.f27754b, jsonGenerator);
        }

        @Deprecated
        public final void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this.f27753a.writeTypeSuffixForScalar(this.f27754b, jsonGenerator);
        }

        @Deprecated
        public final void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f27753a.writeTypePrefixForArray(this.f27754b, jsonGenerator, cls);
        }

        @Deprecated
        public final void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f27753a.writeTypePrefixForObject(this.f27754b, jsonGenerator, cls);
        }

        @Deprecated
        public final void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this.f27753a.writeTypePrefixForScalar(this.f27754b, jsonGenerator, cls);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, JsonSerializer<?> jsonSerializer) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
    }

    private static final Class<Object> _notNullClass(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, Class<?> cls) throws JsonMappingException {
        JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectStringFormat == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (i < length) {
            Object obj = enumConstants[i];
            try {
                linkedHashSet.add(String.valueOf(this._accessor.getValue(obj)));
                i++;
            } catch (Exception e) {
                e = e;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                ClassUtil.throwIfError(e);
                throw JsonMappingException.wrapWithPath(e, obj, this._accessor.getName() + "()");
            }
        }
        expectStringFormat.enumTypes(linkedHashSet);
        return true;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JavaType type = this._accessor.getType();
        Class<?> declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass == null || !ClassUtil.isEnumType(declaringClass) || !_acceptJsonFormatVisitorForEnum(jsonFormatVisitorWrapper, javaType, declaringClass)) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null && (jsonSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(type, false, this._property)) == null) {
                jsonFormatVisitorWrapper.expectAnyFormat(javaType);
            } else {
                jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, type);
            }
        }
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            return withResolved(beanProperty, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this._forceTypeInformation);
        }
        JavaType type = this._accessor.getType();
        if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !type.isFinal()) {
            return beanProperty != this._property ? withResolved(beanProperty, jsonSerializer, this._forceTypeInformation) : this;
        }
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(type, beanProperty);
        return withResolved(beanProperty, findPrimaryPropertySerializer, isNaturalTypeWithStdHandling(type.getRawClass(), findPrimaryPropertySerializer));
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        return jsonSerializer instanceof SchemaAware ? ((SchemaAware) jsonSerializer).getSchema(serializerProvider, (Type) null) : JsonSchema.getDefaultSchemaNode();
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (!(cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE)) {
                return false;
            }
        } else if (!(cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class)) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findTypedValueSerializer(value.getClass(), true, this._property);
            }
            jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, (Throwable) e, obj, this._accessor.getName() + "()");
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findValueSerializer(value.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
                return;
            }
            jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, new C12578a(typeSerializer, obj));
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, (Throwable) e, obj, this._accessor.getName() + "()");
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("(@JsonValue serializer for method ");
        h.append(this._accessor.getDeclaringClass());
        h.append("#");
        h.append(this._accessor.getName());
        h.append(")");
        return h.toString();
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z) {
        return (this._property == beanProperty && this._valueSerializer == jsonSerializer && z == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, jsonSerializer, z);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z;
    }
}
