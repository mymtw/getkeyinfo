package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.play.core.assetpacks.C15588c1;
import p407nf.C13113a;
import p435rb.C13350a;

/* renamed from: com.etsy.android.uikit.viewholder.d */
public final class C11988d extends C12086e<ListingCard> {

    /* renamed from: c */
    public final C13113a f26687c;

    /* renamed from: d */
    public final ListingFullImageView f26688d;

    /* renamed from: e */
    public final TextView f26689e;

    /* renamed from: f */
    public final TextView f26690f;

    /* renamed from: g */
    public final TextView f26691g;

    /* renamed from: h */
    public final FavHeartButton f26692h;

    /* renamed from: i */
    public final TextView f26693i;

    /* renamed from: j */
    public final CollageRatingView f26694j;

    /* renamed from: k */
    public final NumericRatingView f26695k;

    /* renamed from: l */
    public final TextView f26696l;

    /* renamed from: m */
    public final LinearLayout f26697m;

    /* renamed from: n */
    public final FrameLayout f26698n;

    /* renamed from: o */
    public final boolean f26699o = false;

    /* renamed from: p */
    public final boolean f26700p = true;

    public C11988d(ViewGroup viewGroup, C9125j jVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_anchor_listing, viewGroup, false));
        this.f26687c = jVar;
        ListingFullImageView listingFullImageView = (ListingFullImageView) mo38986f(R.id.listing_image);
        this.f26688d = listingFullImageView;
        this.f26689e = (TextView) mo38986f(R.id.listing_title);
        this.f26690f = (TextView) mo38986f(R.id.listing_price);
        this.f26691g = (TextView) mo38986f(R.id.listing_shop);
        this.f26692h = (FavHeartButton) mo38986f(R.id.favorite_button);
        this.f26693i = (TextView) mo38986f(R.id.shop_numeric_rating);
        CollageRatingView collageRatingView = (CollageRatingView) mo38986f(R.id.rating);
        this.f26694j = collageRatingView;
        this.f26695k = (NumericRatingView) mo38986f(R.id.anchor_listing_numeric_rating);
        this.f26696l = (TextView) mo38986f(R.id.listing_availability);
        this.f26697m = (LinearLayout) mo38986f(R.id.listing_details);
        this.f26698n = (FrameLayout) mo38986f(R.id.listing_image_region);
        listingFullImageView.setUseStandardRatio(true);
        collageRatingView.setTextColor(C13350a.m21013d(collageRatingView.getContext(), R.attr.clg_color_text_tertiary));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ListingCard listingCard = (ListingCard) obj;
        this.f26689e.setText(listingCard.getTitle());
        this.f26691g.setText(listingCard.getShopName());
        Resources resources = this.itemView.getResources();
        float shopAverageRating = listingCard.getShopAverageRating();
        if (shopAverageRating <= 0.0f) {
            this.f26694j.setVisibility(8);
            this.f26695k.setVisibility(8);
            this.f26693i.setVisibility(8);
        } else if (this.f26699o) {
            this.f26694j.setVisibility(8);
            this.f26693i.setVisibility(8);
            int shopTotalRatingCount = listingCard.getShopTotalRatingCount();
            this.f26695k.setVisibility(0);
            this.f26695k.setRatingData(shopAverageRating, shopTotalRatingCount, NumericRatingView.ReviewCountDisplayType.COMPACT, NumericRatingView.ReviewCountColor.NONE);
        } else {
            this.f26695k.setVisibility(8);
            this.f26694j.setRating(listingCard.getShopAverageRating());
            this.f26694j.setVisibility(0);
            if (listingCard.getShopTotalRatingCount() > 0) {
                this.f26694j.setText(resources.getString(R.string.parentheses, new Object[]{C8885d0.m17318b((double) listingCard.getShopTotalRatingCount())}));
            } else {
                this.f26694j.setText((CharSequence) null);
            }
            if (this.f26700p) {
                this.f26693i.setVisibility(0);
                this.f26693i.setText(String.valueOf(C15588c1.m25295N0(shopAverageRating)));
            } else {
                this.f26693i.setVisibility(8);
            }
        }
        if (listingCard.isSoldOut()) {
            this.f26690f.setText(R.string.sold);
            this.f26696l.setVisibility(8);
        } else {
            this.f26690f.setText(listingCard.getPrice().format());
            int quantity = listingCard.getQuantity();
            if (quantity > 0) {
                this.f26696l.setText(resources.getQuantityString(R.plurals.n_items_available, quantity, new Object[]{Integer.valueOf(quantity)}));
                this.f26696l.setVisibility(0);
            } else {
                this.f26696l.setVisibility(8);
            }
        }
        this.f26688d.setImageInfo(listingCard.getListingImage());
        FavHeartButton favHeartButton = this.f26692h;
        favHeartButton.setFav(listingCard.isFavorite(), listingCard.getTitle(), false);
        favHeartButton.setOnClickListener(new C11987c(this, new C8698l[]{listingCard}, listingCard, favHeartButton));
        this.itemView.setOnClickListener(new C11985a(this, new C8698l[]{listingCard}, listingCard));
        C11914o.m19629a(this.f26697m.getViewTreeObserver(), new C11986b(this));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f26689e.setText((CharSequence) null);
        this.f26691g.setText((CharSequence) null);
        this.f26690f.setText((CharSequence) null);
        this.f26688d.cleanUp();
    }
}
