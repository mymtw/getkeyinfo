package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19861p;

final class Arrangement$spacedBy$1 extends Lambda implements C19861p<Integer, LayoutDirection, Integer> {
    public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1();

    public Arrangement$spacedBy$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i, LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        int i2 = C1428a.f3104a;
        float f = ((float) (i + 0)) / 2.0f;
        float f2 = -1.0f;
        if (layoutDirection != LayoutDirection.Ltr) {
            f2 = -1.0f * ((float) -1);
        }
        return Integer.valueOf(C7279a.m13954l((((float) 1) + f2) * f));
    }
}
