package com.google.gson.internal;

import android.support.p013v4.media.C0072d;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.a */
public final class C16726a implements C16790g<Object> {

    /* renamed from: b */
    public final C16795l f36987b;

    /* renamed from: c */
    public final /* synthetic */ Class f36988c;

    /* renamed from: d */
    public final /* synthetic */ Type f36989d;

    public C16726a(Class cls, Type type) {
        C16795l lVar;
        this.f36988c = cls;
        this.f36989d = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            lVar = new C16791h(declaredField.get((Object) null), cls2.getMethod("allocateInstance", new Class[]{Class.class}));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                lVar = new C16792i(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    lVar = new C16793j(declaredMethod3);
                } catch (Exception unused3) {
                    lVar = new C16794k();
                }
            }
        }
        this.f36987b = lVar;
    }

    /* renamed from: i */
    public final Object mo1134i() {
        try {
            return this.f36987b.mo59626b(this.f36988c);
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Unable to invoke no-args constructor for ");
            h.append(this.f36989d);
            h.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(h.toString(), e);
        }
    }
}
