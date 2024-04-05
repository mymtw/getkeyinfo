package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;

/* renamed from: com.paypal.pyplcheckout.home.viewmodel.b */
public final /* synthetic */ class C17265b implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37781a;

    /* renamed from: b */
    public final /* synthetic */ MainPaysheetViewModel f37782b;

    public /* synthetic */ C17265b(MainPaysheetViewModel mainPaysheetViewModel, int i) {
        this.f37781a = i;
        this.f37782b = mainPaysheetViewModel;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37781a) {
            case 0:
                this.f37782b.lambda$createContingencyEventListener$17(eventType, resultData);
                return;
            default:
                this.f37782b.lambda$listenForThreeDSevents$22(eventType, resultData);
                return;
        }
    }
}
