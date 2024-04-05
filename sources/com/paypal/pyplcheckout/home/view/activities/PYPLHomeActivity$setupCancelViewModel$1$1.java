package com.paypal.pyplcheckout.home.view.activities;

import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PYPLHomeActivity$setupCancelViewModel$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ CancelViewModel.State $cancelState;
    public final /* synthetic */ PYPLHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLHomeActivity$setupCancelViewModel$1$1(PYPLHomeActivity pYPLHomeActivity, CancelViewModel.State state) {
        super(0);
        this.this$0 = pYPLHomeActivity;
        this.$cancelState = state;
    }

    public final void invoke() {
        this.this$0.closeSDK(((CancelViewModel.State.ShowCancelDialog) this.$cancelState).getFromClass(), ((CancelViewModel.State.ShowCancelDialog) this.$cancelState).getFromMessage());
    }
}
