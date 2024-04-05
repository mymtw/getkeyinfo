package com.paypal.pyplcheckout.home.view.fragments;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.model.HomeViewContentPageConfig;
import kotlin.jvm.internal.C19383o;
import p546cp.C17549a;

public final class HomeFragment$homeBottomSheetCallback$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$homeBottomSheetCallback$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onSlide$lambda-0  reason: not valid java name */
    public static final boolean m35416onSlide$lambda0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        view.setOnTouchListener(new C17549a(1));
        String str = HomeFragment.TAG;
        PLog.i$default(str, "HomeSheetCallback slideOffset: " + f, 0, 4, (Object) null);
    }

    @SuppressLint({"SwitchIntDef"})
    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            this.this$0.animatePeekHeight(view.getHeight());
            PLog.i$default(HomeFragment.TAG, "HomeSheetCallback: HomeBottomSheetBehavior.STATE_DRAGGING", 0, 4, (Object) null);
        } else if (i == 2) {
            PLog.i$default(HomeFragment.TAG, "HomeSheetCallback: HomeBottomSheetBehavior.STATE_SETTLING", 0, 4, (Object) null);
        } else if (i == 3) {
            PLog.i$default(HomeFragment.TAG, "HomeSheetCallback: HomeBottomSheetBehavior.STATE_EXPANDED", 0, 4, (Object) null);
        } else if (i == 4) {
            PLog.i$default(HomeFragment.TAG, "HomeSheetCallback: HomeBottomSheetBehavior.STATE_COLLAPSED", 0, 4, (Object) null);
        } else if (i == 5) {
            PLog.i$default(HomeFragment.TAG, "HomeSheetCallback: HomeBottomSheetBehavior.STATE_HIDDEN", 0, 4, (Object) null);
            this.this$0.animatePeekHeight(0);
            HomeViewContentPageConfig access$getMHomeViewContentPageConfig$p = this.this$0.mHomeViewContentPageConfig;
            if (access$getMHomeViewContentPageConfig$p != null) {
                access$getMHomeViewContentPageConfig$p.clearHomeScreenViews();
            } else {
                C19383o.m32805o("mHomeViewContentPageConfig");
                throw null;
            }
        }
    }
}
