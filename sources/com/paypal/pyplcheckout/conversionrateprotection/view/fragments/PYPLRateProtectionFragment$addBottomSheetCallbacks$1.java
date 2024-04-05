package com.paypal.pyplcheckout.conversionrateprotection.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.appboy.p043ui.C4952g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

public final class PYPLRateProtectionFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLRateProtectionFragment this$0;

    public PYPLRateProtectionFragment$addBottomSheetCallbacks$1(PYPLRateProtectionFragment pYPLRateProtectionFragment) {
        this.this$0 = pYPLRateProtectionFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35245onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C4952g(1));
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getRateProtectionSheetBottomBehavior$p = this.this$0.rateProtectionSheetBottomBehavior;
            if (access$getRateProtectionSheetBottomBehavior$p != null) {
                access$getRateProtectionSheetBottomBehavior$p.setPeekHeight(view.getHeight());
            } else {
                C19383o.m32805o("rateProtectionSheetBottomBehavior");
                throw null;
            }
        }
    }
}
