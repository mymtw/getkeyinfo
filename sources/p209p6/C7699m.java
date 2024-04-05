package p209p6;

import androidx.core.internal.view.SupportMenu;
import androidx.work.C3436p;
import com.google.protobuf.C16910l;
import java.math.BigInteger;

/* renamed from: p6.m */
public final class C7699m extends C3436p {
    /* renamed from: n */
    public final C7686e mo12959n(C7686e eVar, BigInteger bigInteger) {
        int[] iArr;
        C7686e eVar2;
        C7686e eVar3 = eVar;
        BigInteger bigInteger2 = bigInteger;
        int max = Math.max(2, Math.min(16, C16910l.m28287a(bigInteger.bitLength())));
        C7700n c = C16910l.m28289c(eVar3, max);
        C7686e[] eVarArr = c.f17073a;
        C7686e[] eVarArr2 = c.f17074b;
        if (max == 2) {
            if ((bigInteger.bitLength() >>> 16) != 0) {
                throw new IllegalArgumentException("'k' must have bitlength < 2^16");
            } else if (bigInteger.signum() == 0) {
                iArr = C16910l.f37247c;
            } else {
                BigInteger add = bigInteger2.shiftLeft(1).add(bigInteger2);
                int bitLength = add.bitLength();
                int i = bitLength >> 1;
                int[] iArr2 = new int[i];
                BigInteger xor = add.xor(bigInteger2);
                int i2 = bitLength - 1;
                int i3 = 0;
                int i4 = 0;
                int i5 = 1;
                while (i5 < i2) {
                    if (!xor.testBit(i5)) {
                        i4++;
                    } else {
                        iArr2[i3] = i4 | ((bigInteger2.testBit(i5) ? -1 : 1) << 16);
                        i5++;
                        i4 = 1;
                        i3++;
                    }
                    i5++;
                }
                int i6 = i3 + 1;
                iArr2[i3] = 65536 | i4;
                if (i > i6) {
                    int[] iArr3 = new int[i6];
                    System.arraycopy(iArr2, 0, iArr3, 0, i6);
                    iArr = iArr3;
                } else {
                    iArr = iArr2;
                }
            }
        } else if (max < 2 || max > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (bigInteger.signum() == 0) {
            iArr = C16910l.f37247c;
        } else {
            int bitLength2 = (bigInteger.bitLength() / max) + 1;
            int[] iArr4 = new int[bitLength2];
            int i7 = 1 << max;
            int i8 = i7 - 1;
            int i9 = i7 >>> 1;
            int i10 = 0;
            int i11 = 0;
            boolean z = false;
            while (i10 <= bigInteger2.bitLength()) {
                if (bigInteger2.testBit(i10) == z) {
                    i10++;
                } else {
                    bigInteger2 = bigInteger2.shiftRight(i10);
                    int intValue = bigInteger2.intValue() & i8;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i9) != 0;
                    if (z) {
                        intValue -= i7;
                    }
                    if (i11 > 0) {
                        i10--;
                    }
                    iArr4[i11] = (intValue << 16) | i10;
                    i10 = max;
                    i11++;
                }
            }
            if (bitLength2 > i11) {
                iArr = new int[i11];
                System.arraycopy(iArr4, 0, iArr, 0, i11);
            } else {
                iArr = iArr4;
            }
        }
        C7686e p = eVar3.f17048a.mo20089p();
        int length = iArr.length;
        if (length > 1) {
            length--;
            int i12 = iArr[length];
            int i13 = i12 >> 16;
            int i14 = i12 & SupportMenu.USER_MASK;
            int abs = Math.abs(i13);
            C7686e[] eVarArr3 = i13 < 0 ? eVarArr2 : eVarArr;
            if ((abs << 2) < (1 << max)) {
                byte b = C7693g.f17060d[abs];
                int i15 = max - b;
                eVar2 = eVarArr3[((1 << (max - 1)) - 1) >>> 1].mo20131j(eVarArr3[(((abs ^ (1 << (b - 1))) << i15) + 1) >>> 1]);
                i14 -= i15;
            } else {
                eVar2 = eVarArr3[abs >>> 1];
            }
            p = eVar2.mo20128h(i14);
        }
        while (length > 0) {
            length--;
            int i16 = iArr[length];
            int i17 = i16 >> 16;
            p = p.mo20134m((i17 < 0 ? eVarArr2 : eVarArr)[Math.abs(i17) >>> 1]).mo20128h(i16 & SupportMenu.USER_MASK);
        }
        return p;
    }
}
