package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.C0326j;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.Pair;
import p260v0.C8184a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.q1 */
public final class C9210q1 extends C12086e<ShopLike> {

    /* renamed from: c */
    public final ShopCardClickHandler f20329c;

    /* renamed from: d */
    public final CollageRatingView f20330d;

    /* renamed from: e */
    public final int f20331e;

    /* renamed from: f */
    public TextView f20332f;

    /* renamed from: g */
    public TextView f20333g;

    /* renamed from: h */
    public LinearLayout f20334h;

    /* renamed from: i */
    public int f20335i = 4;

    /* renamed from: j */
    public ImageView f20336j;

    /* renamed from: k */
    public Drawable f20337k;

    public C9210q1(ViewGroup viewGroup, ShopCardClickHandler shopCardClickHandler) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_standard_full, viewGroup, false));
        this.f20329c = shopCardClickHandler;
        this.f20332f = (TextView) mo38986f(R.id.title);
        this.f20333g = (TextView) mo38986f(R.id.subtitle);
        this.f20330d = (CollageRatingView) mo38986f(R.id.rating);
        this.f20334h = (LinearLayout) mo38986f(R.id.image_layout);
        this.f20336j = (ImageView) mo38986f(R.id.avatar);
        Resources resources = this.itemView.getResources();
        resources.getDimensionPixelOffset(R.dimen.card_avatar_small);
        this.f20331e = resources.getDimensionPixelOffset(R.dimen.gen_avatar_corners_small);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.sk_size_icon_smaller);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.fixed_one);
        Context context = viewGroup.getContext();
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_location_v1);
        this.f20337k = b;
        b.setBounds(0, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2 + dimensionPixelOffset);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ShopLike shopLike = (ShopLike) obj;
        this.f20332f.setText(shopLike.getShopName());
        if (this.f20329c != null) {
            this.itemView.setOnClickListener(new C9207p1(this, shopLike));
        }
        if (this.f20335i > 0) {
            LinearLayout linearLayout = this.f20334h;
            List<? extends ListingLike> cardListings = shopLike.getCardListings();
            linearLayout.removeAllViews();
            int integer = this.itemView.getResources().getInteger(R.integer.card_item_list_count);
            int i = 0;
            while (i < integer) {
                ListingImage listingImage = cardListings.size() > i ? ((ListingLike) cardListings.get(i)).getListingImage() : null;
                ListingFullImageView listingFullImageView = new ListingFullImageView(linearLayout.getContext());
                listingFullImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                listingFullImageView.setUseStandardRatio(true);
                listingFullImageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                if (listingImage != null) {
                    listingFullImageView.setImageInfo(listingImage);
                } else if (i == integer - 1) {
                    listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image);
                } else {
                    listingFullImageView.setBackgroundResource(R.drawable.bg_empty_image_right_divider);
                }
                linearLayout.addView(listingFullImageView);
                i++;
            }
        }
        String location = shopLike.getLocation();
        this.f20336j.setVisibility(0);
        Pair<Integer, String> pair = ShopIcon.IMG_SIZE_75;
        C0114h.m272C0(this.f20336j).load(C8885d0.m17324h(shopLike.getIconUrl(pair.getFirst().intValue())) ? shopLike.getIconUrl(pair.getFirst().intValue()) : shopLike.getAvatarUrl()).mo17139B(new C6105w(this.f20331e)).mo16816M(this.f20336j);
        this.f20330d.setVisibility(8);
        if (C8885d0.m17324h(location)) {
            this.f20333g.setText(location);
            this.f20333g.setCompoundDrawables(this.f20337k, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f20333g.setVisibility(0);
        } else {
            this.f20333g.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f20334h;
        linearLayout2.setContentDescription(linearLayout2.getResources().getString(R.string.item_button, new Object[]{this.f20332f.getText()}));
        this.f20332f.setImportantForAccessibility(2);
    }
}
