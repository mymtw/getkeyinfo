package p235s6;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.q1 */
public final class C7876q1 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17336g = C7873p1.f17332j;

    /* renamed from: f */
    public int[] f17337f;

    public C7876q1() {
        this.f17337f = new int[5];
    }

    public C7876q1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17336g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] z = C3039b.m7191z(bigInteger);
        if (z[4] == -1) {
            int[] iArr = C0761x.f1563g;
            if (C3039b.m7147Q(z, iArr)) {
                C3039b.m7169j0(iArr, z);
            }
        }
        this.f17337f = z;
    }

    public C7876q1(int[] iArr) {
        this.f17337f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3039b.m7154X(this.f17337f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[5];
        if (C3039b.m7166h(this.f17337f, ((C7876q1) dVar).f17337f, iArr) != 0 || (iArr[4] == -1 && C3039b.m7147Q(iArr, C0761x.f1563g))) {
            C2606m.m6158x(5, -2147483647, iArr);
        }
        return new C7876q1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7876q1)) {
            return false;
        }
        return C3039b.m7188w(this.f17337f, ((C7876q1) obj).f17337f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17336g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[5];
        C0761x.m1681N(this.f17337f, ((C7876q1) dVar).f17337f, iArr);
        return new C7876q1(iArr);
    }

    public final int hashCode() {
        return f17336g.hashCode() ^ C8212a.m16494a(5, this.f17337f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[5];
        if (C2606m.m6124S(5, this.f17337f, iArr) != 0 || (iArr[4] == -1 && C3039b.m7147Q(iArr, C0761x.f1563g))) {
            C2606m.m6158x(5, -2147483647, iArr);
        }
        return new C7876q1(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[5];
        C0761x.m1756z(this.f17337f, ((C7876q1) dVar).f17337f, iArr);
        return new C7876q1(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[5];
        int[] iArr2 = this.f17337f;
        if (C3039b.m7146P(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            C3039b.m7178o0(C0761x.f1563g, iArr2, iArr);
        }
        return new C7876q1(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[5];
        C3039b.m7135D(C0761x.f1563g, ((C7876q1) dVar).f17337f, iArr);
        C0761x.m1756z(iArr, this.f17337f, iArr);
        return new C7876q1(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[5];
        C0761x.m1679M(this.f17337f, iArr);
        return new C7876q1(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[5];
        C3039b.m7135D(C0761x.f1563g, this.f17337f, iArr);
        return new C7876q1(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17337f;
        if (C3039b.m7146P(iArr) || C3039b.m7187v(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        C0761x.m1679M(iArr, iArr2);
        C0761x.m1756z(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        C0761x.m1736o(2, iArr2, iArr3);
        C0761x.m1756z(iArr3, iArr2, iArr3);
        C0761x.m1736o(4, iArr3, iArr2);
        C0761x.m1756z(iArr2, iArr3, iArr2);
        C0761x.m1736o(8, iArr2, iArr3);
        C0761x.m1756z(iArr3, iArr2, iArr3);
        C0761x.m1736o(16, iArr3, iArr2);
        C0761x.m1756z(iArr2, iArr3, iArr2);
        C0761x.m1736o(32, iArr2, iArr3);
        C0761x.m1756z(iArr3, iArr2, iArr3);
        C0761x.m1736o(64, iArr3, iArr2);
        C0761x.m1756z(iArr2, iArr3, iArr2);
        C0761x.m1679M(iArr2, iArr3);
        C0761x.m1756z(iArr3, iArr, iArr3);
        C0761x.m1736o(29, iArr3, iArr3);
        C0761x.m1679M(iArr3, iArr2);
        if (C3039b.m7188w(iArr, iArr2)) {
            return new C7876q1(iArr3);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3039b.m7187v(this.f17337f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7146P(this.f17337f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17337f[0] & 1) == 1;
    }
}
