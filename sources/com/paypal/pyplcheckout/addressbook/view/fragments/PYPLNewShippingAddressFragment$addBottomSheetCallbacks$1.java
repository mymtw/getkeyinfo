package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

public final class PYPLNewShippingAddressFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLNewShippingAddressFragment this$0;

    public PYPLNewShippingAddressFragment$addBottomSheetCallbacks$1(PYPLNewShippingAddressFragment pYPLNewShippingAddressFragment) {
        this.this$0 = pYPLNewShippingAddressFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35191onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17186d(0));
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getNewShippingAddressBottomSheetBehavior$p = this.this$0.newShippingAddressBottomSheetBehavior;
            if (access$getNewShippingAddressBottomSheetBehavior$p != null) {
                access$getNewShippingAddressBottomSheetBehavior$p.setPeekHeight(view.getHeight());
            } else {
                C19383o.m32805o("newShippingAddressBottomSheetBehavior");
                throw null;
            }
        }
    }
}
