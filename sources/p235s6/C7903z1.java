package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p383ke.C12995a;

/* renamed from: s6.z1 */
public final class C7903z1 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17361g = C7900y1.f17359j;

    /* renamed from: f */
    public int[] f17362f;

    public C7903z1() {
        this.f17362f = new int[6];
    }

    public C7903z1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17361g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] G = C3039b.m7138G(bigInteger);
        if (G[5] == -1) {
            int[] iArr = C12995a.f28610f;
            if (C3039b.m7152V(G, iArr)) {
                C3039b.m7175m0(iArr, G);
            }
        }
        this.f17362f = G;
    }

    public C7903z1(int[] iArr) {
        this.f17362f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3039b.m7160d0(this.f17362f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[6];
        if (C3039b.m7133B(this.f17362f, ((C7903z1) dVar).f17362f, iArr) != 0 || (iArr[5] == -1 && C3039b.m7152V(iArr, C12995a.f28610f))) {
            C12995a.m20694i(iArr);
        }
        return new C7903z1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7903z1)) {
            return false;
        }
        return C3039b.m7137F(this.f17362f, ((C7903z1) obj).f17362f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17361g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[6];
        C12995a.m20702r(this.f17362f, ((C7903z1) dVar).f17362f, iArr);
        return new C7903z1(iArr);
    }

    public final int hashCode() {
        return f17361g.hashCode() ^ C8212a.m16494a(6, this.f17362f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[6];
        if (C2606m.m6124S(6, this.f17362f, iArr) != 0 || (iArr[5] == -1 && C3039b.m7152V(iArr, C12995a.f28610f))) {
            C12995a.m20694i(iArr);
        }
        return new C7903z1(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[6];
        C12995a.m20696k(this.f17362f, ((C7903z1) dVar).f17362f, iArr);
        return new C7903z1(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f17362f;
        if (C3039b.m7151U(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            C3039b.m7180p0(C12995a.f28610f, iArr2, iArr);
        }
        return new C7903z1(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[6];
        C3039b.m7135D(C12995a.f28610f, ((C7903z1) dVar).f17362f, iArr);
        C12995a.m20696k(iArr, this.f17362f, iArr);
        return new C7903z1(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[6];
        C12995a.m20701q(this.f17362f, iArr);
        return new C7903z1(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[6];
        C3039b.m7135D(C12995a.f28610f, this.f17362f, iArr);
        return new C7903z1(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17362f;
        if (C3039b.m7151U(iArr) || C3039b.m7136E(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        C12995a.m20701q(iArr, iArr2);
        C12995a.m20696k(iArr2, iArr, iArr2);
        C12995a.m20690e(2, iArr2, iArr3);
        C12995a.m20696k(iArr3, iArr2, iArr3);
        C12995a.m20690e(4, iArr3, iArr2);
        C12995a.m20696k(iArr2, iArr3, iArr2);
        C12995a.m20690e(8, iArr2, iArr3);
        C12995a.m20696k(iArr3, iArr2, iArr3);
        C12995a.m20690e(16, iArr3, iArr2);
        C12995a.m20696k(iArr2, iArr3, iArr2);
        C12995a.m20690e(32, iArr2, iArr3);
        C12995a.m20696k(iArr3, iArr2, iArr3);
        C12995a.m20690e(64, iArr3, iArr2);
        C12995a.m20696k(iArr2, iArr3, iArr2);
        C12995a.m20690e(62, iArr2, iArr2);
        C12995a.m20701q(iArr2, iArr3);
        if (C3039b.m7137F(iArr, iArr3)) {
            return new C7903z1(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3039b.m7136E(this.f17362f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7151U(this.f17362f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17362f[0] & 1) == 1;
    }
}
