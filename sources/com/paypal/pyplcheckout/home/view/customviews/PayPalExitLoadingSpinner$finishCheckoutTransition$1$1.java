package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationCallback;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;

public final class PayPalExitLoadingSpinner$finishCheckoutTransition$1$1 implements CheckoutAnimationCallback {
    public void onAnimationEnd() {
        PLog.transition$default(PEnums.TransitionName.FIRED_FINISH_FINAL_CHECKOUT_ANIMATION, PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "Fired finish checkout animation returning to merchant", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
        Events.Companion.getInstance().fire(PayPalEventTypes.FINISHED_FINAL_ANIMATION, (ResultData) null);
    }
}
