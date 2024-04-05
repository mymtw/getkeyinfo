package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;

/* renamed from: com.paypal.pyplcheckout.home.viewmodel.a */
public final /* synthetic */ class C17264a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37779a;

    /* renamed from: b */
    public final /* synthetic */ MainPaysheetViewModel f37780b;

    public /* synthetic */ C17264a(MainPaysheetViewModel mainPaysheetViewModel, int i) {
        this.f37779a = i;
        this.f37780b = mainPaysheetViewModel;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37779a) {
            case 0:
                this.f37780b.lambda$new$3(eventType, resultData);
                return;
            default:
                this.f37780b.lambda$onLifeCycleCreate$14(eventType, resultData);
                return;
        }
    }
}
