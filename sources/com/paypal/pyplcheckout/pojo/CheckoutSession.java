package com.paypal.pyplcheckout.pojo;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CheckoutSession {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("allowedCardIssuers")
    private final List<CardIssuerType> allowedCardIssuers;
    @C18417a("billingAddresses")
    private final List<BillingAddress> billingAddresses;
    @C18417a("buyer")
    private final BuyerDetails buyer;
    @C18417a("cart")
    private final Cart cart;
    @C18417a("checkoutSessionType")
    private final CheckoutSessionType checkoutSessionType;
    @C18417a("creditPPCOffers")
    private final List<CreditPPCOffer> creditPPCOffers;
    @C18417a("flags")
    private final Flags flags;
    @C18417a("fundingOptions")
    private final List<FundingOption> fundingOptions;
    @C18417a("merchant")
    private final CheckoutMerchant merchant;
    @C18417a("paymentContingencies")
    private final PaymentContingencies paymentContingencies;
    @C18417a("shippingAddresses")
    private final List<ShippingAddress> shippingAddresses;
    @C18417a("supportedFundingSources")
    private final List<SupportedFundingSources> supportedFundingSources;
    @C18417a("userAction")
    private final String userAction;

    public CheckoutSession() {
        this((List) null, (Flags) null, (Cart) null, (BuyerDetails) null, (List) null, (List) null, (PaymentContingencies) null, (String) null, (CheckoutMerchant) null, (List) null, (List) null, (List) null, (CheckoutSessionType) null, (Map) null, 16383, (DefaultConstructorMarker) null);
    }

    public CheckoutSession(List<ShippingAddress> list, Flags flags2, Cart cart2, BuyerDetails buyerDetails, List<CreditPPCOffer> list2, List<FundingOption> list3, PaymentContingencies paymentContingencies2, String str, CheckoutMerchant checkoutMerchant, List<BillingAddress> list4, List<SupportedFundingSources> list5, List<? extends CardIssuerType> list6, CheckoutSessionType checkoutSessionType2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.shippingAddresses = list;
        this.flags = flags2;
        this.cart = cart2;
        this.buyer = buyerDetails;
        this.creditPPCOffers = list2;
        this.fundingOptions = list3;
        this.paymentContingencies = paymentContingencies2;
        this.userAction = str;
        this.merchant = checkoutMerchant;
        this.billingAddresses = list4;
        this.supportedFundingSources = list5;
        this.allowedCardIssuers = list6;
        this.checkoutSessionType = checkoutSessionType2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CheckoutSession copy$default(CheckoutSession checkoutSession, List list, Flags flags2, Cart cart2, BuyerDetails buyerDetails, List list2, List list3, PaymentContingencies paymentContingencies2, String str, CheckoutMerchant checkoutMerchant, List list4, List list5, List list6, CheckoutSessionType checkoutSessionType2, Map map, int i, Object obj) {
        CheckoutSession checkoutSession2 = checkoutSession;
        int i2 = i;
        return checkoutSession.copy((i2 & 1) != 0 ? checkoutSession2.shippingAddresses : list, (i2 & 2) != 0 ? checkoutSession2.flags : flags2, (i2 & 4) != 0 ? checkoutSession2.cart : cart2, (i2 & 8) != 0 ? checkoutSession2.buyer : buyerDetails, (i2 & 16) != 0 ? checkoutSession2.creditPPCOffers : list2, (i2 & 32) != 0 ? checkoutSession2.fundingOptions : list3, (i2 & 64) != 0 ? checkoutSession2.paymentContingencies : paymentContingencies2, (i2 & 128) != 0 ? checkoutSession2.userAction : str, (i2 & 256) != 0 ? checkoutSession2.merchant : checkoutMerchant, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? checkoutSession2.billingAddresses : list4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? checkoutSession2.supportedFundingSources : list5, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? checkoutSession2.allowedCardIssuers : list6, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? checkoutSession2.checkoutSessionType : checkoutSessionType2, (i2 & 8192) != 0 ? checkoutSession2.additionalProperties : map);
    }

    private final boolean notEquals(Object obj, Object obj2) {
        return obj == null ? obj2 != null : !C19383o.m32792b(obj, obj2);
    }

    public final List<ShippingAddress> component1() {
        return this.shippingAddresses;
    }

    public final List<BillingAddress> component10() {
        return this.billingAddresses;
    }

    public final List<SupportedFundingSources> component11() {
        return this.supportedFundingSources;
    }

    public final List<CardIssuerType> component12() {
        return this.allowedCardIssuers;
    }

    public final CheckoutSessionType component13() {
        return this.checkoutSessionType;
    }

    public final Map<String, Object> component14() {
        return this.additionalProperties;
    }

    public final Flags component2() {
        return this.flags;
    }

    public final Cart component3() {
        return this.cart;
    }

    public final BuyerDetails component4() {
        return this.buyer;
    }

    public final List<CreditPPCOffer> component5() {
        return this.creditPPCOffers;
    }

    public final List<FundingOption> component6() {
        return this.fundingOptions;
    }

    public final PaymentContingencies component7() {
        return this.paymentContingencies;
    }

    public final String component8() {
        return this.userAction;
    }

    public final CheckoutMerchant component9() {
        return this.merchant;
    }

    public final CheckoutSession copy(List<ShippingAddress> list, Flags flags2, Cart cart2, BuyerDetails buyerDetails, List<CreditPPCOffer> list2, List<FundingOption> list3, PaymentContingencies paymentContingencies2, String str, CheckoutMerchant checkoutMerchant, List<BillingAddress> list4, List<SupportedFundingSources> list5, List<? extends CardIssuerType> list6, CheckoutSessionType checkoutSessionType2, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new CheckoutSession(list, flags2, cart2, buyerDetails, list2, list3, paymentContingencies2, str, checkoutMerchant, list4, list5, list6, checkoutSessionType2, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(CheckoutSession.class, obj.getClass())) {
            return false;
        }
        CheckoutSession checkoutSession = (CheckoutSession) obj;
        if (!notEquals(this.shippingAddresses, checkoutSession.shippingAddresses) && !notEquals(this.flags, checkoutSession.flags) && !notEquals(this.cart, checkoutSession.cart) && !notEquals(this.creditPPCOffers, checkoutSession.creditPPCOffers) && !notEquals(this.fundingOptions, checkoutSession.fundingOptions) && !notEquals(this.paymentContingencies, checkoutSession.paymentContingencies) && !notEquals(this.userAction, checkoutSession.userAction) && !notEquals(this.merchant, checkoutSession.merchant)) {
            return C19383o.m32792b(this.additionalProperties, checkoutSession.additionalProperties);
        }
        return false;
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final List<CardIssuerType> getAllowedCardIssuers() {
        return this.allowedCardIssuers;
    }

    public final List<BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
    }

    public final BuyerDetails getBuyer() {
        return this.buyer;
    }

    public final Cart getCart() {
        return this.cart;
    }

    public final CheckoutSessionType getCheckoutSessionType() {
        return this.checkoutSessionType;
    }

    public final List<CreditPPCOffer> getCreditPPCOffers() {
        return this.creditPPCOffers;
    }

    public final Flags getFlags() {
        return this.flags;
    }

    public final List<FundingOption> getFundingOptions() {
        return this.fundingOptions;
    }

    public final CheckoutMerchant getMerchant() {
        return this.merchant;
    }

    public final PaymentContingencies getPaymentContingencies() {
        return this.paymentContingencies;
    }

    public final List<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final List<SupportedFundingSources> getSupportedFundingSources() {
        return this.supportedFundingSources;
    }

    public final String getUserAction() {
        return this.userAction;
    }

    public int hashCode() {
        List<ShippingAddress> list = this.shippingAddresses;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Flags flags2 = this.flags;
        int hashCode2 = (hashCode + (flags2 == null ? 0 : flags2.hashCode())) * 31;
        Cart cart2 = this.cart;
        int hashCode3 = (hashCode2 + (cart2 == null ? 0 : cart2.hashCode())) * 31;
        List<CreditPPCOffer> list2 = this.creditPPCOffers;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FundingOption> list3 = this.fundingOptions;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        int hashCode6 = (hashCode5 + (paymentContingencies2 == null ? 0 : paymentContingencies2.hashCode())) * 31;
        String str = this.userAction;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        CheckoutMerchant checkoutMerchant = this.merchant;
        if (checkoutMerchant != null) {
            i = checkoutMerchant.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode7 + i) * 31);
    }

    public String toString() {
        List<ShippingAddress> list = this.shippingAddresses;
        Flags flags2 = this.flags;
        Cart cart2 = this.cart;
        BuyerDetails buyerDetails = this.buyer;
        List<CreditPPCOffer> list2 = this.creditPPCOffers;
        List<FundingOption> list3 = this.fundingOptions;
        PaymentContingencies paymentContingencies2 = this.paymentContingencies;
        String str = this.userAction;
        CheckoutMerchant checkoutMerchant = this.merchant;
        List<BillingAddress> list4 = this.billingAddresses;
        List<SupportedFundingSources> list5 = this.supportedFundingSources;
        List<CardIssuerType> list6 = this.allowedCardIssuers;
        CheckoutSessionType checkoutSessionType2 = this.checkoutSessionType;
        Map<String, Object> map = this.additionalProperties;
        return "CheckoutSession(shippingAddresses=" + list + ", flags=" + flags2 + ", cart=" + cart2 + ", buyer=" + buyerDetails + ", creditPPCOffers=" + list2 + ", fundingOptions=" + list3 + ", paymentContingencies=" + paymentContingencies2 + ", userAction=" + str + ", merchant=" + checkoutMerchant + ", billingAddresses=" + list4 + ", supportedFundingSources=" + list5 + ", allowedCardIssuers=" + list6 + ", checkoutSessionType=" + checkoutSessionType2 + ", additionalProperties=" + map + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckoutSession(java.util.List r16, com.paypal.pyplcheckout.pojo.Flags r17, com.paypal.pyplcheckout.pojo.Cart r18, com.paypal.pyplcheckout.pojo.BuyerDetails r19, java.util.List r20, java.util.List r21, com.paypal.pyplcheckout.pojo.PaymentContingencies r22, java.lang.String r23, com.paypal.pyplcheckout.pojo.CheckoutMerchant r24, java.util.List r25, java.util.List r26, java.util.List r27, com.paypal.pyplcheckout.pojo.CheckoutSessionType r28, java.util.Map r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r20
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r21
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r22
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r23
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r24
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r25
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r26
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r27
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r2 = r28
        L_0x006a:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0074
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L_0x0076
        L_0x0074:
            r0 = r29
        L_0x0076:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r2
            r30 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.CheckoutSession.<init>(java.util.List, com.paypal.pyplcheckout.pojo.Flags, com.paypal.pyplcheckout.pojo.Cart, com.paypal.pyplcheckout.pojo.BuyerDetails, java.util.List, java.util.List, com.paypal.pyplcheckout.pojo.PaymentContingencies, java.lang.String, com.paypal.pyplcheckout.pojo.CheckoutMerchant, java.util.List, java.util.List, java.util.List, com.paypal.pyplcheckout.pojo.CheckoutSessionType, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
