package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.util.TrackingOnLongClickListener;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import com.google.android.play.core.assetpacks.C15588c1;
import p407nf.C13113a;

/* renamed from: com.etsy.android.uikit.viewholder.i */
public abstract class C11994i extends C12086e<ListingCard> {

    /* renamed from: c */
    public final ListingFullImageView f26707c;

    /* renamed from: d */
    public final TextView f26708d;

    /* renamed from: e */
    public final TextView f26709e;

    /* renamed from: f */
    public final TextView f26710f;

    /* renamed from: g */
    public final FavHeartButton f26711g;

    /* renamed from: h */
    public final TextView f26712h;

    /* renamed from: i */
    public final TextView f26713i;

    /* renamed from: j */
    public final ImageView f26714j;

    /* renamed from: k */
    public MaterialCardView f26715k;

    /* renamed from: l */
    public final CollageRatingView f26716l;

    /* renamed from: m */
    public final NumericRatingView f26717m;

    /* renamed from: n */
    public final TextView f26718n;

    /* renamed from: o */
    public boolean f26719o = true;

    /* renamed from: p */
    public boolean f26720p = false;

    /* renamed from: q */
    public boolean f26721q = false;

    /* renamed from: r */
    public boolean f26722r = false;

    /* renamed from: s */
    public boolean f26723s = false;

    /* renamed from: t */
    public final C13113a f26724t;

    /* renamed from: u */
    public C12008t f26725u;

    /* renamed from: v */
    public boolean f26726v = false;

    /* renamed from: w */
    public ListingCardViewHolderOptions.AdIndicator f26727w = ListingCardViewHolderOptions.AdIndicator.BADGE;

    /* renamed from: com.etsy.android.uikit.viewholder.i$a */
    public static /* synthetic */ class C11995a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$AdIndicator[] r0 = com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions.AdIndicator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26728a = r0
                com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$AdIndicator r1 = com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions.AdIndicator.BADGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26728a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$AdIndicator r1 = com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions.AdIndicator.LABEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.C11994i.C11995a.<clinit>():void");
        }
    }

    public C11994i(View view, C13113a aVar, boolean z, boolean z2, C12008t tVar) {
        super(view);
        this.f26724t = aVar;
        this.f26725u = tVar;
        ListingFullImageView listingFullImageView = (ListingFullImageView) view.findViewById(R.id.listing_image);
        this.f26707c = listingFullImageView;
        this.f26708d = (TextView) view.findViewById(R.id.listing_title);
        this.f26709e = (TextView) view.findViewById(R.id.listing_price);
        this.f26710f = (TextView) view.findViewById(R.id.listing_shop);
        this.f26711g = (FavHeartButton) view.findViewById(R.id.favorite_button);
        this.f26714j = (ImageView) view.findViewById(R.id.btn_menu);
        this.f26712h = (TextView) view.findViewById(R.id.ad_badge);
        this.f26713i = (TextView) view.findViewById(R.id.ad_label);
        this.f26718n = (TextView) view.findViewById(R.id.listing_shop_numeric_rating);
        this.f26716l = (CollageRatingView) view.findViewById(R.id.listing_shop_rating_and_reviews);
        this.f26717m = (NumericRatingView) view.findViewById(R.id.listing_shop_rating_and_reviews_numeric);
        this.f26715k = (MaterialCardView) view.findViewById(R.id.listing_matte);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            Context context = view.getContext();
            Resources resources = context.getResources();
            layoutParams.width = (int) TypedValue.applyDimension(1, (float) ((int) ((((double) resources.getConfiguration().screenWidthDp) * 0.75d) / ((double) (resources.getInteger(R.integer.vespa_grid_layout_max_span) / resources.getInteger(R.integer.vespa_listing_card_span))))), context.getResources().getDisplayMetrics());
            this.f26723s = true;
        }
        if (listingFullImageView != null) {
            listingFullImageView.setUseStandardRatio(!z2);
        }
    }

    /* renamed from: b */
    public void mo31374b() {
        this.f26708d.setText((CharSequence) null);
        this.f26710f.setText((CharSequence) null);
        this.f26709e.setText((CharSequence) null);
        this.f26707c.cleanUp();
        this.f26710f.setText((CharSequence) null);
    }

    /* renamed from: g */
    public void mo19450a(ListingCard listingCard) {
        boolean z = true;
        ListingCardUiModel listingCardUiModel = listingCard instanceof ListingCardUiModel ? (ListingCardUiModel) listingCard : new ListingCardUiModel(listingCard, true, false, false);
        this.f26708d.setText(listingCardUiModel.getTitle());
        this.f26708d.setContentDescription(listingCardUiModel.getTitleContentDescription());
        mo38780i(listingCardUiModel);
        mo38779h(listingCardUiModel);
        int i = C11995a.f26728a[this.f26727w.ordinal()];
        if (i == 1) {
            this.f26712h.setVisibility(listingCardUiModel.isAd() ? 0 : 8);
            this.f26713i.setVisibility(8);
        } else if (i == 2) {
            this.f26713i.setVisibility(listingCardUiModel.isAd() ? 0 : 8);
            this.f26712h.setVisibility(8);
        }
        if (this.f26720p) {
            float shopAverageRating = listingCardUiModel.getShopAverageRating();
            int shopTotalRatingCount = listingCardUiModel.getShopTotalRatingCount();
            if (shopAverageRating <= 0.0f || shopTotalRatingCount <= 0) {
                CollageRatingView collageRatingView = this.f26716l;
                if (collageRatingView != null) {
                    collageRatingView.setVisibility(8);
                }
                TextView textView = this.f26718n;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NumericRatingView numericRatingView = this.f26717m;
                if (numericRatingView != null) {
                    numericRatingView.setVisibility(8);
                }
            } else if (this.f26721q) {
                if (this.f26717m != null) {
                    CollageRatingView collageRatingView2 = this.f26716l;
                    if (collageRatingView2 != null) {
                        collageRatingView2.setVisibility(8);
                    }
                    TextView textView2 = this.f26718n;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    this.f26717m.setVisibility(0);
                    this.f26717m.setRatingData(C15588c1.m25295N0(shopAverageRating), shopTotalRatingCount, NumericRatingView.ReviewCountDisplayType.COMPACT, NumericRatingView.ReviewCountColor.NONE);
                }
            } else if (this.f26716l != null) {
                NumericRatingView numericRatingView2 = this.f26717m;
                if (numericRatingView2 != null) {
                    numericRatingView2.setVisibility(8);
                }
                this.f26716l.setVisibility(0);
                this.f26716l.setRating(listingCardUiModel.getShopAverageRating());
                this.f26716l.setText(listingCardUiModel.getShopReviewCountText());
                if (this.f26722r) {
                    TextView textView3 = this.f26718n;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        this.f26718n.setText(String.valueOf(C15588c1.m25295N0(shopAverageRating)));
                    }
                } else {
                    TextView textView4 = this.f26718n;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                }
            }
        } else {
            CollageRatingView collageRatingView3 = this.f26716l;
            if (collageRatingView3 != null) {
                collageRatingView3.setVisibility(8);
            }
            TextView textView5 = this.f26718n;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        if (this.f26719o) {
            this.f26710f.setVisibility(0);
            this.f26710f.setText(listingCardUiModel.getShopName());
        }
        this.itemView.setOnClickListener(mo38782k(listingCardUiModel));
        TrackingOnLongClickListener l = mo38783l(listingCardUiModel);
        if (l != null) {
            this.itemView.setOnLongClickListener(l);
        }
        FavHeartButton favHeartButton = this.f26711g;
        if (!this.f26725u.f26765b.mo45960e() || (!listingCardUiModel.isFavorite() && !listingCardUiModel.hasCollections())) {
            z = false;
        }
        favHeartButton.setVisibility(0);
        String title = listingCardUiModel.getTitle();
        if (title == null) {
            title = "";
        }
        favHeartButton.setFav(z, title, false);
        favHeartButton.setOnClickListener(new C11993h(this, listingCardUiModel, favHeartButton));
        mo38781j(this.f26714j, listingCardUiModel);
    }

    /* renamed from: h */
    public void mo38779h(ListingCardUiModel listingCardUiModel) {
        this.f26707c.setImageDrawable((Drawable) null);
        this.f26707c.setImageInfo(listingCardUiModel.getListingImage());
        if (this.f26723s) {
            this.f26707c.setContentDescription(listingCardUiModel.getTitleContentDescription());
        } else {
            this.f26707c.setContentDescription((CharSequence) null);
            this.f26707c.setImportantForAccessibility(2);
        }
        if (!this.f26726v || !listingCardUiModel.isSoldOut()) {
            this.f26707c.setAlpha(1.0f);
        } else {
            this.f26707c.setAlpha(0.4f);
        }
    }

    /* renamed from: i */
    public abstract void mo38780i(ListingCardUiModel listingCardUiModel);

    /* renamed from: j */
    public abstract void mo38781j(ImageView imageView, ListingCardUiModel listingCardUiModel);

    /* renamed from: k */
    public abstract TrackingOnClickListener mo38782k(ListingCard listingCard);

    /* renamed from: l */
    public abstract TrackingOnLongClickListener mo38783l(ListingCard listingCard);
}
