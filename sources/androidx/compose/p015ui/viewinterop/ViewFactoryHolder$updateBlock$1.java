package androidx.compose.p015ui.viewinterop;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1 */
public final class ViewFactoryHolder$updateBlock$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$updateBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    public final void invoke() {
        T typedView$ui_release = this.this$0.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            this.this$0.getUpdateBlock().invoke(typedView$ui_release);
        }
    }
}
