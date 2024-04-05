package com.etsy.android.p327ui.common.listingreview.itemview;

import android.content.Context;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.C2273a;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.extensions.AppreciationPhotoExtensionsKt;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.view.TranslateButton;
import java.util.Date;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;
import p088e1.C6689b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView */
public final class ListingReviewItemView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C9444a listener;
    /* access modifiers changed from: private */
    public CollageRatingView ratingView;
    /* access modifiers changed from: private */
    public ImageView reviewAppreciationPhoto;
    /* access modifiers changed from: private */
    public TextView reviewTextBottom;
    /* access modifiers changed from: private */
    public TextView reviewTextTop;
    private C19846a<C19394m> textWrappingRunnable;

    /* renamed from: com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$a */
    public static final class C9443a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f20939a;

        public C9443a(CharSequence charSequence) {
            this.f20939a = charSequence;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            if (bVar != null) {
                bVar.mo18874w(this.f20939a);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_listing_review_item_redesign, this, true);
        setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.clg_space_16), getResources().getDimensionPixelSize(R.dimen.clg_space_16), getResources().getDimensionPixelSize(R.dimen.clg_space_16), getResources().getDimensionPixelSize(R.dimen.clg_space_16));
        setClipToPadding(false);
        setClipChildren(false);
        this.reviewTextTop = (TextView) findViewById(R.id.wrap_review_text_top);
        this.reviewTextBottom = (TextView) findViewById(R.id.wrap_review_text_bottom);
        this.reviewAppreciationPhoto = (ImageView) findViewById(R.id.review_appreciation_photo);
        this.ratingView = (CollageRatingView) findViewById(R.id.review_rating);
    }

    private final void bindAppreciationPhoto(ReviewUiModel reviewUiModel) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.feedback_appreciation_photo_size);
        AppreciationPhoto appreciationPhoto = reviewUiModel.getAppreciationPhoto();
        String imageUrlForPixelWidth = appreciationPhoto != null ? AppreciationPhotoExtensionsKt.getImageUrlForPixelWidth(appreciationPhoto, dimensionPixelSize) : null;
        ImageView imageView = (ImageView) findViewById(R.id.review_appreciation_photo);
        ((C5959e) Glide.with(getContext()).load(imageUrlForPixelWidth).mo17139B(new C6105w(getResources().getDimensionPixelSize(R.dimen.clg_space_4)))).mo16816M(imageView);
        imageView.setContentDescription(getResources().getString(R.string.listing_review_appreciation_photo_content_description, new Object[]{reviewUiModel.getListingTitle(), reviewUiModel.getBuyerDisplayName()}));
        ViewExtensions.m12866j(imageView, new ListingReviewItemView$bindAppreciationPhoto$1(this, reviewUiModel));
        ViewExtensions.m12869m(imageView);
    }

    private final void bindMachineTranslationButton(ReviewUiModel reviewUiModel) {
        ((TranslateButton) _$_findCachedViewById(R.id.review_translation_view)).configureForState(reviewUiModel.getTranslationState());
        ((TranslateButton) _$_findCachedViewById(R.id.review_translation_view)).setOnTranslateClickListener(new ListingReviewItemView$bindMachineTranslationButton$1(reviewUiModel, this, new C8698l[0]));
        ViewExtensions.m12869m((TranslateButton) _$_findCachedViewById(R.id.review_translation_view));
    }

    private final void bindPurchasedItem(Long l, String str) {
        bindShopReviewListingImage(l, str);
    }

    public static /* synthetic */ void bindReview$default(ListingReviewItemView listingReviewItemView, ReviewUiModel reviewUiModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        listingReviewItemView.bindReview(reviewUiModel, z, z2);
    }

    private final void bindReviewAvatar(String str) {
        Glide.with(getContext()).load(str).mo16829a(C6128g.m12232J()).mo16816M((ImageView) findViewById(R.id.reviewer_avatar));
    }

    private final void bindReviewDate(Date date) {
        if (date != null) {
            ((TextView) findViewById(R.id.review_date)).setText(C8885d0.m17321e(date));
        }
    }

    private final void bindReviewRating(Float f) {
        ((CollageRatingView) findViewById(R.id.review_rating)).setRating(f != null ? f.floatValue() : 0.0f);
        ViewExtensions.m12869m(findViewById(R.id.review_rating));
    }

    private final void bindReviewText(String str, String str2, MachineTranslationViewState machineTranslationViewState) {
        String str3;
        TransitionManager.beginDelayedTransition(this);
        String str4 = "";
        if (C18263b.m30839d0(str)) {
            ViewExtensions.m12869m(this.reviewTextTop);
            TextView textView = this.reviewTextTop;
            if (textView != null) {
                textView.setText(str4);
            }
            ViewExtensions.m12860d(this.reviewTextBottom);
            TextView textView2 = this.reviewTextBottom;
            if (textView2 != null) {
                textView2.setText(str4);
            }
            if (!machineTranslationViewState.getShouldShowTranslation() || !machineTranslationViewState.isTranslated() ? (str3 = StringEscapeUtils.unescapeHtml4(str)) != null : (str3 = StringEscapeUtils.unescapeHtml4(str2)) != null) {
                str4 = str3;
            }
            this.textWrappingRunnable = new ListingReviewItemView$bindReviewText$1(this, str4);
            return;
        }
        TextView textView3 = this.reviewTextTop;
        if (textView3 != null) {
            textView3.setText(str4);
        }
        ViewExtensions.m12860d(this.reviewTextTop);
        TextView textView4 = this.reviewTextBottom;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        ViewExtensions.m12860d(this.reviewTextBottom);
    }

    public static /* synthetic */ void bindReviewText$default(ListingReviewItemView listingReviewItemView, String str, String str2, MachineTranslationViewState machineTranslationViewState, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        listingReviewItemView.bindReviewText(str, str2, machineTranslationViewState);
    }

    private final void bindSellerResponse(String str, String str2, String str3, Date date) {
        C19394m mVar;
        if (C18263b.m30839d0(str3)) {
            ViewExtensions.m12869m((Group) _$_findCachedViewById(R.id.seller_response_items_group));
            ImageView imageView = (ImageView) findViewById(R.id.seller_avatar);
            if (C18263b.m30839d0(str2)) {
                Glide.with(getContext()).load(str2).mo16829a(C6128g.m12232J()).mo16816M(imageView);
            } else {
                ViewExtensions.m12863g(imageView);
            }
            TextView textView = (TextView) findViewById(R.id.seller_name);
            if (str != null) {
                textView.setText(getContext().getString(R.string.listing_review_seller_response, new Object[]{str}));
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(textView);
            }
            ((TextView) findViewById(R.id.seller_response_text)).setText(str3);
            if (date != null) {
                ((TextView) findViewById(R.id.seller_response_date)).setText(C8885d0.m17321e(date));
            } else {
                ViewExtensions.m12860d(findViewById(R.id.seller_response_date));
            }
        } else {
            ViewExtensions.m12860d((Group) _$_findCachedViewById(R.id.seller_response_items_group));
        }
    }

    public static /* synthetic */ void bindShopReview$default(ListingReviewItemView listingReviewItemView, ReviewUiModel reviewUiModel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        listingReviewItemView.bindShopReview(reviewUiModel, z);
    }

    private final void bindShopReviewListingDescription(Long l, String str) {
        String str2;
        if (l != null) {
            TextView textView = (TextView) findViewById(R.id.review_listing_description);
            ViewExtensions.m12869m(textView);
            C19383o.m32796f(textView, "descriptionView");
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            TextView textView2 = (TextView) findViewById(R.id.review_listing_description);
            if (str == null || (str2 = StringEscapeUtils.unescapeHtml4(str)) == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
    }

    private final void bindShopReviewListingImage(Long l, String str) {
        if (l != null) {
            ViewExtensions.m12869m(findViewById(R.id.review_listing_image));
            Glide.with(getContext()).load(str).mo16816M((ImageView) findViewById(R.id.review_listing_image));
        }
    }

    /* access modifiers changed from: private */
    public final void bindTranslatedReview(String str, String str2, MachineTranslationViewState machineTranslationViewState) {
        ((TranslateButton) _$_findCachedViewById(R.id.review_translation_view)).configureForState(machineTranslationViewState);
        bindReviewText(str, str2, machineTranslationViewState);
    }

    private final void bindUserDisplayName(String str) {
        if (C8885d0.m17323g(str)) {
            ((CollageHeadingTextView) findViewById(R.id.review_name)).setText(str);
        } else {
            ((CollageHeadingTextView) findViewById(R.id.review_name)).setText(getResources().getString(R.string.review_reviewer_name_anonymous));
        }
    }

    private final void clearAppreciationPhoto() {
        ViewExtensions.m12860d(findViewById(R.id.review_appreciation_photo));
    }

    private final void clearMachineTranslationButton() {
        ViewExtensions.m12860d((TranslateButton) _$_findCachedViewById(R.id.review_translation_view));
    }

    private final void clearPurchasedItem() {
        ViewExtensions.m12860d(findViewById(R.id.review_listing_image));
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.view.ViewGroup$LayoutParams] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void wrapText(java.lang.CharSequence r17, android.view.View r18, android.widget.ImageView r19, android.widget.TextView r20, android.widget.TextView r21) {
        /*
            r16 = this;
            r8 = r17
            r9 = r20
            r10 = r21
            r0 = 0
            androidx.core.view.C2364y.m5201p(r9, r0)
            r11 = 0
            r10.setImportantForAccessibility(r11)
            com.etsy.android.extensions.ViewExtensions.m12869m(r20)
            com.etsy.android.extensions.ViewExtensions.m12869m(r21)
            int r1 = r19.getVisibility()
            r12 = 1
            if (r1 != 0) goto L_0x001d
            r1 = r12
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x002c
            r9.setText(r8)
            r10.setText(r2)
            com.etsy.android.extensions.ViewExtensions.m12860d(r21)
            return
        L_0x002c:
            int r1 = r19.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x003b
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x003c
        L_0x003b:
            r3 = r0
        L_0x003c:
            if (r3 != 0) goto L_0x0040
            r3 = r11
            goto L_0x0042
        L_0x0040:
            int r3 = r3.bottomMargin
        L_0x0042:
            int r1 = r1 + r3
            int r3 = r18.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r18.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0052
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0053
        L_0x0052:
            r4 = r0
        L_0x0053:
            if (r4 != 0) goto L_0x0057
            r4 = r11
            goto L_0x0059
        L_0x0057:
            int r4 = r4.bottomMargin
        L_0x0059:
            int r3 = r3 + r4
            int r1 = r1 - r3
            android.view.ViewGroup$LayoutParams r3 = r20.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0066
            r0 = r3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
        L_0x0066:
            if (r0 != 0) goto L_0x006a
            r0 = r11
            goto L_0x006c
        L_0x006a:
            int r0 = r0.topMargin
        L_0x006c:
            int r1 = r1 - r0
            if (r1 > 0) goto L_0x0079
            r9.setText(r2)
            com.etsy.android.extensions.ViewExtensions.m12860d(r20)
            r10.setText(r8)
            return
        L_0x0079:
            android.text.TextPaint r13 = r20.getPaint()
            int r3 = r20.getMeasuredWidth()
            float r0 = (float) r1
            int r1 = r20.getLineHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r14 = (int) r0
            if (r14 != 0) goto L_0x009b
            r9.setText(r2)
            com.etsy.android.extensions.ViewExtensions.m12860d(r20)
            r10.setText(r8)
            return
        L_0x009b:
            android.text.StaticLayout r15 = new android.text.StaticLayout
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r5 = r20.getLineSpacingMultiplier()
            float r6 = r20.getLineSpacingExtra()
            r7 = 1
            r0 = r15
            r1 = r17
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r15.getLineCount()
            if (r0 >= r14) goto L_0x00b6
            r14 = r0
        L_0x00b6:
            int r0 = r14 + -1
            int r0 = r15.getLineEnd(r0)
            java.lang.CharSequence r0 = r8.subSequence(r11, r0)
            java.lang.String r0 = r0.toString()
            int r1 = r15.getLineStart(r14)
            int r2 = r17.length()
            java.lang.CharSequence r1 = r8.subSequence(r1, r2)
            java.lang.String r1 = r1.toString()
            r9.setText(r0)
            r10.setText(r1)
            com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$a r0 = new com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$a
            r0.<init>(r8)
            androidx.core.view.C2364y.m5201p(r9, r0)
            r0 = 2
            r10.setImportantForAccessibility(r0)
            java.lang.CharSequence r0 = r21.getText()
            if (r0 == 0) goto L_0x00f4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r12 = r11
        L_0x00f4:
            if (r12 == 0) goto L_0x00fa
            com.etsy.android.extensions.ViewExtensions.m12860d(r21)
            goto L_0x0107
        L_0x00fa:
            android.graphics.Paint$FontMetrics r0 = r13.getFontMetrics()
            float r0 = r0.leading
            int r0 = p173m.C7279a.m13954l(r0)
            r10.setPadding(r11, r0, r11, r11)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.common.listingreview.itemview.ListingReviewItemView.wrapText(java.lang.CharSequence, android.view.View, android.widget.ImageView, android.widget.TextView, android.widget.TextView):void");
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

    public final void bindItemReview(ReviewUiModel reviewUiModel, boolean z) {
        C19383o.m32797g(reviewUiModel, "review");
        bindReview(reviewUiModel, false, z);
        setTag(reviewUiModel.getTransactionId());
    }

    public final void bindReview(ReviewUiModel reviewUiModel, boolean z, boolean z2) {
        C19383o.m32797g(reviewUiModel, "review");
        bindReviewAvatar(reviewUiModel.getBuyerAvatarUrl());
        bindUserDisplayName(reviewUiModel.getBuyerDisplayName());
        bindReviewDate(reviewUiModel.getCreatedDate());
        bindReviewRating(reviewUiModel.getRating());
        if (reviewUiModel.getShowAppreciationPhoto()) {
            bindAppreciationPhoto(reviewUiModel);
        } else {
            clearAppreciationPhoto();
        }
        if (z2) {
            bindMachineTranslationButton(reviewUiModel);
        } else {
            clearMachineTranslationButton();
        }
        if (z) {
            bindPurchasedItem(reviewUiModel.getTransactionId(), reviewUiModel.getListingImageUrl());
            bindShopReview(reviewUiModel);
        } else {
            clearPurchasedItem();
        }
        bindSellerResponse(reviewUiModel.getSellerDisplayName(), reviewUiModel.getSellerAvatarUrl(), reviewUiModel.getSellerResponse(), reviewUiModel.getSellerResponseDate());
        bindReviewText(reviewUiModel.getReview(), reviewUiModel.getTranslatedReview(), reviewUiModel.getTranslationState());
        setTag(reviewUiModel.getTransactionId());
    }

    public final void bindShopReview(ReviewUiModel reviewUiModel, boolean z) {
        C19383o.m32797g(reviewUiModel, "review");
        bindReview(reviewUiModel, true, z);
        setTag(reviewUiModel.getTransactionId());
    }

    public final C9444a getListener() {
        return this.listener;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C19846a<C19394m> aVar = this.textWrappingRunnable;
        if (aVar != null) {
            aVar.invoke();
            super.onMeasure(i, i2);
            this.textWrappingRunnable = null;
        }
    }

    public final void setListener(C9444a aVar) {
        this.listener = aVar;
    }

    public final void setListingReviewListener(C9444a aVar) {
        this.listener = aVar;
    }

    public final void updateTranslatedReview(String str, String str2, MachineTranslationViewState machineTranslationViewState) {
        C19383o.m32797g(machineTranslationViewState, "translationViewState");
        bindTranslatedReview(str, str2, machineTranslationViewState);
    }

    private final void bindShopReview(ReviewUiModel reviewUiModel) {
        View findViewById = findViewById(R.id.review_purchased_item_section);
        C19383o.m32796f(findViewById, "findViewById<View>(R.id.…w_purchased_item_section)");
        ViewExtensions.m12866j(findViewById, new ListingReviewItemView$bindShopReview$1(this, reviewUiModel));
        bindShopReviewListingImage(reviewUiModel.getTransactionId(), reviewUiModel.getListingImageUrl());
        bindShopReviewListingDescription(reviewUiModel.getTransactionId(), reviewUiModel.getListingTitle());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListingReviewItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
