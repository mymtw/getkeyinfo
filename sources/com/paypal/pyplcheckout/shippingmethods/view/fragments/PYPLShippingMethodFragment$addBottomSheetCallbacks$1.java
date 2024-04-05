package com.paypal.pyplcheckout.shippingmethods.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p578gp.C17808a;

public final class PYPLShippingMethodFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLShippingMethodFragment this$0;

    public PYPLShippingMethodFragment$addBottomSheetCallbacks$1(PYPLShippingMethodFragment pYPLShippingMethodFragment) {
        this.this$0 = pYPLShippingMethodFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35442onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17808a());
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        switch (i) {
            case 1:
                BottomSheetBehavior access$getShippingMethodsBottomSheetBehavior$p = this.this$0.shippingMethodsBottomSheetBehavior;
                if (access$getShippingMethodsBottomSheetBehavior$p != null) {
                    access$getShippingMethodsBottomSheetBehavior$p.setPeekHeight(view.getHeight());
                    PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_DRAGGING", 0, 4, (Object) null);
                    return;
                }
                C19383o.m32805o("shippingMethodsBottomSheetBehavior");
                throw null;
            case 2:
                PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_SETTLING", 0, 4, (Object) null);
                return;
            case 3:
                PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_EXPANDED", 0, 4, (Object) null);
                return;
            case 4:
                PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_COLLAPSED", 0, 4, (Object) null);
                return;
            case 5:
                PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_HIDDEN", 0, 4, (Object) null);
                return;
            case 6:
                PLog.i$default(PYPLShippingMethodFragment.TAG, "ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_HALF_EXPANDED", 0, 4, (Object) null);
                return;
            default:
                PLog.i$default(PYPLShippingMethodFragment.TAG, C0015b.m88g("ShippingMethodSheetCallback: ShippingMethodsBottomSheetBehavior.STATE_#", i), 0, 4, (Object) null);
                return;
        }
    }
}
