package com.paypal.checkout.paymentbutton;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PayPalButtonLabel {
    PAYPAL(0, (int) null, (int) null, 6, (Integer) null),
    CHECKOUT(1, r7, Integer.valueOf(C17165R.string.paypal_checkout_smart_payment_button_label_checkout)),
    BUY_NOW(2, r5, Integer.valueOf(C17165R.string.paypal_checkout_smart_payment_button_label_buy_now)),
    PAY(3, Position.START, Integer.valueOf(C17165R.string.paypal_checkout_smart_payment_button_label_pay)),
    PAY_LATER(4, r5, Integer.valueOf(C17165R.string.paypal_checkout_smart_payment_button_label_pay_later));
    
    public static final Companion Companion = null;
    private final Position position;
    private final Integer stringResId;
    private final int value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PayPalButtonLabel invoke(int i) {
            PayPalButtonLabel payPalButtonLabel = PayPalButtonLabel.PAYPAL;
            if (i != payPalButtonLabel.getValue()) {
                payPalButtonLabel = PayPalButtonLabel.CHECKOUT;
                if (i != payPalButtonLabel.getValue()) {
                    payPalButtonLabel = PayPalButtonLabel.BUY_NOW;
                    if (i != payPalButtonLabel.getValue()) {
                        payPalButtonLabel = PayPalButtonLabel.PAY;
                        if (i != payPalButtonLabel.getValue()) {
                            payPalButtonLabel = PayPalButtonLabel.PAY_LATER;
                            if (i != payPalButtonLabel.getValue()) {
                                throw PaymentButtonAttributesKt.createFormattedIllegalArgumentException("PaymentButtonLabel", 4);
                            }
                        }
                    }
                }
            }
            return payPalButtonLabel;
        }
    }

    public enum Position {
        START,
        END
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PayPalButtonLabel(int i, Position position2, Integer num) {
        this.value = i;
        this.position = position2;
        this.stringResId = num;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final int getValue() {
        return this.value;
    }

    public final String retrieveLabel(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Integer num = this.stringResId;
        if (num == null) {
            return null;
        }
        return context.getString(num.intValue());
    }
}
