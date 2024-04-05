package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.crypto.view.fragments.PYPLCryptoConsentFragment$addBottomSheetCallbacks$1;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.d */
public final /* synthetic */ class C17186d implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f37692b;

    public /* synthetic */ C17186d(int i) {
        this.f37692b = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f37692b) {
            case 0:
                return PYPLNewShippingAddressFragment$addBottomSheetCallbacks$1.m35191onSlide$lambda0(view, motionEvent);
            default:
                return PYPLCryptoConsentFragment$addBottomSheetCallbacks$1.m35246onSlide$lambda0(view, motionEvent);
        }
    }
}
