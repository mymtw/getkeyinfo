package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
public final class C14892z6 {

    /* renamed from: c */
    public static final C14892z6 f33192c = new C14892z6();

    /* renamed from: a */
    public final C14705k6 f33193a = new C14705k6();

    /* renamed from: b */
    public final ConcurrentHashMap f33194b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C14602c7<T> mo51009a(Class<T> cls) {
        C14844v6 v6Var;
        Class<?> cls2;
        Charset charset = C14575a6.f32740a;
        if (cls != null) {
            C14602c7<T> c7Var = (C14602c7) this.f33194b.get(cls);
            if (c7Var == null) {
                C14705k6 k6Var = this.f33193a;
                k6Var.getClass();
                Class<C14819t5> cls3 = C14819t5.class;
                Class<?> cls4 = C14615d7.f32807a;
                if (cls3.isAssignableFrom(cls) || (cls2 = C14615d7.f32807a) == null || cls2.isAssignableFrom(cls)) {
                    C14757o6 a = k6Var.f32911a.mo50592a(cls);
                    if (a.zzb()) {
                        if (cls3.isAssignableFrom(cls)) {
                            v6Var = new C14844v6(C14615d7.f32810d, C14704k5.f32908a, a.zza());
                        } else {
                            C14745n7<?, ?> n7Var = C14615d7.f32808b;
                            C14678i5<?> i5Var = C14704k5.f32909b;
                            if (i5Var != null) {
                                v6Var = new C14844v6(n7Var, i5Var, a.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        c7Var = v6Var;
                    } else {
                        boolean z = false;
                        if (cls3.isAssignableFrom(cls)) {
                            if (a.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i = C14868x6.f33155a;
                                c7Var = C14832u6.m24014y(a, C14653g6.f32852b, C14615d7.f32810d, C14704k5.f32908a, C14744n6.f32973b);
                            } else {
                                int i2 = C14868x6.f33155a;
                                c7Var = C14832u6.m24014y(a, C14653g6.f32852b, C14615d7.f32810d, (C14678i5) null, C14744n6.f32973b);
                            }
                        } else {
                            if (a.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i3 = C14868x6.f33155a;
                                C14627e6 e6Var = C14653g6.f32851a;
                                C14745n7<?, ?> n7Var2 = C14615d7.f32808b;
                                C14678i5<?> i5Var2 = C14704k5.f32909b;
                                if (i5Var2 != null) {
                                    c7Var = C14832u6.m24014y(a, e6Var, n7Var2, i5Var2, C14744n6.f32972a);
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i4 = C14868x6.f33155a;
                                c7Var = C14832u6.m24014y(a, C14653g6.f32851a, C14615d7.f32809c, (C14678i5) null, C14744n6.f32972a);
                            }
                        }
                    }
                    C14602c7<T> c7Var2 = (C14602c7) this.f33194b.putIfAbsent(cls, c7Var);
                    return c7Var2 == null ? c7Var : c7Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
