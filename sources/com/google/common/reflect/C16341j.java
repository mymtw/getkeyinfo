package com.google.common.reflect;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.common.reflect.j */
public final class C16341j extends Ordering<Object> {

    /* renamed from: b */
    public final /* synthetic */ Comparator f36442b;

    /* renamed from: c */
    public final /* synthetic */ Map f36443c;

    public C16341j(HashMap hashMap, Ordering ordering) {
        this.f36442b = ordering;
        this.f36443c = hashMap;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f36442b.compare(this.f36443c.get(obj), this.f36443c.get(obj2));
    }
}
