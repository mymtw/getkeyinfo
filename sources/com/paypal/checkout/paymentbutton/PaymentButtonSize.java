package com.paypal.checkout.paymentbutton;

import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PaymentButtonSize {
    SMALL(0, r4, r5, r6),
    MEDIUM(1, r4, r5, r6),
    LARGE(2, C17165R.dimen.paypal_payment_button_min_height_large, C17165R.dimen.paypal_payment_button_vertical_padding_large, C17165R.dimen.paypal_payment_button_label_text_size_large);
    
    public static final Companion Companion = null;
    private final int labelTextSizeResId;
    private final int minHeightResId;
    private final int value;
    private final int verticalPaddingResId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentButtonSize invoke(int i) {
            PaymentButtonSize paymentButtonSize = PaymentButtonSize.SMALL;
            if (i != paymentButtonSize.getValue()) {
                paymentButtonSize = PaymentButtonSize.MEDIUM;
                if (i != paymentButtonSize.getValue()) {
                    paymentButtonSize = PaymentButtonSize.LARGE;
                    if (i != paymentButtonSize.getValue()) {
                        throw PaymentButtonAttributesKt.createFormattedIllegalArgumentException("PaymentButtonSize", 3);
                    }
                }
            }
            return paymentButtonSize;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PaymentButtonSize(int i, int i2, int i3, int i4) {
        this.value = i;
        this.minHeightResId = i2;
        this.verticalPaddingResId = i3;
        this.labelTextSizeResId = i4;
    }

    public final int getLabelTextSizeResId() {
        return this.labelTextSizeResId;
    }

    public final int getMinHeightResId() {
        return this.minHeightResId;
    }

    public final int getValue() {
        return this.value;
    }

    public final int getVerticalPaddingResId() {
        return this.verticalPaddingResId;
    }
}
