package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment$setUpTextInput$1$2 */
public final class ApplyCouponBottomSheetFragment$setUpTextInput$1$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ ApplyCouponBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplyCouponBottomSheetFragment$setUpTextInput$1$2(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment) {
        super(1);
        this.this$0 = applyCouponBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "it");
        C9260e viewModel = this.this$0.getViewModel();
        viewModel.getClass();
        viewModel.f20460m = C19459m.m33035H1(str).toString();
        viewModel.f20454g.setValue(null);
    }
}
