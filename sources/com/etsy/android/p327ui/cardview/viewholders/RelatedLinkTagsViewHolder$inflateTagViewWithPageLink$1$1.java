package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p415of.C13171a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.RelatedLinkTagsViewHolder$inflateTagViewWithPageLink$1$1 */
public final class RelatedLinkTagsViewHolder$inflateTagViewWithPageLink$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ LandingPageLink $pageLink;
    public final /* synthetic */ RelatedLinkTagsViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelatedLinkTagsViewHolder$inflateTagViewWithPageLink$1$1(RelatedLinkTagsViewHolder relatedLinkTagsViewHolder, LandingPageLink landingPageLink) {
        super(1);
        this.this$0 = relatedLinkTagsViewHolder;
        this.$pageLink = landingPageLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13171a<PageLink> aVar = this.this$0.f20116d;
        if (aVar != null) {
            aVar.mo31328c(this.$pageLink);
        }
    }
}
