package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.home.view.interfaces.UpdateClientConfigListener;

/* renamed from: com.paypal.pyplcheckout.home.viewmodel.d */
public final /* synthetic */ class C17267d implements UpdateClientConfigListener {

    /* renamed from: b */
    public final /* synthetic */ MainPaysheetViewModel f37784b;

    public /* synthetic */ C17267d(MainPaysheetViewModel mainPaysheetViewModel) {
        this.f37784b = mainPaysheetViewModel;
    }

    public final void onUpdateClientConfig() {
        this.f37784b.logInUser();
    }
}
