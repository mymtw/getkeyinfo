package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.o */
public final class C7868o extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17329g = C7865n.f17324j;

    /* renamed from: f */
    public int[] f17330f;

    public C7868o() {
        this.f17330f = new int[17];
    }

    public C7868o(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17329g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] r = C2606m.m6152r(521, bigInteger);
        if (C2606m.m6110E(17, r, C15588c1.f35096v)) {
            for (int i = 0; i < 17; i++) {
                r[i] = 0;
            }
        }
        this.f17330f = r;
    }

    public C7868o(int[] iArr) {
        this.f17330f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C2606m.m6137c0(17, this.f17330f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[17];
        C15588c1.m25339p(this.f17330f, ((C7868o) dVar).f17330f, iArr);
        return new C7868o(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7868o)) {
            return false;
        }
        return C2606m.m6110E(17, this.f17330f, ((C7868o) obj).f17330f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17329g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[17];
        C15588c1.m25282H(this.f17330f, ((C7868o) dVar).f17330f, iArr);
        return new C7868o(iArr);
    }

    public final int hashCode() {
        return f17329g.hashCode() ^ C8212a.m16494a(17, this.f17330f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f17330f;
        int S = C2606m.m6124S(16, iArr2, iArr) + iArr2[16];
        if (S > 511 || (S == 511 && C2606m.m6110E(16, iArr, C15588c1.f35096v))) {
            S = (C2606m.m6115J(iArr) + S) & 511;
        }
        iArr[16] = S;
        return new C7868o(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[17];
        C15588c1.m25359z(this.f17330f, ((C7868o) dVar).f17330f, iArr);
        return new C7868o(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f17330f;
        if (C2606m.m6135b0(17, iArr2)) {
            for (int i = 0; i < 17; i++) {
                iArr[i] = 0;
            }
        } else {
            C2606m.m6125T(17, C15588c1.f35096v, iArr2, iArr);
        }
        return new C7868o(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[17];
        C3039b.m7135D(C15588c1.f35096v, ((C7868o) dVar).f17330f, iArr);
        C15588c1.m25359z(iArr, this.f17330f, iArr);
        return new C7868o(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[17];
        C15588c1.m25306T(this.f17330f, iArr);
        return new C7868o(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[17];
        C3039b.m7135D(C15588c1.f35096v, this.f17330f, iArr);
        return new C7868o(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17330f;
        if (C2606m.m6135b0(17, iArr) || C2606m.m6129X(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int i = 519;
        int[] iArr4 = new int[33];
        C15588c1.m25317b0(iArr, iArr4);
        while (true) {
            C15588c1.m25280G(iArr4, iArr2);
            i--;
            if (i <= 0) {
                break;
            }
            C15588c1.m25317b0(iArr2, iArr4);
        }
        C15588c1.m25306T(iArr2, iArr3);
        if (C2606m.m6110E(17, iArr, iArr3)) {
            return new C7868o(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C2606m.m6129X(17, this.f17330f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C2606m.m6135b0(17, this.f17330f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17330f[0] & 1) == 1;
    }
}
