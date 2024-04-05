package com.google.gson.internal;

import android.support.p013v4.media.C0072d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.gson.internal.c */
public final class C16786c implements C16790g<Object> {

    /* renamed from: b */
    public final /* synthetic */ Constructor f37104b;

    public C16786c(Constructor constructor) {
        this.f37104b = constructor;
    }

    /* renamed from: i */
    public final Object mo1134i() {
        try {
            return this.f37104b.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            StringBuilder h = C0072d.m201h("Failed to invoke ");
            h.append(this.f37104b);
            h.append(" with no args");
            throw new RuntimeException(h.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder h2 = C0072d.m201h("Failed to invoke ");
            h2.append(this.f37104b);
            h2.append(" with no args");
            throw new RuntimeException(h2.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
