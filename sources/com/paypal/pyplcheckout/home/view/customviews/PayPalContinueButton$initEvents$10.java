package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$10 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$10(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        this.this$0.isInvalidShippingMethod = true;
        this.this$0.updateCheckoutButtonRefreshStatus(false);
        this.this$0.isActionButtonClickEnabled = false;
        this.this$0.button.setOnClickListener(this.this$0);
    }
}
