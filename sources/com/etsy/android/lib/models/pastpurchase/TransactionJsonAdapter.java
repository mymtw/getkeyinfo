package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class TransactionJsonAdapter extends JsonAdapter<Transaction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<GiftCardInfoV3> nullableGiftCardInfoV3Adapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Listing> nullableListingAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<MainImage> nullableMainImageAdapter;
    private final JsonAdapter<PastPurchasesGiftCardDesign> nullablePastPurchasesGiftCardDesignAdapter;
    private final JsonAdapter<ReceiptUserReview> nullableReceiptUserReviewAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.TRANSACTION_ID, ResponseConstants.QUANTITY, ResponseConstants.IS_GIFT_CARD, "title", ResponseConstants.PRICE, ResponseConstants.CURRENCY_CODE, ResponseConstants.IS_FEEDBACK_MUTABLE, "listing_id", "shipping_cost", ResponseConstants.FEEDBACK_OPEN_DATE, "is_quick_listing", "paid_tsz", ResponseConstants.LISTING, "main_image", "gift_card_design", ResponseConstants.GIFT_CARD_INFO, "user_review");

    public TransactionJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "transactionId");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.QUANTITY);
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "isGiftCard");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "title");
        this.nullableListingAdapter = yVar2.mo68558c(Listing.class, emptySet, ResponseConstants.LISTING);
        this.nullableMainImageAdapter = yVar2.mo68558c(MainImage.class, emptySet, "mainImage");
        this.nullablePastPurchasesGiftCardDesignAdapter = yVar2.mo68558c(PastPurchasesGiftCardDesign.class, emptySet, "giftCardDesign");
        this.nullableGiftCardInfoV3Adapter = yVar2.mo68558c(GiftCardInfoV3.class, emptySet, "giftCardInfo");
        this.nullableReceiptUserReviewAdapter = yVar2.mo68558c(ReceiptUserReview.class, emptySet, "userReview");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Transaction)";
    }

    public Transaction fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Long l = null;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        Long l2 = null;
        String str4 = null;
        Integer num2 = null;
        Boolean bool3 = null;
        Long l3 = null;
        Listing listing = null;
        MainImage mainImage = null;
        PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign = null;
        GiftCardInfoV3 giftCardInfoV3 = null;
        ReceiptUserReview receiptUserReview = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    listing = this.nullableListingAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    mainImage = this.nullableMainImageAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    pastPurchasesGiftCardDesign = this.nullablePastPurchasesGiftCardDesignAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    giftCardInfoV3 = this.nullableGiftCardInfoV3Adapter.fromJson(jsonReader2);
                    break;
                case 16:
                    receiptUserReview = this.nullableReceiptUserReviewAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Transaction(l, num, bool, str, str2, str3, bool2, l2, str4, num2, bool3, l3, listing, mainImage, pastPurchasesGiftCardDesign, giftCardInfoV3, receiptUserReview);
    }

    public void toJson(C17412w wVar, Transaction transaction) {
        C19383o.m32797g(wVar, "writer");
        if (transaction != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.TRANSACTION_ID);
            this.nullableLongAdapter.toJson(wVar, transaction.getTransactionId());
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableIntAdapter.toJson(wVar, transaction.getQuantity());
            wVar.mo68529h(ResponseConstants.IS_GIFT_CARD);
            this.nullableBooleanAdapter.toJson(wVar, transaction.isGiftCard());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, transaction.getTitle());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, transaction.getPrice());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, transaction.getCurrencyCode());
            wVar.mo68529h(ResponseConstants.IS_FEEDBACK_MUTABLE);
            this.nullableBooleanAdapter.toJson(wVar, transaction.isFeedbackMutable());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, transaction.getListingId());
            wVar.mo68529h("shipping_cost");
            this.nullableStringAdapter.toJson(wVar, transaction.getShippingCost());
            wVar.mo68529h(ResponseConstants.FEEDBACK_OPEN_DATE);
            this.nullableIntAdapter.toJson(wVar, transaction.getFeedbackOpenDate());
            wVar.mo68529h("is_quick_listing");
            this.nullableBooleanAdapter.toJson(wVar, transaction.isQuickListing());
            wVar.mo68529h("paid_tsz");
            this.nullableLongAdapter.toJson(wVar, transaction.getPaidTsz());
            wVar.mo68529h(ResponseConstants.LISTING);
            this.nullableListingAdapter.toJson(wVar, transaction.getListing());
            wVar.mo68529h("main_image");
            this.nullableMainImageAdapter.toJson(wVar, transaction.getMainImage());
            wVar.mo68529h("gift_card_design");
            this.nullablePastPurchasesGiftCardDesignAdapter.toJson(wVar, transaction.getGiftCardDesign());
            wVar.mo68529h(ResponseConstants.GIFT_CARD_INFO);
            this.nullableGiftCardInfoV3Adapter.toJson(wVar, transaction.getGiftCardInfo());
            wVar.mo68529h("user_review");
            this.nullableReceiptUserReviewAdapter.toJson(wVar, transaction.getUserReview());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
