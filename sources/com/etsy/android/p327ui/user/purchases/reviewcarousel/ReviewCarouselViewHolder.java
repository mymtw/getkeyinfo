package com.etsy.android.p327ui.user.purchases.reviewcarousel;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewCarouselCard;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.user.purchases.C11639e;
import com.etsy.android.vespa.viewholders.C12086e;
import com.github.rubensousa.gravitysnaphelper.C12600a;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p431qf.C13327b;

/* renamed from: com.etsy.android.ui.user.purchases.reviewcarousel.ReviewCarouselViewHolder */
public final class ReviewCarouselViewHolder extends C12086e<C11639e.C11643d> {

    /* renamed from: c */
    public final C9135p f25852c;

    /* renamed from: d */
    public final C19285c f25853d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCarouselViewHolder(ViewGroup viewGroup, C9135p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_holder, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "clickHandler");
        this.f25852c = pVar;
        C19285c b = C19350d.m32677b(new ReviewCarouselViewHolder$recyclerView$2(this));
        this.f25853d = b;
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.clg_space_12);
        Object value = b.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        ((RecyclerView) value).addItemDecoration(new C13327b(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 8, 0));
    }

    /* renamed from: g */
    public final void mo19450a(C11639e.C11643d dVar) {
        C19383o.m32797g(dVar, ReviewCarouselCard.REVIEW_CAROUSEL);
        Object value = this.f25853d.getValue();
        C19383o.m32796f(value, "<get-recyclerView>(...)");
        ((RecyclerView) value).setAdapter(new C11674b(dVar.f25767a, this.f25852c));
        C12600a aVar = new C12600a(8388611);
        Object value2 = this.f25853d.getValue();
        C19383o.m32796f(value2, "<get-recyclerView>(...)");
        aVar.mo11867a((RecyclerView) value2);
    }
}
