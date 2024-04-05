package p216q6;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: q6.b */
public final class C7725b extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17136g = C7724a.f17134j;

    /* renamed from: h */
    public static final int[] f17137h = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: f */
    public int[] f17138f;

    public C7725b() {
        this.f17138f = new int[8];
    }

    public C7725b(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17136g) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] l = C3436p.m8250l(bigInteger);
        while (true) {
            int[] iArr = C0761x.f1561e;
            if (C3436p.m8227A(l, iArr)) {
                C3436p.m8237K(iArr, l);
            } else {
                this.f17138f = l;
                return;
            }
        }
    }

    public C7725b(int[] iArr) {
        this.f17138f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8228B(this.f17138f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[8];
        C3436p.m8245g(this.f17138f, ((C7725b) dVar).f17138f, iArr);
        if (C3436p.m8227A(iArr, C0761x.f1561e)) {
            C0761x.m1752x(iArr);
        }
        return new C7725b(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7725b)) {
            return false;
        }
        return C3436p.m8258u(this.f17138f, ((C7725b) obj).f17138f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17136g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[8];
        C0761x.m1677L(this.f17138f, ((C7725b) dVar).f17138f, iArr);
        return new C7725b(iArr);
    }

    public final int hashCode() {
        return f17136g.hashCode() ^ C8212a.m16494a(8, this.f17138f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[8];
        C2606m.m6124S(8, this.f17138f, iArr);
        if (C3436p.m8227A(iArr, C0761x.f1561e)) {
            C0761x.m1752x(iArr);
        }
        return new C7725b(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[8];
        C0761x.m1754y(this.f17138f, ((C7725b) dVar).f17138f, iArr);
        return new C7725b(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f17138f;
        if (C3436p.m8257t(iArr2)) {
            C3436p.m8234H(iArr);
        } else {
            C3436p.m8238L(C0761x.f1561e, iArr2, iArr);
        }
        return new C7725b(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[8];
        C3039b.m7135D(C0761x.f1561e, ((C7725b) dVar).f17138f, iArr);
        C0761x.m1754y(iArr, this.f17138f, iArr);
        return new C7725b(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[8];
        C0761x.m1675K(this.f17138f, iArr);
        return new C7725b(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[8];
        C3039b.m7135D(C0761x.f1561e, this.f17138f, iArr);
        return new C7725b(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17138f;
        if (C3436p.m8257t(iArr) || C3436p.m8247i(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C0761x.m1675K(iArr, iArr2);
        C0761x.m1754y(iArr2, iArr, iArr2);
        C0761x.m1675K(iArr2, iArr2);
        C0761x.m1754y(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C0761x.m1675K(iArr2, iArr3);
        C0761x.m1754y(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        C0761x.m1729j(3, iArr3, iArr4);
        C0761x.m1754y(iArr4, iArr2, iArr4);
        C0761x.m1729j(4, iArr4, iArr2);
        C0761x.m1754y(iArr2, iArr3, iArr2);
        C0761x.m1729j(4, iArr2, iArr4);
        C0761x.m1754y(iArr4, iArr3, iArr4);
        C0761x.m1729j(15, iArr4, iArr3);
        C0761x.m1754y(iArr3, iArr4, iArr3);
        C0761x.m1729j(30, iArr3, iArr4);
        C0761x.m1754y(iArr4, iArr3, iArr4);
        C0761x.m1729j(60, iArr4, iArr3);
        C0761x.m1754y(iArr3, iArr4, iArr3);
        C0761x.m1729j(11, iArr3, iArr4);
        C0761x.m1754y(iArr4, iArr2, iArr4);
        C0761x.m1729j(120, iArr4, iArr2);
        C0761x.m1754y(iArr2, iArr3, iArr2);
        C0761x.m1675K(iArr2, iArr2);
        C0761x.m1675K(iArr2, iArr3);
        if (C3436p.m8258u(iArr, iArr3)) {
            return new C7725b(iArr2);
        }
        C0761x.m1754y(iArr2, f17137h, iArr2);
        C0761x.m1675K(iArr2, iArr3);
        if (C3436p.m8258u(iArr, iArr3)) {
            return new C7725b(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8247i(this.f17138f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8257t(this.f17138f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17138f[0] & 1) == 1;
    }
}
