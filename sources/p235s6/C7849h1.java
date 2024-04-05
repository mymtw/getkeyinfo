package p235s6;

import androidx.activity.C0114h;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.play.core.appupdate.C15562d;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.h1 */
public final class C7849h1 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17310f;

    public C7849h1() {
        this.f17310f = new long[9];
    }

    public C7849h1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[9];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            C15562d.m25193d(jArr, 0);
            this.f17310f = jArr;
        }
    }

    public C7849h1(long[] jArr) {
        this.f17310f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        long[] jArr = this.f17310f;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                C3436p.m8246h(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        C15562d.m25194e(this.f17310f, i, jArr);
        return new C7849h1(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = new long[9];
        C15562d.m25195g(this.f17310f, ((C7849h1) dVar).f17310f, jArr);
        return new C7849h1(jArr);
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17310f;
        long[] jArr2 = ((C7849h1) dVar).f17310f;
        long[] jArr3 = ((C7849h1) dVar2).f17310f;
        long[] jArr4 = new long[18];
        long[] jArr5 = new long[18];
        C15562d.m25172J(jArr, jArr5);
        for (int i = 0; i < 18; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        C15562d.m25168F(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[9];
        C15562d.m25202r(jArr4, jArr6);
        return new C7849h1(jArr6);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7849h1)) {
            return false;
        }
        long[] jArr = this.f17310f;
        long[] jArr2 = ((C7849h1) obj).f17310f;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 571;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17310f;
        long[] jArr2 = ((C7849h1) dVar).f17310f;
        long[] jArr3 = ((C7849h1) dVar2).f17310f;
        long[] jArr4 = ((C7849h1) dVar3).f17310f;
        long[] jArr5 = new long[18];
        C15562d.m25168F(jArr, jArr2, jArr5);
        C15562d.m25168F(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        C15562d.m25202r(jArr5, jArr6);
        return new C7849h1(jArr6);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17310f, 9) ^ 5711052;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f17310f;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new C7849h1(jArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[9];
        C15562d.m25164B(this.f17310f, ((C7849h1) dVar).f17310f, jArr);
        return new C7849h1(jArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        return this;
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        return mo20101j(dVar.mo20105n());
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        long[] jArr = new long[9];
        C15562d.m25167E(this.f17310f, jArr);
        return new C7849h1(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f17310f;
        if (!C3039b.m7153W(jArr2)) {
            long[] jArr3 = new long[9];
            long[] jArr4 = new long[9];
            long[] jArr5 = new long[9];
            C15562d.m25167E(jArr2, jArr5);
            C15562d.m25167E(jArr5, jArr3);
            C15562d.m25167E(jArr3, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr3, 2, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25164B(jArr3, jArr5, jArr3);
            C15562d.m25194e(jArr3, 5, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr4, 5, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr3, 15, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr5);
            C15562d.m25194e(jArr5, 30, jArr3);
            C15562d.m25194e(jArr3, 30, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr3, 60, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr4, 60, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr3, 180, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25194e(jArr4, 180, jArr4);
            C15562d.m25164B(jArr3, jArr4, jArr3);
            C15562d.m25164B(jArr3, jArr5, jArr);
            return new C7849h1(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f17310f;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long u = C0114h.m321u(jArr2[i]);
            i = i3 + 1;
            long u2 = C0114h.m321u(jArr2[i3]);
            jArr3[i2] = (UnsignedInteger.INT_MASK & u) | (u2 << 32);
            jArr4[i2] = (u >>> 32) | (-4294967296L & u2);
        }
        long u3 = C0114h.m321u(jArr2[i]);
        jArr3[4] = UnsignedInteger.INT_MASK & u3;
        jArr4[4] = u3 >>> 32;
        C15562d.m25164B(jArr4, C15562d.f35027l, jArr);
        C15562d.m25195g(jArr, jArr3, jArr);
        return new C7849h1(jArr);
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        long[] jArr = this.f17310f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7153W(this.f17310f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17310f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        long[] jArr = this.f17310f;
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }
}
