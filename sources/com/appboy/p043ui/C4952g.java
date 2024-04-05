package com.appboy.p043ui;

import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.conversionrateprotection.view.fragments.PYPLRateProtectionFragment$addBottomSheetCallbacks$1;

/* renamed from: com.appboy.ui.g */
public final /* synthetic */ class C4952g implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f11149b;

    public /* synthetic */ C4952g(int i) {
        this.f11149b = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f11149b) {
            case 0:
                return AppboyXamarinFormsFeedFragment.lambda$onActivityCreated$1(view, motionEvent);
            default:
                return PYPLRateProtectionFragment$addBottomSheetCallbacks$1.m35245onSlide$lambda0(view, motionEvent);
        }
    }
}
