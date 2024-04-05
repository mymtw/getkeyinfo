package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.j */
public final class C16793j extends C16795l {

    /* renamed from: a */
    public final /* synthetic */ Method f37111a;

    public C16793j(Method method) {
        this.f37111a = method;
    }

    /* renamed from: b */
    public final <T> T mo59626b(Class<T> cls) throws Exception {
        C16795l.m27853a(cls);
        return this.f37111a.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
