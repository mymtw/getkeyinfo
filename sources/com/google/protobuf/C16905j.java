package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.j */
public final class C16905j {

    /* renamed from: a */
    public final CodedOutputStream f37242a;

    public C16905j(CodedOutputStream codedOutputStream) {
        Charset charset = C16935v.f37301a;
        if (codedOutputStream != null) {
            this.f37242a = codedOutputStream;
            codedOutputStream.f37142a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void mo59951a(int i, boolean z) throws IOException {
        this.f37242a.mo59710A(i, z);
    }

    /* renamed from: b */
    public final void mo59952b(int i, ByteString byteString) throws IOException {
        this.f37242a.mo59712C(i, byteString);
    }

    /* renamed from: c */
    public final void mo59953c(int i, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.f37242a;
        codedOutputStream.getClass();
        codedOutputStream.mo59716G(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void mo59954d(int i, int i2) throws IOException {
        this.f37242a.mo59718I(i, i2);
    }

    /* renamed from: e */
    public final void mo59955e(int i, int i2) throws IOException {
        this.f37242a.mo59714E(i, i2);
    }

    /* renamed from: f */
    public final void mo59956f(int i, long j) throws IOException {
        this.f37242a.mo59716G(i, j);
    }

    /* renamed from: g */
    public final void mo59957g(float f, int i) throws IOException {
        CodedOutputStream codedOutputStream = this.f37242a;
        codedOutputStream.getClass();
        codedOutputStream.mo59714E(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void mo59958h(int i, C16947w0 w0Var, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f37242a;
        codedOutputStream.mo59726Q(i, 3);
        w0Var.mo59995g((C16906j0) obj, codedOutputStream.f37142a);
        codedOutputStream.mo59726Q(i, 4);
    }

    /* renamed from: i */
    public final void mo59959i(int i, int i2) throws IOException {
        this.f37242a.mo59718I(i, i2);
    }

    /* renamed from: j */
    public final void mo59960j(int i, long j) throws IOException {
        this.f37242a.mo59729T(i, j);
    }

    /* renamed from: k */
    public final void mo59961k(int i, C16947w0 w0Var, Object obj) throws IOException {
        this.f37242a.mo59720K(i, (C16906j0) obj, w0Var);
    }

    /* renamed from: l */
    public final void mo59962l(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f37242a.mo59723N(i, (ByteString) obj);
        } else {
            this.f37242a.mo59722M(i, (C16906j0) obj);
        }
    }

    /* renamed from: m */
    public final void mo59963m(int i, int i2) throws IOException {
        this.f37242a.mo59714E(i, i2);
    }

    /* renamed from: n */
    public final void mo59964n(int i, long j) throws IOException {
        this.f37242a.mo59716G(i, j);
    }

    /* renamed from: o */
    public final void mo59965o(int i, int i2) throws IOException {
        this.f37242a.mo59727R(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void mo59966p(int i, long j) throws IOException {
        this.f37242a.mo59729T(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void mo59967q(int i, int i2) throws IOException {
        this.f37242a.mo59727R(i, i2);
    }

    /* renamed from: r */
    public final void mo59968r(int i, long j) throws IOException {
        this.f37242a.mo59729T(i, j);
    }
}
