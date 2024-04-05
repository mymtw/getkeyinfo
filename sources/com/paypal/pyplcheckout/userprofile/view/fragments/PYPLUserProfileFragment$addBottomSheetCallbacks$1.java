package com.paypal.pyplcheckout.userprofile.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p601jp.C18044a;

public final class PYPLUserProfileFragment$addBottomSheetCallbacks$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLUserProfileFragment this$0;

    public PYPLUserProfileFragment$addBottomSheetCallbacks$1(PYPLUserProfileFragment pYPLUserProfileFragment) {
        this.this$0 = pYPLUserProfileFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35457onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C18044a());
        String str = PYPLUserProfileFragment.TAG;
        PLog.i$default(str, "ProfileSheetCallBack slideOffset: " + f, 0, 4, (Object) null);
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        switch (i) {
            case 1:
                BottomSheetBehavior access$getProfileSheetBottomBehavior$p = this.this$0.profileSheetBottomBehavior;
                if (access$getProfileSheetBottomBehavior$p != null) {
                    access$getProfileSheetBottomBehavior$p.setPeekHeight(view.getHeight());
                    PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_DRAGGING", 0, 4, (Object) null);
                    return;
                }
                C19383o.m32805o("profileSheetBottomBehavior");
                throw null;
            case 2:
                PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_SETTLING", 0, 4, (Object) null);
                return;
            case 3:
                PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_EXPANDED", 0, 4, (Object) null);
                return;
            case 4:
                PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_COLLAPSED", 0, 4, (Object) null);
                return;
            case 5:
                PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_HIDDEN", 0, 4, (Object) null);
                return;
            case 6:
                PLog.i$default(PYPLUserProfileFragment.TAG, "ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_HALF_EXPANDED", 0, 4, (Object) null);
                return;
            default:
                PLog.i$default(PYPLUserProfileFragment.TAG, C0015b.m88g("ProfileSheetCallBack: ProfileBottomSheetBehavior.STATE_#", i), 0, 4, (Object) null);
                return;
        }
    }
}
