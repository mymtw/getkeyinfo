package com.squareup.moshi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.squareup.moshi.f */
public final class C17394f extends C17398j<Object> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f37963a;

    /* renamed from: b */
    public final /* synthetic */ Class f37964b;

    public C17394f(Constructor constructor, Class cls) {
        this.f37963a = constructor;
        this.f37964b = cls;
    }

    /* renamed from: a */
    public final Object mo68490a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.f37963a.newInstance((Object[]) null);
    }

    public final String toString() {
        return this.f37964b.getName();
    }
}
