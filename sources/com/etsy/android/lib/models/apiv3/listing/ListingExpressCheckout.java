package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingExpressCheckout {
    public static final int $stable = 8;
    private final Boolean acceptsGooglePay;
    private final Boolean acceptsMultiplePaymentMethods;
    private final Boolean acceptsPaypal;
    private final String defaultPaymentMethod;
    private final String defaultSubmitText;
    private final Integer ineligibilityErrorCode;
    private final String ineligibilityErrorReason;
    private final Boolean isExpressCheckoutEligible;
    private final Boolean isGuest;
    private final Boolean isInternational;
    private final String isMarketingEmailAutoSubscribeEligible;
    private final KlarnaOnSiteMessaging klarnaMessaging;
    private final List<ListingExpressCheckoutPaymentOption> paymentOptions;
    private final String purchaseAcceptTermsText;
    private final Boolean shouldShowDigitalRightsWaiver;
    private final Boolean showOverlay;
    private final String title;

    public ListingExpressCheckout() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (List) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (KlarnaOnSiteMessaging) null, 131071, (DefaultConstructorMarker) null);
    }

    public ListingExpressCheckout(@C17402n(name = "accepts_multiple_payment_methods") Boolean bool, @C17402n(name = "accepts_paypal") Boolean bool2, @C17402n(name = "accepts_google_pay") Boolean bool3, @C17402n(name = "default_payment_method") String str, @C17402n(name = "default_submit_text") String str2, @C17402n(name = "ineligibility_error_code") Integer num, @C17402n(name = "ineligibility_error_reason") String str3, @C17402n(name = "is_express_checkout_eligible") Boolean bool4, @C17402n(name = "is_guest") Boolean bool5, @C17402n(name = "is_international") Boolean bool6, @C17402n(name = "is_marketing_email_auto_subscribe_eligible") String str4, @C17402n(name = "payment_options") List<ListingExpressCheckoutPaymentOption> list, @C17402n(name = "purchase_accept_terms_text") String str5, @C17402n(name = "should_show_digital_rights_waiver") Boolean bool7, @C17402n(name = "show_overlay") Boolean bool8, @C17402n(name = "title") String str6, @C17402n(name = "klarna_osm_message") KlarnaOnSiteMessaging klarnaOnSiteMessaging) {
        this.acceptsMultiplePaymentMethods = bool;
        this.acceptsPaypal = bool2;
        this.acceptsGooglePay = bool3;
        this.defaultPaymentMethod = str;
        this.defaultSubmitText = str2;
        this.ineligibilityErrorCode = num;
        this.ineligibilityErrorReason = str3;
        this.isExpressCheckoutEligible = bool4;
        this.isGuest = bool5;
        this.isInternational = bool6;
        this.isMarketingEmailAutoSubscribeEligible = str4;
        this.paymentOptions = list;
        this.purchaseAcceptTermsText = str5;
        this.shouldShowDigitalRightsWaiver = bool7;
        this.showOverlay = bool8;
        this.title = str6;
        this.klarnaMessaging = klarnaOnSiteMessaging;
    }

    public static /* synthetic */ ListingExpressCheckout copy$default(ListingExpressCheckout listingExpressCheckout, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, Integer num, String str3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, List list, String str5, Boolean bool7, Boolean bool8, String str6, KlarnaOnSiteMessaging klarnaOnSiteMessaging, int i, Object obj) {
        ListingExpressCheckout listingExpressCheckout2 = listingExpressCheckout;
        int i2 = i;
        return listingExpressCheckout.copy((i2 & 1) != 0 ? listingExpressCheckout2.acceptsMultiplePaymentMethods : bool, (i2 & 2) != 0 ? listingExpressCheckout2.acceptsPaypal : bool2, (i2 & 4) != 0 ? listingExpressCheckout2.acceptsGooglePay : bool3, (i2 & 8) != 0 ? listingExpressCheckout2.defaultPaymentMethod : str, (i2 & 16) != 0 ? listingExpressCheckout2.defaultSubmitText : str2, (i2 & 32) != 0 ? listingExpressCheckout2.ineligibilityErrorCode : num, (i2 & 64) != 0 ? listingExpressCheckout2.ineligibilityErrorReason : str3, (i2 & 128) != 0 ? listingExpressCheckout2.isExpressCheckoutEligible : bool4, (i2 & 256) != 0 ? listingExpressCheckout2.isGuest : bool5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingExpressCheckout2.isInternational : bool6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingExpressCheckout2.isMarketingEmailAutoSubscribeEligible : str4, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingExpressCheckout2.paymentOptions : list, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingExpressCheckout2.purchaseAcceptTermsText : str5, (i2 & 8192) != 0 ? listingExpressCheckout2.shouldShowDigitalRightsWaiver : bool7, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingExpressCheckout2.showOverlay : bool8, (i2 & 32768) != 0 ? listingExpressCheckout2.title : str6, (i2 & 65536) != 0 ? listingExpressCheckout2.klarnaMessaging : klarnaOnSiteMessaging);
    }

    public final Boolean component1() {
        return this.acceptsMultiplePaymentMethods;
    }

    public final Boolean component10() {
        return this.isInternational;
    }

    public final String component11() {
        return this.isMarketingEmailAutoSubscribeEligible;
    }

    public final List<ListingExpressCheckoutPaymentOption> component12() {
        return this.paymentOptions;
    }

    public final String component13() {
        return this.purchaseAcceptTermsText;
    }

    public final Boolean component14() {
        return this.shouldShowDigitalRightsWaiver;
    }

    public final Boolean component15() {
        return this.showOverlay;
    }

    public final String component16() {
        return this.title;
    }

    public final KlarnaOnSiteMessaging component17() {
        return this.klarnaMessaging;
    }

    public final Boolean component2() {
        return this.acceptsPaypal;
    }

    public final Boolean component3() {
        return this.acceptsGooglePay;
    }

    public final String component4() {
        return this.defaultPaymentMethod;
    }

    public final String component5() {
        return this.defaultSubmitText;
    }

    public final Integer component6() {
        return this.ineligibilityErrorCode;
    }

    public final String component7() {
        return this.ineligibilityErrorReason;
    }

    public final Boolean component8() {
        return this.isExpressCheckoutEligible;
    }

    public final Boolean component9() {
        return this.isGuest;
    }

    public final ListingExpressCheckout copy(@C17402n(name = "accepts_multiple_payment_methods") Boolean bool, @C17402n(name = "accepts_paypal") Boolean bool2, @C17402n(name = "accepts_google_pay") Boolean bool3, @C17402n(name = "default_payment_method") String str, @C17402n(name = "default_submit_text") String str2, @C17402n(name = "ineligibility_error_code") Integer num, @C17402n(name = "ineligibility_error_reason") String str3, @C17402n(name = "is_express_checkout_eligible") Boolean bool4, @C17402n(name = "is_guest") Boolean bool5, @C17402n(name = "is_international") Boolean bool6, @C17402n(name = "is_marketing_email_auto_subscribe_eligible") String str4, @C17402n(name = "payment_options") List<ListingExpressCheckoutPaymentOption> list, @C17402n(name = "purchase_accept_terms_text") String str5, @C17402n(name = "should_show_digital_rights_waiver") Boolean bool7, @C17402n(name = "show_overlay") Boolean bool8, @C17402n(name = "title") String str6, @C17402n(name = "klarna_osm_message") KlarnaOnSiteMessaging klarnaOnSiteMessaging) {
        return new ListingExpressCheckout(bool, bool2, bool3, str, str2, num, str3, bool4, bool5, bool6, str4, list, str5, bool7, bool8, str6, klarnaOnSiteMessaging);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingExpressCheckout)) {
            return false;
        }
        ListingExpressCheckout listingExpressCheckout = (ListingExpressCheckout) obj;
        return C19383o.m32792b(this.acceptsMultiplePaymentMethods, listingExpressCheckout.acceptsMultiplePaymentMethods) && C19383o.m32792b(this.acceptsPaypal, listingExpressCheckout.acceptsPaypal) && C19383o.m32792b(this.acceptsGooglePay, listingExpressCheckout.acceptsGooglePay) && C19383o.m32792b(this.defaultPaymentMethod, listingExpressCheckout.defaultPaymentMethod) && C19383o.m32792b(this.defaultSubmitText, listingExpressCheckout.defaultSubmitText) && C19383o.m32792b(this.ineligibilityErrorCode, listingExpressCheckout.ineligibilityErrorCode) && C19383o.m32792b(this.ineligibilityErrorReason, listingExpressCheckout.ineligibilityErrorReason) && C19383o.m32792b(this.isExpressCheckoutEligible, listingExpressCheckout.isExpressCheckoutEligible) && C19383o.m32792b(this.isGuest, listingExpressCheckout.isGuest) && C19383o.m32792b(this.isInternational, listingExpressCheckout.isInternational) && C19383o.m32792b(this.isMarketingEmailAutoSubscribeEligible, listingExpressCheckout.isMarketingEmailAutoSubscribeEligible) && C19383o.m32792b(this.paymentOptions, listingExpressCheckout.paymentOptions) && C19383o.m32792b(this.purchaseAcceptTermsText, listingExpressCheckout.purchaseAcceptTermsText) && C19383o.m32792b(this.shouldShowDigitalRightsWaiver, listingExpressCheckout.shouldShowDigitalRightsWaiver) && C19383o.m32792b(this.showOverlay, listingExpressCheckout.showOverlay) && C19383o.m32792b(this.title, listingExpressCheckout.title) && C19383o.m32792b(this.klarnaMessaging, listingExpressCheckout.klarnaMessaging);
    }

    public final Boolean getAcceptsGooglePay() {
        return this.acceptsGooglePay;
    }

    public final Boolean getAcceptsMultiplePaymentMethods() {
        return this.acceptsMultiplePaymentMethods;
    }

    public final Boolean getAcceptsPaypal() {
        return this.acceptsPaypal;
    }

    public final String getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    public final String getDefaultSubmitText() {
        return this.defaultSubmitText;
    }

    public final Integer getIneligibilityErrorCode() {
        return this.ineligibilityErrorCode;
    }

    public final String getIneligibilityErrorReason() {
        return this.ineligibilityErrorReason;
    }

    public final KlarnaOnSiteMessaging getKlarnaMessaging() {
        return this.klarnaMessaging;
    }

    public final List<ListingExpressCheckoutPaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public final String getPurchaseAcceptTermsText() {
        return this.purchaseAcceptTermsText;
    }

    public final Boolean getShouldShowDigitalRightsWaiver() {
        return this.shouldShowDigitalRightsWaiver;
    }

    public final Boolean getShowOverlay() {
        return this.showOverlay;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.acceptsMultiplePaymentMethods;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.acceptsPaypal;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.acceptsGooglePay;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.defaultPaymentMethod;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultSubmitText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.ineligibilityErrorCode;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.ineligibilityErrorReason;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.isExpressCheckoutEligible;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGuest;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isInternational;
        int hashCode10 = (hashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str4 = this.isMarketingEmailAutoSubscribeEligible;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ListingExpressCheckoutPaymentOption> list = this.paymentOptions;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.purchaseAcceptTermsText;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool7 = this.shouldShowDigitalRightsWaiver;
        int hashCode14 = (hashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.showOverlay;
        int hashCode15 = (hashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str6 = this.title;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        KlarnaOnSiteMessaging klarnaOnSiteMessaging = this.klarnaMessaging;
        if (klarnaOnSiteMessaging != null) {
            i = klarnaOnSiteMessaging.hashCode();
        }
        return hashCode16 + i;
    }

    public final Boolean isExpressCheckoutEligible() {
        return this.isExpressCheckoutEligible;
    }

    public final Boolean isGuest() {
        return this.isGuest;
    }

    public final Boolean isInternational() {
        return this.isInternational;
    }

    public final String isMarketingEmailAutoSubscribeEligible() {
        return this.isMarketingEmailAutoSubscribeEligible;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingExpressCheckout(acceptsMultiplePaymentMethods=");
        h.append(this.acceptsMultiplePaymentMethods);
        h.append(", acceptsPaypal=");
        h.append(this.acceptsPaypal);
        h.append(", acceptsGooglePay=");
        h.append(this.acceptsGooglePay);
        h.append(", defaultPaymentMethod=");
        h.append(this.defaultPaymentMethod);
        h.append(", defaultSubmitText=");
        h.append(this.defaultSubmitText);
        h.append(", ineligibilityErrorCode=");
        h.append(this.ineligibilityErrorCode);
        h.append(", ineligibilityErrorReason=");
        h.append(this.ineligibilityErrorReason);
        h.append(", isExpressCheckoutEligible=");
        h.append(this.isExpressCheckoutEligible);
        h.append(", isGuest=");
        h.append(this.isGuest);
        h.append(", isInternational=");
        h.append(this.isInternational);
        h.append(", isMarketingEmailAutoSubscribeEligible=");
        h.append(this.isMarketingEmailAutoSubscribeEligible);
        h.append(", paymentOptions=");
        h.append(this.paymentOptions);
        h.append(", purchaseAcceptTermsText=");
        h.append(this.purchaseAcceptTermsText);
        h.append(", shouldShowDigitalRightsWaiver=");
        h.append(this.shouldShowDigitalRightsWaiver);
        h.append(", showOverlay=");
        h.append(this.showOverlay);
        h.append(", title=");
        h.append(this.title);
        h.append(", klarnaMessaging=");
        h.append(this.klarnaMessaging);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingExpressCheckout(java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.String r29, java.util.List r30, java.lang.String r31, java.lang.Boolean r32, java.lang.Boolean r33, java.lang.String r34, com.etsy.android.lib.models.apiv3.listing.KlarnaOnSiteMessaging r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.etsy.android.lib.models.apiv3.listing.KlarnaOnSiteMessaging, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
