package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.i */
public final class C16792i extends C16795l {

    /* renamed from: a */
    public final /* synthetic */ Method f37109a;

    /* renamed from: b */
    public final /* synthetic */ int f37110b;

    public C16792i(int i, Method method) {
        this.f37109a = method;
        this.f37110b = i;
    }

    /* renamed from: b */
    public final <T> T mo59626b(Class<T> cls) throws Exception {
        C16795l.m27853a(cls);
        return this.f37109a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f37110b)});
    }
}
