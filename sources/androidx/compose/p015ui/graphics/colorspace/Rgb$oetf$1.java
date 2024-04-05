package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 */
public final class Rgb$oetf$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ Rgb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d) {
        double doubleValue = this.this$0.f3253k.invoke(Double.valueOf(d)).doubleValue();
        Rgb rgb = this.this$0;
        return Double.valueOf(C19388s.m32829K(doubleValue, (double) rgb.f3247e, (double) rgb.f3248f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
