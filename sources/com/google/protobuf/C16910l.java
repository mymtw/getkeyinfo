package com.google.protobuf;

import android.graphics.Path;
import java.math.BigInteger;
import java.util.Hashtable;
import p209p6.C7676c;
import p209p6.C7686e;
import p209p6.C7695i;
import p209p6.C7700n;
import p209p6.C7702p;

/* renamed from: com.google.protobuf.l */
public abstract class C16910l {

    /* renamed from: a */
    public static final int[] f37245a = {13, 41, 121, 337, 897, 2305};

    /* renamed from: b */
    public static final byte[] f37246b = new byte[0];

    /* renamed from: c */
    public static final int[] f37247c = new int[0];

    /* renamed from: d */
    public static final C7686e[] f37248d = new C7686e[0];

    /* renamed from: a */
    public static int m28287a(int i) {
        int[] iArr = f37245a;
        int i2 = 0;
        while (i2 < 6 && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    /* renamed from: b */
    public static C7700n m28288b(C7686e eVar) {
        Hashtable hashtable;
        C7695i iVar;
        C7676c cVar = eVar.f17048a;
        cVar.getClass();
        if (cVar == eVar.f17048a) {
            synchronized (eVar) {
                hashtable = eVar.f17053f;
            }
            if (hashtable == null) {
                iVar = null;
            } else {
                synchronized (hashtable) {
                    iVar = (C7695i) hashtable.get("bc_wnaf");
                }
            }
            if (iVar instanceof C7700n) {
                return (C7700n) iVar;
            }
            return null;
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }

    /* renamed from: c */
    public static C7700n m28289c(C7686e eVar, int i) {
        C7676c cVar = eVar.f17048a;
        return (C7700n) cVar.mo20083j(eVar, "bc_wnaf", new C7702p(i, eVar, cVar));
    }

    /* renamed from: d */
    public static byte[] m28290d(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return f37246b;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength() - 1;
            byte[] bArr = new byte[bitLength];
            BigInteger xor = add.xor(bigInteger);
            int i2 = 1;
            while (i2 < bitLength) {
                if (xor.testBit(i2)) {
                    bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                    i2++;
                }
                i2++;
            }
            bArr[bitLength - 1] = 1;
            return bArr;
        } else if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return f37246b;
        } else {
            int bitLength2 = bigInteger.bitLength() + 1;
            byte[] bArr2 = new byte[bitLength2];
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = i3 >>> 1;
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            while (i6 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i6) == z) {
                    i6++;
                } else {
                    bigInteger = bigInteger.shiftRight(i6);
                    int intValue = bigInteger.intValue() & i4;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i5) != 0;
                    if (z) {
                        intValue -= i3;
                    }
                    if (i7 > 0) {
                        i6--;
                    }
                    int i8 = i7 + i6;
                    bArr2[i8] = (byte) intValue;
                    i7 = i8 + 1;
                    i6 = i;
                }
            }
            if (bitLength2 <= i7) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
    }

    /* renamed from: e */
    public String mo59236e() {
        return null;
    }

    /* renamed from: f */
    public String mo59259f() {
        return null;
    }

    /* renamed from: g */
    public abstract Path mo19794g(float f, float f2, float f3, float f4);

    /* renamed from: h */
    public String mo59237h() {
        return null;
    }
}
