package com.google.common.math;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p514bk.C14088a;

public final class Stats implements Serializable {
    public static final int BYTES = 40;
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    public Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static Stats fromByteArray(byte[] bArr) {
        bArr.getClass();
        C15794l.m25608b(40, bArr.length, "Expected Stats.BYTES = %s remaining , got %s", bArr.length == 40);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    /* renamed from: of */
    public static Stats m26347of(Iterable<? extends Number> iterable) {
        double d;
        double d2;
        long j = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        long j2 = 0;
        double d5 = Double.NaN;
        double d6 = Double.NaN;
        for (Number doubleValue : iterable) {
            double doubleValue2 = doubleValue.doubleValue();
            if (j2 != j) {
                j2++;
                if (!Doubles.m26354a(doubleValue2) || !Doubles.m26354a(d3)) {
                    d2 = C14088a.m21781f(d3, doubleValue2);
                    d = Double.NaN;
                } else {
                    double d7 = doubleValue2 - d3;
                    d2 = (d7 / ((double) j2)) + d3;
                    d = ((doubleValue2 - d2) * d7) + d4;
                }
                double min2 = Math.min(d6, doubleValue2);
                d5 = Math.max(d5, doubleValue2);
                d6 = min2;
                d4 = d;
                d3 = d2;
            } else if (!Doubles.m26354a(doubleValue2)) {
                d5 = doubleValue2;
                d3 = d5;
                d6 = d3;
                j2 = 1;
                d4 = Double.NaN;
            } else {
                d5 = doubleValue2;
                d3 = d5;
                d6 = d3;
                j2 = 1;
            }
            j = 0;
        }
        return new Stats(j2, d3, d4, d6, d5);
    }

    public static Stats readFrom(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C15794l.m25608b(40, byteBuffer.remaining(), "Expected at least Stats.BYTES = %s remaining , got %s", byteBuffer.remaining() >= 40);
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long count() {
        return this.count;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max)});
    }

    public double max() {
        C15794l.m25623q(this.count != 0);
        return this.max;
    }

    public double mean() {
        C15794l.m25623q(this.count != 0);
        return this.mean;
    }

    public double min() {
        C15794l.m25623q(this.count != 0);
        return this.min;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        C15794l.m25623q(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        int i = (this.count > 1 ? 1 : (this.count == 1 ? 0 : -1));
        double d = ShadowDrawableWrapper.COS_45;
        if (i == 0) {
            return ShadowDrawableWrapper.COS_45;
        }
        double d2 = this.sumOfSquaresOfDeltas;
        C15794l.m25613g(!Double.isNaN(d2));
        if (d2 > ShadowDrawableWrapper.COS_45) {
            d = d2;
        }
        return d / ((double) count());
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        C15794l.m25623q(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        double d = this.sumOfSquaresOfDeltas;
        C15794l.m25613g(!Double.isNaN(d));
        if (d <= ShadowDrawableWrapper.COS_45) {
            d = 0.0d;
        }
        return d / ((double) (this.count - 1));
    }

    public double sum() {
        return this.mean * ((double) this.count);
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    public String toString() {
        if (count() > 0) {
            C15788i.C15789a b = C15788i.m25603b(this);
            b.mo55781a(this.count, ResponseConstants.COUNT);
            b.mo55782b(String.valueOf(this.mean), "mean");
            b.mo55782b(String.valueOf(populationStandardDeviation()), "populationStandardDeviation");
            b.mo55782b(String.valueOf(this.min), ResponseConstants.MIN);
            b.mo55782b(String.valueOf(this.max), ResponseConstants.MAX);
            return b.toString();
        }
        C15788i.C15789a b2 = C15788i.m25603b(this);
        b2.mo55781a(this.count, ResponseConstants.COUNT);
        return b2.toString();
    }

    public void writeTo(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C15794l.m25608b(40, byteBuffer.remaining(), "Expected at least Stats.BYTES = %s remaining , got %s", byteBuffer.remaining() >= 40);
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static double meanOf(Iterator<? extends Number> it) {
        C15794l.m25613g(it.hasNext());
        double doubleValue = ((Number) it.next()).doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = ((Number) it.next()).doubleValue();
            j++;
            if (!Doubles.m26354a(doubleValue2) || !Doubles.m26354a(doubleValue)) {
                doubleValue = C14088a.m21781f(doubleValue, doubleValue2);
            } else {
                doubleValue = ((doubleValue2 - doubleValue) / ((double) j)) + doubleValue;
            }
        }
        return doubleValue;
    }

    public static double meanOf(double... dArr) {
        C15794l.m25613g(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (!Doubles.m26354a(d2) || !Doubles.m26354a(d)) {
                d = C14088a.m21781f(d, d2);
            } else {
                d = ((d2 - d) / ((double) (i + 1))) + d;
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m26348of(Iterator<? extends Number> it) {
        double d;
        double d2;
        long j = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        long j2 = 0;
        double d5 = Double.NaN;
        double d6 = Double.NaN;
        while (it.hasNext()) {
            double doubleValue = ((Number) it.next()).doubleValue();
            if (j2 != j) {
                j2++;
                if (!Doubles.m26354a(doubleValue) || !Doubles.m26354a(d3)) {
                    d2 = C14088a.m21781f(d3, doubleValue);
                    d = Double.NaN;
                } else {
                    double d7 = doubleValue - d3;
                    d2 = (d7 / ((double) j2)) + d3;
                    d = ((doubleValue - d2) * d7) + d4;
                }
                double min2 = Math.min(d6, doubleValue);
                d5 = Math.max(d5, doubleValue);
                d6 = min2;
                d4 = d;
                d3 = d2;
            } else if (!Doubles.m26354a(doubleValue)) {
                d5 = doubleValue;
                d3 = d5;
                d6 = d3;
                j2 = 1;
                d4 = Double.NaN;
            } else {
                d5 = doubleValue;
                d3 = d5;
                d6 = d3;
                j2 = 1;
            }
            j = 0;
        }
        return new Stats(j2, d3, d4, d6, d5);
    }

    public static double meanOf(int... iArr) {
        C15794l.m25613g(iArr.length > 0);
        double d = (double) iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = (double) iArr[i];
            if (!Doubles.m26354a(d2) || !Doubles.m26354a(d)) {
                d = C14088a.m21781f(d, d2);
            } else {
                d = ((d2 - d) / ((double) (i + 1))) + d;
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m26349of(double... dArr) {
        double d;
        double d2;
        double[] dArr2 = dArr;
        int length = dArr2.length;
        int i = 0;
        long j = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        long j2 = 0;
        double d5 = Double.NaN;
        double d6 = Double.NaN;
        while (i < length) {
            double d7 = d6;
            d6 = dArr2[i];
            if (j2 != j) {
                j2++;
                if (!Doubles.m26354a(d6) || !Doubles.m26354a(d3)) {
                    d2 = C14088a.m21781f(d3, d6);
                    d = Double.NaN;
                } else {
                    double d8 = d6 - d3;
                    d2 = (d8 / ((double) j2)) + d3;
                    d = ((d6 - d2) * d8) + d4;
                }
                d5 = Math.min(d5, d6);
                d6 = Math.max(d7, d6);
                d4 = d;
                d3 = d2;
            } else if (!Doubles.m26354a(d6)) {
                d5 = d6;
                d3 = d5;
                j2 = 1;
                d4 = Double.NaN;
            } else {
                d5 = d6;
                d3 = d5;
                j2 = 1;
            }
            i++;
            j = 0;
        }
        return new Stats(j2, d3, d4, d5, d6);
    }

    public static double meanOf(long... jArr) {
        C15794l.m25613g(jArr.length > 0);
        double d = (double) jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = (double) jArr[i];
            if (!Doubles.m26354a(d2) || !Doubles.m26354a(d)) {
                d = C14088a.m21781f(d, d2);
            } else {
                d = ((d2 - d) / ((double) (i + 1))) + d;
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m26350of(int... iArr) {
        double d;
        double d2;
        int[] iArr2 = iArr;
        int length = iArr2.length;
        int i = 0;
        long j = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        long j2 = 0;
        double d5 = Double.NaN;
        double d6 = Double.NaN;
        while (i < length) {
            int i2 = length;
            int i3 = i;
            double d7 = (double) iArr2[i];
            if (j2 != j) {
                j2++;
                if (!Doubles.m26354a(d7) || !Doubles.m26354a(d3)) {
                    d2 = C14088a.m21781f(d3, d7);
                    d = Double.NaN;
                } else {
                    double d8 = d7 - d3;
                    d2 = (d8 / ((double) j2)) + d3;
                    d = ((d7 - d2) * d8) + d4;
                }
                d5 = Math.min(d5, d7);
                d6 = Math.max(d6, d7);
                d4 = d;
                d3 = d2;
            } else if (!Doubles.m26354a(d7)) {
                d5 = d7;
                d6 = d5;
                d3 = d6;
                j2 = 1;
                d4 = Double.NaN;
            } else {
                d5 = d7;
                d6 = d5;
                d3 = d6;
                j2 = 1;
            }
            i = i3 + 1;
            length = i2;
            j = 0;
        }
        return new Stats(j2, d3, d4, d5, d6);
    }

    /* renamed from: of */
    public static Stats m26351of(long... jArr) {
        int i;
        int i2;
        double d;
        double d2;
        long[] jArr2 = jArr;
        int length = jArr2.length;
        int i3 = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = Double.NaN;
        double d6 = Double.NaN;
        long j = 0;
        while (i3 < length) {
            double d7 = (double) jArr2[i3];
            if (j == 0) {
                i2 = length;
                i = i3;
                if (!Doubles.m26354a(d7)) {
                    d5 = d7;
                    d6 = d5;
                    d3 = d6;
                    j = 1;
                    d4 = Double.NaN;
                } else {
                    d5 = d7;
                    d6 = d5;
                    d3 = d6;
                    j = 1;
                }
            } else {
                j++;
                if (!Doubles.m26354a(d7) || !Doubles.m26354a(d3)) {
                    i2 = length;
                    i = i3;
                    d2 = C14088a.m21781f(d3, d7);
                    d = Double.NaN;
                } else {
                    double d8 = d7 - d3;
                    i2 = length;
                    i = i3;
                    d2 = (d8 / ((double) j)) + d3;
                    d = ((d7 - d2) * d8) + d4;
                }
                d5 = Math.min(d5, d7);
                d6 = Math.max(d6, d7);
                d4 = d;
                d3 = d2;
            }
            i3 = i + 1;
            length = i2;
        }
        return new Stats(j, d3, d4, d5, d6);
    }
}
