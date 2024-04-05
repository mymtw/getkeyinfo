package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import java.util.Random;
import p209p6.C7681d;
import p267v7.C8212a;
import p383ke.C12995a;

/* renamed from: s6.c */
public final class C7830c extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17293g = C7826b.f17288j;

    /* renamed from: f */
    public int[] f17294f;

    public C7830c() {
        this.f17294f = new int[7];
    }

    public C7830c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17293g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] s = C2606m.m6153s(bigInteger);
        if (s[6] == -1) {
            int[] iArr = C12995a.f28607c;
            if (C2606m.m6122Q(s, iArr)) {
                long j = ((((long) s[0]) & UnsignedInteger.INT_MASK) - (((long) iArr[0]) & UnsignedInteger.INT_MASK)) + 0;
                s[0] = (int) j;
                long j2 = ((((long) s[1]) & UnsignedInteger.INT_MASK) - (((long) iArr[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
                s[1] = (int) j2;
                long j3 = ((((long) s[2]) & UnsignedInteger.INT_MASK) - (((long) iArr[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
                s[2] = (int) j3;
                long j4 = ((((long) s[3]) & UnsignedInteger.INT_MASK) - (((long) iArr[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
                s[3] = (int) j4;
                long j5 = ((((long) s[4]) & UnsignedInteger.INT_MASK) - (((long) iArr[4]) & UnsignedInteger.INT_MASK)) + (j4 >> 32);
                s[4] = (int) j5;
                long j6 = ((((long) s[5]) & UnsignedInteger.INT_MASK) - (((long) iArr[5]) & UnsignedInteger.INT_MASK)) + (j5 >> 32);
                s[5] = (int) j6;
                s[6] = (int) (((((long) s[6]) & UnsignedInteger.INT_MASK) - (((long) iArr[6]) & UnsignedInteger.INT_MASK)) + (j6 >> 32));
            }
        }
        this.f17294f = s;
    }

    public C7830c(int[] iArr) {
        this.f17294f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C2606m.m6116K(this.f17294f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[7];
        C12995a.m20692g(this.f17294f, ((C7830c) dVar).f17294f, iArr);
        return new C7830c(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7830c)) {
            return false;
        }
        return C2606m.m6112G(this.f17294f, ((C7830c) obj).f17294f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17293g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[7];
        C12995a.m20700p(this.f17294f, ((C7830c) dVar).f17294f, iArr);
        return new C7830c(iArr);
    }

    public final int hashCode() {
        return f17293g.hashCode() ^ C8212a.m16494a(7, this.f17294f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[7];
        if (C2606m.m6124S(7, this.f17294f, iArr) != 0 || (iArr[6] == -1 && C2606m.m6122Q(iArr, C12995a.f28607c))) {
            C12995a.m20691f(iArr);
        }
        return new C7830c(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[7];
        C12995a.m20695j(this.f17294f, ((C7830c) dVar).f17294f, iArr);
        return new C7830c(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f17294f;
        if (C2606m.m6111F(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            C2606m.m6131Z(C12995a.f28607c, iArr2, iArr);
        }
        return new C7830c(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[7];
        C3039b.m7135D(C12995a.f28607c, ((C7830c) dVar).f17294f, iArr);
        C12995a.m20695j(iArr, this.f17294f, iArr);
        return new C7830c(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[7];
        C12995a.m20699o(this.f17294f, iArr);
        return new C7830c(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[7];
        C3039b.m7135D(C12995a.f28607c, this.f17294f, iArr);
        return new C7830c(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        boolean z;
        int[] iArr = this.f17294f;
        if (C2606m.m6111F(iArr) || C2606m.m6151q(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        int i = 1;
        if (C2606m.m6111F(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            iArr2[5] = 0;
            iArr2[6] = 0;
        } else {
            C2606m.m6131Z(C12995a.f28607c, iArr, iArr2);
        }
        int[] iArr3 = C12995a.f28607c;
        Random random = new Random();
        int[] iArr4 = new int[7];
        int i2 = iArr3[6];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != 7; i8++) {
                iArr4[i8] = random.nextInt();
            }
            iArr4[6] = iArr4[6] & i7;
        } while (C2606m.m6121P(7, iArr4, iArr3));
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        C2606m.m6148n(iArr, iArr6);
        for (int i9 = 0; i9 < 7; i9++) {
            C2606m.m6148n(iArr6, iArr7);
            int i10 = 1 << i9;
            int[] iArr8 = new int[14];
            do {
                C2606m.m6128W(iArr6, iArr8);
                C12995a.m20697l(iArr8, iArr6);
                i10--;
            } while (i10 > 0);
            C12995a.m20695j(iArr6, iArr7, iArr6);
        }
        int i11 = 95;
        int[] iArr9 = new int[14];
        do {
            C2606m.m6128W(iArr6, iArr9);
            C12995a.m20697l(iArr9, iArr6);
            i11--;
        } while (i11 > 0);
        if (!C2606m.m6151q(iArr6)) {
            return null;
        }
        while (true) {
            int[] iArr10 = new int[7];
            C2606m.m6148n(iArr4, iArr10);
            int[] iArr11 = new int[7];
            iArr11[0] = i;
            int[] iArr12 = new int[7];
            C2606m.m6148n(iArr2, iArr12);
            int[] iArr13 = new int[7];
            int[] iArr14 = new int[7];
            int i12 = 0;
            while (i12 < 7) {
                C2606m.m6148n(iArr10, iArr13);
                C2606m.m6148n(iArr11, iArr14);
                int i13 = i << i12;
                while (true) {
                    i13--;
                    if (i13 < 0) {
                        break;
                    }
                    C12995a.m20695j(iArr11, iArr10, iArr11);
                    if (C2606m.m6154t(7, 0, iArr11, iArr11) != 0 || (iArr11[6] == -1 && C2606m.m6122Q(iArr11, C12995a.f28607c))) {
                        C12995a.m20691f(iArr11);
                    }
                    C12995a.m20699o(iArr10, iArr5);
                    C12995a.m20692g(iArr12, iArr5, iArr10);
                    C12995a.m20695j(iArr12, iArr5, iArr12);
                    C12995a.m20689d(C2606m.m6114I(7, iArr12), iArr12);
                }
                C12995a.m20695j(iArr11, iArr14, iArr5);
                C12995a.m20695j(iArr5, iArr2, iArr5);
                C12995a.m20695j(iArr10, iArr13, iArr12);
                C12995a.m20692g(iArr12, iArr5, iArr12);
                C12995a.m20695j(iArr10, iArr14, iArr5);
                C2606m.m6148n(iArr12, iArr10);
                C12995a.m20695j(iArr11, iArr13, iArr11);
                C12995a.m20692g(iArr11, iArr5, iArr11);
                C12995a.m20699o(iArr11, iArr12);
                C12995a.m20695j(iArr12, iArr2, iArr12);
                i12++;
                i = 1;
            }
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            int i14 = 1;
            while (true) {
                if (i14 >= 96) {
                    z = false;
                    break;
                }
                C2606m.m6148n(iArr10, iArr15);
                C2606m.m6148n(iArr11, iArr16);
                C12995a.m20695j(iArr11, iArr10, iArr11);
                if (C2606m.m6154t(7, 0, iArr11, iArr11) != 0 || (iArr11[6] == -1 && C2606m.m6122Q(iArr11, C12995a.f28607c))) {
                    C12995a.m20691f(iArr11);
                }
                C12995a.m20699o(iArr10, iArr5);
                C12995a.m20692g(iArr12, iArr5, iArr10);
                C12995a.m20695j(iArr12, iArr5, iArr12);
                C12995a.m20689d(C2606m.m6114I(7, iArr12), iArr12);
                if (C2606m.m6111F(iArr10)) {
                    C3039b.m7135D(C12995a.f28607c, iArr16, iArr5);
                    C12995a.m20695j(iArr5, iArr15, iArr5);
                    z = true;
                    break;
                }
                i14++;
            }
            if (z) {
                break;
            }
            if (C2606m.m6124S(7, iArr4, iArr4) != 0 || (iArr4[6] == -1 && C2606m.m6122Q(iArr4, C12995a.f28607c))) {
                C12995a.m20691f(iArr4);
            }
            i = 1;
        }
        C12995a.m20699o(iArr5, iArr4);
        if (C2606m.m6112G(iArr, iArr4)) {
            return new C7830c(iArr5);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C2606m.m6151q(this.f17294f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C2606m.m6111F(this.f17294f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17294f[0] & 1) == 1;
    }
}
