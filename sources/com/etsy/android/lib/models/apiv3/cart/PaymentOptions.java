package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PaymentOptions extends BaseFieldModel {
    private static final long serialVersionUID = 4524698058026555486L;
    public List<PaymentMethod> mPaymentMethods = new ArrayList();

    public List<PaymentMethod> getPaymentMethods() {
        return this.mPaymentMethods;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (!ResponseConstants.PAYMENT_METHODS.equals(str)) {
            return false;
        }
        this.mPaymentMethods = BaseModel.parseArray(jsonParser, PaymentMethod.class);
        return true;
    }
}
