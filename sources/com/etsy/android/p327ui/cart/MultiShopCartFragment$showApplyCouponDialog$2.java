package com.etsy.android.p327ui.cart;

import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.p327ui.view.AlertData;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p356ge.C12790b;
import p370ie.C12948h;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$showApplyCouponDialog$2 */
public final class MultiShopCartFragment$showApplyCouponDialog$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$showApplyCouponDialog$2(MultiShopCartFragment multiShopCartFragment) {
        super(1);
        this.this$0 = multiShopCartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        String str2 = str;
        C19383o.m32797g(str2, "couponCode");
        String d = C12790b.m20432d(this.this$0);
        EtsyAction etsyAction = EtsyAction.APPLY_COUPON;
        Bundle bundle = new Bundle();
        MultiShopCartFragment multiShopCartFragment = this.this$0;
        bundle.putString("coupon_code", str2);
        String string = multiShopCartFragment.getString(R.string.sign_in_or_create_account);
        C19383o.m32796f(string, "getString(R.string.sign_in_or_create_account)");
        bundle.putParcelable(SignInActivity.EXTRA_STICKY_ALERT_DATA, new AlertData(R.drawable.clg_icon_core_tag_fill_v1, string, (String) null, (Integer) null, CollageAlert.AlertType.SUCCESS, 3000, (C19857l) null, 76, (DefaultConstructorMarker) null));
        C19394m mVar = C19394m.f43287a;
        this.this$0.signInForCouponApplyResult.mo1157b(new C12948h(d, etsyAction, bundle, (String) null, (String) null, (String) null, 56));
    }
}
