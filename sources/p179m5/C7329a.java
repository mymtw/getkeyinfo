package p179m5;

import p169l5.C7267c;

/* renamed from: m5.a */
public abstract class C7329a implements C7267c {

    /* renamed from: a */
    public final byte[] f16245a = new byte[4];

    /* renamed from: b */
    public int f16246b = 0;

    /* renamed from: c */
    public long f16247c;

    /* renamed from: b */
    public final void mo19525b(byte[] bArr, int i) {
        int i2;
        int max = Math.max(0, i);
        if (this.f16246b != 0) {
            i2 = 0;
            while (true) {
                if (i2 >= max) {
                    break;
                }
                byte[] bArr2 = this.f16245a;
                int i3 = this.f16246b;
                int i4 = i3 + 1;
                this.f16246b = i4;
                int i5 = i2 + 1;
                bArr2[i3] = bArr[i2 + 0];
                if (i4 == 4) {
                    mo19604f(0, bArr2);
                    this.f16246b = 0;
                    i2 = i5;
                    break;
                }
                i2 = i5;
            }
        } else {
            i2 = 0;
        }
        int i6 = ((max - i2) & -4) + i2;
        while (i2 < i6) {
            mo19604f(0 + i2, bArr);
            i2 += 4;
        }
        while (i2 < max) {
            byte[] bArr3 = this.f16245a;
            int i7 = this.f16246b;
            this.f16246b = i7 + 1;
            bArr3[i7] = bArr[i2 + 0];
            i2++;
        }
        this.f16247c += (long) max;
    }

    /* renamed from: d */
    public final void mo19602d(byte b) {
        byte[] bArr = this.f16245a;
        int i = this.f16246b;
        int i2 = i + 1;
        this.f16246b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            mo19604f(0, bArr);
            this.f16246b = 0;
        }
        this.f16247c++;
    }

    /* renamed from: e */
    public abstract void mo19603e(long j);

    /* renamed from: f */
    public abstract void mo19604f(int i, byte[] bArr);

    /* renamed from: g */
    public void mo19605g() {
        this.f16247c = 0;
        this.f16246b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f16245a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo19606h() {
        long j = this.f16247c << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo19602d(b);
            if (this.f16246b != 0) {
                b = 0;
            } else {
                mo19603e(j);
                mo19607i();
                return;
            }
        }
    }

    /* renamed from: i */
    public abstract void mo19607i();
}
