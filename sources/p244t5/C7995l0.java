package p244t5;

import p267v7.C8212a;
import p267v7.C8217e;
import p276w7.C8262e;

/* renamed from: t5.l0 */
public final class C7995l0 extends C8018s1 implements C8036y1 {

    /* renamed from: b */
    public final byte[] f17483b;

    public C7995l0(byte[] bArr) {
        this.f17483b = bArr;
    }

    /* renamed from: b */
    public final String mo20515b() {
        byte[] bArr = this.f17483b;
        String str = C8217e.f18044a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = C8262e.f18099a;
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = C8262e.f18099a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 < 0) {
                        if (b2 == -2) {
                            break;
                        }
                        if (i4 <= 65535) {
                            if (i2 >= length) {
                                break;
                            }
                            cArr[i2] = (char) i4;
                            i2++;
                        } else if (i2 >= length - 1) {
                            break;
                        } else {
                            int i5 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 = i5 + 1;
                            cArr[i5] = (char) ((i4 & 1023) | 56320);
                        }
                        i = i3;
                    } else if (i3 >= bArr.length) {
                        break loop0;
                    } else {
                        int i6 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = C8262e.f18100b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i6;
                    }
                }
            } else if (i2 >= length) {
                break;
            } else {
                cArr[i2] = (char) b;
                i = i3;
                i2++;
            }
        }
        i2 = -1;
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(12, this.f17483b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7995l0)) {
            return false;
        }
        return C8212a.m16500g(this.f17483b, ((C7995l0) s1Var).f17483b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17483b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17483b.length) + 1 + this.f17483b.length;
    }

    public final String toString() {
        return mo20515b();
    }
}
