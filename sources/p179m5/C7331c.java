package p179m5;

import android.support.p013v4.media.C0069a;
import androidx.work.C3436p;

/* renamed from: m5.c */
public final class C7331c extends C7329a {

    /* renamed from: d */
    public int f16263d;

    /* renamed from: e */
    public int f16264e;

    /* renamed from: f */
    public int f16265f;

    /* renamed from: g */
    public int f16266g;

    /* renamed from: h */
    public int f16267h;

    /* renamed from: i */
    public int[] f16268i = new int[80];

    /* renamed from: j */
    public int f16269j;

    public C7331c() {
        mo19605g();
    }

    /* renamed from: a */
    public final String mo19523a() {
        return "SHA-1";
    }

    /* renamed from: b */
    public final int mo19524b() {
        return 20;
    }

    /* renamed from: c */
    public final int mo19526c(byte[] bArr) {
        mo19606h();
        C3436p.m8242d(this.f16263d, 0, bArr);
        C3436p.m8242d(this.f16264e, 4, bArr);
        C3436p.m8242d(this.f16265f, 8, bArr);
        C3436p.m8242d(this.f16266g, 12, bArr);
        C3436p.m8242d(this.f16267h, 16, bArr);
        mo19605g();
        return 20;
    }

    /* renamed from: e */
    public final void mo19603e(long j) {
        if (this.f16269j > 14) {
            mo19607i();
        }
        int[] iArr = this.f16268i;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    /* renamed from: f */
    public final void mo19604f(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f16268i;
        int i5 = this.f16269j;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f16269j = i6;
        if (i6 == 16) {
            mo19607i();
        }
    }

    /* renamed from: g */
    public final void mo19605g() {
        super.mo19605g();
        this.f16263d = 1732584193;
        this.f16264e = -271733879;
        this.f16265f = -1732584194;
        this.f16266g = 271733878;
        this.f16267h = -1009589776;
        this.f16269j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f16268i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo19607i() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f16268i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.f16263d;
        int i4 = this.f16264e;
        int i5 = this.f16265f;
        int i6 = this.f16266g;
        int i7 = this.f16267h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = ((i3 << 5) | (i3 >>> 27)) + ((i5 & i4) | ((~i4) & i6));
            int[] iArr2 = this.f16268i;
            int i11 = i9 + 1;
            int b = C0069a.m171b(i10, iArr2[i9], 1518500249, i7);
            int i12 = (i4 >>> 2) | (i4 << 30);
            int i13 = i11 + 1;
            int b2 = C0069a.m171b(((b << 5) | (b >>> 27)) + ((i12 & i3) | ((~i3) & i5)), iArr2[i11], 1518500249, i6);
            int i14 = (i3 >>> 2) | (i3 << 30);
            int i15 = i13 + 1;
            int b3 = C0069a.m171b(((b2 << 5) | (b2 >>> 27)) + ((i14 & b) | ((~b) & i12)), iArr2[i13], 1518500249, i5);
            i7 = (b >>> 2) | (b << 30);
            int i16 = i15 + 1;
            i4 = C0069a.m171b(((b3 << 5) | (b3 >>> 27)) + ((i7 & b2) | ((~b2) & i14)), iArr2[i15], 1518500249, i12);
            i6 = (b2 >>> 2) | (b2 << 30);
            i3 = C0069a.m171b(((i4 << 5) | (i4 >>> 27)) + ((i6 & b3) | ((~b3) & i7)), iArr2[i16], 1518500249, i14);
            i5 = (b3 >>> 2) | (b3 << 30);
            i8++;
            i9 = i16 + 1;
        }
        int i17 = 0;
        while (i17 < 4) {
            int[] iArr3 = this.f16268i;
            int i18 = i9 + 1;
            int b4 = C0069a.m171b(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr3[i9], 1859775393, i7);
            int i19 = (i4 >>> 2) | (i4 << 30);
            int i20 = i18 + 1;
            int b5 = C0069a.m171b(((b4 << 5) | (b4 >>> 27)) + ((i3 ^ i19) ^ i5), iArr3[i18], 1859775393, i6);
            int i21 = (i3 >>> 2) | (i3 << 30);
            int i22 = i20 + 1;
            int b6 = C0069a.m171b(((b5 << 5) | (b5 >>> 27)) + ((b4 ^ i21) ^ i19), iArr3[i20], 1859775393, i5);
            i7 = (b4 >>> 2) | (b4 << 30);
            int i23 = i22 + 1;
            i4 = C0069a.m171b(((b6 << 5) | (b6 >>> 27)) + ((b5 ^ i7) ^ i21), iArr3[i22], 1859775393, i19);
            i6 = (b5 >>> 2) | (b5 << 30);
            i3 = C0069a.m171b(((i4 << 5) | (i4 >>> 27)) + ((b6 ^ i6) ^ i7), iArr3[i23], 1859775393, i21);
            i5 = (b6 >>> 2) | (b6 << 30);
            i17++;
            i9 = i23 + 1;
        }
        int i24 = 0;
        while (i24 < 4) {
            int[] iArr4 = this.f16268i;
            int i25 = i9 + 1;
            int b7 = C0069a.m171b(((i4 & i5) | (i4 & i6) | (i5 & i6)) + ((i3 << 5) | (i3 >>> 27)), iArr4[i9], -1894007588, i7);
            int i26 = (i4 >>> 2) | (i4 << 30);
            int i27 = i25 + 1;
            int b8 = C0069a.m171b(((i3 & i26) | (i3 & i5) | (i26 & i5)) + ((b7 << 5) | (b7 >>> 27)), iArr4[i25], -1894007588, i6);
            int i28 = (i3 >>> 2) | (i3 << 30);
            int i29 = i27 + 1;
            int b9 = C0069a.m171b(((b7 & i28) | (b7 & i26) | (i28 & i26)) + ((b8 << 5) | (b8 >>> 27)), iArr4[i27], -1894007588, i5);
            i7 = (b7 >>> 2) | (b7 << 30);
            int i30 = i29 + 1;
            i4 = C0069a.m171b(((b8 & i7) | (b8 & i28) | (i7 & i28)) + ((b9 << 5) | (b9 >>> 27)), iArr4[i29], -1894007588, i26);
            i6 = (b8 >>> 2) | (b8 << 30);
            i3 = C0069a.m171b(((b9 & i6) | (b9 & i7) | (i6 & i7)) + ((i4 << 5) | (i4 >>> 27)), iArr4[i30], -1894007588, i28);
            i5 = (b9 >>> 2) | (b9 << 30);
            i24++;
            i9 = i30 + 1;
        }
        int i31 = 0;
        while (i31 <= 3) {
            int[] iArr5 = this.f16268i;
            int i32 = i9 + 1;
            int b10 = C0069a.m171b(((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6), iArr5[i9], -899497514, i7);
            int i33 = (i4 >>> 2) | (i4 << 30);
            int i34 = i32 + 1;
            int b11 = C0069a.m171b(((b10 << 5) | (b10 >>> 27)) + ((i3 ^ i33) ^ i5), iArr5[i32], -899497514, i6);
            int i35 = (i3 >>> 2) | (i3 << 30);
            int i36 = i34 + 1;
            int b12 = C0069a.m171b(((b11 << 5) | (b11 >>> 27)) + ((b10 ^ i35) ^ i33), iArr5[i34], -899497514, i5);
            i7 = (b10 >>> 2) | (b10 << 30);
            int i37 = i36 + 1;
            i4 = C0069a.m171b(((b12 << 5) | (b12 >>> 27)) + ((b11 ^ i7) ^ i35), iArr5[i36], -899497514, i33);
            i6 = (b11 >>> 2) | (b11 << 30);
            i3 = C0069a.m171b(((i4 << 5) | (i4 >>> 27)) + ((b12 ^ i6) ^ i7), iArr5[i37], -899497514, i35);
            i5 = (b12 >>> 2) | (b12 << 30);
            i31++;
            i9 = i37 + 1;
        }
        this.f16263d += i3;
        this.f16264e += i4;
        this.f16265f += i5;
        this.f16266g += i6;
        this.f16267h += i7;
        this.f16269j = 0;
        for (int i38 = 0; i38 < 16; i38++) {
            this.f16268i[i38] = 0;
        }
    }
}
