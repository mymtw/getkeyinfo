package com.paypal.pyplcheckout.home.view.activities;

import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PYPLHomeActivity$onResume$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ PYPLHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLHomeActivity$onResume$3(PYPLHomeActivity pYPLHomeActivity) {
        super(0);
        this.this$0 = pYPLHomeActivity;
    }

    public final void invoke() {
        ContentRouter.INSTANCE.closeNativeAuthFlow$pyplcheckout_externalThreedsRelease(this.this$0);
    }
}
