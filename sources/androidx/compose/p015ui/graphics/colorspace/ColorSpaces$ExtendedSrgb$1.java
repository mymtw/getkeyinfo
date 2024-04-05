package androidx.compose.p015ui.graphics.colorspace;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces$ExtendedSrgb$1 */
public final class ColorSpaces$ExtendedSrgb$1 extends Lambda implements C19857l<Double, Double> {
    public static final ColorSpaces$ExtendedSrgb$1 INSTANCE = new ColorSpaces$ExtendedSrgb$1();

    public ColorSpaces$ExtendedSrgb$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final Double invoke(double d) {
        double d2 = d < ShadowDrawableWrapper.COS_45 ? -d : d;
        return Double.valueOf(Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d));
    }
}
