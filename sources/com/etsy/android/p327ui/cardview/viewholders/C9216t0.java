package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewCarouselCard;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11675c;
import com.etsy.android.p327ui.user.purchases.reviewcarousel.C11676d;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.t0 */
public final class C9216t0 extends C12086e<ReviewCarouselCard> {

    /* renamed from: c */
    public final ReviewCardViewHolder f20349c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9216t0(ViewGroup viewGroup, C9135p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_carousel, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "clickHandler");
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        this.f20349c = new ReviewCardViewHolder(view, viewGroup, pVar);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ReviewCarouselCard reviewCarouselCard = (ReviewCarouselCard) obj;
        if (reviewCarouselCard != null) {
            this.f20349c.mo31389e(new C11675c(reviewCarouselCard.getTransactionId(), reviewCarouselCard.getTransactionIds(), new C11676d(reviewCarouselCard.getListingImage().getUrl(), reviewCarouselCard.getListingImage().getUrl75x75(), reviewCarouselCard.getListingImage().getUrl300x300(), (String) null), reviewCarouselCard.getTitle(), reviewCarouselCard.getListingTitle()));
        }
    }
}
