package androidx.compose.p015ui.platform;

import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 */
public final class C1790xb3f1a111 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AbstractComposeView $view;

    public C1790xb3f1a111(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        this.$view.disposeComposition();
    }
}
