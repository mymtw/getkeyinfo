package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.x0 */
public final class C7896x0 extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17356f;

    public C7896x0() {
        this.f17356f = new long[5];
    }

    public C7896x0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[5];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[4];
            long j2 = j >>> 27;
            jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
            jArr[4] = j & 134217727;
            this.f17356f = jArr;
        }
    }

    public C7896x0(long[] jArr) {
        this.f17356f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        long[] jArr = this.f17356f;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                C3436p.m8246h(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        C7893w0.m15749b(this.f17356f, i, jArr);
        return new C7896x0(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17356f;
        long[] jArr2 = ((C7896x0) dVar).f17356f;
        return new C7896x0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17356f;
        long[] jArr2 = ((C7896x0) dVar).f17356f;
        long[] jArr3 = ((C7896x0) dVar2).f17356f;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        C7893w0.m15756i(jArr, jArr5);
        C7893w0.m15750c(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        C7893w0.m15754g(jArr2, jArr3, jArr6);
        C7893w0.m15750c(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        C7893w0.m15751d(jArr4, jArr7);
        return new C7896x0(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7896x0)) {
            return false;
        }
        long[] jArr = this.f17356f;
        long[] jArr2 = ((C7896x0) obj).f17356f;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 283;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17356f;
        long[] jArr2 = ((C7896x0) dVar).f17356f;
        long[] jArr3 = ((C7896x0) dVar2).f17356f;
        long[] jArr4 = ((C7896x0) dVar3).f17356f;
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[10];
        C7893w0.m15754g(jArr, jArr2, jArr6);
        C7893w0.m15750c(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[10];
        C7893w0.m15754g(jArr3, jArr4, jArr7);
        C7893w0.m15750c(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[5];
        C7893w0.m15751d(jArr5, jArr8);
        return new C7896x0(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17356f, 5) ^ 2831275;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17356f;
        return new C7896x0(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[5];
        C7893w0.m15752e(this.f17356f, ((C7896x0) dVar).f17356f, jArr);
        return new C7896x0(jArr);
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
        long[] jArr = new long[5];
        C7893w0.m15753f(this.f17356f, jArr);
        return new C7896x0(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f17356f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 5) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[5];
            long[] jArr4 = new long[5];
            C7893w0.m15753f(jArr2, jArr3);
            C7893w0.m15752e(jArr3, jArr2, jArr3);
            C7893w0.m15749b(jArr3, 2, jArr4);
            C7893w0.m15752e(jArr4, jArr3, jArr4);
            C7893w0.m15749b(jArr4, 4, jArr3);
            C7893w0.m15752e(jArr3, jArr4, jArr3);
            C7893w0.m15749b(jArr3, 8, jArr4);
            C7893w0.m15752e(jArr4, jArr3, jArr4);
            C7893w0.m15753f(jArr4, jArr4);
            C7893w0.m15752e(jArr4, jArr2, jArr4);
            C7893w0.m15749b(jArr4, 17, jArr3);
            C7893w0.m15752e(jArr3, jArr4, jArr3);
            C7893w0.m15753f(jArr3, jArr3);
            C7893w0.m15752e(jArr3, jArr2, jArr3);
            C7893w0.m15749b(jArr3, 35, jArr4);
            C7893w0.m15752e(jArr4, jArr3, jArr4);
            C7893w0.m15749b(jArr4, 70, jArr3);
            C7893w0.m15752e(jArr3, jArr4, jArr3);
            C7893w0.m15753f(jArr3, jArr3);
            C7893w0.m15752e(jArr3, jArr2, jArr3);
            C7893w0.m15749b(jArr3, 141, jArr4);
            C7893w0.m15752e(jArr4, jArr3, jArr4);
            C7893w0.m15753f(jArr4, jArr);
            return new C7896x0(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f17356f;
        long[] jArr3 = new long[5];
        long u = C0114h.m321u(jArr2[0]);
        long u2 = C0114h.m321u(jArr2[1]);
        long j = (u & UnsignedInteger.INT_MASK) | (u2 << 32);
        jArr3[0] = (u >>> 32) | (u2 & -4294967296L);
        long u3 = C0114h.m321u(jArr2[2]);
        long u4 = C0114h.m321u(jArr2[3]);
        jArr3[1] = (u3 >>> 32) | (u4 & -4294967296L);
        long u5 = C0114h.m321u(jArr2[4]);
        long j2 = UnsignedInteger.INT_MASK & u5;
        jArr3[2] = u5 >>> 32;
        C7893w0.m15752e(jArr3, C7893w0.f17352a, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ ((u3 & UnsignedInteger.INT_MASK) | (u4 << 32));
        jArr[2] = jArr[2] ^ j2;
        return new C7896x0(jArr);
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        long[] jArr = this.f17356f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        long[] jArr = this.f17356f;
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17356f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        long[] jArr = this.f17356f;
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
