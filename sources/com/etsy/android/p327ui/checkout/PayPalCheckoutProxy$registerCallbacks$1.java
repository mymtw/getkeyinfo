package com.etsy.android.p327ui.checkout;

import com.etsy.android.p327ui.checkout.PayPalCheckoutViewModel;
import com.paypal.checkout.approve.Approval;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutProxy$registerCallbacks$1 */
final class PayPalCheckoutProxy$registerCallbacks$1 extends Lambda implements C19857l<Approval, C19394m> {
    public final /* synthetic */ C19857l<PayPalCheckoutViewModel.C9433c, C19394m> $onApprove;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutProxy$registerCallbacks$1(C19857l<? super PayPalCheckoutViewModel.C9433c, C19394m> lVar) {
        super(1);
        this.$onApprove = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Approval) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Approval approval) {
        C19383o.m32797g(approval, "approval");
        this.$onApprove.invoke(new PayPalCheckoutViewModel.C9433c(approval.getData().getOrderId()));
    }
}
