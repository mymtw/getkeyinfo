package com.zhuinden.simplestack;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p010a9.C0048b;

/* renamed from: com.zhuinden.simplestack.m */
public final class C17540m {

    /* renamed from: a */
    public final LinkedHashMap f38376a;

    /* renamed from: b */
    public final LinkedHashMap f38377b;

    public C17540m() {
        this.f38376a = new LinkedHashMap();
        this.f38377b = new LinkedHashMap();
    }

    /* renamed from: a */
    public final <T> T mo68770a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("serviceTag cannot be null!");
        } else if (this.f38376a.containsKey(str)) {
            return this.f38376a.get(str);
        } else {
            if (this.f38377b.containsKey(str)) {
                return this.f38377b.get(str);
            }
            throw new IllegalArgumentException(C0048b.m163a("Scope does not contain [", str, "]"));
        }
    }

    /* renamed from: b */
    public final boolean mo68771b(String str) {
        if (str != null) {
            return this.f38376a.containsKey(str) || this.f38377b.containsKey(str);
        }
        throw new IllegalArgumentException("serviceTag cannot be null!");
    }

    /* renamed from: c */
    public final Set<Map.Entry<String, Object>> mo68772c() {
        return Collections.unmodifiableSet(this.f38376a.entrySet());
    }

    public C17540m(C17540m mVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f38376a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f38377b = linkedHashMap2;
        if (mVar != null) {
            linkedHashMap.putAll(mVar.f38376a);
            linkedHashMap2.putAll(mVar.f38377b);
            return;
        }
        throw new IllegalArgumentException("services cannot be null!");
    }
}
