package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.List;

public class PaymentMethod extends BaseFieldModel {
    public static final String INFO_MODAL = "info_modal";
    public static final String SUBTEXT_ARG_1 = "%1$s";
    public static final String SUBTEXT_ARG_2 = "%2$s";
    public static final String TYPE_BANKTRANSFER = "bank_transfer";
    public static final String TYPE_CC = "cc";
    public static final String TYPE_CHECK = "check";
    public static final String TYPE_GOOGLE_PAY = "google_pay";
    public static final String TYPE_IDEAL = "ideal";
    public static final String TYPE_KLARNA_FINANCING = "k_financing";
    public static final String TYPE_KLARNA_INVOICING = "klarna";
    public static final String TYPE_KLARNA_PAY_IN_3 = "k_pay_in_3";
    public static final String TYPE_KLARNA_PAY_IN_4 = "k_pay_in_4";
    public static final String TYPE_MONEYORDER = "money_order";
    public static final String TYPE_PAYPAL = "paypal";
    public static final String TYPE_SOFORT = "sofort";
    private static final long serialVersionUID = 5118382707515483788L;
    public List<InfoModal> infoModalList;
    public String mDisplayValue;
    public boolean mEnabled;
    public boolean mSelected;
    public String mSubText;
    public String mValue;

    public String getDisplayValue() {
        return this.mDisplayValue;
    }

    public InfoModal getFirstInfoModalOrNull() {
        List<InfoModal> list = this.infoModalList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.infoModalList.get(0);
    }

    public List<InfoModal> getInfoModalList() {
        return this.infoModalList;
    }

    public String getSubText() {
        return this.mSubText;
    }

    public String getValue() {
        return this.mValue;
    }

    public boolean isCreditCard() {
        return "cc".equals(this.mValue);
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isGooglePay() {
        return "google_pay".equals(this.mValue);
    }

    public boolean isIdeal() {
        return "ideal".equals(this.mValue);
    }

    public boolean isKlarnaFinancing() {
        return "k_financing".equals(this.mValue);
    }

    public boolean isKlarnaInstallments() {
        return isKlarnaFinancing() || isKlarnaPayIn3() || isKlarnaPayIn4();
    }

    public boolean isKlarnaInvoicing() {
        return TYPE_KLARNA_INVOICING.equals(this.mValue);
    }

    public boolean isKlarnaPayIn3() {
        return "k_pay_in_3".equals(this.mValue);
    }

    public boolean isKlarnaPayIn4() {
        return "k_pay_in_4".equals(this.mValue);
    }

    public boolean isPayPal() {
        return "paypal".equals(this.mValue);
    }

    public boolean isSelected() {
        return this.mSelected;
    }

    public boolean isSofort() {
        return TYPE_SOFORT.equals(this.mValue);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.DISPLAY_VALUE.equals(str)) {
            this.mDisplayValue = BaseModel.parseString(jsonParser);
            return true;
        } else if ("value".equals(str)) {
            this.mValue = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.SELECTED.equals(str)) {
            this.mSelected = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.ENABLED.equals(str)) {
            this.mEnabled = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.SUBTEXT.equals(str)) {
            this.mSubText = BaseModel.parseString(jsonParser);
            return true;
        } else if (!INFO_MODAL.equals(str)) {
            return false;
        } else {
            this.infoModalList = BaseModel.parseArray(jsonParser, InfoModal.class);
            return true;
        }
    }
}
