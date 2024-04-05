package com.etsy.android.p327ui;

import android.view.View;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.k */
public final /* synthetic */ class C10079k implements C19857l {

    /* renamed from: b */
    public final /* synthetic */ int f22213b;

    /* renamed from: c */
    public final /* synthetic */ Object f22214c;

    public /* synthetic */ C10079k(Object obj, int i) {
        this.f22213b = i;
        this.f22214c = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f22213b) {
            case 0:
                return ((BOEActivity) this.f22214c).lambda$completeUpgrade$6((View) obj);
            default:
                return ((MainPaysheetViewModel) this.f22214c).lambda$threeDSAuthenticateAndComplete$21((ContingencyEventsModel) obj);
        }
    }
}
