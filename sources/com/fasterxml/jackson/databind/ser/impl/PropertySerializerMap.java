package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

public abstract class PropertySerializerMap {
    public final boolean _resetWhenFull;

    public static final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer<Object> serializer;

        public SerializerAndMapResult(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$a */
    public static final class C12569a extends PropertySerializerMap {

        /* renamed from: a */
        public final Class<?> f27733a;

        /* renamed from: b */
        public final Class<?> f27734b;

        /* renamed from: c */
        public final JsonSerializer<Object> f27735c;

        /* renamed from: d */
        public final JsonSerializer<Object> f27736d;

        public C12569a(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer, Class<?> cls2, JsonSerializer<Object> jsonSerializer2) {
            super(propertySerializerMap);
            this.f27733a = cls;
            this.f27735c = jsonSerializer;
            this.f27734b = cls2;
            this.f27736d = jsonSerializer2;
        }

        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new C12571c(this, new C12573e[]{new C12573e(this.f27733a, this.f27735c), new C12573e(this.f27734b, this.f27736d), new C12573e(cls, jsonSerializer)});
        }

        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f27733a) {
                return this.f27735c;
            }
            if (cls == this.f27734b) {
                return this.f27736d;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$b */
    public static final class C12570b extends PropertySerializerMap {

        /* renamed from: a */
        public static final C12570b f27737a = new C12570b(false);

        /* renamed from: b */
        public static final C12570b f27738b = new C12570b(true);

        public C12570b(boolean z) {
            super(z);
        }

        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new C12572d(this, cls, jsonSerializer);
        }

        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$c */
    public static final class C12571c extends PropertySerializerMap {

        /* renamed from: a */
        public final C12573e[] f27739a;

        public C12571c(PropertySerializerMap propertySerializerMap, C12573e[] eVarArr) {
            super(propertySerializerMap);
            this.f27739a = eVarArr;
        }

        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            C12573e[] eVarArr = this.f27739a;
            int length = eVarArr.length;
            if (length == 8) {
                return this._resetWhenFull ? new C12572d(this, cls, jsonSerializer) : this;
            }
            C12573e[] eVarArr2 = (C12573e[]) Arrays.copyOf(eVarArr, length + 1);
            eVarArr2[length] = new C12573e(cls, jsonSerializer);
            return new C12571c(this, eVarArr2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r1 = r0[6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r1.f27742a != r4) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            return r1.f27743b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r1 = r0[5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            if (r1.f27742a != r4) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1.f27743b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
            r1 = r0[4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
            if (r1.f27742a != r4) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            return r1.f27743b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r0[3];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
            if (r0.f27742a != r4) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            return r0.f27743b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> serializerFor(java.lang.Class<?> r4) {
            /*
                r3 = this;
                com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$e[] r0 = r3.f27739a
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x000c
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x000c:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x0016
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x0016:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x0020
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x0020:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L_0x004d;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0025;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x0057
            L_0x0025:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x002f
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x002f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x0039
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x0039:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x0043
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x0043:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f27742a
                if (r2 != r4) goto L_0x004d
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.f27743b
                return r4
            L_0x004d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.f27742a
                if (r1 != r4) goto L_0x0057
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r0.f27743b
                return r4
            L_0x0057:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.C12571c.serializerFor(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$d */
    public static final class C12572d extends PropertySerializerMap {

        /* renamed from: a */
        public final Class<?> f27740a;

        /* renamed from: b */
        public final JsonSerializer<Object> f27741b;

        public C12572d(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            super(propertySerializerMap);
            this.f27740a = cls;
            this.f27741b = jsonSerializer;
        }

        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new C12569a(this, this.f27740a, this.f27741b, cls, jsonSerializer);
        }

        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f27740a) {
                return this.f27741b;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$e */
    public static final class C12573e {

        /* renamed from: a */
        public final Class<?> f27742a;

        /* renamed from: b */
        public final JsonSerializer<Object> f27743b;

        public C12573e(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            this.f27742a = cls;
            this.f27743b = jsonSerializer;
        }
    }

    public PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return C12570b.f27737a;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return C12570b.f27738b;
    }

    @Deprecated
    public static PropertySerializerMap emptyMap() {
        return emptyForProperties();
    }

    public final SerializerAndMapResult addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final SerializerAndMapResult findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findKeySerializer, newWith(cls, findKeySerializer));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(cls, findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(cls, findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findContentValueSerializer = serializerProvider.findContentValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(cls, findContentValueSerializer));
    }

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    public final SerializerAndMapResult addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    public PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(javaType.getRawClass(), findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(javaType.getRawClass(), findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findContentValueSerializer = serializerProvider.findContentValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(javaType.getRawClass(), findContentValueSerializer));
    }
}
