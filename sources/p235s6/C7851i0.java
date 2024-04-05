package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;
import p628nj.C18263b;

/* renamed from: s6.i0 */
public final class C7851i0 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17313f;

    public C7851i0() {
        this.f17313f = new long[4];
    }

    public C7851i0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        long[] w = C3436p.m8260w(bigInteger);
        long j = w[3];
        long j2 = j >>> 1;
        w[0] = w[0] ^ ((j2 << 15) ^ j2);
        w[1] = (j2 >>> 49) ^ w[1];
        w[3] = j & 1;
        this.f17313f = w;
    }

    public C7851i0(long[] jArr) {
        this.f17313f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8229C(this.f17313f);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        C18263b.m30848j(this.f17313f, i, jArr);
        return new C7851i0(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17313f;
        long[] jArr2 = ((C7851i0) dVar).f17313f;
        return new C7851i0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17313f;
        long[] jArr2 = ((C7851i0) dVar).f17313f;
        long[] jArr3 = ((C7851i0) dVar2).f17313f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        C18263b.m30831Z(jArr, jArr5);
        C18263b.m30864r(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        C18263b.m30815J(jArr2, jArr3, jArr6);
        C18263b.m30864r(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        C18263b.m30876x(jArr4, jArr7);
        return new C7851i0(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7851i0)) {
            return false;
        }
        return C3436p.m8249k(this.f17313f, ((C7851i0) obj).f17313f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 193;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17313f;
        long[] jArr2 = ((C7851i0) dVar).f17313f;
        long[] jArr3 = ((C7851i0) dVar2).f17313f;
        long[] jArr4 = ((C7851i0) dVar3).f17313f;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        C18263b.m30815J(jArr, jArr2, jArr6);
        C18263b.m30864r(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        C18263b.m30815J(jArr3, jArr4, jArr7);
        C18263b.m30864r(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        C18263b.m30876x(jArr5, jArr8);
        return new C7851i0(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17313f, 4) ^ 1930015;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17313f;
        return new C7851i0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[4];
        C18263b.m30878y(this.f17313f, ((C7851i0) dVar).f17313f, jArr);
        return new C7851i0(jArr);
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
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        C18263b.m30831Z(this.f17313f, jArr2);
        C18263b.m30876x(jArr2, jArr);
        return new C7851i0(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f17313f;
        if (!C3436p.m8259v(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[8];
            C18263b.m30831Z(jArr2, jArr5);
            C18263b.m30876x(jArr5, jArr3);
            C18263b.m30848j(jArr3, 1, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr4, 1, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 3, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 6, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 12, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 24, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 48, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr3);
            C18263b.m30848j(jArr3, 96, jArr4);
            C18263b.m30878y(jArr3, jArr4, jArr);
            return new C7851i0(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = this.f17313f;
        long u = C0114h.m321u(jArr[0]);
        long u2 = C0114h.m321u(jArr[1]);
        long j = (u & UnsignedInteger.INT_MASK) | (u2 << 32);
        long j2 = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr[2]);
        long j3 = u3 >>> 32;
        return new C7851i0(new long[]{j ^ (j2 << 8), (((j3 << 8) ^ ((u3 & UnsignedInteger.INT_MASK) ^ (jArr[3] << 32))) ^ (j2 >>> 56)) ^ (j2 << 33), ((j3 >>> 56) ^ (j3 << 33)) ^ (j2 >>> 31), j3 >>> 31});
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8248j(this.f17313f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8259v(this.f17313f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17313f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        return ((int) this.f17313f[0]) & 1;
    }
}
