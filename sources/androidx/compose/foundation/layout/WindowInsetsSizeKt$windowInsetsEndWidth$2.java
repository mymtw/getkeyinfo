package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p753kq.C19862q;

final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends Lambda implements C19862q<C0736g0, LayoutDirection, C7282b, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsEndWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsEndWidth$2();

    public WindowInsetsSizeKt$windowInsetsEndWidth$2() {
        super(3);
    }

    public final Integer invoke(C0736g0 g0Var, LayoutDirection layoutDirection, C7282b bVar) {
        int i;
        C19383o.m32797g(g0Var, "$this$$receiver");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        if (layoutDirection == LayoutDirection.Rtl) {
            i = g0Var.mo4084c(bVar, layoutDirection);
        } else {
            i = g0Var.mo4085d(bVar, layoutDirection);
        }
        return Integer.valueOf(i);
    }
}
