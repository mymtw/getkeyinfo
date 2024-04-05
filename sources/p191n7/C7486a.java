package p191n7;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C19388s;
import p267v7.C8212a;

/* renamed from: n7.a */
public final class C7486a {

    /* renamed from: a */
    public int f16688a;

    /* renamed from: b */
    public int f16689b;

    /* renamed from: c */
    public int[][] f16690c;

    /* renamed from: d */
    public int f16691d;

    public C7486a(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length == ((i + 31) >> 5)) {
            this.f16689b = i;
            this.f16688a = iArr.length;
            this.f16691d = iArr2.length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.f16688a; i4++) {
                int[] iArr3 = iArr[i4];
                int i5 = this.f16691d - 1;
                iArr3[i5] = iArr3[i5] & i3;
            }
            this.f16690c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    /* renamed from: a */
    public final byte[] mo19825a() {
        int i = this.f16688a;
        int i2 = 8;
        byte[] bArr = new byte[((((this.f16689b + 7) >>> 3) * i) + 8)];
        C19388s.m32874n(i, 0, bArr);
        C19388s.m32874n(this.f16689b, 4, bArr);
        int i3 = this.f16689b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.f16688a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                C19388s.m32874n(this.f16690c[i6][i7], i2, bArr);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.f16690c[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C7486a)) {
            return false;
        }
        C7486a aVar = (C7486a) obj;
        if (this.f16688a != aVar.f16688a || this.f16689b != aVar.f16689b || this.f16691d != aVar.f16691d) {
            return false;
        }
        for (int i = 0; i < this.f16688a; i++) {
            int[] iArr = this.f16690c[i];
            int[] iArr2 = aVar.f16690c[i];
            if (iArr.length != iArr2.length) {
                z = false;
            } else {
                z = true;
                for (int length = iArr.length - 1; length >= 0; length--) {
                    z &= iArr[length] == iArr2[length];
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = (((this.f16688a * 31) + this.f16689b) * 31) + this.f16691d;
        for (int i2 = 0; i2 < this.f16688a; i2++) {
            i = (i * 31) + C8212a.m16496c(this.f16690c[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.f16689b & 31;
        int i2 = this.f16691d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f16688a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f16690c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f16690c[i3][this.f16691d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public C7486a(C7486a aVar) {
        this.f16689b = aVar.f16689b;
        this.f16688a = aVar.f16688a;
        this.f16691d = aVar.f16691d;
        this.f16690c = new int[aVar.f16690c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f16690c;
            if (i < iArr.length) {
                int[] iArr2 = aVar.f16690c[i];
                int[] iArr3 = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                iArr[i] = iArr3;
                i++;
            } else {
                return;
            }
        }
    }

    public C7486a(byte[] bArr) {
        if (bArr.length >= 9) {
            this.f16688a = C19388s.m32865i(0, bArr);
            int i = C19388s.m32865i(4, bArr);
            this.f16689b = i;
            int i2 = this.f16688a;
            int i3 = ((i + 7) >>> 3) * i2;
            if (i2 > 0) {
                int i4 = 8;
                if (i3 == bArr.length - 8) {
                    int i5 = (i + 31) >>> 5;
                    this.f16691d = i5;
                    int[] iArr = new int[2];
                    iArr[1] = i5;
                    iArr[0] = i2;
                    this.f16690c = (int[][]) Array.newInstance(Integer.TYPE, iArr);
                    int i6 = this.f16689b;
                    int i7 = i6 >> 5;
                    int i8 = i6 & 31;
                    for (int i9 = 0; i9 < this.f16688a; i9++) {
                        int i10 = 0;
                        while (i10 < i7) {
                            this.f16690c[i9][i10] = C19388s.m32865i(i4, bArr);
                            i10++;
                            i4 += 4;
                        }
                        int i11 = 0;
                        while (i11 < i8) {
                            int[] iArr2 = this.f16690c[i9];
                            iArr2[i7] = ((bArr[i4] & 255) << i11) ^ iArr2[i7];
                            i11 += 8;
                            i4++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
