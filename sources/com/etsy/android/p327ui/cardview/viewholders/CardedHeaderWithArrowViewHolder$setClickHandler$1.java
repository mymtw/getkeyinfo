package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewParent;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9120e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.CardedHeaderWithArrowViewHolder$setClickHandler$1 */
final class CardedHeaderWithArrowViewHolder$setClickHandler$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IServerDrivenAction $action;
    public final /* synthetic */ C9171e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardedHeaderWithArrowViewHolder$setClickHandler$1(C9171e eVar, IServerDrivenAction iServerDrivenAction) {
        super(1);
        this.this$0 = eVar;
        this.$action = iServerDrivenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9171e eVar = this.this$0;
        C9120e eVar2 = eVar.f20189c;
        ViewParent parent = eVar.itemView.getParent();
        C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.View");
        eVar2.mo31344d((View) parent, this.$action);
    }
}
