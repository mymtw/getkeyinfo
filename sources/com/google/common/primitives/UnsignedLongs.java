package com.google.common.primitives;

import com.google.common.base.C15794l;
import java.math.BigInteger;
import java.util.Comparator;

public final class UnsignedLongs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return UnsignedLongs.m26390a(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* renamed from: com.google.common.primitives.UnsignedLongs$a */
    public static final class C16298a {

        /* renamed from: a */
        public static final long[] f36400a = new long[37];

        /* renamed from: b */
        public static final int[] f36401b = new int[37];

        /* renamed from: c */
        public static final int[] f36402c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = (long) i;
                f36400a[i] = UnsignedLongs.m26391b(-1, j);
                f36401b[i] = (int) UnsignedLongs.m26392c(-1, j);
                f36402c[i] = bigInteger.toString(i).length() - 1;
            }
        }
    }

    /* renamed from: a */
    public static int m26390a(long j, long j2) {
        int i = ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE) ? 1 : ((j ^ Long.MIN_VALUE) == (j2 ^ Long.MIN_VALUE) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static long m26391b(long j, long j2) {
        if (j2 < 0) {
            return m26390a(j, j2) < 0 ? 0 : 1;
        }
        if (j >= 0) {
            return j / j2;
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (m26390a(j - (j3 * j2), j2) < 0) {
            i = 0;
        }
        return j3 + ((long) i);
    }

    /* renamed from: c */
    public static long m26392c(long j, long j2) {
        if (j2 < 0) {
            return m26390a(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (m26390a(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: d */
    public static String m26393d(int i, long j) {
        C15794l.m25609c(i, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i >= 2 && i <= 36);
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long b = (i & 1) == 0 ? (j >>> 1) / ((long) (i >>> 1)) : m26391b(j, (long) i);
            long j2 = (long) i;
            cArr[63] = Character.forDigit((int) (j - (b * j2)), i);
            i3 = 63;
            while (b > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (b % j2), i);
                b /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
