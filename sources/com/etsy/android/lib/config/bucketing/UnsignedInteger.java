package com.etsy.android.lib.config.bucketing;

import java.math.BigInteger;

public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public static final long INT_MASK = 4294967295L;
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);
    private final int value;

    public UnsignedInteger(int i) {
        this.value = i & -1;
    }

    public static int compare(int i, int i2) {
        return intsCompare(flip(i), flip(i2));
    }

    public static int flip(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static UnsignedInteger fromIntBits(int i) {
        return new UnsignedInteger(i);
    }

    public static int intsCompare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static long toLong(int i) {
        return ((long) i) & INT_MASK;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public double doubleValue() {
        return (double) longValue();
    }

    public boolean equals(Object obj) {
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
        return toLong(this.value);
    }

    public String toString() {
        return toString(10);
    }

    public int compareTo(UnsignedInteger unsignedInteger) {
        unsignedInteger.getClass();
        return compare(this.value, unsignedInteger.value);
    }

    public String toString(int i) {
        return Long.toString(((long) this.value) & INT_MASK, i);
    }
}
