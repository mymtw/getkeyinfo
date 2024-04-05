package kotlin.random;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.ClassUtils;
import p628nj.C18263b;
import p746hq.C19067b;
import p764pq.C20057i;

public abstract class Random {
    public static final Default Default = new Default((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final Random f43288b = C19067b.f42563a.mo70555b();

    public static final class Default extends Random implements Serializable {

        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        public int nextBits(int i) {
            return Random.f43288b.nextBits(i);
        }

        public boolean nextBoolean() {
            return Random.f43288b.nextBoolean();
        }

        public byte[] nextBytes(byte[] bArr) {
            C19383o.m32797g(bArr, "array");
            return Random.f43288b.nextBytes(bArr);
        }

        public double nextDouble() {
            return Random.f43288b.nextDouble();
        }

        public float nextFloat() {
            return Random.f43288b.nextFloat();
        }

        public int nextInt() {
            return Random.f43288b.nextInt();
        }

        public long nextLong() {
            return Random.f43288b.nextLong();
        }

        public byte[] nextBytes(int i) {
            return Random.f43288b.nextBytes(i);
        }

        public double nextDouble(double d) {
            return Random.f43288b.nextDouble(d);
        }

        public int nextInt(int i) {
            return Random.f43288b.nextInt(i);
        }

        public long nextLong(long j) {
            return Random.f43288b.nextLong(j);
        }

        public byte[] nextBytes(byte[] bArr, int i, int i2) {
            C19383o.m32797g(bArr, "array");
            return Random.f43288b.nextBytes(bArr, i, i2);
        }

        public double nextDouble(double d, double d2) {
            return Random.f43288b.nextDouble(d, d2);
        }

        public int nextInt(int i, int i2) {
            return Random.f43288b.nextInt(i, i2);
        }

        public long nextLong(long j, long j2) {
            return Random.f43288b.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return random.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] bArr, int i, int i2) {
        C19383o.m32797g(bArr, "array");
        boolean z = true;
        if (new C20057i(0, bArr.length).mo74327m(i) && new C20057i(0, bArr.length).mo74327m(i2)) {
            if (i > i2) {
                z = false;
            }
            if (z) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int nextInt = nextInt();
                    bArr[i] = (byte) nextInt;
                    bArr[i + 1] = (byte) (nextInt >>> 8);
                    bArr[i + 2] = (byte) (nextInt >>> 16);
                    bArr[i + 3] = (byte) (nextInt >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int nextBits = nextBits(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (nextBits >>> (i6 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(C0070b.m183e("fromIndex (", i, ") must be not greater than toIndex (", i2, ").").toString());
        }
        throw new IllegalArgumentException(C0073e.m208h(C0472h.m1244g("fromIndex (", i, ") or toIndex (", i2, ") are out of range: 0.."), bArr.length, ClassUtils.PACKAGE_SEPARATOR_CHAR).toString());
    }

    public double nextDouble() {
        return ((double) ((((long) nextBits(26)) << 27) + ((long) nextBits(27)))) / 9.007199254740992E15d;
    }

    public float nextFloat() {
        return ((float) nextBits(24)) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double d) {
        return nextDouble(ShadowDrawableWrapper.COS_45, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            if (r0 == 0) goto L_0x0054
            double r3 = r9 - r7
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 == 0) goto L_0x0043
            boolean r0 = java.lang.Double.isInfinite(r7)
            if (r0 != 0) goto L_0x0021
            boolean r0 = java.lang.Double.isNaN(r7)
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x0043
            boolean r0 = java.lang.Double.isInfinite(r9)
            if (r0 != 0) goto L_0x0031
            boolean r0 = java.lang.Double.isNaN(r9)
            if (r0 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            if (r1 == 0) goto L_0x0043
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L_0x0049
        L_0x0043:
            double r0 = r6.nextDouble()
            double r0 = r0 * r3
            double r7 = r7 + r0
        L_0x0049:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0053
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x0053:
            return r7
        L_0x0054:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.String r7 = p628nj.C18263b.m30872v(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public int nextInt(int i, int i2) {
        int i3;
        int nextInt;
        int i4;
        int nextInt2;
        boolean z;
        if (i2 > i) {
            int i5 = i2 - i;
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                if (((-i5) & i5) == i5) {
                    i3 = nextBits(31 - Integer.numberOfLeadingZeros(i5));
                } else {
                    do {
                        nextInt = nextInt() >>> 1;
                        i4 = nextInt % i5;
                    } while ((i5 - 1) + (nextInt - i4) < 0);
                    i3 = i4;
                }
                return i + i3;
            }
            do {
                nextInt2 = nextInt();
                if (i > nextInt2 || nextInt2 >= i2) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            return nextInt2;
        }
        throw new IllegalArgumentException(C18263b.m30872v(Integer.valueOf(i), Integer.valueOf(i2)).toString());
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        boolean z;
        long j3;
        long nextLong2;
        long j4;
        int i;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i2 = (int) j5;
                    int i3 = (int) (j5 >>> 32);
                    if (i2 != 0) {
                        i = nextBits(31 - Integer.numberOfLeadingZeros(i2));
                    } else if (i3 == 1) {
                        i = nextInt();
                    } else {
                        j3 = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i3))) << 32) + (((long) nextInt()) & UnsignedInteger.INT_MASK);
                    }
                    j3 = ((long) i) & UnsignedInteger.INT_MASK;
                } else {
                    do {
                        nextLong2 = nextLong() >>> 1;
                        j4 = nextLong2 % j5;
                    } while ((j5 - 1) + (nextLong2 - j4) < 0);
                    j3 = j4;
                }
                return j + j3;
            }
            do {
                nextLong = nextLong();
                if (j > nextLong || nextLong >= j2) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            return nextLong;
        }
        throw new IllegalArgumentException(C18263b.m30872v(Long.valueOf(j), Long.valueOf(j2)).toString());
    }

    public byte[] nextBytes(byte[] bArr) {
        C19383o.m32797g(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
