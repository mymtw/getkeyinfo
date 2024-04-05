package com.etsy.android.stylekit.views;

import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressSearchView;
import p753kq.C19861p;

/* renamed from: com.etsy.android.stylekit.views.h */
public final /* synthetic */ class C9057h implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f19931b;

    /* renamed from: c */
    public final /* synthetic */ Object f19932c;

    public /* synthetic */ C9057h(Object obj, int i) {
        this.f19931b = i;
        this.f19932c = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f19931b) {
            case 0:
                return CollageListItem.m34888setDraggableTouchListener$lambda1((C19861p) this.f19932c, view, motionEvent);
            default:
                return PayPalNewShippingAddressSearchView.m35183initViews$lambda2((PayPalNewShippingAddressSearchView) this.f19932c, view, motionEvent);
        }
    }
}
