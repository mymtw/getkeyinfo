package com.google.common.primitives;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class UnsignedLong extends Number implements Comparable<UnsignedLong> {
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    private final long value;

    public UnsignedLong(long j) {
        this.value = j;
    }

    public static UnsignedLong fromLongBits(long j) {
        return new UnsignedLong(j);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(long j) {
        C15794l.m25610d(j, "value (%s) is outside the range for an unsigned long value", j >= 0);
        return fromLongBits(j);
    }

    public BigInteger bigIntegerValue() {
        BigInteger valueOf = BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? valueOf.setBit(63) : valueOf;
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        long j = this.value;
        unsignedLong.getClass();
        return fromLongBits(UnsignedLongs.m26391b(j, unsignedLong.value));
    }

    public double doubleValue() {
        long j = this.value;
        double d = (double) (Long.MAX_VALUE & j);
        return j < 0 ? d + 9.223372036854776E18d : d;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedLong) && this.value == ((UnsignedLong) obj).value;
    }

    public float floatValue() {
        long j = this.value;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public int hashCode() {
        return Longs.m26387b(this.value);
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        long j = this.value;
        unsignedLong.getClass();
        return fromLongBits(j - unsignedLong.value);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        long j = this.value;
        unsignedLong.getClass();
        return fromLongBits(UnsignedLongs.m26392c(j, unsignedLong.value));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        long j = this.value;
        unsignedLong.getClass();
        return fromLongBits(j + unsignedLong.value);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        long j = this.value;
        unsignedLong.getClass();
        return fromLongBits(j * unsignedLong.value);
    }

    public String toString() {
        return UnsignedLongs.m26393d(10, this.value);
    }

    public int compareTo(UnsignedLong unsignedLong) {
        unsignedLong.getClass();
        return UnsignedLongs.m26390a(this.value, unsignedLong.value);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    public String toString(int i) {
        return UnsignedLongs.m26393d(i, this.value);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r9 = (r6 > com.google.common.primitives.UnsignedLongs.C16298a.f36400a[r13] ? 1 : (r6 == com.google.common.primitives.UnsignedLongs.C16298a.f36400a[r13] ? 0 : -1));
     */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String r12, int r13) {
        /*
            r12.getClass()
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0075
            r0 = 2
            if (r13 < r0) goto L_0x0069
            r0 = 36
            if (r13 > r0) goto L_0x0069
            int[] r0 = com.google.common.primitives.UnsignedLongs.C16298a.f36402c
            r0 = r0[r13]
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r3
        L_0x001b:
            int r8 = r12.length()
            if (r5 >= r8) goto L_0x0064
            char r8 = r12.charAt(r5)
            int r8 = java.lang.Character.digit(r8, r13)
            r9 = -1
            if (r8 == r9) goto L_0x005e
            if (r5 <= r0) goto L_0x0057
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 < 0) goto L_0x0047
            long[] r9 = com.google.common.primitives.UnsignedLongs.C16298a.f36400a
            r10 = r9[r13]
            int r9 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            if (r9 <= 0) goto L_0x003e
            goto L_0x0047
        L_0x003e:
            int[] r9 = com.google.common.primitives.UnsignedLongs.C16298a.f36401b
            r9 = r9[r13]
            if (r8 <= r9) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r9 = r2
            goto L_0x0048
        L_0x0047:
            r9 = r1
        L_0x0048:
            if (r9 != 0) goto L_0x004b
            goto L_0x0057
        L_0x004b:
            java.lang.NumberFormatException r13 = new java.lang.NumberFormatException
            java.lang.String r0 = "Too large for unsigned long: "
            java.lang.String r12 = androidx.appcompat.widget.C0326j.m864i(r0, r12)
            r13.<init>(r12)
            throw r13
        L_0x0057:
            long r9 = (long) r13
            long r6 = r6 * r9
            long r8 = (long) r8
            long r6 = r6 + r8
            int r5 = r5 + 1
            goto L_0x001b
        L_0x005e:
            java.lang.NumberFormatException r13 = new java.lang.NumberFormatException
            r13.<init>(r12)
            throw r13
        L_0x0064:
            com.google.common.primitives.UnsignedLong r12 = fromLongBits(r6)
            return r12
        L_0x0069:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException
            java.lang.String r0 = "illegal radix: "
            java.lang.String r13 = p003a2.C0015b.m88g(r0, r13)
            r12.<init>(r13)
            throw r12
        L_0x0075:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException
            java.lang.String r13 = "empty string"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.UnsignedLong.valueOf(java.lang.String, int):com.google.common.primitives.UnsignedLong");
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(BigInteger bigInteger) {
        bigInteger.getClass();
        C15794l.m25612f(bigInteger, "value (%s) is outside the range for an unsigned long value", bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64);
        return fromLongBits(bigInteger.longValue());
    }
}
