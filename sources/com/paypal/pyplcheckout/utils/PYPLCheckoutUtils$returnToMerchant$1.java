package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

public final class PYPLCheckoutUtils$returnToMerchant$1 implements EventListener {
    public final /* synthetic */ PYPLCheckoutUtils this$0;

    public PYPLCheckoutUtils$returnToMerchant$1(PYPLCheckoutUtils pYPLCheckoutUtils) {
        this.this$0 = pYPLCheckoutUtils;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        this.this$0.approveAndReturn(new HashMap(), "hybrid return to merchant payment; empty url");
    }
}
