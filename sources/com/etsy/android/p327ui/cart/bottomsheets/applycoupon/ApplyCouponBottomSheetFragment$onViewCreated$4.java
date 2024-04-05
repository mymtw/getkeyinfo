package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p377jf.C12979a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment$onViewCreated$4 */
public final class ApplyCouponBottomSheetFragment$onViewCreated$4 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ ApplyCouponBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplyCouponBottomSheetFragment$onViewCreated$4(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment) {
        super(1);
        this.this$0 = applyCouponBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.f28588b.setTitleText(this.this$0.getString(i));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45786f();
    }
}
