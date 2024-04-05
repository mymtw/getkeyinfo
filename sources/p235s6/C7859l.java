package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p610kp.C18161c;

/* renamed from: s6.l */
public final class C7859l extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17321g = C7856k.f17316j;

    /* renamed from: f */
    public int[] f17322f;

    public C7859l() {
        this.f17322f = new int[12];
    }

    public C7859l(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17321g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] r = C2606m.m6152r(384, bigInteger);
        if (r[11] == -1) {
            int[] iArr = C18161c.f39711s1;
            if (C2606m.m6121P(12, r, iArr)) {
                C2606m.m6130Y(12, iArr, r);
            }
        }
        this.f17322f = r;
    }

    public C7859l(int[] iArr) {
        this.f17322f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C2606m.m6137c0(12, this.f17322f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[12];
        if (C2606m.m6139e(12, this.f17322f, ((C7859l) dVar).f17322f, iArr) != 0 || (iArr[11] == -1 && C2606m.m6121P(12, iArr, C18161c.f39711s1))) {
            C18161c.m30662f(iArr);
        }
        return new C7859l(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7859l)) {
            return false;
        }
        return C2606m.m6110E(12, this.f17322f, ((C7859l) obj).f17322f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17321g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[12];
        C18161c.m30667k(this.f17322f, ((C7859l) dVar).f17322f, iArr);
        return new C7859l(iArr);
    }

    public final int hashCode() {
        return f17321g.hashCode() ^ C8212a.m16494a(12, this.f17322f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[12];
        if (C2606m.m6124S(12, this.f17322f, iArr) != 0 || (iArr[11] == -1 && C2606m.m6121P(12, iArr, C18161c.f39711s1))) {
            C18161c.m30662f(iArr);
        }
        return new C7859l(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[12];
        C18161c.m30665i(this.f17322f, ((C7859l) dVar).f17322f, iArr);
        return new C7859l(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[12];
        int[] iArr2 = this.f17322f;
        if (C2606m.m6135b0(12, iArr2)) {
            for (int i = 0; i < 12; i++) {
                iArr[i] = 0;
            }
        } else {
            C2606m.m6125T(12, C18161c.f39711s1, iArr2, iArr);
        }
        return new C7859l(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[12];
        C3039b.m7135D(C18161c.f39711s1, ((C7859l) dVar).f17322f, iArr);
        C18161c.m30665i(iArr, this.f17322f, iArr);
        return new C7859l(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[12];
        C18161c.m30666j(this.f17322f, iArr);
        return new C7859l(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[12];
        C3039b.m7135D(C18161c.f39711s1, this.f17322f, iArr);
        return new C7859l(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17322f;
        if (C2606m.m6135b0(12, iArr) || C2606m.m6129X(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        C18161c.m30666j(iArr, iArr2);
        C18161c.m30665i(iArr2, iArr, iArr2);
        C18161c.m30661e(2, iArr2, iArr3);
        C18161c.m30665i(iArr3, iArr2, iArr3);
        C18161c.m30666j(iArr3, iArr3);
        C18161c.m30665i(iArr3, iArr, iArr3);
        C18161c.m30661e(5, iArr3, iArr4);
        C18161c.m30665i(iArr4, iArr3, iArr4);
        C18161c.m30661e(5, iArr4, iArr5);
        C18161c.m30665i(iArr5, iArr3, iArr5);
        C18161c.m30661e(15, iArr5, iArr3);
        C18161c.m30665i(iArr3, iArr5, iArr3);
        C18161c.m30661e(2, iArr3, iArr4);
        C18161c.m30665i(iArr2, iArr4, iArr2);
        C18161c.m30661e(28, iArr4, iArr4);
        C18161c.m30665i(iArr3, iArr4, iArr3);
        C18161c.m30661e(60, iArr3, iArr4);
        C18161c.m30665i(iArr4, iArr3, iArr4);
        C18161c.m30661e(120, iArr4, iArr3);
        C18161c.m30665i(iArr3, iArr4, iArr3);
        C18161c.m30661e(15, iArr3, iArr3);
        C18161c.m30665i(iArr3, iArr5, iArr3);
        C18161c.m30661e(33, iArr3, iArr3);
        C18161c.m30665i(iArr3, iArr2, iArr3);
        C18161c.m30661e(64, iArr3, iArr3);
        C18161c.m30665i(iArr3, iArr, iArr3);
        C18161c.m30661e(30, iArr3, iArr2);
        C18161c.m30666j(iArr2, iArr3);
        if (C2606m.m6110E(12, iArr, iArr3)) {
            return new C7859l(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C2606m.m6129X(12, this.f17322f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C2606m.m6135b0(12, this.f17322f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17322f[0] & 1) == 1;
    }
}
