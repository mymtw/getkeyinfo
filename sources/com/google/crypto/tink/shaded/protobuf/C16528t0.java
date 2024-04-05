package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16454a0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t0 */
public final class C16528t0 {

    /* renamed from: c */
    public static final C16528t0 f36696c = new C16528t0();

    /* renamed from: a */
    public final C16470c0 f36697a = new C16470c0();

    /* renamed from: b */
    public final ConcurrentHashMap f36698b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C16542x0<T> mo58955a(Class<T> cls) {
        C16542x0<T> x0Var;
        C16513n0 n0Var;
        Class<?> cls2;
        Charset charset = C16531v.f36704a;
        if (cls != null) {
            C16542x0<T> x0Var2 = (C16542x0) this.f36698b.get(cls);
            if (x0Var2 != null) {
                return x0Var2;
            }
            C16470c0 c0Var = this.f36697a;
            c0Var.getClass();
            Class<GeneratedMessageLite> cls3 = GeneratedMessageLite.class;
            Class<?> cls4 = C16544y0.f36715a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C16544y0.f36715a) == null || cls2.isAssignableFrom(cls)) {
                C16495h0 a = c0Var.f36585a.mo58677a(cls);
                if (a.mo58667a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        n0Var = new C16513n0(C16544y0.f36718d, C16519q.f36683a, a.mo58668b());
                    } else {
                        C16473c1<?, ?> c1Var = C16544y0.f36716b;
                        C16514o<?> oVar = C16519q.f36684b;
                        if (oVar != null) {
                            n0Var = new C16513n0(c1Var, oVar, a.mo58668b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    x0Var = n0Var;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z = true;
                    if (isAssignableFrom) {
                        if (a.mo58669c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        x0Var = z ? C16510m0.m27131y(a, C16520q0.f36686b, C16454a0.f36557b, C16544y0.f36718d, C16519q.f36683a, C16487g0.f36608b) : C16510m0.m27131y(a, C16520q0.f36686b, C16454a0.f36557b, C16544y0.f36718d, (C16514o) null, C16487g0.f36608b);
                    } else {
                        if (a.mo58669c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C16515o0 o0Var = C16520q0.f36685a;
                            C16454a0.C16455a aVar = C16454a0.f36556a;
                            C16473c1<?, ?> c1Var2 = C16544y0.f36716b;
                            C16514o<?> oVar2 = C16519q.f36684b;
                            if (oVar2 != null) {
                                x0Var = C16510m0.m27131y(a, o0Var, aVar, c1Var2, oVar2, C16487g0.f36607a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            x0Var = C16510m0.m27131y(a, C16520q0.f36685a, C16454a0.f36556a, C16544y0.f36717c, (C16514o) null, C16487g0.f36607a);
                        }
                    }
                }
                C16542x0<T> x0Var3 = (C16542x0) this.f36698b.putIfAbsent(cls, x0Var);
                return x0Var3 != null ? x0Var3 : x0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
