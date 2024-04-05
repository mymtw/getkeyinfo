package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1790xb3f1a111 $listener;
    public final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, C1790xb3f1a111 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
