package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import android.widget.CompoundButton;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.availablebalance.a */
public final /* synthetic */ class C17236a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AvailablePpBalanceView f37748b;

    public /* synthetic */ C17236a(AvailablePpBalanceView availablePpBalanceView) {
        this.f37748b = availablePpBalanceView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AvailablePpBalanceView.m35408setToggleSwitchListeners$lambda5(this.f37748b, compoundButton, z);
    }
}
