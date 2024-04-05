package com.etsy.android.p327ui.user.addresses;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: com.etsy.android.ui.user.addresses.p */
public final /* synthetic */ class C11441p implements SwipeRefreshLayout.C3293j {

    /* renamed from: b */
    public final /* synthetic */ AddressListFragment f25260b;

    public /* synthetic */ C11441p(AddressListFragment addressListFragment) {
        this.f25260b = addressListFragment;
    }

    public final void onRefresh() {
        AddressListFragment.m35059onViewCreated$lambda0(this.f25260b);
    }
}
