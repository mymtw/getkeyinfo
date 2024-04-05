package androidx.compose.animation;

import androidx.compose.animation.core.C0430i;
import androidx.compose.animation.core.C0435k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import p753kq.C19857l;

public final class ColorVectorConverterKt {

    /* renamed from: a */
    public static final C19857l<C1505c, C0435k0<C1545s, C0430i>> f975a = ColorVectorConverterKt$ColorToVector$1.INSTANCE;

    /* renamed from: b */
    public static final float[] f976b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: c */
    public static final float[] f977c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    /* renamed from: a */
    public static final float m1030a(int i, float f, float f2, float f3, float[] fArr) {
        float f4 = f * fArr[i];
        return (f3 * fArr[i + 6]) + (f2 * fArr[i + 3]) + f4;
    }
}
