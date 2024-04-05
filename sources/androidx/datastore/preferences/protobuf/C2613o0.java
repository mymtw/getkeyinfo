package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2571e;
import androidx.datastore.preferences.protobuf.C2621s;
import androidx.datastore.preferences.protobuf.C2637x;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o0 */
public final class C2613o0<T> implements C2642y0<T> {

    /* renamed from: a */
    public final C2602k0 f5947a;

    /* renamed from: b */
    public final C2570d1<?, ?> f5948b;

    /* renamed from: c */
    public final boolean f5949c;

    /* renamed from: d */
    public final C2614p<?> f5950d;

    public C2613o0(C2570d1<?, ?> d1Var, C2614p<?> pVar, C2602k0 k0Var) {
        this.f5948b = d1Var;
        this.f5949c = pVar.mo9869e(k0Var);
        this.f5950d = pVar;
        this.f5947a = k0Var;
    }

    /* renamed from: a */
    public final void mo9839a(T t, T t2) {
        C2570d1<?, ?> d1Var = this.f5948b;
        Class<?> cls = C2644z0.f5984a;
        d1Var.mo9636o(t, d1Var.mo9632k(d1Var.mo9628g(t), d1Var.mo9628g(t2)));
        if (this.f5949c) {
            C2644z0.m6343B(this.f5950d, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo9840b(T t) {
        this.f5948b.mo9631j(t);
        this.f5950d.mo9870f(t);
    }

    /* renamed from: c */
    public final boolean mo9841c(T t) {
        return this.f5950d.mo9867c(t).mo9883i();
    }

    /* renamed from: d */
    public final int mo9842d(T t) {
        C2570d1<?, ?> d1Var = this.f5948b;
        int i = d1Var.mo9630i(d1Var.mo9628g(t)) + 0;
        if (!this.f5949c) {
            return i;
        }
        C2621s<?> c = this.f5950d.mo9867c(t);
        int i2 = 0;
        for (int i3 = 0; i3 < c.f5957a.mo9560d(); i3++) {
            i2 += C2621s.m6248f(c.f5957a.mo9557c(i3));
        }
        for (Map.Entry<T, Object> f : c.f5957a.mo9561e()) {
            i2 += C2621s.m6248f(f);
        }
        return i + i2;
    }

    /* renamed from: e */
    public final int mo9843e(T t) {
        int hashCode = this.f5948b.mo9628g(t).hashCode();
        return this.f5949c ? (hashCode * 53) + this.f5950d.mo9867c(t).hashCode() : hashCode;
    }

    /* renamed from: f */
    public final boolean mo9844f(T t, T t2) {
        if (!this.f5948b.mo9628g(t).equals(this.f5948b.mo9628g(t2))) {
            return false;
        }
        if (this.f5949c) {
            return this.f5950d.mo9867c(t).equals(this.f5950d.mo9867c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo9845g(T t, C2640x0 x0Var, C2611o oVar) throws IOException {
        C2570d1<?, ?> d1Var = this.f5948b;
        C2614p<?> pVar = this.f5950d;
        C2575e1 f = d1Var.mo9627f(t);
        C2621s<?> d = pVar.mo9868d(t);
        while (true) {
            try {
                if (x0Var.mo9797z() != Integer.MAX_VALUE) {
                    if (!mo9864j(x0Var, oVar, pVar, d, d1Var, f)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                d1Var.mo9635n(t, f);
            }
        }
    }

    /* renamed from: h */
    public final void mo9846h(Object obj, C2601k kVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.f5950d.mo9867c(obj).mo9884k();
        while (k.hasNext()) {
            Map.Entry next = k.next();
            C2621s.C2623b bVar = (C2621s.C2623b) next.getKey();
            if (bVar.mo9483z() == WireFormat$JavaType.MESSAGE) {
                bVar.mo9481x();
                bVar.mo9477A();
                if (next instanceof C2637x.C2638a) {
                    bVar.getNumber();
                    kVar.mo9809l(0, ((C2637x.C2638a) next).f5979b.getValue().mo9922b());
                } else {
                    bVar.getNumber();
                    kVar.mo9809l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C2570d1<?, ?> d1Var = this.f5948b;
        d1Var.mo9639r(d1Var.mo9628g(obj), kVar);
    }

    /* renamed from: i */
    public final void mo9847i(T t, byte[] bArr, int i, int i2, C2571e.C2572a aVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        C2575e1 e1Var = generatedMessageLite.unknownFields;
        if (e1Var == C2575e1.f5860f) {
            e1Var = new C2575e1();
            generatedMessageLite.unknownFields = e1Var;
        }
        GeneratedMessageLite.C2523c cVar = (GeneratedMessageLite.C2523c) t;
        C2621s<GeneratedMessageLite.C2524d> sVar = cVar.extensions;
        if (sVar.f5958b) {
            cVar.extensions = sVar.clone();
        }
        GeneratedMessageLite.C2525e eVar = null;
        while (i < i2) {
            int H = C2571e.m5743H(bArr, i, aVar);
            int i3 = aVar.f5849a;
            if (i3 == 11) {
                int i4 = 0;
                ByteString byteString = null;
                while (H < i2) {
                    H = C2571e.m5743H(bArr, H, aVar);
                    int i5 = aVar.f5849a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                C2628u0 u0Var = C2628u0.f5965c;
                                throw null;
                            } else if (i7 == 2) {
                                H = C2571e.m5749b(bArr, H, aVar);
                                byteString = (ByteString) aVar.f5851c;
                            }
                        }
                    } else if (i7 == 0) {
                        H = C2571e.m5743H(bArr, H, aVar);
                        i4 = aVar.f5849a;
                        eVar = this.f5950d.mo9866b(aVar.f5852d, this.f5947a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    H = C2571e.m5747L(i5, bArr, H, i2, aVar);
                }
                if (byteString != null) {
                    e1Var.mo9642b((i4 << 3) | 2, byteString);
                }
                i = H;
            } else if ((i3 & 7) == 2) {
                eVar = this.f5950d.mo9866b(aVar.f5852d, this.f5947a, i3 >>> 3);
                if (eVar == null) {
                    i = C2571e.m5741F(i3, bArr, H, i2, e1Var, aVar);
                } else {
                    C2628u0 u0Var2 = C2628u0.f5965c;
                    throw null;
                }
            } else {
                i = C2571e.m5747L(i3, bArr, H, i2, aVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: j */
    public final <UT, UB, ET extends C2621s.C2623b<ET>> boolean mo9864j(C2640x0 x0Var, C2611o oVar, C2614p<ET> pVar, C2621s<ET> sVar, C2570d1<UT, UB> d1Var, UB ub) throws IOException {
        int tag = x0Var.getTag();
        if (tag == 11) {
            int i = 0;
            GeneratedMessageLite.C2525e eVar = null;
            ByteString byteString = null;
            while (x0Var.mo9797z() != Integer.MAX_VALUE) {
                int tag2 = x0Var.getTag();
                if (tag2 == 16) {
                    i = x0Var.mo9775g();
                    eVar = pVar.mo9866b(oVar, this.f5947a, i);
                } else if (tag2 == 26) {
                    if (eVar != null) {
                        pVar.mo9872h(eVar);
                    } else {
                        byteString = x0Var.mo9783n();
                    }
                } else if (!x0Var.mo9750C()) {
                    break;
                }
            }
            if (x0Var.getTag() == 12) {
                if (byteString != null) {
                    if (eVar != null) {
                        pVar.mo9873i(eVar);
                    } else {
                        d1Var.mo9625d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if ((tag & 7) != 2) {
            return x0Var.mo9750C();
        } else {
            GeneratedMessageLite.C2525e b = pVar.mo9866b(oVar, this.f5947a, tag >>> 3);
            if (b == null) {
                return d1Var.mo9633l(ub, x0Var);
            }
            pVar.mo9872h(b);
            return true;
        }
    }

    public final T newInstance() {
        return this.f5947a.mo9468i().mo9475m();
    }
}
