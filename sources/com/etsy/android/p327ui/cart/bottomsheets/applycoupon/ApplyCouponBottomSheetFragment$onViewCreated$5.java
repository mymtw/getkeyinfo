package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import com.etsy.android.lib.models.apiv3.cart.CartPage;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment$onViewCreated$5 */
public final class ApplyCouponBottomSheetFragment$onViewCreated$5 extends Lambda implements C19857l<CartPage, C19394m> {
    public final /* synthetic */ ApplyCouponBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplyCouponBottomSheetFragment$onViewCreated$5(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment) {
        super(1);
        this.this$0 = applyCouponBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CartPage) obj);
        return C19394m.f43287a;
    }

    public final void invoke(CartPage cartPage) {
        C19383o.m32797g(cartPage, "it");
        C19857l access$getCouponAppliedListener$p = this.this$0.couponAppliedListener;
        if (access$getCouponAppliedListener$p != null) {
            C19394m mVar = (C19394m) access$getCouponAppliedListener$p.invoke(cartPage);
        }
        this.this$0.dismiss();
    }
}
