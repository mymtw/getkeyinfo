package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class PaymentOption extends BaseFieldModel {
    public static final String TYPE_CC = "cc";
    public static final String TYPE_GOOGLE_PAY = "google_pay";
    public static final String TYPE_IDEAL = "ideal";
    public static final String TYPE_KLARNA_FINANCING = "k_financing";
    public static final String TYPE_KLARNA_PAY_IN_3 = "k_pay_in_3";
    public static final String TYPE_KLARNA_PAY_IN_4 = "k_pay_in_4";
    public static final String TYPE_PAYPAL = "paypal";
    public List<String> mIconClasses;
    public String mInputId;
    public String mLabel;
    public String mPaymentMethod;
    public boolean mSelected;
    public String mSubmitClasses;
    public String mSubmitText;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) obj;
        return this.mSelected == paymentOption.mSelected && Objects.equals(this.mLabel, paymentOption.mLabel) && Objects.equals(this.mPaymentMethod, paymentOption.mPaymentMethod) && Objects.equals(this.mInputId, paymentOption.mInputId) && Objects.equals(this.mSubmitClasses, paymentOption.mSubmitClasses) && Objects.equals(this.mSubmitText, paymentOption.mSubmitText) && Objects.equals(this.mIconClasses, paymentOption.mIconClasses);
    }

    public List<String> getIconClasses() {
        return this.mIconClasses;
    }

    public String getInputId() {
        return this.mInputId;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public String getPaymentMethod() {
        return this.mPaymentMethod;
    }

    public String getSubmitClasses() {
        return this.mSubmitClasses;
    }

    public String getSubmitText() {
        return this.mSubmitText;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mLabel, Boolean.valueOf(this.mSelected), this.mPaymentMethod, this.mInputId, this.mSubmitClasses, this.mSubmitText, this.mIconClasses});
    }

    public boolean isCreditCard() {
        return "cc".equals(this.mPaymentMethod);
    }

    public boolean isGooglePay() {
        return "google_pay".equals(this.mPaymentMethod);
    }

    public boolean isIdeal() {
        return "ideal".equals(this.mPaymentMethod);
    }

    public boolean isKlarnaFinancing() {
        return "k_financing".equals(this.mPaymentMethod);
    }

    public boolean isKlarnaInstallments() {
        return isKlarnaFinancing() || isKlarnaPayIn4() || isKlarnaPayIn3();
    }

    public boolean isKlarnaPayIn3() {
        return "k_pay_in_3".equals(this.mPaymentMethod);
    }

    public boolean isKlarnaPayIn4() {
        return "k_pay_in_4".equals(this.mPaymentMethod);
    }

    public boolean isPayPal() {
        return "paypal".equals(this.mPaymentMethod);
    }

    public boolean isSelected() {
        return this.mSelected;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1029412550:
                if (str.equals("payment_method")) {
                    c = 0;
                    break;
                }
                break;
            case -260602113:
                if (str.equals(ResponseConstants.SUBMIT_CLASSES)) {
                    c = 1;
                    break;
                }
                break;
            case 53546228:
                if (str.equals(ResponseConstants.SUBMIT_TEXT)) {
                    c = 2;
                    break;
                }
                break;
            case 102727412:
                if (str.equals(ResponseConstants.LABEL)) {
                    c = 3;
                    break;
                }
                break;
            case 470715824:
                if (str.equals(ResponseConstants.INPUT_ID)) {
                    c = 4;
                    break;
                }
                break;
            case 486445664:
                if (str.equals(ResponseConstants.ICON_CLASSES)) {
                    c = 5;
                    break;
                }
                break;
            case 1191572123:
                if (str.equals(ResponseConstants.SELECTED)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mPaymentMethod = BaseModel.parseString(jsonParser);
                return true;
            case 1:
                this.mSubmitClasses = BaseModel.parseString(jsonParser);
                return true;
            case 2:
                this.mSubmitText = BaseModel.parseString(jsonParser);
                return true;
            case 3:
                this.mLabel = BaseModel.parseString(jsonParser);
                return true;
            case 4:
                this.mInputId = BaseModel.parseString(jsonParser);
                return true;
            case 5:
                this.mIconClasses = BaseModel.parseStringArray(jsonParser);
                return true;
            case 6:
                this.mSelected = jsonParser.getValueAsBoolean();
                return true;
            default:
                return false;
        }
    }

    public void setIconClasses(List<String> list) {
        this.mIconClasses = list;
    }

    public void setInputId(String str) {
        this.mInputId = str;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setPaymentMethod(String str) {
        this.mPaymentMethod = str;
    }

    public void setSelected(boolean z) {
        this.mSelected = z;
    }

    public void setSubmitClasses(String str) {
        this.mSubmitClasses = str;
    }

    public void setSubmitText(String str) {
        this.mSubmitText = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PaymentOption{mLabel='");
        h.append(this.mLabel);
        h.append('\'');
        h.append(", mSelected=");
        h.append(this.mSelected);
        h.append(", mPaymentMethod='");
        h.append(this.mPaymentMethod);
        h.append('\'');
        h.append(", mInputId='");
        h.append(this.mInputId);
        h.append('\'');
        h.append(", mSubmitClasses='");
        h.append(this.mSubmitClasses);
        h.append('\'');
        h.append(", mSubmitText='");
        h.append(this.mSubmitText);
        h.append('\'');
        h.append(", mIconClasses=");
        return C0070b.m186i(h, this.mIconClasses, '}');
    }
}
