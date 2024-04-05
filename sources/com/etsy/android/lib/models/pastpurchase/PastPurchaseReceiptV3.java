package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PastPurchaseReceiptV3 {
    public static final int $stable = 8;
    private final String adjustedGrandTotal;
    private final Buyer buyer;
    private final String buyerAdjustedGrandTotal;
    private final String city;
    private final List<Coupons> coupons;
    private final Long creationTsz;
    private final String currencyCode;
    private final String discountAmt;
    private final String donationDescription;
    private final String donationTermsLinkText;
    private final String donationTermsLinkUrl;
    private final Long estimatedShippedDate;
    private final String etsyCouponDiscountAmt;
    private final String firstLine;
    private final Boolean flaggedForManualFraudReview;
    private final String giftCardAmountApplied;
    private final String giftMessage;
    private final String grandTotal;
    private final String inPersonPaymentType;
    private final Boolean isAnonymousBuyer;
    private final Boolean isGift;
    private final Boolean isInPerson;
    private final String messageFromBuyer;
    private final String messageFromPayment;
    private final String messageFromSeller;
    private final String multiShopNote;
    private final String name;
    private final Boolean needsGiftWrap;
    private final String paymentEmail;
    private final String paymentMethod;
    private final String paymentMethodName;
    private final Long receiptId;
    private final String secondLine;
    private final Seller seller;
    private final List<Shipment> shipments;
    private final Long shippedDate;
    private final String state;
    private final Integer status;
    private final String subtotal;
    private final String totalPrice;
    private final String totalShippingCost;
    private final String totalTaxCost;
    private final String totalVatCost;
    private final List<Transaction> transactions;
    private final String transparentPriceMessage;
    private final Boolean wasGiftCardBalanceApplied;
    private final Boolean wasPaid;
    private final Boolean wasShipped;
    private final String zip;

    public PastPurchaseReceiptV3(@C17402n(name = "name") String str, @C17402n(name = "first_line") String str2, @C17402n(name = "second_line") String str3, @C17402n(name = "city") String str4, @C17402n(name = "state") String str5, @C17402n(name = "zip") String str6, @C17402n(name = "message_from_payment") String str7, @C17402n(name = "message_from_seller") String str8, @C17402n(name = "total_vat_cost") String str9, @C17402n(name = "discount_amt") String str10, @C17402n(name = "currency_code") String str11, @C17402n(name = "payment_email") String str12, @C17402n(name = "was_giftcard_balance_applied") Boolean bool, @C17402n(name = "buyer_primary_gc_amt") String str13, @C17402n(name = "donation_terms_link_text") String str14, @C17402n(name = "is_in_person") Boolean bool2, @C17402n(name = "donation_terms_link_url") String str15, @C17402n(name = "message_from_buyer") String str16, @C17402n(name = "donation_description") String str17, @C17402n(name = "payment_method") String str18, @C17402n(name = "multi_shop_note") String str19, @C17402n(name = "total_price") String str20, @C17402n(name = "receipt_id") Long l, @C17402n(name = "etsy_coupon_discount_amt") String str21, @C17402n(name = "was_shipped") Boolean bool3, @C17402n(name = "payment_method_name") String str22, @C17402n(name = "total_shipping_cost") String str23, @C17402n(name = "is_gift") Boolean bool4, @C17402n(name = "in_person_payment_type") String str24, @C17402n(name = "was_paid") Boolean bool5, @C17402n(name = "creation_tsz") Long l2, @C17402n(name = "subtotal") String str25, @C17402n(name = "total_tax_cost") String str26, @C17402n(name = "needs_gift_wrap") Boolean bool6, @C17402n(name = "grandtotal") String str27, @C17402n(name = "adjusted_grandtotal") String str28, @C17402n(name = "buyer_adjusted_grandtotal") String str29, @C17402n(name = "flagged_for_manual_fraud_review") Boolean bool7, @C17402n(name = "gift_message") String str30, @C17402n(name = "is_anonymous_buyer") Boolean bool8, @C17402n(name = "status") Integer num, @C17402n(name = "shipped_tsz") Long l3, @C17402n(name = "estimated_shipped_tsz") Long l4, @C17402n(name = "transparent_price_message") String str31, @C17402n(name = "coupons") List<Coupons> list, @C17402n(name = "transactions") List<Transaction> list2, @C17402n(name = "shipments") List<Shipment> list3, @C17402n(name = "seller") Seller seller2, @C17402n(name = "buyer") Buyer buyer2) {
        this.name = str;
        this.firstLine = str2;
        this.secondLine = str3;
        this.city = str4;
        this.state = str5;
        this.zip = str6;
        this.messageFromPayment = str7;
        this.messageFromSeller = str8;
        this.totalVatCost = str9;
        this.discountAmt = str10;
        this.currencyCode = str11;
        this.paymentEmail = str12;
        this.wasGiftCardBalanceApplied = bool;
        this.giftCardAmountApplied = str13;
        this.donationTermsLinkText = str14;
        this.isInPerson = bool2;
        this.donationTermsLinkUrl = str15;
        this.messageFromBuyer = str16;
        this.donationDescription = str17;
        this.paymentMethod = str18;
        this.multiShopNote = str19;
        this.totalPrice = str20;
        this.receiptId = l;
        this.etsyCouponDiscountAmt = str21;
        this.wasShipped = bool3;
        this.paymentMethodName = str22;
        this.totalShippingCost = str23;
        this.isGift = bool4;
        this.inPersonPaymentType = str24;
        this.wasPaid = bool5;
        this.creationTsz = l2;
        this.subtotal = str25;
        this.totalTaxCost = str26;
        this.needsGiftWrap = bool6;
        this.grandTotal = str27;
        this.adjustedGrandTotal = str28;
        this.buyerAdjustedGrandTotal = str29;
        this.flaggedForManualFraudReview = bool7;
        this.giftMessage = str30;
        this.isAnonymousBuyer = bool8;
        this.status = num;
        this.shippedDate = l3;
        this.estimatedShippedDate = l4;
        this.transparentPriceMessage = str31;
        this.coupons = list;
        this.transactions = list2;
        this.shipments = list3;
        this.seller = seller2;
        this.buyer = buyer2;
    }

    public static /* synthetic */ PastPurchaseReceiptV3 copy$default(PastPurchaseReceiptV3 pastPurchaseReceiptV3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, String str13, String str14, Boolean bool2, String str15, String str16, String str17, String str18, String str19, String str20, Long l, String str21, Boolean bool3, String str22, String str23, Boolean bool4, String str24, Boolean bool5, Long l2, String str25, String str26, Boolean bool6, String str27, String str28, String str29, Boolean bool7, String str30, Boolean bool8, Integer num, Long l3, Long l4, String str31, List list, List list2, List list3, Seller seller2, Buyer buyer2, int i, int i2, Object obj) {
        PastPurchaseReceiptV3 pastPurchaseReceiptV32 = pastPurchaseReceiptV3;
        int i3 = i;
        int i4 = i2;
        return pastPurchaseReceiptV3.copy((i3 & 1) != 0 ? pastPurchaseReceiptV32.name : str, (i3 & 2) != 0 ? pastPurchaseReceiptV32.firstLine : str2, (i3 & 4) != 0 ? pastPurchaseReceiptV32.secondLine : str3, (i3 & 8) != 0 ? pastPurchaseReceiptV32.city : str4, (i3 & 16) != 0 ? pastPurchaseReceiptV32.state : str5, (i3 & 32) != 0 ? pastPurchaseReceiptV32.zip : str6, (i3 & 64) != 0 ? pastPurchaseReceiptV32.messageFromPayment : str7, (i3 & 128) != 0 ? pastPurchaseReceiptV32.messageFromSeller : str8, (i3 & 256) != 0 ? pastPurchaseReceiptV32.totalVatCost : str9, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? pastPurchaseReceiptV32.discountAmt : str10, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? pastPurchaseReceiptV32.currencyCode : str11, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? pastPurchaseReceiptV32.paymentEmail : str12, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pastPurchaseReceiptV32.wasGiftCardBalanceApplied : bool, (i3 & 8192) != 0 ? pastPurchaseReceiptV32.giftCardAmountApplied : str13, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? pastPurchaseReceiptV32.donationTermsLinkText : str14, (i3 & 32768) != 0 ? pastPurchaseReceiptV32.isInPerson : bool2, (i3 & 65536) != 0 ? pastPurchaseReceiptV32.donationTermsLinkUrl : str15, (i3 & 131072) != 0 ? pastPurchaseReceiptV32.messageFromBuyer : str16, (i3 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? pastPurchaseReceiptV32.donationDescription : str17, (i3 & 524288) != 0 ? pastPurchaseReceiptV32.paymentMethod : str18, (i3 & 1048576) != 0 ? pastPurchaseReceiptV32.multiShopNote : str19, (i3 & 2097152) != 0 ? pastPurchaseReceiptV32.totalPrice : str20, (i3 & 4194304) != 0 ? pastPurchaseReceiptV32.receiptId : l, (i3 & 8388608) != 0 ? pastPurchaseReceiptV32.etsyCouponDiscountAmt : str21, (i3 & 16777216) != 0 ? pastPurchaseReceiptV32.wasShipped : bool3, (i3 & 33554432) != 0 ? pastPurchaseReceiptV32.paymentMethodName : str22, (i3 & 67108864) != 0 ? pastPurchaseReceiptV32.totalShippingCost : str23, (i3 & 134217728) != 0 ? pastPurchaseReceiptV32.isGift : bool4, (i3 & 268435456) != 0 ? pastPurchaseReceiptV32.inPersonPaymentType : str24, (i3 & 536870912) != 0 ? pastPurchaseReceiptV32.wasPaid : bool5, (i3 & 1073741824) != 0 ? pastPurchaseReceiptV32.creationTsz : l2, (i3 & Integer.MIN_VALUE) != 0 ? pastPurchaseReceiptV32.subtotal : str25, (i4 & 1) != 0 ? pastPurchaseReceiptV32.totalTaxCost : str26, (i4 & 2) != 0 ? pastPurchaseReceiptV32.needsGiftWrap : bool6, (i4 & 4) != 0 ? pastPurchaseReceiptV32.grandTotal : str27, (i4 & 8) != 0 ? pastPurchaseReceiptV32.adjustedGrandTotal : str28, (i4 & 16) != 0 ? pastPurchaseReceiptV32.buyerAdjustedGrandTotal : str29, (i4 & 32) != 0 ? pastPurchaseReceiptV32.flaggedForManualFraudReview : bool7, (i4 & 64) != 0 ? pastPurchaseReceiptV32.giftMessage : str30, (i4 & 128) != 0 ? pastPurchaseReceiptV32.isAnonymousBuyer : bool8, (i4 & 256) != 0 ? pastPurchaseReceiptV32.status : num, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? pastPurchaseReceiptV32.shippedDate : l3, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? pastPurchaseReceiptV32.estimatedShippedDate : l4, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? pastPurchaseReceiptV32.transparentPriceMessage : str31, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? pastPurchaseReceiptV32.coupons : list, (i4 & 8192) != 0 ? pastPurchaseReceiptV32.transactions : list2, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? pastPurchaseReceiptV32.shipments : list3, (i4 & 32768) != 0 ? pastPurchaseReceiptV32.seller : seller2, (i4 & 65536) != 0 ? pastPurchaseReceiptV32.buyer : buyer2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.discountAmt;
    }

    public final String component11() {
        return this.currencyCode;
    }

    public final String component12() {
        return this.paymentEmail;
    }

    public final Boolean component13() {
        return this.wasGiftCardBalanceApplied;
    }

    public final String component14() {
        return this.giftCardAmountApplied;
    }

    public final String component15() {
        return this.donationTermsLinkText;
    }

    public final Boolean component16() {
        return this.isInPerson;
    }

    public final String component17() {
        return this.donationTermsLinkUrl;
    }

    public final String component18() {
        return this.messageFromBuyer;
    }

    public final String component19() {
        return this.donationDescription;
    }

    public final String component2() {
        return this.firstLine;
    }

    public final String component20() {
        return this.paymentMethod;
    }

    public final String component21() {
        return this.multiShopNote;
    }

    public final String component22() {
        return this.totalPrice;
    }

    public final Long component23() {
        return this.receiptId;
    }

    public final String component24() {
        return this.etsyCouponDiscountAmt;
    }

    public final Boolean component25() {
        return this.wasShipped;
    }

    public final String component26() {
        return this.paymentMethodName;
    }

    public final String component27() {
        return this.totalShippingCost;
    }

    public final Boolean component28() {
        return this.isGift;
    }

    public final String component29() {
        return this.inPersonPaymentType;
    }

    public final String component3() {
        return this.secondLine;
    }

    public final Boolean component30() {
        return this.wasPaid;
    }

    public final Long component31() {
        return this.creationTsz;
    }

    public final String component32() {
        return this.subtotal;
    }

    public final String component33() {
        return this.totalTaxCost;
    }

    public final Boolean component34() {
        return this.needsGiftWrap;
    }

    public final String component35() {
        return this.grandTotal;
    }

    public final String component36() {
        return this.adjustedGrandTotal;
    }

    public final String component37() {
        return this.buyerAdjustedGrandTotal;
    }

    public final Boolean component38() {
        return this.flaggedForManualFraudReview;
    }

    public final String component39() {
        return this.giftMessage;
    }

    public final String component4() {
        return this.city;
    }

    public final Boolean component40() {
        return this.isAnonymousBuyer;
    }

    public final Integer component41() {
        return this.status;
    }

    public final Long component42() {
        return this.shippedDate;
    }

    public final Long component43() {
        return this.estimatedShippedDate;
    }

    public final String component44() {
        return this.transparentPriceMessage;
    }

    public final List<Coupons> component45() {
        return this.coupons;
    }

    public final List<Transaction> component46() {
        return this.transactions;
    }

    public final List<Shipment> component47() {
        return this.shipments;
    }

    public final Seller component48() {
        return this.seller;
    }

    public final Buyer component49() {
        return this.buyer;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.zip;
    }

    public final String component7() {
        return this.messageFromPayment;
    }

    public final String component8() {
        return this.messageFromSeller;
    }

    public final String component9() {
        return this.totalVatCost;
    }

    public final PastPurchaseReceiptV3 copy(@C17402n(name = "name") String str, @C17402n(name = "first_line") String str2, @C17402n(name = "second_line") String str3, @C17402n(name = "city") String str4, @C17402n(name = "state") String str5, @C17402n(name = "zip") String str6, @C17402n(name = "message_from_payment") String str7, @C17402n(name = "message_from_seller") String str8, @C17402n(name = "total_vat_cost") String str9, @C17402n(name = "discount_amt") String str10, @C17402n(name = "currency_code") String str11, @C17402n(name = "payment_email") String str12, @C17402n(name = "was_giftcard_balance_applied") Boolean bool, @C17402n(name = "buyer_primary_gc_amt") String str13, @C17402n(name = "donation_terms_link_text") String str14, @C17402n(name = "is_in_person") Boolean bool2, @C17402n(name = "donation_terms_link_url") String str15, @C17402n(name = "message_from_buyer") String str16, @C17402n(name = "donation_description") String str17, @C17402n(name = "payment_method") String str18, @C17402n(name = "multi_shop_note") String str19, @C17402n(name = "total_price") String str20, @C17402n(name = "receipt_id") Long l, @C17402n(name = "etsy_coupon_discount_amt") String str21, @C17402n(name = "was_shipped") Boolean bool3, @C17402n(name = "payment_method_name") String str22, @C17402n(name = "total_shipping_cost") String str23, @C17402n(name = "is_gift") Boolean bool4, @C17402n(name = "in_person_payment_type") String str24, @C17402n(name = "was_paid") Boolean bool5, @C17402n(name = "creation_tsz") Long l2, @C17402n(name = "subtotal") String str25, @C17402n(name = "total_tax_cost") String str26, @C17402n(name = "needs_gift_wrap") Boolean bool6, @C17402n(name = "grandtotal") String str27, @C17402n(name = "adjusted_grandtotal") String str28, @C17402n(name = "buyer_adjusted_grandtotal") String str29, @C17402n(name = "flagged_for_manual_fraud_review") Boolean bool7, @C17402n(name = "gift_message") String str30, @C17402n(name = "is_anonymous_buyer") Boolean bool8, @C17402n(name = "status") Integer num, @C17402n(name = "shipped_tsz") Long l3, @C17402n(name = "estimated_shipped_tsz") Long l4, @C17402n(name = "transparent_price_message") String str31, @C17402n(name = "coupons") List<Coupons> list, @C17402n(name = "transactions") List<Transaction> list2, @C17402n(name = "shipments") List<Shipment> list3, @C17402n(name = "seller") Seller seller2, @C17402n(name = "buyer") Buyer buyer2) {
        return new PastPurchaseReceiptV3(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, bool, str13, str14, bool2, str15, str16, str17, str18, str19, str20, l, str21, bool3, str22, str23, bool4, str24, bool5, l2, str25, str26, bool6, str27, str28, str29, bool7, str30, bool8, num, l3, l4, str31, list, list2, list3, seller2, buyer2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseReceiptV3)) {
            return false;
        }
        PastPurchaseReceiptV3 pastPurchaseReceiptV3 = (PastPurchaseReceiptV3) obj;
        return C19383o.m32792b(this.name, pastPurchaseReceiptV3.name) && C19383o.m32792b(this.firstLine, pastPurchaseReceiptV3.firstLine) && C19383o.m32792b(this.secondLine, pastPurchaseReceiptV3.secondLine) && C19383o.m32792b(this.city, pastPurchaseReceiptV3.city) && C19383o.m32792b(this.state, pastPurchaseReceiptV3.state) && C19383o.m32792b(this.zip, pastPurchaseReceiptV3.zip) && C19383o.m32792b(this.messageFromPayment, pastPurchaseReceiptV3.messageFromPayment) && C19383o.m32792b(this.messageFromSeller, pastPurchaseReceiptV3.messageFromSeller) && C19383o.m32792b(this.totalVatCost, pastPurchaseReceiptV3.totalVatCost) && C19383o.m32792b(this.discountAmt, pastPurchaseReceiptV3.discountAmt) && C19383o.m32792b(this.currencyCode, pastPurchaseReceiptV3.currencyCode) && C19383o.m32792b(this.paymentEmail, pastPurchaseReceiptV3.paymentEmail) && C19383o.m32792b(this.wasGiftCardBalanceApplied, pastPurchaseReceiptV3.wasGiftCardBalanceApplied) && C19383o.m32792b(this.giftCardAmountApplied, pastPurchaseReceiptV3.giftCardAmountApplied) && C19383o.m32792b(this.donationTermsLinkText, pastPurchaseReceiptV3.donationTermsLinkText) && C19383o.m32792b(this.isInPerson, pastPurchaseReceiptV3.isInPerson) && C19383o.m32792b(this.donationTermsLinkUrl, pastPurchaseReceiptV3.donationTermsLinkUrl) && C19383o.m32792b(this.messageFromBuyer, pastPurchaseReceiptV3.messageFromBuyer) && C19383o.m32792b(this.donationDescription, pastPurchaseReceiptV3.donationDescription) && C19383o.m32792b(this.paymentMethod, pastPurchaseReceiptV3.paymentMethod) && C19383o.m32792b(this.multiShopNote, pastPurchaseReceiptV3.multiShopNote) && C19383o.m32792b(this.totalPrice, pastPurchaseReceiptV3.totalPrice) && C19383o.m32792b(this.receiptId, pastPurchaseReceiptV3.receiptId) && C19383o.m32792b(this.etsyCouponDiscountAmt, pastPurchaseReceiptV3.etsyCouponDiscountAmt) && C19383o.m32792b(this.wasShipped, pastPurchaseReceiptV3.wasShipped) && C19383o.m32792b(this.paymentMethodName, pastPurchaseReceiptV3.paymentMethodName) && C19383o.m32792b(this.totalShippingCost, pastPurchaseReceiptV3.totalShippingCost) && C19383o.m32792b(this.isGift, pastPurchaseReceiptV3.isGift) && C19383o.m32792b(this.inPersonPaymentType, pastPurchaseReceiptV3.inPersonPaymentType) && C19383o.m32792b(this.wasPaid, pastPurchaseReceiptV3.wasPaid) && C19383o.m32792b(this.creationTsz, pastPurchaseReceiptV3.creationTsz) && C19383o.m32792b(this.subtotal, pastPurchaseReceiptV3.subtotal) && C19383o.m32792b(this.totalTaxCost, pastPurchaseReceiptV3.totalTaxCost) && C19383o.m32792b(this.needsGiftWrap, pastPurchaseReceiptV3.needsGiftWrap) && C19383o.m32792b(this.grandTotal, pastPurchaseReceiptV3.grandTotal) && C19383o.m32792b(this.adjustedGrandTotal, pastPurchaseReceiptV3.adjustedGrandTotal) && C19383o.m32792b(this.buyerAdjustedGrandTotal, pastPurchaseReceiptV3.buyerAdjustedGrandTotal) && C19383o.m32792b(this.flaggedForManualFraudReview, pastPurchaseReceiptV3.flaggedForManualFraudReview) && C19383o.m32792b(this.giftMessage, pastPurchaseReceiptV3.giftMessage) && C19383o.m32792b(this.isAnonymousBuyer, pastPurchaseReceiptV3.isAnonymousBuyer) && C19383o.m32792b(this.status, pastPurchaseReceiptV3.status) && C19383o.m32792b(this.shippedDate, pastPurchaseReceiptV3.shippedDate) && C19383o.m32792b(this.estimatedShippedDate, pastPurchaseReceiptV3.estimatedShippedDate) && C19383o.m32792b(this.transparentPriceMessage, pastPurchaseReceiptV3.transparentPriceMessage) && C19383o.m32792b(this.coupons, pastPurchaseReceiptV3.coupons) && C19383o.m32792b(this.transactions, pastPurchaseReceiptV3.transactions) && C19383o.m32792b(this.shipments, pastPurchaseReceiptV3.shipments) && C19383o.m32792b(this.seller, pastPurchaseReceiptV3.seller) && C19383o.m32792b(this.buyer, pastPurchaseReceiptV3.buyer);
    }

    public final String getAdjustedGrandTotal() {
        return this.adjustedGrandTotal;
    }

    public final Buyer getBuyer() {
        return this.buyer;
    }

    public final String getBuyerAdjustedGrandTotal() {
        return this.buyerAdjustedGrandTotal;
    }

    public final String getCity() {
        return this.city;
    }

    public final List<Coupons> getCoupons() {
        return this.coupons;
    }

    public final Long getCreationTsz() {
        return this.creationTsz;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDiscountAmt() {
        return this.discountAmt;
    }

    public final String getDonationDescription() {
        return this.donationDescription;
    }

    public final String getDonationTermsLinkText() {
        return this.donationTermsLinkText;
    }

    public final String getDonationTermsLinkUrl() {
        return this.donationTermsLinkUrl;
    }

    public final Long getEstimatedShippedDate() {
        return this.estimatedShippedDate;
    }

    public final String getEtsyCouponDiscountAmt() {
        return this.etsyCouponDiscountAmt;
    }

    public final String getFirstLine() {
        return this.firstLine;
    }

    public final Boolean getFlaggedForManualFraudReview() {
        return this.flaggedForManualFraudReview;
    }

    public final String getGiftCardAmountApplied() {
        return this.giftCardAmountApplied;
    }

    public final String getGiftMessage() {
        return this.giftMessage;
    }

    public final String getGrandTotal() {
        return this.grandTotal;
    }

    public final String getInPersonPaymentType() {
        return this.inPersonPaymentType;
    }

    public final String getMessageFromBuyer() {
        return this.messageFromBuyer;
    }

    public final String getMessageFromPayment() {
        return this.messageFromPayment;
    }

    public final String getMessageFromSeller() {
        return this.messageFromSeller;
    }

    public final String getMultiShopNote() {
        return this.multiShopNote;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNeedsGiftWrap() {
        return this.needsGiftWrap;
    }

    public final String getPaymentEmail() {
        return this.paymentEmail;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    public final Long getReceiptId() {
        return this.receiptId;
    }

    public final String getSecondLine() {
        return this.secondLine;
    }

    public final Seller getSeller() {
        return this.seller;
    }

    public final List<Shipment> getShipments() {
        return this.shipments;
    }

    public final Long getShippedDate() {
        return this.shippedDate;
    }

    public final String getState() {
        return this.state;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSubtotal() {
        return this.subtotal;
    }

    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public final String getTotalShippingCost() {
        return this.totalShippingCost;
    }

    public final String getTotalTaxCost() {
        return this.totalTaxCost;
    }

    public final String getTotalVatCost() {
        return this.totalVatCost;
    }

    public final List<Transaction> getTransactions() {
        return this.transactions;
    }

    public final String getTransparentPriceMessage() {
        return this.transparentPriceMessage;
    }

    public final Boolean getWasGiftCardBalanceApplied() {
        return this.wasGiftCardBalanceApplied;
    }

    public final Boolean getWasPaid() {
        return this.wasPaid;
    }

    public final Boolean getWasShipped() {
        return this.wasShipped;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstLine;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondLine;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zip;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageFromPayment;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.messageFromSeller;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.totalVatCost;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.discountAmt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.currencyCode;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentEmail;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.wasGiftCardBalanceApplied;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.giftCardAmountApplied;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.donationTermsLinkText;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool2 = this.isInPerson;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str15 = this.donationTermsLinkUrl;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.messageFromBuyer;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.donationDescription;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.paymentMethod;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.multiShopNote;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.totalPrice;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Long l = this.receiptId;
        int hashCode23 = (hashCode22 + (l == null ? 0 : l.hashCode())) * 31;
        String str21 = this.etsyCouponDiscountAmt;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool3 = this.wasShipped;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str22 = this.paymentMethodName;
        int hashCode26 = (hashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.totalShippingCost;
        int hashCode27 = (hashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool4 = this.isGift;
        int hashCode28 = (hashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str24 = this.inPersonPaymentType;
        int hashCode29 = (hashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Boolean bool5 = this.wasPaid;
        int hashCode30 = (hashCode29 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l2 = this.creationTsz;
        int hashCode31 = (hashCode30 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str25 = this.subtotal;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.totalTaxCost;
        int hashCode33 = (hashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Boolean bool6 = this.needsGiftWrap;
        int hashCode34 = (hashCode33 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str27 = this.grandTotal;
        int hashCode35 = (hashCode34 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.adjustedGrandTotal;
        int hashCode36 = (hashCode35 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.buyerAdjustedGrandTotal;
        int hashCode37 = (hashCode36 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool7 = this.flaggedForManualFraudReview;
        int hashCode38 = (hashCode37 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str30 = this.giftMessage;
        int hashCode39 = (hashCode38 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Boolean bool8 = this.isAnonymousBuyer;
        int hashCode40 = (hashCode39 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num = this.status;
        int hashCode41 = (hashCode40 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.shippedDate;
        int hashCode42 = (hashCode41 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.estimatedShippedDate;
        int hashCode43 = (hashCode42 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str31 = this.transparentPriceMessage;
        int hashCode44 = (hashCode43 + (str31 == null ? 0 : str31.hashCode())) * 31;
        List<Coupons> list = this.coupons;
        int hashCode45 = (hashCode44 + (list == null ? 0 : list.hashCode())) * 31;
        List<Transaction> list2 = this.transactions;
        int hashCode46 = (hashCode45 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Shipment> list3 = this.shipments;
        int hashCode47 = (hashCode46 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Seller seller2 = this.seller;
        int hashCode48 = (hashCode47 + (seller2 == null ? 0 : seller2.hashCode())) * 31;
        Buyer buyer2 = this.buyer;
        if (buyer2 != null) {
            i = buyer2.hashCode();
        }
        return hashCode48 + i;
    }

    public final Boolean isAnonymousBuyer() {
        return this.isAnonymousBuyer;
    }

    public final Boolean isGift() {
        return this.isGift;
    }

    public final Boolean isInPerson() {
        return this.isInPerson;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseReceiptV3(name=");
        h.append(this.name);
        h.append(", firstLine=");
        h.append(this.firstLine);
        h.append(", secondLine=");
        h.append(this.secondLine);
        h.append(", city=");
        h.append(this.city);
        h.append(", state=");
        h.append(this.state);
        h.append(", zip=");
        h.append(this.zip);
        h.append(", messageFromPayment=");
        h.append(this.messageFromPayment);
        h.append(", messageFromSeller=");
        h.append(this.messageFromSeller);
        h.append(", totalVatCost=");
        h.append(this.totalVatCost);
        h.append(", discountAmt=");
        h.append(this.discountAmt);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", paymentEmail=");
        h.append(this.paymentEmail);
        h.append(", wasGiftCardBalanceApplied=");
        h.append(this.wasGiftCardBalanceApplied);
        h.append(", giftCardAmountApplied=");
        h.append(this.giftCardAmountApplied);
        h.append(", donationTermsLinkText=");
        h.append(this.donationTermsLinkText);
        h.append(", isInPerson=");
        h.append(this.isInPerson);
        h.append(", donationTermsLinkUrl=");
        h.append(this.donationTermsLinkUrl);
        h.append(", messageFromBuyer=");
        h.append(this.messageFromBuyer);
        h.append(", donationDescription=");
        h.append(this.donationDescription);
        h.append(", paymentMethod=");
        h.append(this.paymentMethod);
        h.append(", multiShopNote=");
        h.append(this.multiShopNote);
        h.append(", totalPrice=");
        h.append(this.totalPrice);
        h.append(", receiptId=");
        h.append(this.receiptId);
        h.append(", etsyCouponDiscountAmt=");
        h.append(this.etsyCouponDiscountAmt);
        h.append(", wasShipped=");
        h.append(this.wasShipped);
        h.append(", paymentMethodName=");
        h.append(this.paymentMethodName);
        h.append(", totalShippingCost=");
        h.append(this.totalShippingCost);
        h.append(", isGift=");
        h.append(this.isGift);
        h.append(", inPersonPaymentType=");
        h.append(this.inPersonPaymentType);
        h.append(", wasPaid=");
        h.append(this.wasPaid);
        h.append(", creationTsz=");
        h.append(this.creationTsz);
        h.append(", subtotal=");
        h.append(this.subtotal);
        h.append(", totalTaxCost=");
        h.append(this.totalTaxCost);
        h.append(", needsGiftWrap=");
        h.append(this.needsGiftWrap);
        h.append(", grandTotal=");
        h.append(this.grandTotal);
        h.append(", adjustedGrandTotal=");
        h.append(this.adjustedGrandTotal);
        h.append(", buyerAdjustedGrandTotal=");
        h.append(this.buyerAdjustedGrandTotal);
        h.append(", flaggedForManualFraudReview=");
        h.append(this.flaggedForManualFraudReview);
        h.append(", giftMessage=");
        h.append(this.giftMessage);
        h.append(", isAnonymousBuyer=");
        h.append(this.isAnonymousBuyer);
        h.append(", status=");
        h.append(this.status);
        h.append(", shippedDate=");
        h.append(this.shippedDate);
        h.append(", estimatedShippedDate=");
        h.append(this.estimatedShippedDate);
        h.append(", transparentPriceMessage=");
        h.append(this.transparentPriceMessage);
        h.append(", coupons=");
        h.append(this.coupons);
        h.append(", transactions=");
        h.append(this.transactions);
        h.append(", shipments=");
        h.append(this.shipments);
        h.append(", seller=");
        h.append(this.seller);
        h.append(", buyer=");
        h.append(this.buyer);
        h.append(')');
        return h.toString();
    }
}
