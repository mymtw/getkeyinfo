package androidx.compose.p015ui.platform;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p111g1.C6829a;
import p514bk.C14088a;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 */
final class C1791x11b1833b extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1792x994eb477 $listener;
    public final /* synthetic */ C6829a $poolingContainerListener;
    public final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1791x11b1833b(AbstractComposeView abstractComposeView, C1792x994eb477 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, C6829a aVar) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
        this.$poolingContainerListener = aVar;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        AbstractComposeView abstractComposeView = this.$view;
        C6829a aVar = this.$poolingContainerListener;
        C19383o.m32797g(abstractComposeView, "<this>");
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C14088a.m21784l(abstractComposeView).f15034a.remove(aVar);
    }
}
