package com.etsy.android.lib.models;

import com.etsy.android.lib.util.PaymentMethod;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentTemplate extends BaseModel {
    private static final long serialVersionUID = -2473776397001327452L;
    private boolean mAllowBt;
    private boolean mAllowCC;
    private boolean mAllowCheck;
    private boolean mAllowGiftCard;
    private boolean mAllowMo;
    private boolean mAllowOther;
    private boolean mAllowPaypal;
    private List<PaymentMethod> mPaymentMethods = new ArrayList();

    public PaymentTemplate() {
    }

    private void setupPaymentMethods() {
        if (this.mAllowCC) {
            this.mPaymentMethods.add(PaymentMethod.CREDIT_CARD);
        }
        if (this.mAllowPaypal) {
            this.mPaymentMethods.add(PaymentMethod.PAYPAL);
        }
        if (this.mAllowMo) {
            this.mPaymentMethods.add(PaymentMethod.MONEY_ORDER);
        }
        if (this.mAllowCheck) {
            this.mPaymentMethods.add(PaymentMethod.CHECK);
        }
        if (this.mAllowOther) {
            this.mPaymentMethods.add(PaymentMethod.OTHER);
        }
        if (this.mAllowBt) {
            this.mPaymentMethods.add(PaymentMethod.BANK_TRANSFER);
        }
    }

    public boolean getAllowBt() {
        return this.mAllowBt;
    }

    public boolean getAllowCc() {
        return this.mAllowCC;
    }

    public boolean getAllowCheck() {
        return this.mAllowCheck;
    }

    public boolean getAllowGiftCard() {
        return this.mAllowGiftCard;
    }

    public boolean getAllowMo() {
        return this.mAllowMo;
    }

    public boolean getAllowOther() {
        return this.mAllowOther;
    }

    public boolean getAllowPaypal() {
        return this.mAllowPaypal;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return this.mPaymentMethods;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("allow_bt".equals(currentName)) {
                    this.mAllowBt = jsonParser.getValueAsBoolean();
                } else if ("allow_check".equals(currentName)) {
                    this.mAllowCheck = jsonParser.getValueAsBoolean();
                } else if ("allow_mo".equals(currentName)) {
                    this.mAllowMo = jsonParser.getValueAsBoolean();
                } else if ("allow_other".equals(currentName)) {
                    this.mAllowOther = jsonParser.getValueAsBoolean();
                } else if ("allow_paypal".equals(currentName)) {
                    this.mAllowPaypal = jsonParser.getValueAsBoolean();
                } else if ("allow_cc".equals(currentName)) {
                    this.mAllowCC = jsonParser.getValueAsBoolean();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
        setupPaymentMethods();
    }

    public PaymentTemplate(List<String> list) {
        if (list != null) {
            this.mAllowBt = list.contains("bt");
            this.mAllowCheck = list.contains(com.etsy.android.lib.models.apiv3.cart.PaymentMethod.TYPE_CHECK);
            this.mAllowMo = list.contains("mo");
            this.mAllowOther = list.contains("other");
            this.mAllowPaypal = list.contains("paypal");
            this.mAllowCC = list.contains("cc");
            this.mAllowGiftCard = list.contains("gc");
        }
    }
}
