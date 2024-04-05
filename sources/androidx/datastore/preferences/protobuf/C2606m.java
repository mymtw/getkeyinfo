package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0070b;
import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;

/* renamed from: androidx.datastore.preferences.protobuf.m */
public abstract class C2606m {
    /* renamed from: A */
    public static int m6106A(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + (((long) iArr2[0]) & UnsignedInteger.INT_MASK) + (((long) iArr3[0]) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (((long) iArr2[1]) & UnsignedInteger.INT_MASK) + (((long) iArr3[1]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[2]) & UnsignedInteger.INT_MASK) + (((long) iArr3[2]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[3]) & UnsignedInteger.INT_MASK) + (((long) iArr3[3]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (((long) iArr2[4]) & UnsignedInteger.INT_MASK) + (((long) iArr3[4]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (((long) iArr2[5]) & UnsignedInteger.INT_MASK) + (((long) iArr3[5]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (((long) iArr2[6]) & UnsignedInteger.INT_MASK) + (((long) iArr3[6]) & UnsignedInteger.INT_MASK) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    /* renamed from: B */
    public static void m6107B(int i, int[] iArr, int[] iArr2) {
        m6119N(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                m6119N(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    public static void m6108C(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i4 + (i3 >> 25);
        int i12 = i6 + (i5 >> 25);
        int i13 = i9 + (i8 >> 25);
        int i14 = ((i10 >> 25) * 38) + i;
        int i15 = i2 + (i14 >> 26);
        int i16 = i7 + (i12 >> 26);
        iArr[0] = i14 & 67108863;
        iArr[1] = i15 & 67108863;
        iArr[2] = (i3 & 33554431) + (i15 >> 26);
        iArr[3] = i11 & 67108863;
        iArr[4] = (i5 & 33554431) + (i11 >> 26);
        iArr[5] = i12 & 67108863;
        iArr[6] = i16 & 67108863;
        iArr[7] = (i8 & 33554431) + (i16 >> 26);
        iArr[8] = i13 & 67108863;
        iArr[9] = (i10 & 33554431) + (i13 >> 26);
    }

    /* renamed from: D */
    public static void m6109D(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = i16;
        long j = (long) i;
        int i21 = i14;
        int i22 = iArr2[9];
        long j2 = (long) i2;
        long j3 = j * j2;
        int i23 = i2;
        long j4 = (long) i4;
        int i24 = i12;
        int i25 = i11;
        long j5 = (long) i3;
        long j6 = (j5 * j2) + (j * j4);
        int i26 = i4;
        long j7 = (long) i6;
        int i27 = i10;
        int i28 = i9;
        long j8 = (long) i5;
        long j9 = (j8 * j2) + (j5 * j4) + (j * j7);
        long j10 = ((j8 * j4) + (j5 * j7)) << 1;
        int i29 = i6;
        long j11 = (long) i8;
        long j12 = j4;
        long j13 = (long) i7;
        long b = C0070b.m181b(j13, j2, j * j11, j10);
        long j14 = (j8 * j7) << 1;
        long j15 = j7;
        int i30 = i8;
        long j16 = (long) i27;
        long j17 = (long) i28;
        long b2 = C0070b.m181b(j2, j17, (j13 * j12) + (j5 * j11) + (j * j16), j14);
        long j18 = (j13 * j15) + (j8 * j11) + (j5 * j16);
        long j19 = (j13 * j11) + (((j17 * j15) + (j8 * j16)) << 1);
        long j20 = (j11 * j17) + (j13 * j16);
        long j21 = (j17 * j16) << 1;
        long j22 = (long) i25;
        long j23 = (long) i24;
        int i31 = i21;
        long j24 = (long) i31;
        long j25 = j21;
        int i32 = i7;
        int i33 = i13;
        long j26 = (long) i33;
        long j27 = (j26 * j23) + (j22 * j24);
        long j28 = j20;
        int i34 = i31;
        long j29 = (long) i20;
        long j30 = j22 * j23;
        int i35 = i15;
        long j31 = (long) i35;
        long j32 = (j31 * j23) + (j26 * j24) + (j22 * j29);
        int i36 = i35;
        int i37 = i33;
        long j33 = (long) i18;
        long j34 = j24;
        long j35 = (long) i17;
        long j36 = j35;
        long j37 = j23;
        long b3 = C0070b.m181b(j36, j37, j22 * j33, ((j31 * j24) + (j26 * j29)) << 1);
        long j38 = (j31 * j29) << 1;
        long j39 = j29;
        int i38 = i22;
        long j40 = (long) i38;
        long j41 = (j35 * j34) + (j26 * j33) + (j22 * j40);
        int i39 = i19;
        long j42 = j35;
        long j43 = (long) i39;
        long j44 = (j31 * j33) + (j26 * j40);
        long j45 = j42;
        long j46 = (j43 * j34) + (j45 * j39) + j44;
        long j47 = j3 - (j46 * 76);
        long j48 = j6 - (((j45 * j33) + (((j43 * j39) + (j31 * j40)) << 1)) * 38);
        long j49 = j9 - (((j33 * j43) + (j45 * j40)) * 38);
        long j50 = b - ((j43 * j40) * 76);
        long j51 = j19 - j27;
        long j52 = j28 - j32;
        int i40 = i32 + i17;
        int i41 = i30 + i18;
        int i42 = i28 + i39;
        long j53 = (((j17 * j12) + j18) << 1) - j30;
        long j54 = (long) (i + i25);
        long j55 = (long) (i23 + i24);
        long j56 = j54 * j55;
        long b4 = C0070b.m181b(j23, j43, j41, j38);
        long j57 = (long) (i26 + i34);
        long j58 = j25 - b3;
        long j59 = (long) (i3 + i37);
        long j60 = (j59 * j55) + (j54 * j57);
        long j61 = (long) (i29 + i20);
        long j62 = (long) (i5 + i36);
        long j63 = (j62 * j55) + (j59 * j57) + (j54 * j61);
        long j64 = j62 * j57;
        long j65 = (long) i41;
        long j66 = j57;
        long j67 = (long) i40;
        long j68 = j67;
        long j69 = j55;
        long b5 = C0070b.m181b(j68, j69, j54 * j65, (j64 + (j59 * j61)) << 1);
        long j70 = (j62 * j61) << 1;
        long j71 = j61;
        long j72 = (long) (i27 + i38);
        long j73 = (j67 * j66) + (j59 * j65) + (j54 * j72);
        long j74 = (long) i42;
        long j75 = j66 * j74;
        long j76 = (j75 + ((j67 * j71) + ((j62 * j65) + (j59 * j72)))) << 1;
        long j77 = (j65 * j74) + (j67 * j72);
        long j78 = (b5 - j50) + j58;
        long b6 = ((C0070b.m181b(j55, j74, j73, j70) - b2) - b4) + (j78 >> 26);
        long j79 = ((((b6 >> 25) + j76) - j53) * 38) + j47;
        iArr3[0] = ((int) j79) & 67108863;
        long j80 = ((((j67 * j65) + (((j74 * j71) + (j62 * j72)) << 1)) - j51) * 38) + j48 + (j79 >> 26);
        iArr3[1] = ((int) j80) & 67108863;
        long j81 = j52;
        long j82 = ((j77 - j81) * 38) + j49 + (j80 >> 26);
        iArr3[2] = ((int) j82) & 33554431;
        long j83 = ((((j74 * j72) << 1) - j58) * 38) + j50 + (j82 >> 25);
        iArr3[3] = ((int) j83) & 67108863;
        long b7 = C0070b.m181b(b4, 38, b2, j83 >> 26);
        iArr3[4] = ((int) b7) & 33554431;
        long j84 = (j56 - j47) + j53 + (b7 >> 25);
        iArr3[5] = ((int) j84) & 67108863;
        long j85 = (j60 - j48) + j51 + (j84 >> 26);
        iArr3[6] = ((int) j85) & 67108863;
        long j86 = (j63 - j49) + j81 + (j85 >> 26);
        iArr3[7] = ((int) j86) & 33554431;
        long j87 = (j86 >> 25) + ((long) (((int) j78) & 67108863));
        iArr3[8] = ((int) j87) & 67108863;
        iArr3[9] = (((int) b6) & 33554431) + ((int) (j87 >> 26));
    }

    /* renamed from: E */
    public static boolean m6110E(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public static boolean m6111F(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m6112G(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static int m6113H(int i, int i2, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = ((((long) iArr2[i4]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr[0 + i3]))) + j;
            iArr2[i4] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: I */
    public static int m6114I(int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr[i2] = (i3 >>> -2) | (i4 << 2);
            i2++;
            i3 = i4;
        }
        return i3 >>> -2;
    }

    /* renamed from: J */
    public static int m6115J(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] + 1;
            iArr[i] = i2;
            if (i2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: K */
    public static BigInteger m6116K(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C3436p.m8242d(i2, (6 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: L */
    public static void m6117L(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) - (((long) i2) & UnsignedInteger.INT_MASK);
        iArr[0] = (int) j;
        long j2 = ((UnsignedInteger.INT_MASK & ((long) iArr[1])) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        if ((j2 >> 32) != 0) {
            m6134b(i, iArr, 2);
        }
    }

    /* renamed from: M */
    public static void m6118M(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i >= 0) {
                int i3 = iArr[i];
                iArr[i] = (i2 << 31) | (i3 >>> 1);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: N */
    public static void m6119N(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = (long) i;
        long j2 = j * j;
        int i11 = i9;
        long j3 = (long) (i2 * 2);
        long j4 = j * j3;
        long j5 = (long) (i3 * 2);
        int i12 = i6;
        int i13 = i7;
        long j6 = (long) i2;
        long j7 = (j6 * j6) + (j * j5);
        int i14 = i;
        long j8 = (long) (i4 * 2);
        long j9 = (j * j8) + (j3 * j5);
        int i15 = i5;
        int i16 = i4;
        long j10 = (long) (i5 * 2);
        long j11 = j6 * j8;
        long j12 = j11 + (j * j10) + (((long) i3) * j5);
        long j13 = (j8 * j5) + (j3 * j10);
        int i17 = i16;
        long j14 = (long) i17;
        long j15 = (j14 * j14) + (j5 * j10);
        int i18 = i3;
        int i19 = i12;
        int i20 = i17;
        long j16 = (long) i19;
        long j17 = j16 * j16;
        long j18 = ((long) i15) * j10;
        long j19 = (long) (i13 * 2);
        long j20 = j16 * j19;
        long j21 = (long) (i8 * 2);
        long j22 = j14 * j10;
        int i21 = i19;
        int i22 = i13;
        long j23 = (long) i22;
        long j24 = (j23 * j23) + (j16 * j21);
        long j25 = j15;
        long j26 = (long) (i11 * 2);
        long j27 = (j16 * j26) + (j19 * j21);
        long j28 = j13;
        long j29 = (long) (i10 * 2);
        long j30 = j23 * j26;
        long j31 = j30 + (j16 * j29) + (((long) i8) * j21);
        long j32 = (j26 * j21) + (j19 * j29);
        int i23 = i11;
        long j33 = (long) i23;
        int i24 = i10;
        long j34 = j2 - (j32 * 38);
        long j35 = j4 - (((j33 * j33) + (j21 * j29)) * 38);
        long j36 = j7 - ((j33 * j29) * 38);
        long j37 = j9 - ((((long) i24) * j29) * 38);
        long j38 = j18 - j27;
        int i25 = i14 + i21;
        int i26 = i2 + i22;
        int i27 = i18 + i8;
        int i28 = i20 + i23;
        int i29 = i15 + i24;
        long j39 = j22 - j24;
        long j40 = j25 - j20;
        long j41 = j28 - j17;
        long j42 = (long) i25;
        long j43 = j42 * j42;
        long j44 = (long) (i26 * 2);
        long j45 = j42 * j44;
        long j46 = (long) (i27 * 2);
        long j47 = j31;
        long j48 = (long) i26;
        long j49 = (j48 * j48) + (j42 * j46);
        long j50 = j38;
        long j51 = (long) (i28 * 2);
        long j52 = j46;
        long j53 = (long) (i29 * 2);
        long j54 = j48 * j51;
        long j55 = (long) i28;
        long j56 = j55 * j55;
        long j57 = (((j42 * j51) + (j44 * j46)) - j37) + j50;
        long j58 = (((j54 + ((j42 * j53) + (((long) i27) * j46))) - j12) - j47) + (j57 >> 26);
        long j59 = j58 >> 25;
        long j60 = (((j59 + ((j51 * j52) + (j44 * j53))) - j41) * 38) + j34;
        iArr2[0] = ((int) j60) & 67108863;
        long j61 = (((j56 + (j52 * j53)) - j40) * 38) + j35 + (j60 >> 26);
        iArr2[1] = ((int) j61) & 67108863;
        long j62 = (((j55 * j53) - j39) * 38) + j36 + (j61 >> 26);
        iArr2[2] = ((int) j62) & 33554431;
        long j63 = (((((long) i29) * j53) - j50) * 38) + j37 + (j62 >> 25);
        iArr2[3] = ((int) j63) & 67108863;
        long b = C0070b.m181b(j47, 38, j12, j63 >> 26);
        iArr2[4] = ((int) b) & 33554431;
        long j64 = (j43 - j34) + j41 + (b >> 25);
        iArr2[5] = ((int) j64) & 67108863;
        long j65 = (j45 - j35) + j40 + (j64 >> 26);
        iArr2[6] = ((int) j65) & 67108863;
        long j66 = (j49 - j36) + j39 + (j65 >> 26);
        iArr2[7] = ((int) j66) & 33554431;
        long j67 = (j66 >> 25) + ((long) (((int) j57) & 67108863));
        iArr2[8] = ((int) j67) & 67108863;
        iArr2[9] = (((int) j58) & 33554431) + ((int) (j67 >> 26));
    }

    /* renamed from: O */
    public static void m6120O(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = j3;
        long j7 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr2[6]) & UnsignedInteger.INT_MASK;
        long j9 = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j6) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j7) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j8) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        iArr3[7] = (int) (j16 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j17 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i3 = i + 0;
            long j18 = j;
            long j19 = (j17 * j) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i3] = (int) j19;
            int i4 = i + 1;
            long j20 = j2;
            long j21 = (j17 * j2) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
            iArr3[i4] = (int) j21;
            int i5 = i + 2;
            long j22 = (j17 * j6) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
            iArr3[i5] = (int) j22;
            int i6 = i + 3;
            long j23 = (j17 * j4) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j22 >>> 32);
            iArr3[i6] = (int) j23;
            int i7 = i + 4;
            long j24 = (j17 * j5) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
            iArr3[i7] = (int) j24;
            int i8 = i + 5;
            long j25 = (j17 * j7) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j24 >>> 32);
            iArr3[i8] = (int) j25;
            long j26 = j25 >>> 32;
            int i9 = i + 6;
            long j27 = (j17 * j8) + (((long) iArr3[i9]) & UnsignedInteger.INT_MASK) + j26;
            iArr3[i9] = (int) j27;
            iArr3[i + 7] = (int) (j27 >>> 32);
            i = i4;
            j = j18;
            j2 = j20;
        }
    }

    /* renamed from: P */
    public static boolean m6121P(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m6122Q(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: R */
    public static void m6123R(Object obj, String str) {
        boolean z = true;
        if (!(obj != null)) {
            if (!str.isEmpty()) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!Character.isWhitespace(str.charAt(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                str = "Received an invalid parameter";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: S */
    public static int m6124S(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: T */
    public static int m6125T(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr[i2]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr2[i2]))) + j;
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: U */
    public static int m6126U(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j7 = j;
        long j8 = ((long) iArr2[6]) & UnsignedInteger.INT_MASK;
        long j9 = 0;
        int i = 0;
        while (i < 7) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i2 = i + 0;
            long j12 = j6;
            long j13 = (j11 * j7) + (((long) iArr3[i2]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i2] = (int) j13;
            int i3 = i + 1;
            long j14 = j2;
            long j15 = (j11 * j2) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
            iArr3[i3] = (int) j15;
            int i4 = i + 2;
            long j16 = (j11 * j3) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j15 >>> 32);
            iArr3[i4] = (int) j16;
            int i5 = i + 3;
            long j17 = (j11 * j4) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 4;
            long j18 = (j11 * j5) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i + 5;
            long j19 = (j11 * j12) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i + 6;
            long j20 = (j11 * j10) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
            iArr3[i8] = (int) j20;
            int i9 = i + 7;
            long j21 = j9 + (((long) iArr3[i9]) & UnsignedInteger.INT_MASK) + (j20 >>> 32);
            iArr3[i9] = (int) j21;
            j9 = j21 >>> 32;
            i = i3;
            j8 = j10;
            j6 = j12;
            j3 = j3;
            j2 = j14;
        }
        return (int) j9;
    }

    /* renamed from: V */
    public static void m6127V(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        m6146l(iArr, i);
        m6146l(iArr, -i);
    }

    /* renamed from: W */
    public static void m6128W(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        int i = 14;
        int i2 = 6;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2]) & UnsignedInteger.INT_MASK;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i6 << 31)) & UnsignedInteger.INT_MASK) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & UnsignedInteger.INT_MASK;
                long j7 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
                long j8 = (j6 * j) + j5;
                int i7 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i7 << 1);
                long j9 = ((long) iArr[2]) & UnsignedInteger.INT_MASK;
                long j10 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
                long j11 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[2] = (i7 >>> 31) | (i8 << 1);
                long b = C0070b.m181b(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (b >>> 32);
                long j14 = b & UnsignedInteger.INT_MASK;
                long j15 = ((long) iArr[3]) & UnsignedInteger.INT_MASK;
                long j16 = (((long) iArr2[5]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
                long j17 = j13 & UnsignedInteger.INT_MASK;
                long j18 = j;
                long j19 = (((long) iArr2[6]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
                long j20 = j16 & UnsignedInteger.INT_MASK;
                long j21 = (j15 * j18) + j14;
                int i9 = (int) j21;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long b2 = C0070b.m181b(j15, j6, j21 >>> 32, j17);
                long b3 = C0070b.m181b(j15, j9, b2 >>> 32, j20);
                long j22 = b2 & UnsignedInteger.INT_MASK;
                long j23 = j19 + (b3 >>> 32);
                long j24 = b3 & UnsignedInteger.INT_MASK;
                long j25 = ((long) iArr[4]) & UnsignedInteger.INT_MASK;
                long j26 = (((long) iArr2[7]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
                long j27 = j23 & UnsignedInteger.INT_MASK;
                long j28 = (((long) iArr2[8]) & UnsignedInteger.INT_MASK) + (j26 >>> 32);
                long j29 = j26 & UnsignedInteger.INT_MASK;
                long j30 = (j25 * j18) + j22;
                int i11 = (int) j30;
                iArr2[4] = (i11 << 1) | i10;
                long b4 = C0070b.m181b(j25, j6, j30 >>> 32, j24);
                long b5 = C0070b.m181b(j25, j9, b4 >>> 32, j27);
                long j31 = b4 & UnsignedInteger.INT_MASK;
                long j32 = j15;
                long b6 = C0070b.m181b(j25, j32, b5 >>> 32, j29);
                long j33 = b5 & UnsignedInteger.INT_MASK;
                long j34 = j28 + (b6 >>> 32);
                long j35 = b6 & UnsignedInteger.INT_MASK;
                long j36 = ((long) iArr[5]) & UnsignedInteger.INT_MASK;
                long j37 = (((long) iArr2[9]) & UnsignedInteger.INT_MASK) + (j34 >>> 32);
                long j38 = j34 & UnsignedInteger.INT_MASK;
                long j39 = (((long) iArr2[10]) & UnsignedInteger.INT_MASK) + (j37 >>> 32);
                long j40 = j37 & UnsignedInteger.INT_MASK;
                long j41 = (j36 * j18) + j31;
                int i12 = (int) j41;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                long b7 = C0070b.m181b(j36, j6, j41 >>> 32, j33);
                long b8 = C0070b.m181b(j36, j9, b7 >>> 32, j35);
                long j42 = b7 & UnsignedInteger.INT_MASK;
                long b9 = C0070b.m181b(j36, j32, b8 >>> 32, j38);
                long j43 = b8 & UnsignedInteger.INT_MASK;
                long b10 = C0070b.m181b(j36, j25, b9 >>> 32, j40);
                long j44 = b9 & UnsignedInteger.INT_MASK;
                long j45 = j39 + (b10 >>> 32);
                long j46 = b10 & UnsignedInteger.INT_MASK;
                long j47 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
                long j48 = (((long) iArr2[11]) & UnsignedInteger.INT_MASK) + (j45 >>> 32);
                long j49 = j45 & UnsignedInteger.INT_MASK;
                long j50 = (((long) iArr2[12]) & UnsignedInteger.INT_MASK) + (j48 >>> 32);
                long j51 = j48 & UnsignedInteger.INT_MASK;
                long j52 = (j18 * j47) + j42;
                int i13 = (int) j52;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                long b11 = C0070b.m181b(j6, j47, j52 >>> 32, j43);
                long b12 = C0070b.m181b(j47, j9, b11 >>> 32, j44);
                long b13 = C0070b.m181b(j47, j15, b12 >>> 32, j46);
                long b14 = C0070b.m181b(j47, j25, b13 >>> 32, j49);
                long b15 = C0070b.m181b(j47, j36, b14 >>> 32, j51);
                long j53 = j50 + (b15 >>> 32);
                int i15 = (int) b11;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) b12;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) b13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = (int) b14;
                iArr2[10] = (i20 << 1) | (i19 >>> 31);
                int i21 = (int) b15;
                iArr2[11] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j53;
                iArr2[12] = i22 | (i23 << 1);
                iArr2[13] = (i23 >>> 31) | ((iArr2[13] + ((int) (j53 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: X */
    public static boolean m6129X(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y */
    public static int m6130Y(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((((long) iArr2[i2]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr[i2]))) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    /* renamed from: Z */
    public static int m6131Z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & UnsignedInteger.INT_MASK) - (((long) iArr2[0]) & UnsignedInteger.INT_MASK)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - (((long) iArr2[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - (((long) iArr2[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & UnsignedInteger.INT_MASK) - (((long) iArr2[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & UnsignedInteger.INT_MASK) - (((long) iArr2[4]) & UnsignedInteger.INT_MASK)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & UnsignedInteger.INT_MASK) - (((long) iArr2[5]) & UnsignedInteger.INT_MASK)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[6]) & UnsignedInteger.INT_MASK) - (((long) iArr2[6]) & UnsignedInteger.INT_MASK)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    /* renamed from: a */
    public static int m6132a(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & UnsignedInteger.INT_MASK;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = (((long) iArr[i3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i3]) & j) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    /* renamed from: a0 */
    public static void m6133a0(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: b */
    public static int m6134b(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: b0 */
    public static boolean m6135b0(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m6136c(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[i2])) + j;
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: c0 */
    public static BigInteger m6137c0(int i, int[] iArr) {
        byte[] bArr = new byte[(i << 2)];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                C3436p.m8242d(i3, ((i - 1) - i2) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: d */
    public static int m6138d(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            long j2 = (((long) iArr[0 + i3]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[i4])) + j;
            iArr2[i4] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static int m6139e(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: f */
    public static int m6140f(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + (((long) iArr2[0]) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (((long) iArr2[1]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[2]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[3]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (((long) iArr2[4]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (((long) iArr2[5]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (((long) iArr2[6]) & UnsignedInteger.INT_MASK) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    /* renamed from: g */
    public static void m6141g(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = -(i2 & 1);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0 + i5;
            int i7 = iArr2[i6];
            iArr2[i6] = i7 ^ ((iArr[i3 + i5] ^ i7) & i4);
        }
    }

    /* renamed from: h */
    public static void m6142h(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: i */
    public static void m6143i(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + (((long) i2) & UnsignedInteger.INT_MASK);
        iArr[0] = (int) j;
        long j2 = (UnsignedInteger.INT_MASK & ((long) iArr[1])) + 1 + (j >>> 32);
        iArr[1] = (int) j2;
        if ((j2 >>> 32) != 0) {
            m6159y(i, iArr, 2);
        }
    }

    /* renamed from: j */
    public static void m6144j(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) != 0) {
            m6159y(i, iArr, i3 + 1);
        }
    }

    /* renamed from: k */
    public static void m6145k(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 10; i2++) {
            iArr2[i + i2] = iArr[0 + i2];
        }
    }

    /* renamed from: l */
    public static void m6146l(int[] iArr, int i) {
        int i2 = iArr[9];
        int i3 = 16777215 & i2;
        int i4 = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = i4 & 67108863;
        int i5 = (i4 >> 26) + iArr[1];
        iArr[1] = i5 & 67108863;
        int i6 = (i5 >> 26) + iArr[2];
        iArr[2] = i6 & 33554431;
        int i7 = (i6 >> 25) + iArr[3];
        iArr[3] = i7 & 67108863;
        int i8 = (i7 >> 26) + iArr[4];
        iArr[4] = i8 & 33554431;
        int i9 = (i8 >> 25) + iArr[5];
        iArr[5] = i9 & 67108863;
        int i10 = (i9 >> 26) + iArr[6];
        iArr[6] = i10 & 67108863;
        int i11 = (i10 >> 26) + iArr[7];
        iArr[7] = 33554431 & i11;
        int i12 = (i11 >> 25) + iArr[8];
        iArr[8] = 67108863 & i12;
        iArr[9] = (i12 >> 26) + i3;
    }

    /* renamed from: m */
    public static void m6147m(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        m6142h((i4 << 26) | i3, i2 + 0, bArr);
        m6142h((i4 >>> 6) | (i5 << 20), i2 + 4, bArr);
        m6142h((i5 >>> 12) | (i6 << 13), i2 + 8, bArr);
        m6142h((i7 << 7) | (i6 >>> 19), i2 + 12, bArr);
    }

    /* renamed from: n */
    public static void m6148n(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    /* renamed from: o */
    public static void m6149o(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* renamed from: p */
    public static void m6150p(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    /* renamed from: q */
    public static boolean m6151q(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static int[] m6152r(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[((i + 31) >> 5)];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    /* renamed from: s */
    public static int[] m6153s(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    /* renamed from: t */
    public static int m6154t(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    /* renamed from: u */
    public static int m6155u(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = 0 + i2;
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* renamed from: v */
    public static int m6156v(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = iArr[i2];
            iArr2[i2] = (i3 >>> -3) | (i4 << 3);
            i2++;
            i3 = i4;
        }
        return i3 >>> -3;
    }

    /* renamed from: w */
    public static void m6157w(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        m6119N(iArr, iArr3);
        m6109D(iArr, iArr3, iArr3);
        int[] iArr5 = new int[10];
        m6119N(iArr3, iArr5);
        m6109D(iArr, iArr5, iArr5);
        m6107B(2, iArr5, iArr5);
        m6109D(iArr3, iArr5, iArr5);
        int[] iArr6 = new int[10];
        m6107B(5, iArr5, iArr6);
        m6109D(iArr5, iArr6, iArr6);
        int[] iArr7 = new int[10];
        m6107B(5, iArr6, iArr7);
        m6109D(iArr5, iArr7, iArr7);
        m6107B(10, iArr7, iArr5);
        m6109D(iArr6, iArr5, iArr5);
        m6107B(25, iArr5, iArr6);
        m6109D(iArr5, iArr6, iArr6);
        m6107B(25, iArr6, iArr7);
        m6109D(iArr5, iArr7, iArr7);
        m6107B(50, iArr7, iArr5);
        m6109D(iArr6, iArr5, iArr5);
        m6107B(125, iArr5, iArr6);
        m6109D(iArr5, iArr6, iArr6);
        m6107B(2, iArr6, iArr5);
        m6109D(iArr5, iArr, iArr4);
        m6107B(3, iArr4, iArr4);
        m6109D(iArr4, iArr3, iArr2);
    }

    /* renamed from: x */
    public static int m6158x(int i, int i2, int[] iArr) {
        long j = (((long) i2) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr[0]));
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return m6159y(i, iArr, 1);
    }

    /* renamed from: y */
    public static int m6159y(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    /* renamed from: z */
    public static int m6160z(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = (((long) iArr[i2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i2]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr3[i2])) + j;
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }
}
