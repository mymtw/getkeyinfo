package p179m5;

import androidx.work.C3436p;

/* renamed from: m5.d */
public final class C7332d extends C7329a {

    /* renamed from: n */
    public static final int[] f16270n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d */
    public int f16271d;

    /* renamed from: e */
    public int f16272e;

    /* renamed from: f */
    public int f16273f;

    /* renamed from: g */
    public int f16274g;

    /* renamed from: h */
    public int f16275h;

    /* renamed from: i */
    public int f16276i;

    /* renamed from: j */
    public int f16277j;

    /* renamed from: k */
    public int f16278k;

    /* renamed from: l */
    public int[] f16279l = new int[64];

    /* renamed from: m */
    public int f16280m;

    public C7332d() {
        mo19605g();
    }

    /* renamed from: a */
    public final String mo19523a() {
        return "SHA-224";
    }

    /* renamed from: b */
    public final int mo19524b() {
        return 28;
    }

    /* renamed from: c */
    public final int mo19526c(byte[] bArr) {
        mo19606h();
        C3436p.m8242d(this.f16271d, 0, bArr);
        C3436p.m8242d(this.f16272e, 4, bArr);
        C3436p.m8242d(this.f16273f, 8, bArr);
        C3436p.m8242d(this.f16274g, 12, bArr);
        C3436p.m8242d(this.f16275h, 16, bArr);
        C3436p.m8242d(this.f16276i, 20, bArr);
        C3436p.m8242d(this.f16277j, 24, bArr);
        mo19605g();
        return 28;
    }

    /* renamed from: e */
    public final void mo19603e(long j) {
        if (this.f16280m > 14) {
            mo19607i();
        }
        int[] iArr = this.f16279l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    /* renamed from: f */
    public final void mo19604f(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.f16279l;
        int i5 = this.f16280m;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.f16280m = i6;
        if (i6 == 16) {
            mo19607i();
        }
    }

    /* renamed from: g */
    public final void mo19605g() {
        super.mo19605g();
        this.f16271d = -1056596264;
        this.f16272e = 914150663;
        this.f16273f = 812702999;
        this.f16274g = -150054599;
        this.f16275h = -4191439;
        this.f16276i = 1750603025;
        this.f16277j = 1694076839;
        this.f16278k = -1090891868;
        this.f16280m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f16279l;
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
            int[] iArr = this.f16279l;
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int i5 = this.f16271d;
        int i6 = this.f16272e;
        int i7 = this.f16273f;
        int i8 = this.f16274g;
        int i9 = this.f16275h;
        int i10 = this.f16276i;
        int i11 = this.f16277j;
        int i12 = this.f16278k;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int k = mo19613k(i9) + ((i10 & i9) ^ ((~i9) & i11));
            int[] iArr2 = f16270n;
            int i15 = k + iArr2[i14] + this.f16279l[i14] + i12;
            int i16 = i8 + i15;
            int l = mo19614l(i5, i6, i7) + mo19612j(i5) + i15;
            int i17 = i14 + 1;
            int k2 = mo19613k(i16) + (((~i16) & i10) ^ (i9 & i16)) + iArr2[i17] + this.f16279l[i17] + i11;
            int i18 = i7 + k2;
            int l2 = mo19614l(l, i5, i6) + mo19612j(l) + k2;
            int i19 = i17 + 1;
            int k3 = mo19613k(i18) + ((i16 & i18) ^ ((~i18) & i9)) + iArr2[i19] + this.f16279l[i19] + i10;
            int i20 = i6 + k3;
            int l3 = mo19614l(l2, l, i5) + mo19612j(l2) + k3;
            int i21 = i19 + 1;
            int k4 = mo19613k(i20) + ((i18 & i20) ^ ((~i20) & i16)) + iArr2[i21] + this.f16279l[i21] + i9;
            int i22 = i5 + k4;
            int l4 = mo19614l(l3, l2, l) + mo19612j(l3) + k4;
            int i23 = i21 + 1;
            int k5 = mo19613k(i22) + ((i20 & i22) ^ ((~i22) & i18)) + iArr2[i23] + this.f16279l[i23] + i16;
            int i24 = l + k5;
            int l5 = k5 + mo19614l(l4, l3, l2) + mo19612j(l4);
            int i25 = i23 + 1;
            int k6 = mo19613k(i24) + ((i22 & i24) ^ ((~i24) & i20)) + iArr2[i25] + this.f16279l[i25] + i18;
            i11 = l2 + k6;
            i7 = mo19614l(l5, l4, l3) + mo19612j(l5) + k6;
            int i26 = i25 + 1;
            int k7 = mo19613k(i11) + ((i24 & i11) ^ ((~i11) & i22)) + iArr2[i26] + this.f16279l[i26] + i20;
            int i27 = l3 + k7;
            int l6 = k7 + mo19614l(i7, l5, l4) + mo19612j(i7);
            int i28 = i26 + 1;
            int k8 = mo19613k(i27) + ((i11 & i27) ^ ((~i27) & i24)) + iArr2[i28] + this.f16279l[i28] + i22;
            int i29 = l4 + k8;
            int l7 = mo19614l(l6, i7, l5) + mo19612j(l6) + k8;
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
        this.f16271d += i5;
        this.f16272e += i6;
        this.f16273f += i7;
        this.f16274g += i8;
        this.f16275h += i9;
        this.f16276i += i10;
        this.f16277j += i11;
        this.f16278k += i12;
        this.f16280m = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.f16279l[i31] = 0;
        }
    }

    /* renamed from: j */
    public final int mo19612j(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    /* renamed from: k */
    public final int mo19613k(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    /* renamed from: l */
    public final int mo19614l(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }
}
