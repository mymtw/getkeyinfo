package com.paypal.pyplcheckout.utils;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;

/* renamed from: com.paypal.pyplcheckout.utils.e */
public final /* synthetic */ class C17285e implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ PYPLCheckoutUtils f37816a;

    /* renamed from: b */
    public final /* synthetic */ String f37817b;

    /* renamed from: c */
    public final /* synthetic */ ReturnToProviderOperationType f37818c;

    public /* synthetic */ C17285e(PYPLCheckoutUtils pYPLCheckoutUtils, String str, ReturnToProviderOperationType returnToProviderOperationType) {
        this.f37816a = pYPLCheckoutUtils;
        this.f37817b = str;
        this.f37818c = returnToProviderOperationType;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        PYPLCheckoutUtils.m35470returnToProviderWithResponse$lambda6(this.f37816a, this.f37817b, this.f37818c, eventType, resultData);
    }
}
