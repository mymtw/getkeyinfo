package com.paypal.pyplcheckout.utils;

import android.webkit.WebView;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;

/* renamed from: com.paypal.pyplcheckout.utils.i */
public final /* synthetic */ class C17289i implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ String f37821a;

    /* renamed from: b */
    public final /* synthetic */ WebView f37822b;

    /* renamed from: c */
    public final /* synthetic */ PYPLCheckoutUtils f37823c;

    public /* synthetic */ C17289i(String str, WebView webView, PYPLCheckoutUtils pYPLCheckoutUtils) {
        this.f37821a = str;
        this.f37822b = webView;
        this.f37823c = pYPLCheckoutUtils;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        PYPLCheckoutUtils.m35466completeWithCheckoutJS$lambda18$lambda17(this.f37821a, this.f37822b, this.f37823c, eventType, resultData);
    }
}
