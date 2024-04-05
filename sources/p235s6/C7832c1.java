package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.c1 */
public final class C7832c1 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17296f;

    public C7832c1() {
        this.f17296f = new long[7];
    }

    public C7832c1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[7];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[6];
            long j2 = j >>> 25;
            jArr[0] = jArr[0] ^ j2;
            jArr[1] = (j2 << 23) ^ jArr[1];
            jArr[6] = j & 33554431;
            this.f17296f = jArr;
        }
    }

    public C7832c1(long[] jArr) {
        this.f17296f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        long[] jArr = this.f17296f;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                C3436p.m8246h(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        C15588c1.m25341q(this.f17296f, i, jArr);
        return new C7832c1(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17296f;
        long[] jArr2 = ((C7832c1) dVar).f17296f;
        return new C7832c1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17296f;
        long[] jArr2 = ((C7832c1) dVar).f17296f;
        long[] jArr3 = ((C7832c1) dVar2).f17296f;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        C15588c1.m25337n0(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        C15588c1.m25315Z(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        C15588c1.m25284I(jArr4, jArr7);
        return new C7832c1(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7832c1)) {
            return false;
        }
        long[] jArr = this.f17296f;
        long[] jArr2 = ((C7832c1) obj).f17296f;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 409;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17296f;
        long[] jArr2 = ((C7832c1) dVar).f17296f;
        long[] jArr3 = ((C7832c1) dVar2).f17296f;
        long[] jArr4 = ((C7832c1) dVar3).f17296f;
        long[] jArr5 = new long[13];
        long[] jArr6 = new long[14];
        C15588c1.m25315Z(jArr, jArr2, jArr6);
        for (int i = 0; i < 13; i++) {
            jArr5[i] = jArr5[i] ^ jArr6[i];
        }
        long[] jArr7 = new long[14];
        C15588c1.m25315Z(jArr3, jArr4, jArr7);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr5[i2] = jArr5[i2] ^ jArr7[i2];
        }
        long[] jArr8 = new long[7];
        C15588c1.m25284I(jArr5, jArr8);
        return new C7832c1(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17296f, 7) ^ 4090087;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17296f;
        return new C7832c1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[7];
        C15588c1.m25286J(this.f17296f, ((C7832c1) dVar).f17296f, jArr);
        return new C7832c1(jArr);
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
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        C15588c1.m25337n0(this.f17296f, jArr2);
        C15588c1.m25284I(jArr2, jArr);
        return new C7832c1(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[7];
        long[] jArr2 = this.f17296f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 7) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[7];
            long[] jArr4 = new long[7];
            long[] jArr5 = new long[7];
            long[] jArr6 = new long[13];
            C15588c1.m25337n0(jArr2, jArr6);
            C15588c1.m25284I(jArr6, jArr3);
            C15588c1.m25341q(jArr3, 1, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr4, 1, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 3, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 6, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 12, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr5);
            C15588c1.m25341q(jArr5, 24, jArr3);
            C15588c1.m25341q(jArr3, 24, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 48, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 96, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25341q(jArr3, 192, jArr4);
            C15588c1.m25286J(jArr3, jArr4, jArr3);
            C15588c1.m25286J(jArr3, jArr5, jArr);
            return new C7832c1(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = this.f17296f;
        long u = C0114h.m321u(jArr[0]);
        long u2 = C0114h.m321u(jArr[1]);
        long j = (u & UnsignedInteger.INT_MASK) | (u2 << 32);
        long j2 = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr[2]);
        long u4 = C0114h.m321u(jArr[3]);
        long j3 = (u3 & UnsignedInteger.INT_MASK) | (u4 << 32);
        long j4 = (u3 >>> 32) | (u4 & -4294967296L);
        long u5 = C0114h.m321u(jArr[4]);
        long u6 = C0114h.m321u(jArr[5]);
        long j5 = (u5 & UnsignedInteger.INT_MASK) | (u6 << 32);
        long j6 = (u5 >>> 32) | (u6 & -4294967296L);
        long u7 = C0114h.m321u(jArr[6]);
        long j7 = u7 & UnsignedInteger.INT_MASK;
        long j8 = u7 >>> 32;
        return new C7832c1(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (j5 ^ (j6 << 44)) ^ (j4 >>> 20), (((j8 << 44) ^ j7) ^ (j6 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j8 >>> 20) ^ (j4 << 13)), (j6 << 13) ^ (j4 >>> 51), (j6 >>> 51) ^ (j8 << 13)});
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        long[] jArr = this.f17296f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        long[] jArr = this.f17296f;
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17296f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        return ((int) this.f17296f[0]) & 1;
    }
}
