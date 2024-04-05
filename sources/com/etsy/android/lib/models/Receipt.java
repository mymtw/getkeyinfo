package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.C8698l;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p003a2.C0023f;
import p504ai.C13983i;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;

public final class Receipt implements C8698l, Serializable {
    public static final int $stable = 8;
    private final boolean areAllListingsDigitalDownloads;
    private final boolean areShippingDetailsRelevant;
    private final User buyer;
    private final String city;
    private final Country country;
    private final Coupon coupon;
    private final int daysUntilShipped;
    private final String donationDescription;
    private final String donationTermsLinkText;
    private final String donationTermsLinkUrl;
    private final EtsyMoney etsyDiscount;
    private final String firstLine;
    private final EtsyMoney giftCardAmountApplied;
    private final EtsyMoney grandTotal;
    private final GuestUser guestUser;
    private final boolean isFlaggedForManualFraudReview;
    private final boolean isGiftCardReceipt;
    private final boolean isGuest;
    private final boolean isInPerson;
    private final Location location;
    private final String messageFromBuyer;
    private final String messageFromSeller;
    private final String multiShopNote;
    private final String name;
    private final String paymentMethodName;
    private final long receiptId;
    private final String secondLine;
    private final User seller;
    private final String sellerEmail;
    private final List<ReceiptShipment> shipments;
    private final String shippingCarrier;
    private final String shippingNote;
    private final Date shippingNotificationDate;
    private final String shippingTrackingUrl;
    private final EtsyMoney shopDiscount;
    private final String state;
    private final EtsyMoney totalPrice;
    private final EtsyMoney totalShippingCost;
    private final EtsyMoney totalTaxCost;
    private final EtsyMoney totalVatCost;
    private final List<Transaction> transactions;
    private final String transparentPriceMessage;
    private final List<String> vatCreditNoteIds;
    private final boolean wasGiftCardBalanceApplied;
    private final boolean wasPaid;
    private final boolean wasShipped;
    private final String zip;

    public Receipt(long j, String str, String str2, String str3, String str4, String str5, String str6, Country country2, String str7, EtsyMoney etsyMoney, EtsyMoney etsyMoney2, EtsyMoney etsyMoney3, EtsyMoney etsyMoney4, EtsyMoney etsyMoney5, EtsyMoney etsyMoney6, EtsyMoney etsyMoney7, EtsyMoney etsyMoney8, List<String> list, String str8, String str9, String str10, Location location2, boolean z, boolean z2, boolean z3, Coupon coupon2, List<? extends Transaction> list2, List<? extends ReceiptShipment> list3, String str11, boolean z4, int i, Date date, String str12, String str13, boolean z5, String str14, String str15, boolean z6, boolean z7, User user, String str16, boolean z8, User user2, GuestUser guestUser2, boolean z9, String str17, String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        EtsyMoney etsyMoney9 = etsyMoney;
        EtsyMoney etsyMoney10 = etsyMoney2;
        EtsyMoney etsyMoney11 = etsyMoney4;
        EtsyMoney etsyMoney12 = etsyMoney5;
        EtsyMoney etsyMoney13 = etsyMoney6;
        EtsyMoney etsyMoney14 = etsyMoney8;
        List<? extends Transaction> list4 = list2;
        C19383o.m32797g(str19, "name");
        C19383o.m32797g(str20, "firstLine");
        C19383o.m32797g(str21, "secondLine");
        C19383o.m32797g(str22, "city");
        C19383o.m32797g(str23, "state");
        C19383o.m32797g(str24, ResponseConstants.ZIP);
        C19383o.m32797g(etsyMoney9, "totalPrice");
        C19383o.m32797g(etsyMoney10, "shopDiscount");
        C19383o.m32797g(etsyMoney11, "totalTaxCost");
        C19383o.m32797g(etsyMoney12, "totalVatCost");
        C19383o.m32797g(etsyMoney13, "totalShippingCost");
        C19383o.m32797g(etsyMoney14, "grandTotal");
        C19383o.m32797g(list4, ResponseConstants.TRANSACTIONS);
        C19383o.m32797g(list3, "shipments");
        C19383o.m32797g(str17, "transparentPriceMessage");
        this.receiptId = j;
        this.name = str19;
        this.firstLine = str20;
        this.secondLine = str21;
        this.city = str22;
        this.state = str23;
        this.zip = str24;
        this.country = country2;
        this.paymentMethodName = str7;
        this.totalPrice = etsyMoney9;
        this.shopDiscount = etsyMoney10;
        this.etsyDiscount = etsyMoney3;
        this.totalTaxCost = etsyMoney11;
        this.totalVatCost = etsyMoney12;
        this.totalShippingCost = etsyMoney13;
        this.giftCardAmountApplied = etsyMoney7;
        this.grandTotal = etsyMoney14;
        this.vatCreditNoteIds = list;
        this.donationDescription = str8;
        this.donationTermsLinkText = str9;
        this.donationTermsLinkUrl = str10;
        this.location = location2;
        this.isFlaggedForManualFraudReview = z;
        this.wasPaid = z2;
        this.wasGiftCardBalanceApplied = z3;
        this.coupon = coupon2;
        this.transactions = list4;
        this.shipments = list3;
        this.shippingNote = str11;
        this.wasShipped = z4;
        this.daysUntilShipped = i;
        this.shippingNotificationDate = date;
        this.shippingCarrier = str12;
        this.shippingTrackingUrl = str13;
        this.areShippingDetailsRelevant = z5;
        this.messageFromSeller = str14;
        this.messageFromBuyer = str15;
        this.isInPerson = z6;
        this.areAllListingsDigitalDownloads = z7;
        this.seller = user;
        this.sellerEmail = str16;
        this.isGuest = z8;
        this.buyer = user2;
        this.guestUser = guestUser2;
        this.isGiftCardReceipt = z9;
        this.transparentPriceMessage = str17;
        this.multiShopNote = str18;
    }

    public static /* synthetic */ Receipt copy$default(Receipt receipt, long j, String str, String str2, String str3, String str4, String str5, String str6, Country country2, String str7, EtsyMoney etsyMoney, EtsyMoney etsyMoney2, EtsyMoney etsyMoney3, EtsyMoney etsyMoney4, EtsyMoney etsyMoney5, EtsyMoney etsyMoney6, EtsyMoney etsyMoney7, EtsyMoney etsyMoney8, List list, String str8, String str9, String str10, Location location2, boolean z, boolean z2, boolean z3, Coupon coupon2, List list2, List list3, String str11, boolean z4, int i, Date date, String str12, String str13, boolean z5, String str14, String str15, boolean z6, boolean z7, User user, String str16, boolean z8, User user2, GuestUser guestUser2, boolean z9, String str17, String str18, int i2, int i3, Object obj) {
        Receipt receipt2 = receipt;
        int i4 = i2;
        int i5 = i3;
        return receipt.copy((i4 & 1) != 0 ? receipt2.receiptId : j, (i4 & 2) != 0 ? receipt2.name : str, (i4 & 4) != 0 ? receipt2.firstLine : str2, (i4 & 8) != 0 ? receipt2.secondLine : str3, (i4 & 16) != 0 ? receipt2.city : str4, (i4 & 32) != 0 ? receipt2.state : str5, (i4 & 64) != 0 ? receipt2.zip : str6, (i4 & 128) != 0 ? receipt2.country : country2, (i4 & 256) != 0 ? receipt2.paymentMethodName : str7, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? receipt2.totalPrice : etsyMoney, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? receipt2.shopDiscount : etsyMoney2, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? receipt2.etsyDiscount : etsyMoney3, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? receipt2.totalTaxCost : etsyMoney4, (i4 & 8192) != 0 ? receipt2.totalVatCost : etsyMoney5, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? receipt2.totalShippingCost : etsyMoney6, (i4 & 32768) != 0 ? receipt2.giftCardAmountApplied : etsyMoney7, (i4 & 65536) != 0 ? receipt2.grandTotal : etsyMoney8, (i4 & 131072) != 0 ? receipt2.vatCreditNoteIds : list, (i4 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? receipt2.donationDescription : str8, (i4 & 524288) != 0 ? receipt2.donationTermsLinkText : str9, (i4 & 1048576) != 0 ? receipt2.donationTermsLinkUrl : str10, (i4 & 2097152) != 0 ? receipt2.location : location2, (i4 & 4194304) != 0 ? receipt2.isFlaggedForManualFraudReview : z, (i4 & 8388608) != 0 ? receipt2.wasPaid : z2, (i4 & 16777216) != 0 ? receipt2.wasGiftCardBalanceApplied : z3, (i4 & 33554432) != 0 ? receipt2.coupon : coupon2, (i4 & 67108864) != 0 ? receipt2.transactions : list2, (i4 & 134217728) != 0 ? receipt2.shipments : list3, (i4 & 268435456) != 0 ? receipt2.shippingNote : str11, (i4 & 536870912) != 0 ? receipt2.wasShipped : z4, (i4 & 1073741824) != 0 ? receipt2.daysUntilShipped : i, (i4 & Integer.MIN_VALUE) != 0 ? receipt2.shippingNotificationDate : date, (i5 & 1) != 0 ? receipt2.shippingCarrier : str12, (i5 & 2) != 0 ? receipt2.shippingTrackingUrl : str13, (i5 & 4) != 0 ? receipt2.areShippingDetailsRelevant : z5, (i5 & 8) != 0 ? receipt2.messageFromSeller : str14, (i5 & 16) != 0 ? receipt2.messageFromBuyer : str15, (i5 & 32) != 0 ? receipt2.isInPerson : z6, (i5 & 64) != 0 ? receipt2.areAllListingsDigitalDownloads : z7, (i5 & 128) != 0 ? receipt2.seller : user, (i5 & 256) != 0 ? receipt2.sellerEmail : str16, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? receipt2.isGuest : z8, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? receipt2.buyer : user2, (i5 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? receipt2.guestUser : guestUser2, (i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? receipt2.isGiftCardReceipt : z9, (i5 & 8192) != 0 ? receipt2.transparentPriceMessage : str17, (i5 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? receipt2.multiShopNote : str18);
    }

    public final boolean areAllListingsDigitalDownloads() {
        return this.areAllListingsDigitalDownloads;
    }

    public final boolean areShippingDetailsRelevant() {
        return this.areShippingDetailsRelevant;
    }

    public final long component1() {
        return this.receiptId;
    }

    public final EtsyMoney component10() {
        return this.totalPrice;
    }

    public final EtsyMoney component11() {
        return this.shopDiscount;
    }

    public final EtsyMoney component12() {
        return this.etsyDiscount;
    }

    public final EtsyMoney component13() {
        return this.totalTaxCost;
    }

    public final EtsyMoney component14() {
        return this.totalVatCost;
    }

    public final EtsyMoney component15() {
        return this.totalShippingCost;
    }

    public final EtsyMoney component16() {
        return this.giftCardAmountApplied;
    }

    public final EtsyMoney component17() {
        return this.grandTotal;
    }

    public final List<String> component18() {
        return this.vatCreditNoteIds;
    }

    public final String component19() {
        return this.donationDescription;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.donationTermsLinkText;
    }

    public final String component21() {
        return this.donationTermsLinkUrl;
    }

    public final Location component22() {
        return this.location;
    }

    public final boolean component23() {
        return this.isFlaggedForManualFraudReview;
    }

    public final boolean component24() {
        return this.wasPaid;
    }

    public final boolean component25() {
        return this.wasGiftCardBalanceApplied;
    }

    public final Coupon component26() {
        return this.coupon;
    }

    public final List<Transaction> component27() {
        return this.transactions;
    }

    public final List<ReceiptShipment> component28() {
        return this.shipments;
    }

    public final String component29() {
        return this.shippingNote;
    }

    public final String component3() {
        return this.firstLine;
    }

    public final boolean component30() {
        return this.wasShipped;
    }

    public final int component31() {
        return this.daysUntilShipped;
    }

    public final Date component32() {
        return this.shippingNotificationDate;
    }

    public final String component33() {
        return this.shippingCarrier;
    }

    public final String component34() {
        return this.shippingTrackingUrl;
    }

    public final boolean component35() {
        return this.areShippingDetailsRelevant;
    }

    public final String component36() {
        return this.messageFromSeller;
    }

    public final String component37() {
        return this.messageFromBuyer;
    }

    public final boolean component38() {
        return this.isInPerson;
    }

    public final boolean component39() {
        return this.areAllListingsDigitalDownloads;
    }

    public final String component4() {
        return this.secondLine;
    }

    public final User component40() {
        return this.seller;
    }

    public final String component41() {
        return this.sellerEmail;
    }

    public final boolean component42() {
        return this.isGuest;
    }

    public final User component43() {
        return this.buyer;
    }

    public final GuestUser component44() {
        return this.guestUser;
    }

    public final boolean component45() {
        return this.isGiftCardReceipt;
    }

    public final String component46() {
        return this.transparentPriceMessage;
    }

    public final String component47() {
        return this.multiShopNote;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.zip;
    }

    public final Country component8() {
        return this.country;
    }

    public final String component9() {
        return this.paymentMethodName;
    }

    public final Receipt copy(long j, String str, String str2, String str3, String str4, String str5, String str6, Country country2, String str7, EtsyMoney etsyMoney, EtsyMoney etsyMoney2, EtsyMoney etsyMoney3, EtsyMoney etsyMoney4, EtsyMoney etsyMoney5, EtsyMoney etsyMoney6, EtsyMoney etsyMoney7, EtsyMoney etsyMoney8, List<String> list, String str8, String str9, String str10, Location location2, boolean z, boolean z2, boolean z3, Coupon coupon2, List<? extends Transaction> list2, List<? extends ReceiptShipment> list3, String str11, boolean z4, int i, Date date, String str12, String str13, boolean z5, String str14, String str15, boolean z6, boolean z7, User user, String str16, boolean z8, User user2, GuestUser guestUser2, boolean z9, String str17, String str18) {
        long j2 = j;
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "firstLine");
        C19383o.m32797g(str3, "secondLine");
        C19383o.m32797g(str4, "city");
        C19383o.m32797g(str5, "state");
        C19383o.m32797g(str6, ResponseConstants.ZIP);
        C19383o.m32797g(etsyMoney, "totalPrice");
        C19383o.m32797g(etsyMoney2, "shopDiscount");
        C19383o.m32797g(etsyMoney4, "totalTaxCost");
        C19383o.m32797g(etsyMoney5, "totalVatCost");
        C19383o.m32797g(etsyMoney6, "totalShippingCost");
        C19383o.m32797g(etsyMoney8, "grandTotal");
        C19383o.m32797g(list2, ResponseConstants.TRANSACTIONS);
        C19383o.m32797g(list3, "shipments");
        C19383o.m32797g(str17, "transparentPriceMessage");
        return new Receipt(j, str, str2, str3, str4, str5, str6, country2, str7, etsyMoney, etsyMoney2, etsyMoney3, etsyMoney4, etsyMoney5, etsyMoney6, etsyMoney7, etsyMoney8, list, str8, str9, str10, location2, z, z2, z3, coupon2, list2, list3, str11, z4, i, date, str12, str13, z5, str14, str15, z6, z7, user, str16, z8, user2, guestUser2, z9, str17, str18);
    }

    public final int daysUntilShipped() {
        return this.daysUntilShipped;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        return this.receiptId == receipt.receiptId && C19383o.m32792b(this.name, receipt.name) && C19383o.m32792b(this.firstLine, receipt.firstLine) && C19383o.m32792b(this.secondLine, receipt.secondLine) && C19383o.m32792b(this.city, receipt.city) && C19383o.m32792b(this.state, receipt.state) && C19383o.m32792b(this.zip, receipt.zip) && C19383o.m32792b(this.country, receipt.country) && C19383o.m32792b(this.paymentMethodName, receipt.paymentMethodName) && C19383o.m32792b(this.totalPrice, receipt.totalPrice) && C19383o.m32792b(this.shopDiscount, receipt.shopDiscount) && C19383o.m32792b(this.etsyDiscount, receipt.etsyDiscount) && C19383o.m32792b(this.totalTaxCost, receipt.totalTaxCost) && C19383o.m32792b(this.totalVatCost, receipt.totalVatCost) && C19383o.m32792b(this.totalShippingCost, receipt.totalShippingCost) && C19383o.m32792b(this.giftCardAmountApplied, receipt.giftCardAmountApplied) && C19383o.m32792b(this.grandTotal, receipt.grandTotal) && C19383o.m32792b(this.vatCreditNoteIds, receipt.vatCreditNoteIds) && C19383o.m32792b(this.donationDescription, receipt.donationDescription) && C19383o.m32792b(this.donationTermsLinkText, receipt.donationTermsLinkText) && C19383o.m32792b(this.donationTermsLinkUrl, receipt.donationTermsLinkUrl) && C19383o.m32792b(this.location, receipt.location) && this.isFlaggedForManualFraudReview == receipt.isFlaggedForManualFraudReview && this.wasPaid == receipt.wasPaid && this.wasGiftCardBalanceApplied == receipt.wasGiftCardBalanceApplied && C19383o.m32792b(this.coupon, receipt.coupon) && C19383o.m32792b(this.transactions, receipt.transactions) && C19383o.m32792b(this.shipments, receipt.shipments) && C19383o.m32792b(this.shippingNote, receipt.shippingNote) && this.wasShipped == receipt.wasShipped && this.daysUntilShipped == receipt.daysUntilShipped && C19383o.m32792b(this.shippingNotificationDate, receipt.shippingNotificationDate) && C19383o.m32792b(this.shippingCarrier, receipt.shippingCarrier) && C19383o.m32792b(this.shippingTrackingUrl, receipt.shippingTrackingUrl) && this.areShippingDetailsRelevant == receipt.areShippingDetailsRelevant && C19383o.m32792b(this.messageFromSeller, receipt.messageFromSeller) && C19383o.m32792b(this.messageFromBuyer, receipt.messageFromBuyer) && this.isInPerson == receipt.isInPerson && this.areAllListingsDigitalDownloads == receipt.areAllListingsDigitalDownloads && C19383o.m32792b(this.seller, receipt.seller) && C19383o.m32792b(this.sellerEmail, receipt.sellerEmail) && this.isGuest == receipt.isGuest && C19383o.m32792b(this.buyer, receipt.buyer) && C19383o.m32792b(this.guestUser, receipt.guestUser) && this.isGiftCardReceipt == receipt.isGiftCardReceipt && C19383o.m32792b(this.transparentPriceMessage, receipt.transparentPriceMessage) && C19383o.m32792b(this.multiShopNote, receipt.multiShopNote);
    }

    public final boolean getAreAllListingsDigitalDownloads() {
        return this.areAllListingsDigitalDownloads;
    }

    public final boolean getAreShippingDetailsRelevant() {
        return this.areShippingDetailsRelevant;
    }

    public final User getBuyer() {
        return this.buyer;
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

    public final int getDaysUntilShipped() {
        return this.daysUntilShipped;
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

    public final EtsyMoney getEtsyDiscount() {
        return this.etsyDiscount;
    }

    public final String getFirstLine() {
        return this.firstLine;
    }

    public final String getFormattedAddressWithLineBreaks() {
        String str;
        if (!C19457k.m33020X0(this.city)) {
            str = this.city + ", " + this.state;
        } else {
            str = this.state;
        }
        String[] strArr = new String[6];
        strArr[0] = this.name;
        strArr[1] = this.firstLine;
        strArr[2] = this.secondLine;
        strArr[3] = str;
        strArr[4] = this.zip;
        Country country2 = this.country;
        strArr[5] = country2 != null ? country2.getName() : null;
        List e0 = C17782b.m29865e0(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : e0) {
            if (C18263b.m30837c0((String) next)) {
                arrayList.add(next);
            }
        }
        return C19327t.m32644Z0(arrayList, "\n", (String) null, (String) null, (C19857l) null, 62);
    }

    public final EtsyMoney getGiftCardAmountApplied() {
        return this.giftCardAmountApplied;
    }

    public final EtsyMoney getGrandTotal() {
        return this.grandTotal;
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

    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    public final long getReceiptId() {
        return this.receiptId;
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

    public final String getShippingCarrier() {
        return this.shippingCarrier;
    }

    public final String getShippingNote() {
        return this.shippingNote;
    }

    public final Date getShippingNotificationDate() {
        return this.shippingNotificationDate;
    }

    public final String getShippingTrackingUrl() {
        return this.shippingTrackingUrl;
    }

    public final EtsyMoney getShopDiscount() {
        return this.shopDiscount;
    }

    public final String getState() {
        return this.state;
    }

    public final EtsyMoney getTotalPrice() {
        return this.totalPrice;
    }

    public final EtsyMoney getTotalShippingCost() {
        return this.totalShippingCost;
    }

    public final EtsyMoney getTotalTaxCost() {
        return this.totalTaxCost;
    }

    public final EtsyMoney getTotalVatCost() {
        return this.totalVatCost;
    }

    public final List<Transaction> getTransactions() {
        return this.transactions;
    }

    public final String getTransparentPriceMessage() {
        return this.transparentPriceMessage;
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

    public final boolean hasTransparentPriceMessage() {
        return !C19457k.m33020X0(this.transparentPriceMessage);
    }

    public int hashCode() {
        int e = C0023f.m105e(this.zip, C0023f.m105e(this.state, C0023f.m105e(this.city, C0023f.m105e(this.secondLine, C0023f.m105e(this.firstLine, C0023f.m105e(this.name, Long.hashCode(this.receiptId) * 31, 31), 31), 31), 31), 31), 31);
        Country country2 = this.country;
        int i = 0;
        int hashCode = (e + (country2 == null ? 0 : country2.hashCode())) * 31;
        String str = this.paymentMethodName;
        int hashCode2 = (this.shopDiscount.hashCode() + ((this.totalPrice.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        EtsyMoney etsyMoney = this.etsyDiscount;
        int hashCode3 = (this.totalShippingCost.hashCode() + ((this.totalVatCost.hashCode() + ((this.totalTaxCost.hashCode() + ((hashCode2 + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31)) * 31)) * 31)) * 31;
        EtsyMoney etsyMoney2 = this.giftCardAmountApplied;
        int hashCode4 = (this.grandTotal.hashCode() + ((hashCode3 + (etsyMoney2 == null ? 0 : etsyMoney2.hashCode())) * 31)) * 31;
        List<String> list = this.vatCreditNoteIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.donationDescription;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.donationTermsLinkText;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.donationTermsLinkUrl;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Location location2 = this.location;
        int hashCode9 = (hashCode8 + (location2 == null ? 0 : location2.hashCode())) * 31;
        boolean z = this.isFlaggedForManualFraudReview;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
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
        Coupon coupon2 = this.coupon;
        int g = C13983i.m21488g(this.shipments, C13983i.m21488g(this.transactions, (i4 + (coupon2 == null ? 0 : coupon2.hashCode())) * 31, 31), 31);
        String str5 = this.shippingNote;
        int hashCode10 = (g + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z5 = this.wasShipped;
        if (z5) {
            z5 = true;
        }
        int a = C0069a.m170a(this.daysUntilShipped, (hashCode10 + (z5 ? 1 : 0)) * 31, 31);
        Date date = this.shippingNotificationDate;
        int hashCode11 = (a + (date == null ? 0 : date.hashCode())) * 31;
        String str6 = this.shippingCarrier;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shippingTrackingUrl;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z6 = this.areShippingDetailsRelevant;
        if (z6) {
            z6 = true;
        }
        int i5 = (hashCode13 + (z6 ? 1 : 0)) * 31;
        String str8 = this.messageFromSeller;
        int hashCode14 = (i5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.messageFromBuyer;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z7 = this.isInPerson;
        if (z7) {
            z7 = true;
        }
        int i6 = (hashCode15 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.areAllListingsDigitalDownloads;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        User user = this.seller;
        int hashCode16 = (i7 + (user == null ? 0 : user.hashCode())) * 31;
        String str10 = this.sellerEmail;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        boolean z9 = this.isGuest;
        if (z9) {
            z9 = true;
        }
        int i8 = (hashCode17 + (z9 ? 1 : 0)) * 31;
        User user2 = this.buyer;
        int hashCode18 = (i8 + (user2 == null ? 0 : user2.hashCode())) * 31;
        GuestUser guestUser2 = this.guestUser;
        int hashCode19 = (hashCode18 + (guestUser2 == null ? 0 : guestUser2.hashCode())) * 31;
        boolean z10 = this.isGiftCardReceipt;
        if (!z10) {
            z2 = z10;
        }
        int e2 = C0023f.m105e(this.transparentPriceMessage, (hashCode19 + (z2 ? 1 : 0)) * 31, 31);
        String str11 = this.multiShopNote;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return e2 + i;
    }

    public final boolean isFlaggedForManualFraudReview() {
        return this.isFlaggedForManualFraudReview;
    }

    public final boolean isGiftCardReceipt() {
        return this.isGiftCardReceipt;
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final boolean isInPerson() {
        return this.isInPerson;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Receipt(receiptId=");
        h.append(this.receiptId);
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
        h.append(", country=");
        h.append(this.country);
        h.append(", paymentMethodName=");
        h.append(this.paymentMethodName);
        h.append(", totalPrice=");
        h.append(this.totalPrice);
        h.append(", shopDiscount=");
        h.append(this.shopDiscount);
        h.append(", etsyDiscount=");
        h.append(this.etsyDiscount);
        h.append(", totalTaxCost=");
        h.append(this.totalTaxCost);
        h.append(", totalVatCost=");
        h.append(this.totalVatCost);
        h.append(", totalShippingCost=");
        h.append(this.totalShippingCost);
        h.append(", giftCardAmountApplied=");
        h.append(this.giftCardAmountApplied);
        h.append(", grandTotal=");
        h.append(this.grandTotal);
        h.append(", vatCreditNoteIds=");
        h.append(this.vatCreditNoteIds);
        h.append(", donationDescription=");
        h.append(this.donationDescription);
        h.append(", donationTermsLinkText=");
        h.append(this.donationTermsLinkText);
        h.append(", donationTermsLinkUrl=");
        h.append(this.donationTermsLinkUrl);
        h.append(", location=");
        h.append(this.location);
        h.append(", isFlaggedForManualFraudReview=");
        h.append(this.isFlaggedForManualFraudReview);
        h.append(", wasPaid=");
        h.append(this.wasPaid);
        h.append(", wasGiftCardBalanceApplied=");
        h.append(this.wasGiftCardBalanceApplied);
        h.append(", coupon=");
        h.append(this.coupon);
        h.append(", transactions=");
        h.append(this.transactions);
        h.append(", shipments=");
        h.append(this.shipments);
        h.append(", shippingNote=");
        h.append(this.shippingNote);
        h.append(", wasShipped=");
        h.append(this.wasShipped);
        h.append(", daysUntilShipped=");
        h.append(this.daysUntilShipped);
        h.append(", shippingNotificationDate=");
        h.append(this.shippingNotificationDate);
        h.append(", shippingCarrier=");
        h.append(this.shippingCarrier);
        h.append(", shippingTrackingUrl=");
        h.append(this.shippingTrackingUrl);
        h.append(", areShippingDetailsRelevant=");
        h.append(this.areShippingDetailsRelevant);
        h.append(", messageFromSeller=");
        h.append(this.messageFromSeller);
        h.append(", messageFromBuyer=");
        h.append(this.messageFromBuyer);
        h.append(", isInPerson=");
        h.append(this.isInPerson);
        h.append(", areAllListingsDigitalDownloads=");
        h.append(this.areAllListingsDigitalDownloads);
        h.append(", seller=");
        h.append(this.seller);
        h.append(", sellerEmail=");
        h.append(this.sellerEmail);
        h.append(", isGuest=");
        h.append(this.isGuest);
        h.append(", buyer=");
        h.append(this.buyer);
        h.append(", guestUser=");
        h.append(this.guestUser);
        h.append(", isGiftCardReceipt=");
        h.append(this.isGiftCardReceipt);
        h.append(", transparentPriceMessage=");
        h.append(this.transparentPriceMessage);
        h.append(", multiShopNote=");
        return C0391c.m1057c(h, this.multiShopNote, ')');
    }

    public final boolean wasPaid() {
        return this.wasPaid;
    }

    public final boolean wasShipped() {
        return this.wasShipped;
    }
}
