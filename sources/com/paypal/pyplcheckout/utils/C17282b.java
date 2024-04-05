package com.paypal.pyplcheckout.utils;

import android.view.View;
import android.widget.RadioButton;

/* renamed from: com.paypal.pyplcheckout.utils.b */
public final /* synthetic */ class C17282b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ DialogMaker f37804b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f37805c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f37806d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f37807e;

    /* renamed from: f */
    public final /* synthetic */ int f37808f;

    public /* synthetic */ C17282b(DialogMaker dialogMaker, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, int i) {
        this.f37804b = dialogMaker;
        this.f37805c = radioButton;
        this.f37806d = radioButton2;
        this.f37807e = radioButton3;
        this.f37808f = i;
    }

    public final void onClick(View view) {
        this.f37804b.lambda$setRadioButtonClickListener$2(this.f37805c, this.f37806d, this.f37807e, this.f37808f, view);
    }
}
