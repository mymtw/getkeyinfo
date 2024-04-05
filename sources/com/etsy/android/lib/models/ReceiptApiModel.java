package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class ReceiptApiModel {
    public static final int $stable = 8;
    private final User buyer;
    private final Boolean canRefund;
    private final String city;
    private final Country country;
    private final Coupon coupon;
    private final long creationTsz;
    private final String currencyCode;
    private final String discountAmount;
    private final String donationDescription;
    private final String donationTermsLinkText;
    private final String donationTermsLinkUrl;
    private final Long estimatedShippedTsz;
    private final String etsyDiscountAmount;
    private final String firstLine;
    private final String giftCardAmountApplied;
    private final String giftMessage;
    private final String giftPrice;
    private final String grandTotalAmount;
    private final GuestUser guestUser;
    private final boolean isAnonymousBuyer;
    private final boolean isFlaggedForManualFraudReview;
    private final boolean isGift;
    private final boolean isGuest;
    private final boolean isInPerson;
    private final Location location;
    private final String messageFromBuyer;
    private final String messageFromSeller;
    private final String multiShopNote;
    private final String name;
    private final boolean needsGiftWrap;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodName;
    private final long receiptId;
    private final int receiptTypeCode;
    private final String secondLine;
    private final User seller;
    private final String sellerEmail;
    private final List<ReceiptShipment> shipments;
    private final Long shippedTsz;
    private final String shippingCarrier;
    private final ReceiptShippingDetails shippingDetails;
    private final String shippingNote;
    private final Long shippingNotificationTsz;
    private final String shippingTrackingUrl;
    private final String state;
    private final String totalPrice;
    private final String totalShippingCost;
    private final String totalTaxCost;
    private final String totalVatCost;
    private final List<Transaction> transactions;
    private final String transparentPriceMessage;
    private final List<UserNote> userNotes;
    private final List<String> vatCreditNoteIds;
    private final boolean wasGiftCardBalanceApplied;
    private final boolean wasPaid;
    private final boolean wasShipped;
    private final String zip;

    public ReceiptApiModel(@C17402n(name = "receipt_id") long j, @C17402n(name = "receipt_type") int i, @C17402n(name = "payment_method_name") String str, @C17402n(name = "payment_method_object") PaymentMethod paymentMethod2, @C17402n(name = "flagged_for_manual_fraud_review") boolean z, @C17402n(name = "was_paid") boolean z2, @C17402n(name = "was_giftcard_balance_applied") boolean z3, @C17402n(name = "buyer_primary_gc_amt") String str2, @C17402n(name = "total_tax_cost") String str3, @C17402n(name = "gift_wrap_price") String str4, @C17402n(name = "total_vat_cost") String str5, @C17402n(name = "vat_credit_note_ids") List<String> list, @C17402n(name = "donation_description") String str6, @C17402n(name = "donation_terms_link_url") String str7, @C17402n(name = "donation_terms_link_text") String str8, @C17402n(name = "total_price") String str9, @C17402n(name = "total_shipping_cost") String str10, @C17402n(name = "discount_amt") String str11, @C17402n(name = "etsy_coupon_discount_amt") String str12, @C17402n(name = "grandtotal") String str13, @C17402n(name = "currency_code") String str14, @C17402n(name = "transparent_price_message") String str15, @C17402n(name = "was_shipped") boolean z4, @C17402n(name = "is_in_person") boolean z5, @C17402n(name = "is_anonymous_buyer") boolean z6, @C17402n(name = "shipping_carrier") String str16, @C17402n(name = "seller_email") String str17, @C17402n(name = "name") String str18, @C17402n(name = "first_line") String str19, @C17402n(name = "second_line") String str20, @C17402n(name = "city") String str21, @C17402n(name = "state") String str22, @C17402n(name = "zip") String str23, @C17402n(name = "message_from_seller") String str24, @C17402n(name = "message_from_buyer") String str25, @C17402n(name = "shipping_note") String str26, @C17402n(name = "shipping_tracking_url") String str27, @C17402n(name = "shipping_details") ReceiptShippingDetails receiptShippingDetails, @C17402n(name = "creation_tsz") long j2, @C17402n(name = "can_refund") Boolean bool, @C17402n(name = "shipping_notification_date") Long l, @C17402n(name = "shipped_date") Long l2, @C17402n(name = "estimated_shipped_tsz") Long l3, @C17402n(name = "coupon") Coupon coupon2, @C17402n(name = "country") Country country2, @C17402n(name = "buyer") User user, @C17402n(name = "guest_buyer") GuestUser guestUser2, @C17402n(name = "seller") User user2, @C17402n(name = "locations") Location location2, @C17402n(name = "transactions") List<? extends Transaction> list2, @C17402n(name = "shipments") List<? extends ReceiptShipment> list3, @C17402n(name = "UserNotes") List<? extends UserNote> list4, @C17402n(name = "is_guest") boolean z7, @C17402n(name = "multi_shop_note") String str28, @C17402n(name = "is_gift") boolean z8, @C17402n(name = "gift_message") String str29, @C17402n(name = "needs_gift_wrap") boolean z9) {
        String str30 = str3;
        String str31 = str5;
        List<String> list5 = list;
        String str32 = str9;
        String str33 = str10;
        String str34 = str11;
        String str35 = str12;
        String str36 = str13;
        String str37 = str14;
        String str38 = str15;
        String str39 = str18;
        String str40 = str19;
        String str41 = str21;
        List<? extends ReceiptShipment> list6 = list3;
        C19383o.m32797g(str30, "totalTaxCost");
        C19383o.m32797g(str31, "totalVatCost");
        C19383o.m32797g(list5, "vatCreditNoteIds");
        C19383o.m32797g(str32, "totalPrice");
        C19383o.m32797g(str33, "totalShippingCost");
        C19383o.m32797g(str34, "discountAmount");
        C19383o.m32797g(str35, "etsyDiscountAmount");
        C19383o.m32797g(str36, "grandTotalAmount");
        C19383o.m32797g(str37, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str38, "transparentPriceMessage");
        C19383o.m32797g(str39, "name");
        C19383o.m32797g(str40, "firstLine");
        C19383o.m32797g(str41, "city");
        C19383o.m32797g(receiptShippingDetails, "shippingDetails");
        C19383o.m32797g(list2, ResponseConstants.TRANSACTIONS);
        C19383o.m32797g(list3, "shipments");
        C19383o.m32797g(str28, "multiShopNote");
        C19383o.m32797g(str29, "giftMessage");
        this.receiptId = j;
        this.receiptTypeCode = i;
        this.paymentMethodName = str;
        this.paymentMethod = paymentMethod2;
        this.isFlaggedForManualFraudReview = z;
        this.wasPaid = z2;
        this.wasGiftCardBalanceApplied = z3;
        this.giftCardAmountApplied = str2;
        this.totalTaxCost = str30;
        this.giftPrice = str4;
        this.totalVatCost = str31;
        this.vatCreditNoteIds = list5;
        this.donationDescription = str6;
        this.donationTermsLinkUrl = str7;
        this.donationTermsLinkText = str8;
        this.totalPrice = str32;
        this.totalShippingCost = str33;
        this.discountAmount = str34;
        this.etsyDiscountAmount = str35;
        this.grandTotalAmount = str36;
        this.currencyCode = str37;
        this.transparentPriceMessage = str38;
        this.wasShipped = z4;
        this.isInPerson = z5;
        this.isAnonymousBuyer = z6;
        this.shippingCarrier = str16;
        this.sellerEmail = str17;
        this.name = str39;
        this.firstLine = str40;
        this.secondLine = str20;
        this.city = str41;
        this.state = str22;
        this.zip = str23;
        this.messageFromSeller = str24;
        this.messageFromBuyer = str25;
        this.shippingNote = str26;
        this.shippingTrackingUrl = str27;
        this.shippingDetails = receiptShippingDetails;
        this.creationTsz = j2;
        this.canRefund = bool;
        this.shippingNotificationTsz = l;
        this.shippedTsz = l2;
        this.estimatedShippedTsz = l3;
        this.coupon = coupon2;
        this.country = country2;
        this.buyer = user;
        this.guestUser = guestUser2;
        this.seller = user2;
        this.location = location2;
        this.transactions = list2;
        this.shipments = list3;
        this.userNotes = list4;
        this.isGuest = z7;
        this.multiShopNote = str28;
        this.isGift = z8;
        this.giftMessage = str29;
        this.needsGiftWrap = z9;
    }

    public static /* synthetic */ ReceiptApiModel copy$default(ReceiptApiModel receiptApiModel, long j, int i, String str, PaymentMethod paymentMethod2, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z4, boolean z5, boolean z6, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, ReceiptShippingDetails receiptShippingDetails, long j2, Boolean bool, Long l, Long l2, Long l3, Coupon coupon2, Country country2, User user, GuestUser guestUser2, User user2, Location location2, List list2, List list3, List list4, boolean z7, String str28, boolean z8, String str29, boolean z9, int i2, int i3, Object obj) {
        ReceiptApiModel receiptApiModel2 = receiptApiModel;
        int i4 = i2;
        int i5 = i3;
        return receiptApiModel.copy((i4 & 1) != 0 ? receiptApiModel2.receiptId : j, (i4 & 2) != 0 ? receiptApiModel2.receiptTypeCode : i, (i4 & 4) != 0 ? receiptApiModel2.paymentMethodName : str, (i4 & 8) != 0 ? receiptApiModel2.paymentMethod : paymentMethod2, (i4 & 16) != 0 ? receiptApiModel2.isFlaggedForManualFraudReview : z, (i4 & 32) != 0 ? receiptApiModel2.wasPaid : z2, (i4 & 64) != 0 ? receiptApiModel2.wasGiftCardBalanceApplied : z3, (i4 & 128) != 0 ? receiptApiModel2.giftCardAmountApplied : str2, (i4 & 256) != 0 ? receiptApiModel2.totalTaxCost : str3, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? receiptApiModel2.giftPrice : str4, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? receiptApiModel2.totalVatCost : str5, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? receiptApiModel2.vatCreditNoteIds : list, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? receiptApiModel2.donationDescription : str6, (i4 & 8192) != 0 ? receiptApiModel2.donationTermsLinkUrl : str7, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? receiptApiModel2.donationTermsLinkText : str8, (i4 & 32768) != 0 ? receiptApiModel2.totalPrice : str9, (i4 & 65536) != 0 ? receiptApiModel2.totalShippingCost : str10, (i4 & 131072) != 0 ? receiptApiModel2.discountAmount : str11, (i4 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? receiptApiModel2.etsyDiscountAmount : str12, (i4 & 524288) != 0 ? receiptApiModel2.grandTotalAmount : str13, (i4 & 1048576) != 0 ? receiptApiModel2.currencyCode : str14, (i4 & 2097152) != 0 ? receiptApiModel2.transparentPriceMessage : str15, (i4 & 4194304) != 0 ? receiptApiModel2.wasShipped : z4, (i4 & 8388608) != 0 ? receiptApiModel2.isInPerson : z5, (i4 & 16777216) != 0 ? receiptApiModel2.isAnonymousBuyer : z6, (i4 & 33554432) != 0 ? receiptApiModel2.shippingCarrier : str16, (i4 & 67108864) != 0 ? receiptApiModel2.sellerEmail : str17, (i4 & 134217728) != 0 ? receiptApiModel2.name : str18, (i4 & 268435456) != 0 ? receiptApiModel2.firstLine : str19, (i4 & 536870912) != 0 ? receiptApiModel2.secondLine : str20, (i4 & 1073741824) != 0 ? receiptApiModel2.city : str21, (i4 & Integer.MIN_VALUE) != 0 ? receiptApiModel2.state : str22, (i5 & 1) != 0 ? receiptApiModel2.zip : str23, (i5 & 2) != 0 ? receiptApiModel2.messageFromSeller : str24, (i5 & 4) != 0 ? receiptApiModel2.messageFromBuyer : str25, (i5 & 8) != 0 ? receiptApiModel2.shippingNote : str26, (i5 & 16) != 0 ? receiptApiModel2.shippingTrackingUrl : str27, (i5 & 32) != 0 ? receiptApiModel2.shippingDetails : receiptShippingDetails, (i5 & 64) != 0 ? receiptApiModel2.creationTsz : j2, (i5 & 128) != 0 ? receiptApiModel2.canRefund : bool, (i5 & 256) != 0 ? receiptApiModel2.shippingNotificationTsz : l, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? receiptApiModel2.shippedTsz : l2, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? receiptApiModel2.estimatedShippedTsz : l3, (i5 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? receiptApiModel2.coupon : coupon2, (i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? receiptApiModel2.country : country2, (i5 & 8192) != 0 ? receiptApiModel2.buyer : user, (i5 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? receiptApiModel2.guestUser : guestUser2, (i5 & 32768) != 0 ? receiptApiModel2.seller : user2, (i5 & 65536) != 0 ? receiptApiModel2.location : location2, (i5 & 131072) != 0 ? receiptApiModel2.transactions : list2, (i5 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? receiptApiModel2.shipments : list3, (i5 & 524288) != 0 ? receiptApiModel2.userNotes : list4, (i5 & 1048576) != 0 ? receiptApiModel2.isGuest : z7, (i5 & 2097152) != 0 ? receiptApiModel2.multiShopNote : str28, (i5 & 4194304) != 0 ? receiptApiModel2.isGift : z8, (i5 & 8388608) != 0 ? receiptApiModel2.giftMessage : str29, (i5 & 16777216) != 0 ? receiptApiModel2.needsGiftWrap : z9);
    }

    public final long component1() {
        return this.receiptId;
    }

    public final String component10() {
        return this.giftPrice;
    }

    public final String component11() {
        return this.totalVatCost;
    }

    public final List<String> component12() {
        return this.vatCreditNoteIds;
    }

    public final String component13() {
        return this.donationDescription;
    }

    public final String component14() {
        return this.donationTermsLinkUrl;
    }

    public final String component15() {
        return this.donationTermsLinkText;
    }

    public final String component16() {
        return this.totalPrice;
    }

    public final String component17() {
        return this.totalShippingCost;
    }

    public final String component18() {
        return this.discountAmount;
    }

    public final String component19() {
        return this.etsyDiscountAmount;
    }

    public final int component2() {
        return this.receiptTypeCode;
    }

    public final String component20() {
        return this.grandTotalAmount;
    }

    public final String component21() {
        return this.currencyCode;
    }

    public final String component22() {
        return this.transparentPriceMessage;
    }

    public final boolean component23() {
        return this.wasShipped;
    }

    public final boolean component24() {
        return this.isInPerson;
    }

    public final boolean component25() {
        return this.isAnonymousBuyer;
    }

    public final String component26() {
        return this.shippingCarrier;
    }

    public final String component27() {
        return this.sellerEmail;
    }

    public final String component28() {
        return this.name;
    }

    public final String component29() {
        return this.firstLine;
    }

    public final String component3() {
        return this.paymentMethodName;
    }

    public final String component30() {
        return this.secondLine;
    }

    public final String component31() {
        return this.city;
    }

    public final String component32() {
        return this.state;
    }

    public final String component33() {
        return this.zip;
    }

    public final String component34() {
        return this.messageFromSeller;
    }

    public final String component35() {
        return this.messageFromBuyer;
    }

    public final String component36() {
        return this.shippingNote;
    }

    public final String component37() {
        return this.shippingTrackingUrl;
    }

    public final ReceiptShippingDetails component38() {
        return this.shippingDetails;
    }

    public final long component39() {
        return this.creationTsz;
    }

    public final PaymentMethod component4() {
        return this.paymentMethod;
    }

    public final Boolean component40() {
        return this.canRefund;
    }

    public final Long component41() {
        return this.shippingNotificationTsz;
    }

    public final Long component42() {
        return this.shippedTsz;
    }

    public final Long component43() {
        return this.estimatedShippedTsz;
    }

    public final Coupon component44() {
        return this.coupon;
    }

    public final Country component45() {
        return this.country;
    }

    public final User component46() {
        return this.buyer;
    }

    public final GuestUser component47() {
        return this.guestUser;
    }

    public final User component48() {
        return this.seller;
    }

    public final Location component49() {
        return this.location;
    }

    public final boolean component5() {
        return this.isFlaggedForManualFraudReview;
    }

    public final List<Transaction> component50() {
        return this.transactions;
    }

    public final List<ReceiptShipment> component51() {
        return this.shipments;
    }

    public final List<UserNote> component52() {
        return this.userNotes;
    }

    public final boolean component53() {
        return this.isGuest;
    }

    public final String component54() {
        return this.multiShopNote;
    }

    public final boolean component55() {
        return this.isGift;
    }

    public final String component56() {
        return this.giftMessage;
    }

    public final boolean component57() {
        return this.needsGiftWrap;
    }

    public final boolean component6() {
        return this.wasPaid;
    }

    public final boolean component7() {
        return this.wasGiftCardBalanceApplied;
    }

    public final String component8() {
        return this.giftCardAmountApplied;
    }

    public final String component9() {
        return this.totalTaxCost;
    }

    public final ReceiptApiModel copy(@C17402n(name = "receipt_id") long j, @C17402n(name = "receipt_type") int i, @C17402n(name = "payment_method_name") String str, @C17402n(name = "payment_method_object") PaymentMethod paymentMethod2, @C17402n(name = "flagged_for_manual_fraud_review") boolean z, @C17402n(name = "was_paid") boolean z2, @C17402n(name = "was_giftcard_balance_applied") boolean z3, @C17402n(name = "buyer_primary_gc_amt") String str2, @C17402n(name = "total_tax_cost") String str3, @C17402n(name = "gift_wrap_price") String str4, @C17402n(name = "total_vat_cost") String str5, @C17402n(name = "vat_credit_note_ids") List<String> list, @C17402n(name = "donation_description") String str6, @C17402n(name = "donation_terms_link_url") String str7, @C17402n(name = "donation_terms_link_text") String str8, @C17402n(name = "total_price") String str9, @C17402n(name = "total_shipping_cost") String str10, @C17402n(name = "discount_amt") String str11, @C17402n(name = "etsy_coupon_discount_amt") String str12, @C17402n(name = "grandtotal") String str13, @C17402n(name = "currency_code") String str14, @C17402n(name = "transparent_price_message") String str15, @C17402n(name = "was_shipped") boolean z4, @C17402n(name = "is_in_person") boolean z5, @C17402n(name = "is_anonymous_buyer") boolean z6, @C17402n(name = "shipping_carrier") String str16, @C17402n(name = "seller_email") String str17, @C17402n(name = "name") String str18, @C17402n(name = "first_line") String str19, @C17402n(name = "second_line") String str20, @C17402n(name = "city") String str21, @C17402n(name = "state") String str22, @C17402n(name = "zip") String str23, @C17402n(name = "message_from_seller") String str24, @C17402n(name = "message_from_buyer") String str25, @C17402n(name = "shipping_note") String str26, @C17402n(name = "shipping_tracking_url") String str27, @C17402n(name = "shipping_details") ReceiptShippingDetails receiptShippingDetails, @C17402n(name = "creation_tsz") long j2, @C17402n(name = "can_refund") Boolean bool, @C17402n(name = "shipping_notification_date") Long l, @C17402n(name = "shipped_date") Long l2, @C17402n(name = "estimated_shipped_tsz") Long l3, @C17402n(name = "coupon") Coupon coupon2, @C17402n(name = "country") Country country2, @C17402n(name = "buyer") User user, @C17402n(name = "guest_buyer") GuestUser guestUser2, @C17402n(name = "seller") User user2, @C17402n(name = "locations") Location location2, @C17402n(name = "transactions") List<? extends Transaction> list2, @C17402n(name = "shipments") List<? extends ReceiptShipment> list3, @C17402n(name = "UserNotes") List<? extends UserNote> list4, @C17402n(name = "is_guest") boolean z7, @C17402n(name = "multi_shop_note") String str28, @C17402n(name = "is_gift") boolean z8, @C17402n(name = "gift_message") String str29, @C17402n(name = "needs_gift_wrap") boolean z9) {
        long j3 = j;
        C19383o.m32797g(str3, "totalTaxCost");
        C19383o.m32797g(str5, "totalVatCost");
        C19383o.m32797g(list, "vatCreditNoteIds");
        C19383o.m32797g(str9, "totalPrice");
        C19383o.m32797g(str10, "totalShippingCost");
        C19383o.m32797g(str11, "discountAmount");
        C19383o.m32797g(str12, "etsyDiscountAmount");
        C19383o.m32797g(str13, "grandTotalAmount");
        C19383o.m32797g(str14, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str15, "transparentPriceMessage");
        C19383o.m32797g(str18, "name");
        C19383o.m32797g(str19, "firstLine");
        C19383o.m32797g(str21, "city");
        C19383o.m32797g(receiptShippingDetails, "shippingDetails");
        C19383o.m32797g(list2, ResponseConstants.TRANSACTIONS);
        C19383o.m32797g(list3, "shipments");
        C19383o.m32797g(str28, "multiShopNote");
        C19383o.m32797g(str29, "giftMessage");
        return new ReceiptApiModel(j, i, str, paymentMethod2, z, z2, z3, str2, str3, str4, str5, list, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, z4, z5, z6, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, receiptShippingDetails, j2, bool, l, l2, l3, coupon2, country2, user, guestUser2, user2, location2, list2, list3, list4, z7, str28, z8, str29, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptApiModel)) {
            return false;
        }
        ReceiptApiModel receiptApiModel = (ReceiptApiModel) obj;
        return this.receiptId == receiptApiModel.receiptId && this.receiptTypeCode == receiptApiModel.receiptTypeCode && C19383o.m32792b(this.paymentMethodName, receiptApiModel.paymentMethodName) && C19383o.m32792b(this.paymentMethod, receiptApiModel.paymentMethod) && this.isFlaggedForManualFraudReview == receiptApiModel.isFlaggedForManualFraudReview && this.wasPaid == receiptApiModel.wasPaid && this.wasGiftCardBalanceApplied == receiptApiModel.wasGiftCardBalanceApplied && C19383o.m32792b(this.giftCardAmountApplied, receiptApiModel.giftCardAmountApplied) && C19383o.m32792b(this.totalTaxCost, receiptApiModel.totalTaxCost) && C19383o.m32792b(this.giftPrice, receiptApiModel.giftPrice) && C19383o.m32792b(this.totalVatCost, receiptApiModel.totalVatCost) && C19383o.m32792b(this.vatCreditNoteIds, receiptApiModel.vatCreditNoteIds) && C19383o.m32792b(this.donationDescription, receiptApiModel.donationDescription) && C19383o.m32792b(this.donationTermsLinkUrl, receiptApiModel.donationTermsLinkUrl) && C19383o.m32792b(this.donationTermsLinkText, receiptApiModel.donationTermsLinkText) && C19383o.m32792b(this.totalPrice, receiptApiModel.totalPrice) && C19383o.m32792b(this.totalShippingCost, receiptApiModel.totalShippingCost) && C19383o.m32792b(this.discountAmount, receiptApiModel.discountAmount) && C19383o.m32792b(this.etsyDiscountAmount, receiptApiModel.etsyDiscountAmount) && C19383o.m32792b(this.grandTotalAmount, receiptApiModel.grandTotalAmount) && C19383o.m32792b(this.currencyCode, receiptApiModel.currencyCode) && C19383o.m32792b(this.transparentPriceMessage, receiptApiModel.transparentPriceMessage) && this.wasShipped == receiptApiModel.wasShipped && this.isInPerson == receiptApiModel.isInPerson && this.isAnonymousBuyer == receiptApiModel.isAnonymousBuyer && C19383o.m32792b(this.shippingCarrier, receiptApiModel.shippingCarrier) && C19383o.m32792b(this.sellerEmail, receiptApiModel.sellerEmail) && C19383o.m32792b(this.name, receiptApiModel.name) && C19383o.m32792b(this.firstLine, receiptApiModel.firstLine) && C19383o.m32792b(this.secondLine, receiptApiModel.secondLine) && C19383o.m32792b(this.city, receiptApiModel.city) && C19383o.m32792b(this.state, receiptApiModel.state) && C19383o.m32792b(this.zip, receiptApiModel.zip) && C19383o.m32792b(this.messageFromSeller, receiptApiModel.messageFromSeller) && C19383o.m32792b(this.messageFromBuyer, receiptApiModel.messageFromBuyer) && C19383o.m32792b(this.shippingNote, receiptApiModel.shippingNote) && C19383o.m32792b(this.shippingTrackingUrl, receiptApiModel.shippingTrackingUrl) && C19383o.m32792b(this.shippingDetails, receiptApiModel.shippingDetails) && this.creationTsz == receiptApiModel.creationTsz && C19383o.m32792b(this.canRefund, receiptApiModel.canRefund) && C19383o.m32792b(this.shippingNotificationTsz, receiptApiModel.shippingNotificationTsz) && C19383o.m32792b(this.shippedTsz, receiptApiModel.shippedTsz) && C19383o.m32792b(this.estimatedShippedTsz, receiptApiModel.estimatedShippedTsz) && C19383o.m32792b(this.coupon, receiptApiModel.coupon) && C19383o.m32792b(this.country, receiptApiModel.country) && C19383o.m32792b(this.buyer, receiptApiModel.buyer) && C19383o.m32792b(this.guestUser, receiptApiModel.guestUser) && C19383o.m32792b(this.seller, receiptApiModel.seller) && C19383o.m32792b(this.location, receiptApiModel.location) && C19383o.m32792b(this.transactions, receiptApiModel.transactions) && C19383o.m32792b(this.shipments, receiptApiModel.shipments) && C19383o.m32792b(this.userNotes, receiptApiModel.userNotes) && this.isGuest == receiptApiModel.isGuest && C19383o.m32792b(this.multiShopNote, receiptApiModel.multiShopNote) && this.isGift == receiptApiModel.isGift && C19383o.m32792b(this.giftMessage, receiptApiModel.giftMessage) && this.needsGiftWrap == receiptApiModel.needsGiftWrap;
    }

    public final User getBuyer() {
        return this.buyer;
    }

    public final Boolean getCanRefund() {
        return this.canRefund;
    }

    public final String getCity() {
        return this.city;
    }

    public final Country getCountry() {
        return this.country;
    }

    public final Coupon getCoupon() {
        return this.coupon;
    }

    public final long getCreationTsz() {
        return this.creationTsz;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDiscountAmount() {
        return this.discountAmount;
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

    public final Long getEstimatedShippedTsz() {
        return this.estimatedShippedTsz;
    }

    public final String getEtsyDiscountAmount() {
        return this.etsyDiscountAmount;
    }

    public final String getFirstLine() {
        return this.firstLine;
    }

    public final String getGiftCardAmountApplied() {
        return this.giftCardAmountApplied;
    }

    public final String getGiftMessage() {
        return this.giftMessage;
    }

    public final String getGiftPrice() {
        return this.giftPrice;
    }

    public final String getGrandTotalAmount() {
        return this.grandTotalAmount;
    }

    public final GuestUser getGuestUser() {
        return this.guestUser;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getMessageFromBuyer() {
        return this.messageFromBuyer;
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

    public final boolean getNeedsGiftWrap() {
        return this.needsGiftWrap;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    public final long getReceiptId() {
        return this.receiptId;
    }

    public final int getReceiptTypeCode() {
        return this.receiptTypeCode;
    }

    public final String getSecondLine() {
        return this.secondLine;
    }

    public final User getSeller() {
        return this.seller;
    }

    public final String getSellerEmail() {
        return this.sellerEmail;
    }

    public final List<ReceiptShipment> getShipments() {
        return this.shipments;
    }

    public final Long getShippedTsz() {
        return this.shippedTsz;
    }

    public final String getShippingCarrier() {
        return this.shippingCarrier;
    }

    public final ReceiptShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final String getShippingNote() {
        return this.shippingNote;
    }

    public final Long getShippingNotificationTsz() {
        return this.shippingNotificationTsz;
    }

    public final String getShippingTrackingUrl() {
        return this.shippingTrackingUrl;
    }

    public final String getState() {
        return this.state;
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

    public final List<UserNote> getUserNotes() {
        return this.userNotes;
    }

    public final List<String> getVatCreditNoteIds() {
        return this.vatCreditNoteIds;
    }

    public final boolean getWasGiftCardBalanceApplied() {
        return this.wasGiftCardBalanceApplied;
    }

    public final boolean getWasPaid() {
        return this.wasPaid;
    }

    public final boolean getWasShipped() {
        return this.wasShipped;
    }

    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.receiptTypeCode, Long.hashCode(this.receiptId) * 31, 31);
        String str = this.paymentMethodName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.paymentMethod;
        int hashCode2 = (hashCode + (paymentMethod2 == null ? 0 : paymentMethod2.hashCode())) * 31;
        boolean z = this.isFlaggedForManualFraudReview;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.wasPaid;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.wasGiftCardBalanceApplied;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        String str2 = this.giftCardAmountApplied;
        int e = C0023f.m105e(this.totalTaxCost, (i4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.giftPrice;
        int g = C13983i.m21488g(this.vatCreditNoteIds, C0023f.m105e(this.totalVatCost, (e + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.donationDescription;
        int hashCode3 = (g + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.donationTermsLinkUrl;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.donationTermsLinkText;
        int e2 = C0023f.m105e(this.transparentPriceMessage, C0023f.m105e(this.currencyCode, C0023f.m105e(this.grandTotalAmount, C0023f.m105e(this.etsyDiscountAmount, C0023f.m105e(this.discountAmount, C0023f.m105e(this.totalShippingCost, C0023f.m105e(this.totalPrice, (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z5 = this.wasShipped;
        if (z5) {
            z5 = true;
        }
        int i5 = (e2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isInPerson;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.isAnonymousBuyer;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        String str7 = this.shippingCarrier;
        int hashCode5 = (i7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sellerEmail;
        int e3 = C0023f.m105e(this.firstLine, C0023f.m105e(this.name, (hashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31);
        String str9 = this.secondLine;
        int e4 = C0023f.m105e(this.city, (e3 + (str9 == null ? 0 : str9.hashCode())) * 31, 31);
        String str10 = this.state;
        int hashCode6 = (e4 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.zip;
        int hashCode7 = (hashCode6 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.messageFromSeller;
        int hashCode8 = (hashCode7 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.messageFromBuyer;
        int hashCode9 = (hashCode8 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.shippingNote;
        int hashCode10 = (hashCode9 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.shippingTrackingUrl;
        int b = C0071c.m190b(this.creationTsz, (this.shippingDetails.hashCode() + ((hashCode10 + (str15 == null ? 0 : str15.hashCode())) * 31)) * 31, 31);
        Boolean bool = this.canRefund;
        int hashCode11 = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.shippingNotificationTsz;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.shippedTsz;
        int hashCode13 = (hashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.estimatedShippedTsz;
        int hashCode14 = (hashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Coupon coupon2 = this.coupon;
        int hashCode15 = (hashCode14 + (coupon2 == null ? 0 : coupon2.hashCode())) * 31;
        Country country2 = this.country;
        int hashCode16 = (hashCode15 + (country2 == null ? 0 : country2.hashCode())) * 31;
        User user = this.buyer;
        int hashCode17 = (hashCode16 + (user == null ? 0 : user.hashCode())) * 31;
        GuestUser guestUser2 = this.guestUser;
        int hashCode18 = (hashCode17 + (guestUser2 == null ? 0 : guestUser2.hashCode())) * 31;
        User user2 = this.seller;
        int hashCode19 = (hashCode18 + (user2 == null ? 0 : user2.hashCode())) * 31;
        Location location2 = this.location;
        int g2 = C13983i.m21488g(this.shipments, C13983i.m21488g(this.transactions, (hashCode19 + (location2 == null ? 0 : location2.hashCode())) * 31, 31), 31);
        List<UserNote> list = this.userNotes;
        if (list != null) {
            i = list.hashCode();
        }
        int i8 = (g2 + i) * 31;
        boolean z8 = this.isGuest;
        if (z8) {
            z8 = true;
        }
        int e5 = C0023f.m105e(this.multiShopNote, (i8 + (z8 ? 1 : 0)) * 31, 31);
        boolean z9 = this.isGift;
        if (z9) {
            z9 = true;
        }
        int e6 = C0023f.m105e(this.giftMessage, (e5 + (z9 ? 1 : 0)) * 31, 31);
        boolean z10 = this.needsGiftWrap;
        if (!z10) {
            z2 = z10;
        }
        return e6 + (z2 ? 1 : 0);
    }

    public final boolean isAnonymousBuyer() {
        return this.isAnonymousBuyer;
    }

    public final boolean isFlaggedForManualFraudReview() {
        return this.isFlaggedForManualFraudReview;
    }

    public final boolean isGift() {
        return this.isGift;
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final boolean isInPerson() {
        return this.isInPerson;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReceiptApiModel(receiptId=");
        h.append(this.receiptId);
        h.append(", receiptTypeCode=");
        h.append(this.receiptTypeCode);
        h.append(", paymentMethodName=");
        h.append(this.paymentMethodName);
        h.append(", paymentMethod=");
        h.append(this.paymentMethod);
        h.append(", isFlaggedForManualFraudReview=");
        h.append(this.isFlaggedForManualFraudReview);
        h.append(", wasPaid=");
        h.append(this.wasPaid);
        h.append(", wasGiftCardBalanceApplied=");
        h.append(this.wasGiftCardBalanceApplied);
        h.append(", giftCardAmountApplied=");
        h.append(this.giftCardAmountApplied);
        h.append(", totalTaxCost=");
        h.append(this.totalTaxCost);
        h.append(", giftPrice=");
        h.append(this.giftPrice);
        h.append(", totalVatCost=");
        h.append(this.totalVatCost);
        h.append(", vatCreditNoteIds=");
        h.append(this.vatCreditNoteIds);
        h.append(", donationDescription=");
        h.append(this.donationDescription);
        h.append(", donationTermsLinkUrl=");
        h.append(this.donationTermsLinkUrl);
        h.append(", donationTermsLinkText=");
        h.append(this.donationTermsLinkText);
        h.append(", totalPrice=");
        h.append(this.totalPrice);
        h.append(", totalShippingCost=");
        h.append(this.totalShippingCost);
        h.append(", discountAmount=");
        h.append(this.discountAmount);
        h.append(", etsyDiscountAmount=");
        h.append(this.etsyDiscountAmount);
        h.append(", grandTotalAmount=");
        h.append(this.grandTotalAmount);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", transparentPriceMessage=");
        h.append(this.transparentPriceMessage);
        h.append(", wasShipped=");
        h.append(this.wasShipped);
        h.append(", isInPerson=");
        h.append(this.isInPerson);
        h.append(", isAnonymousBuyer=");
        h.append(this.isAnonymousBuyer);
        h.append(", shippingCarrier=");
        h.append(this.shippingCarrier);
        h.append(", sellerEmail=");
        h.append(this.sellerEmail);
        h.append(", name=");
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
        h.append(", messageFromSeller=");
        h.append(this.messageFromSeller);
        h.append(", messageFromBuyer=");
        h.append(this.messageFromBuyer);
        h.append(", shippingNote=");
        h.append(this.shippingNote);
        h.append(", shippingTrackingUrl=");
        h.append(this.shippingTrackingUrl);
        h.append(", shippingDetails=");
        h.append(this.shippingDetails);
        h.append(", creationTsz=");
        h.append(this.creationTsz);
        h.append(", canRefund=");
        h.append(this.canRefund);
        h.append(", shippingNotificationTsz=");
        h.append(this.shippingNotificationTsz);
        h.append(", shippedTsz=");
        h.append(this.shippedTsz);
        h.append(", estimatedShippedTsz=");
        h.append(this.estimatedShippedTsz);
        h.append(", coupon=");
        h.append(this.coupon);
        h.append(", country=");
        h.append(this.country);
        h.append(", buyer=");
        h.append(this.buyer);
        h.append(", guestUser=");
        h.append(this.guestUser);
        h.append(", seller=");
        h.append(this.seller);
        h.append(", location=");
        h.append(this.location);
        h.append(", transactions=");
        h.append(this.transactions);
        h.append(", shipments=");
        h.append(this.shipments);
        h.append(", userNotes=");
        h.append(this.userNotes);
        h.append(", isGuest=");
        h.append(this.isGuest);
        h.append(", multiShopNote=");
        h.append(this.multiShopNote);
        h.append(", isGift=");
        h.append(this.isGift);
        h.append(", giftMessage=");
        h.append(this.giftMessage);
        h.append(", needsGiftWrap=");
        return C0391c.m1058d(h, this.needsGiftWrap, ')');
    }
}
