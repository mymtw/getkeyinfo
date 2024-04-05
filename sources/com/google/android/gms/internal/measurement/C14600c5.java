package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
public final class C14600c5 extends C14613d5 {

    /* renamed from: d */
    public final byte[] f32785d;

    /* renamed from: e */
    public final int f32786e;

    /* renamed from: f */
    public int f32787f;

    public C14600c5(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f32785d = bArr;
            this.f32787f = 0;
            this.f32786e = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    /* renamed from: c */
    public final void mo50407c(byte b) throws IOException {
        try {
            byte[] bArr = this.f32785d;
            int i = this.f32787f;
            this.f32787f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), 1}), e);
        }
    }

    /* renamed from: d */
    public final void mo50408d(int i, boolean z) throws IOException {
        mo50419o(i << 3);
        mo50407c(z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    public final void mo50409e(int i, zzix zzix) throws IOException {
        mo50419o((i << 3) | 2);
        mo50419o(zzix.zzd());
        zzix.zzh(this);
    }

    /* renamed from: f */
    public final void mo50410f(int i, int i2) throws IOException {
        mo50419o((i << 3) | 5);
        mo50411g(i2);
    }

    /* renamed from: g */
    public final void mo50411g(int i) throws IOException {
        try {
            byte[] bArr = this.f32785d;
            int i2 = this.f32787f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f32787f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), 1}), e);
        }
    }

    /* renamed from: h */
    public final void mo50412h(int i, long j) throws IOException {
        mo50419o((i << 3) | 1);
        mo50413i(j);
    }

    /* renamed from: i */
    public final void mo50413i(long j) throws IOException {
        try {
            byte[] bArr = this.f32785d;
            int i = this.f32787f;
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
            this.f32787f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), 1}), e);
        }
    }

    /* renamed from: j */
    public final void mo50414j(int i, int i2) throws IOException {
        mo50419o(i << 3);
        mo50415k(i2);
    }

    /* renamed from: k */
    public final void mo50415k(int i) throws IOException {
        if (i >= 0) {
            mo50419o(i);
        } else {
            mo50421q((long) i);
        }
    }

    /* renamed from: l */
    public final void mo50416l(int i, String str) throws IOException {
        mo50419o((i << 3) | 2);
        int i2 = this.f32787f;
        try {
            int a = C14613d5.m23437a(str.length() * 3);
            int a2 = C14613d5.m23437a(str.length());
            if (a2 == a) {
                int i3 = i2 + a2;
                this.f32787f = i3;
                int b = C14881y7.m24178b(str, this.f32785d, i3, this.f32786e - i3);
                this.f32787f = i2;
                mo50419o((b - i2) - a2);
                this.f32787f = b;
                return;
            }
            mo50419o(C14881y7.m24179c(str));
            byte[] bArr = this.f32785d;
            int i4 = this.f32787f;
            this.f32787f = C14881y7.m24178b(str, bArr, i4, this.f32786e - i4);
        } catch (zzmp e) {
            this.f32787f = i2;
            C14613d5.f32804b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C14575a6.f32740a);
            try {
                int length = bytes.length;
                mo50419o(length);
                mo50422v(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzjd(e2);
            } catch (zzjd e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjd(e4);
        }
    }

    /* renamed from: m */
    public final void mo50417m(int i, int i2) throws IOException {
        mo50419o((i << 3) | i2);
    }

    /* renamed from: n */
    public final void mo50418n(int i, int i2) throws IOException {
        mo50419o(i << 3);
        mo50419o(i2);
    }

    /* renamed from: o */
    public final void mo50419o(int i) throws IOException {
        if (C14613d5.f32805c) {
            int i2 = C14842v4.f33131a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f32785d;
            int i3 = this.f32787f;
            this.f32787f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f32785d;
            int i4 = this.f32787f;
            this.f32787f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), 1}), e);
        }
    }

    /* renamed from: p */
    public final void mo50420p(int i, long j) throws IOException {
        mo50419o(i << 3);
        mo50421q(j);
    }

    /* renamed from: q */
    public final void mo50421q(long j) throws IOException {
        if (!C14613d5.f32805c || this.f32786e - this.f32787f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f32785d;
                int i = this.f32787f;
                this.f32787f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f32785d;
                int i2 = this.f32787f;
                this.f32787f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f32785d;
                int i3 = this.f32787f;
                this.f32787f = i3 + 1;
                C14869x7.f33158c.mo50929d(bArr3, C14869x7.f33161f + ((long) i3), (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f32785d;
            int i4 = this.f32787f;
            this.f32787f = i4 + 1;
            C14869x7.f33158c.mo50929d(bArr4, C14869x7.f33161f + ((long) i4), (byte) ((int) j));
        }
    }

    /* renamed from: v */
    public final void mo50422v(int i, byte[] bArr) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f32785d, this.f32787f, i);
            this.f32787f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32787f), Integer.valueOf(this.f32786e), Integer.valueOf(i)}), e);
        }
    }
}
