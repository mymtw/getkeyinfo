package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import androidx.constraintlayout.widget.C2236a;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.c */
public final /* synthetic */ class C17239c implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AddCardView f37751b;

    /* renamed from: c */
    public final /* synthetic */ C2236a f37752c;

    public /* synthetic */ C17239c(AddCardView addCardView, C2236a aVar) {
        this.f37751b = addCardView;
        this.f37752c = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        AddCardView.m35275initExpirationDateFocusListener$lambda14(this.f37751b, this.f37752c, view, z);
    }
}
