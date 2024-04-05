package p209p6;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;

/* renamed from: p6.g */
public final class C7693g implements Cloneable {

    /* renamed from: c */
    public static final short[] f17059c = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: d */
    public static final byte[] f17060d = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: b */
    public long[] f17061b;

    public C7693g(int i) {
        this.f17061b = new long[i];
    }

    public C7693g(BigInteger bigInteger) {
        int i;
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        } else if (bigInteger.signum() == 0) {
            this.f17061b = new long[]{0};
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
                i = 1;
            } else {
                i = 0;
            }
            int i2 = (length + 7) / 8;
            this.f17061b = new long[i2];
            int i3 = i2 - 1;
            int i4 = (length % 8) + i;
            if (i < i4) {
                long j = 0;
                while (i < i4) {
                    j = (j << 8) | ((long) (byteArray[i] & 255));
                    i++;
                }
                this.f17061b[i3] = j;
                i3--;
            }
            while (i3 >= 0) {
                long j2 = 0;
                int i5 = 0;
                while (i5 < 8) {
                    j2 = (j2 << 8) | ((long) (byteArray[i] & 255));
                    i5++;
                    i++;
                }
                this.f17061b[i3] = j2;
                i3--;
            }
        }
    }

    public C7693g(long[] jArr) {
        this.f17061b = jArr;
    }

    public C7693g(long[] jArr, int i) {
        if (i == jArr.length) {
            this.f17061b = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.f17061b = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v12, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v12, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14880a(long r3) {
        /*
            r0 = 32
            long r1 = r3 >>> r0
            int r1 = (int) r1
            if (r1 != 0) goto L_0x0009
            int r1 = (int) r3
            r0 = 0
        L_0x0009:
            int r3 = r1 >>> 16
            if (r3 != 0) goto L_0x001d
            int r3 = r1 >>> 8
            if (r3 != 0) goto L_0x0016
            byte[] r3 = f17060d
            byte r3 = r3[r1]
            goto L_0x002e
        L_0x0016:
            byte[] r4 = f17060d
            byte r3 = r4[r3]
            int r3 = r3 + 8
            goto L_0x002e
        L_0x001d:
            int r4 = r3 >>> 8
            if (r4 != 0) goto L_0x0028
            byte[] r4 = f17060d
            byte r3 = r4[r3]
            int r3 = r3 + 16
            goto L_0x002e
        L_0x0028:
            byte[] r3 = f17060d
            byte r3 = r3[r4]
            int r3 = r3 + 24
        L_0x002e:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p6.C7693g.m14880a(long):int");
    }

    /* renamed from: b */
    public static void m14881b(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    /* renamed from: c */
    public static void m14882c(int i, long j, long[] jArr) {
        int i2 = 0 + (i >>> 6);
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = jArr[i2] ^ j;
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    /* renamed from: d */
    public static void m14883d(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        long[] jArr3 = jArr2;
        long[] jArr4 = jArr;
        if ((j & 1) != 0) {
            m14881b(0, 0, i2, jArr3, jArr4);
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 != 0) {
                if ((j3 & 1) != 0) {
                    long l = m14886l(jArr2, 0, jArr, 0, i, i3);
                    if (l != 0) {
                        int i4 = 0 + i2;
                        jArr3[i4] = l ^ jArr3[i4];
                    }
                }
                i3++;
                j2 = j3;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public static void m14884i(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
    }

    /* renamed from: k */
    public static int m14885k(long[] jArr, int i, int i2, int[] iArr) {
        long[] jArr2 = jArr;
        int i3 = i;
        int i4 = i2;
        int[] iArr2 = iArr;
        int i5 = (i4 + 63) >>> 6;
        if (i3 < i5) {
            return i3;
        }
        int i6 = i3 << 6;
        int min = Math.min(i6, (i4 << 1) - 1);
        int i7 = i6 - min;
        while (i7 >= 64) {
            i3--;
            i7 -= 64;
        }
        int length = iArr2.length;
        int i8 = iArr2[length - 1];
        int i9 = length > 1 ? iArr2[length - 2] : 0;
        int max = Math.max(i4, i8 + 64);
        int min2 = (Math.min(min - max, i4 - i9) + i7) >> 6;
        if (min2 > 1) {
            int i10 = i3 - min2;
            min = i10 << 6;
            int i11 = min - i4;
            int length2 = iArr2.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                m14888r(jArr2, jArr2, 0 + i10, i3 - i10, i11 + iArr2[length2]);
            }
            m14888r(jArr2, jArr2, 0 + i10, i3 - i10, i11);
            while (i3 > i10) {
                i3--;
                jArr2[0 + i3] = 0;
            }
        }
        if (min > max) {
            int i12 = max >>> 6;
            while (true) {
                i3--;
                if (i3 <= i12) {
                    break;
                }
                int i13 = 0 + i3;
                long j = jArr2[i13];
                if (j != 0) {
                    jArr2[i13] = 0;
                    int i14 = (i3 << 6) - i4;
                    int length3 = iArr2.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        m14882c(iArr2[length3] + i14, j, jArr2);
                    }
                    m14882c(i14, j, jArr2);
                }
            }
            int i15 = max & 63;
            int i16 = i12 + 0;
            long j2 = jArr2[i16];
            long j3 = j2 >>> i15;
            if (j3 != 0) {
                jArr2[i16] = j2 ^ (j3 << i15);
                int i17 = max - i4;
                int length4 = iArr2.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    m14882c(iArr2[length4] + i17, j3, jArr2);
                }
                m14882c(i17, j3, jArr2);
            }
        } else {
            max = min;
        }
        if (max > i4) {
            while (true) {
                max--;
                if (max < i4) {
                    break;
                }
                long j4 = 1 << (max & 63);
                int i18 = (max >>> 6) + 0;
                long j5 = jArr2[i18];
                if ((j5 & j4) != 0) {
                    jArr2[i18] = j4 ^ j5;
                    int i19 = max - i4;
                    int length5 = iArr2.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        int i20 = iArr2[length5] + i19;
                        int i21 = (i20 >>> 6) + 0;
                        jArr2[i21] = (1 << (i20 & 63)) ^ jArr2[i21];
                    }
                    int i22 = (i19 >>> 6) + 0;
                    jArr2[i22] = (1 << (i19 & 63)) ^ jArr2[i22];
                }
            }
        }
        return i5;
    }

    /* renamed from: l */
    public static long m14886l(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        int i6 = i3;
        for (int i7 = 0; i7 < i6; i7++) {
            long j2 = jArr2[i2 + i7];
            int i8 = i + i7;
            jArr[i8] = (j | (j2 << i4)) ^ jArr[i8];
            j = j2 >>> i5;
        }
        return j;
    }

    /* renamed from: q */
    public static long m14887q(int i) {
        short[] sArr = f17059c;
        short s = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        short s2 = sArr[(i >>> 16) & 255];
        return (((long) s) & UnsignedInteger.INT_MASK) | ((((long) ((sArr[i >>> 24] << 16) | s2)) & UnsignedInteger.INT_MASK) << 32);
    }

    /* renamed from: r */
    public static void m14888r(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        int i4 = i;
        int i5 = 0 + (i3 >>> 6);
        int i6 = i3 & 63;
        int i7 = i2;
        if (i6 == 0) {
            m14881b(i5, i4, i7, jArr3, jArr4);
            return;
        }
        int i8 = i5 + 1;
        int i9 = 64 - i6;
        int i10 = 64 - i9;
        long j = 0;
        while (true) {
            i7--;
            if (i7 >= 0) {
                long j2 = jArr4[i4 + i7];
                int i11 = i8 + i7;
                jArr3[i11] = (j | (j2 >>> i9)) ^ jArr3[i11];
                j = j2 << i10;
            } else {
                jArr3[i5] = jArr3[i5] ^ j;
                return;
            }
        }
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.f17061b;
        if (jArr2 == null) {
            jArr = null;
        } else {
            long[] jArr3 = new long[jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        return new C7693g(jArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7693g)) {
            return false;
        }
        C7693g gVar = (C7693g) obj;
        int o = mo20159o();
        if (gVar.mo20159o() != o) {
            return false;
        }
        for (int i = 0; i < o; i++) {
            if (this.f17061b[i] != gVar.f17061b[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo20154f(C7693g gVar) {
        int o = gVar.mo20159o();
        if (o != 0) {
            int i = o + 0;
            long[] jArr = this.f17061b;
            if (i > jArr.length) {
                long[] jArr2 = new long[i];
                System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i));
                this.f17061b = jArr2;
            }
            m14881b(0, 0, o, this.f17061b, gVar.f17061b);
        }
    }

    /* renamed from: h */
    public final void mo20155h(C7693g gVar, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            m14881b(i4, 0, i3, this.f17061b, gVar.f17061b);
            return;
        }
        long l = m14886l(this.f17061b, i4, gVar.f17061b, 0, i3, i5);
        if (l != 0) {
            long[] jArr = this.f17061b;
            int i6 = i3 + i4;
            jArr[i6] = l ^ jArr[i6];
        }
    }

    public final int hashCode() {
        int o = mo20159o();
        int i = 1;
        for (int i2 = 0; i2 < o; i2++) {
            long j = this.f17061b[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    /* renamed from: j */
    public final boolean mo20157j() {
        long[] jArr = this.f17061b;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C7693g mo20158m(C7693g gVar) {
        int i;
        int i2;
        C7693g gVar2;
        C7693g gVar3;
        long[] jArr;
        int i3;
        int p = mo20160p();
        if (p == 0) {
            return this;
        }
        int p2 = gVar.mo20160p();
        if (p2 == 0) {
            return gVar;
        }
        if (p > p2) {
            i = p;
            i2 = p2;
            gVar3 = this;
            gVar2 = gVar;
        } else {
            i2 = p;
            i = p2;
            gVar2 = this;
            gVar3 = gVar;
        }
        int i4 = (i2 + 63) >>> 6;
        int i5 = (i + 63) >>> 6;
        int i6 = ((i2 + i) + 62) >>> 6;
        if (i4 == 1) {
            long j = gVar2.f17061b[0];
            if (j == 1) {
                return gVar3;
            }
            long[] jArr2 = new long[i6];
            m14883d(j, gVar3.f17061b, i5, jArr2);
            return new C7693g(jArr2, i6);
        }
        int i7 = ((i + 7) + 63) >>> 6;
        int[] iArr = new int[16];
        int i8 = i7 << 4;
        long[] jArr3 = new long[i8];
        iArr[1] = i7;
        System.arraycopy(gVar3.f17061b, 0, jArr3, i7, i5);
        int i9 = 2;
        int i10 = i7;
        while (i9 < 16) {
            i10 += i7;
            iArr[i9] = i10;
            if ((i9 & 1) == 0) {
                jArr = jArr3;
                i3 = i8;
                m14884i(jArr3, i10 >>> 1, jArr3, i10, i7, 1);
            } else {
                jArr = jArr3;
                i3 = i8;
                int i11 = i10 - i7;
                for (int i12 = 0; i12 < i7; i12++) {
                    jArr[i10 + i12] = jArr[i7 + i12] ^ jArr[i11 + i12];
                }
            }
            i9++;
            i8 = i3;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i13 = i8;
        long[] jArr5 = new long[i13];
        m14884i(jArr4, 0, jArr5, 0, i13, 4);
        long[] jArr6 = gVar2.f17061b;
        int i14 = i6 << 3;
        long[] jArr7 = new long[i14];
        for (int i15 = 0; i15 < i4; i15++) {
            long j2 = jArr6[i15];
            int i16 = i15;
            while (true) {
                long j3 = j2 >>> 4;
                int i17 = iArr[((int) j2) & 15];
                int i18 = iArr[((int) j3) & 15];
                for (int i19 = 0; i19 < i7; i19++) {
                    int i20 = i16 + i19;
                    jArr7[i20] = jArr7[i20] ^ (jArr4[i17 + i19] ^ jArr5[i18 + i19]);
                }
                j2 = j3 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i16 += i6;
            }
        }
        while (true) {
            i14 -= i6;
            if (i14 == 0) {
                return new C7693g(jArr7, i6);
            }
            m14886l(jArr7, i14 - i6, jArr7, i14, i6, 8);
        }
    }

    /* renamed from: o */
    public final int mo20159o() {
        long[] jArr = this.f17061b;
        int min = Math.min(jArr.length, jArr.length);
        if (min < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            do {
                min--;
            } while (jArr[min] == 0);
        } else {
            do {
                min--;
                if (jArr[min] != 0) {
                }
            } while (min > 0);
            return 0;
        }
        return min + 1;
    }

    /* renamed from: p */
    public final int mo20160p() {
        int length = this.f17061b.length;
        while (length != 0) {
            length--;
            long j = this.f17061b[length];
            if (j != 0) {
                return m14880a(j) + (length << 6);
            }
        }
        return 0;
    }

    public final String toString() {
        int o = mo20159o();
        if (o == 0) {
            return "0";
        }
        int i = o - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f17061b[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f17061b[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }
}
