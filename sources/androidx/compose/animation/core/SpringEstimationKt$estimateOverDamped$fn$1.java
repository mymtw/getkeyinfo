package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SpringEstimationKt$estimateOverDamped$fn$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ double $c1;
    public final /* synthetic */ double $c2;
    public final /* synthetic */ double $r1;
    public final /* synthetic */ double $r2;
    public final /* synthetic */ double $signedDelta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fn$1(double d, double d2, double d3, double d4, double d5) {
        super(1);
        this.$c1 = d;
        this.$r1 = d2;
        this.$c2 = d3;
        this.$r2 = d4;
        this.$signedDelta = d5;
    }

    public final Double invoke(double d) {
        return Double.valueOf((Math.exp(this.$r2 * d) * this.$c2) + (Math.exp(this.$r1 * d) * this.$c1) + this.$signedDelta);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
