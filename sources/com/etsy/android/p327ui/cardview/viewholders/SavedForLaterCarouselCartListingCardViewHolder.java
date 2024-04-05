package com.etsy.android.p327ui.cardview.viewholders;

import android.content.res.Resources;
import android.support.p013v4.media.session.C0087d;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedForLaterCarouselCartListingCardViewHolder */
public final class SavedForLaterCarouselCartListingCardViewHolder extends C12086e<SavedCart> {

    /* renamed from: c */
    public final ViewGroup f20135c;

    /* renamed from: d */
    public final SavedCartListingView f20136d;

    /* renamed from: e */
    public final int f20137e = C0087d.m233b(this.itemView, R.dimen.clg_space_16);

    /* renamed from: f */
    public final int f20138f = C0087d.m233b(this.itemView, R.dimen.clg_space_16);

    public SavedForLaterCarouselCartListingCardViewHolder(ViewGroup viewGroup, SavedCartClickHandler savedCartClickHandler) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_saved_for_later_carousel_cart_listing_card, viewGroup, false));
        this.f20135c = viewGroup;
        SavedCartListingView savedCartListingView = (SavedCartListingView) this.itemView.findViewById(R.id.saved_for_later_view);
        savedCartListingView.setAdapterPositionCallback(new C9155xb78e6bf3(this));
        savedCartListingView.setClickListener(savedCartClickHandler);
        this.f20136d = savedCartListingView;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        RecyclerView.Adapter adapter;
        SavedCart savedCart = (SavedCart) obj;
        ViewGroup viewGroup = this.f20135c;
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        if (((recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 1 : adapter.getItemCount()) > 1) {
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            int i = this.f20138f;
            int i2 = this.f20137e;
            Resources resources = view.getContext().getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            view.getLayoutParams().width = ((((resources.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels) - i2) - i) / 1) - i;
        }
        this.f20136d.bind(savedCart);
    }
}
