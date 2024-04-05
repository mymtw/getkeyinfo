package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.common.hash.BloomFilter;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 {
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C16249a aVar) {
            long a = aVar.mo57792a();
            int i2 = Hashing.f36344a;
            long asLong = Murmur3_128HashFunction.MURMUR3_128.hashObject(t, funnel).asLong();
            int i3 = (int) asLong;
            int i4 = (int) (asLong >>> 32);
            for (int i5 = 1; i5 <= i; i5++) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                if (!aVar.mo57793b(((long) i6) % a)) {
                    return false;
                }
            }
            return true;
        }

        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C16249a aVar) {
            long a = aVar.mo57792a();
            int i2 = Hashing.f36344a;
            long asLong = Murmur3_128HashFunction.MURMUR3_128.hashObject(t, funnel).asLong();
            int i3 = (int) asLong;
            int i4 = (int) (asLong >>> 32);
            boolean z = false;
            for (int i5 = 1; i5 <= i; i5++) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                z |= aVar.mo57794c(((long) i6) % a);
            }
            return z;
        }
    },
    MURMUR128_MITZ_64 {
        private long lowerEight(byte[] bArr) {
            return Longs.m26386a(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.m26386a(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C16249a aVar) {
            long a = aVar.mo57792a();
            int i2 = Hashing.f36344a;
            byte[] bytesInternal = Murmur3_128HashFunction.MURMUR3_128.hashObject(t, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            for (int i3 = 0; i3 < i; i3++) {
                if (!aVar.mo57793b((Long.MAX_VALUE & lowerEight) % a)) {
                    return false;
                }
                lowerEight += upperEight;
            }
            return true;
        }

        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C16249a aVar) {
            long a = aVar.mo57792a();
            int i2 = Hashing.f36344a;
            byte[] bytesInternal = Murmur3_128HashFunction.MURMUR3_128.hashObject(t, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            boolean z = false;
            for (int i3 = 0; i3 < i; i3++) {
                z |= aVar.mo57794c((Long.MAX_VALUE & lowerEight) % a);
                lowerEight += upperEight;
            }
            return z;
        }
    };

    /* renamed from: com.google.common.hash.BloomFilterStrategies$a */
    public static final class C16249a {

        /* renamed from: a */
        public final AtomicLongArray f36339a;

        /* renamed from: b */
        public final C16275i f36340b;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
            if (r1 > 0) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
            if (r13 > 0) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            if (r13 < 0) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r14 == false) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
            r3 = r3 + ((long) r13);
         */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16249a(long r13) {
            /*
                r12 = this;
                java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
                r0.getClass()
                r1 = 64
                long r3 = r13 / r1
                long r5 = r3 * r1
                long r5 = r13 - r5
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L_0x0015
                goto L_0x006a
            L_0x0015:
                long r13 = r13 ^ r1
                r10 = 63
                long r13 = r13 >> r10
                int r13 = (int) r13
                r14 = 1
                r13 = r13 | r14
                int[] r10 = com.google.common.math.C16290d.f36386a
                int r11 = r0.ordinal()
                r10 = r10[r11]
                r11 = 0
                switch(r10) {
                    case 1: goto L_0x005f;
                    case 2: goto L_0x0065;
                    case 3: goto L_0x005c;
                    case 4: goto L_0x0066;
                    case 5: goto L_0x0059;
                    case 6: goto L_0x002e;
                    case 7: goto L_0x002e;
                    case 8: goto L_0x002e;
                    default: goto L_0x0028;
                }
            L_0x0028:
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x002e:
                long r5 = java.lang.Math.abs(r5)
                long r1 = java.lang.Math.abs(r1)
                long r1 = r1 - r5
                long r5 = r5 - r1
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 != 0) goto L_0x0056
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
                if (r0 != r1) goto L_0x0042
                r1 = r14
                goto L_0x0043
            L_0x0042:
                r1 = r11
            L_0x0043:
                java.math.RoundingMode r2 = java.math.RoundingMode.HALF_EVEN
                if (r0 != r2) goto L_0x0049
                r0 = r14
                goto L_0x004a
            L_0x0049:
                r0 = r11
            L_0x004a:
                r5 = 1
                long r5 = r5 & r3
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0052
                goto L_0x0053
            L_0x0052:
                r14 = r11
            L_0x0053:
                r14 = r14 & r0
                r14 = r14 | r1
                goto L_0x0066
            L_0x0056:
                if (r1 <= 0) goto L_0x0065
                goto L_0x0066
            L_0x0059:
                if (r13 <= 0) goto L_0x0065
                goto L_0x0066
            L_0x005c:
                if (r13 >= 0) goto L_0x0065
                goto L_0x0066
            L_0x005f:
                if (r9 != 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r14 = r11
            L_0x0063:
                if (r14 == 0) goto L_0x0074
            L_0x0065:
                r14 = r11
            L_0x0066:
                if (r14 == 0) goto L_0x006a
                long r13 = (long) r13
                long r3 = r3 + r13
            L_0x006a:
                int r13 = com.google.common.primitives.Ints.m26383a(r3)
                long[] r13 = new long[r13]
                r12.<init>((long[]) r13)
                return
            L_0x0074:
                java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
                java.lang.String r14 = "mode was UNNECESSARY, but rounding was necessary"
                r13.<init>(r14)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.BloomFilterStrategies.C16249a.<init>(long):void");
        }

        /* renamed from: d */
        public static long[] m26263d(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* renamed from: a */
        public final long mo57792a() {
            return ((long) this.f36339a.length()) * 64;
        }

        /* renamed from: b */
        public final boolean mo57793b(long j) {
            return ((1 << ((int) j)) & this.f36339a.get((int) (j >>> 6))) != 0;
        }

        /* renamed from: c */
        public final boolean mo57794c(long j) {
            long j2;
            long j3;
            if (mo57793b(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f36339a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f36339a.compareAndSet(i, j2, j3));
            this.f36340b.increment();
            return true;
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C16249a) {
                return Arrays.equals(m26263d(this.f36339a), m26263d(((C16249a) obj).f36339a));
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(m26263d(this.f36339a));
        }

        public C16249a(long[] jArr) {
            C15794l.m25614h(jArr.length > 0, "data length is zero!");
            this.f36339a = new AtomicLongArray(jArr);
            this.f36340b = LongAddables.f36345a.get();
            long j = 0;
            for (long bitCount : jArr) {
                j += (long) Long.bitCount(bitCount);
            }
            this.f36340b.add(j);
        }
    }
}
