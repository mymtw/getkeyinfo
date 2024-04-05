package com.paypal.pyplcheckout.conversionrate.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p554dp.C17702a;

public final class PYPLConversionRateFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLConversionRateFragment this$0;

    public PYPLConversionRateFragment$addBottomSheetCallbacks$1(PYPLConversionRateFragment pYPLConversionRateFragment) {
        this.this$0 = pYPLConversionRateFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35244onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17702a());
        String str = PYPLConversionRateFragment.TAG;
        PLog.i$default(str, "ConversionSheetCallBack slideOffset: " + f, 0, 4, (Object) null);
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        switch (i) {
            case 1:
                BottomSheetBehavior access$getConversionSheetBottomBehavior$p = this.this$0.conversionSheetBottomBehavior;
                if (access$getConversionSheetBottomBehavior$p != null) {
                    access$getConversionSheetBottomBehavior$p.setPeekHeight(view.getHeight());
                    PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_DRAGGING", 0, 4, (Object) null);
                    return;
                }
                C19383o.m32805o("conversionSheetBottomBehavior");
                throw null;
            case 2:
                PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_SETTLING", 0, 4, (Object) null);
                return;
            case 3:
                PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_EXPANDED", 0, 4, (Object) null);
                return;
            case 4:
                PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_COLLAPSED", 0, 4, (Object) null);
                return;
            case 5:
                PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_HIDDEN", 0, 4, (Object) null);
                return;
            case 6:
                PLog.i$default(PYPLConversionRateFragment.TAG, "ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_HALF_EXPANDED", 0, 4, (Object) null);
                return;
            default:
                PLog.i$default(PYPLConversionRateFragment.TAG, C0015b.m88g("ConversionSheetCallBack: ConversionBottomSheetBehavior.STATE_#", i), 0, 4, (Object) null);
                return;
        }
    }
}
