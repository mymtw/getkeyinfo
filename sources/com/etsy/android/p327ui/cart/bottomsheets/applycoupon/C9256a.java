package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.a */
public final /* synthetic */ class C9256a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ ApplyCouponBottomSheetFragment f20442b;

    public /* synthetic */ C9256a(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment) {
        this.f20442b = applyCouponBottomSheetFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ApplyCouponBottomSheetFragment.m34926setUpTextInput$lambda6$lambda5(this.f20442b, textView, i, keyEvent);
    }
}
