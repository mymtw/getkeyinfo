package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2573e0;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.g0 */
public final class C2580g0 implements C2577f0 {
    /* renamed from: a */
    public final MapFieldLite mo9654a(Object obj, Object obj2) {
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
    public final C2573e0.C2574a<?, ?> mo9655b(Object obj) {
        return ((C2573e0) obj).f5853a;
    }

    /* renamed from: c */
    public final MapFieldLite mo9656c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public final MapFieldLite mo9657d(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: e */
    public final Object mo9658e(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: f */
    public final MapFieldLite mo9659f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: g */
    public final int mo9660g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C2573e0 e0Var = (C2573e0) obj2;
        int i2 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                e0Var.getClass();
                int u = CodedOutputStream.m5515u(i);
                int a = C2573e0.m5774a(e0Var.f5853a, key, value);
                i2 += CodedOutputStream.m5517w(a) + a + u;
            }
        }
        return i2;
    }

    /* renamed from: h */
    public final boolean mo9661h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
