package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import kotlin.jvm.internal.C19388s;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.n0 */
public final class C7866n0 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17326f;

    public C7866n0() {
        this.f17326f = new long[4];
    }

    public C7866n0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        long[] w = C3436p.m8260w(bigInteger);
        long j = w[3];
        long j2 = j >>> 41;
        w[0] = w[0] ^ j2;
        w[1] = (j2 << 10) ^ w[1];
        w[3] = j & 2199023255551L;
        this.f17326f = w;
    }

    public C7866n0(long[] jArr) {
        this.f17326f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8229C(this.f17326f);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        C19388s.m32883s(this.f17326f, i, jArr);
        return new C7866n0(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17326f;
        long[] jArr2 = ((C7866n0) dVar).f17326f;
        return new C7866n0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17326f;
        long[] jArr2 = ((C7866n0) dVar).f17326f;
        long[] jArr3 = ((C7866n0) dVar2).f17326f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        C19388s.m32871l0(jArr, jArr5);
        C19388s.m32819F(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        C19388s.m32849U(jArr2, jArr3, jArr6);
        C19388s.m32819F(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        C19388s.m32823H(jArr4, jArr7);
        return new C7866n0(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7866n0)) {
            return false;
        }
        return C3436p.m8249k(this.f17326f, ((C7866n0) obj).f17326f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 233;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17326f;
        long[] jArr2 = ((C7866n0) dVar).f17326f;
        long[] jArr3 = ((C7866n0) dVar2).f17326f;
        long[] jArr4 = ((C7866n0) dVar3).f17326f;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        C19388s.m32849U(jArr, jArr2, jArr6);
        C19388s.m32819F(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        C19388s.m32849U(jArr3, jArr4, jArr7);
        C19388s.m32819F(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        C19388s.m32823H(jArr5, jArr8);
        return new C7866n0(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17326f, 4) ^ 2330074;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17326f;
        return new C7866n0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[4];
        C19388s.m32825I(this.f17326f, ((C7866n0) dVar).f17326f, jArr);
        return new C7866n0(jArr);
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
        C19388s.m32847T(this.f17326f, jArr);
        return new C7866n0(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f17326f;
        if (!C3436p.m8259v(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            C19388s.m32847T(jArr2, jArr3);
            C19388s.m32825I(jArr3, jArr2, jArr3);
            C19388s.m32847T(jArr3, jArr3);
            C19388s.m32825I(jArr3, jArr2, jArr3);
            C19388s.m32883s(jArr3, 3, jArr4);
            C19388s.m32825I(jArr4, jArr3, jArr4);
            C19388s.m32847T(jArr4, jArr4);
            C19388s.m32825I(jArr4, jArr2, jArr4);
            C19388s.m32883s(jArr4, 7, jArr3);
            C19388s.m32825I(jArr3, jArr4, jArr3);
            C19388s.m32883s(jArr3, 14, jArr4);
            C19388s.m32825I(jArr4, jArr3, jArr4);
            C19388s.m32847T(jArr4, jArr4);
            C19388s.m32825I(jArr4, jArr2, jArr4);
            C19388s.m32883s(jArr4, 29, jArr3);
            C19388s.m32825I(jArr3, jArr4, jArr3);
            C19388s.m32883s(jArr3, 58, jArr4);
            C19388s.m32825I(jArr4, jArr3, jArr4);
            C19388s.m32883s(jArr4, 116, jArr3);
            C19388s.m32825I(jArr3, jArr4, jArr3);
            C19388s.m32847T(jArr3, jArr);
            return new C7866n0(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f17326f;
        int i = 0;
        long u = C0114h.m321u(jArr2[0]);
        long u2 = C0114h.m321u(jArr2[1]);
        long j = (u & UnsignedInteger.INT_MASK) | (u2 << 32);
        long j2 = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr2[2]);
        int i2 = 3;
        long u4 = C0114h.m321u(jArr2[3]);
        long j3 = (UnsignedInteger.INT_MASK & u3) | (u4 << 32);
        long j4 = (u3 >>> 32) | (u4 & -4294967296L);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        while (i < i2) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i7));
            int i8 = i4 + 2;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i5) | (j6 >>> i7));
            i2 = 3;
            int i9 = i4 + 3;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i7);
            i++;
        }
        C19388s.m32823H(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C7866n0(jArr);
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8248j(this.f17326f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8259v(this.f17326f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17326f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        long[] jArr = this.f17326f;
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
