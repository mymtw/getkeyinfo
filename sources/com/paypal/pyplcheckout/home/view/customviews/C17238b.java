package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.b */
public final /* synthetic */ class C17238b implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AddCardView f37750b;

    public /* synthetic */ C17238b(AddCardView addCardView) {
        this.f37750b = addCardView;
    }

    public final void onFocusChange(View view, boolean z) {
        AddCardView.m35282initZipCodeFocusListener$lambda16(this.f37750b, view, z);
    }
}
