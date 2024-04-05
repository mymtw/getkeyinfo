package com.etsy.android.p327ui.common.listingreview.redesign;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.lib.models.apiv3.listing.extensions.AppreciationPhotoExtensionsKt;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.view.TranslateButton;
import java.util.Date;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;
import p075d.C6614a;
import p260v0.C8184a;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ReviewViewRedesign */
public final class ReviewViewRedesign extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private boolean showFullReview;
    private C19857l<? super ReviewUiModel, C19394m> translationClickListener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewViewRedesign(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewViewRedesign(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewRedesign(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_review_redesign, this, true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clg_elevation_16);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void hideNumericRating() {
        TextView textView = (TextView) findViewById(R.id.video_review_numeric_rating);
        if (textView != null) {
            ViewExtensions.m12860d(textView);
        }
        ImageView imageView = (ImageView) findViewById(R.id.video_review_numeric_rating_star);
        if (imageView != null) {
            ViewExtensions.m12860d(imageView);
        }
    }

    private final void setAppreciationPhoto(ReviewUiModel reviewUiModel, C19857l<? super ReviewUiModel, C19394m> lVar) {
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.feedback_appreciation_photo_size_smaller);
        AppreciationPhoto appreciationPhoto = reviewUiModel.getAppreciationPhoto();
        String imageUrlForPixelWidth = appreciationPhoto != null ? AppreciationPhotoExtensionsKt.getImageUrlForPixelWidth(appreciationPhoto, dimensionPixelSize) : null;
        ImageView imageView = (ImageView) findViewById(R.id.listing_review_photo);
        ((C5959e) Glide.with(getContext()).load(imageUrlForPixelWidth).mo17139B(new C6105w(resources.getDimensionPixelSize(R.dimen.clg_space_4)))).mo16816M(imageView);
        imageView.setContentDescription(resources.getString(R.string.listing_review_appreciation_photo_content_description, new Object[]{reviewUiModel.getListingTitle(), reviewUiModel.getBuyerDisplayName()}));
        ViewExtensions.m12869m(imageView);
        if (lVar != null) {
            imageView.setClickable(true);
            Context context = getContext();
            Object obj = C8184a.f17966a;
            imageView.setForeground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
            ViewExtensions.m12866j(imageView, new ReviewViewRedesign$setAppreciationPhoto$1(lVar, reviewUiModel));
            return;
        }
        imageView.setClickable(false);
        imageView.setForeground((Drawable) null);
    }

    public static /* synthetic */ void setAppreciationPhoto$default(ReviewViewRedesign reviewViewRedesign, ReviewUiModel reviewUiModel, C19857l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        reviewViewRedesign.setAppreciationPhoto(reviewUiModel, lVar);
    }

    private final void setAppreciationVideo(ReviewUiModel reviewUiModel, C19857l<? super ReviewUiModel, C19394m> lVar) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.listing_review_video_thumbnail);
        if (frameLayout != null) {
            ViewExtensions.m12869m(frameLayout);
            int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
            Drawable a = C6614a.m12981a(frameLayout.getContext(), R.drawable.video_review_thumbnail_skeleton);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.video_thumbnail_compact);
            RequestManager with = Glide.with(frameLayout.getContext());
            Video appreciationVideo = reviewUiModel.getAppreciationVideo();
            ((C5959e) ((C5959e) ((C5959e) with.load(appreciationVideo != null ? appreciationVideo.getUrl() : null).mo17160t(a)).mo17152j(a)).mo17143F(new C6085i(), new C6105w(dimensionPixelSize))).mo16816M(imageView);
            if (lVar != null) {
                frameLayout.setClickable(true);
                ViewExtensions.m12866j(frameLayout, new ReviewViewRedesign$setAppreciationVideo$1$1(lVar, reviewUiModel));
                return;
            }
            frameLayout.setClickable(false);
        }
    }

    public static /* synthetic */ void setData$default(ReviewViewRedesign reviewViewRedesign, ReviewUiModel reviewUiModel, boolean z, C19857l lVar, C19857l lVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = null;
        }
        reviewViewRedesign.setData(reviewUiModel, z, lVar, lVar2);
    }

    private final void setReviewDate(Date date) {
        TextView textView = (TextView) findViewById(R.id.listing_review_date);
        if (date != null) {
            textView.setText(C8885d0.m17321e(date));
        }
    }

    private final void setReviewRating(Float f) {
        ((CollageRatingView) findViewById(R.id.listing_review_star_rating)).setRating(f != null ? f.floatValue() : 0.0f);
    }

    /* access modifiers changed from: private */
    public final void setReviewText(String str, String str2, MachineTranslationViewState machineTranslationViewState, boolean z) {
        String str3;
        TextView textView = (TextView) findViewById(R.id.listing_review_text);
        TransitionManager.beginDelayedTransition(this);
        if (C18263b.m30839d0(str)) {
            boolean z2 = false;
            if (!machineTranslationViewState.getShouldShowTranslation() || !machineTranslationViewState.isTranslated()) {
                if (str != null && C18263b.m30810E(str)) {
                    z2 = true;
                }
                str3 = z2 ? C18263b.m30867s0(str).toString() : StringEscapeUtils.unescapeHtml4(str);
            } else {
                if (str2 != null && C18263b.m30810E(str2)) {
                    z2 = true;
                }
                str3 = z2 ? C18263b.m30867s0(str2).toString() : StringEscapeUtils.unescapeHtml4(str2);
            }
            textView.setText(str3);
            if (!this.showFullReview) {
                textView.setMaxLines(z ? 4 : 8);
            }
            ViewExtensions.m12869m(textView);
            return;
        }
        textView.setText("");
        ViewExtensions.m12860d(textView);
    }

    public static /* synthetic */ void setReviewText$default(ReviewViewRedesign reviewViewRedesign, String str, String str2, MachineTranslationViewState machineTranslationViewState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        reviewViewRedesign.setReviewText(str, str2, machineTranslationViewState, z);
    }

    private final void setTranslationButton(ReviewUiModel reviewUiModel, boolean z) {
        TranslateButton translateButton = (TranslateButton) findViewById(R.id.listing_review_translate_button);
        if (z) {
            MachineTranslationViewState translationState = reviewUiModel.getTranslationState();
            translateButton.configureForState(translationState);
            translateButton.setOnTranslateClickListener(new ReviewViewRedesign$setTranslationButton$1(translationState, translateButton, this, reviewUiModel, new C8698l[0]));
            ViewExtensions.m12869m(translateButton);
            return;
        }
        ViewExtensions.m12860d(translateButton);
    }

    private final void setUserDisplayName(String str) {
        TextView textView = (TextView) findViewById(R.id.listing_review_username);
        if (C8885d0.m17323g(str)) {
            textView.setText(str);
        } else {
            textView.setText(getContext().getResources().getString(R.string.review_reviewer_name_anonymous));
        }
    }

    private final void showNumericRating(String str) {
        TextView textView = (TextView) findViewById(R.id.video_review_numeric_rating);
        if (textView != null) {
            ViewExtensions.m12869m(textView);
            textView.setText(str);
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

    public final boolean getShowFullReview() {
        return this.showFullReview;
    }

    public final C19857l<ReviewUiModel, C19394m> getTranslationClickListener() {
        return this.translationClickListener;
    }

    public final void hideAppreciationVideo() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.listing_review_video_thumbnail);
        if (frameLayout != null) {
            ViewExtensions.m12860d(frameLayout);
        }
    }

    public final void setData(ReviewUiModel reviewUiModel, boolean z, C19857l<? super ReviewUiModel, C19394m> lVar, C19857l<? super ReviewUiModel, C19394m> lVar2) {
        C19383o.m32797g(reviewUiModel, "review");
        setUserDisplayName(reviewUiModel.getBuyerDisplayName());
        setReviewDate(reviewUiModel.getCreatedDate());
        setReviewRating(reviewUiModel.getRating());
        setTranslationButton(reviewUiModel, z);
        if (reviewUiModel.getShowAppreciationPhoto()) {
            ViewExtensions.m12869m(findViewById(R.id.listing_review_photo));
            setAppreciationPhoto(reviewUiModel, lVar);
        } else {
            ViewExtensions.m12860d(findViewById(R.id.listing_review_photo));
        }
        if (reviewUiModel.getAppreciationVideo() != null) {
            setAppreciationVideo(reviewUiModel, lVar2);
        } else {
            hideAppreciationVideo();
        }
        setReviewText(reviewUiModel.getReview(), reviewUiModel.getTranslatedReview(), reviewUiModel.getTranslationState(), reviewUiModel.getShowAppreciationPhoto());
    }

    public final void setShowFullReview(boolean z) {
        this.showFullReview = z;
    }

    public final void setTranslationClickListener(C19857l<? super ReviewUiModel, C19394m> lVar) {
        this.translationClickListener = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewViewRedesign(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
