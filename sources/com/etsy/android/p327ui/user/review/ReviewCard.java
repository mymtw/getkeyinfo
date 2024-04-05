package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.AppreciationVideo;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.p327ui.user.review.ReviewCardTypeId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewCard */
public final class ReviewCard {

    /* renamed from: a */
    public final String f25959a;

    /* renamed from: b */
    public final ReviewFlowCardType f25960b;

    /* renamed from: c */
    public final int f25961c;

    /* renamed from: d */
    public final List<ReviewFlowNavigationOption> f25962d;

    /* renamed from: e */
    public final Alert f25963e;

    /* renamed from: f */
    public final ReviewFlowShopInfo f25964f;

    /* renamed from: g */
    public final ReviewFlowListingInfo f25965g;

    /* renamed from: h */
    public final ReviewFlowRatingControl f25966h;

    /* renamed from: i */
    public final List<ReviewFlowRatingControl> f25967i;

    /* renamed from: j */
    public final ReviewFlowCheckboxControl f25968j;

    /* renamed from: k */
    public final ReviewFlowTextFieldControl f25969k;

    /* renamed from: l */
    public final String f25970l;

    /* renamed from: m */
    public final String f25971m;

    /* renamed from: n */
    public final String f25972n;

    /* renamed from: o */
    public final List<List<ReviewFlowIcon>> f25973o;

    /* renamed from: p */
    public final Integer f25974p;

    /* renamed from: q */
    public AppreciationPhoto f25975q;

    /* renamed from: r */
    public final AppreciationVideo f25976r;

    /* renamed from: s */
    public final transient C11697a f25977s;

    /* renamed from: com.etsy.android.ui.user.review.ReviewCard$a */
    public static final class C11697a implements ITrackedObject {

        /* renamed from: b */
        public final /* synthetic */ ReviewCard f25978b;

        public C11697a(ReviewCard reviewCard) {
            this.f25978b = reviewCard;
        }

        @JsonIgnore
        public final List<C8696j> getOnSeenTrackingEvents() {
            return new ArrayList();
        }

        @JsonIgnore
        public final int getTrackedPosition() {
            return 0;
        }

        public final String getTrackingName() {
            return this.f25978b.f25959a;
        }

        @JsonIgnore
        public final Map<AnalyticsProperty, Object> getTrackingParameters() {
            return null;
        }

        @JsonIgnore
        public final void setOnSeenTrackingEvents(List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public final void setTrackedPosition(int i) {
        }

        public final void setTrackingName(String str) {
        }

        @JsonIgnore
        public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReviewCard(java.lang.String r22, com.etsy.android.p327ui.user.review.ReviewFlowCardType r23, int r24, java.util.List r25, com.etsy.android.lib.models.apiv3.Alert r26, com.etsy.android.p327ui.user.review.ReviewFlowShopInfo r27, com.etsy.android.p327ui.user.review.ReviewFlowListingInfo r28, com.etsy.android.p327ui.user.review.ReviewFlowRatingControl r29, java.util.List r30, com.etsy.android.p327ui.user.review.ReviewFlowCheckboxControl r31, com.etsy.android.p327ui.user.review.ReviewFlowTextFieldControl r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36, java.lang.Integer r37, com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto r38, com.etsy.android.lib.models.apiv3.AppreciationVideo r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            r6 = r1
            goto L_0x000c
        L_0x000a:
            r6 = r25
        L_0x000c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0014
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            r11 = r1
            goto L_0x0016
        L_0x0014:
            r11 = r30
        L_0x0016:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001f
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r17 = r0
            goto L_0x0021
        L_0x001f:
            r17 = r36
        L_0x0021:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r18 = r37
            r19 = r38
            r20 = r39
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.ReviewCard.<init>(java.lang.String, com.etsy.android.ui.user.review.ReviewFlowCardType, int, java.util.List, com.etsy.android.lib.models.apiv3.Alert, com.etsy.android.ui.user.review.ReviewFlowShopInfo, com.etsy.android.ui.user.review.ReviewFlowListingInfo, com.etsy.android.ui.user.review.ReviewFlowRatingControl, java.util.List, com.etsy.android.ui.user.review.ReviewFlowCheckboxControl, com.etsy.android.ui.user.review.ReviewFlowTextFieldControl, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto, com.etsy.android.lib.models.apiv3.AppreciationVideo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public final ReviewCardTypeId mo37874a() {
        ReviewCardTypeId reviewCardTypeId;
        ReviewCardTypeId.C11698a aVar = ReviewCardTypeId.Companion;
        int i = this.f25961c;
        aVar.getClass();
        ReviewCardTypeId[] values = ReviewCardTypeId.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                reviewCardTypeId = null;
                break;
            }
            reviewCardTypeId = values[i2];
            if (reviewCardTypeId.getId() == i) {
                break;
            }
            i2++;
        }
        if (reviewCardTypeId != null) {
            return reviewCardTypeId;
        }
        throw new IllegalStateException(C0071c.m191c(C0072d.m201h("Card type "), this.f25961c, " does not currently exist"));
    }

    public final ReviewCard copy(@C17402n(name = "analytics_id") String str, @C17402n(name = "card_type") ReviewFlowCardType reviewFlowCardType, @C17402n(name = "unique_id") int i, @C17402n(name = "navigation_options") List<ReviewFlowNavigationOption> list, @C17402n(name = "alert") Alert alert, @C17402n(name = "shop_info") ReviewFlowShopInfo reviewFlowShopInfo, @C17402n(name = "listing_info") ReviewFlowListingInfo reviewFlowListingInfo, @C17402n(name = "rating_control") ReviewFlowRatingControl reviewFlowRatingControl, @C17402n(name = "subratings") List<ReviewFlowRatingControl> list2, @C17402n(name = "review_opt_out_checkbox_control") ReviewFlowCheckboxControl reviewFlowCheckboxControl, @C17402n(name = "text_field") ReviewFlowTextFieldControl reviewFlowTextFieldControl, @C17402n(name = "display_title_text") String str2, @C17402n(name = "display_subtitle_text") String str3, @C17402n(name = "photo_placeholder_accessibility_hint") String str4, @C17402n(name = "icons") List<? extends List<ReviewFlowIcon>> list3, @C17402n(name = "video_maximum_duration") Integer num, @C17402n(name = "current_photo") AppreciationPhoto appreciationPhoto, @C17402n(name = "current_video") AppreciationVideo appreciationVideo) {
        String str5 = str;
        C19383o.m32797g(str5, "analyticsId");
        C19383o.m32797g(reviewFlowCardType, "cardType");
        C19383o.m32797g(list, "navigationOptions");
        C19383o.m32797g(list2, "subratings");
        C19383o.m32797g(list3, ResponseConstants.ICONS);
        return new ReviewCard(str5, reviewFlowCardType, i, list, alert, reviewFlowShopInfo, reviewFlowListingInfo, reviewFlowRatingControl, list2, reviewFlowCheckboxControl, reviewFlowTextFieldControl, str2, str3, str4, list3, num, appreciationPhoto, appreciationVideo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewCard)) {
            return false;
        }
        ReviewCard reviewCard = (ReviewCard) obj;
        return C19383o.m32792b(this.f25959a, reviewCard.f25959a) && this.f25960b == reviewCard.f25960b && this.f25961c == reviewCard.f25961c && C19383o.m32792b(this.f25962d, reviewCard.f25962d) && C19383o.m32792b(this.f25963e, reviewCard.f25963e) && C19383o.m32792b(this.f25964f, reviewCard.f25964f) && C19383o.m32792b(this.f25965g, reviewCard.f25965g) && C19383o.m32792b(this.f25966h, reviewCard.f25966h) && C19383o.m32792b(this.f25967i, reviewCard.f25967i) && C19383o.m32792b(this.f25968j, reviewCard.f25968j) && C19383o.m32792b(this.f25969k, reviewCard.f25969k) && C19383o.m32792b(this.f25970l, reviewCard.f25970l) && C19383o.m32792b(this.f25971m, reviewCard.f25971m) && C19383o.m32792b(this.f25972n, reviewCard.f25972n) && C19383o.m32792b(this.f25973o, reviewCard.f25973o) && C19383o.m32792b(this.f25974p, reviewCard.f25974p) && C19383o.m32792b(this.f25975q, reviewCard.f25975q) && C19383o.m32792b(this.f25976r, reviewCard.f25976r);
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f25962d, C0069a.m170a(this.f25961c, (this.f25960b.hashCode() + (this.f25959a.hashCode() * 31)) * 31, 31), 31);
        Alert alert = this.f25963e;
        int i = 0;
        int hashCode = (g + (alert == null ? 0 : alert.hashCode())) * 31;
        ReviewFlowShopInfo reviewFlowShopInfo = this.f25964f;
        int hashCode2 = (hashCode + (reviewFlowShopInfo == null ? 0 : reviewFlowShopInfo.hashCode())) * 31;
        ReviewFlowListingInfo reviewFlowListingInfo = this.f25965g;
        int hashCode3 = (hashCode2 + (reviewFlowListingInfo == null ? 0 : reviewFlowListingInfo.hashCode())) * 31;
        ReviewFlowRatingControl reviewFlowRatingControl = this.f25966h;
        int g2 = C13983i.m21488g(this.f25967i, (hashCode3 + (reviewFlowRatingControl == null ? 0 : reviewFlowRatingControl.hashCode())) * 31, 31);
        ReviewFlowCheckboxControl reviewFlowCheckboxControl = this.f25968j;
        int hashCode4 = (g2 + (reviewFlowCheckboxControl == null ? 0 : reviewFlowCheckboxControl.hashCode())) * 31;
        ReviewFlowTextFieldControl reviewFlowTextFieldControl = this.f25969k;
        int hashCode5 = (hashCode4 + (reviewFlowTextFieldControl == null ? 0 : reviewFlowTextFieldControl.hashCode())) * 31;
        String str = this.f25970l;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25971m;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25972n;
        int g3 = C13983i.m21488g(this.f25973o, (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.f25974p;
        int hashCode8 = (g3 + (num == null ? 0 : num.hashCode())) * 31;
        AppreciationPhoto appreciationPhoto = this.f25975q;
        int hashCode9 = (hashCode8 + (appreciationPhoto == null ? 0 : appreciationPhoto.hashCode())) * 31;
        AppreciationVideo appreciationVideo = this.f25976r;
        if (appreciationVideo != null) {
            i = appreciationVideo.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewCard(analyticsId=");
        h.append(this.f25959a);
        h.append(", cardType=");
        h.append(this.f25960b);
        h.append(", uniqueId=");
        h.append(this.f25961c);
        h.append(", navigationOptions=");
        h.append(this.f25962d);
        h.append(", alert=");
        h.append(this.f25963e);
        h.append(", shopInfo=");
        h.append(this.f25964f);
        h.append(", listingInfo=");
        h.append(this.f25965g);
        h.append(", ratingControl=");
        h.append(this.f25966h);
        h.append(", subratings=");
        h.append(this.f25967i);
        h.append(", optOutCheckbox=");
        h.append(this.f25968j);
        h.append(", textField=");
        h.append(this.f25969k);
        h.append(", displayTitleText=");
        h.append(this.f25970l);
        h.append(", displaySubtitleText=");
        h.append(this.f25971m);
        h.append(", photoContentDesc=");
        h.append(this.f25972n);
        h.append(", icons=");
        h.append(this.f25973o);
        h.append(", videoMaximumDuration=");
        h.append(this.f25974p);
        h.append(", currentPhoto=");
        h.append(this.f25975q);
        h.append(", currentVideo=");
        h.append(this.f25976r);
        h.append(')');
        return h.toString();
    }

    public ReviewCard(@C17402n(name = "analytics_id") String str, @C17402n(name = "card_type") ReviewFlowCardType reviewFlowCardType, @C17402n(name = "unique_id") int i, @C17402n(name = "navigation_options") List<ReviewFlowNavigationOption> list, @C17402n(name = "alert") Alert alert, @C17402n(name = "shop_info") ReviewFlowShopInfo reviewFlowShopInfo, @C17402n(name = "listing_info") ReviewFlowListingInfo reviewFlowListingInfo, @C17402n(name = "rating_control") ReviewFlowRatingControl reviewFlowRatingControl, @C17402n(name = "subratings") List<ReviewFlowRatingControl> list2, @C17402n(name = "review_opt_out_checkbox_control") ReviewFlowCheckboxControl reviewFlowCheckboxControl, @C17402n(name = "text_field") ReviewFlowTextFieldControl reviewFlowTextFieldControl, @C17402n(name = "display_title_text") String str2, @C17402n(name = "display_subtitle_text") String str3, @C17402n(name = "photo_placeholder_accessibility_hint") String str4, @C17402n(name = "icons") List<? extends List<ReviewFlowIcon>> list3, @C17402n(name = "video_maximum_duration") Integer num, @C17402n(name = "current_photo") AppreciationPhoto appreciationPhoto, @C17402n(name = "current_video") AppreciationVideo appreciationVideo) {
        List<ReviewFlowRatingControl> list4 = list2;
        List<? extends List<ReviewFlowIcon>> list5 = list3;
        C19383o.m32797g(str, "analyticsId");
        C19383o.m32797g(reviewFlowCardType, "cardType");
        C19383o.m32797g(list, "navigationOptions");
        C19383o.m32797g(list4, "subratings");
        C19383o.m32797g(list5, ResponseConstants.ICONS);
        this.f25959a = str;
        this.f25960b = reviewFlowCardType;
        this.f25961c = i;
        this.f25962d = list;
        this.f25963e = alert;
        this.f25964f = reviewFlowShopInfo;
        this.f25965g = reviewFlowListingInfo;
        this.f25966h = reviewFlowRatingControl;
        this.f25967i = list4;
        this.f25968j = reviewFlowCheckboxControl;
        this.f25969k = reviewFlowTextFieldControl;
        this.f25970l = str2;
        this.f25971m = str3;
        this.f25972n = str4;
        this.f25973o = list5;
        this.f25974p = num;
        this.f25975q = appreciationPhoto;
        this.f25976r = appreciationVideo;
        this.f25977s = new C11697a(this);
    }
}
