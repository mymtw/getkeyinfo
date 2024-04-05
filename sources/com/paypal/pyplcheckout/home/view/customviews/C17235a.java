package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import androidx.constraintlayout.widget.C2236a;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.a */
public final /* synthetic */ class C17235a implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AddCardView f37746b;

    /* renamed from: c */
    public final /* synthetic */ C2236a f37747c;

    public /* synthetic */ C17235a(AddCardView addCardView, C2236a aVar) {
        this.f37746b = addCardView;
        this.f37747c = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        AddCardView.m35273initCardNumberFocusListener$lambda13(this.f37746b, this.f37747c, view, z);
    }
}
