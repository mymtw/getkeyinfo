package com.google.protobuf;

import com.google.protobuf.C16865a0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.t0 */
public final class C16932t0 {

    /* renamed from: c */
    public static final C16932t0 f37292c = new C16932t0();

    /* renamed from: a */
    public final C16873c0 f37293a = new C16873c0();

    /* renamed from: b */
    public final ConcurrentHashMap f37294b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C16947w0<T> mo60039a(Class<T> cls) {
        C16947w0<T> w0Var;
        C16917n0 n0Var;
        Class<?> cls2;
        Charset charset = C16935v.f37301a;
        if (cls != null) {
            C16947w0<T> w0Var2 = (C16947w0) this.f37294b.get(cls);
            if (w0Var2 != null) {
                return w0Var2;
            }
            C16873c0 c0Var = this.f37293a;
            c0Var.getClass();
            Class<GeneratedMessageLite> cls3 = GeneratedMessageLite.class;
            Class<?> cls4 = C16949x0.f37313a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C16949x0.f37313a) == null || cls2.isAssignableFrom(cls)) {
                C16899h0 a = c0Var.f37184a.mo59869a(cls);
                if (a.mo59831a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        n0Var = new C16917n0(C16949x0.f37316d, C16923q.f37279a, a.mo59832b());
                    } else {
                        C16871b1<?, ?> b1Var = C16949x0.f37314b;
                        C16918o<?> oVar = C16923q.f37280b;
                        if (oVar != null) {
                            n0Var = new C16917n0(b1Var, oVar, a.mo59832b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    w0Var = n0Var;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z = true;
                    if (isAssignableFrom) {
                        if (a.mo59833c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        w0Var = z ? C16913m0.m28303w(a, C16924q0.f37282b, C16865a0.f37178b, C16949x0.f37316d, C16923q.f37279a, C16896g0.f37223b) : C16913m0.m28303w(a, C16924q0.f37282b, C16865a0.f37178b, C16949x0.f37316d, (C16918o) null, C16896g0.f37223b);
                    } else {
                        if (a.mo59833c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C16919o0 o0Var = C16924q0.f37281a;
                            C16865a0.C16866a aVar = C16865a0.f37177a;
                            C16871b1<?, ?> b1Var2 = C16949x0.f37314b;
                            C16918o<?> oVar2 = C16923q.f37280b;
                            if (oVar2 != null) {
                                w0Var = C16913m0.m28303w(a, o0Var, aVar, b1Var2, oVar2, C16896g0.f37222a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            w0Var = C16913m0.m28303w(a, C16924q0.f37281a, C16865a0.f37177a, C16949x0.f37315c, (C16918o) null, C16896g0.f37222a);
                        }
                    }
                }
                C16947w0<T> w0Var3 = (C16947w0) this.f37294b.putIfAbsent(cls, w0Var);
                return w0Var3 != null ? w0Var3 : w0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
