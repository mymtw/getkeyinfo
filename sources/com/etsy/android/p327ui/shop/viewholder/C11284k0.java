package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.viewholder.k0 */
public final class C11284k0 extends C12086e<C11285a> {

    /* renamed from: c */
    public final CollageRatingView f24909c = ((CollageRatingView) this.itemView.findViewById(R.id.rating));

    /* renamed from: d */
    public final TextView f24910d = ((TextView) this.itemView.findViewById(R.id.shop_avg_item_reviews));

    /* renamed from: e */
    public final TextView f24911e = ((TextView) this.itemView.findViewById(R.id.no_reviews_message));

    /* renamed from: com.etsy.android.ui.shop.viewholder.k0$a */
    public static class C11285a {

        /* renamed from: a */
        public final float f24912a;

        /* renamed from: b */
        public final int f24913b;

        public C11285a(float f, int i) {
            this.f24912a = f;
            this.f24913b = i;
        }
    }

    public C11284k0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_review_description, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C11285a aVar = (C11285a) obj;
        float f = aVar.f24912a;
        if (f <= 0.0f) {
            this.f24909c.setVisibility(8);
            this.f24910d.setVisibility(8);
            this.f24911e.setVisibility(0);
            return;
        }
        this.f24909c.setVisibility(0);
        this.f24910d.setVisibility(0);
        this.f24911e.setVisibility(8);
        if (f != this.f24909c.getRating()) {
            this.f24909c.setRating(f);
        }
        this.f24909c.setText(this.itemView.getResources().getString(R.string.parentheses, new Object[]{Integer.toString(aVar.f24913b)}));
    }
}
