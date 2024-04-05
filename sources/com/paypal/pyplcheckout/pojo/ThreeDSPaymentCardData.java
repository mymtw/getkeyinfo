package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSPaymentCardData {
    @C18417a("bankIdentificationNumber")
    private final String bankIdentificationNumber;
    @C18417a("billingAddress")
    private final BillingAddress billingAddress;
    @C18417a("cardProductClass")
    private final String cardProductClass;
    @C18417a("currencyCode")
    private final String currencyCode;
    @C18417a("encryptedNumber")
    private final String encryptedNumber;
    @C18417a("expireMonth")
    private final String expireMonth;
    @C18417a("expireYear")
    private final String expireYear;
    @C18417a("id")

    /* renamed from: id */
    private final String f37797id;
    @C18417a("number")
    private final String number;
    @C18417a("partialFpan")
    private final Boolean partialFpan;
    @C18417a("type")
    private final String type;

    public ThreeDSPaymentCardData(String str, String str2, String str3, String str4, String str5, BillingAddress billingAddress2, String str6, String str7, String str8, String str9, Boolean bool) {
        this.f37797id = str;
        this.type = str2;
        this.number = str3;
        this.encryptedNumber = str4;
        this.bankIdentificationNumber = str5;
        this.billingAddress = billingAddress2;
        this.expireYear = str6;
        this.expireMonth = str7;
        this.currencyCode = str8;
        this.cardProductClass = str9;
        this.partialFpan = bool;
    }

    public static /* synthetic */ ThreeDSPaymentCardData copy$default(ThreeDSPaymentCardData threeDSPaymentCardData, String str, String str2, String str3, String str4, String str5, BillingAddress billingAddress2, String str6, String str7, String str8, String str9, Boolean bool, int i, Object obj) {
        ThreeDSPaymentCardData threeDSPaymentCardData2 = threeDSPaymentCardData;
        int i2 = i;
        return threeDSPaymentCardData.copy((i2 & 1) != 0 ? threeDSPaymentCardData2.f37797id : str, (i2 & 2) != 0 ? threeDSPaymentCardData2.type : str2, (i2 & 4) != 0 ? threeDSPaymentCardData2.number : str3, (i2 & 8) != 0 ? threeDSPaymentCardData2.encryptedNumber : str4, (i2 & 16) != 0 ? threeDSPaymentCardData2.bankIdentificationNumber : str5, (i2 & 32) != 0 ? threeDSPaymentCardData2.billingAddress : billingAddress2, (i2 & 64) != 0 ? threeDSPaymentCardData2.expireYear : str6, (i2 & 128) != 0 ? threeDSPaymentCardData2.expireMonth : str7, (i2 & 256) != 0 ? threeDSPaymentCardData2.currencyCode : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? threeDSPaymentCardData2.cardProductClass : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? threeDSPaymentCardData2.partialFpan : bool);
    }

    public final String component1() {
        return this.f37797id;
    }

    public final String component10() {
        return this.cardProductClass;
    }

    public final Boolean component11() {
        return this.partialFpan;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.number;
    }

    public final String component4() {
        return this.encryptedNumber;
    }

    public final String component5() {
        return this.bankIdentificationNumber;
    }

    public final BillingAddress component6() {
        return this.billingAddress;
    }

    public final String component7() {
        return this.expireYear;
    }

    public final String component8() {
        return this.expireMonth;
    }

    public final String component9() {
        return this.currencyCode;
    }

    public final ThreeDSPaymentCardData copy(String str, String str2, String str3, String str4, String str5, BillingAddress billingAddress2, String str6, String str7, String str8, String str9, Boolean bool) {
        return new ThreeDSPaymentCardData(str, str2, str3, str4, str5, billingAddress2, str6, str7, str8, str9, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDSPaymentCardData)) {
            return false;
        }
        ThreeDSPaymentCardData threeDSPaymentCardData = (ThreeDSPaymentCardData) obj;
        return C19383o.m32792b(this.f37797id, threeDSPaymentCardData.f37797id) && C19383o.m32792b(this.type, threeDSPaymentCardData.type) && C19383o.m32792b(this.number, threeDSPaymentCardData.number) && C19383o.m32792b(this.encryptedNumber, threeDSPaymentCardData.encryptedNumber) && C19383o.m32792b(this.bankIdentificationNumber, threeDSPaymentCardData.bankIdentificationNumber) && C19383o.m32792b(this.billingAddress, threeDSPaymentCardData.billingAddress) && C19383o.m32792b(this.expireYear, threeDSPaymentCardData.expireYear) && C19383o.m32792b(this.expireMonth, threeDSPaymentCardData.expireMonth) && C19383o.m32792b(this.currencyCode, threeDSPaymentCardData.currencyCode) && C19383o.m32792b(this.cardProductClass, threeDSPaymentCardData.cardProductClass) && C19383o.m32792b(this.partialFpan, threeDSPaymentCardData.partialFpan);
    }

    public final String getBankIdentificationNumber() {
        return this.bankIdentificationNumber;
    }

    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final String getCardProductClass() {
        return this.cardProductClass;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getEncryptedNumber() {
        return this.encryptedNumber;
    }

    public final String getExpireMonth() {
        return this.expireMonth;
    }

    public final String getExpireYear() {
        return this.expireYear;
    }

    public final String getId() {
        return this.f37797id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Boolean getPartialFpan() {
        return this.partialFpan;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f37797id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.number;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptedNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankIdentificationNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BillingAddress billingAddress2 = this.billingAddress;
        int hashCode6 = (hashCode5 + (billingAddress2 == null ? 0 : billingAddress2.hashCode())) * 31;
        String str6 = this.expireYear;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.expireMonth;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currencyCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardProductClass;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.partialFpan;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        String str = this.f37797id;
        String str2 = this.type;
        String str3 = this.number;
        String str4 = this.encryptedNumber;
        String str5 = this.bankIdentificationNumber;
        BillingAddress billingAddress2 = this.billingAddress;
        String str6 = this.expireYear;
        String str7 = this.expireMonth;
        String str8 = this.currencyCode;
        String str9 = this.cardProductClass;
        Boolean bool = this.partialFpan;
        StringBuilder f = C0388a.m1050f("ThreeDSPaymentCardData(id=", str, ", type=", str2, ", number=");
        C0391c.m1061h(f, str3, ", encryptedNumber=", str4, ", bankIdentificationNumber=");
        f.append(str5);
        f.append(", billingAddress=");
        f.append(billingAddress2);
        f.append(", expireYear=");
        C0391c.m1061h(f, str6, ", expireMonth=", str7, ", currencyCode=");
        C0391c.m1061h(f, str8, ", cardProductClass=", str9, ", partialFpan=");
        f.append(bool);
        f.append(")");
        return f.toString();
    }
}
