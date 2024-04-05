package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

public final class PYPLAddressRecommendationFragment$setUpBottomSheetBehaviour$2 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ PYPLAddressRecommendationFragment this$0;

    public PYPLAddressRecommendationFragment$setUpBottomSheetBehaviour$2(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment) {
        this.this$0 = pYPLAddressRecommendationFragment;
    }

    public void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
    }

    public void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 1) {
            BottomSheetBehavior access$getBottomSheetBehavior$p = this.this$0.bottomSheetBehavior;
            if (access$getBottomSheetBehavior$p != null) {
                access$getBottomSheetBehavior$p.setState(3);
            } else {
                C19383o.m32805o("bottomSheetBehavior");
                throw null;
            }
        }
    }
}
