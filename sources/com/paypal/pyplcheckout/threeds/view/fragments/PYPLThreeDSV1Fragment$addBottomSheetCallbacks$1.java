package com.paypal.pyplcheckout.threeds.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;
import p586hp.C17839a;

public final class PYPLThreeDSV1Fragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLThreeDSV1Fragment this$0;

    public PYPLThreeDSV1Fragment$addBottomSheetCallbacks$1(PYPLThreeDSV1Fragment pYPLThreeDSV1Fragment) {
        this.this$0 = pYPLThreeDSV1Fragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35447onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17839a());
    }

    @SuppressLint({"SwitchIntDef"})
    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getThreeDSSheetBottomBehavior$p = this.this$0.threeDSSheetBottomBehavior;
            if (access$getThreeDSSheetBottomBehavior$p != null) {
                access$getThreeDSSheetBottomBehavior$p.setPeekHeight(view.getHeight());
            } else {
                C19383o.m32805o("threeDSSheetBottomBehavior");
                throw null;
            }
        }
    }
}
