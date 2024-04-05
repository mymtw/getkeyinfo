package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import kotlin.jvm.internal.C19382n;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.t0 */
public final class C7884t0 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17344f;

    public C7884t0() {
        this.f17344f = new long[4];
    }

    public C7884t0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        long[] w = C3436p.m8260w(bigInteger);
        long j = w[3];
        long j2 = j >>> 47;
        w[0] = w[0] ^ j2;
        w[2] = (j2 << 30) ^ w[2];
        w[3] = j & 140737488355327L;
        this.f17344f = w;
    }

    public C7884t0(long[] jArr) {
        this.f17344f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        return C3436p.m8229C(this.f17344f);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        C19382n.m32697A(this.f17344f, i, jArr);
        return new C7884t0(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17344f;
        long[] jArr2 = ((C7884t0) dVar).f17344f;
        return new C7884t0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17344f;
        long[] jArr2 = ((C7884t0) dVar).f17344f;
        long[] jArr3 = ((C7884t0) dVar2).f17344f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        C19382n.m32752i0(jArr, jArr5);
        C19382n.m32715J(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        C19382n.m32740b0(jArr2, jArr3, jArr6);
        C19382n.m32715J(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        C19382n.m32727P(jArr4, jArr7);
        return new C7884t0(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7884t0)) {
            return false;
        }
        return C3436p.m8249k(this.f17344f, ((C7884t0) obj).f17344f);
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 239;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17344f;
        long[] jArr2 = ((C7884t0) dVar).f17344f;
        long[] jArr3 = ((C7884t0) dVar2).f17344f;
        long[] jArr4 = ((C7884t0) dVar3).f17344f;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        C19382n.m32740b0(jArr, jArr2, jArr6);
        C19382n.m32715J(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        C19382n.m32740b0(jArr3, jArr4, jArr7);
        C19382n.m32715J(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        C19382n.m32727P(jArr5, jArr8);
        return new C7884t0(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17344f, 4) ^ 23900158;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17344f;
        return new C7884t0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[4];
        C19382n.m32729Q(this.f17344f, ((C7884t0) dVar).f17344f, jArr);
        return new C7884t0(jArr);
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
        C19382n.m32738Z(this.f17344f, jArr);
        return new C7884t0(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f17344f;
        if (!C3436p.m8259v(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            C19382n.m32738Z(jArr2, jArr3);
            C19382n.m32729Q(jArr3, jArr2, jArr3);
            C19382n.m32738Z(jArr3, jArr3);
            C19382n.m32729Q(jArr3, jArr2, jArr3);
            C19382n.m32697A(jArr3, 3, jArr4);
            C19382n.m32729Q(jArr4, jArr3, jArr4);
            C19382n.m32738Z(jArr4, jArr4);
            C19382n.m32729Q(jArr4, jArr2, jArr4);
            C19382n.m32697A(jArr4, 7, jArr3);
            C19382n.m32729Q(jArr3, jArr4, jArr3);
            C19382n.m32697A(jArr3, 14, jArr4);
            C19382n.m32729Q(jArr4, jArr3, jArr4);
            C19382n.m32738Z(jArr4, jArr4);
            C19382n.m32729Q(jArr4, jArr2, jArr4);
            C19382n.m32697A(jArr4, 29, jArr3);
            C19382n.m32729Q(jArr3, jArr4, jArr3);
            C19382n.m32738Z(jArr3, jArr3);
            C19382n.m32729Q(jArr3, jArr2, jArr3);
            C19382n.m32697A(jArr3, 59, jArr4);
            C19382n.m32729Q(jArr4, jArr3, jArr4);
            C19382n.m32738Z(jArr4, jArr4);
            C19382n.m32729Q(jArr4, jArr2, jArr4);
            C19382n.m32697A(jArr4, 119, jArr3);
            C19382n.m32729Q(jArr3, jArr4, jArr3);
            C19382n.m32738Z(jArr3, jArr);
            return new C7884t0(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f17344f;
        long u = C0114h.m321u(jArr2[0]);
        long u2 = C0114h.m321u(jArr2[1]);
        long j = (u & UnsignedInteger.INT_MASK) | (u2 << 32);
        long j2 = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr2[2]);
        long u4 = C0114h.m321u(jArr2[3]);
        long j3 = (u3 & UnsignedInteger.INT_MASK) | (u4 << 32);
        long j4 = (u4 & -4294967296L) | (u3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j2 << i5);
            int i6 = i4 + 1;
            int i7 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j7 << i5) | (j2 >>> i7));
            int i8 = i4 + 2;
            jArr3[i8] = jArr3[i8] ^ ((j6 << i5) | (j7 >>> i7));
            int i9 = i4 + 3;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i7));
            int i10 = i4 + 4;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i7);
            i++;
        }
        C19382n.m32727P(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C7884t0(jArr);
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        return C3436p.m8248j(this.f17344f);
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8259v(this.f17344f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17344f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        long[] jArr = this.f17344f;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
