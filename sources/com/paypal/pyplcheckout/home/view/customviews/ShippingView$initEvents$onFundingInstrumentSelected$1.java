package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.utils.ExpandableViewHelper;
import com.paypal.pyplcheckout.utils.ExpandableViewState;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ShippingView$initEvents$onFundingInstrumentSelected$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ShippingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingView$initEvents$onFundingInstrumentSelected$1(ShippingView shippingView) {
        super(0);
        this.this$0 = shippingView;
    }

    public final void invoke() {
        if (this.this$0.getViewModel().shouldShowShipping()) {
            ExpandableViewHelper access$getExpandableViewHelper$p = this.this$0.expandableViewHelper;
            final ShippingView shippingView = this.this$0;
            access$getExpandableViewHelper$p.updateViewExpansionState(shippingView, ExpandableViewState.Expanded, new C19846a<C19394m>() {
                public final void invoke() {
                    ShippingView shippingView = shippingView;
                    shippingView.setClickable(shippingView.getViewModel().allowShippingAddressChange());
                }
            });
            return;
        }
        ExpandableViewHelper access$getExpandableViewHelper$p2 = this.this$0.expandableViewHelper;
        final ShippingView shippingView2 = this.this$0;
        access$getExpandableViewHelper$p2.updateViewExpansionState(shippingView2, ExpandableViewState.Collapsed, new C19846a<C19394m>() {
            public final void invoke() {
                ShippingView shippingView = shippingView2;
                shippingView.setClickable(shippingView.getViewModel().allowShippingAddressChange());
            }
        });
    }
}
