package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.HeaderWithArrowViewHolder$setClickHandler$5 */
final class HeaderWithArrowViewHolder$setClickHandler$5 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IPageLink $pageLink;
    public final /* synthetic */ C9168d0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderWithArrowViewHolder$setClickHandler$5(C9168d0 d0Var, IPageLink iPageLink) {
        super(1);
        this.this$0 = d0Var;
        this.$pageLink = iPageLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9121f fVar = this.this$0.f20181c;
        IPageLink iPageLink = this.$pageLink;
        fVar.getClass();
        C19383o.m32797g(iPageLink, "pageLink");
        fVar.f20045d.mo31328c(iPageLink);
    }
}
