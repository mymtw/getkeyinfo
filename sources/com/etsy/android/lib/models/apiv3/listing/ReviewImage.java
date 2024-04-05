package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class ReviewImage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReviewImage> CREATOR = new Creator();
    private final String buyerAvatarUrl;
    private final String buyerName;
    private final String buyerProfileUrl;
    private final Long createDate;
    private final Image image;
    private final boolean isListingOnly;
    private final Long listingId;
    private final List<String> listingImages;
    private final String listingTitle;
    private final Integer rating;
    private final String review;
    private final String transactionId;
    private final String translatedReview;

    public static final class Creator implements Parcelable.Creator<ReviewImage> {
        public final ReviewImage createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C19383o.m32797g(parcel2, "parcel");
            return new ReviewImage(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        public final ReviewImage[] newArray(int i) {
            return new ReviewImage[i];
        }
    }

    public ReviewImage() {
        this((Image) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Long) null, false, (Long) null, (String) null, (List) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    public ReviewImage(@C17402n(name = "image") Image image2, @C17402n(name = "review_text") String str, @C17402n(name = "review_translated") String str2, @C17402n(name = "review_rating") Integer num, @C17402n(name = "buyer_avatar_url") String str3, @C17402n(name = "buyer_name") String str4, @C17402n(name = "buyer_profile_url") String str5, @C17402n(name = "create_date") Long l, @C17402n(name = "listing_only") boolean z, @C17402n(name = "listing_id") Long l2, @C17402n(name = "listing_title") String str6, @C17402n(name = "listing_images") List<String> list, @C17402n(name = "transaction_id") String str7) {
        this.image = image2;
        this.review = str;
        this.translatedReview = str2;
        this.rating = num;
        this.buyerAvatarUrl = str3;
        this.buyerName = str4;
        this.buyerProfileUrl = str5;
        this.createDate = l;
        this.isListingOnly = z;
        this.listingId = l2;
        this.listingTitle = str6;
        this.listingImages = list;
        this.transactionId = str7;
    }

    public static /* synthetic */ ReviewImage copy$default(ReviewImage reviewImage, Image image2, String str, String str2, Integer num, String str3, String str4, String str5, Long l, boolean z, Long l2, String str6, List list, String str7, int i, Object obj) {
        ReviewImage reviewImage2 = reviewImage;
        int i2 = i;
        return reviewImage.copy((i2 & 1) != 0 ? reviewImage2.image : image2, (i2 & 2) != 0 ? reviewImage2.review : str, (i2 & 4) != 0 ? reviewImage2.translatedReview : str2, (i2 & 8) != 0 ? reviewImage2.rating : num, (i2 & 16) != 0 ? reviewImage2.buyerAvatarUrl : str3, (i2 & 32) != 0 ? reviewImage2.buyerName : str4, (i2 & 64) != 0 ? reviewImage2.buyerProfileUrl : str5, (i2 & 128) != 0 ? reviewImage2.createDate : l, (i2 & 256) != 0 ? reviewImage2.isListingOnly : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? reviewImage2.listingId : l2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? reviewImage2.listingTitle : str6, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? reviewImage2.listingImages : list, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? reviewImage2.transactionId : str7);
    }

    public final Image component1() {
        return this.image;
    }

    public final Long component10() {
        return this.listingId;
    }

    public final String component11() {
        return this.listingTitle;
    }

    public final List<String> component12() {
        return this.listingImages;
    }

    public final String component13() {
        return this.transactionId;
    }

    public final String component2() {
        return this.review;
    }

    public final String component3() {
        return this.translatedReview;
    }

    public final Integer component4() {
        return this.rating;
    }

    public final String component5() {
        return this.buyerAvatarUrl;
    }

    public final String component6() {
        return this.buyerName;
    }

    public final String component7() {
        return this.buyerProfileUrl;
    }

    public final Long component8() {
        return this.createDate;
    }

    public final boolean component9() {
        return this.isListingOnly;
    }

    public final ReviewImage copy(@C17402n(name = "image") Image image2, @C17402n(name = "review_text") String str, @C17402n(name = "review_translated") String str2, @C17402n(name = "review_rating") Integer num, @C17402n(name = "buyer_avatar_url") String str3, @C17402n(name = "buyer_name") String str4, @C17402n(name = "buyer_profile_url") String str5, @C17402n(name = "create_date") Long l, @C17402n(name = "listing_only") boolean z, @C17402n(name = "listing_id") Long l2, @C17402n(name = "listing_title") String str6, @C17402n(name = "listing_images") List<String> list, @C17402n(name = "transaction_id") String str7) {
        return new ReviewImage(image2, str, str2, num, str3, str4, str5, l, z, l2, str6, list, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewImage)) {
            return false;
        }
        ReviewImage reviewImage = (ReviewImage) obj;
        return C19383o.m32792b(this.image, reviewImage.image) && C19383o.m32792b(this.review, reviewImage.review) && C19383o.m32792b(this.translatedReview, reviewImage.translatedReview) && C19383o.m32792b(this.rating, reviewImage.rating) && C19383o.m32792b(this.buyerAvatarUrl, reviewImage.buyerAvatarUrl) && C19383o.m32792b(this.buyerName, reviewImage.buyerName) && C19383o.m32792b(this.buyerProfileUrl, reviewImage.buyerProfileUrl) && C19383o.m32792b(this.createDate, reviewImage.createDate) && this.isListingOnly == reviewImage.isListingOnly && C19383o.m32792b(this.listingId, reviewImage.listingId) && C19383o.m32792b(this.listingTitle, reviewImage.listingTitle) && C19383o.m32792b(this.listingImages, reviewImage.listingImages) && C19383o.m32792b(this.transactionId, reviewImage.transactionId);
    }

    public final String getBuyerAvatarUrl() {
        return this.buyerAvatarUrl;
    }

    public final String getBuyerName() {
        return this.buyerName;
    }

    public final String getBuyerProfileUrl() {
        return this.buyerProfileUrl;
    }

    public final Long getCreateDate() {
        return this.createDate;
    }

    public final Image getImage() {
        return this.image;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final List<String> getListingImages() {
        return this.listingImages;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getReview() {
        return this.review;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTranslatedReview() {
        return this.translatedReview;
    }

    public int hashCode() {
        Image image2 = this.image;
        int i = 0;
        int hashCode = (image2 == null ? 0 : image2.hashCode()) * 31;
        String str = this.review;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.translatedReview;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.rating;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.buyerAvatarUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buyerName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buyerProfileUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.createDate;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.isListingOnly;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        Long l2 = this.listingId;
        int hashCode9 = (i2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.listingTitle;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.listingImages;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.transactionId;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode11 + i;
    }

    public final boolean isListingOnly() {
        return this.isListingOnly;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReviewImage(image=");
        h.append(this.image);
        h.append(", review=");
        h.append(this.review);
        h.append(", translatedReview=");
        h.append(this.translatedReview);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", buyerAvatarUrl=");
        h.append(this.buyerAvatarUrl);
        h.append(", buyerName=");
        h.append(this.buyerName);
        h.append(", buyerProfileUrl=");
        h.append(this.buyerProfileUrl);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", isListingOnly=");
        h.append(this.isListingOnly);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", listingTitle=");
        h.append(this.listingTitle);
        h.append(", listingImages=");
        h.append(this.listingImages);
        h.append(", transactionId=");
        return C0391c.m1057c(h, this.transactionId, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Image image2 = this.image;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.review);
        parcel.writeString(this.translatedReview);
        Integer num = this.rating;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeString(this.buyerAvatarUrl);
        parcel.writeString(this.buyerName);
        parcel.writeString(this.buyerProfileUrl);
        Long l = this.createDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        parcel.writeInt(this.isListingOnly ? 1 : 0);
        Long l2 = this.listingId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        parcel.writeString(this.listingTitle);
        parcel.writeStringList(this.listingImages);
        parcel.writeString(this.transactionId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReviewImage(com.etsy.android.lib.models.apiv3.listing.Image r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, boolean r23, java.lang.Long r24, java.lang.String r25, java.util.List r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ReviewImage.<init>(com.etsy.android.lib.models.apiv3.listing.Image, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, boolean, java.lang.Long, java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
