package androidx.compose.p015ui.graphics.colorspace;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1 */
public final class Rgb$Companion$DoubleIdentity$1 extends Lambda implements C19857l<Double, Double> {
    public static final Rgb$Companion$DoubleIdentity$1 INSTANCE = new Rgb$Companion$DoubleIdentity$1();

    public Rgb$Companion$DoubleIdentity$1() {
        super(1);
    }

    public final Double invoke(double d) {
        return Double.valueOf(d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
