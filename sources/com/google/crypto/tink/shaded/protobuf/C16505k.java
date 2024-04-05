package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k */
public final class C16505k {

    /* renamed from: a */
    public final CodedOutputStream f36650a;

    public C16505k(CodedOutputStream codedOutputStream) {
        Charset charset = C16531v.f36704a;
        if (codedOutputStream != null) {
            this.f36650a = codedOutputStream;
            codedOutputStream.f36531a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void mo58858a(int i, boolean z) throws IOException {
        this.f36650a.mo58490A(i, z);
    }

    /* renamed from: b */
    public final void mo58859b(int i, ByteString byteString) throws IOException {
        this.f36650a.mo58491B(i, byteString);
    }

    /* renamed from: c */
    public final void mo58860c(int i, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.f36650a;
        codedOutputStream.getClass();
        codedOutputStream.mo58494E(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void mo58861d(int i, int i2) throws IOException {
        this.f36650a.mo58496G(i, i2);
    }

    /* renamed from: e */
    public final void mo58862e(int i, int i2) throws IOException {
        this.f36650a.mo58492C(i, i2);
    }

    /* renamed from: f */
    public final void mo58863f(int i, long j) throws IOException {
        this.f36650a.mo58494E(i, j);
    }

    /* renamed from: g */
    public final void mo58864g(float f, int i) throws IOException {
        CodedOutputStream codedOutputStream = this.f36650a;
        codedOutputStream.getClass();
        codedOutputStream.mo58492C(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void mo58865h(int i, C16542x0 x0Var, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f36650a;
        codedOutputStream.mo58502M(i, 3);
        x0Var.mo58905g((C16503j0) obj, codedOutputStream.f36531a);
        codedOutputStream.mo58502M(i, 4);
    }

    /* renamed from: i */
    public final void mo58866i(int i, int i2) throws IOException {
        this.f36650a.mo58496G(i, i2);
    }

    /* renamed from: j */
    public final void mo58867j(int i, long j) throws IOException {
        this.f36650a.mo58505P(i, j);
    }

    /* renamed from: k */
    public final void mo58868k(int i, C16542x0 x0Var, Object obj) throws IOException {
        this.f36650a.mo58498I(i, (C16503j0) obj, x0Var);
    }

    /* renamed from: l */
    public final void mo58869l(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f36650a.mo58500K(i, (ByteString) obj);
        } else {
            this.f36650a.mo58499J(i, (C16503j0) obj);
        }
    }

    /* renamed from: m */
    public final void mo58870m(int i, int i2) throws IOException {
        this.f36650a.mo58492C(i, i2);
    }

    /* renamed from: n */
    public final void mo58871n(int i, long j) throws IOException {
        this.f36650a.mo58494E(i, j);
    }

    /* renamed from: o */
    public final void mo58872o(int i, int i2) throws IOException {
        this.f36650a.mo58503N(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void mo58873p(int i, long j) throws IOException {
        this.f36650a.mo58505P(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void mo58874q(int i, int i2) throws IOException {
        this.f36650a.mo58503N(i, i2);
    }

    /* renamed from: r */
    public final void mo58875r(int i, long j) throws IOException {
        this.f36650a.mo58505P(i, j);
    }
}
