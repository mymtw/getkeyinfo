package androidx.compose.p015ui.viewinterop;

import android.view.View;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.platform.AndroidComposeView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4 */
public final class AndroidViewHolder$layoutNode$1$4 extends Lambda implements C19857l<C1750p, C19394m> {
    public final /* synthetic */ AndroidViewHolder $this_run;
    public final /* synthetic */ Ref$ObjectRef<View> $viewRemovedOnDetach;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder, Ref$ObjectRef<View> ref$ObjectRef) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$viewRemovedOnDetach = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1750p) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1750p pVar) {
        C19383o.m32797g(pVar, ResponseConstants.OWNER);
        AndroidComposeView androidComposeView = pVar instanceof AndroidComposeView ? (AndroidComposeView) pVar : null;
        if (androidComposeView != null) {
            androidComposeView.removeAndroidView(this.$this_run);
        }
        this.$viewRemovedOnDetach.element = this.$this_run.getView();
        this.$this_run.setView$ui_release((View) null);
    }
}
