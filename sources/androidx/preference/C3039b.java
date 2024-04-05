package androidx.preference;

import android.support.p013v4.media.C0070b;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import com.braze.p044ui.actions.brazeactions.steps.C5628b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.exoplayer2.metadata.Metadata;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.C19388s;
import p128h6.C6955a;
import p128h6.C6956b;
import p128h6.C6957c;
import p186n2.C7418m;
import p186n2.C7433t;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p512bi.C14041a;
import p512bi.C14044c;
import p513bj.C14075p;
import p649pm.C18398c;
import p722ym.C18895a;

/* renamed from: androidx.preference.b */
public abstract class C3039b implements C14041a, C5628b, C18398c {

    /* renamed from: b */
    public static String f6917b = "bnc_no_value";

    /* renamed from: A */
    public static int m7132A(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            int i5 = i;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                int i7 = iArr2[i5];
                iArr2[i5] = i6;
                i6 = i7;
            }
            i4 += 32;
        }
        int i8 = 0;
        while ((i3 & 1) == 0) {
            i3 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i8)) | (i10 >>> i8);
                i9 = i10;
            }
            i4 += i8;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            if ((iArr3[0] & 1) != 0) {
                i2 = (i2 < 0 ? C2606m.m6136c(length, iArr, iArr3) : C2606m.m6130Y(length, iArr, iArr3)) + i2;
            }
            C2606m.m6118M(length, iArr3, i2);
        }
        return i2;
    }

    /* renamed from: B */
    public static int m7133B(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: C */
    public static void m7134C(int[] iArr, int[] iArr2) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = i5;
        long j = (long) i2;
        long j2 = (long) 39081;
        long j3 = j * j2;
        int i17 = i;
        int i18 = i13;
        long j4 = ((long) i6) * j2;
        int i19 = ((int) j3) & 268435455;
        long j5 = ((long) i10) * j2;
        int i20 = ((int) j4) & 268435455;
        long j6 = ((long) i14) * j2;
        long j7 = (((long) i3) * j2) + (j3 >>> 28);
        iArr2[2] = ((int) j7) & 268435455;
        long j8 = (((long) i7) * j2) + (j4 >>> 28);
        iArr2[6] = ((int) j8) & 268435455;
        long j9 = (((long) i11) * j2) + (j5 >>> 28);
        iArr2[10] = ((int) j9) & 268435455;
        long j10 = (((long) i15) * j2) + (j6 >>> 28);
        iArr2[14] = ((int) j10) & 268435455;
        long j11 = (((long) i4) * j2) + (j7 >>> 28);
        iArr2[3] = ((int) j11) & 268435455;
        long j12 = j11 >>> 28;
        long j13 = (((long) i8) * j2) + (j8 >>> 28);
        iArr2[7] = ((int) j13) & 268435455;
        long j14 = (((long) i12) * j2) + (j9 >>> 28);
        iArr2[11] = ((int) j14) & 268435455;
        long j15 = j14 >>> 28;
        long j16 = (((long) iArr[15]) * j2) + (j10 >>> 28);
        iArr2[15] = ((int) j16) & 268435455;
        long j17 = j16 >>> 28;
        long j18 = (((long) i16) * j2) + j12;
        iArr2[4] = ((int) j18) & 268435455;
        long j19 = j18 >>> 28;
        long j20 = (((long) i9) * j2) + (j13 >>> 28) + j17;
        iArr2[8] = ((int) j20) & 268435455;
        long j21 = j20 >>> 28;
        long j22 = (((long) i18) * j2) + j15;
        iArr2[12] = ((int) j22) & 268435455;
        long j23 = j22 >>> 28;
        long j24 = (((long) i17) * j2) + j17;
        iArr2[0] = ((int) j24) & 268435455;
        iArr2[1] = i19 + ((int) (j24 >>> 28));
        iArr2[5] = i20 + ((int) j19);
        iArr2[9] = (((int) j5) & 268435455) + ((int) j21);
        iArr2[13] = (((int) j6) & 268435455) + ((int) j23);
    }

    /* renamed from: D */
    public static void m7135D(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (C2606m.m6135b0(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        } else if (C2606m.m6129X(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
        } else {
            int[] iArr4 = new int[length];
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            int[] iArr5 = new int[length];
            iArr5[0] = 1;
            int A = (1 & iArr4[0]) == 0 ? m7132A(length, 0, iArr, iArr4, iArr5) : 0;
            if (!C2606m.m6129X(length, iArr4)) {
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                int[] iArr7 = new int[length];
                int i = length;
                int i2 = 0;
                while (true) {
                    int i3 = i - 1;
                    if (iArr4[i3] == 0 && iArr6[i3] == 0) {
                        i = i3;
                    } else if (C2606m.m6121P(i, iArr4, iArr6)) {
                        C2606m.m6130Y(i, iArr6, iArr4);
                        A = m7132A(i, (C2606m.m6130Y(length, iArr7, iArr5) - i2) + A, iArr, iArr4, iArr5);
                        if (C2606m.m6129X(i, iArr4)) {
                            if (A < 0) {
                                C2606m.m6139e(iArr.length, iArr5, iArr, iArr3);
                                return;
                            } else {
                                System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                                return;
                            }
                        }
                    } else {
                        C2606m.m6130Y(i, iArr4, iArr6);
                        i2 = m7132A(i, (C2606m.m6130Y(length, iArr5, iArr7) - A) + i2, iArr, iArr6, iArr7);
                        if (C2606m.m6129X(i, iArr6)) {
                            if (i2 < 0) {
                                C2606m.m6139e(iArr.length, iArr7, iArr, iArr3);
                                return;
                            } else {
                                System.arraycopy(iArr7, 0, iArr3, 0, iArr.length);
                                return;
                            }
                        }
                    }
                }
            } else if (A < 0) {
                C2606m.m6139e(iArr.length, iArr5, iArr, iArr3);
            } else {
                System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
            }
        }
    }

    /* renamed from: E */
    public static boolean m7136E(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public static boolean m7137F(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public static int[] m7138G(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    /* renamed from: H */
    public static void m7139H(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr2;
        int[] iArr5 = iArr3;
        m7163f0(iArr, iArr2, iArr3);
        long j = ((long) iArr4[6]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr4[7]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr4[8]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr4[9]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr4[10]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr4[11]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j8 = (j7 * j) + 0;
        long j9 = j;
        iArr5[12] = (int) j8;
        long j10 = (j7 * j2) + (j8 >>> 32);
        iArr5[13] = (int) j10;
        long j11 = (j7 * j3) + (j10 >>> 32);
        iArr5[14] = (int) j11;
        long j12 = (j7 * j4) + (j11 >>> 32);
        iArr5[15] = (int) j12;
        long j13 = (j7 * j5) + (j12 >>> 32);
        iArr5[16] = (int) j13;
        long j14 = (j7 * j6) + (j13 >>> 32);
        iArr5[17] = (int) j14;
        iArr5[18] = (int) (j14 >>> 32);
        int i = 1;
        int i2 = 1;
        int i3 = 12;
        while (i2 < 6) {
            i3 += i;
            long j15 = ((long) iArr[6 + i2]) & UnsignedInteger.INT_MASK;
            int i4 = i3 + 0;
            long j16 = j15;
            long j17 = (j15 * j9) + (((long) iArr5[i4]) & UnsignedInteger.INT_MASK) + 0;
            iArr5[i4] = (int) j17;
            int i5 = i3 + 1;
            long j18 = (j16 * j2) + (((long) iArr5[i5]) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
            iArr5[i5] = (int) j18;
            int i6 = i3 + 2;
            long j19 = j2;
            long j20 = (j16 * j3) + (((long) iArr5[i6]) & UnsignedInteger.INT_MASK) + (j18 >>> 32);
            iArr5[i6] = (int) j20;
            int i7 = i3 + 3;
            long j21 = (j16 * j4) + (((long) iArr5[i7]) & UnsignedInteger.INT_MASK) + (j20 >>> 32);
            iArr5[i7] = (int) j21;
            int i8 = i3 + 4;
            long j22 = (j16 * j5) + (((long) iArr5[i8]) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
            iArr5[i8] = (int) j22;
            int i9 = i3 + 5;
            long j23 = (j16 * j6) + (((long) iArr5[i9]) & UnsignedInteger.INT_MASK) + (j22 >>> 32);
            iArr5[i9] = (int) j23;
            iArr5[i3 + 6] = (int) (j23 >>> 32);
            i2++;
            j2 = j19;
            i = 1;
        }
        int[] iArr6 = iArr;
        int g = m7164g(iArr5, iArr5);
        boolean z = false;
        int f = m7162f(18, 12, m7162f(0, 6, 0, iArr5, iArr5) + g, iArr5, iArr5) + g;
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        int[] iArr9 = iArr2;
        if (m7189x(iArr6, iArr6, iArr7) != m7189x(iArr9, iArr9, iArr8)) {
            z = true;
        }
        int[] iArr10 = new int[12];
        m7163f0(iArr7, iArr8, iArr10);
        C2606m.m6144j(24, f + (z ? C2606m.m6138d(12, iArr10, iArr5, 6) : C2606m.m6113H(12, 6, iArr10, iArr5)), iArr5, 18);
    }

    /* renamed from: I */
    public static void m7140I(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        m7165g0(iArr, iArr2);
        long j = UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr3[6]) & UnsignedInteger.INT_MASK;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        int i4 = 12;
        while (true) {
            int i5 = i3 - 1;
            long j3 = j & ((long) iArr3[i3 + 6]);
            long j4 = j3 * j3;
            int i6 = i - 1;
            iArr4[i4 + i6] = (i2 << 31) | ((int) (j4 >>> 33));
            i = i6 - 1;
            iArr4[i4 + i] = (int) (j4 >>> 1);
            i2 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                iArr4[12] = (int) j5;
                long j6 = ((long) iArr3[7]) & UnsignedInteger.INT_MASK;
                long j7 = UnsignedInteger.INT_MASK & ((long) iArr4[14]);
                long j8 = (j6 * j2) + ((((long) (i2 << 31)) & UnsignedInteger.INT_MASK) | (j5 >>> 33));
                int i7 = (int) j8;
                iArr4[13] = (((int) (j5 >>> 32)) & 1) | (i7 << 1);
                long j9 = ((long) iArr3[8]) & UnsignedInteger.INT_MASK;
                long j10 = ((long) iArr4[15]) & UnsignedInteger.INT_MASK;
                long j11 = ((long) iArr4[16]) & UnsignedInteger.INT_MASK;
                long j12 = (j9 * j2) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr4[14] = (i7 >>> 31) | (i8 << 1);
                long b = C0070b.m181b(j9, j6, j12 >>> 32, j10);
                long j13 = b & UnsignedInteger.INT_MASK;
                long j14 = j11 + (b >>> 32);
                long j15 = ((long) iArr3[9]) & UnsignedInteger.INT_MASK;
                long j16 = (((long) iArr4[17]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
                long j17 = j14 & UnsignedInteger.INT_MASK;
                long j18 = j6;
                long j19 = (((long) iArr4[18]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
                long j20 = j16 & UnsignedInteger.INT_MASK;
                long j21 = (j15 * j2) + j13;
                int i9 = (int) j21;
                iArr4[15] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long b2 = C0070b.m181b(j15, j18, j21 >>> 32, j17);
                long b3 = C0070b.m181b(j15, j9, b2 >>> 32, j20);
                long j22 = b2 & UnsignedInteger.INT_MASK;
                long j23 = j19 + (b3 >>> 32);
                long j24 = b3 & UnsignedInteger.INT_MASK;
                long j25 = ((long) iArr3[10]) & UnsignedInteger.INT_MASK;
                long j26 = j15;
                long j27 = (((long) iArr4[19]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
                long j28 = j23 & UnsignedInteger.INT_MASK;
                long j29 = j27 & UnsignedInteger.INT_MASK;
                long j30 = (j25 * j2) + j22;
                int i11 = (int) j30;
                iArr4[16] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long b4 = C0070b.m181b(j25, j18, j30 >>> 32, j24);
                long b5 = C0070b.m181b(j25, j9, b4 >>> 32, j28);
                long j31 = b4 & UnsignedInteger.INT_MASK;
                long j32 = j26;
                long b6 = C0070b.m181b(j25, j32, b5 >>> 32, j29);
                long j33 = b5 & UnsignedInteger.INT_MASK;
                long j34 = (((long) iArr4[20]) & UnsignedInteger.INT_MASK) + (j27 >>> 32) + (b6 >>> 32);
                long j35 = b6 & UnsignedInteger.INT_MASK;
                long j36 = ((long) iArr3[11]) & UnsignedInteger.INT_MASK;
                long j37 = j25;
                long j38 = (((long) iArr4[21]) & UnsignedInteger.INT_MASK) + (j34 >>> 32);
                long j39 = j34 & UnsignedInteger.INT_MASK;
                long j40 = (((long) iArr4[22]) & UnsignedInteger.INT_MASK) + (j38 >>> 32);
                long j41 = j38 & UnsignedInteger.INT_MASK;
                long j42 = (j2 * j36) + j31;
                int i13 = (int) j42;
                iArr4[17] = i12 | (i13 << 1);
                long b7 = C0070b.m181b(j36, j18, j42 >>> 32, j33);
                long b8 = C0070b.m181b(j36, j9, b7 >>> 32, j35);
                long j43 = b8;
                long b9 = C0070b.m181b(j36, j32, b8 >>> 32, j39);
                long b10 = C0070b.m181b(j36, j37, b9 >>> 32, j41);
                long j44 = j40 + (b10 >>> 32);
                int i14 = (int) b7;
                iArr4[18] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j43;
                iArr4[19] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) b9;
                iArr4[20] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) b10;
                iArr4[21] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j44;
                iArr4[22] = i21 | (i22 << 1);
                iArr4[23] = (i22 >>> 31) | ((iArr4[23] + ((int) (j44 >>> 32))) << 1);
                int g = m7164g(iArr4, iArr4);
                int f = m7162f(18, 12, m7162f(0, 6, 0, iArr4, iArr4) + g, iArr4, iArr4) + g;
                int[] iArr5 = new int[6];
                m7189x(iArr3, iArr3, iArr5);
                int[] iArr6 = new int[12];
                m7165g0(iArr5, iArr6);
                C2606m.m6144j(24, C2606m.m6113H(12, 6, iArr6, iArr4) + f, iArr4, 18);
                return;
            }
            j = UnsignedInteger.INT_MASK;
            i4 = 12;
            i3 = i5;
        }
    }

    /* renamed from: J */
    public static int m7141J(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    /* renamed from: L */
    public static String m7142L(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        return new String(cArr);
    }

    /* renamed from: M */
    public static void m7143M(int i, int[] iArr, int[] iArr2) {
        m7158b0(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                m7158b0(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: N */
    public static void m7144N(int[] iArr) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = i3 + (i2 >>> 28);
        int i16 = i7 + (i6 >>> 28);
        int i17 = i11 + (i10 >>> 28);
        int i18 = iArr[14] + (i14 >>> 28);
        int i19 = i4 + (i15 >>> 28);
        int i20 = i8 + (i16 >>> 28);
        int i21 = i12 + (i17 >>> 28);
        int i22 = iArr[15] + (i18 >>> 28);
        int i23 = i22 >>> 28;
        int i24 = i + i23;
        int i25 = i5 + (i19 >>> 28);
        int i26 = i9 + i23 + (i20 >>> 28);
        int i27 = i13 + (i21 >>> 28);
        iArr[0] = i24 & 268435455;
        iArr[1] = (i2 & 268435455) + (i24 >>> 28);
        iArr[2] = i15 & 268435455;
        iArr[3] = i19 & 268435455;
        iArr[4] = i25 & 268435455;
        iArr[5] = (i6 & 268435455) + (i25 >>> 28);
        iArr[6] = i16 & 268435455;
        iArr[7] = i20 & 268435455;
        iArr[8] = i26 & 268435455;
        iArr[9] = (i10 & 268435455) + (i26 >>> 28);
        iArr[10] = i17 & 268435455;
        iArr[11] = i21 & 268435455;
        iArr[12] = i27 & 268435455;
        iArr[13] = (i14 & 268435455) + (i27 >>> 28);
        iArr[14] = i18 & 268435455;
        iArr[15] = i22 & 268435455;
    }

    /* renamed from: O */
    public static void m7145O(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = i8;
        int i17 = iArr[15];
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        int i20 = iArr2[2];
        int i21 = iArr2[3];
        int i22 = iArr2[4];
        int i23 = iArr2[5];
        int i24 = iArr2[6];
        int i25 = iArr2[7];
        int i26 = iArr2[8];
        int i27 = iArr2[9];
        int i28 = iArr2[10];
        int i29 = iArr2[11];
        int i30 = iArr2[12];
        int i31 = iArr2[13];
        int i32 = iArr2[14];
        int i33 = iArr2[15];
        int i34 = i + i9;
        int i35 = i2 + i10;
        int i36 = i3 + i11;
        int i37 = i4 + i12;
        int i38 = i5 + i13;
        int i39 = i6 + i14;
        int i40 = i7 + i15;
        int i41 = i16 + i17;
        int i42 = i19 + i27;
        int i43 = i21 + i29;
        int i44 = i23 + i31;
        int i45 = i25 + i33;
        long j = (long) i;
        int i46 = i9;
        long j2 = (long) i18;
        long j3 = j * j2;
        long j4 = j;
        long j5 = (long) i16;
        long j6 = j2;
        long j7 = (long) i19;
        long j8 = j5 * j7;
        long j9 = j5;
        long j10 = (long) i7;
        long j11 = j7;
        long j12 = (long) i20;
        long j13 = (j10 * j12) + j8;
        long j14 = j10;
        long j15 = (long) i6;
        long j16 = j12;
        long j17 = (long) i21;
        long j18 = (j15 * j17) + j13;
        long j19 = j15;
        long j20 = (long) i5;
        long j21 = j17;
        long j22 = (long) i22;
        long j23 = (j20 * j22) + j18;
        long j24 = j20;
        long j25 = (long) i4;
        long j26 = j22;
        long j27 = (long) i23;
        long j28 = (j25 * j27) + j23;
        long j29 = j25;
        long j30 = (long) i3;
        long j31 = j27;
        long j32 = (long) i24;
        long j33 = (j30 * j32) + j28;
        long j34 = j30;
        long j35 = (long) i2;
        long j36 = j32;
        long j37 = (long) i25;
        long j38 = (j35 * j37) + j33;
        long j39 = j37;
        long j40 = (long) i46;
        long j41 = j35;
        long j42 = (long) i26;
        long j43 = j40 * j42;
        long j44 = j40;
        long j45 = (long) i17;
        long j46 = j42;
        long j47 = (long) i27;
        long j48 = j45 * j47;
        long j49 = (long) i15;
        long j50 = j45;
        long j51 = (long) i28;
        long j52 = (j49 * j51) + j48;
        long j53 = (long) i14;
        long j54 = j49;
        long j55 = (long) i29;
        long j56 = (j53 * j55) + j52;
        long j57 = (long) i13;
        long j58 = j53;
        long j59 = (long) i30;
        long j60 = (j57 * j59) + j56;
        long j61 = (long) i12;
        long j62 = j57;
        long j63 = (long) i31;
        long j64 = (j61 * j63) + j60;
        long j65 = (long) i11;
        long j66 = j61;
        long j67 = (long) i32;
        long j68 = (j65 * j67) + j64;
        long j69 = j65;
        long j70 = (long) i10;
        long j71 = j67;
        long j72 = (long) i33;
        long j73 = (j70 * j72) + j68;
        long j74 = j72;
        long j75 = (long) i34;
        long j76 = j63;
        long j77 = (long) (i18 + i26);
        long j78 = j75 * j77;
        int i47 = i41;
        long j79 = j75;
        long j80 = (long) i47;
        long j81 = j77;
        long j82 = (long) i42;
        long j83 = j80 * j82;
        long j84 = j80;
        long j85 = (long) i40;
        long j86 = j82;
        long j87 = (long) (i20 + i28);
        long j88 = (j85 * j87) + j83;
        int i48 = i39;
        long j89 = j85;
        long j90 = (long) i48;
        long j91 = j87;
        long j92 = (long) i43;
        long j93 = (j90 * j92) + j88;
        long j94 = j90;
        long j95 = (long) i38;
        long j96 = j92;
        long j97 = (long) (i22 + i30);
        long j98 = (j95 * j97) + j93;
        int i49 = i37;
        long j99 = j95;
        long j100 = (long) i49;
        long j101 = j97;
        long j102 = (long) i44;
        long j103 = (j100 * j102) + j98;
        long j104 = j100;
        long j105 = (long) i36;
        long j106 = j102;
        long j107 = (long) (i24 + i32);
        long j108 = (j105 * j107) + j103;
        long j109 = j105;
        long j110 = (long) i35;
        int i50 = i45;
        long j111 = j107;
        long j112 = (long) i50;
        long j113 = (j110 * j112) + j108;
        long j114 = j112;
        long j115 = ((j3 + j43) + j113) - j38;
        long j116 = (j73 + j78) - j3;
        long j117 = j115 >>> 28;
        long j118 = j116 + j113;
        int i51 = ((int) j115) & 268435455;
        long j119 = (j4 * j11) + (j41 * j6);
        long j120 = (j62 * j76) + (j58 * j59) + (j54 * j55) + (j50 * j51);
        long j121 = j71;
        long j122 = (j69 * j74) + (j66 * j121) + j120;
        long j123 = (j79 * j86) + (j110 * j81);
        long j124 = (j109 * j114) + (j104 * j111) + (j99 * j106) + (j94 * j101) + (j89 * j96) + (j84 * j91);
        long j125 = ((j119 + ((j44 * j47) + (j70 * j46))) + j124) - ((j34 * j39) + ((j29 * j36) + ((j24 * j31) + ((j19 * j26) + ((j14 * j21) + (j9 * j16))))));
        long j126 = j110;
        long j127 = j125 + j117;
        int i52 = ((int) j118) & 268435455;
        long j128 = ((j122 + j123) - j119) + j124 + (j118 >>> 28);
        int i53 = ((int) j127) & 268435455;
        long j129 = (j4 * j16) + (j41 * j11) + (j34 * j6);
        long j130 = (j29 * j39) + (j24 * j36) + (j19 * j31) + (j14 * j26) + (j9 * j21);
        long j131 = (j44 * j51) + (j70 * j47) + (j69 * j46);
        long j132 = (j66 * j74) + (j62 * j121) + (j58 * j76) + (j54 * j59) + (j50 * j55);
        long j133 = (j79 * j91) + (j126 * j86) + (j109 * j81);
        long j134 = (j104 * j114) + (j99 * j111) + (j94 * j106) + (j89 * j101) + (j84 * j96);
        long j135 = (((j129 + j131) + j134) - j130) + (j127 >>> 28);
        int i54 = ((int) j128) & 268435455;
        long j136 = ((j132 + j133) - j129) + j134 + (j128 >>> 28);
        int i55 = ((int) j135) & 268435455;
        long j137 = (j4 * j21) + (j41 * j16) + (j34 * j11) + (j29 * j6);
        long j138 = (j24 * j39) + (j19 * j36) + (j14 * j31) + (j9 * j26);
        long j139 = (j44 * j55) + (j70 * j51) + (j69 * j47) + (j66 * j46);
        long j140 = (j62 * j74) + (j58 * j121) + (j54 * j76) + (j50 * j59);
        long j141 = (j79 * j96) + (j126 * j91) + (j109 * j86) + (j104 * j81);
        long j142 = (j99 * j114) + (j94 * j111) + (j89 * j106) + (j84 * j101);
        long j143 = (((j137 + j139) + j142) - j138) + (j135 >>> 28);
        int i56 = ((int) j136) & 268435455;
        long j144 = ((j140 + j141) - j137) + j142 + (j136 >>> 28);
        int i57 = ((int) j143) & 268435455;
        long j145 = (j4 * j26) + (j41 * j21) + (j34 * j16) + (j29 * j11) + (j24 * j6);
        long j146 = (j19 * j39) + (j14 * j36) + (j9 * j31);
        long j147 = (j44 * j59) + (j70 * j55) + (j69 * j51) + (j66 * j47) + (j62 * j46);
        long j148 = (j58 * j74) + (j54 * j121) + (j50 * j76);
        long j149 = (j79 * j101) + (j126 * j96) + (j109 * j91) + (j104 * j86) + (j99 * j81);
        long j150 = (j94 * j114) + (j89 * j111) + (j84 * j106);
        long j151 = (((j145 + j147) + j150) - j146) + (j143 >>> 28);
        int i58 = ((int) j144) & 268435455;
        long j152 = ((j148 + j149) - j145) + j150 + (j144 >>> 28);
        int i59 = ((int) j151) & 268435455;
        long j153 = (j4 * j31) + (j41 * j26) + (j34 * j21) + (j29 * j16) + (j24 * j11) + (j19 * j6);
        long j154 = (j44 * j76) + (j70 * j59) + (j69 * j55) + (j66 * j51) + (j62 * j47) + (j58 * j46);
        long j155 = (j89 * j114) + (j84 * j111);
        long j156 = (((j153 + j154) + j155) - ((j14 * j39) + (j9 * j36))) + (j151 >>> 28);
        int i60 = ((int) j152) & 268435455;
        long j157 = ((((j54 * j74) + (j50 * j121)) + ((j79 * j106) + ((j126 * j101) + ((j109 * j96) + ((j104 * j91) + ((j99 * j86) + (j94 * j81))))))) - j153) + j155 + (j152 >>> 28);
        int i61 = ((int) j156) & 268435455;
        long j158 = (j4 * j36) + (j41 * j31) + (j34 * j26) + (j29 * j21) + (j24 * j16) + (j19 * j11) + (j14 * j6);
        long j159 = (j79 * j111) + (j126 * j106) + (j109 * j101) + (j104 * j96) + (j99 * j91) + (j94 * j86) + (j89 * j81);
        long j160 = j84 * j114;
        long j161 = (((j158 + ((j44 * j121) + ((j70 * j76) + ((j69 * j59) + ((j66 * j55) + ((j62 * j51) + ((j58 * j47) + (j54 * j46)))))))) + j160) - (j9 * j39)) + (j156 >>> 28);
        int i62 = ((int) j157) & 268435455;
        long j162 = (((j50 * j74) + j159) - j158) + j160 + (j157 >>> 28);
        long j163 = j29 * j26;
        long j164 = (j4 * j39) + (j41 * j36) + (j34 * j31) + j163 + (j24 * j21) + (j19 * j16) + (j11 * j14) + (j6 * j9);
        long j165 = j51 * j58;
        long j166 = j66 * j59;
        long j167 = j166 + (j62 * j55) + j165 + (j47 * j54) + (j50 * j46);
        long j168 = j44 * j74;
        long j169 = j164 + j168 + (j70 * j121) + (j69 * j76) + j167 + (j161 >>> 28);
        long j170 = (((j79 * j114) + ((j126 * j111) + ((j109 * j106) + ((j104 * j101) + ((j99 * j96) + ((j94 * j91) + ((j89 * j86) + (j84 * j81)))))))) - j164) + (j162 >>> 28);
        long j171 = j170 >>> 28;
        long j172 = (j169 >>> 28) + j171 + ((long) i52);
        long j173 = j171 + ((long) i51);
        iArr3[0] = ((int) j173) & 268435455;
        iArr3[1] = i53 + ((int) (j173 >>> 28));
        iArr3[2] = i55;
        iArr3[3] = i57;
        iArr3[4] = i59;
        iArr3[5] = i61;
        iArr3[6] = ((int) j161) & 268435455;
        iArr3[7] = ((int) j169) & 268435455;
        iArr3[8] = ((int) j172) & 268435455;
        iArr3[9] = i54 + ((int) (j172 >>> 28));
        iArr3[10] = i56;
        iArr3[11] = i58;
        iArr3[12] = i60;
        iArr3[13] = i62;
        iArr3[14] = ((int) j162) & 268435455;
        iArr3[15] = ((int) j170) & 268435455;
    }

    /* renamed from: P */
    public static boolean m7146P(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m7147Q(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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
    public static boolean m7148R(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: S */
    public static long[] m7149S(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[3];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArr;
    }

    /* renamed from: T */
    public static int m7150T(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: U */
    public static boolean m7151U(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: V */
    public static boolean m7152V(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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

    /* renamed from: W */
    public static boolean m7153W(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public static BigInteger m7154X(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C3436p.m8242d(i2, (4 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: Y */
    public static BigInteger m7155Y(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                C3436p.m8246h(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: Z */
    public static void m7156Z(char[] cArr) {
        if (!m7186u(cArr)) {
            Arrays.fill(cArr, '0');
        }
    }

    /* renamed from: a0 */
    public static void m7157a0(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
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
        iArr3[5] = (int) (((((long) iArr[i + 5]) & UnsignedInteger.INT_MASK) - (((long) iArr2[i2 + 5]) & UnsignedInteger.INT_MASK)) + (j5 >> 32));
    }

    /* renamed from: b0 */
    public static void m7158b0(int[] iArr, int[] iArr2) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i3 * 2;
        int i20 = i4 * 2;
        int i21 = i5 * 2;
        int i22 = i6 * 2;
        int i23 = i7 * 2;
        int i24 = i9 * 2;
        int i25 = i10 * 2;
        int i26 = i11 * 2;
        int i27 = i12 * 2;
        int i28 = i13 * 2;
        int i29 = i14 * 2;
        int i30 = i15 * 2;
        int i31 = i + i9;
        int i32 = i9;
        int i33 = i2 + i10;
        int i34 = i10;
        int i35 = i3 + i11;
        int i36 = i11;
        int i37 = i4 + i12;
        int i38 = i12;
        int i39 = i5 + i13;
        int i40 = i4;
        int i41 = i6 + i14;
        int i42 = i3;
        int i43 = i7 + i15;
        int i44 = i2;
        int i45 = i31 * 2;
        int i46 = i33 * 2;
        int i47 = i33;
        int i48 = i35 * 2;
        int i49 = i35;
        int i50 = i37 * 2;
        int i51 = i37;
        int i52 = i39 * 2;
        int i53 = i41 * 2;
        int i54 = i41;
        int i55 = i39;
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) i8;
        int i56 = i18;
        int i57 = i48;
        long j4 = (long) i56;
        long j5 = j3 * j4;
        long j6 = j4;
        long j7 = (long) i7;
        long j8 = j3;
        long j9 = (long) i19;
        long j10 = (j7 * j9) + j5;
        long j11 = (long) i6;
        long j12 = j7;
        long j13 = (long) i20;
        long j14 = (j11 * j13) + j10;
        long j15 = j11;
        long j16 = (long) i5;
        long j17 = (j16 * j16) + j14;
        long j18 = j16;
        long j19 = (long) i32;
        long j20 = j13;
        long j21 = (long) i16;
        long j22 = j9;
        long j23 = (long) i25;
        long j24 = j21 * j23;
        int i58 = i43 * 2;
        long j25 = (long) i15;
        long j26 = j23;
        long j27 = (long) i26;
        long j28 = (j25 * j27) + j24;
        long j29 = j25;
        long j30 = (long) i14;
        long j31 = j27;
        long j32 = (long) i27;
        long j33 = (j30 * j32) + j28;
        long j34 = j30;
        long j35 = (long) i13;
        long j36 = (j35 * j35) + j33;
        long j37 = j35;
        long j38 = (long) i31;
        long j39 = j32;
        long j40 = (long) (i8 + i16);
        long j41 = (long) i46;
        long j42 = j40 * j41;
        long j43 = (long) i43;
        long j44 = j41;
        long j45 = (long) i57;
        long j46 = (j43 * j45) + j42;
        long j47 = j43;
        long j48 = (long) i54;
        int i59 = i58;
        long j49 = (long) i50;
        long j50 = (j48 * j49) + j46;
        int i60 = i55;
        long j51 = j48;
        long j52 = (long) i60;
        long j53 = (j52 * j52) + j50;
        long j54 = ((j2 + (j19 * j19)) + j53) - j17;
        long j55 = ((j36 + (j38 * j38)) - j2) + j53;
        int i61 = ((int) j54) & 268435455;
        int i62 = ((int) j55) & 268435455;
        int i63 = i44;
        long j56 = j52;
        long j57 = (long) i63;
        long j58 = j55 >>> 28;
        long j59 = (long) i17;
        long j60 = j57 * j59;
        long j61 = j57;
        long j62 = (long) i21;
        long j63 = (j15 * j62) + (j12 * j20) + (j8 * j22);
        long j64 = j62;
        long j65 = (long) i34;
        long j66 = j59;
        long j67 = (long) i24;
        long j68 = j65 * j67;
        long j69 = (j29 * j39) + (j21 * j31);
        long j70 = j21;
        long j71 = (long) i28;
        long j72 = (j34 * j71) + j69;
        long j73 = j71;
        long j74 = (long) i47;
        int i64 = i45;
        long j75 = j65;
        long j76 = (long) i64;
        long j77 = (j47 * j49) + (j40 * j45);
        long j78 = j45;
        long j79 = (long) i52;
        long j80 = (j51 * j79) + j77;
        long j81 = (((j60 + j68) + j80) - j63) + (j54 >>> 28);
        int i65 = i59;
        long j82 = ((j72 + (j74 * j76)) - j60) + j80 + j58;
        long j83 = j82 >>> 28;
        long j84 = (long) i42;
        long j85 = (j61 * j61) + (j84 * j66);
        long j86 = (j15 * j15) + (j12 * j64) + (j8 * j20);
        long j87 = j84;
        long j88 = (long) i36;
        long j89 = (j75 * j75) + (j88 * j67);
        long j90 = (j34 * j34) + (j29 * j73) + (j70 * j39);
        long j91 = j88;
        long j92 = (long) i49;
        long j93 = (j51 * j51) + (j47 * j79) + (j40 * j49);
        long j94 = ((j85 + j89) + j93) - j86;
        long j95 = j49;
        long j96 = j94 + (j81 >>> 28);
        long j97 = ((j90 + ((j74 * j74) + (j92 * j76))) - j85) + j93 + j83;
        int i66 = ((int) j96) & 268435455;
        int i67 = ((int) j97) & 268435455;
        int i68 = i40;
        int i69 = ((int) j82) & 268435455;
        long j98 = (long) i68;
        long j99 = (j87 * j6) + (j98 * j66);
        long j100 = j98;
        long j101 = (long) i22;
        long j102 = (j12 * j101) + (j8 * j64);
        long j103 = (long) i38;
        long j104 = (j91 * j26) + (j103 * j67);
        long j105 = j70 * j73;
        long j106 = j103;
        long j107 = (long) i29;
        long j108 = (j29 * j107) + j105;
        long j109 = j107;
        long j110 = (long) i51;
        long j111 = j79 * j40;
        long j112 = j40;
        long j113 = (long) i53;
        long j114 = (j47 * j113) + j111;
        long j115 = (((j99 + j104) + j114) - j102) + (j96 >>> 28);
        int i70 = ((int) j115) & 268435455;
        long j116 = ((j108 + ((j92 * j44) + (j110 * j76))) - j99) + j114 + (j97 >>> 28);
        long j117 = j87 * j87;
        long j118 = j117 + (j100 * j6) + (j18 * j66);
        long j119 = (j12 * j12) + (j101 * j8);
        long j120 = (j91 * j91) + (j106 * j26) + (j37 * j67);
        long j121 = j92 * j92;
        long j122 = (j47 * j47) + (j113 * j112);
        long j123 = (((j118 + j120) + j122) - j119) + (j115 >>> 28);
        long j124 = j123 >>> 28;
        long j125 = ((((j29 * j29) + (j70 * j109)) + (j121 + ((j110 * j44) + (j56 * j76)))) - j118) + j122 + (j116 >>> 28);
        long j126 = j100 * j22;
        long j127 = j126 + (j18 * j6) + (j15 * j66);
        int i71 = i23;
        long j128 = (j106 * j31) + (j37 * j26) + (j34 * j67);
        long j129 = (j110 * j78) + (j56 * j44) + (j51 * j76);
        long j130 = j110;
        long j131 = ((long) i65) * j112;
        long j132 = (((j127 + j128) + j131) - (((long) i71) * j8)) + j124;
        long j133 = (((((long) i30) * j70) + j129) - j127) + j131 + (j125 >>> 28);
        long j134 = (j100 * j100) + (j18 * j22) + (j15 * j6) + (j12 * j66);
        long j135 = j130 * j130;
        long j136 = j112 * j112;
        long j137 = (((j134 + ((j106 * j106) + ((j37 * j31) + ((j34 * j26) + (j29 * j67))))) + j136) - (j8 * j8)) + (j132 >>> 28);
        long j138 = (((j70 * j70) + (j135 + ((j56 * j78) + ((j51 * j44) + (j47 * j76))))) - j134) + j136 + (j133 >>> 28);
        long j139 = (j18 * j20) + (j15 * j22) + (j12 * j6) + (j8 * j66);
        long j140 = (j37 * j39) + (j34 * j31) + (j29 * j26) + (j67 * j70);
        long j141 = j140 + j139 + (j137 >>> 28);
        long j142 = (((j56 * j95) + ((j51 * j78) + ((j47 * j44) + (j112 * j76)))) - j139) + (j138 >>> 28);
        long j143 = j142 >>> 28;
        long j144 = (j141 >>> 28) + j143 + ((long) i62);
        long j145 = j143 + ((long) i61);
        iArr2[0] = ((int) j145) & 268435455;
        iArr2[1] = (((int) j81) & 268435455) + ((int) (j145 >>> 28));
        iArr2[2] = i66;
        iArr2[3] = i70;
        iArr2[4] = ((int) j123) & 268435455;
        iArr2[5] = ((int) j132) & 268435455;
        iArr2[6] = ((int) j137) & 268435455;
        iArr2[7] = ((int) j141) & 268435455;
        iArr2[8] = ((int) j144) & 268435455;
        iArr2[9] = i69 + ((int) (j144 >>> 28));
        iArr2[10] = i67;
        iArr2[11] = ((int) j116) & 268435455;
        iArr2[12] = ((int) j125) & 268435455;
        iArr2[13] = ((int) j133) & 268435455;
        iArr2[14] = ((int) j138) & 268435455;
        iArr2[15] = ((int) j142) & 268435455;
    }

    /* renamed from: c0 */
    public static void m7159c0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        int i = 1;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = j3;
        long j7 = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j6) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        iArr3[5] = (int) (j12 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j13 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i3 = i + 0;
            long j14 = j;
            long j15 = (j13 * j) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i3] = (int) j15;
            int i4 = i + 1;
            long j16 = j2;
            long j17 = (j13 * j2) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j15 >>> 32);
            iArr3[i4] = (int) j17;
            long j18 = j17 >>> 32;
            int i5 = i + 2;
            long j19 = (j13 * j6) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + j18;
            iArr3[i5] = (int) j19;
            long j20 = j19 >>> 32;
            int i6 = i + 3;
            long j21 = (j13 * j4) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + j20;
            iArr3[i6] = (int) j21;
            long j22 = j21 >>> 32;
            int i7 = i + 4;
            long j23 = (j13 * j5) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + j22;
            iArr3[i7] = (int) j23;
            iArr3[i + 5] = (int) (j23 >>> 32);
            i = i4;
            j = j14;
            j2 = j16;
        }
    }

    /* renamed from: d0 */
    public static BigInteger m7160d0(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C3436p.m8242d(i2, (5 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: e0 */
    public static void m7161e0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                long j21 = (j16 * j10) + j15;
                int i9 = (int) j21;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long b2 = C0070b.m181b(j16, j6, j21 >>> 32, j18);
                long b3 = C0070b.m181b(j16, j9, b2 >>> 32, j20);
                long j22 = b2 & UnsignedInteger.INT_MASK;
                long j23 = j19 + (b3 >>> 32);
                long j24 = b3 & UnsignedInteger.INT_MASK;
                long j25 = ((long) iArr[4]) & UnsignedInteger.INT_MASK;
                long j26 = (((long) iArr2[7]) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
                long j27 = j23 & UnsignedInteger.INT_MASK;
                long j28 = (((long) iArr2[8]) & UnsignedInteger.INT_MASK) + (j26 >>> 32);
                long j29 = j26 & UnsignedInteger.INT_MASK;
                long j30 = (j10 * j25) + j22;
                int i10 = (int) j30;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long b4 = C0070b.m181b(j25, j6, j30 >>> 32, j24);
                long b5 = C0070b.m181b(j25, j9, b4 >>> 32, j27);
                long b6 = C0070b.m181b(j25, j16, b5 >>> 32, j29);
                long j31 = j28 + (b6 >>> 32);
                int i11 = (int) b4;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                int i12 = (int) b5;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) b6;
                iArr2[7] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j31;
                iArr2[8] = i15 | (i16 << 1);
                iArr2[9] = (i16 >>> 31) | ((iArr2[9] + ((int) (j31 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    /* renamed from: f */
    public static int m7162f(int i, int i2, int i3, int[] iArr, int[] iArr2) {
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
        long j7 = (((long) iArr[i + 5]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[i9])) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    /* renamed from: f0 */
    public static void m7163f0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j6 = j3;
        long j7 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j8 = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j6) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j7) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        iArr3[6] = (int) (j14 >>> 32);
        int i = 1;
        for (int i2 = 6; i < i2; i2 = 6) {
            long j15 = ((long) iArr[i]) & UnsignedInteger.INT_MASK;
            int i3 = i + 0;
            long j16 = j;
            long j17 = (j15 * j) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + 0;
            iArr3[i3] = (int) j17;
            int i4 = i + 1;
            long j18 = j2;
            long j19 = (j15 * j2) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j17 >>> 32);
            iArr3[i4] = (int) j19;
            int i5 = i + 2;
            long j20 = (j15 * j6) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
            iArr3[i5] = (int) j20;
            int i6 = i + 3;
            long j21 = (j15 * j4) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j20 >>> 32);
            iArr3[i6] = (int) j21;
            int i7 = i + 4;
            long j22 = (j15 * j5) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
            iArr3[i7] = (int) j22;
            long j23 = j22 >>> 32;
            int i8 = i + 5;
            long j24 = (j15 * j7) + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + j23;
            iArr3[i8] = (int) j24;
            iArr3[i + 6] = (int) (j24 >>> 32);
            i = i4;
            j = j16;
            j2 = j18;
        }
    }

    /* renamed from: g */
    public static int m7164g(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (((long) iArr2[12]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j;
        iArr[6] = i;
        iArr2[12] = i;
        long j2 = (((long) iArr[7]) & UnsignedInteger.INT_MASK) + (((long) iArr2[13]) & UnsignedInteger.INT_MASK) + (j >>> 32);
        int i2 = (int) j2;
        iArr[7] = i2;
        iArr2[13] = i2;
        long j3 = (((long) iArr[8]) & UnsignedInteger.INT_MASK) + (((long) iArr2[14]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[8] = i3;
        iArr2[14] = i3;
        long j4 = (((long) iArr[9]) & UnsignedInteger.INT_MASK) + (((long) iArr2[15]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[9] = i4;
        iArr2[15] = i4;
        long j5 = (((long) iArr[10]) & UnsignedInteger.INT_MASK) + (((long) iArr2[16]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[10] = i5;
        iArr2[16] = i5;
        long j6 = (((long) iArr[11]) & UnsignedInteger.INT_MASK) + (UnsignedInteger.INT_MASK & ((long) iArr2[17])) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[11] = i6;
        iArr2[17] = i6;
        return (int) (j6 >>> 32);
    }

    /* renamed from: g0 */
    public static void m7165g0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & UnsignedInteger.INT_MASK;
        int i = 12;
        int i2 = 5;
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
                long j41 = (j18 * j36) + j31;
                int i12 = (int) j41;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long b7 = C0070b.m181b(j6, j36, j41 >>> 32, j33);
                long b8 = C0070b.m181b(j36, j9, b7 >>> 32, j35);
                long b9 = C0070b.m181b(j36, j32, b8 >>> 32, j38);
                long b10 = C0070b.m181b(j36, j25, b9 >>> 32, j40);
                long j42 = j39 + (b10 >>> 32);
                int i14 = (int) b7;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = (int) b8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) b9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) b10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j42;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j42 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: h */
    public static int m7166h(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    /* renamed from: i0 */
    public static int m7167i0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j7 = 0;
        while (i < 5) {
            long j8 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j9 = j2;
            long j10 = (j8 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j10;
            int i3 = i + 1;
            long j11 = j3;
            long j12 = (j8 * j3) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + (j10 >>> 32);
            iArr3[i3] = (int) j12;
            int i4 = i + 2;
            int i5 = i3;
            long j13 = (j8 * j4) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            int i6 = i + 3;
            long j14 = (j8 * j5) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            long j15 = j14 >>> 32;
            int i7 = i + 4;
            long j16 = (j8 * j6) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + j15;
            iArr3[i7] = (int) j16;
            int i8 = i + 5;
            long j17 = (j16 >>> 32) + j7 + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK);
            iArr3[i8] = (int) j17;
            j7 = j17 >>> 32;
            j = 4294967295L;
            j2 = j9;
            i = i5;
            j3 = j11;
            j4 = j4;
        }
        return (int) j7;
    }

    /* renamed from: j */
    public static Hashtable m7168j(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    /* renamed from: j0 */
    public static void m7169j0(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & UnsignedInteger.INT_MASK) - (((long) iArr[0]) & UnsignedInteger.INT_MASK)) + 0;
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & UnsignedInteger.INT_MASK) - (((long) iArr[1]) & UnsignedInteger.INT_MASK)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & UnsignedInteger.INT_MASK) - (((long) iArr[2]) & UnsignedInteger.INT_MASK)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & UnsignedInteger.INT_MASK) - (((long) iArr[3]) & UnsignedInteger.INT_MASK)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((((long) iArr2[4]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr[4]))) + (j4 >> 32));
    }

    /* renamed from: k */
    public static C7681d m7170k(C7681d dVar) {
        C7681d dVar2 = dVar;
        for (int i = 1; i < dVar.mo20097f(); i++) {
            dVar2 = dVar2.mo20104m().mo20094c(dVar);
        }
        return dVar2;
    }

    /* renamed from: k0 */
    public static void m7171k0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = (i2 + 536870910) - i18;
        int i32 = (i6 + 536870910) - i22;
        int i33 = (i10 + 536870910) - i26;
        int i34 = (i14 + 536870910) - i30;
        int i35 = ((i3 + 536870910) - i19) + (i31 >>> 28);
        int i36 = ((i7 + 536870910) - i23) + (i32 >>> 28);
        int i37 = ((i11 + 536870910) - i27) + (i33 >>> 28);
        int i38 = ((i15 + 536870910) - iArr2[14]) + (i34 >>> 28);
        int i39 = ((i4 + 536870910) - i20) + (i35 >>> 28);
        int i40 = ((i8 + 536870910) - i24) + (i36 >>> 28);
        int i41 = ((i12 + 536870910) - i28) + (i37 >>> 28);
        int i42 = ((i16 + 536870910) - iArr2[15]) + (i38 >>> 28);
        int i43 = i42 >>> 28;
        int i44 = ((i + 536870910) - i17) + i43;
        int i45 = ((i5 + 536870910) - i21) + (i39 >>> 28);
        int i46 = ((i9 + 536870908) - i25) + i43 + (i40 >>> 28);
        int i47 = ((i13 + 536870910) - i29) + (i41 >>> 28);
        iArr3[0] = i44 & 268435455;
        iArr3[1] = (i31 & 268435455) + (i44 >>> 28);
        iArr3[2] = i35 & 268435455;
        iArr3[3] = i39 & 268435455;
        iArr3[4] = i45 & 268435455;
        iArr3[5] = (i32 & 268435455) + (i45 >>> 28);
        iArr3[6] = i36 & 268435455;
        iArr3[7] = i40 & 268435455;
        iArr3[8] = i46 & 268435455;
        iArr3[9] = (i33 & 268435455) + (i46 >>> 28);
        iArr3[10] = i37 & 268435455;
        iArr3[11] = i41 & 268435455;
        iArr3[12] = i47 & 268435455;
        iArr3[13] = (i34 & 268435455) + (i47 >>> 28);
        iArr3[14] = i38 & 268435455;
        iArr3[15] = i42 & 268435455;
    }

    /* renamed from: l */
    public static C7686e m7172l(C7676c cVar, byte[] bArr) {
        C7681d b = cVar.mo20073b(BigInteger.valueOf((long) (bArr[bArr.length - 1] & 1)));
        C7681d b2 = cVar.mo20073b(new BigInteger(1, bArr));
        if (!m7170k(b2).equals(cVar.f17024b)) {
            b2 = b2.mo20100i();
        }
        C7681d dVar = null;
        if (b2.mo20109r()) {
            dVar = cVar.f17025c.mo20106o();
        } else {
            C7681d c = b2.mo20104m().mo20105n().mo20101j(cVar.f17025c).mo20094c(cVar.f17024b).mo20094c(b2);
            if (!c.mo20109r()) {
                C7681d b3 = cVar.mo20073b(C7675b.f17018a);
                Random random = new Random();
                int f = c.mo20097f();
                while (true) {
                    C7681d b4 = cVar.mo20073b(new BigInteger(f, random));
                    C7681d dVar2 = c;
                    C7681d dVar3 = b3;
                    for (int i = 1; i <= f - 1; i++) {
                        C7681d m = dVar2.mo20104m();
                        dVar3 = dVar3.mo20104m().mo20094c(m.mo20101j(b4));
                        dVar2 = m.mo20094c(c);
                    }
                    if (dVar2.mo20109r()) {
                        if (!dVar3.mo20104m().mo20094c(dVar3).mo20109r()) {
                            c = dVar3;
                            break;
                        }
                    } else {
                        c = null;
                        break;
                    }
                }
            }
            if (c != null) {
                if (!m7170k(c).equals(b)) {
                    c = c.mo20100i();
                }
                dVar = b2.mo20101j(c);
            }
        }
        if (dVar != null) {
            return cVar.mo20075d(b2.mo20092a(), dVar.mo20092a());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    /* renamed from: l0 */
    public static int m7173l0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr2[0]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr2[1]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr2[2]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr2[3]) & UnsignedInteger.INT_MASK;
        long j6 = ((long) iArr2[4]) & UnsignedInteger.INT_MASK;
        long j7 = ((long) iArr2[5]) & UnsignedInteger.INT_MASK;
        long j8 = 0;
        while (i < 6) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j11 = j2;
            long j12 = (j10 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = (j10 * j3) + (((long) iArr3[i3]) & UnsignedInteger.INT_MASK) + (j12 >>> 32);
            iArr3[i3] = (int) j13;
            int i4 = i + 2;
            long j14 = (j10 * j4) + (((long) iArr3[i4]) & UnsignedInteger.INT_MASK) + (j13 >>> 32);
            iArr3[i4] = (int) j14;
            int i5 = i + 3;
            long j15 = (j10 * j5) + (((long) iArr3[i5]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
            iArr3[i5] = (int) j15;
            int i6 = i + 4;
            long j16 = (j10 * j6) + (((long) iArr3[i6]) & UnsignedInteger.INT_MASK) + (j15 >>> 32);
            iArr3[i6] = (int) j16;
            long j17 = j16 >>> 32;
            int i7 = i + 5;
            long j18 = (j10 * j9) + (((long) iArr3[i7]) & UnsignedInteger.INT_MASK) + j17;
            iArr3[i7] = (int) j18;
            int i8 = i + 6;
            long j19 = j8 + (((long) iArr3[i8]) & UnsignedInteger.INT_MASK) + (j18 >>> 32);
            iArr3[i8] = (int) j19;
            j8 = j19 >>> 32;
            i = i3;
            j = 4294967295L;
            j7 = j9;
            j2 = j11;
            j3 = j3;
        }
        return (int) j8;
    }

    /* renamed from: m */
    public static void m7174m(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 16; i2++) {
            iArr2[i + i2] = iArr[0 + i2];
        }
    }

    /* renamed from: m0 */
    public static void m7175m0(int[] iArr, int[] iArr2) {
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
        iArr2[5] = (int) (((((long) iArr2[5]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) iArr[5]))) + (j5 >> 32));
    }

    /* renamed from: n */
    public static void m7176n(byte[] bArr, int[] iArr) {
        m7179p(iArr, 0, bArr, 0);
        m7179p(iArr, 2, bArr, 7);
        m7179p(iArr, 4, bArr, 14);
        m7179p(iArr, 6, bArr, 21);
        m7179p(iArr, 8, bArr, 28);
        m7179p(iArr, 10, bArr, 35);
        m7179p(iArr, 12, bArr, 42);
        m7179p(iArr, 14, bArr, 49);
    }

    /* renamed from: o */
    public static void m7177o(int[] iArr, int i) {
        int i2 = iArr[15];
        int i3 = i2 & 268435455;
        int i4 = (i2 >> 28) + i;
        iArr[8] = iArr[8] + i4;
        for (int i5 = 0; i5 < 15; i5++) {
            int i6 = i4 + iArr[i5];
            iArr[i5] = i6 & 268435455;
            i4 = i6 >> 28;
        }
        iArr[15] = i3 + i4;
    }

    /* renamed from: o0 */
    public static int m7178o0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >> 32);
    }

    /* renamed from: p */
    public static void m7179p(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = (i4 << 28) | i3;
        bArr[i2] = (byte) i5;
        int i6 = i2 + 1;
        bArr[i6] = (byte) (i5 >>> 8);
        int i7 = i6 + 1;
        bArr[i7] = (byte) (i5 >>> 16);
        bArr[i7 + 1] = (byte) (i5 >>> 24);
        int i8 = i4 >>> 4;
        int i9 = i2 + 4;
        bArr[i9] = (byte) i8;
        int i10 = i9 + 1;
        bArr[i10] = (byte) (i8 >>> 8);
        bArr[i10 + 1] = (byte) (i8 >>> 16);
    }

    /* renamed from: p0 */
    public static int m7180p0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >> 32);
    }

    /* renamed from: q */
    public static void m7181q(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        m7158b0(iArr, iArr4);
        m7145O(iArr, iArr4, iArr4);
        int[] iArr5 = new int[16];
        m7158b0(iArr4, iArr5);
        m7145O(iArr, iArr5, iArr5);
        int[] iArr6 = new int[16];
        m7143M(3, iArr5, iArr6);
        m7145O(iArr5, iArr6, iArr6);
        int[] iArr7 = new int[16];
        m7143M(3, iArr6, iArr7);
        m7145O(iArr5, iArr7, iArr7);
        int[] iArr8 = new int[16];
        m7143M(9, iArr7, iArr8);
        m7145O(iArr7, iArr8, iArr8);
        int[] iArr9 = new int[16];
        m7158b0(iArr8, iArr9);
        m7145O(iArr, iArr9, iArr9);
        int[] iArr10 = new int[16];
        m7143M(18, iArr9, iArr10);
        m7145O(iArr8, iArr10, iArr10);
        int[] iArr11 = new int[16];
        m7143M(37, iArr10, iArr11);
        m7145O(iArr10, iArr11, iArr11);
        int[] iArr12 = new int[16];
        m7143M(37, iArr11, iArr12);
        m7145O(iArr10, iArr12, iArr12);
        int[] iArr13 = new int[16];
        m7143M(111, iArr12, iArr13);
        m7145O(iArr12, iArr13, iArr13);
        int[] iArr14 = new int[16];
        m7158b0(iArr13, iArr14);
        m7145O(iArr, iArr14, iArr14);
        int[] iArr15 = new int[16];
        m7143M(223, iArr14, iArr15);
        m7145O(iArr15, iArr13, iArr3);
        m7143M(2, iArr3, iArr3);
        m7145O(iArr3, iArr, iArr2);
    }

    /* renamed from: r */
    public static void m7182r(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* renamed from: s */
    public static boolean m7183s(C6956b bVar, C6956b bVar2) {
        boolean g = bVar.mo19115g();
        if (bVar2.mo19115g() != g) {
            return false;
        }
        if (!g) {
            return C19388s.m32885t(bVar.mo19116l(), bVar2.mo19116l());
        }
        if (bVar.f15435b.mo20580v() != bVar2.f15435b.mo20580v()) {
            return false;
        }
        C6955a[] m = bVar.mo19117m();
        C6955a[] m2 = bVar2.mo19117m();
        if (m.length != m2.length) {
            return false;
        }
        for (int i = 0; i != m.length; i++) {
            if (!C19388s.m32885t(m[i], m2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x007a A[SYNTHETIC] */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7184s0(android.content.Context r5, java.lang.String r6, long r7, long r9, java.lang.String r11) {
        /*
            java.lang.String r0 = "="
            java.lang.String r1 = "UTF-8"
            io.branch.referral.r r2 = p145io.branch.referral.C7077r.m13677h(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x001c
            r2.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x001c
            java.lang.String r3 = "bnc_app_store_source"
            r2.mo19335y(r3, r11)
        L_0x001c:
            r3 = 0
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x0027
            java.lang.String r11 = "bnc_referrer_click_ts"
            r2.mo19332v(r7, r11)
        L_0x0027:
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0030
            java.lang.String r7 = "bnc_install_begin_ts"
            r2.mo19332v(r9, r7)
        L_0x0030:
            if (r6 == 0) goto L_0x0134
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = "&"
            java.lang.String[] r8 = r6.split(r8)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r9 = "bnc_google_play_install_referrer_extras"
            r2.mo19335y(r9, r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            int r6 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r9 = 0
            r10 = r9
        L_0x0049:
            if (r10 >= r6) goto L_0x007d
            r11 = r8[r10]     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r3 != 0) goto L_0x007a
            boolean r3 = r11.contains(r0)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r4 = "-"
            if (r3 != 0) goto L_0x0062
            boolean r3 = r11.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r3 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.lang.String[] r11 = r11.split(r4)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            int r3 = r11.length     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r4 = 1
            if (r3 <= r4) goto L_0x007a
            r3 = r11[r9]     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r11 = r11[r4]     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r11 = java.net.URLDecoder.decode(r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r7.put(r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
        L_0x007a:
            int r10 = r10 + 1
            goto L_0x0049
        L_0x007d:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.LinkClickID     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r8 = r7.containsKey(r8)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r8 == 0) goto L_0x009a
            java.lang.String r6 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            f6917b = r6     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = "bnc_link_click_identifier"
            r2.mo19335y(r8, r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
        L_0x009a:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.IsFullAppConv     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r8 = r7.containsKey(r8)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r8 == 0) goto L_0x00e2
            io.branch.referral.Defines$Jsonkey r8 = p145io.branch.referral.Defines$Jsonkey.ReferringLink     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r9 = r8.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r9 = r7.containsKey(r9)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r9 == 0) goto L_0x00e2
            java.lang.String r6 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r6 = java.lang.Boolean.parseBoolean(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            android.content.SharedPreferences$Editor r9 = r2.f15758b     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r6 = r6.booleanValue()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r10 = "bnc_is_full_app_conversion"
            android.content.SharedPreferences$Editor r6 = r9.putBoolean(r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r6.apply()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = r8.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = "bnc_app_link"
            r2.mo19335y(r8, r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
        L_0x00e2:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.GoogleSearchInstallReferrer     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r8 = r7.containsKey(r8)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r8 == 0) goto L_0x00fd
            java.lang.String r6 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r8 = "bnc_google_search_install_identifier"
            r2.mo19335y(r8, r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
        L_0x00fd:
            io.branch.referral.Defines$Jsonkey r6 = p145io.branch.referral.Defines$Jsonkey.PlayAutoInstalls     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = r6.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r6 = r7.containsValue(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r6 == 0) goto L_0x010c
            p772tq.C20203a.m34522E(r5, r7)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
        L_0x010c:
            io.branch.referral.Defines$Jsonkey r5 = p145io.branch.referral.Defines$Jsonkey.ReferrerExtraGclidParam     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r6 = r5.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            boolean r6 = r7.containsKey(r6)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            if (r6 == 0) goto L_0x0134
            java.lang.String r5 = r5.getKey()     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            r2.mo19333w(r5)     // Catch:{ UnsupportedEncodingException -> 0x0130, IllegalArgumentException -> 0x0126 }
            goto L_0x0134
        L_0x0126:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.String r5 = "Illegal characters in url encoded string"
            p145io.branch.referral.C7077r.m13675a(r5)
            goto L_0x0134
        L_0x0130:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3039b.m7184s0(android.content.Context, java.lang.String, long, long, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[LOOP:0: B:10:0x003d->B:33:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7185t(p128h6.C6957c r10, p128h6.C6957c r11) {
        /*
            h6.b[] r10 = r10.f15440e
            int r0 = r10.length
            h6.b[] r1 = new p128h6.C6956b[r0]
            r2 = 0
            java.lang.System.arraycopy(r10, r2, r1, r2, r0)
            h6.b[] r10 = r11.f15440e
            int r11 = r10.length
            h6.b[] r3 = new p128h6.C6956b[r11]
            java.lang.System.arraycopy(r10, r2, r3, r2, r11)
            if (r0 == r11) goto L_0x0014
            return r2
        L_0x0014:
            r10 = r1[r2]
            h6.a r10 = r10.mo19116l()
            r4 = 1
            if (r10 == 0) goto L_0x003b
            r10 = r3[r2]
            h6.a r10 = r10.mo19116l()
            if (r10 == 0) goto L_0x003b
            r10 = r1[r2]
            h6.a r10 = r10.mo19116l()
            t5.a r10 = r10.f15433b
            r5 = r3[r2]
            h6.a r5 = r5.mo19116l()
            t5.a r5 = r5.f15433b
            boolean r10 = r10.equals(r5)
            r10 = r10 ^ r4
            goto L_0x003c
        L_0x003b:
            r10 = r2
        L_0x003c:
            r5 = r2
        L_0x003d:
            if (r5 == r0) goto L_0x0073
            r6 = r1[r5]
            r7 = 0
            if (r10 == 0) goto L_0x0058
            int r8 = r11 + -1
        L_0x0046:
            if (r8 < 0) goto L_0x006c
            r9 = r3[r8]
            if (r9 == 0) goto L_0x0055
            boolean r9 = m7183s(r6, r9)
            if (r9 == 0) goto L_0x0055
            r3[r8] = r7
            goto L_0x0067
        L_0x0055:
            int r8 = r8 + -1
            goto L_0x0046
        L_0x0058:
            r8 = r2
        L_0x0059:
            if (r8 == r11) goto L_0x006c
            r9 = r3[r8]
            if (r9 == 0) goto L_0x0069
            boolean r9 = m7183s(r6, r9)
            if (r9 == 0) goto L_0x0069
            r3[r8] = r7
        L_0x0067:
            r6 = r4
            goto L_0x006d
        L_0x0069:
            int r8 = r8 + 1
            goto L_0x0059
        L_0x006c:
            r6 = r2
        L_0x006d:
            if (r6 != 0) goto L_0x0070
            return r2
        L_0x0070:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3039b.m7185t(h6.c, h6.c):boolean");
    }

    /* renamed from: u */
    public static boolean m7186u(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    /* renamed from: v */
    public static boolean m7187v(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public static boolean m7188w(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m7189x(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[6 + i] ^ Integer.MIN_VALUE;
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
            m7157a0(iArr, 6, iArr2, 0, iArr3);
        } else {
            m7157a0(iArr2, 0, iArr, 6, iArr3);
        }
        return z;
    }

    /* renamed from: y */
    public static char[] m7190y(String str) {
        return (str == null || str.isEmpty()) ? new char[0] : str.toCharArray();
    }

    /* renamed from: z */
    public static int[] m7191z(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    /* renamed from: K */
    public abstract String mo11179K(C6957c cVar);

    /* renamed from: c */
    public Set mo11180c(Class cls) {
        return (Set) mo69937a(cls).get();
    }

    /* renamed from: e */
    public Metadata mo11181e(C14044c cVar) {
        ByteBuffer byteBuffer = cVar.f31493d;
        byteBuffer.getClass();
        C14075p.m21691c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (cVar.mo69762i()) {
            return null;
        }
        return mo11184n0(cVar, byteBuffer);
    }

    public Object get(Class cls) {
        C18895a d = mo69938d(cls);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    /* renamed from: h0 */
    public abstract void mo11183h0(C7433t tVar);

    /* renamed from: n0 */
    public abstract Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer);

    /* renamed from: q0 */
    public abstract void mo11185q0();

    /* renamed from: r0 */
    public abstract long mo11186r0(ViewGroup viewGroup, C7418m mVar, C7433t tVar, C7433t tVar2);

    /* renamed from: t0 */
    public abstract boolean mo11187t0(char c);
}
