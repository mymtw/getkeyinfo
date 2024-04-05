package com.google.common.math;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.common.primitives.UnsignedLongs;

enum LongMath$MillerRabinTester {
    SMALL {
        public long mulMod(long j, long j2, long j3) {
            return (j * j2) % j3;
        }

        public long squareMod(long j, long j2) {
            return (j * j) % j2;
        }
    },
    LARGE {
        private long plusMod(long j, long j2, long j3) {
            int i = (j > (j3 - j2) ? 1 : (j == (j3 - j2) ? 0 : -1));
            long j4 = j + j2;
            return i >= 0 ? j4 - j3 : j4;
        }

        private long times2ToThe32Mod(long j, long j2) {
            int i = 32;
            do {
                int min = Math.min(i, Long.numberOfLeadingZeros(j));
                j = UnsignedLongs.m26392c(j << min, j2);
                i -= min;
            } while (i > 0);
            return j;
        }

        public long mulMod(long j, long j2, long j3) {
            long j4 = j3;
            long j5 = j >>> 32;
            long j6 = j2 >>> 32;
            long j7 = j & UnsignedInteger.INT_MASK;
            long j8 = j2 & UnsignedInteger.INT_MASK;
            long times2ToThe32Mod = (j5 * j8) + times2ToThe32Mod(j5 * j6, j4);
            if (times2ToThe32Mod < 0) {
                times2ToThe32Mod = UnsignedLongs.m26392c(times2ToThe32Mod, j4);
            }
            return plusMod(times2ToThe32Mod((j6 * j7) + times2ToThe32Mod, j4), UnsignedLongs.m26392c(j7 * j8, j4), j3);
        }

        public long squareMod(long j, long j2) {
            long j3 = j >>> 32;
            long j4 = j & UnsignedInteger.INT_MASK;
            long times2ToThe32Mod = times2ToThe32Mod(j3 * j3, j2);
            long j5 = j3 * j4 * 2;
            if (j5 < 0) {
                j5 = UnsignedLongs.m26392c(j5, j2);
            }
            return plusMod(times2ToThe32Mod(times2ToThe32Mod + j5, j2), UnsignedLongs.m26392c(j4 * j4, j2), j2);
        }
    };

    private long powMod(long j, long j2, long j3) {
        long j4 = 1;
        while (j2 != 0) {
            if ((j2 & 1) != 0) {
                j4 = mulMod(j4, j, j3);
            }
            j = squareMod(j, j3);
            j2 >>= 1;
        }
        return j4;
    }

    public static boolean test(long j, long j2) {
        return (j2 <= 3037000499L ? SMALL : LARGE).testWitness(j, j2);
    }

    private boolean testWitness(long j, long j2) {
        long j3 = j2;
        long j4 = j3 - 1;
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j5 = j4 >> numberOfTrailingZeros;
        long j6 = j % j3;
        if (j6 == 0) {
            return true;
        }
        long powMod = powMod(j6, j5, j2);
        if (powMod == 1) {
            return true;
        }
        int i = 0;
        while (powMod != j4) {
            i++;
            if (i == numberOfTrailingZeros) {
                return false;
            }
            powMod = squareMod(powMod, j3);
        }
        return true;
    }

    public abstract long mulMod(long j, long j2, long j3);

    public abstract long squareMod(long j, long j2);
}
