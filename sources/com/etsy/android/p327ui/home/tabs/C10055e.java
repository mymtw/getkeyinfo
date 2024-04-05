package com.etsy.android.p327ui.home.tabs;

import android.view.View;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;

/* renamed from: com.etsy.android.ui.home.tabs.e */
public final /* synthetic */ class C10055e implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f22154b;

    /* renamed from: c */
    public final /* synthetic */ Object f22155c;

    public /* synthetic */ C10055e(Object obj, int i) {
        this.f22154b = i;
        this.f22155c = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f22154b) {
            case 0:
                HomePagerFragment.m35000initializeSearchBar$lambda12((HomePagerFragment) this.f22155c, view, z);
                return;
            default:
                PayPalNewShippingAddressReviewView.m35176initViews$lambda8((PayPalNewShippingAddressReviewView) this.f22155c, view, z);
                return;
        }
    }
}
