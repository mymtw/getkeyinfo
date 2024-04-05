package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.AppreciationVideo;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewCardJsonAdapter */
public final class ReviewCardJsonAdapter extends JsonAdapter<ReviewCard> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewCard> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<List<ReviewFlowIcon>>> listOfListOfReviewFlowIconAdapter;
    private final JsonAdapter<List<ReviewFlowNavigationOption>> listOfReviewFlowNavigationOptionAdapter;
    private final JsonAdapter<List<ReviewFlowRatingControl>> listOfReviewFlowRatingControlAdapter;
    private final JsonAdapter<Alert> nullableAlertAdapter;
    private final JsonAdapter<AppreciationPhoto> nullableAppreciationPhotoAdapter;
    private final JsonAdapter<AppreciationVideo> nullableAppreciationVideoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<ReviewFlowCheckboxControl> nullableReviewFlowCheckboxControlAdapter;
    private final JsonAdapter<ReviewFlowListingInfo> nullableReviewFlowListingInfoAdapter;
    private final JsonAdapter<ReviewFlowRatingControl> nullableReviewFlowRatingControlAdapter;
    private final JsonAdapter<ReviewFlowShopInfo> nullableReviewFlowShopInfoAdapter;
    private final JsonAdapter<ReviewFlowTextFieldControl> nullableReviewFlowTextFieldControlAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("analytics_id", "card_type", "unique_id", "navigation_options", "alert", "shop_info", "listing_info", "rating_control", "subratings", "review_opt_out_checkbox_control", "text_field", "display_title_text", "display_subtitle_text", "photo_placeholder_accessibility_hint", ResponseConstants.ICONS, "video_maximum_duration", "current_photo", "current_video");
    private final JsonAdapter<ReviewFlowCardType> reviewFlowCardTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ReviewCardJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<ReviewFlowRatingControl> cls = ReviewFlowRatingControl.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar2.mo68558c(cls2, emptySet, "analyticsId");
        this.reviewFlowCardTypeAdapter = yVar2.mo68558c(ReviewFlowCardType.class, emptySet, "cardType");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "uniqueId");
        this.listOfReviewFlowNavigationOptionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ReviewFlowNavigationOption.class), emptySet, "navigationOptions");
        this.nullableAlertAdapter = yVar2.mo68558c(Alert.class, emptySet, "alert");
        this.nullableReviewFlowShopInfoAdapter = yVar2.mo68558c(ReviewFlowShopInfo.class, emptySet, "shopInfo");
        this.nullableReviewFlowListingInfoAdapter = yVar2.mo68558c(ReviewFlowListingInfo.class, emptySet, "listingInfo");
        this.nullableReviewFlowRatingControlAdapter = yVar2.mo68558c(cls, emptySet, "ratingControl");
        this.listOfReviewFlowRatingControlAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "subratings");
        this.nullableReviewFlowCheckboxControlAdapter = yVar2.mo68558c(ReviewFlowCheckboxControl.class, emptySet, "optOutCheckbox");
        this.nullableReviewFlowTextFieldControlAdapter = yVar2.mo68558c(ReviewFlowTextFieldControl.class, emptySet, "textField");
        this.nullableStringAdapter = yVar2.mo68558c(cls2, emptySet, "displayTitleText");
        this.listOfListOfReviewFlowIconAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, C17387a0.m29126d(List.class, ReviewFlowIcon.class)), emptySet, ResponseConstants.ICONS);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "videoMaximumDuration");
        this.nullableAppreciationPhotoAdapter = yVar2.mo68558c(AppreciationPhoto.class, emptySet, "currentPhoto");
        this.nullableAppreciationVideoAdapter = yVar2.mo68558c(AppreciationVideo.class, emptySet, "currentVideo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0129, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016c, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016e, code lost:
        r15 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0170, code lost:
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0172, code lost:
        r12 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0174, code lost:
        r2 = r24;
        r11 = r28;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader r54) {
        /*
            r53 = this;
            r0 = r53
            r1 = r54
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r54.mo68410b()
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0028:
            boolean r20 = r54.mo68414f()
            java.lang.String r4 = "unique_id"
            r24 = r2
            java.lang.String r2 = "uniqueId"
            r25 = r15
            java.lang.String r15 = "card_type"
            r26 = r13
            java.lang.String r13 = "cardType"
            r27 = r12
            java.lang.String r12 = "analytics_id"
            r28 = r11
            java.lang.String r11 = "analyticsId"
            if (r20 == 0) goto L_0x017a
            r20 = r10
            com.squareup.moshi.JsonReader$b r10 = r0.options
            int r10 = r1.mo68406Q(r10)
            switch(r10) {
                case -1: goto L_0x0166;
                case 0: goto L_0x0155;
                case 1: goto L_0x0144;
                case 2: goto L_0x0134;
                case 3: goto L_0x011c;
                case 4: goto L_0x0112;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00ec;
                case 7: goto L_0x00dd;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00af;
                case 11: goto L_0x00a3;
                case 12: goto L_0x0097;
                case 13: goto L_0x008b;
                case 14: goto L_0x0075;
                case 15: goto L_0x0069;
                case 16: goto L_0x005d;
                case 17: goto L_0x0051;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x016c
        L_0x0051:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.AppreciationVideo> r2 = r0.nullableAppreciationVideoAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r2
            com.etsy.android.lib.models.apiv3.AppreciationVideo r23 = (com.etsy.android.lib.models.apiv3.AppreciationVideo) r23
            goto L_0x016c
        L_0x005d:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto> r2 = r0.nullableAppreciationPhotoAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r22 = r2
            com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto r22 = (com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto) r22
            goto L_0x016c
        L_0x0069:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.nullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r21 = r2
            java.lang.Integer r21 = (java.lang.Integer) r21
            goto L_0x016c
        L_0x0075:
            com.squareup.moshi.JsonAdapter<java.util.List<java.util.List<com.etsy.android.ui.user.review.ReviewFlowIcon>>> r2 = r0.listOfListOfReviewFlowIconAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0084
            r3 = r3 & -16385(0xffffffffffffbfff, float:NaN)
            r5 = r2
            goto L_0x016c
        L_0x0084:
            java.lang.String r2 = "icons"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r2, r1)
            throw r1
        L_0x008b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            goto L_0x016c
        L_0x0097:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            goto L_0x016c
        L_0x00a3:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            goto L_0x016c
        L_0x00af:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowTextFieldControl> r2 = r0.nullableReviewFlowTextFieldControlAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            com.etsy.android.ui.user.review.ReviewFlowTextFieldControl r16 = (com.etsy.android.p327ui.user.review.ReviewFlowTextFieldControl) r16
            goto L_0x016c
        L_0x00bb:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowCheckboxControl> r2 = r0.nullableReviewFlowCheckboxControlAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            com.etsy.android.ui.user.review.ReviewFlowCheckboxControl r15 = (com.etsy.android.p327ui.user.review.ReviewFlowCheckboxControl) r15
            r10 = r20
            goto L_0x0170
        L_0x00c8:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.ui.user.review.ReviewFlowRatingControl>> r2 = r0.listOfReviewFlowRatingControlAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00d6
            r2 = r3 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x0129
        L_0x00d6:
            java.lang.String r2 = "subratings"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r2, r1)
            throw r1
        L_0x00dd:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowRatingControl> r2 = r0.nullableReviewFlowRatingControlAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            com.etsy.android.ui.user.review.ReviewFlowRatingControl r2 = (com.etsy.android.p327ui.user.review.ReviewFlowRatingControl) r2
            r13 = r2
            r10 = r20
            r15 = r25
            goto L_0x0172
        L_0x00ec:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowListingInfo> r2 = r0.nullableReviewFlowListingInfoAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.ui.user.review.ReviewFlowListingInfo r12 = (com.etsy.android.p327ui.user.review.ReviewFlowListingInfo) r12
            r10 = r20
            r15 = r25
            r13 = r26
            goto L_0x0174
        L_0x00fd:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowShopInfo> r2 = r0.nullableReviewFlowShopInfoAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            com.etsy.android.ui.user.review.ReviewFlowShopInfo r11 = (com.etsy.android.p327ui.user.review.ReviewFlowShopInfo) r11
            r10 = r20
            r2 = r24
            r15 = r25
            r13 = r26
            r12 = r27
            goto L_0x0028
        L_0x0112:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.Alert> r2 = r0.nullableAlertAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            com.etsy.android.lib.models.apiv3.Alert r2 = (com.etsy.android.lib.models.apiv3.Alert) r2
            r10 = r2
            goto L_0x016e
        L_0x011c:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption>> r2 = r0.listOfReviewFlowNavigationOptionAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x012b
            r2 = r3 & -9
        L_0x0129:
            r3 = r2
            goto L_0x016c
        L_0x012b:
            java.lang.String r2 = "navigationOptions"
            java.lang.String r3 = "navigation_options"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0134:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r8 = r0.intAdapter
            java.lang.Object r8 = r8.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x013f
            goto L_0x016c
        L_0x013f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r4, r1)
            throw r1
        L_0x0144:
            com.squareup.moshi.JsonAdapter<com.etsy.android.ui.user.review.ReviewFlowCardType> r2 = r0.reviewFlowCardTypeAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            com.etsy.android.ui.user.review.ReviewFlowCardType r2 = (com.etsy.android.p327ui.user.review.ReviewFlowCardType) r2
            if (r2 == 0) goto L_0x0150
            r7 = r2
            goto L_0x016c
        L_0x0150:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r13, r15, r1)
            throw r1
        L_0x0155:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0161
            r6 = r2
            goto L_0x016c
        L_0x0161:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r12, r1)
            throw r1
        L_0x0166:
            r54.mo68408S()
            r54.mo68411c0()
        L_0x016c:
            r10 = r20
        L_0x016e:
            r15 = r25
        L_0x0170:
            r13 = r26
        L_0x0172:
            r12 = r27
        L_0x0174:
            r2 = r24
            r11 = r28
            goto L_0x0028
        L_0x017a:
            r20 = r10
            r54.mo68413e()
            r10 = -16649(0xffffffffffffbef7, float:NaN)
            if (r3 != r10) goto L_0x01c1
            com.etsy.android.ui.user.review.ReviewCard r3 = new com.etsy.android.ui.user.review.ReviewCard
            if (r6 == 0) goto L_0x01bc
            if (r7 == 0) goto L_0x01b7
            if (r8 == 0) goto L_0x01b2
            int r8 = r8.intValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.ui.user.review.ReviewFlowNavigationOption>"
            kotlin.jvm.internal.C19383o.m32795e(r9, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.ui.user.review.ReviewFlowRatingControl>"
            kotlin.jvm.internal.C19383o.m32795e(r14, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<com.etsy.android.ui.user.review.ReviewFlowIcon>>"
            kotlin.jvm.internal.C19383o.m32795e(r5, r1)
            r29 = r5
            r5 = r3
            r10 = r20
            r11 = r28
            r12 = r27
            r13 = r26
            r15 = r25
            r20 = r29
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0296
        L_0x01b2:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r4, r1)
            throw r1
        L_0x01b7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x01bc:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r12, r1)
            throw r1
        L_0x01c1:
            r29 = r5
            java.lang.reflect.Constructor<com.etsy.android.ui.user.review.ReviewCard> r5 = r0.constructorRef
            r30 = 10
            r31 = 9
            r32 = 8
            r33 = 7
            r34 = 6
            r35 = 5
            r36 = 4
            r37 = 3
            r38 = 2
            r39 = 1
            r40 = 0
            r10 = 20
            r42 = 19
            r43 = 18
            r44 = 17
            r45 = 16
            r46 = 15
            r47 = 14
            r48 = 13
            r49 = 12
            if (r5 != 0) goto L_0x0249
            java.lang.Class<com.etsy.android.ui.user.review.ReviewCard> r5 = com.etsy.android.p327ui.user.review.ReviewCard.class
            r50 = r11
            java.lang.Class[] r11 = new java.lang.Class[r10]
            r11[r40] = r24
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowCardType> r51 = com.etsy.android.p327ui.user.review.ReviewFlowCardType.class
            r11[r39] = r51
            java.lang.Class r51 = java.lang.Integer.TYPE
            r11[r38] = r51
            java.lang.Class<java.util.List> r52 = java.util.List.class
            r11[r37] = r52
            java.lang.Class<com.etsy.android.lib.models.apiv3.Alert> r52 = com.etsy.android.lib.models.apiv3.Alert.class
            r11[r36] = r52
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowShopInfo> r52 = com.etsy.android.p327ui.user.review.ReviewFlowShopInfo.class
            r11[r35] = r52
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowListingInfo> r52 = com.etsy.android.p327ui.user.review.ReviewFlowListingInfo.class
            r11[r34] = r52
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowRatingControl> r52 = com.etsy.android.p327ui.user.review.ReviewFlowRatingControl.class
            r11[r33] = r52
            java.lang.Class<java.util.List> r52 = java.util.List.class
            r11[r32] = r52
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowCheckboxControl> r52 = com.etsy.android.p327ui.user.review.ReviewFlowCheckboxControl.class
            r11[r31] = r52
            java.lang.Class<com.etsy.android.ui.user.review.ReviewFlowTextFieldControl> r52 = com.etsy.android.p327ui.user.review.ReviewFlowTextFieldControl.class
            r11[r30] = r52
            r41 = 11
            r11[r41] = r24
            r11[r49] = r24
            r11[r48] = r24
            java.lang.Class<java.util.List> r24 = java.util.List.class
            r11[r47] = r24
            java.lang.Class<java.lang.Integer> r24 = java.lang.Integer.class
            r11[r46] = r24
            java.lang.Class<com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto> r24 = com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto.class
            r11[r45] = r24
            java.lang.Class<com.etsy.android.lib.models.apiv3.AppreciationVideo> r24 = com.etsy.android.lib.models.apiv3.AppreciationVideo.class
            r11[r44] = r24
            r11[r43] = r51
            java.lang.Class<?> r24 = p618lp.C18215a.f39928c
            r11[r42] = r24
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r11)
            r0.constructorRef = r5
            java.lang.String r11 = "ReviewCard::class.java.g…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            goto L_0x024b
        L_0x0249:
            r50 = r11
        L_0x024b:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            if (r6 == 0) goto L_0x02a1
            r10[r40] = r6
            if (r7 == 0) goto L_0x029c
            r10[r39] = r7
            if (r8 == 0) goto L_0x0297
            int r1 = r8.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r38] = r1
            r10[r37] = r9
            r10[r36] = r20
            r10[r35] = r28
            r10[r34] = r27
            r10[r33] = r26
            r10[r32] = r14
            r10[r31] = r25
            r10[r30] = r16
            r1 = 11
            r10[r1] = r17
            r10[r49] = r18
            r10[r48] = r19
            r10[r47] = r29
            r10[r46] = r21
            r10[r45] = r22
            r10[r44] = r23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r10[r43] = r1
            r1 = 0
            r10[r42] = r1
            java.lang.Object r1 = r5.newInstance(r10)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            r3 = r1
            com.etsy.android.ui.user.review.ReviewCard r3 = (com.etsy.android.p327ui.user.review.ReviewCard) r3
        L_0x0296:
            return r3
        L_0x0297:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r4, r1)
            throw r1
        L_0x029c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r15, r1)
            throw r1
        L_0x02a1:
            r2 = r50
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r12, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.review.ReviewCardJsonAdapter.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewCard reviewCard = (ReviewCard) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("analytics_id");
            this.stringAdapter.toJson(wVar, reviewCard.f25959a);
            wVar.mo68529h("card_type");
            this.reviewFlowCardTypeAdapter.toJson(wVar, reviewCard.f25960b);
            wVar.mo68529h("unique_id");
            this.intAdapter.toJson(wVar, Integer.valueOf(reviewCard.f25961c));
            wVar.mo68529h("navigation_options");
            this.listOfReviewFlowNavigationOptionAdapter.toJson(wVar, reviewCard.f25962d);
            wVar.mo68529h("alert");
            this.nullableAlertAdapter.toJson(wVar, reviewCard.f25963e);
            wVar.mo68529h("shop_info");
            this.nullableReviewFlowShopInfoAdapter.toJson(wVar, reviewCard.f25964f);
            wVar.mo68529h("listing_info");
            this.nullableReviewFlowListingInfoAdapter.toJson(wVar, reviewCard.f25965g);
            wVar.mo68529h("rating_control");
            this.nullableReviewFlowRatingControlAdapter.toJson(wVar, reviewCard.f25966h);
            wVar.mo68529h("subratings");
            this.listOfReviewFlowRatingControlAdapter.toJson(wVar, reviewCard.f25967i);
            wVar.mo68529h("review_opt_out_checkbox_control");
            this.nullableReviewFlowCheckboxControlAdapter.toJson(wVar, reviewCard.f25968j);
            wVar.mo68529h("text_field");
            this.nullableReviewFlowTextFieldControlAdapter.toJson(wVar, reviewCard.f25969k);
            wVar.mo68529h("display_title_text");
            this.nullableStringAdapter.toJson(wVar, reviewCard.f25970l);
            wVar.mo68529h("display_subtitle_text");
            this.nullableStringAdapter.toJson(wVar, reviewCard.f25971m);
            wVar.mo68529h("photo_placeholder_accessibility_hint");
            this.nullableStringAdapter.toJson(wVar, reviewCard.f25972n);
            wVar.mo68529h(ResponseConstants.ICONS);
            this.listOfListOfReviewFlowIconAdapter.toJson(wVar, reviewCard.f25973o);
            wVar.mo68529h("video_maximum_duration");
            this.nullableIntAdapter.toJson(wVar, reviewCard.f25974p);
            wVar.mo68529h("current_photo");
            this.nullableAppreciationPhotoAdapter.toJson(wVar, reviewCard.f25975q);
            wVar.mo68529h("current_video");
            this.nullableAppreciationVideoAdapter.toJson(wVar, reviewCard.f25976r);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewCard)";
    }
}
