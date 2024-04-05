package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 */
public final class C1795xe2c59457 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Ref$ObjectRef<C19846a<C19394m>> $disposer;
    public final /* synthetic */ AbstractComposeView $view;

    public C1795xe2c59457(AbstractComposeView abstractComposeView, Ref$ObjectRef<C19846a<C19394m>> ref$ObjectRef) {
        this.$view = abstractComposeView;
        this.$disposer = ref$ObjectRef;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
        C2887s f0 = C15588c1.m25325f0(this.$view);
        AbstractComposeView abstractComposeView = this.$view;
        if (f0 != null) {
            Ref$ObjectRef<C19846a<C19394m>> ref$ObjectRef = this.$disposer;
            Lifecycle lifecycle = f0.getLifecycle();
            C19383o.m32796f(lifecycle, "lco.lifecycle");
            ref$ObjectRef.element = C1840i1.m4041a(abstractComposeView, lifecycle);
            this.$view.removeOnAttachStateChangeListener(this);
            return;
        }
        throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
    }
}
