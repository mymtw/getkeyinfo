package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p415of.C13171a;
import p753kq.C19857l;

final class ListSectionCollageLinkFooterViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ PageLink $pageLink;
    public final /* synthetic */ C12003o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListSectionCollageLinkFooterViewHolder$bind$1$1(C12003o oVar, PageLink pageLink) {
        super(1);
        this.this$0 = oVar;
        this.$pageLink = pageLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13171a<PageLink> aVar = this.this$0.f26746c;
        if (aVar != null) {
            aVar.mo31328c(this.$pageLink);
        }
    }
}
