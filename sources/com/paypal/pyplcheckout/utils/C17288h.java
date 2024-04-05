package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import java.util.HashMap;

/* renamed from: com.paypal.pyplcheckout.utils.h */
public final /* synthetic */ class C17288h implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ PYPLCheckoutUtils f37819a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f37820b;

    public /* synthetic */ C17288h(PYPLCheckoutUtils pYPLCheckoutUtils, HashMap hashMap) {
        this.f37819a = pYPLCheckoutUtils;
        this.f37820b = hashMap;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        PYPLCheckoutUtils.m35469returnToMerchant$lambda14(this.f37819a, this.f37820b, eventType, resultData);
    }
}
