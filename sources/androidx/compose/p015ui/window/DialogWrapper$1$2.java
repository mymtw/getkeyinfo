package androidx.compose.p015ui.window;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.window.DialogWrapper$1$2 */
public final class DialogWrapper$1$2 extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(outline, "result");
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
