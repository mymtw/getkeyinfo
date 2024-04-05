package com.etsy.android.p327ui.core.review;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.uikit.view.RatingIconView;
import com.etsy.android.uikit.view.TranslateButton;
import com.etsy.android.uikit.zoom.C12029a;
import com.etsy.android.uikit.zoom.C12030b;
import com.etsy.android.uikit.zoom.C12031c;
import com.etsy.android.uikit.zoom.ZoomTouchListener;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import org.apache.commons.lang3.StringEscapeUtils;
import p213q2.C7717a;
import p356ge.C12788a;
import p381kc.C12990a;
import p486y9.C13888d;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerAdapter */
public final class ListingReviewPagerAdapter extends C7717a {

    /* renamed from: d */
    public final C8703p f21478d;

    /* renamed from: e */
    public C19846a<C19394m> f21479e;

    /* renamed from: f */
    public List<ReviewImage> f21480f;

    /* renamed from: g */
    public int f21481g;

    /* renamed from: h */
    public final SimpleDateFormat f21482h;

    /* renamed from: i */
    public C12990a f21483i;

    public ListingReviewPagerAdapter(C13888d dVar, C8703p pVar) {
        C19383o.m32797g(dVar, "currentLocale");
        this.f21478d = pVar;
        this.f21482h = new SimpleDateFormat("MMM dd, yyyy", dVar.mo46718b());
    }

    /* renamed from: u */
    public static final void m18024u(ListingReviewPagerAdapter listingReviewPagerAdapter, View view, EtsyId etsyId) {
        listingReviewPagerAdapter.getClass();
        Context context = view.getContext();
        C19383o.m32795e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        C19846a<C19394m> aVar = listingReviewPagerAdapter.f21479e;
        if (aVar != null) {
            aVar.invoke();
        }
        C12788a.m20424c(fragmentActivity, new ListingKey(C19421p.m32935c0(fragmentActivity), etsyId, false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }

    /* renamed from: w */
    public static void m18025w(ReviewImage reviewImage, TranslateButton translateButton, TextView textView) {
        if (C18263b.m30839d0(reviewImage.getTranslatedReview())) {
            textView.setText(reviewImage.getTranslationState().getShouldShowTranslation() ? StringEscapeUtils.unescapeHtml4(reviewImage.getTranslatedReview()) : StringEscapeUtils.unescapeHtml4(reviewImage.getReviewText()));
            translateButton.configureForState(reviewImage.getTranslationState());
            ViewExtensions.m12869m(translateButton);
            return;
        }
        textView.setText(StringEscapeUtils.unescapeHtml4(reviewImage.getReviewText()));
        ViewExtensions.m12860d(translateButton);
    }

    /* renamed from: h */
    public final void mo10623h(ViewGroup viewGroup, int i, Object obj) {
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(obj, "view");
        View view = (View) obj;
        view.setOnTouchListener((View.OnTouchListener) null);
        viewGroup.removeView(view);
    }

    /* renamed from: j */
    public final int mo20184j() {
        List<ReviewImage> list = this.f21480f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: n */
    public final Object mo10625n(ViewGroup viewGroup, int i) {
        List<String> listingImages;
        Integer reviewRating;
        C19383o.m32797g(viewGroup, "container");
        String str = null;
        View inflate = View.inflate(viewGroup.getContext(), R.layout.pager_item_listing_review, (ViewGroup) null);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.review_scrollview);
        C19383o.m32796f(scrollView, "view.review_scrollview");
        ViewExtensions.m12864h(scrollView, new ListingReviewPagerAdapter$instantiateItem$1(inflate));
        List<ReviewImage> list = this.f21480f;
        if (list != null) {
            ReviewImage reviewImage = list.get(i);
            if (this.f21481g <= 0) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.buyer_review_image);
                C19383o.m32796f(imageView, "view.buyer_review_image");
                ViewExtensions.m12864h(imageView, new ListingReviewPagerAdapter$bindBuyerReview$1(this, inflate, reviewImage));
            } else {
                mo32460v(inflate, reviewImage.getImage());
            }
            C0114h.m270B0(inflate.getContext()).load(reviewImage.getBuyerAvatarUrl()).mo17160t(new ColorDrawable(0)).mo46137e0().mo16816M((ImageView) inflate.findViewById(R.id.buyer_avatar));
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.buyer_avatar);
            C19383o.m32796f(imageView2, "view.buyer_avatar");
            ViewExtensions.m12866j(imageView2, ListingReviewPagerAdapter$bindBuyerReview$2.INSTANCE);
            ((TextView) inflate.findViewById(R.id.review_date)).setText(this.f21482h.format(reviewImage.getCreateDate()));
            ((TextView) inflate.findViewById(R.id.reviewed_by_name)).setText(StringEscapeUtils.unescapeHtml4(reviewImage.getBuyerName()));
            TextView textView = (TextView) inflate.findViewById(R.id.reviewed_by_name);
            C19383o.m32796f(textView, "view.reviewed_by_name");
            ViewExtensions.m12866j(textView, ListingReviewPagerAdapter$bindBuyerReview$3.INSTANCE);
            if (reviewImage.getReviewRating() == null || ((reviewRating = reviewImage.getReviewRating()) != null && reviewRating.intValue() == 0)) {
                ((RatingIconView) inflate.findViewById(R.id.review_rating)).setVisibility(8);
            } else {
                RatingIconView ratingIconView = (RatingIconView) inflate.findViewById(R.id.review_rating);
                Integer reviewRating2 = reviewImage.getReviewRating();
                ratingIconView.setRating(reviewRating2 != null ? (float) reviewRating2.intValue() : 0.0f);
            }
            View findViewById = inflate.findViewById(R.id.review_pager_translate_button);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.r…w_pager_translate_button)");
            TranslateButton translateButton = (TranslateButton) findViewById;
            View findViewById2 = inflate.findViewById(R.id.review_text);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.review_text)");
            TextView textView2 = (TextView) findViewById2;
            m18025w(reviewImage, translateButton, textView2);
            translateButton.setOnTranslateClickListener(new ListingReviewPagerAdapter$bindTranslationState$1(reviewImage, this, translateButton, textView2, new C8698l[0]));
            if (!reviewImage.isListingOnly()) {
                ViewExtensions.m12869m((TextView) inflate.findViewById(R.id.purchased_item_title));
                ViewExtensions.m12869m((TextView) inflate.findViewById(R.id.review_listing_title));
                ViewExtensions.m12869m((FrameLayout) inflate.findViewById(R.id.review_listing_container));
                TextView textView3 = (TextView) inflate.findViewById(R.id.review_listing_title);
                String listingTitle = reviewImage.getListingTitle();
                if (listingTitle == null) {
                    listingTitle = "";
                }
                textView3.setText(listingTitle);
                if (C19543e0.m33306Y(reviewImage.getListingImages()) && (listingImages = reviewImage.getListingImages()) != null) {
                    str = listingImages.get(0);
                }
                if (str != null) {
                    C0114h.m270B0(inflate.getContext()).load(str).mo17160t(new ColorDrawable(0)).mo46136d0().mo16816M((ImageView) inflate.findViewById(R.id.review_listing_image));
                }
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.review_listing_container);
                C19383o.m32796f(frameLayout, "view.review_listing_container");
                ViewExtensions.m12866j(frameLayout, new ListingReviewPagerAdapter$bindBuyerReview$4(this, inflate, reviewImage));
                TextView textView4 = (TextView) inflate.findViewById(R.id.review_listing_title);
                C19383o.m32796f(textView4, "view.review_listing_title");
                ViewExtensions.m12866j(textView4, new ListingReviewPagerAdapter$bindBuyerReview$5(this, inflate, reviewImage));
            }
        }
        C9710a aVar = new C9710a(this);
        Context context = inflate.getContext();
        C19383o.m32795e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.buyer_review_image);
        C12990a aVar2 = this.f21483i;
        if (aVar2 != null) {
            C19383o.m32796f(imageView3, ResponseConstants.IMAGE);
            aVar2.activateZoomOnDialog(imageView3, aVar);
        } else {
            Window window = fragmentActivity.getWindow();
            C19383o.m32796f(window, "container.window");
            C19383o.m32796f(imageView3, ResponseConstants.IMAGE);
            C12031c cVar = new C12031c(0);
            View decorView = window.getDecorView();
            C19383o.m32795e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            imageView3.setOnTouchListener(new ZoomTouchListener((ViewGroup) decorView, imageView3, cVar, (C12030b) null, (C12029a) null, aVar));
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: o */
    public final boolean mo10626o(View view, Object obj) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(obj, ResponseConstants.OBJECT);
        return C19383o.m32792b(view, obj);
    }

    /* renamed from: v */
    public final void mo32460v(View view, Image image) {
        if (image == null || image.getUrl() == null) {
            ViewExtensions.m12860d((ImageView) view.findViewById(R.id.buyer_review_image));
            return;
        }
        ViewExtensions.m12869m((ImageView) view.findViewById(R.id.buyer_review_image));
        C0114h.m270B0(view.getContext()).load(image.getFullHeightImageUrlForPixelWidth(this.f21481g)).mo17160t(new ColorDrawable(0)).mo46136d0().mo16816M((ImageView) view.findViewById(R.id.buyer_review_image));
    }
}
