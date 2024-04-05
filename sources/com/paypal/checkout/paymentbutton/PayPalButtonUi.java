package com.paypal.checkout.paymentbutton;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class PayPalButtonUi {
    private PaymentButtonAttributes attributes;
    private PayPalButtonColor color;
    private PayPalButtonLabel label;

    public PayPalButtonUi(PayPalButtonColor payPalButtonColor, PayPalButtonLabel payPalButtonLabel, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalButtonColor, "color");
        C19383o.m32797g(payPalButtonLabel, ResponseConstants.LABEL);
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        this.color = payPalButtonColor;
        this.label = payPalButtonLabel;
        this.attributes = paymentButtonAttributes;
    }

    public static /* synthetic */ PayPalButtonUi copy$default(PayPalButtonUi payPalButtonUi, PayPalButtonColor payPalButtonColor, PayPalButtonLabel payPalButtonLabel, PaymentButtonAttributes paymentButtonAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            payPalButtonColor = payPalButtonUi.color;
        }
        if ((i & 2) != 0) {
            payPalButtonLabel = payPalButtonUi.label;
        }
        if ((i & 4) != 0) {
            paymentButtonAttributes = payPalButtonUi.attributes;
        }
        return payPalButtonUi.copy(payPalButtonColor, payPalButtonLabel, paymentButtonAttributes);
    }

    public final PayPalButtonColor component1() {
        return this.color;
    }

    public final PayPalButtonLabel component2() {
        return this.label;
    }

    public final PaymentButtonAttributes component3() {
        return this.attributes;
    }

    public final PayPalButtonUi copy(PayPalButtonColor payPalButtonColor, PayPalButtonLabel payPalButtonLabel, PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(payPalButtonColor, "color");
        C19383o.m32797g(payPalButtonLabel, ResponseConstants.LABEL);
        C19383o.m32797g(paymentButtonAttributes, ResponseConstants.ATTRIBUTES);
        return new PayPalButtonUi(payPalButtonColor, payPalButtonLabel, paymentButtonAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPalButtonUi)) {
            return false;
        }
        PayPalButtonUi payPalButtonUi = (PayPalButtonUi) obj;
        return this.color == payPalButtonUi.color && this.label == payPalButtonUi.label && C19383o.m32792b(this.attributes, payPalButtonUi.attributes);
    }

    public final PaymentButtonAttributes getAttributes() {
        return this.attributes;
    }

    public final PayPalButtonColor getColor() {
        return this.color;
    }

    public final PayPalButtonLabel getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = this.label.hashCode();
        return this.attributes.hashCode() + ((hashCode + (this.color.hashCode() * 31)) * 31);
    }

    public final void setAttributes(PaymentButtonAttributes paymentButtonAttributes) {
        C19383o.m32797g(paymentButtonAttributes, "<set-?>");
        this.attributes = paymentButtonAttributes;
    }

    public final void setColor(PayPalButtonColor payPalButtonColor) {
        C19383o.m32797g(payPalButtonColor, "<set-?>");
        this.color = payPalButtonColor;
    }

    public final void setLabel(PayPalButtonLabel payPalButtonLabel) {
        C19383o.m32797g(payPalButtonLabel, "<set-?>");
        this.label = payPalButtonLabel;
    }

    public String toString() {
        PayPalButtonColor payPalButtonColor = this.color;
        PayPalButtonLabel payPalButtonLabel = this.label;
        PaymentButtonAttributes paymentButtonAttributes = this.attributes;
        return "PayPalButtonUi(color=" + payPalButtonColor + ", label=" + payPalButtonLabel + ", attributes=" + paymentButtonAttributes + ")";
    }
}
