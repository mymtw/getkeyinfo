package com.paypal.checkout.paymentbutton;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class PaymentButtonAttributes {
    private boolean isEnabled;
    private PaymentButtonShape shape;
    private PaymentButtonSize size;

    public PaymentButtonAttributes(PaymentButtonShape paymentButtonShape, PaymentButtonSize paymentButtonSize, boolean z) {
        C19383o.m32797g(paymentButtonShape, "shape");
        C19383o.m32797g(paymentButtonSize, ResponseConstants.SIZE);
        this.shape = paymentButtonShape;
        this.size = paymentButtonSize;
        this.isEnabled = z;
    }

    public static /* synthetic */ PaymentButtonAttributes copy$default(PaymentButtonAttributes paymentButtonAttributes, PaymentButtonShape paymentButtonShape, PaymentButtonSize paymentButtonSize, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentButtonShape = paymentButtonAttributes.shape;
        }
        if ((i & 2) != 0) {
            paymentButtonSize = paymentButtonAttributes.size;
        }
        if ((i & 4) != 0) {
            z = paymentButtonAttributes.isEnabled;
        }
        return paymentButtonAttributes.copy(paymentButtonShape, paymentButtonSize, z);
    }

    public final PaymentButtonShape component1() {
        return this.shape;
    }

    public final PaymentButtonSize component2() {
        return this.size;
    }

    public final boolean component3() {
        return this.isEnabled;
    }

    public final PaymentButtonAttributes copy(PaymentButtonShape paymentButtonShape, PaymentButtonSize paymentButtonSize, boolean z) {
        C19383o.m32797g(paymentButtonShape, "shape");
        C19383o.m32797g(paymentButtonSize, ResponseConstants.SIZE);
        return new PaymentButtonAttributes(paymentButtonShape, paymentButtonSize, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentButtonAttributes)) {
            return false;
        }
        PaymentButtonAttributes paymentButtonAttributes = (PaymentButtonAttributes) obj;
        return this.shape == paymentButtonAttributes.shape && this.size == paymentButtonAttributes.size && this.isEnabled == paymentButtonAttributes.isEnabled;
    }

    public final PaymentButtonShape getShape() {
        return this.shape;
    }

    public final PaymentButtonSize getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = (this.size.hashCode() + (this.shape.hashCode() * 31)) * 31;
        boolean z = this.isEnabled;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setShape(PaymentButtonShape paymentButtonShape) {
        C19383o.m32797g(paymentButtonShape, "<set-?>");
        this.shape = paymentButtonShape;
    }

    public final void setSize(PaymentButtonSize paymentButtonSize) {
        C19383o.m32797g(paymentButtonSize, "<set-?>");
        this.size = paymentButtonSize;
    }

    public String toString() {
        PaymentButtonShape paymentButtonShape = this.shape;
        PaymentButtonSize paymentButtonSize = this.size;
        boolean z = this.isEnabled;
        return "PaymentButtonAttributes(shape=" + paymentButtonShape + ", size=" + paymentButtonSize + ", isEnabled=" + z + ")";
    }
}
