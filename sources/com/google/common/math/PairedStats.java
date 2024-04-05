package com.google.common.math;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.appupdate.C15562d;
import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.math.C16286c;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class PairedStats implements Serializable {
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        bArr.getClass();
        C15794l.m25608b(88, bArr.length, "Expected PairedStats.BYTES = %s, got %s", bArr.length == 88);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(order), Stats.readFrom(order), order.getDouble());
    }

    public long count() {
        return this.xStats.count();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas)});
    }

    public C16286c leastSquaresFit() {
        boolean z = false;
        C15794l.m25623q(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return C16286c.C16287a.f36382a;
        }
        double sumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (sumOfSquaresOfDeltas <= ShadowDrawableWrapper.COS_45) {
            if (this.yStats.sumOfSquaresOfDeltas() > ShadowDrawableWrapper.COS_45) {
                z = true;
            }
            C15794l.m25623q(z);
            double mean = this.xStats.mean();
            C15794l.m25613g(C15562d.m25178P(mean));
            return new C16286c.C16289c(mean);
        } else if (this.yStats.sumOfSquaresOfDeltas() > ShadowDrawableWrapper.COS_45) {
            double mean2 = this.xStats.mean();
            double mean3 = this.yStats.mean();
            if (C15562d.m25178P(mean2) && C15562d.m25178P(mean3)) {
                z = true;
            }
            C15794l.m25613g(z);
            double d = this.sumOfProductsOfDeltas / sumOfSquaresOfDeltas;
            C15794l.m25613g(true ^ Double.isNaN(d));
            return C15562d.m25178P(d) ? new C16286c.C16288b(d, mean3 - (mean2 * d)) : new C16286c.C16289c(mean2);
        } else {
            double mean4 = this.yStats.mean();
            C15794l.m25613g(C15562d.m25178P(mean4));
            return new C16286c.C16288b(ShadowDrawableWrapper.COS_45, mean4);
        }
    }

    public double pearsonsCorrelationCoefficient() {
        boolean z = true;
        C15794l.m25623q(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double sumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double sumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        C15794l.m25623q(sumOfSquaresOfDeltas > ShadowDrawableWrapper.COS_45);
        if (sumOfSquaresOfDeltas2 <= ShadowDrawableWrapper.COS_45) {
            z = false;
        }
        C15794l.m25623q(z);
        double d = sumOfSquaresOfDeltas * sumOfSquaresOfDeltas2;
        if (d <= ShadowDrawableWrapper.COS_45) {
            d = Double.MIN_VALUE;
        }
        double sqrt = this.sumOfProductsOfDeltas / Math.sqrt(d);
        double d2 = 1.0d;
        if (sqrt < 1.0d) {
            d2 = -1.0d;
            if (sqrt > -1.0d) {
                return sqrt;
            }
        }
        return d2;
    }

    public double populationCovariance() {
        C15794l.m25623q(count() != 0);
        return this.sumOfProductsOfDeltas / ((double) count());
    }

    public double sampleCovariance() {
        C15794l.m25623q(count() > 1);
        return this.sumOfProductsOfDeltas / ((double) (count() - 1));
    }

    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(order);
        this.yStats.writeTo(order);
        order.putDouble(this.sumOfProductsOfDeltas);
        return order.array();
    }

    public String toString() {
        if (count() > 0) {
            C15788i.C15789a b = C15788i.m25603b(this);
            b.mo55782b(this.xStats, "xStats");
            b.mo55782b(this.yStats, "yStats");
            b.mo55782b(String.valueOf(populationCovariance()), "populationCovariance");
            return b.toString();
        }
        C15788i.C15789a b2 = C15788i.m25603b(this);
        b2.mo55782b(this.xStats, "xStats");
        b2.mo55782b(this.yStats, "yStats");
        return b2.toString();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }
}
