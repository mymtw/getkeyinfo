package com.paypal.checkout.paymentbutton;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class PayPalCreditButtonUi {
    private PaymentButtonAttributes attributes;
    private PayPalCreditButtonColor color;

    public PayPalCreditButtonUi(PayPalCreditButtonColor payPalCreditButtonColor, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalCreditButtonColor, "color");
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        this.color = payPalCreditButtonColor;
        this.attributes = paymentButtonAttributes;
    }

    public static /* synthetic */ PayPalCreditButtonUi copy$default(PayPalCreditButtonUi payPalCreditButtonUi, PayPalCreditButtonColor payPalCreditButtonColor, PaymentButtonAttributes paymentButtonAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            payPalCreditButtonColor = payPalCreditButtonUi.color;
        }
        if ((i & 2) != 0) {
            paymentButtonAttributes = payPalCreditButtonUi.attributes;
        }
        return payPalCreditButtonUi.copy(payPalCreditButtonColor, paymentButtonAttributes);
    }

    public final PayPalCreditButtonColor component1() {
        return this.color;
    }

    public final PaymentButtonAttributes component2() {
        return this.attributes;
    }

    public final PayPalCreditButtonUi copy(PayPalCreditButtonColor payPalCreditButtonColor, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalCreditButtonColor, "color");
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        return new PayPalCreditButtonUi(payPalCreditButtonColor, paymentButtonAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPalCreditButtonUi)) {
            return false;
        }
        PayPalCreditButtonUi payPalCreditButtonUi = (PayPalCreditButtonUi) obj;
        return this.color == payPalCreditButtonUi.color && C19383o.m32792b(this.attributes, payPalCreditButtonUi.attributes);
    }

    public final PaymentButtonAttributes getAttributes() {
        return this.attributes;
    }

    public final PayPalCreditButtonColor getColor() {
        return this.color;
    }

    public int hashCode() {
        return this.attributes.hashCode() + (this.color.hashCode() * 31);
    }

    public final void setAttributes(PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(paymentButtonAttributes, "<set-?>");
        this.attributes = paymentButtonAttributes;
    }

    public final void setColor(PayPalCreditButtonColor payPalCreditButtonColor) {
        C19383o.m32797g(payPalCreditButtonColor, "<set-?>");
        this.color = payPalCreditButtonColor;
    }

    public String toString() {
        PayPalCreditButtonColor payPalCreditButtonColor = this.color;
        PaymentButtonAttributes paymentButtonAttributes = this.attributes;
        return "PayPalCreditButtonUi(color=" + payPalCreditButtonColor + ", attributes=" + paymentButtonAttributes + ")";
    }
}
