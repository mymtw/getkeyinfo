package p224r6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p772tq.C20203a;

/* renamed from: r6.b */
public final class C7781b extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17217g = C7780a.f17215j;

    /* renamed from: f */
    public int[] f17218f;

    public C7781b() {
        this.f17218f = new int[8];
    }

    public C7781b(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17217g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] l = C3436p.m8250l(bigInteger);
        if ((l[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = C20203a.f44782l;
            if (C3436p.m8227A(l, iArr)) {
                C3436p.m8237K(iArr, l);
            }
        }
        this.f17218f = l;
    }

    public C7781b(int[] iArr) {
        this.f17218f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8228B(this.f17218f);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[8];
        if (C3436p.m8245g(this.f17218f, ((C7781b) dVar).f17218f, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && C3436p.m8227A(iArr, C20203a.f44782l))) {
            C20203a.m34527h(iArr);
        }
        return new C7781b(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7781b)) {
            return false;
        }
        return C3436p.m8258u(this.f17218f, ((C7781b) obj).f17218f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17217g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[8];
        C20203a.m34535w(this.f17218f, ((C7781b) dVar).f17218f, iArr);
        return new C7781b(iArr);
    }

    public final int hashCode() {
        return f17217g.hashCode() ^ C8212a.m16494a(8, this.f17218f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[8];
        if (C2606m.m6124S(8, this.f17218f, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && C3436p.m8227A(iArr, C20203a.f44782l))) {
            C20203a.m34527h(iArr);
        }
        return new C7781b(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[8];
        C20203a.m34530r(this.f17218f, ((C7781b) dVar).f17218f, iArr);
        return new C7781b(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f17218f;
        if (C3436p.m8257t(iArr2)) {
            C3436p.m8234H(iArr);
        } else {
            C3436p.m8238L(C20203a.f44782l, iArr2, iArr);
        }
        return new C7781b(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[8];
        C3039b.m7135D(C20203a.f44782l, ((C7781b) dVar).f17218f, iArr);
        C20203a.m34530r(iArr, this.f17218f, iArr);
        return new C7781b(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[8];
        C20203a.m34534v(this.f17218f, iArr);
        return new C7781b(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[8];
        C3039b.m7135D(C20203a.f44782l, this.f17218f, iArr);
        return new C7781b(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        int[] iArr = this.f17218f;
        if (C3436p.m8257t(iArr) || C3436p.m8247i(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C20203a.m34534v(iArr, iArr2);
        C20203a.m34530r(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C20203a.m34526g(2, iArr2, iArr3);
        C20203a.m34530r(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        C20203a.m34526g(2, iArr3, iArr4);
        C20203a.m34530r(iArr4, iArr2, iArr4);
        C20203a.m34526g(6, iArr4, iArr2);
        C20203a.m34530r(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        C20203a.m34526g(12, iArr2, iArr5);
        C20203a.m34530r(iArr5, iArr2, iArr5);
        C20203a.m34526g(6, iArr5, iArr2);
        C20203a.m34530r(iArr2, iArr4, iArr2);
        C20203a.m34534v(iArr2, iArr4);
        C20203a.m34530r(iArr4, iArr, iArr4);
        C20203a.m34526g(31, iArr4, iArr5);
        C20203a.m34530r(iArr5, iArr4, iArr2);
        C20203a.m34526g(32, iArr5, iArr5);
        C20203a.m34530r(iArr5, iArr2, iArr5);
        C20203a.m34526g(62, iArr5, iArr5);
        C20203a.m34530r(iArr5, iArr2, iArr5);
        C20203a.m34526g(4, iArr5, iArr5);
        C20203a.m34530r(iArr5, iArr3, iArr5);
        C20203a.m34526g(32, iArr5, iArr5);
        C20203a.m34530r(iArr5, iArr, iArr5);
        C20203a.m34526g(62, iArr5, iArr5);
        C20203a.m34534v(iArr5, iArr3);
        if (C3436p.m8258u(iArr, iArr3)) {
            return new C7781b(iArr5);
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8247i(this.f17218f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8257t(this.f17218f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17218f[0] & 1) == 1;
    }
}
