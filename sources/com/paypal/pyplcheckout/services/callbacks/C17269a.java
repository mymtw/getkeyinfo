package com.paypal.pyplcheckout.services.callbacks;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;

/* renamed from: com.paypal.pyplcheckout.services.callbacks.a */
public final /* synthetic */ class C17269a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ FirebaseTokenCallback f37798a;

    /* renamed from: b */
    public final /* synthetic */ RealTimeDB f37799b;

    public /* synthetic */ C17269a(FirebaseTokenCallback firebaseTokenCallback, RealTimeDB realTimeDB) {
        this.f37798a = firebaseTokenCallback;
        this.f37799b = realTimeDB;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        FirebaseTokenCallback.m35429firebaseTokenReceived$lambda2(this.f37798a, this.f37799b, eventType, resultData);
    }
}
