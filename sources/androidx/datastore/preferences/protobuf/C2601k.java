package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k */
public final class C2601k {

    /* renamed from: a */
    public final CodedOutputStream f5918a;

    public C2601k(CodedOutputStream codedOutputStream) {
        Charset charset = C2631w.f5973a;
        if (codedOutputStream != null) {
            this.f5918a = codedOutputStream;
            codedOutputStream.f5783a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void mo9798a(int i, boolean z) throws IOException {
        this.f5918a.mo9416B(i, z);
    }

    /* renamed from: b */
    public final void mo9799b(int i, ByteString byteString) throws IOException {
        this.f5918a.mo9418D(i, byteString);
    }

    /* renamed from: c */
    public final void mo9800c(int i, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.f5918a;
        codedOutputStream.getClass();
        codedOutputStream.mo9422H(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void mo9801d(int i, int i2) throws IOException {
        this.f5918a.mo9424J(i, i2);
    }

    /* renamed from: e */
    public final void mo9802e(int i, int i2) throws IOException {
        this.f5918a.mo9420F(i, i2);
    }

    /* renamed from: f */
    public final void mo9803f(int i, long j) throws IOException {
        this.f5918a.mo9422H(i, j);
    }

    /* renamed from: g */
    public final void mo9804g(float f, int i) throws IOException {
        CodedOutputStream codedOutputStream = this.f5918a;
        codedOutputStream.getClass();
        codedOutputStream.mo9420F(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void mo9805h(int i, C2642y0 y0Var, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f5918a;
        codedOutputStream.mo9432R(i, 3);
        y0Var.mo9846h((C2602k0) obj, codedOutputStream.f5783a);
        codedOutputStream.mo9432R(i, 4);
    }

    /* renamed from: i */
    public final void mo9806i(int i, int i2) throws IOException {
        this.f5918a.mo9424J(i, i2);
    }

    /* renamed from: j */
    public final void mo9807j(int i, long j) throws IOException {
        this.f5918a.mo9435U(i, j);
    }

    /* renamed from: k */
    public final void mo9808k(int i, C2642y0 y0Var, Object obj) throws IOException {
        this.f5918a.mo9426L(i, (C2602k0) obj, y0Var);
    }

    /* renamed from: l */
    public final void mo9809l(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f5918a.mo9429O(i, (ByteString) obj);
        } else {
            this.f5918a.mo9428N(i, (C2602k0) obj);
        }
    }

    /* renamed from: m */
    public final void mo9810m(int i, int i2) throws IOException {
        this.f5918a.mo9420F(i, i2);
    }

    /* renamed from: n */
    public final void mo9811n(int i, long j) throws IOException {
        this.f5918a.mo9422H(i, j);
    }

    /* renamed from: o */
    public final void mo9812o(int i, int i2) throws IOException {
        this.f5918a.mo9433S(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void mo9813p(int i, long j) throws IOException {
        this.f5918a.mo9435U(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void mo9814q(int i, int i2) throws IOException {
        this.f5918a.mo9433S(i, i2);
    }

    /* renamed from: r */
    public final void mo9815r(int i, long j) throws IOException {
        this.f5918a.mo9435U(i, j);
    }
}
