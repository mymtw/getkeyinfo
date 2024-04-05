package com.paypal.pyplcheckout.billingagreements.view.fragment;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;
import p546cp.C17549a;

public final class PYPLBillingAgreementsTermsFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLBillingAgreementsTermsFragment this$0;

    public PYPLBillingAgreementsTermsFragment$addBottomSheetCallbacks$1(PYPLBillingAgreementsTermsFragment pYPLBillingAgreementsTermsFragment) {
        this.this$0 = pYPLBillingAgreementsTermsFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35235onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17549a(0));
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getBottomSheetBehaviour$p = this.this$0.bottomSheetBehaviour;
            if (access$getBottomSheetBehaviour$p != null) {
                access$getBottomSheetBehaviour$p.setPeekHeight(view.getHeight());
            } else {
                C19383o.m32805o("bottomSheetBehaviour");
                throw null;
            }
        }
    }
}
