package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f0 */
public final class C16482f0 implements C16479e0 {
    /* renamed from: a */
    public final MapFieldLite mo58703a(Object obj, Object obj2) {
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
    public final void mo58704b(Object obj) {
        ((C16475d0) obj).getClass();
    }

    /* renamed from: c */
    public final MapFieldLite mo58705c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public final MapFieldLite mo58706d(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: e */
    public final Object mo58707e(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    /* renamed from: f */
    public final MapFieldLite mo58708f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    /* renamed from: g */
    public final int mo58709g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C16475d0 d0Var = (C16475d0) obj2;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        d0Var.getClass();
        CodedOutputStream.m26580u(i);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo58710h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
