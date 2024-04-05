package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p568fn.C17782b;

/* renamed from: s6.c2 */
public final class C7833c2 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17297g = C7829b2.f17291j;

    /* renamed from: h */
    public static final int[] f17298h = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: f */
    public int[] f17299f;

    public C7833c2() {
        this.f17299f = new int[7];
    }

    public C7833c2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17297g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] s = C2606m.m6153s(bigInteger);
        if (s[6] == -1 && C2606m.m6122Q(s, C17782b.f38652w)) {
            C2606m.m6143i(7, 6803, s);
        }
        this.f17299f = s;
    }

    public C7833c2(int[] iArr) {
        this.f17299f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C2606m.m6116K(this.f17299f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[7];
        if (C2606m.m6140f(this.f17299f, ((C7833c2) dVar).f17299f, iArr) != 0 || (iArr[6] == -1 && C2606m.m6122Q(iArr, C17782b.f38652w))) {
            C2606m.m6143i(7, 6803, iArr);
        }
        return new C7833c2(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7833c2)) {
            return false;
        }
        return C2606m.m6112G(this.f17299f, ((C7833c2) obj).f17299f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17297g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[7];
        C17782b.m29853S(this.f17299f, ((C7833c2) dVar).f17299f, iArr);
        return new C7833c2(iArr);
    }

    public final int hashCode() {
        return f17297g.hashCode() ^ C8212a.m16494a(7, this.f17299f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[7];
        if (C2606m.m6124S(7, this.f17299f, iArr) != 0 || (iArr[6] == -1 && C2606m.m6122Q(iArr, C17782b.f38652w))) {
            C2606m.m6143i(7, 6803, iArr);
        }
        return new C7833c2(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[7];
        C17782b.m29894x(this.f17299f, ((C7833c2) dVar).f17299f, iArr);
        return new C7833c2(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f17299f;
        if (C2606m.m6111F(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            C2606m.m6131Z(C17782b.f38652w, iArr2, iArr);
        }
        return new C7833c2(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[7];
        C3039b.m7135D(C17782b.f38652w, ((C7833c2) dVar).f17299f, iArr);
        C17782b.m29894x(iArr, this.f17299f, iArr);
        return new C7833c2(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[7];
        C17782b.m29852R(this.f17299f, iArr);
        return new C7833c2(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[7];
        C3039b.m7135D(C17782b.f38652w, this.f17299f, iArr);
        return new C7833c2(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17299f;
        if (C2606m.m6111F(iArr) || C2606m.m6151q(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        C17782b.m29852R(iArr, iArr2);
        C17782b.m29894x(iArr2, iArr, iArr2);
        C17782b.m29852R(iArr2, iArr2);
        C17782b.m29894x(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        C17782b.m29852R(iArr2, iArr3);
        C17782b.m29894x(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        C17782b.m29882r(4, iArr3, iArr4);
        C17782b.m29894x(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        C17782b.m29882r(3, iArr4, iArr5);
        C17782b.m29894x(iArr5, iArr2, iArr5);
        C17782b.m29882r(8, iArr5, iArr5);
        C17782b.m29894x(iArr5, iArr4, iArr5);
        C17782b.m29882r(4, iArr5, iArr4);
        C17782b.m29894x(iArr4, iArr3, iArr4);
        C17782b.m29882r(19, iArr4, iArr3);
        C17782b.m29894x(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        C17782b.m29882r(42, iArr3, iArr6);
        C17782b.m29894x(iArr6, iArr3, iArr6);
        C17782b.m29882r(23, iArr6, iArr3);
        C17782b.m29894x(iArr3, iArr4, iArr3);
        C17782b.m29882r(84, iArr3, iArr4);
        C17782b.m29894x(iArr4, iArr6, iArr4);
        C17782b.m29882r(20, iArr4, iArr4);
        C17782b.m29894x(iArr4, iArr5, iArr4);
        C17782b.m29882r(3, iArr4, iArr4);
        C17782b.m29894x(iArr4, iArr, iArr4);
        C17782b.m29882r(2, iArr4, iArr4);
        C17782b.m29894x(iArr4, iArr, iArr4);
        C17782b.m29882r(4, iArr4, iArr4);
        C17782b.m29894x(iArr4, iArr2, iArr4);
        C17782b.m29852R(iArr4, iArr4);
        C17782b.m29852R(iArr4, iArr6);
        if (C2606m.m6112G(iArr, iArr6)) {
            return new C7833c2(iArr4);
        }
        C17782b.m29894x(iArr4, f17298h, iArr4);
        C17782b.m29852R(iArr4, iArr6);
        if (C2606m.m6112G(iArr, iArr6)) {
            return new C7833c2(iArr4);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C2606m.m6151q(this.f17299f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C2606m.m6111F(this.f17299f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17299f[0] & 1) == 1;
    }
}
