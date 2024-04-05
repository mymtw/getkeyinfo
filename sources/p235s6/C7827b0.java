package p235s6;

import androidx.activity.C0114h;
import androidx.preference.C3039b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.b0 */
public final class C7827b0 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17290f;

    public C7827b0() {
        this.f17290f = new long[3];
    }

    public C7827b0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        long[] S = C3039b.m7149S(bigInteger);
        long j = S[2];
        long j2 = j >>> 35;
        S[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ S[0];
        S[2] = j & 34359738367L;
        this.f17290f = S;
    }

    public C7827b0(long[] jArr) {
        this.f17290f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3039b.m7155Y(this.f17290f);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        C7823a0.m15089b(this.f17290f, i, jArr);
        return new C7827b0(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17290f;
        long[] jArr2 = ((C7827b0) dVar).f17290f;
        return new C7827b0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17290f;
        long[] jArr2 = ((C7827b0) dVar).f17290f;
        long[] jArr3 = ((C7827b0) dVar2).f17290f;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        C7823a0.m15095h(jArr, jArr5);
        C7823a0.m15090c(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        C7823a0.m15093f(jArr2, jArr3, jArr6);
        C7823a0.m15090c(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        C7823a0.m15091d(jArr4, jArr7);
        return new C7827b0(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7827b0)) {
            return false;
        }
        long[] jArr = this.f17290f;
        long[] jArr2 = ((C7827b0) obj).f17290f;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 163;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17290f;
        long[] jArr2 = ((C7827b0) dVar).f17290f;
        long[] jArr3 = ((C7827b0) dVar2).f17290f;
        long[] jArr4 = ((C7827b0) dVar3).f17290f;
        long[] jArr5 = new long[6];
        long[] jArr6 = new long[6];
        C7823a0.m15093f(jArr, jArr2, jArr6);
        C7823a0.m15090c(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[6];
        C7823a0.m15093f(jArr3, jArr4, jArr7);
        C7823a0.m15090c(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[3];
        C7823a0.m15091d(jArr5, jArr8);
        return new C7827b0(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17290f, 3) ^ 163763;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17290f;
        return new C7827b0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[3];
        C7823a0.m15092e(this.f17290f, ((C7827b0) dVar).f17290f, jArr);
        return new C7827b0(jArr);
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
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        C7823a0.m15095h(this.f17290f, jArr2);
        C7823a0.m15091d(jArr2, jArr);
        return new C7827b0(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f17290f;
        if (!C3039b.m7148R(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[6];
            C7823a0.m15095h(jArr2, jArr5);
            C7823a0.m15091d(jArr5, jArr3);
            C7823a0.m15089b(jArr3, 1, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr4, 1, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr3, 3, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr4, 3, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr3, 9, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr4, 9, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr3, 27, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr4, 27, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr3);
            C7823a0.m15089b(jArr3, 81, jArr4);
            C7823a0.m15092e(jArr3, jArr4, jArr);
            return new C7827b0(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f17290f;
        long[] jArr3 = new long[3];
        long u = C0114h.m321u(jArr2[0]);
        long u2 = C0114h.m321u(jArr2[1]);
        jArr3[0] = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr2[2]);
        long j = u3 & UnsignedInteger.INT_MASK;
        jArr3[1] = u3 >>> 32;
        C7823a0.m15092e(jArr3, C7823a0.f17284a, jArr);
        jArr[0] = jArr[0] ^ ((u & UnsignedInteger.INT_MASK) | (u2 << 32));
        jArr[1] = jArr[1] ^ j;
        return new C7827b0(jArr);
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        long[] jArr = this.f17290f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3039b.m7148R(this.f17290f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17290f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        long[] jArr = this.f17290f;
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
