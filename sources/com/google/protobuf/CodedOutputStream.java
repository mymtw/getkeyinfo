package com.google.protobuf;

import androidx.appcompat.widget.C0326j;
import com.google.protobuf.Utf8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C16898h {

    /* renamed from: b */
    public static final Logger f37140b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c */
    public static final boolean f37141c = C16889f1.f37214e;

    /* renamed from: a */
    public C16905j f37142a;

    /* renamed from: com.google.protobuf.CodedOutputStream$a */
    public static class C16820a extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f37143d;

        /* renamed from: e */
        public final int f37144e;

        /* renamed from: f */
        public int f37145f;

        public C16820a(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f37143d = bArr;
                this.f37145f = 0;
                this.f37144e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        /* renamed from: A */
        public final void mo59710A(int i, boolean z) throws IOException {
            mo59726Q(i, 0);
            mo59731z(z ? (byte) 1 : 0);
        }

        /* renamed from: B */
        public final void mo59711B(int i, byte[] bArr) throws IOException {
            mo59728S(i);
            mo59733W(bArr, 0, i);
        }

        /* renamed from: C */
        public final void mo59712C(int i, ByteString byteString) throws IOException {
            mo59726Q(i, 2);
            mo59713D(byteString);
        }

        /* renamed from: D */
        public final void mo59713D(ByteString byteString) throws IOException {
            mo59728S(byteString.size());
            byteString.writeTo((C16898h) this);
        }

        /* renamed from: E */
        public final void mo59714E(int i, int i2) throws IOException {
            mo59726Q(i, 5);
            mo59715F(i2);
        }

        /* renamed from: F */
        public final void mo59715F(int i) throws IOException {
            try {
                byte[] bArr = this.f37143d;
                int i2 = this.f37145f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f37145f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), 1}), e);
            }
        }

        /* renamed from: G */
        public final void mo59716G(int i, long j) throws IOException {
            mo59726Q(i, 1);
            mo59717H(j);
        }

        /* renamed from: H */
        public final void mo59717H(long j) throws IOException {
            try {
                byte[] bArr = this.f37143d;
                int i = this.f37145f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f37145f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), 1}), e);
            }
        }

        /* renamed from: I */
        public final void mo59718I(int i, int i2) throws IOException {
            mo59726Q(i, 0);
            mo59719J(i2);
        }

        /* renamed from: J */
        public final void mo59719J(int i) throws IOException {
            if (i >= 0) {
                mo59728S(i);
            } else {
                mo59730U((long) i);
            }
        }

        /* renamed from: K */
        public final void mo59720K(int i, C16906j0 j0Var, C16947w0 w0Var) throws IOException {
            mo59726Q(i, 2);
            C16863a aVar = (C16863a) j0Var;
            int g = aVar.mo59749g();
            if (g == -1) {
                g = w0Var.mo59992d(aVar);
                aVar.mo59754r(g);
            }
            mo59728S(g);
            w0Var.mo59995g(j0Var, this.f37142a);
        }

        /* renamed from: L */
        public final void mo59721L(C16906j0 j0Var) throws IOException {
            mo59728S(j0Var.mo59745b());
            j0Var.mo59753m(this);
        }

        /* renamed from: M */
        public final void mo59722M(int i, C16906j0 j0Var) throws IOException {
            mo59726Q(1, 3);
            mo59727R(2, i);
            mo59726Q(3, 2);
            mo59721L(j0Var);
            mo59726Q(1, 4);
        }

        /* renamed from: N */
        public final void mo59723N(int i, ByteString byteString) throws IOException {
            mo59726Q(1, 3);
            mo59727R(2, i);
            mo59712C(3, byteString);
            mo59726Q(1, 4);
        }

        /* renamed from: O */
        public final void mo59724O(int i, String str) throws IOException {
            mo59726Q(i, 2);
            mo59725P(str);
        }

        /* renamed from: P */
        public final void mo59725P(String str) throws IOException {
            int i = this.f37145f;
            try {
                int w = CodedOutputStream.m27898w(str.length() * 3);
                int w2 = CodedOutputStream.m27898w(str.length());
                if (w2 == w) {
                    int i2 = i + w2;
                    this.f37145f = i2;
                    int d = Utf8.f37176a.mo59816d(str, this.f37143d, i2, this.f37144e - i2);
                    this.f37145f = i;
                    mo59728S((d - i) - w2);
                    this.f37145f = d;
                    return;
                }
                mo59728S(Utf8.m27997c(str));
                byte[] bArr = this.f37143d;
                int i3 = this.f37145f;
                this.f37145f = Utf8.f37176a.mo59816d(str, bArr, i3, this.f37144e - i3);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f37145f = i;
                CodedOutputStream.f37140b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
                byte[] bytes = str.getBytes(C16935v.f37301a);
                try {
                    mo59728S(bytes.length);
                    mo59733W(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException((Throwable) e2);
                } catch (OutOfSpaceException e3) {
                    throw e3;
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException((Throwable) e4);
            }
        }

        /* renamed from: Q */
        public final void mo59726Q(int i, int i2) throws IOException {
            mo59728S((i << 3) | i2);
        }

        /* renamed from: R */
        public final void mo59727R(int i, int i2) throws IOException {
            mo59726Q(i, 0);
            mo59728S(i2);
        }

        /* renamed from: S */
        public final void mo59728S(int i) throws IOException {
            if (CodedOutputStream.f37141c && !C16877d.m28067a()) {
                int i2 = this.f37144e;
                int i3 = this.f37145f;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f37143d;
                        this.f37145f = i3 + 1;
                        C16889f1.m28160r(bArr, (byte) i, (long) i3);
                        return;
                    }
                    byte[] bArr2 = this.f37143d;
                    this.f37145f = i3 + 1;
                    C16889f1.m28160r(bArr2, (byte) (i | 128), (long) i3);
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.f37143d;
                        int i5 = this.f37145f;
                        this.f37145f = i5 + 1;
                        C16889f1.m28160r(bArr3, (byte) i4, (long) i5);
                        return;
                    }
                    byte[] bArr4 = this.f37143d;
                    int i6 = this.f37145f;
                    this.f37145f = i6 + 1;
                    C16889f1.m28160r(bArr4, (byte) (i4 | 128), (long) i6);
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.f37143d;
                        int i8 = this.f37145f;
                        this.f37145f = i8 + 1;
                        C16889f1.m28160r(bArr5, (byte) i7, (long) i8);
                        return;
                    }
                    byte[] bArr6 = this.f37143d;
                    int i9 = this.f37145f;
                    this.f37145f = i9 + 1;
                    C16889f1.m28160r(bArr6, (byte) (i7 | 128), (long) i9);
                    int i10 = i7 >>> 7;
                    if ((i10 & -128) == 0) {
                        byte[] bArr7 = this.f37143d;
                        int i11 = this.f37145f;
                        this.f37145f = i11 + 1;
                        C16889f1.m28160r(bArr7, (byte) i10, (long) i11);
                        return;
                    }
                    byte[] bArr8 = this.f37143d;
                    int i12 = this.f37145f;
                    this.f37145f = i12 + 1;
                    C16889f1.m28160r(bArr8, (byte) (i10 | 128), (long) i12);
                    byte[] bArr9 = this.f37143d;
                    int i13 = this.f37145f;
                    this.f37145f = i13 + 1;
                    C16889f1.m28160r(bArr9, (byte) (i10 >>> 7), (long) i13);
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f37143d;
                int i14 = this.f37145f;
                this.f37145f = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f37143d;
                int i15 = this.f37145f;
                this.f37145f = i15 + 1;
                bArr11[i15] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), 1}), e);
            }
        }

        /* renamed from: T */
        public final void mo59729T(int i, long j) throws IOException {
            mo59726Q(i, 0);
            mo59730U(j);
        }

        /* renamed from: U */
        public final void mo59730U(long j) throws IOException {
            if (!CodedOutputStream.f37141c || this.f37144e - this.f37145f < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f37143d;
                    int i = this.f37145f;
                    this.f37145f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f37143d;
                    int i2 = this.f37145f;
                    this.f37145f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f37143d;
                    int i3 = this.f37145f;
                    this.f37145f = i3 + 1;
                    C16889f1.m28160r(bArr3, (byte) ((((int) j) & 127) | 128), (long) i3);
                    j >>>= 7;
                }
                byte[] bArr4 = this.f37143d;
                int i4 = this.f37145f;
                this.f37145f = i4 + 1;
                C16889f1.m28160r(bArr4, (byte) ((int) j), (long) i4);
            }
        }

        /* renamed from: V */
        public final int mo59732V() {
            return this.f37144e - this.f37145f;
        }

        /* renamed from: W */
        public final void mo59733W(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f37143d, this.f37145f, i2);
                this.f37145f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo59734a(int i, int i2, byte[] bArr) throws IOException {
            mo59733W(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo59735b(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f37143d, this.f37145f, remaining);
                this.f37145f += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: z */
        public final void mo59731z(byte b) throws IOException {
            try {
                byte[] bArr = this.f37143d;
                int i = this.f37145f;
                this.f37145f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37145f), Integer.valueOf(this.f37144e), 1}), e);
            }
        }
    }

    /* renamed from: c */
    public static int m27878c(int i) {
        return m27896u(i) + 1;
    }

    /* renamed from: d */
    public static int m27879d(int i, ByteString byteString) {
        int u = m27896u(i);
        int size = byteString.size();
        return m27898w(size) + size + u;
    }

    /* renamed from: e */
    public static int m27880e(int i) {
        return m27896u(i) + 8;
    }

    /* renamed from: f */
    public static int m27881f(int i, int i2) {
        return m27887l(i2) + m27896u(i);
    }

    /* renamed from: g */
    public static int m27882g(int i) {
        return m27896u(i) + 4;
    }

    /* renamed from: h */
    public static int m27883h(int i) {
        return m27896u(i) + 8;
    }

    /* renamed from: i */
    public static int m27884i(int i) {
        return m27896u(i) + 4;
    }

    @Deprecated
    /* renamed from: j */
    public static int m27885j(int i, C16906j0 j0Var, C16947w0 w0Var) {
        int u = m27896u(i) * 2;
        C16863a aVar = (C16863a) j0Var;
        int g = aVar.mo59749g();
        if (g == -1) {
            g = w0Var.mo59992d(aVar);
            aVar.mo59754r(g);
        }
        return g + u;
    }

    /* renamed from: k */
    public static int m27886k(int i, int i2) {
        return m27887l(i2) + m27896u(i);
    }

    /* renamed from: l */
    public static int m27887l(int i) {
        if (i >= 0) {
            return m27898w(i);
        }
        return 10;
    }

    /* renamed from: m */
    public static int m27888m(int i, long j) {
        return m27900y(j) + m27896u(i);
    }

    /* renamed from: n */
    public static int m27889n(C16948x xVar) {
        int size = xVar.f37312b != null ? xVar.f37312b.size() : xVar.f37311a != null ? xVar.f37311a.mo59745b() : 0;
        return m27898w(size) + size;
    }

    /* renamed from: o */
    public static int m27890o(int i) {
        return m27896u(i) + 4;
    }

    /* renamed from: p */
    public static int m27891p(int i) {
        return m27896u(i) + 8;
    }

    /* renamed from: q */
    public static int m27892q(int i, int i2) {
        return m27898w((i2 >> 31) ^ (i2 << 1)) + m27896u(i);
    }

    /* renamed from: r */
    public static int m27893r(int i, long j) {
        return m27900y((j >> 63) ^ (j << 1)) + m27896u(i);
    }

    /* renamed from: s */
    public static int m27894s(int i, String str) {
        return m27895t(str) + m27896u(i);
    }

    /* renamed from: t */
    public static int m27895t(String str) {
        int i;
        try {
            i = Utf8.m27997c(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C16935v.f37301a).length;
        }
        return m27898w(i) + i;
    }

    /* renamed from: u */
    public static int m27896u(int i) {
        return m27898w((i << 3) | 0);
    }

    /* renamed from: v */
    public static int m27897v(int i, int i2) {
        return m27898w(i2) + m27896u(i);
    }

    /* renamed from: w */
    public static int m27898w(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: x */
    public static int m27899x(int i, long j) {
        return m27900y(j) + m27896u(i);
    }

    /* renamed from: y */
    public static int m27900y(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: A */
    public abstract void mo59710A(int i, boolean z) throws IOException;

    /* renamed from: B */
    public abstract void mo59711B(int i, byte[] bArr) throws IOException;

    /* renamed from: C */
    public abstract void mo59712C(int i, ByteString byteString) throws IOException;

    /* renamed from: D */
    public abstract void mo59713D(ByteString byteString) throws IOException;

    /* renamed from: E */
    public abstract void mo59714E(int i, int i2) throws IOException;

    /* renamed from: F */
    public abstract void mo59715F(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo59716G(int i, long j) throws IOException;

    /* renamed from: H */
    public abstract void mo59717H(long j) throws IOException;

    /* renamed from: I */
    public abstract void mo59718I(int i, int i2) throws IOException;

    /* renamed from: J */
    public abstract void mo59719J(int i) throws IOException;

    /* renamed from: K */
    public abstract void mo59720K(int i, C16906j0 j0Var, C16947w0 w0Var) throws IOException;

    /* renamed from: L */
    public abstract void mo59721L(C16906j0 j0Var) throws IOException;

    /* renamed from: M */
    public abstract void mo59722M(int i, C16906j0 j0Var) throws IOException;

    /* renamed from: N */
    public abstract void mo59723N(int i, ByteString byteString) throws IOException;

    /* renamed from: O */
    public abstract void mo59724O(int i, String str) throws IOException;

    /* renamed from: P */
    public abstract void mo59725P(String str) throws IOException;

    /* renamed from: Q */
    public abstract void mo59726Q(int i, int i2) throws IOException;

    /* renamed from: R */
    public abstract void mo59727R(int i, int i2) throws IOException;

    /* renamed from: S */
    public abstract void mo59728S(int i) throws IOException;

    /* renamed from: T */
    public abstract void mo59729T(int i, long j) throws IOException;

    /* renamed from: U */
    public abstract void mo59730U(long j) throws IOException;

    /* renamed from: z */
    public abstract void mo59731z(byte b) throws IOException;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str) {
            super(C0326j.m864i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(C0326j.m864i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }
}
