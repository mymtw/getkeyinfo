package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SpringEstimationKt$estimateCriticallyDamped$fn$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ double $c1;
    public final /* synthetic */ double $c2;

    /* renamed from: $r */
    public final /* synthetic */ double f1033$r;
    public final /* synthetic */ double $signedDelta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fn$1(double d, double d2, double d3, double d4) {
        super(1);
        this.$c1 = d;
        this.$c2 = d2;
        this.f1033$r = d3;
        this.$signedDelta = d4;
    }

    public final Double invoke(double d) {
        return Double.valueOf((Math.exp(this.f1033$r * d) * ((this.$c2 * d) + this.$c1)) + this.$signedDelta);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
