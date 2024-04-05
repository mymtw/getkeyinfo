package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$14 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$14(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.START_THREE_DS_FLOW_REQUEST;
        PayPalContinueButton payPalContinueButton = this.this$0;
        Context context = payPalContinueButton.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        instance.fire(payPalEventTypes, new Success(payPalContinueButton.getComponentActivity(context)));
    }
}
