package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.OfferViewStateUpdateEvent;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$2 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$2(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                this.this$0.setupOffer(((OfferViewStateUpdateEvent) data).getCtaText(), C17165R.string.paypal_checkout_continue_to_application, PEnums.TransitionName.PAYPAL_CREDIT_CTA_CLICKED, "paypal_credit_view", new PayPalContinueButton$initEvents$2$onEvent$1(this.this$0));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.OfferViewStateUpdateEvent");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }
}
