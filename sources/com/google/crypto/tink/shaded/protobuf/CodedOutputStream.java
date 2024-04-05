package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0326j;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C16494h {

    /* renamed from: b */
    public static final Logger f36529b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c */
    public static final boolean f36530c = C16488g1.f36614f;

    /* renamed from: a */
    public C16505k f36531a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$a */
    public static class C16429a extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f36532d;

        /* renamed from: e */
        public final int f36533e;

        /* renamed from: f */
        public int f36534f;

        public C16429a(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f36532d = bArr;
                this.f36534f = 0;
                this.f36533e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        /* renamed from: A */
        public final void mo58490A(int i, boolean z) throws IOException {
            mo58502M(i, 0);
            mo58507z(z ? (byte) 1 : 0);
        }

        /* renamed from: B */
        public final void mo58491B(int i, ByteString byteString) throws IOException {
            mo58502M(i, 2);
            mo58510T(byteString);
        }

        /* renamed from: C */
        public final void mo58492C(int i, int i2) throws IOException {
            mo58502M(i, 5);
            mo58493D(i2);
        }

        /* renamed from: D */
        public final void mo58493D(int i) throws IOException {
            try {
                byte[] bArr = this.f36532d;
                int i2 = this.f36534f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f36534f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), 1}), e);
            }
        }

        /* renamed from: E */
        public final void mo58494E(int i, long j) throws IOException {
            mo58502M(i, 1);
            mo58495F(j);
        }

        /* renamed from: F */
        public final void mo58495F(long j) throws IOException {
            try {
                byte[] bArr = this.f36532d;
                int i = this.f36534f;
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
                this.f36534f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), 1}), e);
            }
        }

        /* renamed from: G */
        public final void mo58496G(int i, int i2) throws IOException {
            mo58502M(i, 0);
            mo58497H(i2);
        }

        /* renamed from: H */
        public final void mo58497H(int i) throws IOException {
            if (i >= 0) {
                mo58504O(i);
            } else {
                mo58506Q((long) i);
            }
        }

        /* renamed from: I */
        public final void mo58498I(int i, C16503j0 j0Var, C16542x0 x0Var) throws IOException {
            mo58502M(i, 2);
            C16452a aVar = (C16452a) j0Var;
            int e = aVar.mo58526e();
            if (e == -1) {
                e = x0Var.mo58902d(aVar);
                aVar.mo58533k(e);
            }
            mo58504O(e);
            x0Var.mo58905g(j0Var, this.f36531a);
        }

        /* renamed from: J */
        public final void mo58499J(int i, C16503j0 j0Var) throws IOException {
            mo58502M(1, 3);
            mo58503N(2, i);
            mo58502M(3, 2);
            mo58511U(j0Var);
            mo58502M(1, 4);
        }

        /* renamed from: K */
        public final void mo58500K(int i, ByteString byteString) throws IOException {
            mo58502M(1, 3);
            mo58503N(2, i);
            mo58491B(3, byteString);
            mo58502M(1, 4);
        }

        /* renamed from: L */
        public final void mo58501L(int i, String str) throws IOException {
            mo58502M(i, 2);
            mo58512V(str);
        }

        /* renamed from: M */
        public final void mo58502M(int i, int i2) throws IOException {
            mo58504O((i << 3) | i2);
        }

        /* renamed from: N */
        public final void mo58503N(int i, int i2) throws IOException {
            mo58502M(i, 0);
            mo58504O(i2);
        }

        /* renamed from: O */
        public final void mo58504O(int i) throws IOException {
            if (CodedOutputStream.f36530c && !C16474d.m26752a()) {
                int i2 = this.f36533e;
                int i3 = this.f36534f;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f36532d;
                        this.f36534f = i3 + 1;
                        C16488g1.m26852r(bArr, (byte) i, (long) i3);
                        return;
                    }
                    byte[] bArr2 = this.f36532d;
                    this.f36534f = i3 + 1;
                    C16488g1.m26852r(bArr2, (byte) (i | 128), (long) i3);
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.f36532d;
                        int i5 = this.f36534f;
                        this.f36534f = i5 + 1;
                        C16488g1.m26852r(bArr3, (byte) i4, (long) i5);
                        return;
                    }
                    byte[] bArr4 = this.f36532d;
                    int i6 = this.f36534f;
                    this.f36534f = i6 + 1;
                    C16488g1.m26852r(bArr4, (byte) (i4 | 128), (long) i6);
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.f36532d;
                        int i8 = this.f36534f;
                        this.f36534f = i8 + 1;
                        C16488g1.m26852r(bArr5, (byte) i7, (long) i8);
                        return;
                    }
                    byte[] bArr6 = this.f36532d;
                    int i9 = this.f36534f;
                    this.f36534f = i9 + 1;
                    C16488g1.m26852r(bArr6, (byte) (i7 | 128), (long) i9);
                    int i10 = i7 >>> 7;
                    if ((i10 & -128) == 0) {
                        byte[] bArr7 = this.f36532d;
                        int i11 = this.f36534f;
                        this.f36534f = i11 + 1;
                        C16488g1.m26852r(bArr7, (byte) i10, (long) i11);
                        return;
                    }
                    byte[] bArr8 = this.f36532d;
                    int i12 = this.f36534f;
                    this.f36534f = i12 + 1;
                    C16488g1.m26852r(bArr8, (byte) (i10 | 128), (long) i12);
                    byte[] bArr9 = this.f36532d;
                    int i13 = this.f36534f;
                    this.f36534f = i13 + 1;
                    C16488g1.m26852r(bArr9, (byte) (i10 >>> 7), (long) i13);
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f36532d;
                int i14 = this.f36534f;
                this.f36534f = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f36532d;
                int i15 = this.f36534f;
                this.f36534f = i15 + 1;
                bArr11[i15] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), 1}), e);
            }
        }

        /* renamed from: P */
        public final void mo58505P(int i, long j) throws IOException {
            mo58502M(i, 0);
            mo58506Q(j);
        }

        /* renamed from: Q */
        public final void mo58506Q(long j) throws IOException {
            if (!CodedOutputStream.f36530c || this.f36533e - this.f36534f < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f36532d;
                    int i = this.f36534f;
                    this.f36534f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f36532d;
                    int i2 = this.f36534f;
                    this.f36534f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f36532d;
                    int i3 = this.f36534f;
                    this.f36534f = i3 + 1;
                    C16488g1.m26852r(bArr3, (byte) ((((int) j) & 127) | 128), (long) i3);
                    j >>>= 7;
                }
                byte[] bArr4 = this.f36532d;
                int i4 = this.f36534f;
                this.f36534f = i4 + 1;
                C16488g1.m26852r(bArr4, (byte) ((int) j), (long) i4);
            }
        }

        /* renamed from: R */
        public final int mo58508R() {
            return this.f36533e - this.f36534f;
        }

        /* renamed from: S */
        public final void mo58509S(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f36532d, this.f36534f, i2);
                this.f36534f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: T */
        public final void mo58510T(ByteString byteString) throws IOException {
            mo58504O(byteString.size());
            byteString.writeTo((C16494h) this);
        }

        /* renamed from: U */
        public final void mo58511U(C16503j0 j0Var) throws IOException {
            mo58504O(j0Var.mo58524b());
            j0Var.mo58529h(this);
        }

        /* renamed from: V */
        public final void mo58512V(String str) throws IOException {
            int i = this.f36534f;
            try {
                int w = CodedOutputStream.m26582w(str.length() * 3);
                int w2 = CodedOutputStream.m26582w(str.length());
                if (w2 == w) {
                    int i2 = i + w2;
                    this.f36534f = i2;
                    int d = Utf8.f36555a.mo58595d(str, this.f36532d, i2, this.f36533e - i2);
                    this.f36534f = i;
                    mo58504O((d - i) - w2);
                    this.f36534f = d;
                    return;
                }
                mo58504O(Utf8.m26665c(str));
                byte[] bArr = this.f36532d;
                int i3 = this.f36534f;
                this.f36534f = Utf8.f36555a.mo58595d(str, bArr, i3, this.f36533e - i3);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f36534f = i;
                CodedOutputStream.f36529b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
                byte[] bytes = str.getBytes(C16531v.f36704a);
                try {
                    mo58504O(bytes.length);
                    mo58509S(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException((Throwable) e2);
                } catch (OutOfSpaceException e3) {
                    throw e3;
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException((Throwable) e4);
            }
        }

        /* renamed from: a */
        public final void mo58513a(int i, int i2, byte[] bArr) throws IOException {
            mo58509S(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo58514b(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f36532d, this.f36534f, remaining);
                this.f36534f += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: z */
        public final void mo58507z(byte b) throws IOException {
            try {
                byte[] bArr = this.f36532d;
                int i = this.f36534f;
                this.f36534f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36534f), Integer.valueOf(this.f36533e), 1}), e);
            }
        }
    }

    /* renamed from: c */
    public static int m26562c(int i) {
        return m26580u(i) + 1;
    }

    /* renamed from: d */
    public static int m26563d(int i, ByteString byteString) {
        int u = m26580u(i);
        int size = byteString.size();
        return m26582w(size) + size + u;
    }

    /* renamed from: e */
    public static int m26564e(int i) {
        return m26580u(i) + 8;
    }

    /* renamed from: f */
    public static int m26565f(int i, int i2) {
        return m26571l(i2) + m26580u(i);
    }

    /* renamed from: g */
    public static int m26566g(int i) {
        return m26580u(i) + 4;
    }

    /* renamed from: h */
    public static int m26567h(int i) {
        return m26580u(i) + 8;
    }

    /* renamed from: i */
    public static int m26568i(int i) {
        return m26580u(i) + 4;
    }

    @Deprecated
    /* renamed from: j */
    public static int m26569j(int i, C16503j0 j0Var, C16542x0 x0Var) {
        int u = m26580u(i) * 2;
        C16452a aVar = (C16452a) j0Var;
        int e = aVar.mo58526e();
        if (e == -1) {
            e = x0Var.mo58902d(aVar);
            aVar.mo58533k(e);
        }
        return e + u;
    }

    /* renamed from: k */
    public static int m26570k(int i, int i2) {
        return m26571l(i2) + m26580u(i);
    }

    /* renamed from: l */
    public static int m26571l(int i) {
        if (i >= 0) {
            return m26582w(i);
        }
        return 10;
    }

    /* renamed from: m */
    public static int m26572m(int i, long j) {
        return m26584y(j) + m26580u(i);
    }

    /* renamed from: n */
    public static int m26573n(C16541x xVar) {
        int size = xVar.f36713b != null ? xVar.f36713b.size() : xVar.f36712a != null ? xVar.f36712a.mo58524b() : 0;
        return m26582w(size) + size;
    }

    /* renamed from: o */
    public static int m26574o(int i) {
        return m26580u(i) + 4;
    }

    /* renamed from: p */
    public static int m26575p(int i) {
        return m26580u(i) + 8;
    }

    /* renamed from: q */
    public static int m26576q(int i, int i2) {
        return m26582w((i2 >> 31) ^ (i2 << 1)) + m26580u(i);
    }

    /* renamed from: r */
    public static int m26577r(int i, long j) {
        return m26584y((j >> 63) ^ (j << 1)) + m26580u(i);
    }

    /* renamed from: s */
    public static int m26578s(int i, String str) {
        return m26579t(str) + m26580u(i);
    }

    /* renamed from: t */
    public static int m26579t(String str) {
        int i;
        try {
            i = Utf8.m26665c(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C16531v.f36704a).length;
        }
        return m26582w(i) + i;
    }

    /* renamed from: u */
    public static int m26580u(int i) {
        return m26582w((i << 3) | 0);
    }

    /* renamed from: v */
    public static int m26581v(int i, int i2) {
        return m26582w(i2) + m26580u(i);
    }

    /* renamed from: w */
    public static int m26582w(int i) {
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
    public static int m26583x(int i, long j) {
        return m26584y(j) + m26580u(i);
    }

    /* renamed from: y */
    public static int m26584y(long j) {
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
    public abstract void mo58490A(int i, boolean z) throws IOException;

    /* renamed from: B */
    public abstract void mo58491B(int i, ByteString byteString) throws IOException;

    /* renamed from: C */
    public abstract void mo58492C(int i, int i2) throws IOException;

    /* renamed from: D */
    public abstract void mo58493D(int i) throws IOException;

    /* renamed from: E */
    public abstract void mo58494E(int i, long j) throws IOException;

    /* renamed from: F */
    public abstract void mo58495F(long j) throws IOException;

    /* renamed from: G */
    public abstract void mo58496G(int i, int i2) throws IOException;

    /* renamed from: H */
    public abstract void mo58497H(int i) throws IOException;

    /* renamed from: I */
    public abstract void mo58498I(int i, C16503j0 j0Var, C16542x0 x0Var) throws IOException;

    /* renamed from: J */
    public abstract void mo58499J(int i, C16503j0 j0Var) throws IOException;

    /* renamed from: K */
    public abstract void mo58500K(int i, ByteString byteString) throws IOException;

    /* renamed from: L */
    public abstract void mo58501L(int i, String str) throws IOException;

    /* renamed from: M */
    public abstract void mo58502M(int i, int i2) throws IOException;

    /* renamed from: N */
    public abstract void mo58503N(int i, int i2) throws IOException;

    /* renamed from: O */
    public abstract void mo58504O(int i) throws IOException;

    /* renamed from: P */
    public abstract void mo58505P(int i, long j) throws IOException;

    /* renamed from: Q */
    public abstract void mo58506Q(long j) throws IOException;

    /* renamed from: z */
    public abstract void mo58507z(byte b) throws IOException;

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
