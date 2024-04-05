package p235s6;

import androidx.activity.C0114h;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.t1 */
public final class C7885t1 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17345g = C7882s1.f17341j;

    /* renamed from: f */
    public int[] f17346f;

    public C7885t1() {
        this.f17346f = new int[5];
    }

    public C7885t1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17345g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] z = C3039b.m7191z(bigInteger);
        if (z[4] == -1) {
            int[] iArr = C0114h.f183t;
            if (C3039b.m7147Q(z, iArr)) {
                C3039b.m7169j0(iArr, z);
            }
        }
        this.f17346f = z;
    }

    public C7885t1(int[] iArr) {
        this.f17346f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3039b.m7154X(this.f17346f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[5];
        if (C3039b.m7166h(this.f17346f, ((C7885t1) dVar).f17346f, iArr) != 0 || (iArr[4] == -1 && C3039b.m7147Q(iArr, C0114h.f183t))) {
            C2606m.m6143i(5, 21389, iArr);
        }
        return new C7885t1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7885t1)) {
            return false;
        }
        return C3039b.m7188w(this.f17346f, ((C7885t1) obj).f17346f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17345g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[5];
        C0114h.m292W(this.f17346f, ((C7885t1) dVar).f17346f, iArr);
        return new C7885t1(iArr);
    }

    public final int hashCode() {
        return f17345g.hashCode() ^ C8212a.m16494a(5, this.f17346f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[5];
        if (C2606m.m6124S(5, this.f17346f, iArr) != 0 || (iArr[4] == -1 && C3039b.m7147Q(iArr, C0114h.f183t))) {
            C2606m.m6143i(5, 21389, iArr);
        }
        return new C7885t1(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[5];
        C0114h.m271C(this.f17346f, ((C7885t1) dVar).f17346f, iArr);
        return new C7885t1(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f17346f;
        if (C3039b.m7146P(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            C3039b.m7178o0(C0114h.f183t, iArr2, iArr);
        }
        return new C7885t1(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[5];
        C3039b.m7135D(C0114h.f183t, ((C7885t1) dVar).f17346f, iArr);
        C0114h.m271C(iArr, this.f17346f, iArr);
        return new C7885t1(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[5];
        C0114h.m291V(this.f17346f, iArr);
        return new C7885t1(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[5];
        C3039b.m7135D(C0114h.f183t, this.f17346f, iArr);
        return new C7885t1(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17346f;
        if (C3039b.m7146P(iArr) || C3039b.m7187v(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        C0114h.m291V(iArr, iArr2);
        C0114h.m271C(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        C0114h.m291V(iArr2, iArr3);
        C0114h.m271C(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        C0114h.m291V(iArr3, iArr4);
        C0114h.m271C(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        C0114h.m329y(3, iArr4, iArr5);
        C0114h.m271C(iArr5, iArr3, iArr5);
        C0114h.m329y(7, iArr5, iArr4);
        C0114h.m271C(iArr4, iArr5, iArr4);
        C0114h.m329y(3, iArr4, iArr5);
        C0114h.m271C(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        C0114h.m329y(14, iArr5, iArr6);
        C0114h.m271C(iArr6, iArr4, iArr6);
        C0114h.m329y(31, iArr6, iArr4);
        C0114h.m271C(iArr4, iArr6, iArr4);
        C0114h.m329y(62, iArr4, iArr6);
        C0114h.m271C(iArr6, iArr4, iArr6);
        C0114h.m329y(3, iArr6, iArr4);
        C0114h.m271C(iArr4, iArr3, iArr4);
        C0114h.m329y(18, iArr4, iArr4);
        C0114h.m271C(iArr4, iArr5, iArr4);
        C0114h.m329y(2, iArr4, iArr4);
        C0114h.m271C(iArr4, iArr, iArr4);
        C0114h.m329y(3, iArr4, iArr4);
        C0114h.m271C(iArr4, iArr2, iArr4);
        C0114h.m329y(6, iArr4, iArr4);
        C0114h.m271C(iArr4, iArr3, iArr4);
        C0114h.m329y(2, iArr4, iArr4);
        C0114h.m271C(iArr4, iArr, iArr4);
        C0114h.m291V(iArr4, iArr2);
        if (C3039b.m7188w(iArr, iArr2)) {
            return new C7885t1(iArr4);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3039b.m7187v(this.f17346f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7146P(this.f17346f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17346f[0] & 1) == 1;
    }
}
