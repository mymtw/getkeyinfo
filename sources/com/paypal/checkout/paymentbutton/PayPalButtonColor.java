package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import com.paypal.checkout.paymentbutton.PaymentButtonColor;
import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PayPalButtonColor implements PaymentButtonColor {
    GOLD(0, r4, false, r17, 4, (PaymentButtonColorLuminance) null),
    BLUE(1, r22, false, r7, 4, (PaymentButtonColorLuminance) null),
    WHITE(2, C17165R.color.paypal_white, true, r16),
    BLACK(3, C17165R.color.paypal_black, false, r7, 4, (PaymentButtonColorLuminance) null),
    SILVER(4, C17165R.color.paypal_silver, false, r16, 4, (PaymentButtonColorLuminance) null);
    
    public static final Companion Companion = null;
    private final int colorResId;
    private final boolean hasOutline;
    private final PaymentButtonColorLuminance luminance;
    private final int value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PayPalButtonColor invoke(int i) {
            PayPalButtonColor payPalButtonColor = PayPalButtonColor.GOLD;
            if (i != payPalButtonColor.getValue()) {
                payPalButtonColor = PayPalButtonColor.BLUE;
                if (i != payPalButtonColor.getValue()) {
                    payPalButtonColor = PayPalButtonColor.WHITE;
                    if (i != payPalButtonColor.getValue()) {
                        payPalButtonColor = PayPalButtonColor.BLACK;
                        if (i != payPalButtonColor.getValue()) {
                            payPalButtonColor = PayPalButtonColor.SILVER;
                            if (i != payPalButtonColor.getValue()) {
                                throw PaymentButtonAttributesKt.createFormattedIllegalArgumentException("PayPalButtonColor", 4);
                            }
                        }
                    }
                }
            }
            return payPalButtonColor;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PayPalButtonColor(int i, int i2, boolean z, PaymentButtonColorLuminance paymentButtonColorLuminance) {
        this.value = i;
        this.colorResId = i2;
        this.hasOutline = z;
        this.luminance = paymentButtonColorLuminance;
    }

    public int getColorResId() {
        return this.colorResId;
    }

    public boolean getHasOutline() {
        return this.hasOutline;
    }

    public PaymentButtonColorLuminance getLuminance() {
        return this.luminance;
    }

    public final int getValue() {
        return this.value;
    }

    public ColorStateList retrieveColorResource(Context context) {
        return PaymentButtonColor.DefaultImpls.retrieveColorResource(this, context);
    }
}
