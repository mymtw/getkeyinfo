package com.squareup.moshi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.h */
public final class C17396h extends C17398j<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f37968a;

    /* renamed from: b */
    public final /* synthetic */ Class f37969b;

    /* renamed from: c */
    public final /* synthetic */ int f37970c;

    public C17396h(Method method, Class cls, int i) {
        this.f37968a = method;
        this.f37969b = cls;
        this.f37970c = i;
    }

    /* renamed from: a */
    public final Object mo68490a() throws InvocationTargetException, IllegalAccessException {
        return this.f37968a.invoke((Object) null, new Object[]{this.f37969b, Integer.valueOf(this.f37970c)});
    }

    public final String toString() {
        return this.f37969b.getName();
    }
}
