package p235s6;

import androidx.activity.C0114h;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import kotlin.jvm.internal.C19382n;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.q */
public final class C7874q extends C7681d.C7682a {

    /* renamed from: f */
    public long[] f17334f;

    public C7874q() {
        this.f17334f = new long[2];
    }

    public C7874q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[2];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[1];
            long j2 = j >>> 49;
            jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
            jArr[1] = j & 562949953421311L;
            this.f17334f = jArr;
        }
    }

    public C7874q(long[] jArr) {
        this.f17334f = jArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        long[] jArr = this.f17334f;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                C3436p.m8246h(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: b */
    public final C7681d mo20093b(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        C19382n.m32781y(this.f17334f, i, jArr);
        return new C7874q(jArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        long[] jArr = this.f17334f;
        long[] jArr2 = ((C7874q) dVar).f17334f;
        return new C7874q(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    /* renamed from: d */
    public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        long[] jArr = this.f17334f;
        long[] jArr2 = ((C7874q) dVar).f17334f;
        long[] jArr3 = ((C7874q) dVar2).f17334f;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        C19382n.m32743d0(jArr, jArr5);
        C19382n.m32713I(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        C19382n.m32739a0(jArr2, jArr3, jArr6);
        C19382n.m32713I(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        C19382n.m32723N(jArr4, jArr7);
        return new C7874q(jArr7);
    }

    /* renamed from: e */
    public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20099h(dVar, dVar2, dVar3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7874q)) {
            return false;
        }
        long[] jArr = this.f17334f;
        long[] jArr2 = ((C7874q) obj).f17334f;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return 113;
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        return mo20094c(dVar);
    }

    /* renamed from: h */
    public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        long[] jArr = this.f17334f;
        long[] jArr2 = ((C7874q) dVar).f17334f;
        long[] jArr3 = ((C7874q) dVar2).f17334f;
        long[] jArr4 = ((C7874q) dVar3).f17334f;
        long[] jArr5 = new long[4];
        long[] jArr6 = new long[4];
        C19382n.m32739a0(jArr, jArr2, jArr6);
        C19382n.m32713I(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[4];
        C19382n.m32739a0(jArr3, jArr4, jArr7);
        C19382n.m32713I(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[2];
        C19382n.m32723N(jArr5, jArr8);
        return new C7874q(jArr8);
    }

    public final int hashCode() {
        return C8212a.m16497d(this.f17334f, 2) ^ 113009;
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        long[] jArr = this.f17334f;
        return new C7874q(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        long[] jArr = new long[2];
        C19382n.m32725O(this.f17334f, ((C7874q) dVar).f17334f, jArr);
        return new C7874q(jArr);
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
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        C19382n.m32743d0(this.f17334f, jArr2);
        C19382n.m32723N(jArr2, jArr);
        return new C7874q(jArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        long[] jArr = new long[2];
        long[] jArr2 = this.f17334f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            long[] jArr5 = new long[4];
            C19382n.m32743d0(jArr2, jArr5);
            C19382n.m32723N(jArr5, jArr3);
            C19382n.m32725O(jArr3, jArr2, jArr3);
            long[] jArr6 = new long[4];
            C19382n.m32743d0(jArr3, jArr6);
            C19382n.m32723N(jArr6, jArr3);
            C19382n.m32725O(jArr3, jArr2, jArr3);
            C19382n.m32781y(jArr3, 3, jArr4);
            C19382n.m32725O(jArr4, jArr3, jArr4);
            long[] jArr7 = new long[4];
            C19382n.m32743d0(jArr4, jArr7);
            C19382n.m32723N(jArr7, jArr4);
            C19382n.m32725O(jArr4, jArr2, jArr4);
            C19382n.m32781y(jArr4, 7, jArr3);
            C19382n.m32725O(jArr3, jArr4, jArr3);
            C19382n.m32781y(jArr3, 14, jArr4);
            C19382n.m32725O(jArr4, jArr3, jArr4);
            C19382n.m32781y(jArr4, 28, jArr3);
            C19382n.m32725O(jArr3, jArr4, jArr3);
            C19382n.m32781y(jArr3, 56, jArr4);
            C19382n.m32725O(jArr4, jArr3, jArr4);
            long[] jArr8 = new long[4];
            C19382n.m32743d0(jArr4, jArr8);
            C19382n.m32723N(jArr8, jArr);
            return new C7874q(jArr);
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        long[] jArr = this.f17334f;
        long u = C0114h.m321u(jArr[0]);
        long u2 = C0114h.m321u(jArr[1]);
        long j = (u >>> 32) | (u2 & -4294967296L);
        return new C7874q(new long[]{((j << 57) ^ ((UnsignedInteger.INT_MASK & u) | (u2 << 32))) ^ (j << 5), (j >>> 7) ^ (j >>> 59)});
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        long[] jArr = this.f17334f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        long[] jArr = this.f17334f;
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17334f[0] & 1) != 0;
    }

    /* renamed from: u */
    public final int mo20113u() {
        return ((int) this.f17334f[0]) & 1;
    }
}
