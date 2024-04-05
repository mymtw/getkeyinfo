package com.google.android.gms.internal.icing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.icing.j1 */
public final class C14512j1 {

    /* renamed from: c */
    public static final C14512j1 f32651c = new C14512j1();

    /* renamed from: a */
    public final C14551u0 f32652a = new C14551u0();

    /* renamed from: b */
    public final ConcurrentHashMap f32653b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C14524m1<T> mo49820a(Class<T> cls) {
        C14496f1 f1Var;
        Class<?> cls2;
        Charset charset = C14515k0.f32655a;
        if (cls != null) {
            C14524m1<T> m1Var = (C14524m1) this.f32653b.get(cls);
            if (m1Var == null) {
                C14551u0 u0Var = this.f32652a;
                u0Var.getClass();
                Class<C14491e0> cls3 = C14491e0.class;
                Class<?> cls4 = C14528n1.f32673a;
                if (cls3.isAssignableFrom(cls) || (cls2 = C14528n1.f32673a) == null || cls2.isAssignableFrom(cls)) {
                    C14566z0 b = u0Var.f32708a.mo49727b(cls);
                    if (b.zza()) {
                        if (cls3.isAssignableFrom(cls)) {
                            f1Var = new C14496f1(C14528n1.f32676d, C14559x.f32719a, b.zzb());
                        } else {
                            C14561x1<?, ?> x1Var = C14528n1.f32674b;
                            C14553v<?> vVar = C14559x.f32720b;
                            if (vVar != null) {
                                f1Var = new C14496f1(x1Var, vVar, b.zzb());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        m1Var = f1Var;
                    } else {
                        boolean z = false;
                        if (cls3.isAssignableFrom(cls)) {
                            if (b.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i = C14504h1.f32641a;
                                m1Var = C14492e1.m22958n(b, C14539q0.f32684b, C14528n1.f32676d, C14559x.f32719a, C14563y0.f32723b);
                            } else {
                                int i2 = C14504h1.f32641a;
                                m1Var = C14492e1.m22958n(b, C14539q0.f32684b, C14528n1.f32676d, (C14553v) null, C14563y0.f32723b);
                            }
                        } else {
                            if (b.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i3 = C14504h1.f32641a;
                                C14531o0 o0Var = C14539q0.f32683a;
                                C14561x1<?, ?> x1Var2 = C14528n1.f32674b;
                                C14553v<?> vVar2 = C14559x.f32720b;
                                if (vVar2 != null) {
                                    m1Var = C14492e1.m22958n(b, o0Var, x1Var2, vVar2, C14563y0.f32722a);
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i4 = C14504h1.f32641a;
                                m1Var = C14492e1.m22958n(b, C14539q0.f32683a, C14528n1.f32675c, (C14553v) null, C14563y0.f32722a);
                            }
                        }
                    }
                    C14524m1<T> m1Var2 = (C14524m1) this.f32653b.putIfAbsent(cls, m1Var);
                    return m1Var2 == null ? m1Var : m1Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
