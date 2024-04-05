package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.h */
public final class C16791h extends C16795l {

    /* renamed from: a */
    public final /* synthetic */ Method f37107a;

    /* renamed from: b */
    public final /* synthetic */ Object f37108b;

    public C16791h(Object obj, Method method) {
        this.f37107a = method;
        this.f37108b = obj;
    }

    /* renamed from: b */
    public final <T> T mo59626b(Class<T> cls) throws Exception {
        C16795l.m27853a(cls);
        return this.f37107a.invoke(this.f37108b, new Object[]{cls});
    }
}
