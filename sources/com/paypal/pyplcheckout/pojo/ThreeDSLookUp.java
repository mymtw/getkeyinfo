package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ThreeDSLookUp {
    @C18417a("acsURL")
    private final GenericURL acsURL;
    @C18417a("authenticationThreeDSStatus")
    private final String authenticationThreeDSStatus;
    @C18417a("cardBrandProcessed")
    private final CardIssuerType cardBrandProcessed;
    @C18417a("cavv")
    private final String cavv;
    @C18417a("enrollmentStatus")
    private final EnrollmentStatusType enrollmentStatus;
    @C18417a("liabilityShift")
    private final Boolean liabilityShift;
    @C18417a("paymentAuthenticationRequest")
    private final String paymentAuthenticationRequest;
    @C18417a("redirectURL")
    private final GenericURL redirectURL;
    @C18417a("signatureVerificationStatus")
    private final SignatureVerificationStatus signatureVerificationStatus;
    @C18417a("threeDSEcommerceIndicator")
    private final String threeDSEcommerceIndicator;
    @C18417a("threeDSStatus")
    private final String threeDSStatus;
    @C18417a("threeDSUcafIndicator")
    private final String threeDSUcafIndicator;
    @C18417a("threeDSVersion")
    private final String threeDSVersion;
    @C18417a("threeDsAuthenticationReason")
    private final String threeDsAuthenticationReason;
    @C18417a("threeDsProcessorTraceNumber")
    private final String threeDsProcessorTraceNumber;
    @C18417a("threeDsServerTransactionId")
    private final String threeDsServerTransactionId;
    @C18417a("transactionId")
    private final String transactionId;
    @C18417a("transactionStatusCode")
    private final String transactionStatusCode;
    @C18417a("transactionStatusMessage")
    private final String transactionStatusMessage;

    public ThreeDSLookUp(String str, String str2, EnrollmentStatusType enrollmentStatusType, Boolean bool, String str3, CardIssuerType cardIssuerType, SignatureVerificationStatus signatureVerificationStatus2, String str4, String str5, GenericURL genericURL, GenericURL genericURL2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.transactionId = str;
        this.threeDSVersion = str2;
        this.enrollmentStatus = enrollmentStatusType;
        this.liabilityShift = bool;
        this.threeDSEcommerceIndicator = str3;
        this.cardBrandProcessed = cardIssuerType;
        this.signatureVerificationStatus = signatureVerificationStatus2;
        this.threeDSStatus = str4;
        this.paymentAuthenticationRequest = str5;
        this.acsURL = genericURL;
        this.redirectURL = genericURL2;
        this.transactionStatusCode = str6;
        this.transactionStatusMessage = str7;
        this.threeDsServerTransactionId = str8;
        this.threeDsAuthenticationReason = str9;
        this.threeDSUcafIndicator = str10;
        this.authenticationThreeDSStatus = str11;
        this.threeDsProcessorTraceNumber = str12;
        this.cavv = str13;
    }

    public static /* synthetic */ ThreeDSLookUp copy$default(ThreeDSLookUp threeDSLookUp, String str, String str2, EnrollmentStatusType enrollmentStatusType, Boolean bool, String str3, CardIssuerType cardIssuerType, SignatureVerificationStatus signatureVerificationStatus2, String str4, String str5, GenericURL genericURL, GenericURL genericURL2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        ThreeDSLookUp threeDSLookUp2 = threeDSLookUp;
        int i2 = i;
        return threeDSLookUp.copy((i2 & 1) != 0 ? threeDSLookUp2.transactionId : str, (i2 & 2) != 0 ? threeDSLookUp2.threeDSVersion : str2, (i2 & 4) != 0 ? threeDSLookUp2.enrollmentStatus : enrollmentStatusType, (i2 & 8) != 0 ? threeDSLookUp2.liabilityShift : bool, (i2 & 16) != 0 ? threeDSLookUp2.threeDSEcommerceIndicator : str3, (i2 & 32) != 0 ? threeDSLookUp2.cardBrandProcessed : cardIssuerType, (i2 & 64) != 0 ? threeDSLookUp2.signatureVerificationStatus : signatureVerificationStatus2, (i2 & 128) != 0 ? threeDSLookUp2.threeDSStatus : str4, (i2 & 256) != 0 ? threeDSLookUp2.paymentAuthenticationRequest : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? threeDSLookUp2.acsURL : genericURL, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? threeDSLookUp2.redirectURL : genericURL2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? threeDSLookUp2.transactionStatusCode : str6, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? threeDSLookUp2.transactionStatusMessage : str7, (i2 & 8192) != 0 ? threeDSLookUp2.threeDsServerTransactionId : str8, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? threeDSLookUp2.threeDsAuthenticationReason : str9, (i2 & 32768) != 0 ? threeDSLookUp2.threeDSUcafIndicator : str10, (i2 & 65536) != 0 ? threeDSLookUp2.authenticationThreeDSStatus : str11, (i2 & 131072) != 0 ? threeDSLookUp2.threeDsProcessorTraceNumber : str12, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? threeDSLookUp2.cavv : str13);
    }

    public final String component1() {
        return this.transactionId;
    }

    public final GenericURL component10() {
        return this.acsURL;
    }

    public final GenericURL component11() {
        return this.redirectURL;
    }

    public final String component12() {
        return this.transactionStatusCode;
    }

    public final String component13() {
        return this.transactionStatusMessage;
    }

    public final String component14() {
        return this.threeDsServerTransactionId;
    }

    public final String component15() {
        return this.threeDsAuthenticationReason;
    }

    public final String component16() {
        return this.threeDSUcafIndicator;
    }

    public final String component17() {
        return this.authenticationThreeDSStatus;
    }

    public final String component18() {
        return this.threeDsProcessorTraceNumber;
    }

    public final String component19() {
        return this.cavv;
    }

    public final String component2() {
        return this.threeDSVersion;
    }

    public final EnrollmentStatusType component3() {
        return this.enrollmentStatus;
    }

    public final Boolean component4() {
        return this.liabilityShift;
    }

    public final String component5() {
        return this.threeDSEcommerceIndicator;
    }

    public final CardIssuerType component6() {
        return this.cardBrandProcessed;
    }

    public final SignatureVerificationStatus component7() {
        return this.signatureVerificationStatus;
    }

    public final String component8() {
        return this.threeDSStatus;
    }

    public final String component9() {
        return this.paymentAuthenticationRequest;
    }

    public final ThreeDSLookUp copy(String str, String str2, EnrollmentStatusType enrollmentStatusType, Boolean bool, String str3, CardIssuerType cardIssuerType, SignatureVerificationStatus signatureVerificationStatus2, String str4, String str5, GenericURL genericURL, GenericURL genericURL2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new ThreeDSLookUp(str, str2, enrollmentStatusType, bool, str3, cardIssuerType, signatureVerificationStatus2, str4, str5, genericURL, genericURL2, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSLookUp)) {
            return false;
        }
        ThreeDSLookUp threeDSLookUp = (ThreeDSLookUp) obj;
        return C19383o.m32792b(this.transactionId, threeDSLookUp.transactionId) && C19383o.m32792b(this.threeDSVersion, threeDSLookUp.threeDSVersion) && this.enrollmentStatus == threeDSLookUp.enrollmentStatus && C19383o.m32792b(this.liabilityShift, threeDSLookUp.liabilityShift) && C19383o.m32792b(this.threeDSEcommerceIndicator, threeDSLookUp.threeDSEcommerceIndicator) && this.cardBrandProcessed == threeDSLookUp.cardBrandProcessed && this.signatureVerificationStatus == threeDSLookUp.signatureVerificationStatus && C19383o.m32792b(this.threeDSStatus, threeDSLookUp.threeDSStatus) && C19383o.m32792b(this.paymentAuthenticationRequest, threeDSLookUp.paymentAuthenticationRequest) && C19383o.m32792b(this.acsURL, threeDSLookUp.acsURL) && C19383o.m32792b(this.redirectURL, threeDSLookUp.redirectURL) && C19383o.m32792b(this.transactionStatusCode, threeDSLookUp.transactionStatusCode) && C19383o.m32792b(this.transactionStatusMessage, threeDSLookUp.transactionStatusMessage) && C19383o.m32792b(this.threeDsServerTransactionId, threeDSLookUp.threeDsServerTransactionId) && C19383o.m32792b(this.threeDsAuthenticationReason, threeDSLookUp.threeDsAuthenticationReason) && C19383o.m32792b(this.threeDSUcafIndicator, threeDSLookUp.threeDSUcafIndicator) && C19383o.m32792b(this.authenticationThreeDSStatus, threeDSLookUp.authenticationThreeDSStatus) && C19383o.m32792b(this.threeDsProcessorTraceNumber, threeDSLookUp.threeDsProcessorTraceNumber) && C19383o.m32792b(this.cavv, threeDSLookUp.cavv);
    }

    public final GenericURL getAcsURL() {
        return this.acsURL;
    }

    public final String getAuthenticationThreeDSStatus() {
        return this.authenticationThreeDSStatus;
    }

    public final CardIssuerType getCardBrandProcessed() {
        return this.cardBrandProcessed;
    }

    public final String getCavv() {
        return this.cavv;
    }

    public final EnrollmentStatusType getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final Boolean getLiabilityShift() {
        return this.liabilityShift;
    }

    public final String getPaymentAuthenticationRequest() {
        return this.paymentAuthenticationRequest;
    }

    public final GenericURL getRedirectURL() {
        return this.redirectURL;
    }

    public final SignatureVerificationStatus getSignatureVerificationStatus() {
        return this.signatureVerificationStatus;
    }

    public final String getThreeDSEcommerceIndicator() {
        return this.threeDSEcommerceIndicator;
    }

    public final String getThreeDSStatus() {
        return this.threeDSStatus;
    }

    public final String getThreeDSUcafIndicator() {
        return this.threeDSUcafIndicator;
    }

    public final String getThreeDSVersion() {
        return this.threeDSVersion;
    }

    public final String getThreeDsAuthenticationReason() {
        return this.threeDsAuthenticationReason;
    }

    public final String getThreeDsProcessorTraceNumber() {
        return this.threeDsProcessorTraceNumber;
    }

    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTransactionStatusCode() {
        return this.transactionStatusCode;
    }

    public final String getTransactionStatusMessage() {
        return this.transactionStatusMessage;
    }

    public int hashCode() {
        String str = this.transactionId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.threeDSVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnrollmentStatusType enrollmentStatusType = this.enrollmentStatus;
        int hashCode3 = (hashCode2 + (enrollmentStatusType == null ? 0 : enrollmentStatusType.hashCode())) * 31;
        Boolean bool = this.liabilityShift;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.threeDSEcommerceIndicator;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CardIssuerType cardIssuerType = this.cardBrandProcessed;
        int hashCode6 = (hashCode5 + (cardIssuerType == null ? 0 : cardIssuerType.hashCode())) * 31;
        SignatureVerificationStatus signatureVerificationStatus2 = this.signatureVerificationStatus;
        int hashCode7 = (hashCode6 + (signatureVerificationStatus2 == null ? 0 : signatureVerificationStatus2.hashCode())) * 31;
        String str4 = this.threeDSStatus;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentAuthenticationRequest;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GenericURL genericURL = this.acsURL;
        int hashCode10 = (hashCode9 + (genericURL == null ? 0 : genericURL.hashCode())) * 31;
        GenericURL genericURL2 = this.redirectURL;
        int hashCode11 = (hashCode10 + (genericURL2 == null ? 0 : genericURL2.hashCode())) * 31;
        String str6 = this.transactionStatusCode;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.transactionStatusMessage;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.threeDsServerTransactionId;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.threeDsAuthenticationReason;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.threeDSUcafIndicator;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.authenticationThreeDSStatus;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.threeDsProcessorTraceNumber;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cavv;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        String str = this.transactionId;
        String str2 = this.threeDSVersion;
        EnrollmentStatusType enrollmentStatusType = this.enrollmentStatus;
        Boolean bool = this.liabilityShift;
        String str3 = this.threeDSEcommerceIndicator;
        CardIssuerType cardIssuerType = this.cardBrandProcessed;
        SignatureVerificationStatus signatureVerificationStatus2 = this.signatureVerificationStatus;
        String str4 = this.threeDSStatus;
        String str5 = this.paymentAuthenticationRequest;
        GenericURL genericURL = this.acsURL;
        GenericURL genericURL2 = this.redirectURL;
        String str6 = this.transactionStatusCode;
        String str7 = this.transactionStatusMessage;
        String str8 = this.threeDsServerTransactionId;
        String str9 = this.threeDsAuthenticationReason;
        String str10 = this.threeDSUcafIndicator;
        String str11 = this.authenticationThreeDSStatus;
        String str12 = this.threeDsProcessorTraceNumber;
        StringBuilder f = C0388a.m1050f("ThreeDSLookUp(transactionId=", str, ", threeDSVersion=", str2, ", enrollmentStatus=");
        f.append(enrollmentStatusType);
        f.append(", liabilityShift=");
        f.append(bool);
        f.append(", threeDSEcommerceIndicator=");
        f.append(str3);
        f.append(", cardBrandProcessed=");
        f.append(cardIssuerType);
        f.append(", signatureVerificationStatus=");
        f.append(signatureVerificationStatus2);
        f.append(", threeDSStatus=");
        f.append(str4);
        f.append(", paymentAuthenticationRequest=");
        f.append(str5);
        f.append(", acsURL=");
        f.append(genericURL);
        f.append(", redirectURL=");
        f.append(genericURL2);
        f.append(", transactionStatusCode=");
        f.append(str6);
        f.append(", transactionStatusMessage=");
        C0391c.m1061h(f, str7, ", threeDsServerTransactionId=", str8, ", threeDsAuthenticationReason=");
        C0391c.m1061h(f, str9, ", threeDSUcafIndicator=", str10, ", authenticationThreeDSStatus=");
        C0391c.m1061h(f, str11, ", threeDsProcessorTraceNumber=", str12, ", cavv=");
        return C0023f.m110k(f, this.cavv, ")");
    }
}
