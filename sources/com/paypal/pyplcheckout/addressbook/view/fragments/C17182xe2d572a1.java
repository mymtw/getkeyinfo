package com.paypal.pyplcheckout.addressbook.view.fragments;

import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment$shippingAddressEventListener$1$2$1 */
public final class C17182xe2d572a1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PYPLNewShippingAddressReviewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17182xe2d572a1(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment) {
        super(0);
        this.this$0 = pYPLNewShippingAddressReviewFragment;
    }

    public final void invoke() {
        PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment = this.this$0;
        pYPLNewShippingAddressReviewFragment.showAlertToast(new AlertToast.ErrorNoIcon((String) null, pYPLNewShippingAddressReviewFragment.getString(C17165R.string.paypal_checkout_add_shipping_address_failure)));
    }
}
