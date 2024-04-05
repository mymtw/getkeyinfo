package p179m5;

import androidx.work.C3436p;

/* renamed from: m5.e */
public final class C7333e extends C7329a {

    /* renamed from: n */
    public static final int[] f16281n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f16282d;

    /* renamed from: e */
    public int f16283e;

    /* renamed from: f */
    public int f16284f;

    /* renamed from: g */
    public int f16285g;

    /* renamed from: h */
    public int f16286h;

    /* renamed from: i */
    public int f16287i;

    /* renamed from: j */
    public int f16288j;

    /* renamed from: k */
    public int f16289k;

    /* renamed from: l */
    public int[] f16290l = new int[64];

    /* renamed from: m */
    public int f16291m;

    public C7333e() {
        mo19605g();
    }

    /* renamed from: a */
    public final String mo19523a() {
        return "SHA-256";
    }

    /* renamed from: b */
    public final int mo19524b() {
        return 32;
    }

    /* renamed from: c */
    public final int mo19526c(byte[] bArr) {
        mo19606h();
        C3436p.m8242d(this.f16282d, 0, bArr);
        C3436p.m8242d(this.f16283e, 4, bArr);
        C3436p.m8242d(this.f16284f, 8, bArr);
        C3436p.m8242d(this.f16285g, 12, bArr);
        C3436p.m8242d(this.f16286h, 16, bArr);
        C3436p.m8242d(this.f16287i, 20, bArr);
        C3436p.m8242d(this.f16288j, 24, bArr);
        C3436p.m8242d(this.f16289k, 28, bArr);
        mo19605g();
        return 32;
    }

    /* renamed from: e */
    public final void mo19603e(long j) {
        if (this.f16291m > 14) {
            mo19607i();
        }
        int[] iArr = this.f16290l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: f */
    public final void mo19604f(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f16290l;
        int i5 = this.f16291m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f16291m = i6;
        if (i6 == 16) {
            mo19607i();
        }
    }

    /* renamed from: g */
    public final void mo19605g() {
        super.mo19605g();
        this.f16282d = 1779033703;
        this.f16283e = -1150833019;
        this.f16284f = 1013904242;
        this.f16285g = -1521486534;
        this.f16286h = 1359893119;
        this.f16287i = -1694144372;
        this.f16288j = 528734635;
        this.f16289k = 1541459225;
        this.f16291m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f16290l;
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
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f16290l;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.f16282d;
        int i6 = this.f16283e;
        int i7 = this.f16284f;
        int i8 = this.f16285g;
        int i9 = this.f16286h;
        int i10 = this.f16287i;
        int i11 = this.f16288j;
        int i12 = this.f16289k;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int k = mo19616k(i9) + ((i10 & i9) ^ ((~i9) & i11));
            int[] iArr2 = f16281n;
            int i15 = k + iArr2[i14] + this.f16290l[i14] + i12;
            int i16 = i8 + i15;
            int l = mo19617l(i5, i6, i7) + mo19615j(i5) + i15;
            int i17 = i14 + 1;
            int k2 = mo19616k(i16) + (((~i16) & i10) ^ (i9 & i16)) + iArr2[i17] + this.f16290l[i17] + i11;
            int i18 = i7 + k2;
            int l2 = mo19617l(l, i5, i6) + mo19615j(l) + k2;
            int i19 = i17 + 1;
            int k3 = mo19616k(i18) + ((i16 & i18) ^ ((~i18) & i9)) + iArr2[i19] + this.f16290l[i19] + i10;
            int i20 = i6 + k3;
            int l3 = mo19617l(l2, l, i5) + mo19615j(l2) + k3;
            int i21 = i19 + 1;
            int k4 = mo19616k(i20) + ((i18 & i20) ^ ((~i20) & i16)) + iArr2[i21] + this.f16290l[i21] + i9;
            int i22 = i5 + k4;
            int l4 = mo19617l(l3, l2, l) + mo19615j(l3) + k4;
            int i23 = i21 + 1;
            int k5 = mo19616k(i22) + ((i20 & i22) ^ ((~i22) & i18)) + iArr2[i23] + this.f16290l[i23] + i16;
            int i24 = l + k5;
            int l5 = k5 + mo19617l(l4, l3, l2) + mo19615j(l4);
            int i25 = i23 + 1;
            int k6 = mo19616k(i24) + ((i22 & i24) ^ ((~i24) & i20)) + iArr2[i25] + this.f16290l[i25] + i18;
            i11 = l2 + k6;
            i7 = mo19617l(l5, l4, l3) + mo19615j(l5) + k6;
            int i26 = i25 + 1;
            int k7 = mo19616k(i11) + ((i24 & i11) ^ ((~i11) & i22)) + iArr2[i26] + this.f16290l[i26] + i20;
            int i27 = l3 + k7;
            int l6 = k7 + mo19617l(i7, l5, l4) + mo19615j(i7);
            int i28 = i26 + 1;
            int k8 = mo19616k(i27) + ((i11 & i27) ^ ((~i27) & i24)) + iArr2[i28] + this.f16290l[i28] + i22;
            int i29 = l4 + k8;
            int l7 = mo19617l(l6, i7, l5) + mo19615j(l6) + k8;
            i14 = i28 + 1;
            i13++;
            i12 = i24;
            i8 = l5;
            int i30 = l6;
            i9 = i29;
            i5 = l7;
            i10 = i27;
            i6 = i30;
        }
        this.f16282d += i5;
        this.f16283e += i6;
        this.f16284f += i7;
        this.f16285g += i8;
        this.f16286h += i9;
        this.f16287i += i10;
        this.f16288j += i11;
        this.f16289k += i12;
        this.f16291m = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.f16290l[i31] = 0;
        }
    }

    /* renamed from: j */
    public final int mo19615j(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: k */
    public final int mo19616k(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: l */
    public final int mo19617l(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }
}
