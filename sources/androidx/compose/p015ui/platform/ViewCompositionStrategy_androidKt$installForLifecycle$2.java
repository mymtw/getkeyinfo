package androidx.compose.p015ui.platform;

import androidx.lifecycle.C2885q;
import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2 */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ C2885q $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, C2885q qVar) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = qVar;
    }

    public final void invoke() {
        this.$lifecycle.mo10735c(this.$observer);
    }
}
