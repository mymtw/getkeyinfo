package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.PaymentMethod;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StructuredShopPayments extends BaseModel {
    private static final long serialVersionUID = -6420935690069913796L;
    public List<String> mAcceptedPaymentMethods = new ArrayList();
    public boolean mAcceptsDirectCheckout;
    public List<String> mManualPaymentMethods = new ArrayList();
    public List<String> mProtectedPaymentMethods = new ArrayList();

    public boolean acceptsDirectCheckout() {
        return this.mAcceptsDirectCheckout;
    }

    public boolean acceptsPayPal() {
        return getProtectedPaymentMethods().contains(PaymentMethod.PAYPAL.getName());
    }

    public List<String> getAcceptedPaymentMethods() {
        return this.mAcceptedPaymentMethods;
    }

    public List<String> getManualPaymentMethods() {
        return this.mManualPaymentMethods;
    }

    public List<String> getProtectedPaymentMethods() {
        return this.mProtectedPaymentMethods;
    }

    public boolean hasPaymentMethods() {
        return this.mAcceptsDirectCheckout || !this.mAcceptedPaymentMethods.isEmpty() || !this.mProtectedPaymentMethods.isEmpty() || !this.mManualPaymentMethods.isEmpty();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case 107824392:
                        if (currentName.equals(ResponseConstants.ACCEPTS_DIRECT_CHECKOUT)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 181044705:
                        if (currentName.equals(ResponseConstants.ACCEPTED_PAYMENT_METHODS)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1107518440:
                        if (currentName.equals(ResponseConstants.PROTECTED_PAYMENT_METHODS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1565044736:
                        if (currentName.equals(ResponseConstants.MANUAL_PAYMENT_METHODS)) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mAcceptsDirectCheckout = jsonParser.getValueAsBoolean();
                        break;
                    case 1:
                        this.mAcceptedPaymentMethods = BaseModel.parseStringArray(jsonParser);
                        break;
                    case 2:
                        this.mProtectedPaymentMethods = BaseModel.parseStringArray(jsonParser);
                        break;
                    case 3:
                        this.mManualPaymentMethods = BaseModel.parseStringArray(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setAcceptedPaymentMethods(List<String> list) {
        this.mAcceptedPaymentMethods = list;
    }

    public void setAcceptsDirectCheckout(boolean z) {
        this.mAcceptsDirectCheckout = z;
    }

    public void setManualPaymentMethods(List<String> list) {
        this.mManualPaymentMethods = list;
    }

    public void setProtectedPaymentMethods(List<String> list) {
        this.mProtectedPaymentMethods = list;
    }
}
