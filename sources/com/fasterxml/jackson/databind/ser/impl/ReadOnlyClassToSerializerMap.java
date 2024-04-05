package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.Map;

public final class ReadOnlyClassToSerializerMap {
    private final C12574a[] _buckets;
    private final int _mask;
    private final int _size;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$a */
    public static final class C12574a {

        /* renamed from: a */
        public final JsonSerializer<Object> f27744a;

        /* renamed from: b */
        public final C12574a f27745b;

        /* renamed from: c */
        public final Class<?> f27746c;

        /* renamed from: d */
        public final JavaType f27747d;

        /* renamed from: e */
        public final boolean f27748e;

        public C12574a(C12574a aVar, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.f27745b = aVar;
            this.f27744a = jsonSerializer;
            this.f27748e = typeKey.isTyped();
            this.f27746c = typeKey.getRawType();
            this.f27747d = typeKey.getType();
        }
    }

    public ReadOnlyClassToSerializerMap(Map<TypeKey, JsonSerializer<Object>> map) {
        int findSize = findSize(map.size());
        this._size = findSize;
        this._mask = findSize - 1;
        C12574a[] aVarArr = new C12574a[findSize];
        for (Map.Entry next : map.entrySet()) {
            TypeKey typeKey = (TypeKey) next.getKey();
            int hashCode = typeKey.hashCode() & this._mask;
            aVarArr[hashCode] = new C12574a(aVarArr[hashCode], typeKey, (JsonSerializer) next.getValue());
        }
        this._buckets = aVarArr;
    }

    private static final int findSize(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap<TypeKey, JsonSerializer<Object>> hashMap) {
        return new ReadOnlyClassToSerializerMap(hashMap);
    }

    public int size() {
        return this._size;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        boolean z;
        C12574a aVar = this._buckets[TypeKey.typedHash(javaType) & this._mask];
        if (aVar == null) {
            return null;
        }
        if (aVar.f27748e && javaType.equals(aVar.f27747d)) {
            return aVar.f27744a;
        }
        do {
            aVar = aVar.f27745b;
            if (aVar == null) {
                return null;
            }
            if (!aVar.f27748e || !javaType.equals(aVar.f27747d)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.f27744a;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        boolean z;
        C12574a aVar = this._buckets[TypeKey.untypedHash(javaType) & this._mask];
        if (aVar == null) {
            return null;
        }
        if (!aVar.f27748e && javaType.equals(aVar.f27747d)) {
            return aVar.f27744a;
        }
        do {
            aVar = aVar.f27745b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f27748e || !javaType.equals(aVar.f27747d)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.f27744a;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        boolean z;
        C12574a aVar = this._buckets[TypeKey.typedHash(cls) & this._mask];
        if (aVar == null) {
            return null;
        }
        if (aVar.f27746c == cls && aVar.f27748e) {
            return aVar.f27744a;
        }
        do {
            aVar = aVar.f27745b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f27746c != cls || !aVar.f27748e) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.f27744a;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        boolean z;
        C12574a aVar = this._buckets[TypeKey.untypedHash(cls) & this._mask];
        if (aVar == null) {
            return null;
        }
        if (aVar.f27746c == cls && !aVar.f27748e) {
            return aVar.f27744a;
        }
        do {
            aVar = aVar.f27745b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f27746c != cls || aVar.f27748e) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return aVar.f27744a;
    }
}
