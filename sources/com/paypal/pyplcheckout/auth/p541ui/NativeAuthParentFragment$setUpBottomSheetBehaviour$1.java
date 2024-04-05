package com.paypal.pyplcheckout.auth.p541ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment$setUpBottomSheetBehaviour$1 */
public final class NativeAuthParentFragment$setUpBottomSheetBehaviour$1 extends BottomSheetBehavior.C15221f {
    public final /* synthetic */ NativeAuthParentFragment this$0;

    public NativeAuthParentFragment$setUpBottomSheetBehaviour$1(NativeAuthParentFragment nativeAuthParentFragment) {
        this.this$0 = nativeAuthParentFragment;
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
