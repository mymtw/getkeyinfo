package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p772tq.C20203a;

/* renamed from: s6.w1 */
public final class C7894w1 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17354g = C7891v1.f17349j;

    /* renamed from: f */
    public int[] f17355f;

    public C7894w1() {
        this.f17355f = new int[6];
    }

    public C7894w1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17354g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] G = C3039b.m7138G(bigInteger);
        if (G[5] == -1) {
            int[] iArr = C20203a.f44784n;
            if (C3039b.m7152V(G, iArr)) {
                C3039b.m7175m0(iArr, G);
            }
        }
        this.f17355f = G;
    }

    public C7894w1(int[] iArr) {
        this.f17355f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3039b.m7160d0(this.f17355f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[6];
        if (C3039b.m7133B(this.f17355f, ((C7894w1) dVar).f17355f, iArr) != 0 || (iArr[5] == -1 && C3039b.m7152V(iArr, C20203a.f44784n))) {
            C2606m.m6143i(6, 4553, iArr);
        }
        return new C7894w1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7894w1)) {
            return false;
        }
        return C3039b.m7137F(this.f17355f, ((C7894w1) obj).f17355f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17354g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[6];
        C20203a.m34537y(this.f17355f, ((C7894w1) dVar).f17355f, iArr);
        return new C7894w1(iArr);
    }

    public final int hashCode() {
        return f17354g.hashCode() ^ C8212a.m16494a(6, this.f17355f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[6];
        if (C2606m.m6124S(6, this.f17355f, iArr) != 0 || (iArr[5] == -1 && C3039b.m7152V(iArr, C20203a.f44784n))) {
            C2606m.m6143i(6, 4553, iArr);
        }
        return new C7894w1(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[6];
        C20203a.m34531s(this.f17355f, ((C7894w1) dVar).f17355f, iArr);
        return new C7894w1(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[6];
        int[] iArr2 = this.f17355f;
        if (C3039b.m7151U(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            C3039b.m7180p0(C20203a.f44784n, iArr2, iArr);
        }
        return new C7894w1(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[6];
        C3039b.m7135D(C20203a.f44784n, ((C7894w1) dVar).f17355f, iArr);
        C20203a.m34531s(iArr, this.f17355f, iArr);
        return new C7894w1(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[6];
        C20203a.m34536x(this.f17355f, iArr);
        return new C7894w1(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[6];
        C3039b.m7135D(C20203a.f44784n, this.f17355f, iArr);
        return new C7894w1(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17355f;
        if (C3039b.m7151U(iArr) || C3039b.m7136E(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        C20203a.m34536x(iArr, iArr2);
        C20203a.m34531s(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        C20203a.m34536x(iArr2, iArr3);
        C20203a.m34531s(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        C20203a.m34529q(3, iArr3, iArr4);
        C20203a.m34531s(iArr4, iArr3, iArr4);
        C20203a.m34529q(2, iArr4, iArr4);
        C20203a.m34531s(iArr4, iArr2, iArr4);
        C20203a.m34529q(8, iArr4, iArr2);
        C20203a.m34531s(iArr2, iArr4, iArr2);
        C20203a.m34529q(3, iArr2, iArr4);
        C20203a.m34531s(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        C20203a.m34529q(16, iArr4, iArr5);
        C20203a.m34531s(iArr5, iArr2, iArr5);
        C20203a.m34529q(35, iArr5, iArr2);
        C20203a.m34531s(iArr2, iArr5, iArr2);
        C20203a.m34529q(70, iArr2, iArr5);
        C20203a.m34531s(iArr5, iArr2, iArr5);
        C20203a.m34529q(19, iArr5, iArr2);
        C20203a.m34531s(iArr2, iArr4, iArr2);
        C20203a.m34529q(20, iArr2, iArr2);
        C20203a.m34531s(iArr2, iArr4, iArr2);
        C20203a.m34529q(4, iArr2, iArr2);
        C20203a.m34531s(iArr2, iArr3, iArr2);
        C20203a.m34529q(6, iArr2, iArr2);
        C20203a.m34531s(iArr2, iArr3, iArr2);
        C20203a.m34536x(iArr2, iArr2);
        C20203a.m34536x(iArr2, iArr3);
        if (C3039b.m7137F(iArr, iArr3)) {
            return new C7894w1(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3039b.m7136E(this.f17355f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7151U(this.f17355f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17355f[0] & 1) == 1;
    }
}
