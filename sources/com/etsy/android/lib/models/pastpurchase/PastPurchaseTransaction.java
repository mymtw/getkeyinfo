package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PastPurchaseTransaction {
    public static final int $stable = 8;
    private final String currencyCode;
    private final PastPurchasesGiftCardDesign giftCardDesign;
    private final boolean isFeedbackMutable;
    private final boolean isGiftCard;
    private final PastPurchaseListing listing;
    private final PastPurchaseMainImage mainImage;
    private final String price;
    private final int quantity;
    private final PastPurchaseUser seller;
    private final String title;
    private final long transactionId;
    private final ReceiptUserReview userReview;

    public PastPurchaseTransaction(@C17402n(name = "transaction_id") long j, @C17402n(name = "quantity") int i, @C17402n(name = "is_gift_card") boolean z, @C17402n(name = "title") String str, @C17402n(name = "price") String str2, @C17402n(name = "currency_code") String str3, @C17402n(name = "is_feedback_mutable") boolean z2, @C17402n(name = "MainImage") PastPurchaseMainImage pastPurchaseMainImage, @C17402n(name = "GiftCardDesign") PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, @C17402n(name = "Listing") PastPurchaseListing pastPurchaseListing, @C17402n(name = "UserReview") ReceiptUserReview receiptUserReview, @C17402n(name = "Seller") PastPurchaseUser pastPurchaseUser) {
        this.transactionId = j;
        this.quantity = i;
        this.isGiftCard = z;
        this.title = str;
        this.price = str2;
        this.currencyCode = str3;
        this.isFeedbackMutable = z2;
        this.mainImage = pastPurchaseMainImage;
        this.giftCardDesign = pastPurchasesGiftCardDesign;
        this.listing = pastPurchaseListing;
        this.userReview = receiptUserReview;
        this.seller = pastPurchaseUser;
    }

    public static /* synthetic */ PastPurchaseTransaction copy$default(PastPurchaseTransaction pastPurchaseTransaction, long j, int i, boolean z, String str, String str2, String str3, boolean z2, PastPurchaseMainImage pastPurchaseMainImage, PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, PastPurchaseListing pastPurchaseListing, ReceiptUserReview receiptUserReview, PastPurchaseUser pastPurchaseUser, int i2, Object obj) {
        PastPurchaseTransaction pastPurchaseTransaction2 = pastPurchaseTransaction;
        int i3 = i2;
        return pastPurchaseTransaction.copy((i3 & 1) != 0 ? pastPurchaseTransaction2.transactionId : j, (i3 & 2) != 0 ? pastPurchaseTransaction2.quantity : i, (i3 & 4) != 0 ? pastPurchaseTransaction2.isGiftCard : z, (i3 & 8) != 0 ? pastPurchaseTransaction2.title : str, (i3 & 16) != 0 ? pastPurchaseTransaction2.price : str2, (i3 & 32) != 0 ? pastPurchaseTransaction2.currencyCode : str3, (i3 & 64) != 0 ? pastPurchaseTransaction2.isFeedbackMutable : z2, (i3 & 128) != 0 ? pastPurchaseTransaction2.mainImage : pastPurchaseMainImage, (i3 & 256) != 0 ? pastPurchaseTransaction2.giftCardDesign : pastPurchasesGiftCardDesign, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? pastPurchaseTransaction2.listing : pastPurchaseListing, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? pastPurchaseTransaction2.userReview : receiptUserReview, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? pastPurchaseTransaction2.seller : pastPurchaseUser);
    }

    public final long component1() {
        return this.transactionId;
    }

    public final PastPurchaseListing component10() {
        return this.listing;
    }

    public final ReceiptUserReview component11() {
        return this.userReview;
    }

    public final PastPurchaseUser component12() {
        return this.seller;
    }

    public final int component2() {
        return this.quantity;
    }

    public final boolean component3() {
        return this.isGiftCard;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.currencyCode;
    }

    public final boolean component7() {
        return this.isFeedbackMutable;
    }

    public final PastPurchaseMainImage component8() {
        return this.mainImage;
    }

    public final PastPurchasesGiftCardDesign component9() {
        return this.giftCardDesign;
    }

    public final PastPurchaseTransaction copy(@C17402n(name = "transaction_id") long j, @C17402n(name = "quantity") int i, @C17402n(name = "is_gift_card") boolean z, @C17402n(name = "title") String str, @C17402n(name = "price") String str2, @C17402n(name = "currency_code") String str3, @C17402n(name = "is_feedback_mutable") boolean z2, @C17402n(name = "MainImage") PastPurchaseMainImage pastPurchaseMainImage, @C17402n(name = "GiftCardDesign") PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, @C17402n(name = "Listing") PastPurchaseListing pastPurchaseListing, @C17402n(name = "UserReview") ReceiptUserReview receiptUserReview, @C17402n(name = "Seller") PastPurchaseUser pastPurchaseUser) {
        return new PastPurchaseTransaction(j, i, z, str, str2, str3, z2, pastPurchaseMainImage, pastPurchasesGiftCardDesign, pastPurchaseListing, receiptUserReview, pastPurchaseUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseTransaction)) {
            return false;
        }
        PastPurchaseTransaction pastPurchaseTransaction = (PastPurchaseTransaction) obj;
        return this.transactionId == pastPurchaseTransaction.transactionId && this.quantity == pastPurchaseTransaction.quantity && this.isGiftCard == pastPurchaseTransaction.isGiftCard && C19383o.m32792b(this.title, pastPurchaseTransaction.title) && C19383o.m32792b(this.price, pastPurchaseTransaction.price) && C19383o.m32792b(this.currencyCode, pastPurchaseTransaction.currencyCode) && this.isFeedbackMutable == pastPurchaseTransaction.isFeedbackMutable && C19383o.m32792b(this.mainImage, pastPurchaseTransaction.mainImage) && C19383o.m32792b(this.giftCardDesign, pastPurchaseTransaction.giftCardDesign) && C19383o.m32792b(this.listing, pastPurchaseTransaction.listing) && C19383o.m32792b(this.userReview, pastPurchaseTransaction.userReview) && C19383o.m32792b(this.seller, pastPurchaseTransaction.seller);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final PastPurchasesGiftCardDesign getGiftCardDesign() {
        return this.giftCardDesign;
    }

    public final PastPurchaseListing getListing() {
        return this.listing;
    }

    public final PastPurchaseMainImage getMainImage() {
        return this.mainImage;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final PastPurchaseUser getSeller() {
        return this.seller;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getTransactionId() {
        return this.transactionId;
    }

    public final ReceiptUserReview getUserReview() {
        return this.userReview;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.quantity, Long.hashCode(this.transactionId) * 31, 31);
        boolean z = this.isGiftCard;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.title;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.isFeedbackMutable;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode3 + (z2 ? 1 : 0)) * 31;
        PastPurchaseMainImage pastPurchaseMainImage = this.mainImage;
        int hashCode4 = (i3 + (pastPurchaseMainImage == null ? 0 : pastPurchaseMainImage.hashCode())) * 31;
        PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign = this.giftCardDesign;
        int hashCode5 = (hashCode4 + (pastPurchasesGiftCardDesign == null ? 0 : pastPurchasesGiftCardDesign.hashCode())) * 31;
        PastPurchaseListing pastPurchaseListing = this.listing;
        int hashCode6 = (hashCode5 + (pastPurchaseListing == null ? 0 : pastPurchaseListing.hashCode())) * 31;
        ReceiptUserReview receiptUserReview = this.userReview;
        int hashCode7 = (hashCode6 + (receiptUserReview == null ? 0 : receiptUserReview.hashCode())) * 31;
        PastPurchaseUser pastPurchaseUser = this.seller;
        if (pastPurchaseUser != null) {
            i2 = pastPurchaseUser.hashCode();
        }
        return hashCode7 + i2;
    }

    public final boolean isFeedbackMutable() {
        return this.isFeedbackMutable;
    }

    public final boolean isGiftCard() {
        return this.isGiftCard;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseTransaction(transactionId=");
        h.append(this.transactionId);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", isGiftCard=");
        h.append(this.isGiftCard);
        h.append(", title=");
        h.append(this.title);
        h.append(", price=");
        h.append(this.price);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", isFeedbackMutable=");
        h.append(this.isFeedbackMutable);
        h.append(", mainImage=");
        h.append(this.mainImage);
        h.append(", giftCardDesign=");
        h.append(this.giftCardDesign);
        h.append(", listing=");
        h.append(this.listing);
        h.append(", userReview=");
        h.append(this.userReview);
        h.append(", seller=");
        h.append(this.seller);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PastPurchaseTransaction(long r18, int r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage r26, com.etsy.android.lib.models.pastpurchase.PastPurchasesGiftCardDesign r27, com.etsy.android.lib.models.pastpurchase.PastPurchaseListing r28, com.etsy.android.lib.models.pastpurchase.ReceiptUserReview r29, com.etsy.android.lib.models.pastpurchase.PastPurchaseUser r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r21
        L_0x000b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r3
            goto L_0x0014
        L_0x0012:
            r8 = r22
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r9 = r3
            goto L_0x001c
        L_0x001a:
            r9 = r23
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r10 = r3
            goto L_0x0024
        L_0x0022:
            r10 = r24
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r25
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r12 = r3
            goto L_0x0034
        L_0x0032:
            r12 = r26
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r13 = r3
            goto L_0x003c
        L_0x003a:
            r13 = r27
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r14 = r3
            goto L_0x0044
        L_0x0042:
            r14 = r28
        L_0x0044:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r15 = r3
            goto L_0x004c
        L_0x004a:
            r15 = r29
        L_0x004c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0053
            r16 = r3
            goto L_0x0055
        L_0x0053:
            r16 = r30
        L_0x0055:
            r3 = r17
            r4 = r18
            r6 = r20
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction.<init>(long, int, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage, com.etsy.android.lib.models.pastpurchase.PastPurchasesGiftCardDesign, com.etsy.android.lib.models.pastpurchase.PastPurchaseListing, com.etsy.android.lib.models.pastpurchase.ReceiptUserReview, com.etsy.android.lib.models.pastpurchase.PastPurchaseUser, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
