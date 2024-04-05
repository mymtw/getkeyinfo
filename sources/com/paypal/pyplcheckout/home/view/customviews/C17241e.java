package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import androidx.constraintlayout.widget.C2236a;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.e */
public final /* synthetic */ class C17241e implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AddCardView f37755b;

    /* renamed from: c */
    public final /* synthetic */ C2236a f37756c;

    public /* synthetic */ C17241e(AddCardView addCardView, C2236a aVar) {
        this.f37755b = addCardView;
        this.f37756c = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        AddCardView.m35274initCscFocusListener$lambda15(this.f37755b, this.f37756c, view, z);
    }
}
