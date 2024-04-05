package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ThreeDSAuthenticate {
    @C18417a("authenticationThreeDSStatus")
    private final String authenticationThreeDSStatus;
    @C18417a("authenticationType")
    private final String authenticationType;
    @C18417a("cardBrandProcessed")
    private final CardIssuerType cardBrandProcessed;
    @C18417a("cavv")
    private final String cavv;
    @C18417a("eciIndicator")
    private final String eciIndicator;
    @C18417a("enrollmentStatus")
    private final EnrollmentStatusType enrollmentStatus;
    @C18417a("liabilityShift")
    private final Boolean liabilityShift;
    @C18417a("signatureVerificationStatus")
    private final SignatureVerificationStatus signatureVerificationStatus;
    @C18417a("skipThreeDSEnforcement")
    private final Boolean skipThreeDSEnforcement;
    @C18417a("threeDSEcommerceIndicator")
    private final String threeDSEcommerceIndicator;
    @C18417a("threeDSSignatureStatus")
    private final String threeDSSignatureStatus;
    @C18417a("threeDSStatus")
    private final ResolveThreeDsContingencyStatus threeDSStatus;
    @C18417a("threeDSTransactionId")
    private final String threeDSTransactionId;
    @C18417a("threeDSUcafIndicator")
    private final String threeDSUcafIndicator;
    @C18417a("threeDSVersion")
    private final String threeDSVersion;
    @C18417a("threeDsAuthenticationReason")
    private final String threeDsAuthenticationReason;
    @C18417a("ucafIndicator")
    private final String ucafIndicator;

    public ThreeDSAuthenticate(String str, String str2, String str3, String str4, String str5, String str6, SignatureVerificationStatus signatureVerificationStatus2, Boolean bool, CardIssuerType cardIssuerType, String str7, String str8, String str9, Boolean bool2, ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus, EnrollmentStatusType enrollmentStatusType, String str10, String str11) {
        this.eciIndicator = str;
        this.ucafIndicator = str2;
        this.authenticationThreeDSStatus = str3;
        this.threeDSVersion = str4;
        this.threeDSTransactionId = str5;
        this.authenticationType = str6;
        this.signatureVerificationStatus = signatureVerificationStatus2;
        this.skipThreeDSEnforcement = bool;
        this.cardBrandProcessed = cardIssuerType;
        this.threeDSEcommerceIndicator = str7;
        this.threeDSSignatureStatus = str8;
        this.threeDSUcafIndicator = str9;
        this.liabilityShift = bool2;
        this.threeDSStatus = resolveThreeDsContingencyStatus;
        this.enrollmentStatus = enrollmentStatusType;
        this.threeDsAuthenticationReason = str10;
        this.cavv = str11;
    }

    public static /* synthetic */ ThreeDSAuthenticate copy$default(ThreeDSAuthenticate threeDSAuthenticate, String str, String str2, String str3, String str4, String str5, String str6, SignatureVerificationStatus signatureVerificationStatus2, Boolean bool, CardIssuerType cardIssuerType, String str7, String str8, String str9, Boolean bool2, ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus, EnrollmentStatusType enrollmentStatusType, String str10, String str11, int i, Object obj) {
        ThreeDSAuthenticate threeDSAuthenticate2 = threeDSAuthenticate;
        int i2 = i;
        return threeDSAuthenticate.copy((i2 & 1) != 0 ? threeDSAuthenticate2.eciIndicator : str, (i2 & 2) != 0 ? threeDSAuthenticate2.ucafIndicator : str2, (i2 & 4) != 0 ? threeDSAuthenticate2.authenticationThreeDSStatus : str3, (i2 & 8) != 0 ? threeDSAuthenticate2.threeDSVersion : str4, (i2 & 16) != 0 ? threeDSAuthenticate2.threeDSTransactionId : str5, (i2 & 32) != 0 ? threeDSAuthenticate2.authenticationType : str6, (i2 & 64) != 0 ? threeDSAuthenticate2.signatureVerificationStatus : signatureVerificationStatus2, (i2 & 128) != 0 ? threeDSAuthenticate2.skipThreeDSEnforcement : bool, (i2 & 256) != 0 ? threeDSAuthenticate2.cardBrandProcessed : cardIssuerType, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? threeDSAuthenticate2.threeDSEcommerceIndicator : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? threeDSAuthenticate2.threeDSSignatureStatus : str8, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? threeDSAuthenticate2.threeDSUcafIndicator : str9, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? threeDSAuthenticate2.liabilityShift : bool2, (i2 & 8192) != 0 ? threeDSAuthenticate2.threeDSStatus : resolveThreeDsContingencyStatus, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? threeDSAuthenticate2.enrollmentStatus : enrollmentStatusType, (i2 & 32768) != 0 ? threeDSAuthenticate2.threeDsAuthenticationReason : str10, (i2 & 65536) != 0 ? threeDSAuthenticate2.cavv : str11);
    }

    public final String component1() {
        return this.eciIndicator;
    }

    public final String component10() {
        return this.threeDSEcommerceIndicator;
    }

    public final String component11() {
        return this.threeDSSignatureStatus;
    }

    public final String component12() {
        return this.threeDSUcafIndicator;
    }

    public final Boolean component13() {
        return this.liabilityShift;
    }

    public final ResolveThreeDsContingencyStatus component14() {
        return this.threeDSStatus;
    }

    public final EnrollmentStatusType component15() {
        return this.enrollmentStatus;
    }

    public final String component16() {
        return this.threeDsAuthenticationReason;
    }

    public final String component17() {
        return this.cavv;
    }

    public final String component2() {
        return this.ucafIndicator;
    }

    public final String component3() {
        return this.authenticationThreeDSStatus;
    }

    public final String component4() {
        return this.threeDSVersion;
    }

    public final String component5() {
        return this.threeDSTransactionId;
    }

    public final String component6() {
        return this.authenticationType;
    }

    public final SignatureVerificationStatus component7() {
        return this.signatureVerificationStatus;
    }

    public final Boolean component8() {
        return this.skipThreeDSEnforcement;
    }

    public final CardIssuerType component9() {
        return this.cardBrandProcessed;
    }

    public final ThreeDSAuthenticate copy(String str, String str2, String str3, String str4, String str5, String str6, SignatureVerificationStatus signatureVerificationStatus2, Boolean bool, CardIssuerType cardIssuerType, String str7, String str8, String str9, Boolean bool2, ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus, EnrollmentStatusType enrollmentStatusType, String str10, String str11) {
        return new ThreeDSAuthenticate(str, str2, str3, str4, str5, str6, signatureVerificationStatus2, bool, cardIssuerType, str7, str8, str9, bool2, resolveThreeDsContingencyStatus, enrollmentStatusType, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSAuthenticate)) {
            return false;
        }
        ThreeDSAuthenticate threeDSAuthenticate = (ThreeDSAuthenticate) obj;
        return C19383o.m32792b(this.eciIndicator, threeDSAuthenticate.eciIndicator) && C19383o.m32792b(this.ucafIndicator, threeDSAuthenticate.ucafIndicator) && C19383o.m32792b(this.authenticationThreeDSStatus, threeDSAuthenticate.authenticationThreeDSStatus) && C19383o.m32792b(this.threeDSVersion, threeDSAuthenticate.threeDSVersion) && C19383o.m32792b(this.threeDSTransactionId, threeDSAuthenticate.threeDSTransactionId) && C19383o.m32792b(this.authenticationType, threeDSAuthenticate.authenticationType) && this.signatureVerificationStatus == threeDSAuthenticate.signatureVerificationStatus && C19383o.m32792b(this.skipThreeDSEnforcement, threeDSAuthenticate.skipThreeDSEnforcement) && this.cardBrandProcessed == threeDSAuthenticate.cardBrandProcessed && C19383o.m32792b(this.threeDSEcommerceIndicator, threeDSAuthenticate.threeDSEcommerceIndicator) && C19383o.m32792b(this.threeDSSignatureStatus, threeDSAuthenticate.threeDSSignatureStatus) && C19383o.m32792b(this.threeDSUcafIndicator, threeDSAuthenticate.threeDSUcafIndicator) && C19383o.m32792b(this.liabilityShift, threeDSAuthenticate.liabilityShift) && this.threeDSStatus == threeDSAuthenticate.threeDSStatus && this.enrollmentStatus == threeDSAuthenticate.enrollmentStatus && C19383o.m32792b(this.threeDsAuthenticationReason, threeDSAuthenticate.threeDsAuthenticationReason) && C19383o.m32792b(this.cavv, threeDSAuthenticate.cavv);
    }

    public final String getAuthenticationThreeDSStatus() {
        return this.authenticationThreeDSStatus;
    }

    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    public final CardIssuerType getCardBrandProcessed() {
        return this.cardBrandProcessed;
    }

    public final String getCavv() {
        return this.cavv;
    }

    public final String getEciIndicator() {
        return this.eciIndicator;
    }

    public final EnrollmentStatusType getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final Boolean getLiabilityShift() {
        return this.liabilityShift;
    }

    public final SignatureVerificationStatus getSignatureVerificationStatus() {
        return this.signatureVerificationStatus;
    }

    public final Boolean getSkipThreeDSEnforcement() {
        return this.skipThreeDSEnforcement;
    }

    public final String getThreeDSEcommerceIndicator() {
        return this.threeDSEcommerceIndicator;
    }

    public final String getThreeDSSignatureStatus() {
        return this.threeDSSignatureStatus;
    }

    public final ResolveThreeDsContingencyStatus getThreeDSStatus() {
        return this.threeDSStatus;
    }

    public final String getThreeDSTransactionId() {
        return this.threeDSTransactionId;
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

    public final String getUcafIndicator() {
        return this.ucafIndicator;
    }

    public int hashCode() {
        String str = this.eciIndicator;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ucafIndicator;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authenticationThreeDSStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threeDSVersion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSTransactionId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.authenticationType;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SignatureVerificationStatus signatureVerificationStatus2 = this.signatureVerificationStatus;
        int hashCode7 = (hashCode6 + (signatureVerificationStatus2 == null ? 0 : signatureVerificationStatus2.hashCode())) * 31;
        Boolean bool = this.skipThreeDSEnforcement;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        CardIssuerType cardIssuerType = this.cardBrandProcessed;
        int hashCode9 = (hashCode8 + (cardIssuerType == null ? 0 : cardIssuerType.hashCode())) * 31;
        String str7 = this.threeDSEcommerceIndicator;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.threeDSSignatureStatus;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.threeDSUcafIndicator;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool2 = this.liabilityShift;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus = this.threeDSStatus;
        int hashCode14 = (hashCode13 + (resolveThreeDsContingencyStatus == null ? 0 : resolveThreeDsContingencyStatus.hashCode())) * 31;
        EnrollmentStatusType enrollmentStatusType = this.enrollmentStatus;
        int hashCode15 = (hashCode14 + (enrollmentStatusType == null ? 0 : enrollmentStatusType.hashCode())) * 31;
        String str10 = this.threeDsAuthenticationReason;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cavv;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        String str = this.eciIndicator;
        String str2 = this.ucafIndicator;
        String str3 = this.authenticationThreeDSStatus;
        String str4 = this.threeDSVersion;
        String str5 = this.threeDSTransactionId;
        String str6 = this.authenticationType;
        SignatureVerificationStatus signatureVerificationStatus2 = this.signatureVerificationStatus;
        Boolean bool = this.skipThreeDSEnforcement;
        CardIssuerType cardIssuerType = this.cardBrandProcessed;
        String str7 = this.threeDSEcommerceIndicator;
        String str8 = this.threeDSSignatureStatus;
        String str9 = this.threeDSUcafIndicator;
        Boolean bool2 = this.liabilityShift;
        ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus = this.threeDSStatus;
        EnrollmentStatusType enrollmentStatusType = this.enrollmentStatus;
        String str10 = this.threeDsAuthenticationReason;
        StringBuilder f = C0388a.m1050f("ThreeDSAuthenticate(eciIndicator=", str, ", ucafIndicator=", str2, ", authenticationThreeDSStatus=");
        C0391c.m1061h(f, str3, ", threeDSVersion=", str4, ", threeDSTransactionId=");
        C0391c.m1061h(f, str5, ", authenticationType=", str6, ", signatureVerificationStatus=");
        f.append(signatureVerificationStatus2);
        f.append(", skipThreeDSEnforcement=");
        f.append(bool);
        f.append(", cardBrandProcessed=");
        f.append(cardIssuerType);
        f.append(", threeDSEcommerceIndicator=");
        f.append(str7);
        f.append(", threeDSSignatureStatus=");
        C0391c.m1061h(f, str8, ", threeDSUcafIndicator=", str9, ", liabilityShift=");
        f.append(bool2);
        f.append(", threeDSStatus=");
        f.append(resolveThreeDsContingencyStatus);
        f.append(", enrollmentStatus=");
        f.append(enrollmentStatusType);
        f.append(", threeDsAuthenticationReason=");
        f.append(str10);
        f.append(", cavv=");
        return C0023f.m110k(f, this.cavv, ")");
    }
}
