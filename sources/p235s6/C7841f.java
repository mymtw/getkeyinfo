package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p568fn.C17782b;

/* renamed from: s6.f */
public final class C7841f extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17304g = C7838e.f17301j;

    /* renamed from: f */
    public int[] f17305f;

    public C7841f() {
        this.f17305f = new int[8];
    }

    public C7841f(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17304g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] l = C3436p.m8250l(bigInteger);
        if (l[7] == -1) {
            int[] iArr = C17782b.f38649t;
            if (C3436p.m8227A(l, iArr)) {
                C3436p.m8237K(iArr, l);
            }
        }
        this.f17305f = l;
    }

    public C7841f(int[] iArr) {
        this.f17305f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8228B(this.f17305f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[8];
        if (C3436p.m8245g(this.f17305f, ((C7841f) dVar).f17305f, iArr) != 0 || (iArr[7] == -1 && C3436p.m8227A(iArr, C17782b.f38649t))) {
            C2606m.m6143i(8, 977, iArr);
        }
        return new C7841f(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7841f)) {
            return false;
        }
        return C3436p.m8258u(this.f17305f, ((C7841f) obj).f17305f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17304g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[8];
        C17782b.m29851Q(this.f17305f, ((C7841f) dVar).f17305f, iArr);
        return new C7841f(iArr);
    }

    public final int hashCode() {
        return f17304g.hashCode() ^ C8212a.m16494a(8, this.f17305f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[8];
        if (C2606m.m6124S(8, this.f17305f, iArr) != 0 || (iArr[7] == -1 && C3436p.m8227A(iArr, C17782b.f38649t))) {
            C2606m.m6143i(8, 977, iArr);
        }
        return new C7841f(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[8];
        C17782b.m29892w(this.f17305f, ((C7841f) dVar).f17305f, iArr);
        return new C7841f(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f17305f;
        if (C3436p.m8257t(iArr2)) {
            C3436p.m8234H(iArr);
        } else {
            C3436p.m8238L(C17782b.f38649t, iArr2, iArr);
        }
        return new C7841f(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[8];
        C3039b.m7135D(C17782b.f38649t, ((C7841f) dVar).f17305f, iArr);
        C17782b.m29892w(iArr, this.f17305f, iArr);
        return new C7841f(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[8];
        C17782b.m29850P(this.f17305f, iArr);
        return new C7841f(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[8];
        C3039b.m7135D(C17782b.f38649t, this.f17305f, iArr);
        return new C7841f(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17305f;
        if (C3436p.m8257t(iArr) || C3436p.m8247i(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C17782b.m29850P(iArr, iArr2);
        C17782b.m29892w(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C17782b.m29850P(iArr2, iArr3);
        C17782b.m29892w(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        C17782b.m29878p(3, iArr3, iArr4);
        C17782b.m29892w(iArr4, iArr3, iArr4);
        C17782b.m29878p(3, iArr4, iArr4);
        C17782b.m29892w(iArr4, iArr3, iArr4);
        C17782b.m29878p(2, iArr4, iArr4);
        C17782b.m29892w(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        C17782b.m29878p(11, iArr4, iArr5);
        C17782b.m29892w(iArr5, iArr4, iArr5);
        C17782b.m29878p(22, iArr5, iArr4);
        C17782b.m29892w(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        C17782b.m29878p(44, iArr4, iArr6);
        C17782b.m29892w(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        C17782b.m29878p(88, iArr6, iArr7);
        C17782b.m29892w(iArr7, iArr6, iArr7);
        C17782b.m29878p(44, iArr7, iArr6);
        C17782b.m29892w(iArr6, iArr4, iArr6);
        C17782b.m29878p(3, iArr6, iArr4);
        C17782b.m29892w(iArr4, iArr3, iArr4);
        C17782b.m29878p(23, iArr4, iArr4);
        C17782b.m29892w(iArr4, iArr5, iArr4);
        C17782b.m29878p(6, iArr4, iArr4);
        C17782b.m29892w(iArr4, iArr2, iArr4);
        C17782b.m29878p(2, iArr4, iArr4);
        C17782b.m29850P(iArr4, iArr2);
        if (C3436p.m8258u(iArr, iArr2)) {
            return new C7841f(iArr4);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8247i(this.f17305f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8257t(this.f17305f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17305f[0] & 1) == 1;
    }
}
