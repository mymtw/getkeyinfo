package com.google.common.hash;

import androidx.compose.animation.C0472h;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.common.base.C15794l;
import com.google.common.base.C15795m;
import com.google.common.base.C15803r;
import com.google.common.hash.BloomFilterStrategies;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class BloomFilter<T> implements C15795m<T>, Serializable {
    /* access modifiers changed from: private */
    public final BloomFilterStrategies.C16249a bits;
    /* access modifiers changed from: private */
    public final Funnel<? super T> funnel;
    /* access modifiers changed from: private */
    public final int numHashFunctions;
    /* access modifiers changed from: private */
    public final Strategy strategy;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] data;
        public final Funnel<? super T> funnel;
        public final int numHashFunctions;
        public final Strategy strategy;

        public SerialForm(BloomFilter<T> bloomFilter) {
            this.data = BloomFilterStrategies.C16249a.m26263d(bloomFilter.bits.f36339a);
            this.numHashFunctions = bloomFilter.numHashFunctions;
            this.funnel = bloomFilter.funnel;
            this.strategy = bloomFilter.strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.C16249a(this.data), this.numHashFunctions, this.funnel, this.strategy);
        }
    }

    public interface Strategy extends Serializable {
        <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.C16249a aVar);

        int ordinal();

        <T> boolean put(T t, Funnel<? super T> funnel, int i, BloomFilterStrategies.C16249a aVar);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i, double d) {
        return create(funnel2, (long) i, d);
    }

    public static long optimalNumOfBits(long j, double d) {
        if (d == ShadowDrawableWrapper.COS_45) {
            d = Double.MIN_VALUE;
        }
        return (long) ((Math.log(d) * ((double) (-j))) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    public static int optimalNumOfHashFunctions(long j, long j2) {
        return Math.max(1, (int) Math.round(Math.log(2.0d) * (((double) j2) / ((double) j))));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel2) throws IOException {
        RuntimeException e;
        int i;
        byte b;
        if (inputStream == null) {
            throw new NullPointerException("InputStream");
        } else if (funnel2 != null) {
            byte b2 = -1;
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte readByte = dataInputStream.readByte();
                try {
                    b = dataInputStream.readByte() & 255;
                } catch (RuntimeException e2) {
                    e = e2;
                    b = -1;
                    b2 = readByte;
                    i = -1;
                    StringBuilder g = C0472h.m1244g("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ", b2, " numHashFunctions: ", b, " dataLength: ");
                    g.append(i);
                    throw new IOException(g.toString(), e);
                }
                try {
                    int readInt = dataInputStream.readInt();
                    BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[readByte];
                    long[] jArr = new long[readInt];
                    for (int i2 = 0; i2 < readInt; i2++) {
                        jArr[i2] = dataInputStream.readLong();
                    }
                    return new BloomFilter<>(new BloomFilterStrategies.C16249a(jArr), b, funnel2, bloomFilterStrategies);
                } catch (RuntimeException e3) {
                    e = e3;
                    b2 = readByte;
                    i = -1;
                    StringBuilder g2 = C0472h.m1244g("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ", b2, " numHashFunctions: ", b, " dataLength: ");
                    g2.append(i);
                    throw new IOException(g2.toString(), e);
                }
            } catch (RuntimeException e4) {
                e = e4;
                i = -1;
                b = -1;
                StringBuilder g22 = C0472h.m1244g("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ", b2, " numHashFunctions: ", b, " dataLength: ");
                g22.append(i);
                throw new IOException(g22.toString(), e);
            }
        } else {
            throw new NullPointerException("Funnel");
        }
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Deprecated
    public boolean apply(T t) {
        return mightContain(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r4 = (double) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if ((-9.223372036854776E18d - r4) >= 1.0d) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r4 >= 9.223372036854776E18d) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if ((r1 & r10) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        return (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        throw new java.lang.ArithmeticException("rounded value is out of range for input " + r2 + " and rounding mode " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (java.lang.Math.abs(r2 - r4) == 0.5d) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long approximateElementCount() {
        /*
            r11 = this;
            com.google.common.hash.BloomFilterStrategies$a r0 = r11.bits
            long r0 = r0.mo57792a()
            com.google.common.hash.BloomFilterStrategies$a r2 = r11.bits
            com.google.common.hash.i r2 = r2.f36340b
            long r2 = r2.sum()
            double r2 = (double) r2
            double r0 = (double) r0
            double r2 = r2 / r0
            double r2 = -r2
            double r2 = java.lang.Math.log1p(r2)
            double r2 = -r2
            double r2 = r2 * r0
            int r0 = r11.numHashFunctions
            double r0 = (double) r0
            double r2 = r2 / r0
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            int r1 = com.google.common.math.C16282a.f36379a
            boolean r1 = com.google.android.play.core.appupdate.C15562d.m25178P(r2)
            if (r1 == 0) goto L_0x00de
            int[] r1 = com.google.common.math.C16282a.C16283a.f36380a
            int r4 = r0.ordinal()
            r1 = r1[r4]
            r4 = 1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r8 = 0
            r10 = 1
            switch(r1) {
                case 1: goto L_0x0096;
                case 2: goto L_0x0087;
                case 3: goto L_0x0079;
                case 4: goto L_0x009c;
                case 5: goto L_0x0066;
                case 6: goto L_0x0061;
                case 7: goto L_0x004d;
                case 8: goto L_0x003e;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x003e:
            double r4 = java.lang.Math.rint(r2)
            double r8 = r2 - r4
            double r8 = java.lang.Math.abs(r8)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x009d
            goto L_0x009c
        L_0x004d:
            double r4 = java.lang.Math.rint(r2)
            double r8 = r2 - r4
            double r8 = java.lang.Math.abs(r8)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x009d
            double r4 = java.lang.Math.copySign(r6, r2)
            double r4 = r4 + r2
            goto L_0x009d
        L_0x0061:
            double r4 = java.lang.Math.rint(r2)
            goto L_0x009d
        L_0x0066:
            boolean r1 = com.google.common.math.C16282a.m26352a(r2)
            if (r1 == 0) goto L_0x006d
            goto L_0x009c
        L_0x006d:
            long r4 = (long) r2
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0074
            r1 = r10
            goto L_0x0075
        L_0x0074:
            r1 = -1
        L_0x0075:
            long r6 = (long) r1
            long r4 = r4 + r6
            double r4 = (double) r4
            goto L_0x009d
        L_0x0079:
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x009c
            boolean r1 = com.google.common.math.C16282a.m26352a(r2)
            if (r1 == 0) goto L_0x0084
            goto L_0x009c
        L_0x0084:
            long r6 = (long) r2
            long r6 = r6 + r4
            goto L_0x0094
        L_0x0087:
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x009c
            boolean r1 = com.google.common.math.C16282a.m26352a(r2)
            if (r1 == 0) goto L_0x0092
            goto L_0x009c
        L_0x0092:
            long r6 = (long) r2
            long r6 = r6 - r4
        L_0x0094:
            double r4 = (double) r6
            goto L_0x009d
        L_0x0096:
            boolean r1 = com.google.common.math.C16282a.m26352a(r2)
            if (r1 == 0) goto L_0x00d6
        L_0x009c:
            r4 = r2
        L_0x009d:
            r6 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r6 = r6 - r4
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r1 >= 0) goto L_0x00a9
            r1 = r10
            goto L_0x00aa
        L_0x00a9:
            r1 = r6
        L_0x00aa:
            r7 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r10 = r6
        L_0x00b2:
            r1 = r1 & r10
            if (r1 == 0) goto L_0x00b7
            long r0 = (long) r4
            return r0
        L_0x00b7:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "rounded value is out of range for input "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " and rounding mode "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        L_0x00d6:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "mode was UNNECESSARY, but rounding was necessary"
            r0.<init>(r1)
            throw r0
        L_0x00de:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "input is infinite or NaN"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.BloomFilter.approximateElementCount():long");
    }

    public long bitSize() {
        return this.bits.mo57792a();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(new BloomFilterStrategies.C16249a(BloomFilterStrategies.C16249a.m26263d(this.bits.f36339a)), this.numHashFunctions, this.funnel, this.strategy);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy);
    }

    public double expectedFpp() {
        return Math.pow(((double) this.bits.f36340b.sum()) / ((double) bitSize()), (double) this.numHashFunctions);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits});
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        bloomFilter.getClass();
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(T t) {
        return this.strategy.mightContain(t, this.funnel, this.numHashFunctions, this.bits);
    }

    @CanIgnoreReturnValue
    public boolean put(T t) {
        return this.strategy.put(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        long j;
        long j2;
        boolean z;
        BloomFilter<T> bloomFilter2 = bloomFilter;
        bloomFilter.getClass();
        C15794l.m25614h(this != bloomFilter2, "Cannot combine a BloomFilter with itself.");
        int i = this.numHashFunctions;
        int i2 = bloomFilter2.numHashFunctions;
        C15794l.m25608b(i, i2, "BloomFilters must have the same number of hash functions (%s != %s)", i == i2);
        boolean z2 = bitSize() == bloomFilter.bitSize();
        long bitSize = bitSize();
        long bitSize2 = bloomFilter.bitSize();
        if (z2) {
            C15794l.m25611e(this.strategy, "BloomFilters must have equal strategies (%s != %s)", bloomFilter2.strategy, this.strategy.equals(bloomFilter2.strategy));
            C15794l.m25611e(this.funnel, "BloomFilters must have equal funnels (%s != %s)", bloomFilter2.funnel, this.funnel.equals(bloomFilter2.funnel));
            BloomFilterStrategies.C16249a aVar = this.bits;
            BloomFilterStrategies.C16249a aVar2 = bloomFilter2.bits;
            C15794l.m25608b(aVar.f36339a.length(), aVar2.f36339a.length(), "BitArrays must be of equal length (%s != %s)", aVar.f36339a.length() == aVar2.f36339a.length());
            for (int i3 = 0; i3 < aVar.f36339a.length(); i3++) {
                long j3 = aVar2.f36339a.get(i3);
                while (true) {
                    j = aVar.f36339a.get(i3);
                    j2 = j | j3;
                    if (j != j2) {
                        if (aVar.f36339a.compareAndSet(i3, j, j2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    aVar.f36340b.add((long) (Long.bitCount(j2) - Long.bitCount(j)));
                }
            }
            return;
        }
        throw new IllegalArgumentException(C15803r.m25628a("BloomFilters must have the same size underlying bit arrays (%s != %s)", Long.valueOf(bitSize), Long.valueOf(bitSize2)));
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        long ordinal = (long) this.strategy.ordinal();
        byte b = (byte) ((int) ordinal);
        boolean z = true;
        C15794l.m25610d(ordinal, "Out of range: %s", ((long) b) == ordinal);
        dataOutputStream.writeByte(b);
        long j = (long) this.numHashFunctions;
        if ((j >> 8) != 0) {
            z = false;
        }
        C15794l.m25610d(j, "out of range: %s", z);
        dataOutputStream.writeByte((byte) ((int) j));
        dataOutputStream.writeInt(this.bits.f36339a.length());
        for (int i = 0; i < this.bits.f36339a.length(); i++) {
            dataOutputStream.writeLong(this.bits.f36339a.get(i));
        }
    }

    public BloomFilter(BloomFilterStrategies.C16249a aVar, int i, Funnel<? super T> funnel2, Strategy strategy2) {
        boolean z = true;
        C15794l.m25609c(i, "numHashFunctions (%s) must be > 0", i > 0);
        C15794l.m25609c(i, "numHashFunctions (%s) must be <= 255", i > 255 ? false : z);
        aVar.getClass();
        this.bits = aVar;
        this.numHashFunctions = i;
        funnel2.getClass();
        this.funnel = funnel2;
        strategy2.getClass();
        this.strategy = strategy2;
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d) {
        return create(funnel2, j, d, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i) {
        return create(funnel2, (long) i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j) {
        return create(funnel2, j, 0.03d);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d, Strategy strategy2) {
        funnel2.getClass();
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z = true;
        C15794l.m25610d(j, "Expected insertions (%s) must be >= 0", i >= 0);
        C15794l.m25612f(Double.valueOf(d), "False positive probability (%s) must be > 0.0", d > ShadowDrawableWrapper.COS_45);
        if (d >= 1.0d) {
            z = false;
        }
        C15794l.m25612f(Double.valueOf(d), "False positive probability (%s) must be < 1.0", z);
        strategy2.getClass();
        if (i == 0) {
            j = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new BloomFilter<>(new BloomFilterStrategies.C16249a(optimalNumOfBits), optimalNumOfHashFunctions(j, optimalNumOfBits), funnel2, strategy2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + optimalNumOfBits + " bits", e);
        }
    }
}
