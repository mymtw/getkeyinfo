package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p415of.C13171a;
import p753kq.C19857l;

final class CardGroupFooterViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IPageLink $pageLink;
    public final /* synthetic */ C12092h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardGroupFooterViewHolder$bind$1$1(C12092h hVar, IPageLink iPageLink) {
        super(1);
        this.this$0 = hVar;
        this.$pageLink = iPageLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13171a<IPageLink> aVar = this.this$0.f26971c;
        if (aVar != null) {
            aVar.mo31328c(this.$pageLink);
        }
    }
}
