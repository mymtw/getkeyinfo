package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
public final class C16502j implements C16540w0 {

    /* renamed from: a */
    public final C16497i f36646a;

    /* renamed from: b */
    public int f36647b;

    /* renamed from: c */
    public int f36648c;

    /* renamed from: d */
    public int f36649d = 0;

    public C16502j(C16497i iVar) {
        Charset charset = C16531v.f36704a;
        if (iVar != null) {
            this.f36646a = iVar;
            iVar.f36622d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    /* renamed from: A */
    public final void mo58809A(List<String> list) throws IOException {
        mo58824P(list, false);
    }

    /* renamed from: B */
    public final void mo58810B(List<Float> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16525s) {
            C16525s sVar = (C16525s) list;
            int i = this.f36647b & 7;
            if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58827S(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    sVar.mo58948c(this.f36646a.mo58772o());
                } while (this.f36646a.mo58762d() < d);
            } else if (i == 5) {
                do {
                    sVar.mo58948c(this.f36646a.mo58772o());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58827S(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Float.valueOf(this.f36646a.mo58772o()));
                } while (this.f36646a.mo58762d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f36646a.mo58772o()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: C */
    public final boolean mo58811C() throws IOException {
        int i;
        if (this.f36646a.mo58763e() || (i = this.f36647b) == this.f36648c) {
            return false;
        }
        return this.f36646a.mo58760A(i);
    }

    /* renamed from: D */
    public final int mo58812D() throws IOException {
        mo58826R(5);
        return this.f36646a.mo58775r();
    }

    /* renamed from: E */
    public final void mo58813E(List<ByteString> list) throws IOException {
        int x;
        if ((this.f36647b & 7) == 2) {
            do {
                list.add(mo58843n());
                if (!this.f36646a.mo58763e()) {
                    x = this.f36646a.mo58781x();
                } else {
                    return;
                }
            } while (x == this.f36647b);
            this.f36649d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: F */
    public final void mo58814F(List<Double> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16507l) {
            C16507l lVar = (C16507l) list;
            int i = this.f36647b & 7;
            if (i == 1) {
                do {
                    lVar.mo58877c(this.f36646a.mo58768k());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58828T(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    lVar.mo58877c(this.f36646a.mo58768k());
                } while (this.f36646a.mo58762d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f36646a.mo58768k()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58828T(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Double.valueOf(this.f36646a.mo58768k()));
                } while (this.f36646a.mo58762d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: G */
    public final long mo58815G() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58774q();
    }

    /* renamed from: H */
    public final String mo58816H() throws IOException {
        mo58826R(2);
        return this.f36646a.mo58780w();
    }

    /* renamed from: I */
    public final void mo58817I() throws IOException {
        mo58826R(2);
        this.f36646a.mo58765h(this.f36646a.mo58782y());
        throw null;
    }

    /* renamed from: J */
    public final <T> T mo58818J(C16542x0<T> x0Var, C16511n nVar) throws IOException {
        mo58826R(3);
        return mo58822N(x0Var, nVar);
    }

    /* renamed from: K */
    public final <T> void mo58819K(List<T> list, C16542x0<T> x0Var, C16511n nVar) throws IOException {
        int x;
        int i = this.f36647b;
        if ((i & 7) == 2) {
            do {
                list.add(mo58823O(x0Var, nVar));
                if (!this.f36646a.mo58763e() && this.f36649d == 0) {
                    x = this.f36646a.mo58781x();
                } else {
                    return;
                }
            } while (x == i);
            this.f36649d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: L */
    public final <T> T mo58820L(C16542x0<T> x0Var, C16511n nVar) throws IOException {
        mo58826R(2);
        return mo58823O(x0Var, nVar);
    }

    /* renamed from: M */
    public final <T> void mo58821M(List<T> list, C16542x0<T> x0Var, C16511n nVar) throws IOException {
        int x;
        int i = this.f36647b;
        if ((i & 7) == 3) {
            do {
                list.add(mo58822N(x0Var, nVar));
                if (!this.f36646a.mo58763e() && this.f36649d == 0) {
                    x = this.f36646a.mo58781x();
                } else {
                    return;
                }
            } while (x == i);
            this.f36649d = x;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: N */
    public final <T> T mo58822N(C16542x0<T> x0Var, C16511n nVar) throws IOException {
        int i = this.f36648c;
        this.f36648c = ((this.f36647b >>> 3) << 3) | 4;
        try {
            T newInstance = x0Var.newInstance();
            x0Var.mo58907i(newInstance, this, nVar);
            x0Var.mo58900b(newInstance);
            if (this.f36647b == this.f36648c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f36648c = i;
        }
    }

    /* renamed from: O */
    public final <T> T mo58823O(C16542x0<T> x0Var, C16511n nVar) throws IOException {
        int y = this.f36646a.mo58782y();
        C16497i iVar = this.f36646a;
        if (iVar.f36619a < iVar.f36620b) {
            int h = iVar.mo58765h(y);
            T newInstance = x0Var.newInstance();
            this.f36646a.f36619a++;
            x0Var.mo58907i(newInstance, this, nVar);
            x0Var.mo58900b(newInstance);
            this.f36646a.mo58761a(0);
            C16497i iVar2 = this.f36646a;
            iVar2.f36619a--;
            iVar2.mo58764g(h);
            return newInstance;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: P */
    public final void mo58824P(List<String> list, boolean z) throws IOException {
        int x;
        int x2;
        if ((this.f36647b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        } else if (!(list instanceof C16545z) || z) {
            do {
                list.add(z ? mo58816H() : mo58856y());
                if (!this.f36646a.mo58763e()) {
                    x = this.f36646a.mo58781x();
                } else {
                    return;
                }
            } while (x == this.f36647b);
            this.f36649d = x;
        } else {
            C16545z zVar = (C16545z) list;
            do {
                zVar.mo58725m0(mo58843n());
                if (!this.f36646a.mo58763e()) {
                    x2 = this.f36646a.mo58781x();
                } else {
                    return;
                }
            } while (x2 == this.f36647b);
            this.f36649d = x2;
        }
    }

    /* renamed from: Q */
    public final void mo58825Q(int i) throws IOException {
        if (this.f36646a.mo58762d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: R */
    public final void mo58826R(int i) throws IOException {
        if ((this.f36647b & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: S */
    public final void mo58827S(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: T */
    public final void mo58828T(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: a */
    public final long mo58829a() throws IOException {
        mo58826R(1);
        return this.f36646a.mo58771n();
    }

    /* renamed from: b */
    public final void mo58830b(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58827S(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    uVar.mo58957c(this.f36646a.mo58775r());
                } while (this.f36646a.mo58762d() < d);
            } else if (i == 5) {
                do {
                    uVar.mo58957c(this.f36646a.mo58775r());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58827S(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58775r()));
                } while (this.f36646a.mo58762d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58775r()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: c */
    public final void mo58831c(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    b0Var.mo58656c(this.f36646a.mo58778u());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    b0Var.mo58656c(this.f36646a.mo58778u());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36646a.mo58778u()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Long.valueOf(this.f36646a.mo58778u()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo58832d() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58766i();
    }

    /* renamed from: e */
    public final long mo58833e() throws IOException {
        mo58826R(1);
        return this.f36646a.mo58776s();
    }

    /* renamed from: f */
    public final void mo58834f(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    b0Var.mo58656c(this.f36646a.mo58783z());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    b0Var.mo58656c(this.f36646a.mo58783z());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36646a.mo58783z()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Long.valueOf(this.f36646a.mo58783z()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: g */
    public final int mo58835g() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58782y();
    }

    public final int getTag() {
        return this.f36647b;
    }

    /* renamed from: h */
    public final void mo58837h(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    b0Var.mo58656c(this.f36646a.mo58774q());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    b0Var.mo58656c(this.f36646a.mo58774q());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36646a.mo58774q()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Long.valueOf(this.f36646a.mo58774q()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: i */
    public final void mo58838i(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    uVar.mo58957c(this.f36646a.mo58769l());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    uVar.mo58957c(this.f36646a.mo58769l());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58769l()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58769l()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: j */
    public final int mo58839j() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58769l();
    }

    /* renamed from: k */
    public final int mo58840k() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58777t();
    }

    /* renamed from: l */
    public final void mo58841l(List<Boolean> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16481f) {
            C16481f fVar = (C16481f) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    fVar.mo58712c(this.f36646a.mo58766i());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    fVar.mo58712c(this.f36646a.mo58766i());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f36646a.mo58766i()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Boolean.valueOf(this.f36646a.mo58766i()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: m */
    public final void mo58842m(List<String> list) throws IOException {
        mo58824P(list, true);
    }

    /* renamed from: n */
    public final ByteString mo58843n() throws IOException {
        mo58826R(2);
        return this.f36646a.mo58767j();
    }

    /* renamed from: o */
    public final int mo58844o() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58773p();
    }

    /* renamed from: p */
    public final void mo58845p(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            int i = this.f36647b & 7;
            if (i == 1) {
                do {
                    b0Var.mo58656c(this.f36646a.mo58771n());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58828T(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    b0Var.mo58656c(this.f36646a.mo58771n());
                } while (this.f36646a.mo58762d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36646a.mo58771n()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58828T(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Long.valueOf(this.f36646a.mo58771n()));
                } while (this.f36646a.mo58762d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: q */
    public final void mo58846q(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    uVar.mo58957c(this.f36646a.mo58777t());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    uVar.mo58957c(this.f36646a.mo58777t());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58777t()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58777t()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public final long mo58847r() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58783z();
    }

    public final double readDouble() throws IOException {
        mo58826R(1);
        return this.f36646a.mo58768k();
    }

    public final float readFloat() throws IOException {
        mo58826R(5);
        return this.f36646a.mo58772o();
    }

    /* renamed from: s */
    public final void mo58850s(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    uVar.mo58957c(this.f36646a.mo58782y());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    uVar.mo58957c(this.f36646a.mo58782y());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58782y()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58782y()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: t */
    public final int mo58851t() throws IOException {
        mo58826R(5);
        return this.f36646a.mo58770m();
    }

    /* renamed from: u */
    public final void mo58852u(List<Long> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16467b0) {
            C16467b0 b0Var = (C16467b0) list;
            int i = this.f36647b & 7;
            if (i == 1) {
                do {
                    b0Var.mo58656c(this.f36646a.mo58776s());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58828T(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    b0Var.mo58656c(this.f36646a.mo58776s());
                } while (this.f36646a.mo58762d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36646a.mo58776s()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58828T(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Long.valueOf(this.f36646a.mo58776s()));
                } while (this.f36646a.mo58762d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: v */
    public final void mo58853v(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 0) {
                do {
                    uVar.mo58957c(this.f36646a.mo58773p());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else if (i == 2) {
                int d = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    uVar.mo58957c(this.f36646a.mo58773p());
                } while (this.f36646a.mo58762d() < d);
                mo58825Q(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58773p()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else if (i2 == 2) {
                int d2 = this.f36646a.mo58762d() + this.f36646a.mo58782y();
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58773p()));
                } while (this.f36646a.mo58762d() < d2);
                mo58825Q(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: w */
    public final void mo58854w(List<Integer> list) throws IOException {
        int x;
        int x2;
        if (list instanceof C16529u) {
            C16529u uVar = (C16529u) list;
            int i = this.f36647b & 7;
            if (i == 2) {
                int y = this.f36646a.mo58782y();
                mo58827S(y);
                int d = this.f36646a.mo58762d() + y;
                do {
                    uVar.mo58957c(this.f36646a.mo58770m());
                } while (this.f36646a.mo58762d() < d);
            } else if (i == 5) {
                do {
                    uVar.mo58957c(this.f36646a.mo58770m());
                    if (!this.f36646a.mo58763e()) {
                        x2 = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x2 == this.f36647b);
                this.f36649d = x2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int i2 = this.f36647b & 7;
            if (i2 == 2) {
                int y2 = this.f36646a.mo58782y();
                mo58827S(y2);
                int d2 = this.f36646a.mo58762d() + y2;
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58770m()));
                } while (this.f36646a.mo58762d() < d2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36646a.mo58770m()));
                    if (!this.f36646a.mo58763e()) {
                        x = this.f36646a.mo58781x();
                    } else {
                        return;
                    }
                } while (x == this.f36647b);
                this.f36649d = x;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: x */
    public final long mo58855x() throws IOException {
        mo58826R(0);
        return this.f36646a.mo58778u();
    }

    /* renamed from: y */
    public final String mo58856y() throws IOException {
        mo58826R(2);
        return this.f36646a.mo58779v();
    }

    /* renamed from: z */
    public final int mo58857z() throws IOException {
        int i = this.f36649d;
        if (i != 0) {
            this.f36647b = i;
            this.f36649d = 0;
        } else {
            this.f36647b = this.f36646a.mo58781x();
        }
        int i2 = this.f36647b;
        return (i2 == 0 || i2 == this.f36648c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }
}
