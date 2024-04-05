package com.etsy.android.p327ui.cart;

import com.etsy.android.R;
import com.etsy.android.p327ui.cart.C9326n;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$reapplyEtsyCoupon$1$3 */
public final class MultiShopCartFragment$reapplyEtsyCoupon$1$3 extends Lambda implements C19857l<C9326n, C19394m> {
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$reapplyEtsyCoupon$1$3(MultiShopCartFragment multiShopCartFragment) {
        super(1);
        this.this$0 = multiShopCartFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9326n) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9326n nVar) {
        if (nVar instanceof C9326n.C9328b) {
            C9326n.C9328b bVar = (C9326n.C9328b) nVar;
            if (bVar.f20599a.getInputError() != null) {
                MultiShopCartFragment multiShopCartFragment = this.this$0;
                String inputError = bVar.f20599a.getInputError();
                C19383o.m32794d(inputError);
                multiShopCartFragment.showWarningAlert(inputError);
            } else if (bVar.f20599a.getCartAlert() != null) {
                this.this$0.showCartAlert(bVar.f20599a.getCartAlert());
            }
        } else if (nVar instanceof C9326n.C9327a) {
            MultiShopCartFragment multiShopCartFragment2 = this.this$0;
            String str = ((C9326n.C9327a) nVar).f20598b;
            if (str == null) {
                str = multiShopCartFragment2.getString(R.string.network_unavailable);
                C19383o.m32796f(str, "getString(R.string.network_unavailable)");
            }
            multiShopCartFragment2.showWarningAlert(str);
        }
        this.this$0.refreshAfterEtsyCouponApply();
    }
}
