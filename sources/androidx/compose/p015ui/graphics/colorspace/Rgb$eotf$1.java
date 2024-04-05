package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 */
public final class Rgb$eotf$1 extends Lambda implements C19857l<Double, Double> {
    public final /* synthetic */ Rgb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d) {
        Rgb rgb = this.this$0;
        return rgb.f3255m.invoke(Double.valueOf(C19388s.m32829K(d, (double) rgb.f3247e, (double) rgb.f3248f)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
