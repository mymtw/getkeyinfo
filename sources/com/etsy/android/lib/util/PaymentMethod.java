package com.etsy.android.lib.util;

import com.etsy.android.R;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public enum PaymentMethod {
    PAYPAL("paypal", R.string.payment_method_label_paypal),
    MONEY_ORDER("mo", R.string.payment_method_label_money_order),
    OTHER("other", R.string.payment_method_label_other),
    CHECK(com.etsy.android.lib.models.apiv3.cart.PaymentMethod.TYPE_CHECK, R.string.payment_method_label_check),
    CREDIT_CARD("cc", R.string.payment_method_label_credit_card),
    BANK_TRANSFER("bt", R.string.payment_method_label_bank_transfer);
    
    private static final Map<String, PaymentMethod> mPaymentMap = null;
    private final int mDisplayLabel;
    private final String mName;

    /* access modifiers changed from: public */
    static {
        int i;
        mPaymentMap = new HashMap();
        for (PaymentMethod paymentMethod : values()) {
            mPaymentMap.put(paymentMethod.toString(), paymentMethod);
        }
    }

    private PaymentMethod(String str, int i) {
        this.mName = str;
        this.mDisplayLabel = i;
    }

    public static PaymentMethod getPaymentMethod(String str) {
        return mPaymentMap.get(str);
    }

    public int getDisplayLabel() {
        return this.mDisplayLabel;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return this.mName;
    }
}
