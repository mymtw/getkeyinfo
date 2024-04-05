package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class TransactionReview {
    public static final int $stable = 0;
    private final Long buyerUserId;
    private final Long createDate;
    private final Boolean isAnonymous;
    private final String language;
    private final Long listingId;
    private final Float rating;
    private final String review;
    private final Long transactionId;
    private final String translatedReview;

    public TransactionReview() {
        this((Long) null, (Long) null, (Boolean) null, (String) null, (Long) null, (Float) null, (String) null, (String) null, (Long) null, 511, (DefaultConstructorMarker) null);
    }

    public TransactionReview(@C17402n(name = "buyer_user_id") Long l, @C17402n(name = "create_date") Long l2, @C17402n(name = "is_anonymous") Boolean bool, @C17402n(name = "language") String str, @C17402n(name = "listing_id") Long l3, @C17402n(name = "rating") Float f, @C17402n(name = "review") String str2, @C17402n(name = "review_translated") String str3, @C17402n(name = "transaction_id") Long l4) {
        this.buyerUserId = l;
        this.createDate = l2;
        this.isAnonymous = bool;
        this.language = str;
        this.listingId = l3;
        this.rating = f;
        this.review = str2;
        this.translatedReview = str3;
        this.transactionId = l4;
    }

    public static /* synthetic */ TransactionReview copy$default(TransactionReview transactionReview, Long l, Long l2, Boolean bool, String str, Long l3, Float f, String str2, String str3, Long l4, int i, Object obj) {
        TransactionReview transactionReview2 = transactionReview;
        int i2 = i;
        return transactionReview.copy((i2 & 1) != 0 ? transactionReview2.buyerUserId : l, (i2 & 2) != 0 ? transactionReview2.createDate : l2, (i2 & 4) != 0 ? transactionReview2.isAnonymous : bool, (i2 & 8) != 0 ? transactionReview2.language : str, (i2 & 16) != 0 ? transactionReview2.listingId : l3, (i2 & 32) != 0 ? transactionReview2.rating : f, (i2 & 64) != 0 ? transactionReview2.review : str2, (i2 & 128) != 0 ? transactionReview2.translatedReview : str3, (i2 & 256) != 0 ? transactionReview2.transactionId : l4);
    }

    public final Long component1() {
        return this.buyerUserId;
    }

    public final Long component2() {
        return this.createDate;
    }

    public final Boolean component3() {
        return this.isAnonymous;
    }

    public final String component4() {
        return this.language;
    }

    public final Long component5() {
        return this.listingId;
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

    public final Long component9() {
        return this.transactionId;
    }

    public final TransactionReview copy(@C17402n(name = "buyer_user_id") Long l, @C17402n(name = "create_date") Long l2, @C17402n(name = "is_anonymous") Boolean bool, @C17402n(name = "language") String str, @C17402n(name = "listing_id") Long l3, @C17402n(name = "rating") Float f, @C17402n(name = "review") String str2, @C17402n(name = "review_translated") String str3, @C17402n(name = "transaction_id") Long l4) {
        return new TransactionReview(l, l2, bool, str, l3, f, str2, str3, l4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionReview)) {
            return false;
        }
        TransactionReview transactionReview = (TransactionReview) obj;
        return C19383o.m32792b(this.buyerUserId, transactionReview.buyerUserId) && C19383o.m32792b(this.createDate, transactionReview.createDate) && C19383o.m32792b(this.isAnonymous, transactionReview.isAnonymous) && C19383o.m32792b(this.language, transactionReview.language) && C19383o.m32792b(this.listingId, transactionReview.listingId) && C19383o.m32792b(this.rating, transactionReview.rating) && C19383o.m32792b(this.review, transactionReview.review) && C19383o.m32792b(this.translatedReview, transactionReview.translatedReview) && C19383o.m32792b(this.transactionId, transactionReview.transactionId);
    }

    public final Long getBuyerUserId() {
        return this.buyerUserId;
    }

    public final Long getCreateDate() {
        return this.createDate;
    }

    public final String getLanguage() {
        return this.language;
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

    public int hashCode() {
        Long l = this.buyerUserId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.createDate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.isAnonymous;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.language;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.listingId;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Float f = this.rating;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.review;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.translatedReview;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l4 = this.transactionId;
        if (l4 != null) {
            i = l4.hashCode();
        }
        return hashCode8 + i;
    }

    public final Boolean isAnonymous() {
        return this.isAnonymous;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TransactionReview(buyerUserId=");
        h.append(this.buyerUserId);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", isAnonymous=");
        h.append(this.isAnonymous);
        h.append(", language=");
        h.append(this.language);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", rating=");
        h.append(this.rating);
        h.append(", review=");
        h.append(this.review);
        h.append(", translatedReview=");
        h.append(this.translatedReview);
        h.append(", transactionId=");
        h.append(this.transactionId);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransactionReview(java.lang.Long r11, java.lang.Long r12, java.lang.Boolean r13, java.lang.String r14, java.lang.Long r15, java.lang.Float r16, java.lang.String r17, java.lang.String r18, java.lang.Long r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.TransactionReview.<init>(java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Float, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
