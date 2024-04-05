package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.CheckoutButtonStyleEventModel;
import com.paypal.pyplcheckout.home.view.customviews.productviews.CheckoutButtonBehaviourDescriptor;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$1 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$1(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                this.this$0.updateCheckoutButtonBackgroundColor(new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.OTHER), (CheckoutButtonStyleEventModel) data);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.CheckoutButtonStyleEventModel");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }
}
