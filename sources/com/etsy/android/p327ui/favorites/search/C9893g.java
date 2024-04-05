package com.etsy.android.p327ui.favorites.search;

import android.view.View;
import android.view.ViewGroup;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;

/* renamed from: com.etsy.android.ui.favorites.search.g */
public final /* synthetic */ class C9893g implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f21825b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f21826c;

    public /* synthetic */ C9893g(ViewGroup viewGroup, int i) {
        this.f21825b = i;
        this.f21826c = viewGroup;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f21825b) {
            case 0:
                SearchView.m34980bindSearch$lambda6$lambda5$lambda2((SearchView) this.f21826c, view, z);
                return;
            default:
                PayPalNewShippingAddressReviewView.m35173initViews$lambda5((PayPalNewShippingAddressReviewView) this.f21826c, view, z);
                return;
        }
    }
}
