package androidx.compose.p015ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1 */
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(outline, "outline");
        Outline b = ((ViewLayer) view).outlineResolver.mo7279b();
        C19383o.m32794d(b);
        outline.set(b);
    }
}
