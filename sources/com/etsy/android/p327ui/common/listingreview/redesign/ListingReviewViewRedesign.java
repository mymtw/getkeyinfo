package com.etsy.android.p327ui.common.listingreview.redesign;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.appcompat.widget.C0342q0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.p044ui.inappmessage.views.C5698d;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.ReviewVideo;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.common.listingreview.C9439a;
import com.etsy.android.p327ui.common.listingreview.C9441c;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.C9055f;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.view.CustomScrollingLayoutManager;
import com.google.android.play.core.assetpacks.C15588c1;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19543e0;
import org.apache.commons.lang3.StringEscapeUtils;
import p431qf.C13327b;
import p504ai.C13983i;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign */
public final class ListingReviewViewRedesign extends ConstraintLayout {
    public static final int $stable = 8;
    public static final String COLLAGE_ICON_CORE = "clg_icon_core_";
    public static final String COLLAGE_ICON_V1 = "_v1";
    public static final C9445a Companion = new C9445a();
    public Map<Integer, View> _$_findViewCache;
    private final CollageAlert buyerVideosAlert;
    private final TextView itemReviewTitle;
    private final TextView noReviewsMessage;
    private final RecyclerView reviewImagesCarousel;
    private final TextView reviewImagesCarouselTitle;
    private final RecyclerView reviewVideosCarousel;
    private final Group reviewVideosGroup;
    private final RecyclerView reviewsCarousel;
    private C9449c reviewsListener;
    private final TextView seeAllImagesReviewsButton;
    private final TextView seeAllReviewsButton;
    private final TextView seeAllVideosReviewsButton;
    private final TextView shopHighlightView;
    private final View shopReviewsContainer;
    private final TextView shopReviewsDescription;
    private final ShopSubratingsGraphView shopSubratingsGraphView;

    /* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$a */
    public static final class C9445a {
    }

    /* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$b */
    public static final class C9446b extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ ListingReviewViewRedesign f20940b;

        public C9446b(ListingReviewViewRedesign listingReviewViewRedesign) {
            this.f20940b = listingReviewViewRedesign;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C9449c reviewsListener = this.f20940b.getReviewsListener();
            if (reviewsListener != null) {
                reviewsListener.mo31930b();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_listing_review_redesign_q3_2021, this, true);
        View findViewById = findViewById(R.id.listing_reviews_shop_subratings_graph);
        C19383o.m32796f(findViewById, "findViewById(R.id.listin…ws_shop_subratings_graph)");
        this.shopSubratingsGraphView = (ShopSubratingsGraphView) findViewById;
        View findViewById2 = findViewById(R.id.listing_review_images_carousel);
        C19383o.m32796f(findViewById2, "findViewById(R.id.listing_review_images_carousel)");
        this.reviewImagesCarousel = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.listing_reviews_images_see_all_reviews);
        C19383o.m32796f(findViewById3, "findViewById(R.id.listin…s_images_see_all_reviews)");
        this.seeAllImagesReviewsButton = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.listing_reviews_images_review_title);
        C19383o.m32796f(findViewById4, "findViewById(R.id.listin…iews_images_review_title)");
        this.reviewImagesCarouselTitle = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.listing_review_videos_carousel);
        C19383o.m32796f(findViewById5, "findViewById(R.id.listing_review_videos_carousel)");
        this.reviewVideosCarousel = (RecyclerView) findViewById5;
        View findViewById6 = findViewById(R.id.listing_reviews_videos_see_all_reviews);
        C19383o.m32796f(findViewById6, "findViewById(R.id.listin…s_videos_see_all_reviews)");
        this.seeAllVideosReviewsButton = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.listing_review_video_group);
        C19383o.m32796f(findViewById7, "findViewById(R.id.listing_review_video_group)");
        this.reviewVideosGroup = (Group) findViewById7;
        View findViewById8 = findViewById(R.id.listing_reviews_carousel);
        C19383o.m32796f(findViewById8, "findViewById(R.id.listing_reviews_carousel)");
        this.reviewsCarousel = (RecyclerView) findViewById8;
        View findViewById9 = findViewById(R.id.listing_reviews_item_review_title);
        C19383o.m32796f(findViewById9, "findViewById(R.id.listin…eviews_item_review_title)");
        this.itemReviewTitle = (TextView) findViewById9;
        View findViewById10 = findViewById(R.id.listing_reviews_see_all_reviews);
        C19383o.m32796f(findViewById10, "findViewById(R.id.listing_reviews_see_all_reviews)");
        this.seeAllReviewsButton = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.listing_reviews_no_reviews_message);
        C19383o.m32796f(findViewById11, "findViewById(R.id.listin…views_no_reviews_message)");
        this.noReviewsMessage = (TextView) findViewById11;
        View findViewById12 = findViewById(R.id.listing_reviews_shop_highlight);
        C19383o.m32796f(findViewById12, "findViewById(R.id.listing_reviews_shop_highlight)");
        this.shopHighlightView = (TextView) findViewById12;
        View findViewById13 = findViewById(R.id.listing_reviews_see_shop_reviews_container);
        C19383o.m32796f(findViewById13, "findViewById(R.id.listin…e_shop_reviews_container)");
        this.shopReviewsContainer = findViewById13;
        View findViewById14 = findViewById(R.id.listing_reviews_shop_reviews_description);
        C19383o.m32796f(findViewById14, "findViewById(R.id.listin…shop_reviews_description)");
        this.shopReviewsDescription = (TextView) findViewById14;
        View findViewById15 = findViewById(R.id.listing_video_reviews_alert);
        C19383o.m32796f(findViewById15, "findViewById(R.id.listing_video_reviews_alert)");
        this.buyerVideosAlert = (CollageAlert) findViewById15;
    }

    private final Integer getShopHighlightIcon(String str, C11786n nVar) {
        if (!C18263b.m30839d0(str)) {
            return null;
        }
        int b = nVar.mo38058b(COLLAGE_ICON_CORE + str + COLLAGE_ICON_V1);
        if (b == 0) {
            b = nVar.mo38058b(COLLAGE_ICON_CORE + str);
        }
        if (b != 0) {
            return Integer.valueOf(b);
        }
        return null;
    }

    public static /* synthetic */ void initialize$default(ListingReviewViewRedesign listingReviewViewRedesign, ShopRating shopRating, ShopHighlight shopHighlight, List list, int i, List list2, List list3, C8923u uVar, boolean z, C10156h hVar, C11786n nVar, int i2, Object obj) {
        listingReviewViewRedesign.initialize(shopRating, shopHighlight, list, i, list2, list3, uVar, (i2 & 128) != 0 ? false : z, hVar, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: initialize$lambda-0  reason: not valid java name */
    public static final void m34930initialize$lambda0(ListingReviewViewRedesign listingReviewViewRedesign, View view) {
        C19383o.m32797g(listingReviewViewRedesign, "this$0");
        C9449c cVar = listingReviewViewRedesign.reviewsListener;
        if (cVar != null) {
            cVar.mo31935g();
        }
    }

    /* access modifiers changed from: private */
    public final List<ReviewUiModel> mapToUiModel(List<ReviewVideo> list) {
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (ReviewVideo reviewVideo : list) {
            C19383o.m32797g(reviewVideo, "<this>");
            String buyerName = reviewVideo.getBuyerName();
            String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(reviewVideo.getReview());
            Long createDate = reviewVideo.getCreateDate();
            Date date = new Date((createDate != null ? createDate.longValue() : 0) * 1000);
            Float rating = reviewVideo.getRating();
            Long transactionId = reviewVideo.getTransactionId();
            Long listingId = reviewVideo.getListingId();
            String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(reviewVideo.getTranslatedReview());
            MachineTranslationViewState machineTranslationViewState = r3;
            MachineTranslationViewState machineTranslationViewState2 = new MachineTranslationViewState(reviewVideo.getTranslatedReview());
            arrayList.add(new ReviewUiModel((Long) null, buyerName, (String) null, (String) null, date, rating, unescapeHtml4, unescapeHtml42, machineTranslationViewState, (String) null, false, (AppreciationPhoto) null, reviewVideo.getVideo(), transactionId, listingId, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void onReviewCarouseVideoClicked(int i, List<ReviewUiModel> list) {
        C9449c cVar = this.reviewsListener;
        if (cVar != null) {
            cVar.mo31932d(i, list);
        }
    }

    public static /* synthetic */ void onReviewCarouseVideoClicked$default(ListingReviewViewRedesign listingReviewViewRedesign, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        listingReviewViewRedesign.onReviewCarouseVideoClicked(i, list);
    }

    /* access modifiers changed from: private */
    public final void onReviewCarouselImageClicked(int i) {
        C9449c cVar = this.reviewsListener;
        if (cVar != null) {
            cVar.mo31936h(i, Reviews.ReviewType.LISTING);
        }
    }

    /* access modifiers changed from: private */
    public final void onReviewClicked(ReviewUiModel reviewUiModel) {
        C9449c cVar = this.reviewsListener;
        if (cVar != null) {
            cVar.mo31929a(reviewUiModel);
        }
    }

    private final void setReviewImages(List<ReviewImage> list, int i, boolean z) {
        C9439a aVar = new C9439a(new ListingReviewViewRedesign$setReviewImages$adapter$1(this));
        C19383o.m32797g(list, "reviewImages");
        aVar.f20933d.clear();
        aVar.f20933d.addAll(list);
        RecyclerView recyclerView = this.reviewImagesCarousel;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.reviewImagesCarousel.setAdapter(aVar);
        ViewExtensions.m12869m(this.reviewImagesCarousel);
        if (z) {
            ViewExtensions.m12869m(this.reviewImagesCarouselTitle);
        } else {
            ViewExtensions.m12860d(this.reviewImagesCarouselTitle);
        }
        if (list.size() <= i || !z) {
            ViewExtensions.m12860d(this.seeAllImagesReviewsButton);
            return;
        }
        ViewExtensions.m12869m(this.seeAllImagesReviewsButton);
        ViewExtensions.m12866j(this.seeAllImagesReviewsButton, new ListingReviewViewRedesign$setReviewImages$1(this));
    }

    private final void setReviewVideos(List<ReviewVideo> list, int i) {
        C9441c cVar = new C9441c(new ListingReviewViewRedesign$setReviewVideos$adapterVideo$1(this, list));
        C19383o.m32797g(list, "reviewVideos");
        cVar.f20937c.clear();
        cVar.f20937c.addAll(list);
        RecyclerView recyclerView = this.reviewVideosCarousel;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.reviewVideosCarousel.setAdapter(cVar);
        ViewExtensions.m12869m(this.reviewVideosGroup);
        this.reviewVideosCarousel.addOnScrollListener(new C9446b(this));
        if (list.size() > i) {
            ViewExtensions.m12869m(this.seeAllVideosReviewsButton);
            ViewExtensions.m12866j(this.seeAllVideosReviewsButton, new ListingReviewViewRedesign$setReviewVideos$2(this));
            return;
        }
        ViewExtensions.m12860d(this.seeAllVideosReviewsButton);
    }

    private final void setReviews(List<ReviewUiModel> list, int i, ShopRating shopRating, ShopHighlight shopHighlight, C8923u uVar, C11786n nVar) {
        ShopRating shopRating2 = shopRating;
        ShopHighlight shopHighlight2 = shopHighlight;
        C11786n nVar2 = nVar;
        if (list == null || !(!list.isEmpty())) {
            ViewExtensions.m12860d(this.reviewsCarousel);
            ViewExtensions.m12860d(this.itemReviewTitle);
            ViewExtensions.m12860d(this.seeAllReviewsButton);
            ViewExtensions.m12869m(this.noReviewsMessage);
            showShopHighlight(shopHighlight, nVar2);
            showShopBubble(shopRating);
            return;
        }
        if (list.size() == i) {
            ViewExtensions.m12860d(this.seeAllReviewsButton);
            showShopHighlight(shopHighlight, nVar2);
            showShopBubble(shopRating);
        } else {
            ViewExtensions.m12869m(this.seeAllReviewsButton);
            ViewExtensions.m12866j(this.seeAllReviewsButton, new ListingReviewViewRedesign$setReviews$1(this));
            ViewExtensions.m12860d(this.shopHighlightView);
            ViewExtensions.m12860d(this.shopReviewsContainer);
        }
        Resources resources = getContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.clg_space_4);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.clg_space_16);
        C13327b bVar = new C13327b(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2);
        C8914m mVar = new C8914m(getContext());
        int min = Math.min(list.size() - 1, 7);
        DisplayMetrics displayMetrics = mVar.f19670a;
        int min2 = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) * min;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        CustomScrollingLayoutManager customScrollingLayoutManager = new CustomScrollingLayoutManager(min2, context);
        C9448b bVar2 = new C9448b(list, mVar, uVar, new ListingReviewViewRedesign$setReviews$adapter$1(this), new ListingReviewViewRedesign$setReviews$adapter$2(this, list), new ListingReviewViewRedesign$setReviews$adapter$3(this));
        this.reviewsCarousel.addItemDecoration(bVar);
        this.reviewsCarousel.setAdapter(bVar2);
        this.reviewsCarousel.setLayoutManager(customScrollingLayoutManager);
        ViewExtensions.m12869m(this.reviewsCarousel);
    }

    private final void showBuyerVideosAlert() {
        ViewExtensions.m12869m(this.buyerVideosAlert);
        this.buyerVideosAlert.setDismissButtonClickListener(new C9055f(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: showBuyerVideosAlert$lambda-2  reason: not valid java name */
    public static final void m34931showBuyerVideosAlert$lambda2(ListingReviewViewRedesign listingReviewViewRedesign, View view) {
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withEndAction;
        C19383o.m32797g(listingReviewViewRedesign, "this$0");
        ViewPropertyAnimator animate = listingReviewViewRedesign.buyerVideosAlert.animate();
        if (animate != null && (duration = animate.setDuration(500)) != null && (alpha = duration.alpha(0.0f)) != null && (withEndAction = alpha.withEndAction(new C0342q0(listingReviewViewRedesign, 3))) != null) {
            withEndAction.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showBuyerVideosAlert$lambda-2$lambda-1  reason: not valid java name */
    public static final void m34932showBuyerVideosAlert$lambda2$lambda1(ListingReviewViewRedesign listingReviewViewRedesign) {
        C19383o.m32797g(listingReviewViewRedesign, "this$0");
        ViewExtensions.m12860d(listingReviewViewRedesign.buyerVideosAlert);
    }

    private final void showShopBubble(ShopRating shopRating) {
        ViewExtensions.m12869m(this.shopReviewsContainer);
        ViewExtensions.m12866j(this.shopReviewsContainer, new ListingReviewViewRedesign$showShopBubble$1(this));
        Float f = null;
        if ((shopRating != null ? shopRating.getRating() : null) != null) {
            Float rating = shopRating.getRating();
            C19383o.m32794d(rating);
            if (rating.floatValue() > 0.0f) {
                Float rating2 = shopRating.getRating();
                if (rating2 != null) {
                    f = Float.valueOf(C15588c1.m25295N0(rating2.floatValue()));
                }
                this.shopReviewsDescription.setText(getResources().getString(R.string.listing_shop_rating_description, new Object[]{String.valueOf(f), NumberFormat.getNumberInstance(Locale.getDefault()).format(shopRating.getRatingCount())}));
                return;
            }
        }
        ViewExtensions.m12860d(this.shopReviewsContainer);
    }

    private final void showShopHighlight(ShopHighlight shopHighlight, C11786n nVar) {
        if (shopHighlight == null) {
            ViewExtensions.m12860d(this.shopHighlightView);
            return;
        }
        ViewExtensions.m12869m(this.shopHighlightView);
        this.shopHighlightView.setText(C18263b.m30867s0(shopHighlight.getText()));
        Integer shopHighlightIcon = getShopHighlightIcon(shopHighlight.getIconRaw(), nVar);
        if (shopHighlightIcon != null) {
            this.shopHighlightView.setCompoundDrawablesRelativeWithIntrinsicBounds(shopHighlightIcon.intValue(), 0, 0, 0);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C9449c getReviewsListener() {
        return this.reviewsListener;
    }

    public final void initialize(ShopRating shopRating, ShopHighlight shopHighlight, List<ReviewUiModel> list, int i, List<ReviewImage> list2, List<ReviewVideo> list3, C8923u uVar, boolean z, C10156h hVar, C11786n nVar) {
        ShopRating shopRating2 = shopRating;
        List<ReviewImage> list4 = list2;
        List<ReviewVideo> list5 = list3;
        C10156h hVar2 = hVar;
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(hVar2, "listingViewEligibility");
        C19383o.m32797g(nVar, "resourceProvider");
        int i2 = 0;
        boolean z2 = true;
        if ((shopRating2 != null ? shopRating.getRating() : null) != null) {
            this.shopSubratingsGraphView.setData(shopRating);
            this.shopSubratingsGraphView.setOnClickListener(new C5698d(this, 1));
            if (!(this.shopSubratingsGraphView.getVisibility() == 0) || !hVar2.f22335a.mo21132b(C8592b.C8601i.f18898l)) {
                this.shopSubratingsGraphView.setBackground((Drawable) null);
            } else {
                this.shopSubratingsGraphView.setBackgroundResource(R.drawable.clg_touch_feedback);
            }
        } else {
            ViewExtensions.m12860d(this.shopSubratingsGraphView);
            this.shopSubratingsGraphView.setOnClickListener((View.OnClickListener) null);
        }
        if (list4 == null || !(!list2.isEmpty())) {
            ViewExtensions.m12860d(this.reviewImagesCarousel);
        } else {
            setReviewImages(list4, list != null ? list.size() : 0, C19543e0.m33306Y(list3));
        }
        if (list5 != null && !list3.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            if (list != null) {
                i2 = list.size();
            }
            setReviewVideos(list5, i2);
            if (z) {
                ViewExtensions.m12860d(this.buyerVideosAlert);
            } else {
                showBuyerVideosAlert();
            }
        } else {
            ViewExtensions.m12860d(this.reviewVideosGroup);
            ViewExtensions.m12860d(this.seeAllVideosReviewsButton);
        }
        setReviews(list, i, shopRating, shopHighlight, uVar, nVar);
    }

    public final void setReviewsListener(C9449c cVar) {
        this.reviewsListener = cVar;
    }

    public final void updateReview(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "review");
        RecyclerView.Adapter adapter = this.reviewsCarousel.getAdapter();
        C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.common.listingreview.redesign.ListingReviewsAdapter");
        C9448b bVar = (C9448b) adapter;
        Iterator<ReviewUiModel> it = bVar.f20946b.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C19383o.m32792b(it.next().getTransactionId(), reviewUiModel.getTransactionId())) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            List<ReviewUiModel> list = bVar.f20946b;
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
            for (T next : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    ReviewUiModel reviewUiModel2 = (ReviewUiModel) next;
                    if (i == i2) {
                        reviewUiModel2 = reviewUiModel;
                    }
                    arrayList.add(reviewUiModel2);
                    i = i3;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            bVar.f20946b = arrayList;
            bVar.notifyItemChanged(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingReviewViewRedesign(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
