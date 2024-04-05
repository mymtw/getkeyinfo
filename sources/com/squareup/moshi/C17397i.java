package com.squareup.moshi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.i */
public final class C17397i extends C17398j<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f37971a;

    /* renamed from: b */
    public final /* synthetic */ Class f37972b;

    public C17397i(Method method, Class cls) {
        this.f37971a = method;
        this.f37972b = cls;
    }

    /* renamed from: a */
    public final Object mo68490a() throws InvocationTargetException, IllegalAccessException {
        return this.f37971a.invoke((Object) null, new Object[]{this.f37972b, Object.class});
    }

    public final String toString() {
        return this.f37972b.getName();
    }
}
