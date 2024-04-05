package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class PastPurchaseReceiptV3JsonAdapter extends JsonAdapter<PastPurchaseReceiptV3> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Buyer> nullableBuyerAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Coupons>> nullableListOfNullableCouponsAdapter;
    private final JsonAdapter<List<Shipment>> nullableListOfNullableShipmentAdapter;
    private final JsonAdapter<List<Transaction>> nullableListOfNullableTransactionAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Seller> nullableSellerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", ResponseConstants.FIRST_LINE, ResponseConstants.SECOND_LINE, "city", "state", ResponseConstants.ZIP, "message_from_payment", "message_from_seller", "total_vat_cost", "discount_amt", ResponseConstants.CURRENCY_CODE, "payment_email", "was_giftcard_balance_applied", "buyer_primary_gc_amt", "donation_terms_link_text", "is_in_person", "donation_terms_link_url", "message_from_buyer", "donation_description", "payment_method", "multi_shop_note", ResponseConstants.TOTAL_PRICE, ResponseConstants.RECEIPT_ID, "etsy_coupon_discount_amt", "was_shipped", "payment_method_name", "total_shipping_cost", "is_gift", "in_person_payment_type", "was_paid", ResponseConstants.CREATION_TSZ, "subtotal", "total_tax_cost", "needs_gift_wrap", "grandtotal", "adjusted_grandtotal", "buyer_adjusted_grandtotal", "flagged_for_manual_fraud_review", "gift_message", "is_anonymous_buyer", ResponseConstants.STATUS, "shipped_tsz", "estimated_shipped_tsz", ResponseConstants.TRANSPARENT_PRICE_MESSAGE, "coupons", ResponseConstants.TRANSACTIONS, "shipments", "seller", "buyer");

    public PastPurchaseReceiptV3JsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "name");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "wasGiftCardBalanceApplied");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "receiptId");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.STATUS);
        this.nullableListOfNullableCouponsAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Coupons.class), emptySet, "coupons");
        this.nullableListOfNullableTransactionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Transaction.class), emptySet, ResponseConstants.TRANSACTIONS);
        this.nullableListOfNullableShipmentAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Shipment.class), emptySet, "shipments");
        this.nullableSellerAdapter = yVar2.mo68558c(Seller.class, emptySet, "seller");
        this.nullableBuyerAdapter = yVar2.mo68558c(Buyer.class, emptySet, "buyer");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseReceiptV3)";
    }

    public PastPurchaseReceiptV3 fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Boolean bool = null;
        String str13 = null;
        String str14 = null;
        Boolean bool2 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        Long l = null;
        String str21 = null;
        Boolean bool3 = null;
        String str22 = null;
        String str23 = null;
        Boolean bool4 = null;
        String str24 = null;
        Boolean bool5 = null;
        Long l2 = null;
        String str25 = null;
        String str26 = null;
        Boolean bool6 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        Boolean bool7 = null;
        String str30 = null;
        Boolean bool8 = null;
        Integer num = null;
        Long l3 = null;
        Long l4 = null;
        String str31 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        Seller seller = null;
        Buyer buyer = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    str16 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    str17 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 19:
                    str18 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 20:
                    str19 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 21:
                    str20 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 22:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 23:
                    str21 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 24:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 25:
                    str22 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 26:
                    str23 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 27:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 28:
                    str24 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 29:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 30:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 31:
                    str25 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 32:
                    str26 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 33:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 34:
                    str27 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 35:
                    str28 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 36:
                    str29 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 37:
                    bool7 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 38:
                    str30 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 39:
                    bool8 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 40:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 41:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 42:
                    l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 43:
                    str31 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 44:
                    list = this.nullableListOfNullableCouponsAdapter.fromJson(jsonReader2);
                    break;
                case 45:
                    list2 = this.nullableListOfNullableTransactionAdapter.fromJson(jsonReader2);
                    break;
                case 46:
                    list3 = this.nullableListOfNullableShipmentAdapter.fromJson(jsonReader2);
                    break;
                case 47:
                    seller = this.nullableSellerAdapter.fromJson(jsonReader2);
                    break;
                case 48:
                    buyer = this.nullableBuyerAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new PastPurchaseReceiptV3(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, bool, str13, str14, bool2, str15, str16, str17, str18, str19, str20, l, str21, bool3, str22, str23, bool4, str24, bool5, l2, str25, str26, bool6, str27, str28, str29, bool7, str30, bool8, num, l3, l4, str31, list, list2, list3, seller, buyer);
    }

    public void toJson(C17412w wVar, PastPurchaseReceiptV3 pastPurchaseReceiptV3) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseReceiptV3 != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getName());
            wVar.mo68529h(ResponseConstants.FIRST_LINE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getFirstLine());
            wVar.mo68529h(ResponseConstants.SECOND_LINE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getSecondLine());
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getCity());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getState());
            wVar.mo68529h(ResponseConstants.ZIP);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getZip());
            wVar.mo68529h("message_from_payment");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getMessageFromPayment());
            wVar.mo68529h("message_from_seller");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getMessageFromSeller());
            wVar.mo68529h("total_vat_cost");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getTotalVatCost());
            wVar.mo68529h("discount_amt");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getDiscountAmt());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getCurrencyCode());
            wVar.mo68529h("payment_email");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getPaymentEmail());
            wVar.mo68529h("was_giftcard_balance_applied");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.getWasGiftCardBalanceApplied());
            wVar.mo68529h("buyer_primary_gc_amt");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getGiftCardAmountApplied());
            wVar.mo68529h("donation_terms_link_text");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getDonationTermsLinkText());
            wVar.mo68529h("is_in_person");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.isInPerson());
            wVar.mo68529h("donation_terms_link_url");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getDonationTermsLinkUrl());
            wVar.mo68529h("message_from_buyer");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getMessageFromBuyer());
            wVar.mo68529h("donation_description");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getDonationDescription());
            wVar.mo68529h("payment_method");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getPaymentMethod());
            wVar.mo68529h("multi_shop_note");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getMultiShopNote());
            wVar.mo68529h(ResponseConstants.TOTAL_PRICE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getTotalPrice());
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.nullableLongAdapter.toJson(wVar, pastPurchaseReceiptV3.getReceiptId());
            wVar.mo68529h("etsy_coupon_discount_amt");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getEtsyCouponDiscountAmt());
            wVar.mo68529h("was_shipped");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.getWasShipped());
            wVar.mo68529h("payment_method_name");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getPaymentMethodName());
            wVar.mo68529h("total_shipping_cost");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getTotalShippingCost());
            wVar.mo68529h("is_gift");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.isGift());
            wVar.mo68529h("in_person_payment_type");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getInPersonPaymentType());
            wVar.mo68529h("was_paid");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.getWasPaid());
            wVar.mo68529h(ResponseConstants.CREATION_TSZ);
            this.nullableLongAdapter.toJson(wVar, pastPurchaseReceiptV3.getCreationTsz());
            wVar.mo68529h("subtotal");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getSubtotal());
            wVar.mo68529h("total_tax_cost");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getTotalTaxCost());
            wVar.mo68529h("needs_gift_wrap");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.getNeedsGiftWrap());
            wVar.mo68529h("grandtotal");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getGrandTotal());
            wVar.mo68529h("adjusted_grandtotal");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getAdjustedGrandTotal());
            wVar.mo68529h("buyer_adjusted_grandtotal");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getBuyerAdjustedGrandTotal());
            wVar.mo68529h("flagged_for_manual_fraud_review");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.getFlaggedForManualFraudReview());
            wVar.mo68529h("gift_message");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getGiftMessage());
            wVar.mo68529h("is_anonymous_buyer");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceiptV3.isAnonymousBuyer());
            wVar.mo68529h(ResponseConstants.STATUS);
            this.nullableIntAdapter.toJson(wVar, pastPurchaseReceiptV3.getStatus());
            wVar.mo68529h("shipped_tsz");
            this.nullableLongAdapter.toJson(wVar, pastPurchaseReceiptV3.getShippedDate());
            wVar.mo68529h("estimated_shipped_tsz");
            this.nullableLongAdapter.toJson(wVar, pastPurchaseReceiptV3.getEstimatedShippedDate());
            wVar.mo68529h(ResponseConstants.TRANSPARENT_PRICE_MESSAGE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceiptV3.getTransparentPriceMessage());
            wVar.mo68529h("coupons");
            this.nullableListOfNullableCouponsAdapter.toJson(wVar, pastPurchaseReceiptV3.getCoupons());
            wVar.mo68529h(ResponseConstants.TRANSACTIONS);
            this.nullableListOfNullableTransactionAdapter.toJson(wVar, pastPurchaseReceiptV3.getTransactions());
            wVar.mo68529h("shipments");
            this.nullableListOfNullableShipmentAdapter.toJson(wVar, pastPurchaseReceiptV3.getShipments());
            wVar.mo68529h("seller");
            this.nullableSellerAdapter.toJson(wVar, pastPurchaseReceiptV3.getSeller());
            wVar.mo68529h("buyer");
            this.nullableBuyerAdapter.toJson(wVar, pastPurchaseReceiptV3.getBuyer());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
