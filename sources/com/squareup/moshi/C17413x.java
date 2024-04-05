package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p618lp.C18215a;

/* renamed from: com.squareup.moshi.x */
public final class C17413x implements JsonAdapter.C17360e {

    /* renamed from: a */
    public final /* synthetic */ Type f38019a;

    /* renamed from: b */
    public final /* synthetic */ JsonAdapter f38020b;

    public C17413x(Class cls, Rfc3339DateJsonAdapter rfc3339DateJsonAdapter) {
        this.f38019a = cls;
        this.f38020b = rfc3339DateJsonAdapter;
    }

    public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
        if (set.isEmpty()) {
            Type type2 = this.f38019a;
            Set<Annotation> set2 = C18215a.f39926a;
            if (C17387a0.m29124b(type2, type)) {
                return this.f38020b;
            }
        }
        return null;
    }
}
