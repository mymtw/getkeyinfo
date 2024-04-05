package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import com.paypal.checkout.paymentbutton.PaymentButtonColor;
import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PayPalCreditButtonColor implements PaymentButtonColor {
    DARK_BLUE(0, r4, false, r16, 4, (PaymentButtonColorLuminance) null),
    BLACK(1, C17165R.color.paypal_black, false, r16, 4, (PaymentButtonColorLuminance) null);
    
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

        public final PayPalCreditButtonColor invoke(int i) {
            PayPalCreditButtonColor payPalCreditButtonColor = PayPalCreditButtonColor.DARK_BLUE;
            if (i != payPalCreditButtonColor.getValue()) {
                payPalCreditButtonColor = PayPalCreditButtonColor.BLACK;
                if (i != payPalCreditButtonColor.getValue()) {
                    throw PaymentButtonAttributesKt.createFormattedIllegalArgumentException("PaymentButtonSize", 3);
                }
            }
            return payPalCreditButtonColor;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PayPalCreditButtonColor(int i, int i2, boolean z, PaymentButtonColorLuminance paymentButtonColorLuminance) {
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
