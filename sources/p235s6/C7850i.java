package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p388lb.C13006a;

/* renamed from: s6.i */
public final class C7850i extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17311g = C7847h.f17308j;

    /* renamed from: f */
    public int[] f17312f;

    public C7850i() {
        this.f17312f = new int[8];
    }

    public C7850i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17311g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] l = C3436p.m8250l(bigInteger);
        if (l[7] == -1) {
            int[] iArr = C13006a.f28632D;
            if (C3436p.m8227A(l, iArr)) {
                C3436p.m8237K(iArr, l);
            }
        }
        this.f17312f = l;
    }

    public C7850i(int[] iArr) {
        this.f17312f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8228B(this.f17312f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[8];
        if (C3436p.m8245g(this.f17312f, ((C7850i) dVar).f17312f, iArr) != 0 || (iArr[7] == -1 && C3436p.m8227A(iArr, C13006a.f28632D))) {
            C13006a.m20714c(iArr);
        }
        return new C7850i(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7850i)) {
            return false;
        }
        return C3436p.m8258u(this.f17312f, ((C7850i) obj).f17312f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17311g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[8];
        C13006a.m20721j(this.f17312f, ((C7850i) dVar).f17312f, iArr);
        return new C7850i(iArr);
    }

    public final int hashCode() {
        return f17311g.hashCode() ^ C8212a.m16494a(8, this.f17312f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[8];
        if (C2606m.m6124S(8, this.f17312f, iArr) != 0 || (iArr[7] == -1 && C3436p.m8227A(iArr, C13006a.f28632D))) {
            C13006a.m20714c(iArr);
        }
        return new C7850i(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[8];
        C13006a.m20715d(this.f17312f, ((C7850i) dVar).f17312f, iArr);
        return new C7850i(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f17312f;
        if (C3436p.m8257t(iArr2)) {
            C3436p.m8234H(iArr);
        } else {
            C3436p.m8238L(C13006a.f28632D, iArr2, iArr);
        }
        return new C7850i(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[8];
        C3039b.m7135D(C13006a.f28632D, ((C7850i) dVar).f17312f, iArr);
        C13006a.m20715d(iArr, this.f17312f, iArr);
        return new C7850i(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[8];
        C13006a.m20720i(this.f17312f, iArr);
        return new C7850i(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[8];
        C3039b.m7135D(C13006a.f28632D, this.f17312f, iArr);
        return new C7850i(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17312f;
        if (C3436p.m8257t(iArr) || C3436p.m8247i(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        C13006a.m20720i(iArr, iArr2);
        C13006a.m20715d(iArr2, iArr, iArr2);
        C13006a.m20713b(2, iArr2, iArr3);
        C13006a.m20715d(iArr3, iArr2, iArr3);
        C13006a.m20713b(4, iArr3, iArr2);
        C13006a.m20715d(iArr2, iArr3, iArr2);
        C13006a.m20713b(8, iArr2, iArr3);
        C13006a.m20715d(iArr3, iArr2, iArr3);
        C13006a.m20713b(16, iArr3, iArr2);
        C13006a.m20715d(iArr2, iArr3, iArr2);
        C13006a.m20713b(32, iArr2, iArr2);
        C13006a.m20715d(iArr2, iArr, iArr2);
        C13006a.m20713b(96, iArr2, iArr2);
        C13006a.m20715d(iArr2, iArr, iArr2);
        C13006a.m20713b(94, iArr2, iArr2);
        C13006a.m20720i(iArr2, iArr3);
        if (C3436p.m8258u(iArr, iArr3)) {
            return new C7850i(iArr2);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8247i(this.f17312f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8257t(this.f17312f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17312f[0] & 1) == 1;
    }
}
