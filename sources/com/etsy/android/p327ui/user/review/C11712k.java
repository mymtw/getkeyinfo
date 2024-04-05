package com.etsy.android.p327ui.user.review;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;

/* renamed from: com.etsy.android.ui.user.review.k */
public final /* synthetic */ class C11712k implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f26063b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f26064c;

    public /* synthetic */ C11712k(KeyEvent.Callback callback, int i) {
        this.f26063b = i;
        this.f26064c = callback;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f26063b) {
            case 0:
                return CreateReviewActivity.m35071hideKeyboardOnTouchOutsideTextInput$lambda29((CreateReviewActivity) this.f26064c, view, motionEvent);
            default:
                return PayPalNewShippingAddressReviewView.m35171initViews$lambda3((PayPalNewShippingAddressReviewView) this.f26064c, view, motionEvent);
        }
    }
}
