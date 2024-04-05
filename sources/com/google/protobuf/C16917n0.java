package com.google.protobuf;

import com.google.protobuf.C16881e;
import com.google.protobuf.C16925r;
import com.google.protobuf.C16944w;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.n0 */
public final class C16917n0<T> implements C16947w0<T> {

    /* renamed from: a */
    public final C16906j0 f37274a;

    /* renamed from: b */
    public final C16871b1<?, ?> f37275b;

    /* renamed from: c */
    public final boolean f37276c;

    /* renamed from: d */
    public final C16918o<?> f37277d;

    public C16917n0(C16871b1<?, ?> b1Var, C16918o<?> oVar, C16906j0 j0Var) {
        this.f37275b = b1Var;
        this.f37276c = oVar.mo60015e(j0Var);
        this.f37277d = oVar;
        this.f37274a = j0Var;
    }

    /* renamed from: a */
    public final void mo59989a(T t, T t2) {
        C16871b1<?, ?> b1Var = this.f37275b;
        Class<?> cls = C16949x0.f37313a;
        b1Var.mo59858j(t, b1Var.mo59855g(b1Var.mo59851c(t), b1Var.mo59851c(t2)));
        if (this.f37276c) {
            C16949x0.m28416B(this.f37277d, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo59990b(T t) {
        this.f37275b.mo59854f(t);
        this.f37277d.mo60016f(t);
    }

    /* renamed from: c */
    public final boolean mo59991c(T t) {
        return this.f37277d.mo60013c(t).mo60026i();
    }

    /* renamed from: d */
    public final int mo59992d(T t) {
        C16871b1<?, ?> b1Var = this.f37275b;
        int e = b1Var.mo59853e(b1Var.mo59851c(t)) + 0;
        if (!this.f37276c) {
            return e;
        }
        C16925r<?> c = this.f37277d.mo60013c(t);
        int i = 0;
        for (int i2 = 0; i2 < c.f37284a.mo60081d(); i2++) {
            i += C16925r.m28365f(c.f37284a.mo60078c(i2));
        }
        for (Map.Entry<T, Object> f : c.f37284a.mo60082e()) {
            i += C16925r.m28365f(f);
        }
        return e + i;
    }

    /* renamed from: e */
    public final int mo59993e(T t) {
        int hashCode = this.f37275b.mo59851c(t).hashCode();
        return this.f37276c ? (hashCode * 53) + this.f37277d.mo60013c(t).hashCode() : hashCode;
    }

    /* renamed from: f */
    public final boolean mo59994f(T t, T t2) {
        if (!this.f37275b.mo59851c(t).equals(this.f37275b.mo59851c(t2))) {
            return false;
        }
        if (this.f37276c) {
            return this.f37277d.mo60013c(t).equals(this.f37277d.mo60013c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo59995g(Object obj, C16905j jVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.f37277d.mo60013c(obj).mo60027k();
        while (k.hasNext()) {
            Map.Entry next = k.next();
            C16925r.C16927b bVar = (C16925r.C16927b) next.getKey();
            if (bVar.mo59768z() == WireFormat$JavaType.MESSAGE) {
                bVar.mo59766x();
                bVar.mo59762A();
                if (next instanceof C16944w.C16945a) {
                    bVar.getNumber();
                    jVar.mo59962l(0, ((C16944w.C16945a) next).f37309b.getValue().mo60069b());
                } else {
                    bVar.getNumber();
                    jVar.mo59962l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C16871b1<?, ?> b1Var = this.f37275b;
        b1Var.mo59859k(b1Var.mo59851c(obj), jVar);
    }

    /* renamed from: h */
    public final void mo59996h(T t, byte[] bArr, int i, int i2, C16881e.C16882a aVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        C16876c1 c1Var = generatedMessageLite.unknownFields;
        if (c1Var == C16876c1.f37186f) {
            c1Var = new C16876c1();
            generatedMessageLite.unknownFields = c1Var;
        }
        GeneratedMessageLite.C16840c cVar = (GeneratedMessageLite.C16840c) t;
        C16925r<GeneratedMessageLite.C16841d> rVar = cVar.extensions;
        if (rVar.f37285b) {
            cVar.extensions = rVar.clone();
        }
        GeneratedMessageLite.C16842e eVar = null;
        while (i < i2) {
            int H = C16881e.m28089H(bArr, i, aVar);
            int i3 = aVar.f37201a;
            if (i3 == 11) {
                int i4 = 0;
                ByteString byteString = null;
                while (H < i2) {
                    H = C16881e.m28089H(bArr, H, aVar);
                    int i5 = aVar.f37201a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                C16932t0 t0Var = C16932t0.f37292c;
                                throw null;
                            } else if (i7 == 2) {
                                H = C16881e.m28095b(bArr, H, aVar);
                                byteString = (ByteString) aVar.f37203c;
                            }
                        }
                    } else if (i7 == 0) {
                        H = C16881e.m28089H(bArr, H, aVar);
                        i4 = aVar.f37201a;
                        eVar = this.f37277d.mo60012b(aVar.f37204d, this.f37274a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    H = C16881e.m28093L(i5, bArr, H, i2, aVar);
                }
                if (byteString != null) {
                    c1Var.mo59872b((i4 << 3) | 2, byteString);
                }
                i = H;
            } else if ((i3 & 7) == 2) {
                eVar = this.f37277d.mo60012b(aVar.f37204d, this.f37274a, i3 >>> 3);
                if (eVar == null) {
                    i = C16881e.m28087F(i3, bArr, H, i2, c1Var, aVar);
                } else {
                    C16932t0 t0Var2 = C16932t0.f37292c;
                    throw null;
                }
            } else {
                i = C16881e.m28093L(i3, bArr, H, i2, aVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final T newInstance() {
        return this.f37274a.mo59752i().mo59760t();
    }
}
