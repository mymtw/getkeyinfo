package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 */
public final class C1793x565475b extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1795xe2c59457 $listener;
    public final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1793x565475b(AbstractComposeView abstractComposeView, C1795xe2c59457 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
