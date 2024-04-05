package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ShippingView$viewExpandTransitionDuration$2 extends Lambda implements C19846a<Long> {
    public final /* synthetic */ ShippingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingView$viewExpandTransitionDuration$2(ShippingView shippingView) {
        super(0);
        this.this$0 = shippingView;
    }

    public final Long invoke() {
        return Long.valueOf(AnimationUtils.INSTANCE.computeAnimationDurationFromHeight(this.this$0, 3));
    }
}
