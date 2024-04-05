package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p013v4.media.session.C0087d;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextViewStyleApplier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.shophome.C8987a;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.ClickableViewPager;
import com.etsy.android.uikit.pageindicator.ScalingPageIndicator;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.util.TrackingOnLongClickListener;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.google.android.material.card.MaterialCardView;
import java.util.Locale;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p242t3.C7955e;
import p407nf.C13113a;
import p435rb.C13350a;
import p435rb.C13351b;

public final class ListingCardViewHolder extends C11994i {

    /* renamed from: A */
    public final ScalingPageIndicator f26577A;

    /* renamed from: B */
    public final C19285c f26578B;

    /* renamed from: C */
    public ListingCardImagesCoordinator f26579C;

    /* renamed from: x */
    public final ListingCardViewHolderOptions f26580x;

    /* renamed from: y */
    public final C12007s f26581y;

    /* renamed from: z */
    public final ClickableViewPager f26582z;

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolder$a */
    public static final class C11966a implements ViewPager.C3334i {

        /* renamed from: b */
        public final /* synthetic */ ListingCardViewHolder f26583b;

        public C11966a(ListingCardViewHolder listingCardViewHolder) {
            this.f26583b = listingCardViewHolder;
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f26583b.mo38784m().mo30642e(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCardViewHolder(C13113a aVar, boolean z, boolean z2, C12008t tVar, ListingCardViewHolderOptions listingCardViewHolderOptions, C12007s sVar) {
        super(sVar.f26763a, aVar, z, z2, tVar);
        C19383o.m32797g(tVar, "dependencies");
        C19383o.m32797g(listingCardViewHolderOptions, ResponseConstants.OPTIONS);
        this.f26580x = listingCardViewHolderOptions;
        this.f26581y = sVar;
        this.f26578B = C19350d.m32677b(new ListingCardViewHolder$listingImagesAdapter$2(tVar, this));
        if (!(listingCardViewHolderOptions instanceof ListingCardViewHolderOptions.C11969c)) {
            mo38785n();
        }
        this.f26720p = listingCardViewHolderOptions.mo38797k();
        this.f26719o = listingCardViewHolderOptions.mo38799m();
        this.f26726v = listingCardViewHolderOptions.mo38792f();
        this.f26727w = listingCardViewHolderOptions.mo38787a();
        if (listingCardViewHolderOptions.mo38802p()) {
            this.f26714j.setVisibility(8);
            this.f26715k.setRadius(0.0f);
            this.f26715k.setCardElevation(0.0f);
            this.f26715k.setCardBackgroundColor(0);
        }
        if (listingCardViewHolderOptions.mo38807u()) {
            this.f26722r = true;
            this.f26718n.setVisibility(0);
            this.f26716l.setVisibility(0);
            this.f26717m.setVisibility(8);
            Context context = sVar.f26763a.getContext();
            C19383o.m32796f(context, "itemView.context");
            ((CollageRatingView) sVar.f26763a.findViewById(R.id.listing_shop_rating_and_reviews)).setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_tertiary));
        }
        View findViewById = sVar.f26763a.findViewById(R.id.listing_images_pager);
        C19383o.m32796f(findViewById, "viewDelegate.itemView.fi….id.listing_images_pager)");
        this.f26582z = (ClickableViewPager) findViewById;
        View findViewById2 = sVar.f26763a.findViewById(R.id.listing_images_pager_page_indicator);
        C19383o.m32796f(findViewById2, "viewDelegate.itemView.fi…ges_pager_page_indicator)");
        this.f26577A = (ScalingPageIndicator) findViewById2;
        if (listingCardViewHolderOptions.mo38800n()) {
            C8987a m = mo38784m();
            m.mo30638a(1.0f);
            m.mo30641d(ImageView.ScaleType.CENTER_CROP);
            ListingFullImageView a = sVar.mo38877a();
            a.setAspectRatio(1.0f);
            a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        super.mo31374b();
        ViewExtensions.m12860d(this.itemView.findViewById(R.id.free_shipping));
        ViewExtensions.m12860d(this.itemView.findViewById(R.id.sale));
        ViewExtensions.m12860d(this.itemView.findViewById(R.id.bestseller));
        ViewExtensions.m12860d(this.itemView.findViewById(R.id.only_n_left));
        ListingCardImagesCoordinator listingCardImagesCoordinator = this.f26579C;
        if (listingCardImagesCoordinator != null) {
            listingCardImagesCoordinator.f26573d.dispose();
        }
        C12007s sVar = this.f26581y;
        ViewGroup.LayoutParams layoutParams = sVar.f26763a.findViewById(R.id.guide_bottom).getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).guideEnd = sVar.f26763a.getResources().getDimensionPixelOffset(R.dimen.clg_space_12);
        ViewExtensions.m12869m(sVar.f26763a.findViewById(R.id.btn_menu));
        sVar.f26763a.findViewById(R.id.price_pill).setVisibility(8);
        sVar.f26763a.findViewById(R.id.ad_badge).setVisibility(8);
        sVar.f26763a.findViewById(R.id.listing_shop_rating_and_reviews).setVisibility(8);
        sVar.f26763a.findViewById(R.id.listing_shop_numeric_rating).setVisibility(8);
        View view = sVar.f26763a;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        Context context = ((MaterialCardView) sVar.f26763a).getContext();
        C19383o.m32796f(context, "itemView.context");
        ((MaterialCardView) view).setCardBackgroundColor(C13350a.m21013d(context, R.attr.clg_color_bg_primary));
        mo38784m().mo30639b();
    }

    /* renamed from: g */
    public final void mo38778g(ListingCard listingCard) {
        TextView textView;
        int i;
        super.mo19450a(listingCard);
        if (listingCard != null) {
            if (this.f26580x.mo38796j()) {
                this.f26581y.mo38879c();
                if (this.f26723s) {
                    if (listingCard.shouldShowPricePill()) {
                        this.f26581y.mo38886j(0);
                    } else {
                        this.f26581y.mo38886j(8);
                    }
                    ListingCardSize listingCardSize = listingCard.getListingCardSize();
                    if (listingCardSize != null) {
                        View f = mo38986f(R.id.listing_image);
                        C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingFullImageView");
                        ListingFullImageView listingFullImageView = (ListingFullImageView) f;
                        View view = this.itemView;
                        C19383o.m32796f(view, "itemView");
                        ListingCardViewHolderOptions listingCardViewHolderOptions = this.f26580x;
                        C19383o.m32797g(listingCardViewHolderOptions, ResponseConstants.OPTIONS);
                        int cardPerScreen = listingCardSize.getCardPerScreen();
                        int b = C0087d.m233b(view, R.dimen.clg_space_8);
                        if (listingCardSize.getMargins() != null) {
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            Resources resources = view.getContext().getResources();
                            Integer margins = listingCardSize.getMargins();
                            C19383o.m32794d(margins);
                            int dimensionPixelSize = resources.getDimensionPixelSize(margins.intValue());
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            i = dimensionPixelSize * 2;
                        } else {
                            Integer e = listingCardViewHolderOptions.mo38791e();
                            i = (e != null ? e.intValue() : 0) * 2;
                        }
                        listingFullImageView.setAspectRatio(listingCardSize.getAspectRatio());
                        Resources resources2 = view.getContext().getResources();
                        DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                        view.getLayoutParams().width = ((((resources2.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels) - b) - i) / cardPerScreen) - i;
                    }
                }
            }
            if (this.f26580x.mo38802p()) {
                this.f26581y.mo38880d();
            }
            if (this.f26580x.mo38794h() && (textView = (TextView) this.f26581y.f26763a.findViewById(R.id.listing_title)) != null) {
                textView.setVisibility(8);
            }
            CharSequence charSequence = null;
            if (this.f26580x.mo38792f()) {
                if (listingCard.isSoldOut()) {
                    C12007s sVar = this.f26581y;
                    ((TextView) sVar.f26763a.findViewById(R.id.bestseller)).setVisibility(8);
                    TextView textView2 = (TextView) sVar.f26763a.findViewById(R.id.listing_title);
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    sVar.f26763a.findViewById(R.id.free_shipping).setVisibility(8);
                    sVar.f26763a.findViewById(R.id.sale).setVisibility(8);
                    sVar.mo38883g(false);
                    sVar.f26763a.findViewById(R.id.buyer_fulfillment_promise).setVisibility(8);
                    sVar.mo38882f(8);
                    sVar.mo38878b();
                    ((TextView) sVar.f26763a.findViewById(R.id.listing_shop)).setVisibility(8);
                    TextView textView3 = (TextView) sVar.f26763a.findViewById(R.id.listing_title);
                    sVar.mo38884h(textView3 != null ? textView3.getText() : null);
                } else {
                    TextView textView4 = (TextView) this.f26581y.f26763a.findViewById(R.id.listing_title);
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                }
            }
            if (this.f26580x.mo38806t()) {
                ViewGroup.LayoutParams layoutParams2 = this.f26581y.f26763a.findViewById(R.id.guide_bottom).getLayoutParams();
                C19383o.m32795e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.LayoutParams) layoutParams2).guideEnd = 0;
                C12007s sVar2 = this.f26581y;
                ((TextView) sVar2.f26763a.findViewById(R.id.bestseller)).setVisibility(8);
                TextView textView5 = (TextView) sVar2.f26763a.findViewById(R.id.listing_title);
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                sVar2.f26763a.findViewById(R.id.free_shipping).setVisibility(8);
                sVar2.f26763a.findViewById(R.id.sale).setVisibility(8);
                sVar2.mo38883g(false);
                sVar2.f26763a.findViewById(R.id.buyer_fulfillment_promise).setVisibility(8);
                sVar2.mo38882f(8);
                sVar2.mo38878b();
                ((TextView) sVar2.f26763a.findViewById(R.id.listing_shop)).setVisibility(8);
                TextView textView6 = (TextView) sVar2.f26763a.findViewById(R.id.listing_title);
                if (textView6 != null) {
                    charSequence = textView6.getText();
                }
                sVar2.mo38884h(charSequence);
                this.f26581y.mo38888l(8);
                TextView textView7 = (TextView) this.f26581y.f26763a.findViewById(R.id.bestseller);
                if (textView7 != null) {
                    ViewExtensions.m12860d(textView7);
                }
                this.f26581y.mo38886j(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f0  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38779h(com.etsy.android.uikit.viewholder.ListingCardUiModel r52) {
        /*
            r51 = this;
            r0 = r51
            r1 = r52
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r2 = r0.f26580x
            boolean r2 = r2.mo38802p()
            if (r2 == 0) goto L_0x0218
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r2 = r0.f26580x
            boolean r2 = r2.mo38803q()
            if (r2 == 0) goto L_0x0218
            com.etsy.android.uikit.ClickableViewPager r2 = r0.f26582z
            r2.clearOnPageChangeListeners()
            com.etsy.android.uikit.viewholder.s r2 = r0.f26581y
            android.view.View r2 = r2.f26763a
            r3 = 2131428906(0x7f0b062a, float:1.847947E38)
            android.view.View r2 = r2.findViewById(r3)
            boolean r3 = r52.isAd()
            r4 = 8
            r5 = 0
            if (r3 == 0) goto L_0x002e
            goto L_0x003e
        L_0x002e:
            boolean r3 = r52.getViewedInLast24Hours()
            if (r3 == 0) goto L_0x003e
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r3 = r0.f26580x
            boolean r3 = r3.mo38810x()
            if (r3 == 0) goto L_0x003e
            r3 = r5
            goto L_0x003f
        L_0x003e:
            r3 = r4
        L_0x003f:
            r2.setVisibility(r3)
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions r2 = r0.f26580x
            boolean r2 = r2.mo38809w()
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L_0x005c
            com.etsy.android.lib.models.apiv3.listing.ListingVideo r2 = r52.getListingVideo()
            if (r2 == 0) goto L_0x0057
            com.etsy.android.uikit.viewholder.r r2 = p568fn.C17782b.m29885s0(r2)
            goto L_0x0058
        L_0x0057:
            r2 = r3
        L_0x0058:
            if (r2 == 0) goto L_0x005c
            r2 = r6
            goto L_0x005d
        L_0x005c:
            r2 = r5
        L_0x005d:
            int r7 = r52.getListingImageCount()
            r8 = 4
            r9 = 2131428844(0x7f0b05ec, float:1.8479344E38)
            r10 = 2131428832(0x7f0b05e0, float:1.847932E38)
            r11 = 2131428845(0x7f0b05ed, float:1.8479346E38)
            if (r7 > r6) goto L_0x0095
            if (r2 != 0) goto L_0x0095
            com.etsy.android.uikit.viewholder.s r2 = r0.f26581y
            android.view.View r2 = r2.f26763a
            android.view.View r2 = r2.findViewById(r10)
            r2.setVisibility(r5)
            com.etsy.android.uikit.viewholder.s r2 = r0.f26581y
            android.view.View r2 = r2.f26763a
            android.view.View r2 = r2.findViewById(r9)
            r2.setVisibility(r8)
            com.etsy.android.uikit.viewholder.s r2 = r0.f26581y
            android.view.View r2 = r2.f26763a
            android.view.View r2 = r2.findViewById(r11)
            r2.setVisibility(r4)
            super.mo38779h(r52)
            goto L_0x021b
        L_0x0095:
            com.etsy.android.uikit.viewholder.s r4 = r0.f26581y
            android.view.View r4 = r4.f26763a
            android.view.View r4 = r4.findViewById(r10)
            r4.setVisibility(r8)
            com.etsy.android.uikit.viewholder.s r4 = r0.f26581y
            android.view.View r4 = r4.f26763a
            android.view.View r4 = r4.findViewById(r9)
            r4.setVisibility(r5)
            com.etsy.android.uikit.viewholder.s r4 = r0.f26581y
            android.view.View r4 = r4.f26763a
            android.view.View r4 = r4.findViewById(r11)
            r4.setVisibility(r5)
            com.etsy.android.uikit.ClickableViewPager r4 = r0.f26582z
            com.etsy.android.uikit.util.TrackingOnClickListener r6 = r51.mo38782k(r52)
            r4.setOnClickListener(r6)
            com.etsy.android.uikit.ClickableViewPager r4 = r0.f26582z
            com.etsy.android.uikit.util.TrackingOnLongClickListener r6 = r51.mo38783l(r52)
            r4.setOnLongClickListener(r6)
            com.etsy.android.uikit.ClickableViewPager r4 = r0.f26582z
            com.etsy.android.shophome.a r6 = r51.mo38784m()
            com.etsy.android.shophome.ListingCardImagesAndVideoAdapter r6 = r6.mo30640c()
            r4.setAdapter(r6)
            com.etsy.android.uikit.viewholder.ListingCardImagesCoordinator r4 = new com.etsy.android.uikit.viewholder.ListingCardImagesCoordinator
            com.etsy.android.uikit.viewholder.t r6 = r0.f26725u
            com.etsy.android.uikit.viewholder.u r6 = r6.f26766c
            com.etsy.android.shophome.a r7 = r51.mo38784m()
            r4.<init>(r6, r7, r1)
            r0.f26579C = r4
            com.etsy.android.uikit.viewholder.ListingCardUiModel r6 = r4.f26572c
            java.util.List r6 = r6.getListingImages()
            int r7 = r6.size()
            com.etsy.android.uikit.viewholder.ListingCardUiModel r8 = r4.f26572c
            int r8 = r8.getListingImageCount()
            if (r7 != r8) goto L_0x010b
            com.etsy.android.shophome.a r7 = r4.f26571b
            com.etsy.android.uikit.viewholder.ListingCardUiModel r8 = r4.f26572c
            com.etsy.android.lib.models.apiv3.listing.ListingVideo r8 = r8.getListingVideo()
            if (r8 == 0) goto L_0x0105
            com.etsy.android.uikit.viewholder.r r8 = p568fn.C17782b.m29885s0(r8)
            goto L_0x0106
        L_0x0105:
            r8 = r3
        L_0x0106:
            r7.mo30644g(r6, r8)
            goto L_0x018e
        L_0x010b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.addAll(r6)
            com.etsy.android.uikit.viewholder.ListingCardUiModel r8 = r4.f26572c
            int r8 = r8.getListingImageCount()
            int r6 = r6.size()
            int r8 = r8 - r6
            r6 = r5
        L_0x011f:
            if (r6 >= r8) goto L_0x0176
            com.etsy.android.lib.models.apiv3.listing.ListingImage r9 = new com.etsy.android.lib.models.apiv3.listing.ListingImage
            r12 = r9
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r22 = r23
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = -1
            r49 = 7
            r50 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r7.add(r9)
            int r6 = r6 + 1
            goto L_0x011f
        L_0x0176:
            com.etsy.android.shophome.a r6 = r4.f26571b
            com.etsy.android.uikit.viewholder.ListingCardUiModel r8 = r4.f26572c
            com.etsy.android.lib.models.apiv3.listing.ListingVideo r8 = r8.getListingVideo()
            if (r8 == 0) goto L_0x0185
            com.etsy.android.uikit.viewholder.r r8 = p568fn.C17782b.m29885s0(r8)
            goto L_0x0186
        L_0x0185:
            r8 = r3
        L_0x0186:
            r6.mo30644g(r7, r8)
            com.etsy.android.uikit.viewholder.ListingCardUiModel r6 = r4.f26572c
            r6.setListingImages(r7)
        L_0x018e:
            com.etsy.android.uikit.viewholder.ListingCardUiModel r6 = r4.f26572c
            java.util.List r6 = r6.getListingImages()
            int r6 = r6.size()
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator$b r7 = r52.getScalingPageIndicatorState()
            if (r7 == 0) goto L_0x01b0
            com.etsy.android.uikit.viewholder.s r3 = r0.f26581y
            r3.getClass()
            android.view.View r3 = r3.f26763a
            android.view.View r3 = r3.findViewById(r11)
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator r3 = (com.etsy.android.uikit.pageindicator.ScalingPageIndicator) r3
            r3.restore(r7)
            kotlin.m r3 = kotlin.C19394m.f43287a
        L_0x01b0:
            if (r3 != 0) goto L_0x01bf
            com.etsy.android.uikit.viewholder.s r3 = r0.f26581y
            android.view.View r3 = r3.f26763a
            android.view.View r3 = r3.findViewById(r11)
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator r3 = (com.etsy.android.uikit.pageindicator.ScalingPageIndicator) r3
            r3.reset()
        L_0x01bf:
            if (r2 == 0) goto L_0x01c3
            int r6 = r6 + 1
        L_0x01c3:
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator r2 = r0.f26577A
            com.etsy.android.uikit.viewholder.ListingCardViewHolder$bindListingImage$2 r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder$bindListingImage$2
            r3.<init>(r6)
            r2.setPagerCountCallback(r3)
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator r2 = r0.f26577A
            com.etsy.android.uikit.viewholder.ListingCardViewHolder$bindListingImage$3 r3 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder$bindListingImage$3
            r3.<init>(r1)
            r2.setOnPageLoadedListener(r3)
            com.etsy.android.uikit.ClickableViewPager r2 = r0.f26582z
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator$b r3 = r52.getScalingPageIndicatorState()
            if (r3 == 0) goto L_0x01e2
            int r3 = r3.f26408a
            goto L_0x01e3
        L_0x01e2:
            r3 = r5
        L_0x01e3:
            r2.setCurrentItem(r3, r5)
            com.etsy.android.shophome.a r2 = r51.mo38784m()
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator$b r3 = r52.getScalingPageIndicatorState()
            if (r3 == 0) goto L_0x01f2
            int r5 = r3.f26408a
        L_0x01f2:
            r2.mo30642e(r5)
            com.etsy.android.uikit.ClickableViewPager r2 = r0.f26582z
            nf.b r3 = new nf.b
            com.etsy.android.lib.logger.b r5 = r0.f26962b
            java.lang.String r6 = "mViewTracker"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r3.<init>(r4, r5, r1)
            r2.addOnPageChangeListener(r3)
            com.etsy.android.uikit.ClickableViewPager r1 = r0.f26582z
            com.etsy.android.uikit.pageindicator.ScalingPageIndicator r2 = r0.f26577A
            r1.addOnPageChangeListener(r2)
            com.etsy.android.uikit.ClickableViewPager r1 = r0.f26582z
            com.etsy.android.uikit.viewholder.ListingCardViewHolder$a r2 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder$a
            r2.<init>(r0)
            r1.addOnPageChangeListener(r2)
            goto L_0x021b
        L_0x0218:
            super.mo38779h(r52)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.ListingCardViewHolder.mo38779h(com.etsy.android.uikit.viewholder.ListingCardUiModel):void");
    }

    /* renamed from: i */
    public final void mo38780i(ListingCardUiModel listingCardUiModel) {
        String str;
        String str2 = null;
        boolean z = false;
        if (this.f26580x.mo38806t()) {
            SignalNudgeListingCardUiModel signalNudgeValues = listingCardUiModel.getSignalNudgeValues();
            if (signalNudgeValues == null || (str = signalNudgeValues.getPriceText()) == null) {
                str = listingCardUiModel.getPriceAsString();
            }
            SignalNudgeListingCardUiModel signalNudgeValues2 = listingCardUiModel.getSignalNudgeValues();
            if (signalNudgeValues2 != null) {
                if (!this.f26580x.mo38793g()) {
                    this.f26581y.f26763a.findViewById(R.id.free_shipping_badge).setVisibility(signalNudgeValues2.getFreeShippingVisibility());
                    C12007s sVar = this.f26581y;
                    String freeShippingText = signalNudgeValues2.getFreeShippingText();
                    sVar.getClass();
                    C19383o.m32797g(freeShippingText, "freeShippingText");
                    ((TextView) sVar.f26763a.findViewById(R.id.free_shipping_badge)).setText(freeShippingText);
                }
                if (signalNudgeValues2.saleVisibilityVariant(new C8890e0()) == 0) {
                    str2 = listingCardUiModel.getRenderedPrice();
                }
            }
            C12007s sVar2 = this.f26581y;
            String priceContentDescription = listingCardUiModel.getPriceContentDescription();
            sVar2.getClass();
            C19383o.m32797g(str, "finalPrice");
            C19383o.m32797g(priceContentDescription, "contentDescription");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(str);
            int length = spannableStringBuilder.length();
            if (str2 != null) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append(str2);
                spannableStringBuilder.setSpan(new StrikethroughSpan(), length + 1, spannableStringBuilder.length(), 33);
            }
            Context context = sVar2.f26763a.getContext();
            C19383o.m32796f(context, "itemView.context");
            spannableStringBuilder.setSpan(new StyleKitSpan.BoldSpan(context), 0, length, 33);
            Context context2 = sVar2.f26763a.getContext();
            C19383o.m32796f(context2, "itemView.context");
            spannableStringBuilder.setSpan(new StyleKitSpan.NormalSpan(context2), length, spannableStringBuilder.length(), 33);
            TextView textView = (TextView) sVar2.f26763a.findViewById(R.id.price_and_discount_badge);
            if (textView != null) {
                ViewExtensions.m12869m(textView);
                textView.setText(spannableStringBuilder);
                textView.setContentDescription(priceContentDescription);
            }
        } else if (listingCardUiModel.getSignalNudgeValues() == null) {
            this.f26581y.mo38887k(listingCardUiModel.getPriceAsString());
            this.f26581y.mo38885i(listingCardUiModel.getPriceContentDescription());
        } else {
            SignalNudgeListingCardUiModel signalNudgeValues3 = listingCardUiModel.getSignalNudgeValues();
            if (signalNudgeValues3 != null) {
                if (this.f26580x.mo38793g()) {
                    this.f26581y.f26763a.findViewById(R.id.free_shipping).setVisibility(8);
                } else {
                    this.f26581y.f26763a.findViewById(R.id.free_shipping).setVisibility(signalNudgeValues3.getFreeShippingVisibility());
                    this.f26581y.f26763a.findViewById(R.id.free_shipping_badge).setVisibility(8);
                }
                C12007s sVar3 = this.f26581y;
                String freeShippingText2 = signalNudgeValues3.getFreeShippingText();
                sVar3.getClass();
                C19383o.m32797g(freeShippingText2, "freeShippingText");
                ((TextView) sVar3.f26763a.findViewById(R.id.free_shipping)).setText(freeShippingText2);
                C12007s sVar4 = this.f26581y;
                if (this.f26580x.f26586c) {
                    View findViewById = sVar4.f26763a.findViewById(R.id.free_shipping);
                    C19383o.m32796f(findViewById, "itemView.findViewById<Te…View>(R.id.free_shipping)");
                    TextView textView2 = (TextView) findViewById;
                    C13351b.m21018b(textView2, R.style.clg_badge_price_modifier);
                    new TextViewStyleApplier(textView2).mo14737a(new C7955e(R.style.clg_badge_price_modifier));
                } else {
                    sVar4.getClass();
                }
                if (this.f26580x.f26587d) {
                    ((TextView) this.f26581y.f26763a.findViewById(R.id.listing_price)).setText(signalNudgeValues3.getNewListingPrice());
                    C12007s sVar5 = this.f26581y;
                    String priceText = signalNudgeValues3.getPriceText();
                    sVar5.getClass();
                    C19383o.m32797g(priceText, "priceText");
                    ((TextView) sVar5.f26763a.findViewById(R.id.price_pill)).setText(priceText);
                    this.f26581y.mo38885i(signalNudgeValues3.getPriceContentDescription() + ' ' + signalNudgeValues3.getSaleContentDescription());
                } else {
                    this.f26581y.f26763a.findViewById(R.id.sale).setVisibility(SignalNudgeListingCardUiModel.saleVisibility$default(signalNudgeValues3, 0, 1, (Object) null));
                    ((TextView) this.f26581y.f26763a.findViewById(R.id.sale)).setText(signalNudgeValues3.getSaleText());
                    C12007s sVar6 = this.f26581y;
                    String saleContentDescription = signalNudgeValues3.getSaleContentDescription();
                    sVar6.getClass();
                    C19383o.m32797g(saleContentDescription, "contentDescription");
                    sVar6.f26763a.findViewById(R.id.sale).setContentDescription(saleContentDescription);
                    this.f26581y.mo38887k(signalNudgeValues3.getPriceText());
                    this.f26581y.mo38885i(signalNudgeValues3.getPriceContentDescription());
                }
                if (this.f26580x.mo38811y()) {
                    if (signalNudgeValues3.getPopularNowEligible() && this.f26580x.mo38808v()) {
                        C12007s sVar7 = this.f26581y;
                        int badgeVisibility = signalNudgeValues3.getBadgeVisibility();
                        Resources resources = this.itemView.getResources();
                        C19383o.m32796f(resources, "itemView.resources");
                        String popularNowText = signalNudgeValues3.popularNowText(resources);
                        sVar7.getClass();
                        C19383o.m32797g(popularNowText, "popularNowText");
                        TextView textView3 = (TextView) sVar7.f26763a.findViewById(R.id.bestseller);
                        if (textView3 != null) {
                            textView3.setVisibility(badgeVisibility);
                            textView3.setText(popularNowText);
                        }
                    } else if (signalNudgeValues3.getBestSellerEligible()) {
                        ((TextView) this.f26581y.f26763a.findViewById(R.id.bestseller)).setVisibility(signalNudgeValues3.getBadgeVisibility());
                    } else {
                        TextView textView4 = (TextView) this.f26581y.f26763a.findViewById(R.id.bestseller);
                        if (textView4 != null) {
                            ViewExtensions.m12860d(textView4);
                        }
                    }
                    boolean z2 = signalNudgeValues3.getMoreColorsVisibility() == 0;
                    C12007s sVar8 = this.f26581y;
                    sVar8.f26763a.findViewById(R.id.signal_info).setVisibility(z2 ? 0 : 8);
                    if (z2) {
                        ((TextView) sVar8.f26763a.findViewById(R.id.signal_info)).setText(sVar8.f26763a.getResources().getText(R.string.listing_more_colors_badge));
                    }
                    this.f26581y.f26763a.findViewById(R.id.only_n_left).setVisibility(signalNudgeValues3.getOnlyNLeftVisibility());
                    C12007s sVar9 = this.f26581y;
                    Resources resources2 = this.itemView.getResources();
                    C19383o.m32796f(resources2, "itemView.resources");
                    String onlyNLeftText = signalNudgeValues3.onlyNLeftText(resources2);
                    sVar9.getClass();
                    C19383o.m32797g(onlyNLeftText, "onlyNLeftText");
                    ((TextView) sVar9.f26763a.findViewById(R.id.only_n_left)).setText(onlyNLeftText);
                }
                if (this.f26581y.f26763a.findViewById(R.id.signal_info).getVisibility() == 8) {
                    this.f26581y.mo38883g(listingCardUiModel.isDownload() && this.f26580x.mo38801o());
                }
                if (!signalNudgeValues3.getBuyerFulfillmentPromiseEligible() || !this.f26580x.mo38788b()) {
                    this.f26581y.f26763a.findViewById(R.id.buyer_fulfillment_promise).setVisibility(8);
                } else {
                    this.f26581y.f26763a.findViewById(R.id.buyer_fulfillment_promise).setVisibility(0);
                    C12007s sVar10 = this.f26581y;
                    String freeShippingText3 = signalNudgeValues3.getFreeShippingText();
                    sVar10.getClass();
                    C19383o.m32797g(freeShippingText3, "text");
                    ((TextView) sVar10.f26763a.findViewById(R.id.buyer_fulfillment_promise)).setText(freeShippingText3);
                }
                if (signalNudgeValues3.getInNCartsEligible() && this.f26580x.mo38795i()) {
                    this.f26581y.mo38882f(0);
                    C12007s sVar11 = this.f26581y;
                    Resources resources3 = this.itemView.getResources();
                    C19383o.m32796f(resources3, "itemView.resources");
                    String inNCartsText = signalNudgeValues3.inNCartsText(resources3);
                    sVar11.getClass();
                    C19383o.m32797g(inNCartsText, "comboNudgeText");
                    ((TextView) sVar11.f26763a.findViewById(R.id.combo_nudge)).setText(inNCartsText);
                    this.f26581y.mo38881e(this.f26580x.mo38789c());
                    if (this.f26581y.f26763a.findViewById(R.id.only_n_left).getVisibility() == 0) {
                        if ((this.f26581y.f26763a.findViewById(R.id.combo_nudge).getVisibility() == 0) && C19383o.m32792b(this.f26581y.f26763a.getResources().getConfiguration().locale, Locale.GERMANY)) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.f26581y.f26763a.findViewById(R.id.only_n_left).setVisibility(8);
                    }
                } else if (!SignalNudgeListingCardUiModel.saleEndingEligible$default(signalNudgeValues3, 0, 1, (Object) null) || !this.f26580x.mo38798l()) {
                    this.f26581y.mo38882f(8);
                } else {
                    this.f26581y.mo38882f(0);
                    C12007s sVar12 = this.f26581y;
                    Resources resources4 = this.itemView.getResources();
                    C19383o.m32796f(resources4, "itemView.resources");
                    String saleEndingText$default = SignalNudgeListingCardUiModel.saleEndingText$default(signalNudgeValues3, resources4, 0, 2, (Object) null);
                    sVar12.getClass();
                    C19383o.m32797g(saleEndingText$default, "comboNudgeText");
                    ((TextView) sVar12.f26763a.findViewById(R.id.combo_nudge)).setText(saleEndingText$default);
                    this.f26581y.mo38881e(R.attr.clg_color_text_pricemodifier);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo38781j(ImageView imageView, ListingCardUiModel listingCardUiModel) {
        C19383o.m32797g(imageView, "menuIcon");
        if (this.f26724t == null || !this.f26580x.mo38805s()) {
            this.f26581y.f26763a.findViewById(R.id.btn_menu).setVisibility(8);
            return;
        }
        this.f26581y.f26763a.findViewById(R.id.btn_menu).setVisibility(0);
        imageView.setOnClickListener(new ListingCardViewHolder$bindMenuIcon$1(this, listingCardUiModel));
        imageView.setContentDescription(listingCardUiModel.getMenuItemContentDescription());
    }

    /* renamed from: k */
    public final TrackingOnClickListener mo38782k(ListingCard listingCard) {
        Bundle bundle = new Bundle();
        String d = this.f26580x.mo38790d();
        if (d != null) {
            bundle.putString(ResponseConstants.CONTENT_SOURCE, d);
        }
        return new ListingCardViewHolder$getOnClickListener$2(this, listingCard, bundle, new C8698l[]{listingCard});
    }

    /* renamed from: l */
    public final TrackingOnLongClickListener mo38783l(ListingCard listingCard) {
        if (this.f26724t != null) {
            return new ListingCardViewHolder$getOnLongClickListener$1(this, listingCard);
        }
        return null;
    }

    /* renamed from: m */
    public final C8987a mo38784m() {
        return (C8987a) this.f26578B.getValue();
    }

    /* renamed from: n */
    public final void mo38785n() {
        Integer e = this.f26580x.mo38791e();
        if (e != null) {
            int intValue = e.intValue();
            ViewGroup.LayoutParams layoutParams = this.f26581y.f26763a.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(intValue, intValue, intValue, intValue);
        }
    }
}
