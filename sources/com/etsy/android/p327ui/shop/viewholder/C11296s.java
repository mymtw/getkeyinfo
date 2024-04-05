package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.vespa.viewholders.C12086e;
import p452te.C13394c;

/* renamed from: com.etsy.android.ui.shop.viewholder.s */
public final class C11296s extends C12086e<C13394c> {

    /* renamed from: c */
    public final CollageRatingView f24940c;

    public C11296s(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_review_rating, viewGroup, false));
        CollageRatingView collageRatingView = (CollageRatingView) this.itemView.findViewById(R.id.rating);
        C11188p0.m19137a(collageRatingView);
        this.f24940c = collageRatingView;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f24940c.setRating((float) ((C13394c) obj).f29331a.getRating());
    }
}
