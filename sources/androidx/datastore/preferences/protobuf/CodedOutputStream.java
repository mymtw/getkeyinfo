package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0326j;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C2584h {

    /* renamed from: b */
    public static final Logger f5781b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c */
    public static final boolean f5782c = C2586h1.f5881f;

    /* renamed from: a */
    public C2601k f5783a;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$a */
    public static abstract class C2513a extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f5784d;

        /* renamed from: e */
        public final int f5785e;

        /* renamed from: f */
        public int f5786f;

        public C2513a(int i) {
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f5784d = bArr;
                this.f5785e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: W */
        public final void mo9438W(int i) {
            byte[] bArr = this.f5784d;
            int i2 = this.f5786f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f5786f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        /* renamed from: X */
        public final void mo9439X(long j) {
            byte[] bArr = this.f5784d;
            int i = this.f5786f;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f5786f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        /* renamed from: Y */
        public final void mo9440Y(int i, int i2) {
            mo9441Z((i << 3) | i2);
        }

        /* renamed from: Z */
        public final void mo9441Z(int i) {
            if (CodedOutputStream.f5782c) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f5784d;
                    int i2 = this.f5786f;
                    this.f5786f = i2 + 1;
                    C2586h1.m5839r(bArr, (byte) ((i & 127) | 128), (long) i2);
                    i >>>= 7;
                }
                byte[] bArr2 = this.f5784d;
                int i3 = this.f5786f;
                this.f5786f = i3 + 1;
                C2586h1.m5839r(bArr2, (byte) i, (long) i3);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f5784d;
                int i4 = this.f5786f;
                this.f5786f = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            byte[] bArr4 = this.f5784d;
            int i5 = this.f5786f;
            this.f5786f = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        /* renamed from: a0 */
        public final void mo9442a0(long j) {
            if (CodedOutputStream.f5782c) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f5784d;
                    int i = this.f5786f;
                    this.f5786f = i + 1;
                    C2586h1.m5839r(bArr, (byte) ((((int) j) & 127) | 128), (long) i);
                    j >>>= 7;
                }
                byte[] bArr2 = this.f5784d;
                int i2 = this.f5786f;
                this.f5786f = i2 + 1;
                C2586h1.m5839r(bArr2, (byte) ((int) j), (long) i2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f5784d;
                int i3 = this.f5786f;
                this.f5786f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            byte[] bArr4 = this.f5784d;
            int i4 = this.f5786f;
            this.f5786f = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$b */
    public static class C2514b extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f5787d;

        /* renamed from: e */
        public final int f5788e;

        /* renamed from: f */
        public int f5789f;

        public C2514b(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f5787d = bArr;
                this.f5789f = 0;
                this.f5788e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        /* renamed from: A */
        public final void mo9415A(byte b) throws IOException {
            try {
                byte[] bArr = this.f5787d;
                int i = this.f5789f;
                this.f5789f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), 1}), e);
            }
        }

        /* renamed from: B */
        public final void mo9416B(int i, boolean z) throws IOException {
            mo9432R(i, 0);
            mo9415A(z ? (byte) 1 : 0);
        }

        /* renamed from: C */
        public final void mo9417C(int i, byte[] bArr) throws IOException {
            mo9434T(i);
            mo9444X(bArr, 0, i);
        }

        /* renamed from: D */
        public final void mo9418D(int i, ByteString byteString) throws IOException {
            mo9432R(i, 2);
            mo9419E(byteString);
        }

        /* renamed from: E */
        public final void mo9419E(ByteString byteString) throws IOException {
            mo9434T(byteString.size());
            byteString.writeTo((C2584h) this);
        }

        /* renamed from: F */
        public final void mo9420F(int i, int i2) throws IOException {
            mo9432R(i, 5);
            mo9421G(i2);
        }

        /* renamed from: G */
        public final void mo9421G(int i) throws IOException {
            try {
                byte[] bArr = this.f5787d;
                int i2 = this.f5789f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f5789f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), 1}), e);
            }
        }

        /* renamed from: H */
        public final void mo9422H(int i, long j) throws IOException {
            mo9432R(i, 1);
            mo9423I(j);
        }

        /* renamed from: I */
        public final void mo9423I(long j) throws IOException {
            try {
                byte[] bArr = this.f5787d;
                int i = this.f5789f;
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
                this.f5789f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), 1}), e);
            }
        }

        /* renamed from: J */
        public final void mo9424J(int i, int i2) throws IOException {
            mo9432R(i, 0);
            mo9425K(i2);
        }

        /* renamed from: K */
        public final void mo9425K(int i) throws IOException {
            if (i >= 0) {
                mo9434T(i);
            } else {
                mo9436V((long) i);
            }
        }

        /* renamed from: L */
        public final void mo9426L(int i, C2602k0 k0Var, C2642y0 y0Var) throws IOException {
            mo9432R(i, 2);
            mo9434T(((C2546a) k0Var).mo9543g(y0Var));
            y0Var.mo9846h(k0Var, this.f5783a);
        }

        /* renamed from: M */
        public final void mo9427M(C2602k0 k0Var) throws IOException {
            mo9434T(k0Var.mo9461b());
            k0Var.mo9469j(this);
        }

        /* renamed from: N */
        public final void mo9428N(int i, C2602k0 k0Var) throws IOException {
            mo9432R(1, 3);
            mo9433S(2, i);
            mo9432R(3, 2);
            mo9427M(k0Var);
            mo9432R(1, 4);
        }

        /* renamed from: O */
        public final void mo9429O(int i, ByteString byteString) throws IOException {
            mo9432R(1, 3);
            mo9433S(2, i);
            mo9418D(3, byteString);
            mo9432R(1, 4);
        }

        /* renamed from: P */
        public final void mo9430P(int i, String str) throws IOException {
            mo9432R(i, 2);
            mo9431Q(str);
        }

        /* renamed from: Q */
        public final void mo9431Q(String str) throws IOException {
            int i = this.f5789f;
            try {
                int w = CodedOutputStream.m5517w(str.length() * 3);
                int w2 = CodedOutputStream.m5517w(str.length());
                if (w2 == w) {
                    int i2 = i + w2;
                    this.f5789f = i2;
                    int d = Utf8.f5815a.mo9531d(str, this.f5787d, i2, this.f5788e - i2);
                    this.f5789f = i;
                    mo9434T((d - i) - w2);
                    this.f5789f = d;
                    return;
                }
                mo9434T(Utf8.m5642c(str));
                byte[] bArr = this.f5787d;
                int i3 = this.f5789f;
                this.f5789f = Utf8.f5815a.mo9531d(str, bArr, i3, this.f5788e - i3);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f5789f = i;
                mo9437z(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: R */
        public final void mo9432R(int i, int i2) throws IOException {
            mo9434T((i << 3) | i2);
        }

        /* renamed from: S */
        public final void mo9433S(int i, int i2) throws IOException {
            mo9432R(i, 0);
            mo9434T(i2);
        }

        /* renamed from: T */
        public final void mo9434T(int i) throws IOException {
            if (CodedOutputStream.f5782c && !C2566d.m5712a()) {
                int i2 = this.f5788e;
                int i3 = this.f5789f;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f5787d;
                        this.f5789f = i3 + 1;
                        C2586h1.m5839r(bArr, (byte) i, (long) i3);
                        return;
                    }
                    byte[] bArr2 = this.f5787d;
                    this.f5789f = i3 + 1;
                    C2586h1.m5839r(bArr2, (byte) (i | 128), (long) i3);
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.f5787d;
                        int i5 = this.f5789f;
                        this.f5789f = i5 + 1;
                        C2586h1.m5839r(bArr3, (byte) i4, (long) i5);
                        return;
                    }
                    byte[] bArr4 = this.f5787d;
                    int i6 = this.f5789f;
                    this.f5789f = i6 + 1;
                    C2586h1.m5839r(bArr4, (byte) (i4 | 128), (long) i6);
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.f5787d;
                        int i8 = this.f5789f;
                        this.f5789f = i8 + 1;
                        C2586h1.m5839r(bArr5, (byte) i7, (long) i8);
                        return;
                    }
                    byte[] bArr6 = this.f5787d;
                    int i9 = this.f5789f;
                    this.f5789f = i9 + 1;
                    C2586h1.m5839r(bArr6, (byte) (i7 | 128), (long) i9);
                    int i10 = i7 >>> 7;
                    if ((i10 & -128) == 0) {
                        byte[] bArr7 = this.f5787d;
                        int i11 = this.f5789f;
                        this.f5789f = i11 + 1;
                        C2586h1.m5839r(bArr7, (byte) i10, (long) i11);
                        return;
                    }
                    byte[] bArr8 = this.f5787d;
                    int i12 = this.f5789f;
                    this.f5789f = i12 + 1;
                    C2586h1.m5839r(bArr8, (byte) (i10 | 128), (long) i12);
                    byte[] bArr9 = this.f5787d;
                    int i13 = this.f5789f;
                    this.f5789f = i13 + 1;
                    C2586h1.m5839r(bArr9, (byte) (i10 >>> 7), (long) i13);
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f5787d;
                int i14 = this.f5789f;
                this.f5789f = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f5787d;
                int i15 = this.f5789f;
                this.f5789f = i15 + 1;
                bArr11[i15] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), 1}), e);
            }
        }

        /* renamed from: U */
        public final void mo9435U(int i, long j) throws IOException {
            mo9432R(i, 0);
            mo9436V(j);
        }

        /* renamed from: V */
        public final void mo9436V(long j) throws IOException {
            if (!CodedOutputStream.f5782c || this.f5788e - this.f5789f < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f5787d;
                    int i = this.f5789f;
                    this.f5789f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f5787d;
                    int i2 = this.f5789f;
                    this.f5789f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f5787d;
                    int i3 = this.f5789f;
                    this.f5789f = i3 + 1;
                    C2586h1.m5839r(bArr3, (byte) ((((int) j) & 127) | 128), (long) i3);
                    j >>>= 7;
                }
                byte[] bArr4 = this.f5787d;
                int i4 = this.f5789f;
                this.f5789f = i4 + 1;
                C2586h1.m5839r(bArr4, (byte) ((int) j), (long) i4);
            }
        }

        /* renamed from: W */
        public final int mo9443W() {
            return this.f5788e - this.f5789f;
        }

        /* renamed from: X */
        public final void mo9444X(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f5787d, this.f5789f, i2);
                this.f5789f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo9445a(int i, int i2, byte[] bArr) throws IOException {
            mo9444X(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo9446b(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f5787d, this.f5789f, remaining);
                this.f5789f += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5789f), Integer.valueOf(this.f5788e), Integer.valueOf(remaining)}), e);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$c */
    public static final class C2515c extends C2513a {

        /* renamed from: g */
        public final OutputStream f5790g;

        public C2515c(SingleProcessDataStore.C2470b bVar, int i) {
            super(i);
            this.f5790g = bVar;
        }

        /* renamed from: A */
        public final void mo9415A(byte b) throws IOException {
            if (this.f5786f == this.f5785e) {
                mo9447b0();
            }
            byte[] bArr = this.f5784d;
            int i = this.f5786f;
            this.f5786f = i + 1;
            bArr[i] = b;
        }

        /* renamed from: B */
        public final void mo9416B(int i, boolean z) throws IOException {
            mo9448c0(11);
            mo9440Y(i, 0);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = this.f5784d;
            int i2 = this.f5786f;
            this.f5786f = i2 + 1;
            bArr[i2] = b;
        }

        /* renamed from: C */
        public final void mo9417C(int i, byte[] bArr) throws IOException {
            mo9434T(i);
            mo9449d0(bArr, 0, i);
        }

        /* renamed from: D */
        public final void mo9418D(int i, ByteString byteString) throws IOException {
            mo9432R(i, 2);
            mo9419E(byteString);
        }

        /* renamed from: E */
        public final void mo9419E(ByteString byteString) throws IOException {
            mo9434T(byteString.size());
            byteString.writeTo((C2584h) this);
        }

        /* renamed from: F */
        public final void mo9420F(int i, int i2) throws IOException {
            mo9448c0(14);
            mo9440Y(i, 5);
            mo9438W(i2);
        }

        /* renamed from: G */
        public final void mo9421G(int i) throws IOException {
            mo9448c0(4);
            mo9438W(i);
        }

        /* renamed from: H */
        public final void mo9422H(int i, long j) throws IOException {
            mo9448c0(18);
            mo9440Y(i, 1);
            mo9439X(j);
        }

        /* renamed from: I */
        public final void mo9423I(long j) throws IOException {
            mo9448c0(8);
            mo9439X(j);
        }

        /* renamed from: J */
        public final void mo9424J(int i, int i2) throws IOException {
            mo9448c0(20);
            mo9440Y(i, 0);
            if (i2 >= 0) {
                mo9441Z(i2);
            } else {
                mo9442a0((long) i2);
            }
        }

        /* renamed from: K */
        public final void mo9425K(int i) throws IOException {
            if (i >= 0) {
                mo9434T(i);
            } else {
                mo9436V((long) i);
            }
        }

        /* renamed from: L */
        public final void mo9426L(int i, C2602k0 k0Var, C2642y0 y0Var) throws IOException {
            mo9432R(i, 2);
            mo9434T(((C2546a) k0Var).mo9543g(y0Var));
            y0Var.mo9846h(k0Var, this.f5783a);
        }

        /* renamed from: M */
        public final void mo9427M(C2602k0 k0Var) throws IOException {
            mo9434T(k0Var.mo9461b());
            k0Var.mo9469j(this);
        }

        /* renamed from: N */
        public final void mo9428N(int i, C2602k0 k0Var) throws IOException {
            mo9432R(1, 3);
            mo9433S(2, i);
            mo9432R(3, 2);
            mo9427M(k0Var);
            mo9432R(1, 4);
        }

        /* renamed from: O */
        public final void mo9429O(int i, ByteString byteString) throws IOException {
            mo9432R(1, 3);
            mo9433S(2, i);
            mo9418D(3, byteString);
            mo9432R(1, 4);
        }

        /* renamed from: P */
        public final void mo9430P(int i, String str) throws IOException {
            mo9432R(i, 2);
            mo9431Q(str);
        }

        /* renamed from: Q */
        public final void mo9431Q(String str) throws IOException {
            int i;
            try {
                int length = str.length() * 3;
                int w = CodedOutputStream.m5517w(length);
                int i2 = w + length;
                int i3 = this.f5785e;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int d = Utf8.f5815a.mo9531d(str, bArr, 0, length);
                    mo9434T(d);
                    mo9449d0(bArr, 0, d);
                    return;
                }
                if (i2 > i3 - this.f5786f) {
                    mo9447b0();
                }
                int w2 = CodedOutputStream.m5517w(str.length());
                i = this.f5786f;
                if (w2 == w) {
                    int i4 = i + w2;
                    this.f5786f = i4;
                    int d2 = Utf8.f5815a.mo9531d(str, this.f5784d, i4, this.f5785e - i4);
                    this.f5786f = i;
                    mo9441Z((d2 - i) - w2);
                    this.f5786f = d2;
                    return;
                }
                int c = Utf8.m5642c(str);
                mo9441Z(c);
                this.f5786f = Utf8.f5815a.mo9531d(str, this.f5784d, this.f5786f, c);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f5786f = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (Utf8.UnpairedSurrogateException e3) {
                mo9437z(str, e3);
            }
        }

        /* renamed from: R */
        public final void mo9432R(int i, int i2) throws IOException {
            mo9434T((i << 3) | i2);
        }

        /* renamed from: S */
        public final void mo9433S(int i, int i2) throws IOException {
            mo9448c0(20);
            mo9440Y(i, 0);
            mo9441Z(i2);
        }

        /* renamed from: T */
        public final void mo9434T(int i) throws IOException {
            mo9448c0(5);
            mo9441Z(i);
        }

        /* renamed from: U */
        public final void mo9435U(int i, long j) throws IOException {
            mo9448c0(20);
            mo9440Y(i, 0);
            mo9442a0(j);
        }

        /* renamed from: V */
        public final void mo9436V(long j) throws IOException {
            mo9448c0(10);
            mo9442a0(j);
        }

        /* renamed from: a */
        public final void mo9445a(int i, int i2, byte[] bArr) throws IOException {
            mo9449d0(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo9446b(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f5785e;
            int i2 = this.f5786f;
            int i3 = i - i2;
            if (i3 >= remaining) {
                byteBuffer.get(this.f5784d, i2, remaining);
                this.f5786f += remaining;
                return;
            }
            byteBuffer.get(this.f5784d, i2, i3);
            int i4 = remaining - i3;
            this.f5786f = this.f5785e;
            mo9447b0();
            while (true) {
                int i5 = this.f5785e;
                if (i4 > i5) {
                    byteBuffer.get(this.f5784d, 0, i5);
                    this.f5790g.write(this.f5784d, 0, this.f5785e);
                    i4 -= this.f5785e;
                } else {
                    byteBuffer.get(this.f5784d, 0, i4);
                    this.f5786f = i4;
                    return;
                }
            }
        }

        /* renamed from: b0 */
        public final void mo9447b0() throws IOException {
            this.f5790g.write(this.f5784d, 0, this.f5786f);
            this.f5786f = 0;
        }

        /* renamed from: c0 */
        public final void mo9448c0(int i) throws IOException {
            if (this.f5785e - this.f5786f < i) {
                mo9447b0();
            }
        }

        /* renamed from: d0 */
        public final void mo9449d0(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f5785e;
            int i4 = this.f5786f;
            int i5 = i3 - i4;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, this.f5784d, i4, i2);
                this.f5786f += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f5784d, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f5786f = this.f5785e;
            mo9447b0();
            if (i7 <= this.f5785e) {
                System.arraycopy(bArr, i6, this.f5784d, 0, i7);
                this.f5786f = i7;
                return;
            }
            this.f5790g.write(bArr, i6, i7);
        }
    }

    /* renamed from: c */
    public static int m5497c(int i) {
        return m5515u(i) + 1;
    }

    /* renamed from: d */
    public static int m5498d(int i, ByteString byteString) {
        int u = m5515u(i);
        int size = byteString.size();
        return m5517w(size) + size + u;
    }

    /* renamed from: e */
    public static int m5499e(int i) {
        return m5515u(i) + 8;
    }

    /* renamed from: f */
    public static int m5500f(int i, int i2) {
        return m5506l(i2) + m5515u(i);
    }

    /* renamed from: g */
    public static int m5501g(int i) {
        return m5515u(i) + 4;
    }

    /* renamed from: h */
    public static int m5502h(int i) {
        return m5515u(i) + 8;
    }

    /* renamed from: i */
    public static int m5503i(int i) {
        return m5515u(i) + 4;
    }

    @Deprecated
    /* renamed from: j */
    public static int m5504j(int i, C2602k0 k0Var, C2642y0 y0Var) {
        return ((C2546a) k0Var).mo9543g(y0Var) + (m5515u(i) * 2);
    }

    /* renamed from: k */
    public static int m5505k(int i, int i2) {
        return m5506l(i2) + m5515u(i);
    }

    /* renamed from: l */
    public static int m5506l(int i) {
        if (i >= 0) {
            return m5517w(i);
        }
        return 10;
    }

    /* renamed from: m */
    public static int m5507m(int i, long j) {
        return m5519y(j) + m5515u(i);
    }

    /* renamed from: n */
    public static int m5508n(C2641y yVar) {
        int size = yVar.f5982b != null ? yVar.f5982b.size() : yVar.f5981a != null ? yVar.f5981a.mo9461b() : 0;
        return m5517w(size) + size;
    }

    /* renamed from: o */
    public static int m5509o(int i) {
        return m5515u(i) + 4;
    }

    /* renamed from: p */
    public static int m5510p(int i) {
        return m5515u(i) + 8;
    }

    /* renamed from: q */
    public static int m5511q(int i, int i2) {
        return m5517w((i2 >> 31) ^ (i2 << 1)) + m5515u(i);
    }

    /* renamed from: r */
    public static int m5512r(int i, long j) {
        return m5519y((j >> 63) ^ (j << 1)) + m5515u(i);
    }

    /* renamed from: s */
    public static int m5513s(int i, String str) {
        return m5514t(str) + m5515u(i);
    }

    /* renamed from: t */
    public static int m5514t(String str) {
        int i;
        try {
            i = Utf8.m5642c(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C2631w.f5973a).length;
        }
        return m5517w(i) + i;
    }

    /* renamed from: u */
    public static int m5515u(int i) {
        return m5517w((i << 3) | 0);
    }

    /* renamed from: v */
    public static int m5516v(int i, int i2) {
        return m5517w(i2) + m5515u(i);
    }

    /* renamed from: w */
    public static int m5517w(int i) {
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
    public static int m5518x(int i, long j) {
        return m5519y(j) + m5515u(i);
    }

    /* renamed from: y */
    public static int m5519y(long j) {
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
    public abstract void mo9415A(byte b) throws IOException;

    /* renamed from: B */
    public abstract void mo9416B(int i, boolean z) throws IOException;

    /* renamed from: C */
    public abstract void mo9417C(int i, byte[] bArr) throws IOException;

    /* renamed from: D */
    public abstract void mo9418D(int i, ByteString byteString) throws IOException;

    /* renamed from: E */
    public abstract void mo9419E(ByteString byteString) throws IOException;

    /* renamed from: F */
    public abstract void mo9420F(int i, int i2) throws IOException;

    /* renamed from: G */
    public abstract void mo9421G(int i) throws IOException;

    /* renamed from: H */
    public abstract void mo9422H(int i, long j) throws IOException;

    /* renamed from: I */
    public abstract void mo9423I(long j) throws IOException;

    /* renamed from: J */
    public abstract void mo9424J(int i, int i2) throws IOException;

    /* renamed from: K */
    public abstract void mo9425K(int i) throws IOException;

    /* renamed from: L */
    public abstract void mo9426L(int i, C2602k0 k0Var, C2642y0 y0Var) throws IOException;

    /* renamed from: M */
    public abstract void mo9427M(C2602k0 k0Var) throws IOException;

    /* renamed from: N */
    public abstract void mo9428N(int i, C2602k0 k0Var) throws IOException;

    /* renamed from: O */
    public abstract void mo9429O(int i, ByteString byteString) throws IOException;

    /* renamed from: P */
    public abstract void mo9430P(int i, String str) throws IOException;

    /* renamed from: Q */
    public abstract void mo9431Q(String str) throws IOException;

    /* renamed from: R */
    public abstract void mo9432R(int i, int i2) throws IOException;

    /* renamed from: S */
    public abstract void mo9433S(int i, int i2) throws IOException;

    /* renamed from: T */
    public abstract void mo9434T(int i) throws IOException;

    /* renamed from: U */
    public abstract void mo9435U(int i, long j) throws IOException;

    /* renamed from: V */
    public abstract void mo9436V(long j) throws IOException;

    /* renamed from: z */
    public final void mo9437z(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f5781b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(C2631w.f5973a);
        try {
            mo9434T(bytes.length);
            mo9445a(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

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
