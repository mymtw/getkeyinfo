package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2551b0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.u0 */
public final class C2628u0 {

    /* renamed from: c */
    public static final C2628u0 f5965c = new C2628u0();

    /* renamed from: a */
    public final C2567d0 f5966a = new C2567d0();

    /* renamed from: b */
    public final ConcurrentHashMap f5967b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C2642y0<T> mo9895a(Class<T> cls) {
        C2642y0<T> y0Var;
        C2613o0 o0Var;
        Class<?> cls2;
        Charset charset = C2631w.f5973a;
        if (cls != null) {
            C2642y0<T> y0Var2 = (C2642y0) this.f5967b.get(cls);
            if (y0Var2 != null) {
                return y0Var2;
            }
            C2567d0 d0Var = this.f5966a;
            d0Var.getClass();
            Class<GeneratedMessageLite> cls3 = GeneratedMessageLite.class;
            Class<?> cls4 = C2644z0.f5984a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C2644z0.f5984a) == null || cls2.isAssignableFrom(cls)) {
                C2596i0 a = d0Var.f5847a.mo9620a(cls);
                if (a.mo9617a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        o0Var = new C2613o0(C2644z0.f5987d, C2619r.f5952a, a.mo9618b());
                    } else {
                        C2570d1<?, ?> d1Var = C2644z0.f5985b;
                        C2614p<?> pVar = C2619r.f5953b;
                        if (pVar != null) {
                            o0Var = new C2613o0(d1Var, pVar, a.mo9618b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    y0Var = o0Var;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z = true;
                    if (isAssignableFrom) {
                        if (a.mo9619c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        y0Var = z ? C2609n0.m6174z(a, C2620r0.f5955b, C2551b0.f5817b, C2644z0.f5987d, C2619r.f5952a, C2585h0.f5875b) : C2609n0.m6174z(a, C2620r0.f5955b, C2551b0.f5817b, C2644z0.f5987d, (C2614p) null, C2585h0.f5875b);
                    } else {
                        if (a.mo9619c() != ProtoSyntax.PROTO2) {
                            z = false;
                        }
                        if (z) {
                            C2615p0 p0Var = C2620r0.f5954a;
                            C2551b0.C2552a aVar = C2551b0.f5816a;
                            C2570d1<?, ?> d1Var2 = C2644z0.f5985b;
                            C2614p<?> pVar2 = C2619r.f5953b;
                            if (pVar2 != null) {
                                y0Var = C2609n0.m6174z(a, p0Var, aVar, d1Var2, pVar2, C2585h0.f5874a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            y0Var = C2609n0.m6174z(a, C2620r0.f5954a, C2551b0.f5816a, C2644z0.f5986c, (C2614p) null, C2585h0.f5874a);
                        }
                    }
                }
                C2642y0<T> y0Var3 = (C2642y0) this.f5967b.putIfAbsent(cls, y0Var);
                return y0Var3 != null ? y0Var3 : y0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
