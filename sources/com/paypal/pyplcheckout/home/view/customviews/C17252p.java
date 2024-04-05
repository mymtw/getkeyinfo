package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.p */
public final /* synthetic */ class C17252p implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ ShippingView f37774a;

    /* renamed from: b */
    public final /* synthetic */ C19846a f37775b;

    public /* synthetic */ C17252p(ShippingView shippingView, C19846a aVar) {
        this.f37774a = shippingView;
        this.f37775b = aVar;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        ShippingView.m35382initEvents$lambda15(this.f37774a, this.f37775b, eventType, resultData);
    }
}
