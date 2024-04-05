package com.fasterxml.jackson.databind.jsontype.impl;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Type;
import java.util.Collection;

public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    public TypeIdResolver _customIdResolver;
    public Class<?> _defaultImpl;
    public JsonTypeInfo.C12507Id _idType;
    public JsonTypeInfo.C12506As _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$a */
    public static /* synthetic */ class C12563a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27722a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27723b;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id[] r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27723b = r0
                r1 = 1
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r2 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.CLASS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27723b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r3 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.MINIMAL_CLASS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27723b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r4 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f27723b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f27723b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonTypeInfo$Id r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12507Id.CUSTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.fasterxml.jackson.annotation.JsonTypeInfo$As[] r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f27722a = r5
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r6 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f27722a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r5 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f27722a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f27722a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f27722a     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C12506As.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.C12563a.<clinit>():void");
        }
    }

    public StdTypeResolverBuilder() {
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.C12507Id.NONE, (TypeIdResolver) null);
    }

    public boolean allowPrimitiveTypes(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.C12507Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(deserializationConfig, javaType)) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType defineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        int i = C12563a.f27722a[this._includeAs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                } else if (i == 4) {
                    return new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                } else if (i != 5) {
                    StringBuilder h = C0072d.m201h("Do not know how to construct standard type serializer for inclusion type: ");
                    h.append(this._includeAs);
                    throw new IllegalStateException(h.toString());
                }
            }
            return new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl, this._includeAs);
        }
        return new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
    }

    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.C12507Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(serializationConfig, javaType)) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        int i = C12563a.f27722a[this._includeAs.ordinal()];
        if (i == 1) {
            return new AsArrayTypeSerializer(idResolver, (BeanProperty) null);
        }
        if (i == 2) {
            return new AsPropertyTypeSerializer(idResolver, (BeanProperty) null, this._typeProperty);
        }
        if (i == 3) {
            return new AsWrapperTypeSerializer(idResolver, (BeanProperty) null);
        }
        if (i == 4) {
            return new AsExternalTypeSerializer(idResolver, (BeanProperty) null, this._typeProperty);
        }
        if (i == 5) {
            return new AsExistingPropertyTypeSerializer(idResolver, (BeanProperty) null, this._typeProperty);
        }
        StringBuilder h = C0072d.m201h("Do not know how to construct standard type serializer for inclusion type: ");
        h.append(this._includeAs);
        throw new IllegalStateException(h.toString());
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls == null) {
            if (deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.isAbstract()) {
                return javaType;
            }
        } else if (cls == Void.class || cls == NoClass.class) {
            return deserializationConfig.getTypeFactory().constructType((Type) this._defaultImpl);
        } else {
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
        }
        return null;
    }

    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.C12507Id id = this._idType;
        if (id != null) {
            int i = C12563a.f27723b[id.ordinal()];
            if (i == 1) {
                return ClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
            }
            if (i == 2) {
                return MinimalClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
            }
            if (i == 3) {
                return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
            }
            if (i == 4) {
                return null;
            }
            StringBuilder h = C0072d.m201h("Do not know how to construct standard type id resolver for idType: ");
            h.append(this._idType);
            throw new IllegalStateException(h.toString());
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", new Object[]{ClassUtil.classNameOf(polymorphicTypeValidator), ClassUtil.classNameOf(javaType.getRawClass())}));
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator subTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.C12507Id id = this._idType;
        if (id == JsonTypeInfo.C12507Id.CLASS || id == JsonTypeInfo.C12507Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validateBaseType = subTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, subTypeValidator);
            }
            if (validateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return subTypeValidator;
    }

    public StdTypeResolverBuilder defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    public StdTypeResolverBuilder inclusion(JsonTypeInfo.C12506As as) {
        if (as != null) {
            this._includeAs = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    public StdTypeResolverBuilder init(JsonTypeInfo.C12507Id id, TypeIdResolver typeIdResolver) {
        if (id != null) {
            this._idType = id;
            this._customIdResolver = typeIdResolver;
            this._typeProperty = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    public StdTypeResolverBuilder(JsonTypeInfo.C12507Id id, JsonTypeInfo.C12506As as, String str) {
        this._idType = id;
        this._includeAs = as;
        this._typeProperty = str;
    }
}
