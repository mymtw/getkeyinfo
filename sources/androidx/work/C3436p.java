package androidx.work;

import android.support.p013v4.media.C0070b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.math.BigInteger;
import p209p6.C7686e;

/* renamed from: androidx.work.p */
public abstract class C3436p {
    /* renamed from: A */
    public static boolean m8227A(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    /* renamed from: B */
    public static BigInteger m8228B(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                m8242d(i2, (7 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: C */
    public static BigInteger m8229C(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                m8246h(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: D */
    public static void m8230D(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = j3;
        long j7 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr2[6]) & UnsignedInteger.INT_MASK;
        long j9 = ((long) iArr2[7]) & UnsignedInteger.INT_MASK;
        long j10 = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j11 = (j10 * j) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j10 * j2) + (j11 >>> 32);
        iArr3[1] = (int) j12;
        long j13 = (j10 * j6) + (j12 >>> 32);
        iArr3[2] = (int) j13;
        long j14 = (j10 * j4) + (j13 >>> 32);
        iArr3[3] = (int) j14;
        long j15 = (j10 * j5) + (j14 >>> 32);
        iArr3[4] = (int) j15;
        long j16 = (j10 * j7) + (j15 >>> 32);
        iArr3[5] = (int) j16;
        long j17 = (j10 * j8) + (j16 >>> 32);
        iArr3[6] = (int) j17;
        long j18 = (j10 * j9) + (j17 >>> 32);
        iArr3[7] = (int) j18;
        iArr3[8] = (int) (j18 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j19 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i3 = i + 0;
            long j20 = j;
            long j21 = (j19 * j) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i3] = (int) j21;
            int i4 = i + 1;
            long j22 = j2;
            long j23 = (j19 * j2) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
            iArr3[i4] = (int) j23;
            int i5 = i + 2;
            long j24 = (j19 * j6) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
            iArr3[i5] = (int) j24;
            int i6 = i + 3;
            long j25 = (j19 * j4) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j24 >>> 32);
            iArr3[i6] = (int) j25;
            int i7 = i + 4;
            long j26 = (j19 * j5) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + (j25 >>> 32);
            iArr3[i7] = (int) j26;
            int i8 = i + 5;
            long j27 = (j19 * j7) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j26 >>> 32);
            iArr3[i8] = (int) j27;
            int i9 = i + 6;
            long j28 = (j19 * j8) + (((long) iArr3[i9]) & UnsignedInteger.INT_MASK) + (j27 >>> 32);
            iArr3[i9] = (int) j28;
            long j29 = j28 >>> 32;
            int i10 = i + 7;
            long j30 = (j19 * j9) + (((long) iArr3[i10]) & UnsignedInteger.INT_MASK) + j29;
            iArr3[i10] = (int) j30;
            iArr3[i + 8] = (int) (j30 >>> 32);
            i = i4;
            j = j20;
            j2 = j22;
        }
    }

    /* renamed from: E */
    public static int m8231E(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: F */
    public static void m8232F(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        int i = 16;
        int i2 = 7;
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
                int i9 = i8 >>> 31;
                long b = C0070b.m181b(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (b >>> 32);
                long j14 = b & UnsignedInteger.INT_MASK;
                long j15 = ((long) iArr[3]) & UnsignedInteger.INT_MASK;
                long j16 = (((long) iArr2[5]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
                long j17 = j13 & UnsignedInteger.INT_MASK;
                long j18 = j6;
                long j19 = (((long) iArr2[6]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
                long j20 = j16 & UnsignedInteger.INT_MASK;
                long j21 = (j15 * j) + j14;
                int i10 = (int) j21;
                iArr2[3] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long b2 = C0070b.m181b(j15, j18, j21 >>> 32, j17);
                long b3 = C0070b.m181b(j15, j9, b2 >>> 32, j20);
                long j22 = b2 & UnsignedInteger.INT_MASK;
                long j23 = j19 + (b3 >>> 32);
                long j24 = b3 & UnsignedInteger.INT_MASK;
                long j25 = ((long) iArr[4]) & UnsignedInteger.INT_MASK;
                long j26 = (((long) iArr2[7]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
                long j27 = j23 & UnsignedInteger.INT_MASK;
                long j28 = (((long) iArr2[8]) & UnsignedInteger.INT_MASK) + (j26 >>> 32);
                long j29 = j26 & UnsignedInteger.INT_MASK;
                long j30 = (j25 * j) + j22;
                int i12 = (int) j30;
                iArr2[4] = (i12 << 1) | i11;
                long b4 = C0070b.m181b(j25, j18, j30 >>> 32, j24);
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
                long j41 = (j36 * j) + j31;
                int i13 = (int) j41;
                iArr2[5] = (i12 >>> 31) | (i13 << 1);
                long b7 = C0070b.m181b(j36, j18, j41 >>> 32, j33);
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
                long j50 = j9;
                long j51 = (((long) iArr2[12]) & UnsignedInteger.INT_MASK) + (j48 >>> 32);
                long j52 = j48 & UnsignedInteger.INT_MASK;
                long j53 = (j47 * j) + j42;
                int i14 = (int) j53;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                long b11 = C0070b.m181b(j47, j18, j53 >>> 32, j43);
                long b12 = C0070b.m181b(j47, j50, b11 >>> 32, j44);
                long j54 = b11 & UnsignedInteger.INT_MASK;
                long b13 = C0070b.m181b(j47, j15, b12 >>> 32, j46);
                long j55 = b12 & UnsignedInteger.INT_MASK;
                long b14 = C0070b.m181b(j47, j25, b13 >>> 32, j49);
                long j56 = b13 & UnsignedInteger.INT_MASK;
                long j57 = j36;
                long b15 = C0070b.m181b(j47, j57, b14 >>> 32, j52);
                long j58 = b14 & UnsignedInteger.INT_MASK;
                long j59 = j51 + (b15 >>> 32);
                long j60 = b15 & UnsignedInteger.INT_MASK;
                long j61 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
                long j62 = (((long) iArr2[13]) & UnsignedInteger.INT_MASK) + (j59 >>> 32);
                long j63 = j59 & UnsignedInteger.INT_MASK;
                long j64 = (((long) iArr2[14]) & UnsignedInteger.INT_MASK) + (j62 >>> 32);
                long j65 = j62 & UnsignedInteger.INT_MASK;
                long j66 = (j * j61) + j54;
                int i16 = (int) j66;
                iArr2[7] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long b16 = C0070b.m181b(j18, j61, j66 >>> 32, j55);
                long b17 = C0070b.m181b(j61, j50, b16 >>> 32, j56);
                long b18 = C0070b.m181b(j61, j15, b17 >>> 32, j58);
                long b19 = C0070b.m181b(j61, j25, b18 >>> 32, j60);
                long j67 = j61;
                long b20 = C0070b.m181b(j67, j57, b19 >>> 32, j63);
                long b21 = C0070b.m181b(j67, j47, b20 >>> 32, j65);
                long j68 = j64 + (b21 >>> 32);
                int i18 = (int) b16;
                iArr2[8] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) b17;
                iArr2[9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) b18;
                iArr2[10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) b19;
                iArr2[11] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) b20;
                iArr2[12] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) b21;
                iArr2[13] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j68;
                iArr2[14] = i29 | (i30 << 1);
                iArr2[15] = (i30 >>> 31) | ((iArr2[15] + ((int) (j68 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: G */
    public static int m8233G(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j7 = j;
        long j8 = ((long) iArr2[6]) & UnsignedInteger.INT_MASK;
        long j9 = ((long) iArr2[7]) & UnsignedInteger.INT_MASK;
        long j10 = 0;
        int i = 0;
        while (i < 8) {
            long j11 = j9;
            long j12 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i2 = i + 0;
            long j13 = j6;
            long j14 = (j12 * j7) + (((long) iArr3[i2]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i2] = (int) j14;
            int i3 = i + 1;
            long j15 = j2;
            long j16 = (j12 * j2) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
            iArr3[i3] = (int) j16;
            int i4 = i + 2;
            long j17 = (j12 * j3) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
            iArr3[i4] = (int) j17;
            int i5 = i + 3;
            long j18 = (j12 * j4) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
            iArr3[i5] = (int) j18;
            int i6 = i + 4;
            long j19 = (j12 * j5) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j18 >>> 32);
            iArr3[i6] = (int) j19;
            int i7 = i + 5;
            long j20 = (j12 * j13) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
            iArr3[i7] = (int) j20;
            int i8 = i + 6;
            long j21 = (j12 * j8) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j20 >>> 32);
            iArr3[i8] = (int) j21;
            int i9 = i + 7;
            long j22 = (j12 * j11) + (((long) iArr3[i9]) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
            iArr3[i9] = (int) j22;
            int i10 = i + 8;
            long j23 = j10 + (((long) iArr3[i10]) & UnsignedInteger.INT_MASK) + (j22 >>> 32);
            iArr3[i10] = (int) j23;
            j10 = j23 >>> 32;
            i = i3;
            j9 = j11;
            j6 = j13;
            j3 = j3;
            j2 = j15;
        }
        return (int) j10;
    }

    /* renamed from: H */
    public static void m8234H(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    /* renamed from: I */
    public static int m8235I(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & UnsignedInteger.INT_MASK) - (((long) iArr2[0]) & UnsignedInteger.INT_MASK)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - (((long) iArr2[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - (((long) iArr2[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & UnsignedInteger.INT_MASK) - (((long) iArr2[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    /* renamed from: J */
    public static long m8236J(int i, byte[] bArr) {
        return ((((long) m8231E(i + 4, bArr)) & UnsignedInteger.INT_MASK) << 32) | (((long) m8231E(i, bArr)) & UnsignedInteger.INT_MASK);
    }

    /* renamed from: K */
    public static void m8237K(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & UnsignedInteger.INT_MASK) - (((long) iArr[0]) & UnsignedInteger.INT_MASK)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & UnsignedInteger.INT_MASK) - (((long) iArr[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & UnsignedInteger.INT_MASK) - (((long) iArr[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & UnsignedInteger.INT_MASK) - (((long) iArr[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & UnsignedInteger.INT_MASK) - (((long) iArr[4]) & UnsignedInteger.INT_MASK)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & UnsignedInteger.INT_MASK) - (((long) iArr[5]) & UnsignedInteger.INT_MASK)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & UnsignedInteger.INT_MASK) - (((long) iArr[6]) & UnsignedInteger.INT_MASK)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((((long) iArr2[7]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr[7]))) + (j7 >> 32));
    }

    /* renamed from: L */
    public static int m8238L(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = ((((long) iArr[7]) & UnsignedInteger.INT_MASK) - (((long) iArr2[7]) & UnsignedInteger.INT_MASK)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* renamed from: a */
    public static int m8239a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        long j = ((long) i3) & UnsignedInteger.INT_MASK;
        int i4 = i2 + 0;
        long j2 = (((long) iArr[i + 0]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i4]) & UnsignedInteger.INT_MASK) + j;
        iArr2[i4] = (int) j2;
        int i5 = i2 + 1;
        long j3 = (((long) iArr[i + 1]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i5]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 2;
        long j4 = (((long) iArr[i + 2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i6]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 3;
        long j5 = (((long) iArr[i + 3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i7]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 4;
        long j6 = (((long) iArr[i + 4]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i8]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 5;
        long j7 = (((long) iArr[i + 5]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i9]) & UnsignedInteger.INT_MASK) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 6;
        long j8 = (((long) iArr[i + 6]) & UnsignedInteger.INT_MASK) + (((long) iArr2[i10]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        int i11 = i2 + 7;
        long j9 = (((long) iArr[i + 7]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[i11])) + (j8 >>> 32);
        iArr2[i11] = (int) j9;
        return (int) (j9 >>> 32);
    }

    /* renamed from: b */
    public static int m8240b(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: c */
    public static int m8241c(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[8]) & UnsignedInteger.INT_MASK) + (((long) iArr2[16]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (((long) iArr[9]) & UnsignedInteger.INT_MASK) + (((long) iArr2[17]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (((long) iArr[10]) & UnsignedInteger.INT_MASK) + (((long) iArr2[18]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (((long) iArr[11]) & UnsignedInteger.INT_MASK) + (((long) iArr2[19]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (((long) iArr[12]) & UnsignedInteger.INT_MASK) + (((long) iArr2[20]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (((long) iArr[13]) & UnsignedInteger.INT_MASK) + (((long) iArr2[21]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (((long) iArr[14]) & UnsignedInteger.INT_MASK) + (((long) iArr2[22]) & UnsignedInteger.INT_MASK) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (((long) iArr[15]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[23])) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: d */
    public static void m8242d(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: e */
    public static void m8243e(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i4 + 1;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    /* renamed from: f */
    public static boolean m8244f(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i2 < i3) {
                z = false;
                break;
            } else if (i2 > i3) {
                break;
            } else {
                i--;
            }
        }
        if (z) {
            m8261x(iArr, 8, iArr2, 0, iArr3);
        } else {
            m8261x(iArr2, 0, iArr, 8, iArr3);
        }
        return z;
    }

    /* renamed from: g */
    public static int m8245g(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (((long) iArr[7]) & UnsignedInteger.INT_MASK) + (((long) iArr2[7]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: h */
    public static void m8246h(long j, byte[] bArr, int i) {
        m8242d((int) (j >>> 32), i, bArr);
        m8242d((int) (j & UnsignedInteger.INT_MASK), i + 4, bArr);
    }

    /* renamed from: i */
    public static boolean m8247i(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m8248j(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m8249k(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static int[] m8250l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    /* renamed from: m */
    public static int m8251m(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + (((long) iArr2[0]) & UnsignedInteger.INT_MASK) + (((long) iArr3[0]) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (((long) iArr2[1]) & UnsignedInteger.INT_MASK) + (((long) iArr3[1]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (((long) iArr2[2]) & UnsignedInteger.INT_MASK) + (((long) iArr3[2]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (((long) iArr2[3]) & UnsignedInteger.INT_MASK) + (((long) iArr3[3]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    /* renamed from: o */
    public static void m8252o(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    /* renamed from: p */
    public static void m8253p(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        for (int i = 0; i < 64; i++) {
            long j8 = j >> 63;
            j <<= 1;
            j6 ^= j3 & j8;
            long j9 = j7 ^ (j4 & j8);
            long j10 = j2 >> 63;
            j2 <<= 1;
            j7 = j9 ^ (j3 & j10);
            j5 ^= j4 & j10;
            j4 = (j4 >>> 1) | (j3 << 63);
            j3 = (j3 >>> 1) ^ (((j4 << 63) >> 8) & -2233785415175766016L);
        }
        jArr[0] = ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7)) ^ j6;
        jArr[1] = (((j5 << 63) ^ (j5 << 62)) ^ (j5 << 57)) ^ j7;
    }

    /* renamed from: q */
    public static boolean m8254q(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m8255r(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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

    /* renamed from: s */
    public static int m8256s(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (((long) iArr[7]) & UnsignedInteger.INT_MASK) + (((long) iArr2[7]) & UnsignedInteger.INT_MASK) + (((long) iArr3[7]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: t */
    public static boolean m8257t(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m8258u(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m8259v(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public static long[] m8260w(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    /* renamed from: x */
    public static void m8261x(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = ((((long) iArr[i + 0]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 0]) & UnsignedInteger.INT_MASK)) + 0;
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 4]) & UnsignedInteger.INT_MASK)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[i + 5]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 5]) & UnsignedInteger.INT_MASK)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[i + 6]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 6]) & UnsignedInteger.INT_MASK)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((((long) iArr[i + 7]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 7]) & UnsignedInteger.INT_MASK)) + (j7 >> 32));
    }

    /* renamed from: y */
    public static void m8262y(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & UnsignedInteger.INT_MASK;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i6 << 31)) & UnsignedInteger.INT_MASK) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & UnsignedInteger.INT_MASK;
                long j7 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
                long j8 = j5 + (j6 * j);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = ((long) iArr[2]) & UnsignedInteger.INT_MASK;
                long j10 = j;
                long j11 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
                long j12 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
                long j13 = (j9 * j10) + j7 + (j8 >>> 32);
                int i8 = (int) j13;
                iArr2[2] = (i7 >>> 31) | (i8 << 1);
                long b = C0070b.m181b(j9, j6, j13 >>> 32, j11);
                long j14 = j12 + (b >>> 32);
                long j15 = b & UnsignedInteger.INT_MASK;
                long j16 = ((long) iArr[3]) & UnsignedInteger.INT_MASK;
                long j17 = (((long) iArr2[5]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
                long j18 = j14 & UnsignedInteger.INT_MASK;
                long j19 = (((long) iArr2[6]) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
                long j20 = j17 & UnsignedInteger.INT_MASK;
                long j21 = (j10 * j16) + j15;
                int i9 = (int) j21;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long b2 = C0070b.m181b(j6, j16, j21 >>> 32, j18);
                long b3 = C0070b.m181b(j16, j9, b2 >>> 32, j20);
                long j22 = j19 + (b3 >>> 32);
                long j23 = UnsignedInteger.INT_MASK & b3;
                int i10 = (int) b2;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) j23;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j22;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j22 >>> 32))) << 1) | (i14 >>> 31);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    /* renamed from: z */
    public static void m8263z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        int i = 1;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j6 = (j5 * j) + 0;
        iArr3[0] = (int) j6;
        char c = ' ';
        long j7 = (j5 * j2) + (j6 >>> 32);
        iArr3[1] = (int) j7;
        long j8 = (j5 * j3) + (j7 >>> 32);
        iArr3[2] = (int) j8;
        long j9 = (j5 * j4) + (j8 >>> 32);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i3 = i + 0;
            int i4 = i;
            long j11 = (j10 * j) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i3] = (int) j11;
            int i5 = i4 + 1;
            long j12 = j;
            long j13 = (j10 * j2) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j11 >>> c);
            iArr3[i5] = (int) j13;
            int i6 = i4 + 2;
            int i7 = i5;
            long j14 = (j10 * j3) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            c = ' ';
            int i8 = i4 + 3;
            long j15 = (j10 * j4) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
            iArr3[i8] = (int) j15;
            iArr3[i4 + 4] = (int) (j15 >>> 32);
            i = i7;
            j = j12;
            j2 = j2;
        }
    }

    /* renamed from: n */
    public abstract C7686e mo12959n(C7686e eVar, BigInteger bigInteger);
}
