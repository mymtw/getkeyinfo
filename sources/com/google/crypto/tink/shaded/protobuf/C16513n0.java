package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16477e;
import com.google.crypto.tink.shaded.protobuf.C16521r;
import com.google.crypto.tink.shaded.protobuf.C16537w;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n0 */
public final class C16513n0<T> implements C16542x0<T> {

    /* renamed from: a */
    public final C16503j0 f36678a;

    /* renamed from: b */
    public final C16473c1<?, ?> f36679b;

    /* renamed from: c */
    public final boolean f36680c;

    /* renamed from: d */
    public final C16514o<?> f36681d;

    public C16513n0(C16473c1<?, ?> c1Var, C16514o<?> oVar, C16503j0 j0Var) {
        this.f36679b = c1Var;
        this.f36680c = oVar.mo58929e(j0Var);
        this.f36681d = oVar;
        this.f36678a = j0Var;
    }

    /* renamed from: a */
    public final void mo58899a(T t, T t2) {
        C16473c1<?, ?> c1Var = this.f36679b;
        Class<?> cls = C16544y0.f36715a;
        c1Var.mo58693o(t, c1Var.mo58689k(c1Var.mo58685g(t), c1Var.mo58685g(t2)));
        if (this.f36680c) {
            C16544y0.m27300B(this.f36681d, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo58900b(T t) {
        this.f36679b.mo58688j(t);
        this.f36681d.mo58930f(t);
    }

    /* renamed from: c */
    public final boolean mo58901c(T t) {
        return this.f36681d.mo58927c(t).mo58943i();
    }

    /* renamed from: d */
    public final int mo58902d(T t) {
        C16473c1<?, ?> c1Var = this.f36679b;
        int i = c1Var.mo58687i(c1Var.mo58685g(t)) + 0;
        if (!this.f36680c) {
            return i;
        }
        C16521r<?> c = this.f36681d.mo58927c(t);
        int i2 = 0;
        for (int i3 = 0; i3 < c.f36688a.mo58615d(); i3++) {
            i2 += C16521r.m27206f(c.f36688a.mo58612c(i3));
        }
        for (Map.Entry<T, Object> f : c.f36688a.mo58616e()) {
            i2 += C16521r.m27206f(f);
        }
        return i + i2;
    }

    /* renamed from: e */
    public final int mo58903e(T t) {
        int hashCode = this.f36679b.mo58685g(t).hashCode();
        return this.f36680c ? (hashCode * 53) + this.f36681d.mo58927c(t).hashCode() : hashCode;
    }

    /* renamed from: f */
    public final boolean mo58904f(T t, T t2) {
        if (!this.f36679b.mo58685g(t).equals(this.f36679b.mo58685g(t2))) {
            return false;
        }
        if (this.f36680c) {
            return this.f36681d.mo58927c(t).equals(this.f36681d.mo58927c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo58905g(Object obj, C16505k kVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.f36681d.mo58927c(obj).mo58944k();
        while (k.hasNext()) {
            Map.Entry next = k.next();
            C16521r.C16523b bVar = (C16521r.C16523b) next.getKey();
            if (bVar.mo58547z() == WireFormat$JavaType.MESSAGE) {
                bVar.mo58545x();
                bVar.mo58541A();
                if (next instanceof C16537w.C16538a) {
                    bVar.getNumber();
                    kVar.mo58869l(0, ((C16537w.C16538a) next).f36710b.getValue().mo58982b());
                } else {
                    bVar.getNumber();
                    kVar.mo58869l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C16473c1<?, ?> c1Var = this.f36679b;
        c1Var.mo58696r(c1Var.mo58685g(obj), kVar);
    }

    /* renamed from: h */
    public final void mo58906h(T t, byte[] bArr, int i, int i2, C16477e.C16478a aVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        C16476d1 d1Var = generatedMessageLite.unknownFields;
        if (d1Var == C16476d1.f36589f) {
            d1Var = new C16476d1();
            generatedMessageLite.unknownFields = d1Var;
        }
        GeneratedMessageLite.C16433c cVar = (GeneratedMessageLite.C16433c) t;
        C16521r<GeneratedMessageLite.C16434d> rVar = cVar.extensions;
        if (rVar.f36689b) {
            cVar.extensions = rVar.clone();
        }
        GeneratedMessageLite.C16435e eVar = null;
        while (i < i2) {
            int H = C16477e.m26763H(bArr, i, aVar);
            int i3 = aVar.f36595a;
            if (i3 == 11) {
                int i4 = 0;
                ByteString byteString = null;
                while (H < i2) {
                    H = C16477e.m26763H(bArr, H, aVar);
                    int i5 = aVar.f36595a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                C16528t0 t0Var = C16528t0.f36696c;
                                throw null;
                            } else if (i7 == 2) {
                                H = C16477e.m26769b(bArr, H, aVar);
                                byteString = (ByteString) aVar.f36597c;
                            }
                        }
                    } else if (i7 == 0) {
                        H = C16477e.m26763H(bArr, H, aVar);
                        i4 = aVar.f36595a;
                        eVar = this.f36681d.mo58926b(aVar.f36598d, this.f36678a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    H = C16477e.m26767L(i5, bArr, H, i2, aVar);
                }
                if (byteString != null) {
                    d1Var.mo58699b((i4 << 3) | 2, byteString);
                }
                i = H;
            } else if ((i3 & 7) == 2) {
                eVar = this.f36681d.mo58926b(aVar.f36598d, this.f36678a, i3 >>> 3);
                if (eVar == null) {
                    i = C16477e.m26761F(i3, bArr, H, i2, d1Var, aVar);
                } else {
                    C16528t0 t0Var2 = C16528t0.f36696c;
                    throw null;
                }
            } else {
                i = C16477e.m26767L(i3, bArr, H, i2, aVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: i */
    public final void mo58907i(T t, C16540w0 w0Var, C16511n nVar) throws IOException {
        C16473c1<?, ?> c1Var = this.f36679b;
        C16514o<?> oVar = this.f36681d;
        C16476d1 f = c1Var.mo58684f(t);
        C16521r<?> d = oVar.mo58928d(t);
        while (true) {
            try {
                if (w0Var.mo58857z() != Integer.MAX_VALUE) {
                    if (!mo58924j(w0Var, nVar, oVar, d, c1Var, f)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                c1Var.mo58692n(t, f);
            }
        }
    }

    /* renamed from: j */
    public final <UT, UB, ET extends C16521r.C16523b<ET>> boolean mo58924j(C16540w0 w0Var, C16511n nVar, C16514o<ET> oVar, C16521r<ET> rVar, C16473c1<UT, UB> c1Var, UB ub) throws IOException {
        int tag = w0Var.getTag();
        if (tag == 11) {
            int i = 0;
            GeneratedMessageLite.C16435e eVar = null;
            ByteString byteString = null;
            while (w0Var.mo58857z() != Integer.MAX_VALUE) {
                int tag2 = w0Var.getTag();
                if (tag2 == 16) {
                    i = w0Var.mo58835g();
                    eVar = oVar.mo58926b(nVar, this.f36678a, i);
                } else if (tag2 == 26) {
                    if (eVar != null) {
                        oVar.mo58932h(eVar);
                    } else {
                        byteString = w0Var.mo58843n();
                    }
                } else if (!w0Var.mo58811C()) {
                    break;
                }
            }
            if (w0Var.getTag() == 12) {
                if (byteString != null) {
                    if (eVar != null) {
                        oVar.mo58933i(eVar);
                    } else {
                        c1Var.mo58682d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if ((tag & 7) != 2) {
            return w0Var.mo58811C();
        } else {
            GeneratedMessageLite.C16435e b = oVar.mo58926b(nVar, this.f36678a, tag >>> 3);
            if (b == null) {
                return c1Var.mo58690l(ub, w0Var);
            }
            oVar.mo58932h(b);
            return true;
        }
    }

    public final T newInstance() {
        return this.f36678a.mo58532j().mo58539m();
    }
}
