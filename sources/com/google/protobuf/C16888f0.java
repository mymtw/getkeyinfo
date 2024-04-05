package com.google.protobuf;

import com.google.protobuf.C16878d0;
import java.util.Map;

/* renamed from: com.google.protobuf.f0 */
public final class C16888f0 implements C16883e0 {
    /* renamed from: a */
    public final MapFieldLite mo59876a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: b */
    public final C16878d0.C16879a<?, ?> mo59877b(Object obj) {
        return ((C16878d0) obj).f37194a;
    }

    /* renamed from: c */
    public final MapFieldLite mo59878c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public final MapFieldLite mo59879d(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: e */
    public final Object mo59880e(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: f */
    public final MapFieldLite mo59881f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: g */
    public final int mo59882g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C16878d0 d0Var = (C16878d0) obj2;
        int i2 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                d0Var.getClass();
                int u = CodedOutputStream.m27896u(i);
                int a = C16878d0.m28068a(d0Var.f37194a, key, value);
                i2 += CodedOutputStream.m27898w(a) + a + u;
            }
        }
        return i2;
    }

    /* renamed from: h */
    public final boolean mo59883h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
