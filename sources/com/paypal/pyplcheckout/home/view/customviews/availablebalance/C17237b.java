package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import android.widget.CompoundButton;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.availablebalance.b */
public final /* synthetic */ class C17237b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AvailablePpBalanceView f37749b;

    public /* synthetic */ C17237b(AvailablePpBalanceView availablePpBalanceView) {
        this.f37749b = availablePpBalanceView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AvailablePpBalanceView.m35409setToggleSwitchListeners$lambda6(this.f37749b, compoundButton, z);
    }
}
