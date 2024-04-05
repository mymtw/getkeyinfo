package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import androidx.core.view.C2273a;
import com.paypal.pyplcheckout.C17165R;
import p088e1.C6689b;

public final class ShippingView$updateMainShippingAddress$1 extends C2273a {
    public final /* synthetic */ ShippingView this$0;

    public ShippingView$updateMainShippingAddress$1(ShippingView shippingView) {
        this.this$0 = shippingView;
    }

    public void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        if (bVar != null) {
            bVar.mo18851b(new C6689b.C6690a(16, (CharSequence) this.this$0.getContext().getString(C17165R.string.paypal_checkout_edit_shipping_address)));
        }
    }
}
