package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import android.view.View;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class AvailablePpBalanceView$secondaryBalanceAnimator$2 extends Lambda implements C19846a<View> {
    public final /* synthetic */ AvailablePpBalanceView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailablePpBalanceView$secondaryBalanceAnimator$2(AvailablePpBalanceView availablePpBalanceView) {
        super(0);
        this.this$0 = availablePpBalanceView;
    }

    public final View invoke() {
        View access$getSecondarySplitBalanceContainer$p = this.this$0.secondarySplitBalanceContainer;
        if (access$getSecondarySplitBalanceContainer$p != null) {
            return access$getSecondarySplitBalanceContainer$p;
        }
        C19383o.m32805o("secondarySplitBalanceContainer");
        throw null;
    }
}
