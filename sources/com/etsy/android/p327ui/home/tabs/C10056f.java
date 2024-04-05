package com.etsy.android.p327ui.home.tabs;

import android.widget.PopupWindow;

/* renamed from: com.etsy.android.ui.home.tabs.f */
public final /* synthetic */ class C10056f implements PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ HomePagerFragment f22156b;

    public /* synthetic */ C10056f(HomePagerFragment homePagerFragment) {
        this.f22156b = homePagerFragment;
    }

    public final void onDismiss() {
        HomePagerFragment.m35005showPurchaseClaimStatus$lambda9$lambda8(this.f22156b);
    }
}
