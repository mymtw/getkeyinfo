package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$12 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$12(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } else if (((Boolean) data).booleanValue()) {
                this.this$0.blockCTAButton();
            } else {
                this.this$0.unBlockCTAButton();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
        }
    }
}
