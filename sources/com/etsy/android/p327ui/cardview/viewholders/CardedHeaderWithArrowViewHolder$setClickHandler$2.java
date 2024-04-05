package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.p327ui.cardview.clickhandlers.C9120e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.CardedHeaderWithArrowViewHolder$setClickHandler$2 */
final class CardedHeaderWithArrowViewHolder$setClickHandler$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IPageLink $pageLink;
    public final /* synthetic */ C9171e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardedHeaderWithArrowViewHolder$setClickHandler$2(C9171e eVar, IPageLink iPageLink) {
        super(1);
        this.this$0 = eVar;
        this.$pageLink = iPageLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9120e eVar = this.this$0.f20189c;
        IPageLink iPageLink = this.$pageLink;
        eVar.getClass();
        C19383o.m32797g(iPageLink, "pageLink");
        eVar.f20045d.mo31328c(iPageLink);
    }
}
