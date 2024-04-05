package com.paypal.pyplcheckout.animation.base;

import android.view.View;

/* renamed from: com.paypal.pyplcheckout.animation.base.a */
public final /* synthetic */ class C17194a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f37705b;

    /* renamed from: c */
    public final /* synthetic */ View f37706c;

    /* renamed from: d */
    public final /* synthetic */ float f37707d;

    public /* synthetic */ C17194a(View view, View view2, float f) {
        this.f37705b = view;
        this.f37706c = view2;
        this.f37707d = f;
    }

    public final void run() {
        AnimationUtils.m35202shrinkFavorite$lambda9(this.f37705b, this.f37706c, this.f37707d);
    }
}
