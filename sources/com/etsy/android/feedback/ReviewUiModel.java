package com.etsy.android.feedback;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.C19383o;

public final class ReviewUiModel implements Serializable {
    public static final int $stable = 8;
    private final AppreciationPhoto appreciationPhoto;
    private final Video appreciationVideo;
    private final String buyerAvatarUrl;
    private final String buyerDisplayName;
    private final String buyerProfileUrl;
    private final Long buyerUserId;
    private final Date createdDate;
    private final String language;
    private final Long listingId;
    private final String listingImageSmallUrl;
    private final String listingImageUrl;
    private final String listingTitle;
    private final Float rating;
    private final String review;
    private final String sellerAvatarUrl;
    private final String sellerDisplayName;
    private final String sellerResponse;
    private final Date sellerResponseDate;
    private final boolean showAppreciationPhoto;
    private final Long transactionId;
    private final String translatedReview;
    private MachineTranslationViewState translationState;

    public ReviewUiModel(Long l, String str, String str2, String str3, Date date, Float f, String str4, String str5, MachineTranslationViewState machineTranslationViewState, String str6, boolean z, AppreciationPhoto appreciationPhoto2, Video video, Long l2, Long l3, String str7, String str8, String str9, String str10, String str11, String str12, Date date2) {
        C19383o.m32797g(machineTranslationViewState, "translationState");
        this.buyerUserId = l;
        this.buyerDisplayName = str;
        this.buyerAvatarUrl = str2;
        this.buyerProfileUrl = str3;
        this.createdDate = date;
        this.rating = f;
        this.review = str4;
        this.translatedReview = str5;
        this.translationState = machineTranslationViewState;
        this.language = str6;
        this.showAppreciationPhoto = z;
        this.appreciationPhoto = appreciationPhoto2;
        this.appreciationVideo = video;
        this.transactionId = l2;
        this.listingId = l3;
        this.listingTitle = str7;
        this.listingImageUrl = str8;
        this.listingImageSmallUrl = str9;
        this.sellerDisplayName = str10;
        this.sellerAvatarUrl = str11;
        this.sellerResponse = str12;
        this.sellerResponseDate = date2;
    }

    public static /* synthetic */ ReviewUiModel copy$default(ReviewUiModel reviewUiModel, Long l, String str, String str2, String str3, Date date, Float f, String str4, String str5, MachineTranslationViewState machineTranslationViewState, String str6, boolean z, AppreciationPhoto appreciationPhoto2, Video video, Long l2, Long l3, String str7, String str8, String str9, String str10, String str11, String str12, Date date2, int i, Object obj) {
        ReviewUiModel reviewUiModel2 = reviewUiModel;
        int i2 = i;
        return reviewUiModel.copy((i2 & 1) != 0 ? reviewUiModel2.buyerUserId : l, (i2 & 2) != 0 ? reviewUiModel2.buyerDisplayName : str, (i2 & 4) != 0 ? reviewUiModel2.buyerAvatarUrl : str2, (i2 & 8) != 0 ? reviewUiModel2.buyerProfileUrl : str3, (i2 & 16) != 0 ? reviewUiModel2.createdDate : date, (i2 & 32) != 0 ? reviewUiModel2.rating : f, (i2 & 64) != 0 ? reviewUiModel2.review : str4, (i2 & 128) != 0 ? reviewUiModel2.translatedReview : str5, (i2 & 256) != 0 ? reviewUiModel2.translationState : machineTranslationViewState, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? reviewUiModel2.language : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? reviewUiModel2.showAppreciationPhoto : z, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? reviewUiModel2.appreciationPhoto : appreciationPhoto2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? reviewUiModel2.appreciationVideo : video, (i2 & 8192) != 0 ? reviewUiModel2.transactionId : l2, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? reviewUiModel2.listingId : l3, (i2 & 32768) != 0 ? reviewUiModel2.listingTitle : str7, (i2 & 65536) != 0 ? reviewUiModel2.listingImageUrl : str8, (i2 & 131072) != 0 ? reviewUiModel2.listingImageSmallUrl : str9, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? reviewUiModel2.sellerDisplayName : str10, (i2 & 524288) != 0 ? reviewUiModel2.sellerAvatarUrl : str11, (i2 & 1048576) != 0 ? reviewUiModel2.sellerResponse : str12, (i2 & 2097152) != 0 ? reviewUiModel2.sellerResponseDate : date2);
    }

    public final Long component1() {
        return this.buyerUserId;
    }

    public final String component10() {
        return this.language;
    }

    public final boolean component11() {
        return this.showAppreciationPhoto;
    }

    public final AppreciationPhoto component12() {
        return this.appreciationPhoto;
    }

    public final Video component13() {
        return this.appreciationVideo;
    }

    public final Long component14() {
        return this.transactionId;
    }

    public final Long component15() {
        return this.listingId;
    }

    public final String component16() {
        return this.listingTitle;
    }

    public final String component17() {
        return this.listingImageUrl;
    }

    public final String component18() {
        return this.listingImageSmallUrl;
    }

    public final String component19() {
        return this.sellerDisplayName;
    }

    public final String component2() {
        return this.buyerDisplayName;
    }

    public final String component20() {
        return this.sellerAvatarUrl;
    }

    public final String component21() {
        return this.sellerResponse;
    }

    public final Date component22() {
        return this.sellerResponseDate;
    }

    public final String component3() {
        return this.buyerAvatarUrl;
    }

    public final String component4() {
        return this.buyerProfileUrl;
    }

    public final Date component5() {
        return this.createdDate;
    }

    public final Float component6() {
        return this.rating;
    }

    public final String component7() {
        return this.review;
    }

    public final String component8() {
        return this.translatedReview;
    }

    public final MachineTranslationViewState component9() {
        return this.translationState;
    }

    public final ReviewUiModel copy(Long l, String str, String str2, String str3, Date date, Float f, String str4, String str5, MachineTranslationViewState machineTranslationViewState, String str6, boolean z, AppreciationPhoto appreciationPhoto2, Video video, Long l2, Long l3, String str7, String str8, String str9, String str10, String str11, String str12, Date date2) {
        Long l4 = l;
        C19383o.m32797g(machineTranslationViewState, "translationState");
        return new ReviewUiModel(l, str, str2, str3, date, f, str4, str5, machineTranslationViewState, str6, z, appreciationPhoto2, video, l2, l3, str7, str8, str9, str10, str11, str12, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewUiModel)) {
            return false;
        }
        ReviewUiModel reviewUiModel = (ReviewUiModel) obj;
        return C19383o.m32792b(this.buyerUserId, reviewUiModel.buyerUserId) && C19383o.m32792b(this.buyerDisplayName, reviewUiModel.buyerDisplayName) && C19383o.m32792b(this.buyerAvatarUrl, reviewUiModel.buyerAvatarUrl) && C19383o.m32792b(this.buyerProfileUrl, reviewUiModel.buyerProfileUrl) && C19383o.m32792b(this.createdDate, reviewUiModel.createdDate) && C19383o.m32792b(this.rating, reviewUiModel.rating) && C19383o.m32792b(this.review, reviewUiModel.review) && C19383o.m32792b(this.translatedReview, reviewUiModel.translatedReview) && C19383o.m32792b(this.translationState, reviewUiModel.translationState) && C19383o.m32792b(this.language, reviewUiModel.language) && this.showAppreciationPhoto == reviewUiModel.showAppreciationPhoto && C19383o.m32792b(this.appreciationPhoto, reviewUiModel.appreciationPhoto) && C19383o.m32792b(this.appreciationVideo, reviewUiModel.appreciationVideo) && C19383o.m32792b(this.transactionId, reviewUiModel.transactionId) && C19383o.m32792b(this.listingId, reviewUiModel.listingId) && C19383o.m32792b(this.listingTitle, reviewUiModel.listingTitle) && C19383o.m32792b(this.listingImageUrl, reviewUiModel.listingImageUrl) && C19383o.m32792b(this.listingImageSmallUrl, reviewUiModel.listingImageSmallUrl) && C19383o.m32792b(this.sellerDisplayName, reviewUiModel.sellerDisplayName) && C19383o.m32792b(this.sellerAvatarUrl, reviewUiModel.sellerAvatarUrl) && C19383o.m32792b(this.sellerResponse, reviewUiModel.sellerResponse) && C19383o.m32792b(this.sellerResponseDate, reviewUiModel.sellerResponseDate);
    }

    public final AppreciationPhoto getAppreciationPhoto() {
        return this.appreciationPhoto;
    }

    public final Video getAppreciationVideo() {
        return this.appreciationVideo;
    }

    public final String getBuyerAvatarUrl() {
        return this.buyerAvatarUrl;
    }

    public final String getBuyerDisplayName() {
        return this.buyerDisplayName;
    }

    public final String getBuyerProfileUrl() {
        return this.buyerProfileUrl;
    }

    public final Long getBuyerUserId() {
        return this.buyerUserId;
    }

    public final Date getCreatedDate() {
        return this.createdDate;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final String getListingImageSmallUrl() {
        return this.listingImageSmallUrl;
    }

    public final String getListingImageUrl() {
        return this.listingImageUrl;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final String getReview() {
        return this.review;
    }

    public final String getSellerAvatarUrl() {
        return this.sellerAvatarUrl;
    }

    public final String getSellerDisplayName() {
        return this.sellerDisplayName;
    }

    public final String getSellerResponse() {
        return this.sellerResponse;
    }

    public final Date getSellerResponseDate() {
        return this.sellerResponseDate;
    }

    public final boolean getShowAppreciationPhoto() {
        return this.showAppreciationPhoto;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public final String getTranslatedReview() {
        return this.translatedReview;
    }

    public final MachineTranslationViewState getTranslationState() {
        return this.translationState;
    }

    public int hashCode() {
        Long l = this.buyerUserId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.buyerDisplayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buyerAvatarUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyerProfileUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.createdDate;
        int hashCode5 = (hashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Float f = this.rating;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str4 = this.review;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.translatedReview;
        int hashCode8 = (this.translationState.hashCode() + ((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.language;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.showAppreciationPhoto;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        AppreciationPhoto appreciationPhoto2 = this.appreciationPhoto;
        int hashCode10 = (i2 + (appreciationPhoto2 == null ? 0 : appreciationPhoto2.hashCode())) * 31;
        Video video = this.appreciationVideo;
        int hashCode11 = (hashCode10 + (video == null ? 0 : video.hashCode())) * 31;
        Long l2 = this.transactionId;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.listingId;
        int hashCode13 = (hashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str7 = this.listingTitle;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.listingImageUrl;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.listingImageSmallUrl;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sellerDisplayName;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sellerAvatarUrl;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sellerResponse;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Date date2 = this.sellerResponseDate;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return hashCode19 + i;
    }

    public final void setTranslationState(MachineTranslationViewState machineTranslationViewState) {
        C19383o.m32797g(machineTranslationViewState, "<set-?>");
        this.translationState = machineTranslationViewState;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReviewUiModel(buyerUserId=");
        h.append(this.buyerUserId);
        h.append(", buyerDisplayName=");
        h.append(this.buyerDisplayName);
        h.append(", buyerAvatarUrl=");
        h.append(this.buyerAvatarUrl);
        h.append(", buyerProfileUrl=");
        h.append(this.buyerProfileUrl);
        h.append(", createdDate=");
        h.append(this.createdDate);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", review=");
        h.append(this.review);
        h.append(", translatedReview=");
        h.append(this.translatedReview);
        h.append(", translationState=");
        h.append(this.translationState);
        h.append(", language=");
        h.append(this.language);
        h.append(", showAppreciationPhoto=");
        h.append(this.showAppreciationPhoto);
        h.append(", appreciationPhoto=");
        h.append(this.appreciationPhoto);
        h.append(", appreciationVideo=");
        h.append(this.appreciationVideo);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", listingTitle=");
        h.append(this.listingTitle);
        h.append(", listingImageUrl=");
        h.append(this.listingImageUrl);
        h.append(", listingImageSmallUrl=");
        h.append(this.listingImageSmallUrl);
        h.append(", sellerDisplayName=");
        h.append(this.sellerDisplayName);
        h.append(", sellerAvatarUrl=");
        h.append(this.sellerAvatarUrl);
        h.append(", sellerResponse=");
        h.append(this.sellerResponse);
        h.append(", sellerResponseDate=");
        h.append(this.sellerResponseDate);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReviewUiModel(java.lang.Long r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Date r30, java.lang.Float r31, java.lang.String r32, java.lang.String r33, com.etsy.android.uikit.util.MachineTranslationViewState r34, java.lang.String r35, boolean r36, com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto r37, com.etsy.android.lib.models.apiv3.listing.Video r38, java.lang.Long r39, java.lang.Long r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.Date r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r25 = this;
            r0 = r48
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r13 = r1
            goto L_0x000b
        L_0x0009:
            r13 = r36
        L_0x000b:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r15 = r0
            goto L_0x0014
        L_0x0012:
            r15 = r38
        L_0x0014:
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r14 = r37
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r44
            r22 = r45
            r23 = r46
            r24 = r47
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.ReviewUiModel.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.Float, java.lang.String, java.lang.String, com.etsy.android.uikit.util.MachineTranslationViewState, java.lang.String, boolean, com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto, com.etsy.android.lib.models.apiv3.listing.Video, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
