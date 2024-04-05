package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ReviewVideo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReviewVideo> CREATOR = new Creator();
    private final String buyerName;
    private final Long createDate;
    private final Boolean isBuyerActive;
    private final Long listingId;
    private final Float rating;
    private final String review;
    private final Long transactionId;
    private final String translatedReview;
    private final Video video;

    public static final class Creator implements Parcelable.Creator<ReviewVideo> {
        public final ReviewVideo createFromParcel(Parcel parcel) {
            Boolean bool;
            C19383o.m32797g(parcel, "parcel");
            Video createFromParcel = parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel);
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ReviewVideo(createFromParcel, valueOf, valueOf2, valueOf3, readString, readString2, readString3, bool, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        public final ReviewVideo[] newArray(int i) {
            return new ReviewVideo[i];
        }
    }

    public ReviewVideo() {
        this((Video) null, (Long) null, (Long) null, (Float) null, (String) null, (String) null, (String) null, (Boolean) null, (Long) null, 511, (DefaultConstructorMarker) null);
    }

    public ReviewVideo(@C17402n(name = "video") Video video2, @C17402n(name = "transaction_id") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "review_rating") Float f, @C17402n(name = "review_text") String str, @C17402n(name = "review_translated") String str2, @C17402n(name = "buyer_name") String str3, @C17402n(name = "buyer_is_active") Boolean bool, @C17402n(name = "create_date") Long l3) {
        this.video = video2;
        this.transactionId = l;
        this.listingId = l2;
        this.rating = f;
        this.review = str;
        this.translatedReview = str2;
        this.buyerName = str3;
        this.isBuyerActive = bool;
        this.createDate = l3;
    }

    public static /* synthetic */ ReviewVideo copy$default(ReviewVideo reviewVideo, Video video2, Long l, Long l2, Float f, String str, String str2, String str3, Boolean bool, Long l3, int i, Object obj) {
        ReviewVideo reviewVideo2 = reviewVideo;
        int i2 = i;
        return reviewVideo.copy((i2 & 1) != 0 ? reviewVideo2.video : video2, (i2 & 2) != 0 ? reviewVideo2.transactionId : l, (i2 & 4) != 0 ? reviewVideo2.listingId : l2, (i2 & 8) != 0 ? reviewVideo2.rating : f, (i2 & 16) != 0 ? reviewVideo2.review : str, (i2 & 32) != 0 ? reviewVideo2.translatedReview : str2, (i2 & 64) != 0 ? reviewVideo2.buyerName : str3, (i2 & 128) != 0 ? reviewVideo2.isBuyerActive : bool, (i2 & 256) != 0 ? reviewVideo2.createDate : l3);
    }

    public final Video component1() {
        return this.video;
    }

    public final Long component2() {
        return this.transactionId;
    }

    public final Long component3() {
        return this.listingId;
    }

    public final Float component4() {
        return this.rating;
    }

    public final String component5() {
        return this.review;
    }

    public final String component6() {
        return this.translatedReview;
    }

    public final String component7() {
        return this.buyerName;
    }

    public final Boolean component8() {
        return this.isBuyerActive;
    }

    public final Long component9() {
        return this.createDate;
    }

    public final ReviewVideo copy(@C17402n(name = "video") Video video2, @C17402n(name = "transaction_id") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "review_rating") Float f, @C17402n(name = "review_text") String str, @C17402n(name = "review_translated") String str2, @C17402n(name = "buyer_name") String str3, @C17402n(name = "buyer_is_active") Boolean bool, @C17402n(name = "create_date") Long l3) {
        return new ReviewVideo(video2, l, l2, f, str, str2, str3, bool, l3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewVideo)) {
            return false;
        }
        ReviewVideo reviewVideo = (ReviewVideo) obj;
        return C19383o.m32792b(this.video, reviewVideo.video) && C19383o.m32792b(this.transactionId, reviewVideo.transactionId) && C19383o.m32792b(this.listingId, reviewVideo.listingId) && C19383o.m32792b(this.rating, reviewVideo.rating) && C19383o.m32792b(this.review, reviewVideo.review) && C19383o.m32792b(this.translatedReview, reviewVideo.translatedReview) && C19383o.m32792b(this.buyerName, reviewVideo.buyerName) && C19383o.m32792b(this.isBuyerActive, reviewVideo.isBuyerActive) && C19383o.m32792b(this.createDate, reviewVideo.createDate);
    }

    public final String getBuyerName() {
        return this.buyerName;
    }

    public final Long getCreateDate() {
        return this.createDate;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final String getReview() {
        return this.review;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public final String getTranslatedReview() {
        return this.translatedReview;
    }

    public final Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        Video video2 = this.video;
        int i = 0;
        int hashCode = (video2 == null ? 0 : video2.hashCode()) * 31;
        Long l = this.transactionId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.listingId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.rating;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.review;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.translatedReview;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyerName;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isBuyerActive;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l3 = this.createDate;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode8 + i;
    }

    public final Boolean isBuyerActive() {
        return this.isBuyerActive;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReviewVideo(video=");
        h.append(this.video);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", review=");
        h.append(this.review);
        h.append(", translatedReview=");
        h.append(this.translatedReview);
        h.append(", buyerName=");
        h.append(this.buyerName);
        h.append(", isBuyerActive=");
        h.append(this.isBuyerActive);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Video video2 = this.video;
        if (video2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video2.writeToParcel(parcel, i);
        }
        Long l = this.transactionId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        Long l2 = this.listingId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.review);
        parcel.writeString(this.translatedReview);
        parcel.writeString(this.buyerName);
        Boolean bool = this.isBuyerActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l3 = this.createDate;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReviewVideo(com.etsy.android.lib.models.apiv3.listing.Video r11, java.lang.Long r12, java.lang.Long r13, java.lang.Float r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.Long r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ReviewVideo.<init>(com.etsy.android.lib.models.apiv3.listing.Video, java.lang.Long, java.lang.Long, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
