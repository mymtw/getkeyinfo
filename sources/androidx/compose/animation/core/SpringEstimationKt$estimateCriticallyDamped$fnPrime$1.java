package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ double $c1;
    public final /* synthetic */ double $c2;

    /* renamed from: $r */
    public final /* synthetic */ double f1034$r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(double d, double d2, double d3) {
        super(1);
        this.$c2 = d;
        this.f1034$r = d2;
        this.$c1 = d3;
    }

    public final Double invoke(double d) {
        double d2 = this.$c2;
        double d3 = this.f1034$r;
        double d4 = ((d3 * d) + ((double) 1)) * d2;
        return Double.valueOf(Math.exp(d3 * d) * ((this.$c1 * d3) + d4));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
