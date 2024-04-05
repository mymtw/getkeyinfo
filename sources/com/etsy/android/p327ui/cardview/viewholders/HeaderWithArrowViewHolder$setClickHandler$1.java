package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewParent;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.HeaderWithArrowViewHolder$setClickHandler$1 */
final class HeaderWithArrowViewHolder$setClickHandler$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IServerDrivenAction $action;
    public final /* synthetic */ C9168d0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderWithArrowViewHolder$setClickHandler$1(C9168d0 d0Var, IServerDrivenAction iServerDrivenAction) {
        super(1);
        this.this$0 = d0Var;
        this.$action = iServerDrivenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9168d0 d0Var = this.this$0;
        C9121f fVar = d0Var.f20181c;
        ViewParent parent = d0Var.itemView.getParent();
        C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.View");
        fVar.mo31344d((View) parent, this.$action);
    }
}
