package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.CheckoutSection;
import com.etsy.android.p327ui.cart.clicklisteners.C9287l;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CheckoutSectionViewHolder$setUpClickListener$1 */
final class CheckoutSectionViewHolder$setUpClickListener$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CheckoutSection $data;
    public final /* synthetic */ C9392l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutSectionViewHolder$setUpClickListener$1(C9392l lVar, CheckoutSection checkoutSection) {
        super(1);
        this.this$0 = lVar;
        this.$data = checkoutSection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9287l lVar = this.this$0.f20806c;
        CheckoutSection checkoutSection = this.$data;
        lVar.getClass();
        if (checkoutSection.getButtonType().equals("google_pay")) {
            lVar.f20499e.requestGPay(checkoutSection.getGooglePayData());
        } else {
            lVar.f20499e.proceedToCheckout(checkoutSection.getCartGroupId(), checkoutSection.getButtonType());
        }
    }
}
