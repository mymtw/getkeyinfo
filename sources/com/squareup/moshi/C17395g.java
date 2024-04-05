package com.squareup.moshi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.squareup.moshi.g */
public final class C17395g extends C17398j<Object> {

    /* renamed from: a */
    public final /* synthetic */ Method f37965a;

    /* renamed from: b */
    public final /* synthetic */ Object f37966b;

    /* renamed from: c */
    public final /* synthetic */ Class f37967c;

    public C17395g(Method method, Object obj, Class cls) {
        this.f37965a = method;
        this.f37966b = obj;
        this.f37967c = cls;
    }

    /* renamed from: a */
    public final Object mo68490a() throws InvocationTargetException, IllegalAccessException {
        return this.f37965a.invoke(this.f37966b, new Object[]{this.f37967c});
    }

    public final String toString() {
        return this.f37967c.getName();
    }
}
