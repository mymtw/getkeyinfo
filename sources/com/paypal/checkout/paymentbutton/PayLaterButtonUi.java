package com.paypal.checkout.paymentbutton;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class PayLaterButtonUi {
    private PaymentButtonAttributes attributes;
    private PayPalButtonColor color;

    public PayLaterButtonUi(PayPalButtonColor payPalButtonColor, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalButtonColor, "color");
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        this.color = payPalButtonColor;
        this.attributes = paymentButtonAttributes;
    }

    public static /* synthetic */ PayLaterButtonUi copy$default(PayLaterButtonUi payLaterButtonUi, PayPalButtonColor payPalButtonColor, PaymentButtonAttributes paymentButtonAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            payPalButtonColor = payLaterButtonUi.color;
        }
        if ((i & 2) != 0) {
            paymentButtonAttributes = payLaterButtonUi.attributes;
        }
        return payLaterButtonUi.copy(payPalButtonColor, paymentButtonAttributes);
    }

    public final PayPalButtonColor component1() {
        return this.color;
    }

    public final PaymentButtonAttributes component2() {
        return this.attributes;
    }

    public final PayLaterButtonUi copy(PayPalButtonColor payPalButtonColor, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalButtonColor, "color");
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        return new PayLaterButtonUi(payPalButtonColor, paymentButtonAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayLaterButtonUi)) {
            return false;
        }
        PayLaterButtonUi payLaterButtonUi = (PayLaterButtonUi) obj;
        return this.color == payLaterButtonUi.color && C19383o.m32792b(this.attributes, payLaterButtonUi.attributes);
    }

    public final PaymentButtonAttributes getAttributes() {
        return this.attributes;
    }

    public final PayPalButtonColor getColor() {
        return this.color;
    }

    public int hashCode() {
        return this.attributes.hashCode() + (this.color.hashCode() * 31);
    }

    public final void setAttributes(PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(paymentButtonAttributes, "<set-?>");
        this.attributes = paymentButtonAttributes;
    }

    public final void setColor(PayPalButtonColor payPalButtonColor) {
        C19383o.m32797g(payPalButtonColor, "<set-?>");
        this.color = payPalButtonColor;
    }

    public String toString() {
        PayPalButtonColor payPalButtonColor = this.color;
        PaymentButtonAttributes paymentButtonAttributes = this.attributes;
        return "PayLaterButtonUi(color=" + payPalButtonColor + ", attributes=" + paymentButtonAttributes + ")";
    }
}
