package com.paypal.checkout.paymentbutton;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PaymentButtonShape {
    ROUNDED(0),
    PILL(1),
    RECTANGLE(2);
    
    public static final Companion Companion = null;
    private final int value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentButtonShape invoke(int i) {
            PaymentButtonShape paymentButtonShape = PaymentButtonShape.ROUNDED;
            if (i != paymentButtonShape.getValue()) {
                paymentButtonShape = PaymentButtonShape.PILL;
                if (i != paymentButtonShape.getValue()) {
                    paymentButtonShape = PaymentButtonShape.RECTANGLE;
                    if (i != paymentButtonShape.getValue()) {
                        throw PaymentButtonAttributesKt.createFormattedIllegalArgumentException("PaymentButtonShape", 3);
                    }
                }
            }
            return paymentButtonShape;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PaymentButtonShape(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
