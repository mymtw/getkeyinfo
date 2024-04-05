package com.etsy.android.p327ui.cardview.viewholders;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0087d;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import p435rb.C13350a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.l1 */
public final class C9195l1 extends C12086e<ShopCard> {

    /* renamed from: c */
    public ImageView[] f20284c;

    /* renamed from: d */
    public ImageView f20285d = ((ImageView) mo38986f(R.id.object_avatar));

    /* renamed from: e */
    public CollageRatingView f20286e = ((CollageRatingView) mo38986f(R.id.rating));

    /* renamed from: f */
    public NumericRatingView f20287f = ((NumericRatingView) mo38986f(R.id.shop_header_numeric_rating));

    /* renamed from: g */
    public final TextView f20288g = ((TextView) mo38986f(R.id.shop_numeric_rating));

    /* renamed from: h */
    public TextView f20289h = ((TextView) mo38986f(R.id.item_count));

    /* renamed from: i */
    public TextView f20290i = ((TextView) mo38986f(R.id.shop_name));

    /* renamed from: j */
    public ImageView f20291j = ((ImageView) mo38986f(R.id.btn_fav));

    /* renamed from: k */
    public boolean f20292k;

    /* renamed from: l */
    public ViewGroup f20293l;

    /* renamed from: m */
    public final ShopCardClickHandler f20294m;

    public C9195l1(ViewGroup viewGroup, ShopCardClickHandler shopCardClickHandler, boolean z) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_shop, viewGroup, false));
        this.f20294m = shopCardClickHandler;
        ImageView[] imageViewArr = new ImageView[4];
        this.f20284c = imageViewArr;
        imageViewArr[0] = (ImageView) mo38986f(R.id.img_item_1);
        this.f20284c[1] = (ImageView) mo38986f(R.id.img_item_2);
        this.f20284c[2] = (ImageView) mo38986f(R.id.img_item_3);
        this.f20284c[3] = (ImageView) mo38986f(R.id.img_item_4);
        this.f20292k = z;
        this.f20293l = viewGroup;
        this.f20286e.setTextColor(C13350a.m21013d(this.f20286e.getContext(), R.attr.clg_color_text_tertiary));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        int i;
        int i2;
        ShopCard shopCard = (ShopCard) obj;
        if (this.f20292k) {
            if (this.itemView.getResources().getConfiguration().orientation == 1) {
                ViewGroup viewGroup = this.f20293l;
                ListingCardSize listingCardSize = shopCard.getListingCardSize();
                int b = C0087d.m233b(this.itemView, R.dimen.clg_space_8);
                if (listingCardSize.getMargins() != null) {
                    int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(listingCardSize.getMargins().intValue());
                    ((ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams()).setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    i2 = dimensionPixelSize * 2;
                } else {
                    i2 = C0087d.m233b(this.itemView, R.dimen.clg_space_16);
                }
                i = (((viewGroup.getMeasuredWidth() - b) - i2) / listingCardSize.getCardPerScreen()) - i2;
                this.itemView.getLayoutParams().width = i;
            } else {
                i = this.itemView.getResources().getDimensionPixelSize(R.dimen.horizontal_shop_card_width);
            }
            this.itemView.getLayoutParams().width = i;
        }
        this.f20290i.setText(shopCard.getShopName());
        C0114h.m270B0(this.itemView.getContext()).load(shopCard.getAvatarUrl()).mo16816M(this.f20285d);
        int activeListingCount = shopCard.getActiveListingCount();
        this.f20289h.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.item_lowercase_quantity, activeListingCount, new Object[]{Integer.valueOf(activeListingCount)}));
        for (ImageView backgroundResource : this.f20284c) {
            backgroundResource.setBackgroundResource(R.drawable.bg_empty_image);
        }
        List<? extends ListingLike> cardListings = shopCard.getCardListings();
        for (int i3 = 0; i3 < cardListings.size(); i3++) {
            ListingImage listingImage = ((ListingLike) cardListings.get(i3)).getListingImage();
            if (listingImage != null) {
                String str = listingImage.get4to3ImageUrlForPixelWidth(this.f20284c[i3].getWidth());
                ImageView imageView = this.f20284c[i3];
                int imageColor = listingImage.getImageColor();
                if (!(str == null || imageView == null)) {
                    imageView.setBackground((Drawable) null);
                    C0114h.m270B0(this.itemView.getContext()).load(str).mo17160t(new ColorDrawable(imageColor)).mo16816M(imageView);
                }
            }
        }
        int numRatings = shopCard.getNumRatings();
        float averageRating = (float) shopCard.getAverageRating();
        if (numRatings == 0) {
            this.f20286e.setVisibility(8);
            this.f20287f.setVisibility(8);
            this.f20288g.setVisibility(8);
        } else {
            this.f20287f.setVisibility(8);
            this.f20286e.setVisibility(0);
            this.f20286e.setRating(averageRating);
            this.f20286e.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.review_counts, numRatings, new Object[]{Integer.valueOf(numRatings)}));
            this.f20288g.setVisibility(0);
            this.f20288g.setText(String.valueOf(C15588c1.m25295N0(averageRating)));
        }
        ImageView imageView2 = this.f20291j;
        boolean isFavorite = shopCard.isFavorite();
        imageView2.setVisibility(0);
        imageView2.setImageResource(isFavorite ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
        imageView2.setOnClickListener(new C9192k1(this, new C8698l[]{shopCard}, shopCard, imageView2));
        mo31431g(shopCard);
        this.itemView.setOnClickListener(new C9189j1(this, shopCard));
    }

    /* renamed from: b */
    public final void mo31374b() {
        for (ImageView imageDrawable : this.f20284c) {
            imageDrawable.setImageDrawable((Drawable) null);
        }
    }

    @SuppressLint({"StringFormatInvalid"})
    /* renamed from: g */
    public final void mo31431g(ShopCard shopCard) {
        if (shopCard.isFavorite()) {
            ImageView imageView = this.f20291j;
            imageView.setContentDescription(imageView.getContext().getResources().getString(R.string.favorited_listing_shop, new Object[]{this.f20290i.getText()}));
            return;
        }
        ImageView imageView2 = this.f20291j;
        imageView2.setContentDescription(imageView2.getContext().getResources().getString(R.string.not_favorited_listing_shop, new Object[]{this.f20290i.getText()}));
    }
}
