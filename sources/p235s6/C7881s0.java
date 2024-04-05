package p235s6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import kotlin.jvm.internal.C19382n;
import p209p6.C7681d;
import p267v7.C8212a;

/* renamed from: s6.s0 */
public final class C7881s0 extends C7681d.C7683b {

    /* renamed from: g */
    public static final BigInteger f17339g = C7822a.f17282j;

    /* renamed from: f */
    public int[] f17340f;

    public C7881s0() {
        this.f17340f = new int[4];
    }

    public C7881s0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f17339g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        } else {
            int[] iArr = new int[4];
            int i = 0;
            while (bigInteger.signum() != 0) {
                iArr[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
                i++;
            }
            if ((iArr[3] >>> 1) >= 2147483646) {
                int[] iArr2 = C19382n.f43259i;
                if (C3436p.m8255r(iArr, iArr2)) {
                    long j = ((((long) iArr[0]) & UnsignedInteger.INT_MASK) - (((long) iArr2[0]) & UnsignedInteger.INT_MASK)) + 0;
                    iArr[0] = (int) j;
                    long j2 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - (((long) iArr2[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
                    iArr[1] = (int) j2;
                    long j3 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - (((long) iArr2[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
                    iArr[2] = (int) j3;
                    iArr[3] = (int) (((((long) iArr[3]) & UnsignedInteger.INT_MASK) - (((long) iArr2[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32));
                }
            }
            this.f17340f = iArr;
        }
    }

    public C7881s0(int[] iArr) {
        this.f17340f = iArr;
    }

    /* renamed from: a */
    public final BigInteger mo20092a() {
        int[] iArr = this.f17340f;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C3436p.m8242d(i2, (3 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: c */
    public final C7681d mo20094c(C7681d dVar) {
        int[] iArr = new int[4];
        C19382n.m32779x(this.f17340f, ((C7881s0) dVar).f17340f, iArr);
        return new C7881s0(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7881s0)) {
            return false;
        }
        int[] iArr = this.f17340f;
        int[] iArr2 = ((C7881s0) obj).f17340f;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20097f() {
        return f17339g.bitLength();
    }

    /* renamed from: g */
    public final C7681d mo20098g(C7681d dVar) {
        int[] iArr = new int[4];
        C19382n.m32734V(this.f17340f, ((C7881s0) dVar).f17340f, iArr);
        return new C7881s0(iArr);
    }

    public final int hashCode() {
        return f17339g.hashCode() ^ C8212a.m16494a(4, this.f17340f);
    }

    /* renamed from: i */
    public final C7681d mo20100i() {
        int[] iArr = new int[4];
        if (C2606m.m6124S(4, this.f17340f, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && C3436p.m8255r(iArr, C19382n.f43259i))) {
            C19382n.m32777w(iArr);
        }
        return new C7881s0(iArr);
    }

    /* renamed from: j */
    public final C7681d mo20101j(C7681d dVar) {
        int[] iArr = new int[4];
        C19382n.m32711H(this.f17340f, ((C7881s0) dVar).f17340f, iArr);
        return new C7881s0(iArr);
    }

    /* renamed from: k */
    public final C7681d mo20102k() {
        int[] iArr = new int[4];
        int[] iArr2 = this.f17340f;
        if (C3436p.m8254q(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        } else {
            C3436p.m8235I(C19382n.f43259i, iArr2, iArr);
        }
        return new C7881s0(iArr);
    }

    /* renamed from: l */
    public final C7681d mo20103l(C7681d dVar) {
        int[] iArr = new int[4];
        C3039b.m7135D(C19382n.f43259i, ((C7881s0) dVar).f17340f, iArr);
        C19382n.m32711H(iArr, this.f17340f, iArr);
        return new C7881s0(iArr);
    }

    /* renamed from: m */
    public final C7681d mo20104m() {
        int[] iArr = new int[4];
        C19382n.m32733U(this.f17340f, iArr);
        return new C7881s0(iArr);
    }

    /* renamed from: n */
    public final C7681d mo20105n() {
        int[] iArr = new int[4];
        C3039b.m7135D(C19382n.f43259i, this.f17340f, iArr);
        return new C7881s0(iArr);
    }

    /* renamed from: o */
    public final C7681d mo20106o() {
        boolean z;
        int[] iArr = this.f17340f;
        if (!C3436p.m8254q(iArr)) {
            boolean z2 = false;
            if (iArr[0] == 1) {
                int i = 1;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else if (iArr[i] != 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                int[] iArr2 = new int[4];
                C19382n.m32733U(iArr, iArr2);
                C19382n.m32711H(iArr2, iArr, iArr2);
                int[] iArr3 = new int[4];
                C19382n.m32771t(2, iArr2, iArr3);
                C19382n.m32711H(iArr3, iArr2, iArr3);
                int[] iArr4 = new int[4];
                C19382n.m32771t(4, iArr3, iArr4);
                C19382n.m32711H(iArr4, iArr3, iArr4);
                C19382n.m32771t(2, iArr4, iArr3);
                C19382n.m32711H(iArr3, iArr2, iArr3);
                C19382n.m32771t(10, iArr3, iArr2);
                C19382n.m32711H(iArr2, iArr3, iArr2);
                C19382n.m32771t(10, iArr2, iArr4);
                C19382n.m32711H(iArr4, iArr3, iArr4);
                C19382n.m32733U(iArr4, iArr3);
                C19382n.m32711H(iArr3, iArr, iArr3);
                C19382n.m32771t(95, iArr3, iArr3);
                C19382n.m32733U(iArr3, iArr4);
                int i2 = 3;
                while (true) {
                    if (i2 < 0) {
                        z2 = true;
                        break;
                    } else if (iArr[i2] != iArr4[i2]) {
                        break;
                    } else {
                        i2--;
                    }
                }
                if (z2) {
                    return new C7881s0(iArr3);
                }
                return null;
            }
        }
        return this;
    }

    /* renamed from: q */
    public final boolean mo20108q() {
        int[] iArr = this.f17340f;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo20109r() {
        return C3436p.m8254q(this.f17340f);
    }

    /* renamed from: s */
    public final boolean mo20110s() {
        return (this.f17340f[0] & 1) == 1;
    }
}
