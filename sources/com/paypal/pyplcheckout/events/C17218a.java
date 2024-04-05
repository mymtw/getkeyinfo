package com.paypal.pyplcheckout.events;

import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2887s;

/* renamed from: com.paypal.pyplcheckout.events.a */
public final /* synthetic */ class C17218a implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ SingleLiveEvent f37735b;

    /* renamed from: c */
    public final /* synthetic */ C2887s f37736c;

    public /* synthetic */ C17218a(SingleLiveEvent singleLiveEvent, C2887s sVar) {
        this.f37735b = singleLiveEvent;
        this.f37736c = sVar;
    }

    public final void onChanged(Object obj) {
        SingleLiveEvent.m35252observe$lambda1(this.f37735b, this.f37736c, obj);
    }
}
