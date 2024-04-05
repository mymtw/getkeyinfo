package com.paypal.pyplcheckout.home.view.fragments;

import android.view.View;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

public final class HomeFragment$homeBottomSheetSizeListener$1 implements AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener {
    public final /* synthetic */ HomeFragment this$0;

    public HomeFragment$homeBottomSheetSizeListener$1(HomeFragment homeFragment) {
        this.this$0 = homeFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: onBottomSheetHeightChanged$lambda-0  reason: not valid java name */
    public static final void m35417onBottomSheetHeightChanged$lambda0(HomeFragment homeFragment, int i) {
        C19383o.m32797g(homeFragment, "this$0");
        homeFragment.updateBannerVisibilityOnHeightChange(i);
    }

    public void onBottomSheetHeightChanged(int i, int i2) {
        View view;
        if (i2 != 4 && i2 != 5 && (view = this.this$0.getView()) != null) {
            view.post(new C17255b(this.this$0, i));
        }
    }
}
