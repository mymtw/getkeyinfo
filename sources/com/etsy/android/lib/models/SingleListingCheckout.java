package com.etsy.android.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

public final class SingleListingCheckout extends BaseFieldModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleListingCheckout> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 2692857722633009345L;
    private boolean acceptsMultiplePaymentMethods;
    private boolean acceptsPayPal;
    private String defaultPaymentMethod;
    private String defaultSubmitText;
    private Integer ineligibleErrorCode;
    private String ineligibleErrorReason;
    private Boolean isExpressCheckoutEligible;
    private boolean isInternational;
    private List<? extends PaymentOption> paymentOptions;
    private String purchaseAcceptTermsText;
    private String title;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class Creator implements Parcelable.Creator<SingleListingCheckout> {
        public final SingleListingCheckout createFromParcel(Parcel parcel) {
            Boolean bool;
            C19383o.m32797g(parcel, "parcel");
            Integer num = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new SingleListingCheckout(bool, num2, readString, readString2, z, z2, readString3, readString4, readString5, arrayList, parcel.readInt() != 0);
        }

        public final SingleListingCheckout[] newArray(int i) {
            return new SingleListingCheckout[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SingleListingCheckout(java.lang.Boolean r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r20
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r21
        L_0x0013:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0019
            r14 = r2
            goto L_0x001b
        L_0x0019:
            r14 = r26
        L_0x001b:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.SingleListingCheckout.<init>(java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final Boolean component1() {
        return this.isExpressCheckoutEligible;
    }

    public static /* synthetic */ SingleListingCheckout copy$default(SingleListingCheckout singleListingCheckout, Boolean bool, Integer num, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, List list, boolean z3, int i, Object obj) {
        SingleListingCheckout singleListingCheckout2 = singleListingCheckout;
        int i2 = i;
        return singleListingCheckout.copy((i2 & 1) != 0 ? singleListingCheckout2.isExpressCheckoutEligible : bool, (i2 & 2) != 0 ? singleListingCheckout2.ineligibleErrorCode : num, (i2 & 4) != 0 ? singleListingCheckout2.ineligibleErrorReason : str, (i2 & 8) != 0 ? singleListingCheckout2.title : str2, (i2 & 16) != 0 ? singleListingCheckout2.acceptsMultiplePaymentMethods : z, (i2 & 32) != 0 ? singleListingCheckout2.acceptsPayPal : z2, (i2 & 64) != 0 ? singleListingCheckout2.defaultPaymentMethod : str3, (i2 & 128) != 0 ? singleListingCheckout2.defaultSubmitText : str4, (i2 & 256) != 0 ? singleListingCheckout2.purchaseAcceptTermsText : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? singleListingCheckout2.paymentOptions : list, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? singleListingCheckout2.isInternational : z3);
    }

    public final List<PaymentOption> component10() {
        return this.paymentOptions;
    }

    public final boolean component11() {
        return this.isInternational;
    }

    public final Integer component2() {
        return this.ineligibleErrorCode;
    }

    public final String component3() {
        return this.ineligibleErrorReason;
    }

    public final String component4() {
        return this.title;
    }

    public final boolean component5() {
        return this.acceptsMultiplePaymentMethods;
    }

    public final boolean component6() {
        return this.acceptsPayPal;
    }

    public final String component7() {
        return this.defaultPaymentMethod;
    }

    public final String component8() {
        return this.defaultSubmitText;
    }

    public final String component9() {
        return this.purchaseAcceptTermsText;
    }

    public final SingleListingCheckout copy(Boolean bool, Integer num, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, List<? extends PaymentOption> list, boolean z3) {
        List<? extends PaymentOption> list2 = list;
        C19383o.m32797g(list2, CartGroupItem.ELEMENT_PAYMENT_OPTIONS);
        return new SingleListingCheckout(bool, num, str, str2, z, z2, str3, str4, str5, list2, z3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleListingCheckout)) {
            return false;
        }
        SingleListingCheckout singleListingCheckout = (SingleListingCheckout) obj;
        return C19383o.m32792b(this.isExpressCheckoutEligible, singleListingCheckout.isExpressCheckoutEligible) && C19383o.m32792b(this.ineligibleErrorCode, singleListingCheckout.ineligibleErrorCode) && C19383o.m32792b(this.ineligibleErrorReason, singleListingCheckout.ineligibleErrorReason) && C19383o.m32792b(this.title, singleListingCheckout.title) && this.acceptsMultiplePaymentMethods == singleListingCheckout.acceptsMultiplePaymentMethods && this.acceptsPayPal == singleListingCheckout.acceptsPayPal && C19383o.m32792b(this.defaultPaymentMethod, singleListingCheckout.defaultPaymentMethod) && C19383o.m32792b(this.defaultSubmitText, singleListingCheckout.defaultSubmitText) && C19383o.m32792b(this.purchaseAcceptTermsText, singleListingCheckout.purchaseAcceptTermsText) && C19383o.m32792b(this.paymentOptions, singleListingCheckout.paymentOptions) && this.isInternational == singleListingCheckout.isInternational;
    }

    public final boolean getAcceptsMultiplePaymentMethods() {
        return this.acceptsMultiplePaymentMethods;
    }

    public final boolean getAcceptsPayPal() {
        return this.acceptsPayPal;
    }

    public final String getDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    public final PaymentOption getDefaultPaymentOption() {
        T t;
        Iterator<T> it = this.paymentOptions.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(this.defaultPaymentMethod, ((PaymentOption) t).getPaymentMethod())) {
                break;
            }
        }
        PaymentOption paymentOption = (PaymentOption) t;
        return paymentOption == null ? (PaymentOption) C19327t.m32640V0(this.paymentOptions) : paymentOption;
    }

    public final String getDefaultSubmitText() {
        return this.defaultSubmitText;
    }

    public final Integer getIneligibleErrorCode() {
        return this.ineligibleErrorCode;
    }

    public final String getIneligibleErrorReason() {
        return this.ineligibleErrorReason;
    }

    public final List<PaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public final String getPurchaseAcceptTermsText() {
        return this.purchaseAcceptTermsText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Boolean bool = this.isExpressCheckoutEligible;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.ineligibleErrorCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.ineligibleErrorReason;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.acceptsMultiplePaymentMethods;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.acceptsPayPal;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        String str3 = this.defaultPaymentMethod;
        int hashCode5 = (i3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.defaultSubmitText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchaseAcceptTermsText;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int g = C13983i.m21488g(this.paymentOptions, (hashCode6 + i) * 31, 31);
        boolean z4 = this.isInternational;
        if (!z4) {
            z2 = z4;
        }
        return g + (z2 ? 1 : 0);
    }

    public final boolean isExpressCheckoutEligible() {
        Boolean bool = this.isExpressCheckoutEligible;
        return bool == null || C19383o.m32792b(bool, Boolean.TRUE);
    }

    public final boolean isInternational() {
        return this.isInternational;
    }

    public final boolean isStandalonePaypal() {
        return this.paymentOptions.size() == 1 && ((PaymentOption) C19327t.m32638T0(this.paymentOptions)).isPayPal();
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -2132146702:
                if (str.equals(ResponseConstants.INELIGIBILITY_ERROR_REASON)) {
                    this.ineligibleErrorReason = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -1495953716:
                if (str.equals(ResponseConstants.IS_EXPRESS_CHECKOUT_ELIGIBLE)) {
                    this.isExpressCheckoutEligible = Boolean.valueOf(jsonParser.getBooleanValue());
                    return true;
                }
                break;
            case -1458851513:
                if (str.equals(ResponseConstants.ACCEPTS_PAYPAL)) {
                    this.acceptsPayPal = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case -865802250:
                if (str.equals(ResponseConstants.DEFAULT_SUBMIT_TEXT)) {
                    this.defaultSubmitText = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -333474056:
                if (str.equals(ResponseConstants.DEFAULT_PAYMENT_METHOD)) {
                    this.defaultPaymentMethod = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    this.title = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 242940261:
                if (str.equals(ResponseConstants.PAYMENT_OPTIONS)) {
                    this.paymentOptions = BaseModel.Companion.parseArray(jsonParser, PaymentOption.class);
                    return true;
                }
                break;
            case 619282334:
                if (str.equals(ResponseConstants.ACCEPTS_MULTIPLE_PAYMENT_METHODS)) {
                    this.acceptsMultiplePaymentMethods = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case 784661561:
                if (str.equals(ResponseConstants.IS_INTERNATIONAL)) {
                    this.isInternational = jsonParser.getBooleanValue();
                    return true;
                }
                break;
            case 879905982:
                if (str.equals(ResponseConstants.PURCHASE_ACCEPT_TERMS_TEXT)) {
                    this.purchaseAcceptTermsText = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 1293432091:
                if (str.equals(ResponseConstants.INELIGIBILITY_ERROR_CODE)) {
                    this.ineligibleErrorCode = Integer.valueOf(jsonParser.getIntValue());
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setAcceptsMultiplePaymentMethods(boolean z) {
        this.acceptsMultiplePaymentMethods = z;
    }

    public final void setAcceptsPayPal(boolean z) {
        this.acceptsPayPal = z;
    }

    public final void setDefaultPaymentMethod(String str) {
        this.defaultPaymentMethod = str;
    }

    public final void setDefaultSubmitText(String str) {
        this.defaultSubmitText = str;
    }

    public final void setIneligibleErrorCode(Integer num) {
        this.ineligibleErrorCode = num;
    }

    public final void setIneligibleErrorReason(String str) {
        this.ineligibleErrorReason = str;
    }

    public final void setInternational(boolean z) {
        this.isInternational = z;
    }

    public final void setPaymentOptions(List<? extends PaymentOption> list) {
        C19383o.m32797g(list, "<set-?>");
        this.paymentOptions = list;
    }

    public final void setPurchaseAcceptTermsText(String str) {
        this.purchaseAcceptTermsText = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SingleListingCheckout(isExpressCheckoutEligible=");
        h.append(this.isExpressCheckoutEligible);
        h.append(", ineligibleErrorCode=");
        h.append(this.ineligibleErrorCode);
        h.append(", ineligibleErrorReason=");
        h.append(this.ineligibleErrorReason);
        h.append(", title=");
        h.append(this.title);
        h.append(", acceptsMultiplePaymentMethods=");
        h.append(this.acceptsMultiplePaymentMethods);
        h.append(", acceptsPayPal=");
        h.append(this.acceptsPayPal);
        h.append(", defaultPaymentMethod=");
        h.append(this.defaultPaymentMethod);
        h.append(", defaultSubmitText=");
        h.append(this.defaultSubmitText);
        h.append(", purchaseAcceptTermsText=");
        h.append(this.purchaseAcceptTermsText);
        h.append(", paymentOptions=");
        h.append(this.paymentOptions);
        h.append(", isInternational=");
        return C0391c.m1058d(h, this.isInternational, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        Boolean bool = this.isExpressCheckoutEligible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.ineligibleErrorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C13983i.m21499r(parcel, 1, num);
        }
        parcel.writeString(this.ineligibleErrorReason);
        parcel.writeString(this.title);
        parcel.writeInt(this.acceptsMultiplePaymentMethods ? 1 : 0);
        parcel.writeInt(this.acceptsPayPal ? 1 : 0);
        parcel.writeString(this.defaultPaymentMethod);
        parcel.writeString(this.defaultSubmitText);
        parcel.writeString(this.purchaseAcceptTermsText);
        List<? extends PaymentOption> list = this.paymentOptions;
        parcel.writeInt(list.size());
        for (Serializable writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
        parcel.writeInt(this.isInternational ? 1 : 0);
    }

    public SingleListingCheckout(Boolean bool, Integer num, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, List<? extends PaymentOption> list, boolean z3) {
        C19383o.m32797g(list, CartGroupItem.ELEMENT_PAYMENT_OPTIONS);
        this.isExpressCheckoutEligible = bool;
        this.ineligibleErrorCode = num;
        this.ineligibleErrorReason = str;
        this.title = str2;
        this.acceptsMultiplePaymentMethods = z;
        this.acceptsPayPal = z2;
        this.defaultPaymentMethod = str3;
        this.defaultSubmitText = str4;
        this.purchaseAcceptTermsText = str5;
        this.paymentOptions = list;
        this.isInternational = z3;
    }
}
