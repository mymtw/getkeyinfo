package com.google.gson.internal;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
public abstract class C16795l {
    /* renamed from: a */
    public static void m27853a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(C0326j.m862g(cls, C0072d.m201h("Interface can't be instantiated! Interface name: ")));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(C0326j.m862g(cls, C0072d.m201h("Abstract class can't be instantiated! Class name: ")));
        }
    }

    /* renamed from: b */
    public abstract <T> T mo59626b(Class<T> cls) throws Exception;
}
