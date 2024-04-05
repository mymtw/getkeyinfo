package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Transaction {
    public static final int $stable = 0;
    private final String currencyCode;
    private final Integer feedbackOpenDate;
    private final PastPurchasesGiftCardDesign giftCardDesign;
    private final GiftCardInfoV3 giftCardInfo;
    private final Boolean isFeedbackMutable;
    private final Boolean isGiftCard;
    private final Boolean isQuickListing;
    private final Listing listing;
    private final Long listingId;
    private final MainImage mainImage;
    private final Long paidTsz;
    private final String price;
    private final Integer quantity;
    private final String shippingCost;
    private final String title;
    private final Long transactionId;
    private final ReceiptUserReview userReview;

    public Transaction(@C17402n(name = "transaction_id") Long l, @C17402n(name = "quantity") Integer num, @C17402n(name = "is_gift_card") Boolean bool, @C17402n(name = "title") String str, @C17402n(name = "price") String str2, @C17402n(name = "currency_code") String str3, @C17402n(name = "is_feedback_mutable") Boolean bool2, @C17402n(name = "listing_id") Long l2, @C17402n(name = "shipping_cost") String str4, @C17402n(name = "feedback_open_date") Integer num2, @C17402n(name = "is_quick_listing") Boolean bool3, @C17402n(name = "paid_tsz") Long l3, @C17402n(name = "listing") Listing listing2, @C17402n(name = "main_image") MainImage mainImage2, @C17402n(name = "gift_card_design") PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, @C17402n(name = "gift_card_info") GiftCardInfoV3 giftCardInfoV3, @C17402n(name = "user_review") ReceiptUserReview receiptUserReview) {
        this.transactionId = l;
        this.quantity = num;
        this.isGiftCard = bool;
        this.title = str;
        this.price = str2;
        this.currencyCode = str3;
        this.isFeedbackMutable = bool2;
        this.listingId = l2;
        this.shippingCost = str4;
        this.feedbackOpenDate = num2;
        this.isQuickListing = bool3;
        this.paidTsz = l3;
        this.listing = listing2;
        this.mainImage = mainImage2;
        this.giftCardDesign = pastPurchasesGiftCardDesign;
        this.giftCardInfo = giftCardInfoV3;
        this.userReview = receiptUserReview;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, Long l, Integer num, Boolean bool, String str, String str2, String str3, Boolean bool2, Long l2, String str4, Integer num2, Boolean bool3, Long l3, Listing listing2, MainImage mainImage2, PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, GiftCardInfoV3 giftCardInfoV3, ReceiptUserReview receiptUserReview, int i, Object obj) {
        Transaction transaction2 = transaction;
        int i2 = i;
        return transaction.copy((i2 & 1) != 0 ? transaction2.transactionId : l, (i2 & 2) != 0 ? transaction2.quantity : num, (i2 & 4) != 0 ? transaction2.isGiftCard : bool, (i2 & 8) != 0 ? transaction2.title : str, (i2 & 16) != 0 ? transaction2.price : str2, (i2 & 32) != 0 ? transaction2.currencyCode : str3, (i2 & 64) != 0 ? transaction2.isFeedbackMutable : bool2, (i2 & 128) != 0 ? transaction2.listingId : l2, (i2 & 256) != 0 ? transaction2.shippingCost : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? transaction2.feedbackOpenDate : num2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? transaction2.isQuickListing : bool3, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? transaction2.paidTsz : l3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? transaction2.listing : listing2, (i2 & 8192) != 0 ? transaction2.mainImage : mainImage2, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? transaction2.giftCardDesign : pastPurchasesGiftCardDesign, (i2 & 32768) != 0 ? transaction2.giftCardInfo : giftCardInfoV3, (i2 & 65536) != 0 ? transaction2.userReview : receiptUserReview);
    }

    public final Long component1() {
        return this.transactionId;
    }

    public final Integer component10() {
        return this.feedbackOpenDate;
    }

    public final Boolean component11() {
        return this.isQuickListing;
    }

    public final Long component12() {
        return this.paidTsz;
    }

    public final Listing component13() {
        return this.listing;
    }

    public final MainImage component14() {
        return this.mainImage;
    }

    public final PastPurchasesGiftCardDesign component15() {
        return this.giftCardDesign;
    }

    public final GiftCardInfoV3 component16() {
        return this.giftCardInfo;
    }

    public final ReceiptUserReview component17() {
        return this.userReview;
    }

    public final Integer component2() {
        return this.quantity;
    }

    public final Boolean component3() {
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

    public final Boolean component7() {
        return this.isFeedbackMutable;
    }

    public final Long component8() {
        return this.listingId;
    }

    public final String component9() {
        return this.shippingCost;
    }

    public final Transaction copy(@C17402n(name = "transaction_id") Long l, @C17402n(name = "quantity") Integer num, @C17402n(name = "is_gift_card") Boolean bool, @C17402n(name = "title") String str, @C17402n(name = "price") String str2, @C17402n(name = "currency_code") String str3, @C17402n(name = "is_feedback_mutable") Boolean bool2, @C17402n(name = "listing_id") Long l2, @C17402n(name = "shipping_cost") String str4, @C17402n(name = "feedback_open_date") Integer num2, @C17402n(name = "is_quick_listing") Boolean bool3, @C17402n(name = "paid_tsz") Long l3, @C17402n(name = "listing") Listing listing2, @C17402n(name = "main_image") MainImage mainImage2, @C17402n(name = "gift_card_design") PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, @C17402n(name = "gift_card_info") GiftCardInfoV3 giftCardInfoV3, @C17402n(name = "user_review") ReceiptUserReview receiptUserReview) {
        return new Transaction(l, num, bool, str, str2, str3, bool2, l2, str4, num2, bool3, l3, listing2, mainImage2, pastPurchasesGiftCardDesign, giftCardInfoV3, receiptUserReview);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return C19383o.m32792b(this.transactionId, transaction.transactionId) && C19383o.m32792b(this.quantity, transaction.quantity) && C19383o.m32792b(this.isGiftCard, transaction.isGiftCard) && C19383o.m32792b(this.title, transaction.title) && C19383o.m32792b(this.price, transaction.price) && C19383o.m32792b(this.currencyCode, transaction.currencyCode) && C19383o.m32792b(this.isFeedbackMutable, transaction.isFeedbackMutable) && C19383o.m32792b(this.listingId, transaction.listingId) && C19383o.m32792b(this.shippingCost, transaction.shippingCost) && C19383o.m32792b(this.feedbackOpenDate, transaction.feedbackOpenDate) && C19383o.m32792b(this.isQuickListing, transaction.isQuickListing) && C19383o.m32792b(this.paidTsz, transaction.paidTsz) && C19383o.m32792b(this.listing, transaction.listing) && C19383o.m32792b(this.mainImage, transaction.mainImage) && C19383o.m32792b(this.giftCardDesign, transaction.giftCardDesign) && C19383o.m32792b(this.giftCardInfo, transaction.giftCardInfo) && C19383o.m32792b(this.userReview, transaction.userReview);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Integer getFeedbackOpenDate() {
        return this.feedbackOpenDate;
    }

    public final PastPurchasesGiftCardDesign getGiftCardDesign() {
        return this.giftCardDesign;
    }

    public final GiftCardInfoV3 getGiftCardInfo() {
        return this.giftCardInfo;
    }

    public final Listing getListing() {
        return this.listing;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final MainImage getMainImage() {
        return this.mainImage;
    }

    public final Long getPaidTsz() {
        return this.paidTsz;
    }

    public final String getPrice() {
        return this.price;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getShippingCost() {
        return this.shippingCost;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTransactionId() {
        return this.transactionId;
    }

    public final ReceiptUserReview getUserReview() {
        return this.userReview;
    }

    public int hashCode() {
        Long l = this.transactionId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.quantity;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isGiftCard;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyCode;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isFeedbackMutable;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.listingId;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.shippingCost;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.feedbackOpenDate;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.isQuickListing;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l3 = this.paidTsz;
        int hashCode12 = (hashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Listing listing2 = this.listing;
        int hashCode13 = (hashCode12 + (listing2 == null ? 0 : listing2.hashCode())) * 31;
        MainImage mainImage2 = this.mainImage;
        int hashCode14 = (hashCode13 + (mainImage2 == null ? 0 : mainImage2.hashCode())) * 31;
        PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign = this.giftCardDesign;
        int hashCode15 = (hashCode14 + (pastPurchasesGiftCardDesign == null ? 0 : pastPurchasesGiftCardDesign.hashCode())) * 31;
        GiftCardInfoV3 giftCardInfoV3 = this.giftCardInfo;
        int hashCode16 = (hashCode15 + (giftCardInfoV3 == null ? 0 : giftCardInfoV3.hashCode())) * 31;
        ReceiptUserReview receiptUserReview = this.userReview;
        if (receiptUserReview != null) {
            i = receiptUserReview.hashCode();
        }
        return hashCode16 + i;
    }

    public final Boolean isFeedbackMutable() {
        return this.isFeedbackMutable;
    }

    public final Boolean isGiftCard() {
        return this.isGiftCard;
    }

    public final Boolean isQuickListing() {
        return this.isQuickListing;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Transaction(transactionId=");
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
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", shippingCost=");
        h.append(this.shippingCost);
        h.append(", feedbackOpenDate=");
        h.append(this.feedbackOpenDate);
        h.append(", isQuickListing=");
        h.append(this.isQuickListing);
        h.append(", paidTsz=");
        h.append(this.paidTsz);
        h.append(", listing=");
        h.append(this.listing);
        h.append(", mainImage=");
        h.append(this.mainImage);
        h.append(", giftCardDesign=");
        h.append(this.giftCardDesign);
        h.append(", giftCardInfo=");
        h.append(this.giftCardInfo);
        h.append(", userReview=");
        h.append(this.userReview);
        h.append(')');
        return h.toString();
    }
}
