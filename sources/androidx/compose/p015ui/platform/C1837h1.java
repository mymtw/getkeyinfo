package androidx.compose.p015ui.platform;

import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.h1 */
public final /* synthetic */ class C1837h1 implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ AbstractComposeView f4095b;

    public /* synthetic */ C1837h1(AbstractComposeView abstractComposeView) {
        this.f4095b = abstractComposeView;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        AbstractComposeView abstractComposeView = this.f4095b;
        C19383o.m32797g(abstractComposeView, "$view");
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
