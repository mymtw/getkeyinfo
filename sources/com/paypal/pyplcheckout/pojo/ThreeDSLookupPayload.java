package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ThreeDSLookupPayload {
    @C18417a("billingAddress")
    private final BillingAddressLookupRequest billingAddress;
    @C18417a("cardTransactionCharacteristics")
    private final CardTransactionType cardTransactionCharacteristics;
    @C18417a("cardUsage")
    private final FundingInstrumentSubtype cardUsage;
    @C18417a("creditCardId")
    private final String creditCardId;
    @C18417a("encryptedCardNumber")
    private final String encryptedCardNumber;
    @C18417a("expirationMonth")
    private final String expirationMonth;
    @C18417a("expirationYear")
    private final String expirationYear;
    @C18417a("flowId")
    private final String flowId;
    @C18417a("merchantCategoryCode")
    private final String merchantCategoryCode;
    @C18417a("threeDSContingencyReason")
    private final ThreeDSContingencyReasonType threeDSContingencyReason;
    @C18417a("threeDSContingencySourceType")
    private final ThreeDSContingencySourceType threeDSContingencySourceType;
    @C18417a("threeDSReferenceId")
    private final String threeDSReferenceId;
    @C18417a("unbrandedPaymentIndicator")
    private final Boolean unbrandedPaymentIndicator;

    public ThreeDSLookupPayload(String str, String str2, String str3, String str4, String str5, String str6, FundingInstrumentSubtype fundingInstrumentSubtype, CardTransactionType cardTransactionType, BillingAddressLookupRequest billingAddressLookupRequest, String str7, ThreeDSContingencyReasonType threeDSContingencyReasonType, ThreeDSContingencySourceType threeDSContingencySourceType2, Boolean bool) {
        C19383o.m32797g(str, "threeDSReferenceId");
        C19383o.m32797g(str2, UriChallengeConstantKt.FLOW_ID);
        C19383o.m32797g(str3, "encryptedCardNumber");
        C19383o.m32797g(str5, "expirationMonth");
        C19383o.m32797g(str6, "expirationYear");
        this.threeDSReferenceId = str;
        this.flowId = str2;
        this.encryptedCardNumber = str3;
        this.creditCardId = str4;
        this.expirationMonth = str5;
        this.expirationYear = str6;
        this.cardUsage = fundingInstrumentSubtype;
        this.cardTransactionCharacteristics = cardTransactionType;
        this.billingAddress = billingAddressLookupRequest;
        this.merchantCategoryCode = str7;
        this.threeDSContingencyReason = threeDSContingencyReasonType;
        this.threeDSContingencySourceType = threeDSContingencySourceType2;
        this.unbrandedPaymentIndicator = bool;
    }

    public static /* synthetic */ ThreeDSLookupPayload copy$default(ThreeDSLookupPayload threeDSLookupPayload, String str, String str2, String str3, String str4, String str5, String str6, FundingInstrumentSubtype fundingInstrumentSubtype, CardTransactionType cardTransactionType, BillingAddressLookupRequest billingAddressLookupRequest, String str7, ThreeDSContingencyReasonType threeDSContingencyReasonType, ThreeDSContingencySourceType threeDSContingencySourceType2, Boolean bool, int i, Object obj) {
        ThreeDSLookupPayload threeDSLookupPayload2 = threeDSLookupPayload;
        int i2 = i;
        return threeDSLookupPayload.copy((i2 & 1) != 0 ? threeDSLookupPayload2.threeDSReferenceId : str, (i2 & 2) != 0 ? threeDSLookupPayload2.flowId : str2, (i2 & 4) != 0 ? threeDSLookupPayload2.encryptedCardNumber : str3, (i2 & 8) != 0 ? threeDSLookupPayload2.creditCardId : str4, (i2 & 16) != 0 ? threeDSLookupPayload2.expirationMonth : str5, (i2 & 32) != 0 ? threeDSLookupPayload2.expirationYear : str6, (i2 & 64) != 0 ? threeDSLookupPayload2.cardUsage : fundingInstrumentSubtype, (i2 & 128) != 0 ? threeDSLookupPayload2.cardTransactionCharacteristics : cardTransactionType, (i2 & 256) != 0 ? threeDSLookupPayload2.billingAddress : billingAddressLookupRequest, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? threeDSLookupPayload2.merchantCategoryCode : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? threeDSLookupPayload2.threeDSContingencyReason : threeDSContingencyReasonType, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? threeDSLookupPayload2.threeDSContingencySourceType : threeDSContingencySourceType2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? threeDSLookupPayload2.unbrandedPaymentIndicator : bool);
    }

    public final String component1() {
        return this.threeDSReferenceId;
    }

    public final String component10() {
        return this.merchantCategoryCode;
    }

    public final ThreeDSContingencyReasonType component11() {
        return this.threeDSContingencyReason;
    }

    public final ThreeDSContingencySourceType component12() {
        return this.threeDSContingencySourceType;
    }

    public final Boolean component13() {
        return this.unbrandedPaymentIndicator;
    }

    public final String component2() {
        return this.flowId;
    }

    public final String component3() {
        return this.encryptedCardNumber;
    }

    public final String component4() {
        return this.creditCardId;
    }

    public final String component5() {
        return this.expirationMonth;
    }

    public final String component6() {
        return this.expirationYear;
    }

    public final FundingInstrumentSubtype component7() {
        return this.cardUsage;
    }

    public final CardTransactionType component8() {
        return this.cardTransactionCharacteristics;
    }

    public final BillingAddressLookupRequest component9() {
        return this.billingAddress;
    }

    public final ThreeDSLookupPayload copy(String str, String str2, String str3, String str4, String str5, String str6, FundingInstrumentSubtype fundingInstrumentSubtype, CardTransactionType cardTransactionType, BillingAddressLookupRequest billingAddressLookupRequest, String str7, ThreeDSContingencyReasonType threeDSContingencyReasonType, ThreeDSContingencySourceType threeDSContingencySourceType2, Boolean bool) {
        String str8 = str;
        C19383o.m32797g(str8, "threeDSReferenceId");
        String str9 = str2;
        C19383o.m32797g(str9, UriChallengeConstantKt.FLOW_ID);
        String str10 = str3;
        C19383o.m32797g(str10, "encryptedCardNumber");
        String str11 = str5;
        C19383o.m32797g(str11, "expirationMonth");
        String str12 = str6;
        C19383o.m32797g(str12, "expirationYear");
        return new ThreeDSLookupPayload(str8, str9, str10, str4, str11, str12, fundingInstrumentSubtype, cardTransactionType, billingAddressLookupRequest, str7, threeDSContingencyReasonType, threeDSContingencySourceType2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSLookupPayload)) {
            return false;
        }
        ThreeDSLookupPayload threeDSLookupPayload = (ThreeDSLookupPayload) obj;
        return C19383o.m32792b(this.threeDSReferenceId, threeDSLookupPayload.threeDSReferenceId) && C19383o.m32792b(this.flowId, threeDSLookupPayload.flowId) && C19383o.m32792b(this.encryptedCardNumber, threeDSLookupPayload.encryptedCardNumber) && C19383o.m32792b(this.creditCardId, threeDSLookupPayload.creditCardId) && C19383o.m32792b(this.expirationMonth, threeDSLookupPayload.expirationMonth) && C19383o.m32792b(this.expirationYear, threeDSLookupPayload.expirationYear) && this.cardUsage == threeDSLookupPayload.cardUsage && this.cardTransactionCharacteristics == threeDSLookupPayload.cardTransactionCharacteristics && C19383o.m32792b(this.billingAddress, threeDSLookupPayload.billingAddress) && C19383o.m32792b(this.merchantCategoryCode, threeDSLookupPayload.merchantCategoryCode) && this.threeDSContingencyReason == threeDSLookupPayload.threeDSContingencyReason && this.threeDSContingencySourceType == threeDSLookupPayload.threeDSContingencySourceType && C19383o.m32792b(this.unbrandedPaymentIndicator, threeDSLookupPayload.unbrandedPaymentIndicator);
    }

    public final BillingAddressLookupRequest getBillingAddress() {
        return this.billingAddress;
    }

    public final CardTransactionType getCardTransactionCharacteristics() {
        return this.cardTransactionCharacteristics;
    }

    public final FundingInstrumentSubtype getCardUsage() {
        return this.cardUsage;
    }

    public final String getCreditCardId() {
        return this.creditCardId;
    }

    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public final ThreeDSContingencyReasonType getThreeDSContingencyReason() {
        return this.threeDSContingencyReason;
    }

    public final ThreeDSContingencySourceType getThreeDSContingencySourceType() {
        return this.threeDSContingencySourceType;
    }

    public final String getThreeDSReferenceId() {
        return this.threeDSReferenceId;
    }

    public final Boolean getUnbrandedPaymentIndicator() {
        return this.unbrandedPaymentIndicator;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.encryptedCardNumber, C0023f.m105e(this.flowId, this.threeDSReferenceId.hashCode() * 31, 31), 31);
        String str = this.creditCardId;
        int i = 0;
        int e2 = C0023f.m105e(this.expirationYear, C0023f.m105e(this.expirationMonth, (e + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        FundingInstrumentSubtype fundingInstrumentSubtype = this.cardUsage;
        int hashCode = (e2 + (fundingInstrumentSubtype == null ? 0 : fundingInstrumentSubtype.hashCode())) * 31;
        CardTransactionType cardTransactionType = this.cardTransactionCharacteristics;
        int hashCode2 = (hashCode + (cardTransactionType == null ? 0 : cardTransactionType.hashCode())) * 31;
        BillingAddressLookupRequest billingAddressLookupRequest = this.billingAddress;
        int hashCode3 = (hashCode2 + (billingAddressLookupRequest == null ? 0 : billingAddressLookupRequest.hashCode())) * 31;
        String str2 = this.merchantCategoryCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreeDSContingencyReasonType threeDSContingencyReasonType = this.threeDSContingencyReason;
        int hashCode5 = (hashCode4 + (threeDSContingencyReasonType == null ? 0 : threeDSContingencyReasonType.hashCode())) * 31;
        ThreeDSContingencySourceType threeDSContingencySourceType2 = this.threeDSContingencySourceType;
        int hashCode6 = (hashCode5 + (threeDSContingencySourceType2 == null ? 0 : threeDSContingencySourceType2.hashCode())) * 31;
        Boolean bool = this.unbrandedPaymentIndicator;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.threeDSReferenceId;
        String str2 = this.flowId;
        String str3 = this.encryptedCardNumber;
        String str4 = this.creditCardId;
        String str5 = this.expirationMonth;
        String str6 = this.expirationYear;
        FundingInstrumentSubtype fundingInstrumentSubtype = this.cardUsage;
        CardTransactionType cardTransactionType = this.cardTransactionCharacteristics;
        BillingAddressLookupRequest billingAddressLookupRequest = this.billingAddress;
        String str7 = this.merchantCategoryCode;
        ThreeDSContingencyReasonType threeDSContingencyReasonType = this.threeDSContingencyReason;
        ThreeDSContingencySourceType threeDSContingencySourceType2 = this.threeDSContingencySourceType;
        Boolean bool = this.unbrandedPaymentIndicator;
        StringBuilder f = C0388a.m1050f("ThreeDSLookupPayload(threeDSReferenceId=", str, ", flowId=", str2, ", encryptedCardNumber=");
        C0391c.m1061h(f, str3, ", creditCardId=", str4, ", expirationMonth=");
        C0391c.m1061h(f, str5, ", expirationYear=", str6, ", cardUsage=");
        f.append(fundingInstrumentSubtype);
        f.append(", cardTransactionCharacteristics=");
        f.append(cardTransactionType);
        f.append(", billingAddress=");
        f.append(billingAddressLookupRequest);
        f.append(", merchantCategoryCode=");
        f.append(str7);
        f.append(", threeDSContingencyReason=");
        f.append(threeDSContingencyReasonType);
        f.append(", threeDSContingencySourceType=");
        f.append(threeDSContingencySourceType2);
        f.append(", unbrandedPaymentIndicator=");
        f.append(bool);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ThreeDSLookupPayload(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.paypal.pyplcheckout.pojo.FundingInstrumentSubtype r24, com.paypal.pyplcheckout.pojo.CardTransactionType r25, com.paypal.pyplcheckout.pojo.BillingAddressLookupRequest r26, java.lang.String r27, com.paypal.pyplcheckout.pojo.ThreeDSContingencyReasonType r28, com.paypal.pyplcheckout.pojo.ThreeDSContingencySourceType r29, java.lang.Boolean r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r21
        L_0x000c:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L_0x0013
            r10 = r3
            goto L_0x0015
        L_0x0013:
            r10 = r24
        L_0x0015:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001b
            r11 = r3
            goto L_0x001d
        L_0x001b:
            r11 = r25
        L_0x001d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0023
            r12 = r3
            goto L_0x0025
        L_0x0023:
            r12 = r26
        L_0x0025:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r27
        L_0x002d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0033
            r14 = r3
            goto L_0x0035
        L_0x0033:
            r14 = r28
        L_0x0035:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x003b
            r15 = r3
            goto L_0x003d
        L_0x003b:
            r15 = r29
        L_0x003d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r16 = r0
            goto L_0x0048
        L_0x0046:
            r16 = r30
        L_0x0048:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r8 = r22
            r9 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.FundingInstrumentSubtype, com.paypal.pyplcheckout.pojo.CardTransactionType, com.paypal.pyplcheckout.pojo.BillingAddressLookupRequest, java.lang.String, com.paypal.pyplcheckout.pojo.ThreeDSContingencyReasonType, com.paypal.pyplcheckout.pojo.ThreeDSContingencySourceType, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
