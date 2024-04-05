package com.paypal.pyplcheckout.info.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import kotlin.jvm.internal.C19383o;

public final class PYPLTransactionDetailsView$initViewModelObservers$1 implements EventListener {
    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        Events.Companion.getInstance().fire(PayPalEventTypes.FINISHED_FINAL_ANIMATION, (ResultData) null);
    }
}
