package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.icing.q */
public final class C14538q extends C14541r {

    /* renamed from: d */
    public final byte[] f32680d;

    /* renamed from: e */
    public final int f32681e;

    /* renamed from: f */
    public int f32682f;

    public C14538q(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f32680d = bArr;
            this.f32682f = 0;
            this.f32681e = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    /* renamed from: b */
    public final void mo49862b(int i, int i2) throws IOException {
        mo49873m((i << 3) | i2);
    }

    /* renamed from: c */
    public final void mo49863c(int i, int i2) throws IOException {
        mo49873m(i << 3);
        mo49872l(i2);
    }

    /* renamed from: d */
    public final void mo49864d(int i, int i2) throws IOException {
        mo49873m(i << 3);
        mo49873m(i2);
    }

    /* renamed from: e */
    public final void mo49865e(int i, int i2) throws IOException {
        mo49873m((i << 3) | 5);
        mo49874n(i2);
    }

    /* renamed from: f */
    public final void mo49866f(int i, long j) throws IOException {
        mo49873m(i << 3);
        mo49875o(j);
    }

    /* renamed from: g */
    public final void mo49867g(int i, long j) throws IOException {
        mo49873m((i << 3) | 1);
        mo49876p(j);
    }

    /* renamed from: h */
    public final void mo49868h(int i, boolean z) throws IOException {
        mo49873m(i << 3);
        mo49871k(z ? (byte) 1 : 0);
    }

    /* renamed from: i */
    public final void mo49869i(int i, String str) throws IOException {
        mo49873m((i << 3) | 2);
        int i2 = this.f32682f;
        try {
            int s = C14541r.m23162s(str.length() * 3);
            int s2 = C14541r.m23162s(str.length());
            if (s2 == s) {
                int i3 = i2 + s2;
                this.f32682f = i3;
                int b = C14509i2.m23047b(str, this.f32680d, i3, this.f32681e - i3);
                this.f32682f = i2;
                mo49873m((b - i2) - s2);
                this.f32682f = b;
                return;
            }
            mo49873m(C14509i2.m23046a(str));
            byte[] bArr = this.f32680d;
            int i4 = this.f32682f;
            this.f32682f = C14509i2.m23047b(str, bArr, i4, this.f32681e - i4);
        } catch (zzfq e) {
            this.f32682f = i2;
            C14541r.f32685b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C14515k0.f32655a);
            try {
                int length = bytes.length;
                mo49873m(length);
                mo49877v(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzcl(e2);
            } catch (zzcl e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzcl(e4);
        }
    }

    /* renamed from: j */
    public final void mo49870j(int i, zzcf zzcf) throws IOException {
        mo49873m((i << 3) | 2);
        mo49873m(zzcf.zzc());
        zzcf.zzf(this);
    }

    /* renamed from: k */
    public final void mo49871k(byte b) throws IOException {
        try {
            byte[] bArr = this.f32680d;
            int i = this.f32682f;
            this.f32682f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo49872l(int i) throws IOException {
        if (i >= 0) {
            mo49873m(i);
        } else {
            mo49875o((long) i);
        }
    }

    /* renamed from: m */
    public final void mo49873m(int i) throws IOException {
        if (C14541r.f32686c) {
            int i2 = C14514k.f32654a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f32680d;
            int i3 = this.f32682f;
            this.f32682f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f32680d;
            int i4 = this.f32682f;
            this.f32682f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), 1}), e);
        }
    }

    /* renamed from: n */
    public final void mo49874n(int i) throws IOException {
        try {
            byte[] bArr = this.f32680d;
            int i2 = this.f32682f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f32682f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo49875o(long j) throws IOException {
        if (!C14541r.f32686c || this.f32681e - this.f32682f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f32680d;
                int i = this.f32682f;
                this.f32682f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f32680d;
                int i2 = this.f32682f;
                this.f32682f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f32680d;
                int i3 = this.f32682f;
                this.f32682f = i3 + 1;
                C14505h2.f32644c.mo49781a(bArr3, C14505h2.f32647f + ((long) i3), (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f32680d;
            int i4 = this.f32682f;
            this.f32682f = i4 + 1;
            C14505h2.f32644c.mo49781a(bArr4, C14505h2.f32647f + ((long) i4), (byte) ((int) j));
        }
    }

    /* renamed from: p */
    public final void mo49876p(long j) throws IOException {
        try {
            byte[] bArr = this.f32680d;
            int i = this.f32682f;
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
            this.f32682f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo49877v(int i, byte[] bArr) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f32680d, this.f32682f, i);
            this.f32682f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32682f), Integer.valueOf(this.f32681e), Integer.valueOf(i)}), e);
        }
    }
}
