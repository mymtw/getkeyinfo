package com.google.common.primitives;

import com.google.common.base.C15794l;
import java.math.BigInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger ZERO = fromIntBits(0);
    private final int value;

    public UnsignedInteger(int i) {
        this.value = i & -1;
    }

    public static UnsignedInteger fromIntBits(int i) {
        return new UnsignedInteger(i);
    }

    public static UnsignedInteger valueOf(long j) {
        C15794l.m25610d(j, "value (%s) is outside the range for an unsigned integer value", (com.etsy.android.lib.config.bucketing.UnsignedInteger.INT_MASK & j) == j);
        return fromIntBits((int) j);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        int i = this.value;
        unsignedInteger.getClass();
        return fromIntBits((int) (UnsignedInts.m26389a(i) / UnsignedInts.m26389a(unsignedInteger.value)));
    }

    public double doubleValue() {
        return (double) longValue();
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof UnsignedInteger) && this.value == ((UnsignedInteger) obj).value;
    }

    public float floatValue() {
        return (float) longValue();
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return UnsignedInts.m26389a(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        int i = this.value;
        unsignedInteger.getClass();
        return fromIntBits(i - unsignedInteger.value);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        int i = this.value;
        unsignedInteger.getClass();
        return fromIntBits((int) (UnsignedInts.m26389a(i) % UnsignedInts.m26389a(unsignedInteger.value)));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        int i = this.value;
        unsignedInteger.getClass();
        return fromIntBits(i + unsignedInteger.value);
    }

    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
        int i = this.value;
        unsignedInteger.getClass();
        return fromIntBits(i * unsignedInteger.value);
    }

    public String toString() {
        return toString(10);
    }

    public int compareTo(UnsignedInteger unsignedInteger) {
        unsignedInteger.getClass();
        int i = this.value ^ Integer.MIN_VALUE;
        int i2 = unsignedInteger.value ^ Integer.MIN_VALUE;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public String toString(int i) {
        return Long.toString(((long) this.value) & com.etsy.android.lib.config.bucketing.UnsignedInteger.INT_MASK, i);
    }

    public static UnsignedInteger valueOf(String str) {
        return valueOf(str, 10);
    }

    public static UnsignedInteger valueOf(String str, int i) {
        str.getClass();
        long parseLong = Long.parseLong(str, i);
        if ((com.etsy.android.lib.config.bucketing.UnsignedInteger.INT_MASK & parseLong) == parseLong) {
            return fromIntBits((int) parseLong);
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
        bigInteger.getClass();
        C15794l.m25612f(bigInteger, "value (%s) is outside the range for an unsigned integer value", bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32);
        return fromIntBits(bigInteger.intValue());
    }
}
