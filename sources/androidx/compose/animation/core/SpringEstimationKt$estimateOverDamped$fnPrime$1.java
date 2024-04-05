package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SpringEstimationKt$estimateOverDamped$fnPrime$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ double $c1;
    public final /* synthetic */ double $c2;
    public final /* synthetic */ double $r1;
    public final /* synthetic */ double $r2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fnPrime$1(double d, double d2, double d3, double d4) {
        super(1);
        this.$c1 = d;
        this.$r1 = d2;
        this.$c2 = d3;
        this.$r2 = d4;
    }

    public final Double invoke(double d) {
        double d2 = this.$c1;
        double d3 = this.$r1;
        double exp = Math.exp(d3 * d) * d2 * d3;
        double d4 = this.$c2;
        double d5 = this.$r2;
        return Double.valueOf((Math.exp(d5 * d) * d4 * d5) + exp);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
