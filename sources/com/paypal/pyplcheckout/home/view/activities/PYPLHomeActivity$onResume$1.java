package com.paypal.pyplcheckout.home.view.activities;

import com.paypal.pyplcheckout.auth.p541ui.NativeAuthScreen;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PYPLHomeActivity$onResume$1 extends Lambda implements C19857l<NativeAuthScreen, C19394m> {
    public final /* synthetic */ PYPLHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLHomeActivity$onResume$1(PYPLHomeActivity pYPLHomeActivity) {
        super(1);
        this.this$0 = pYPLHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NativeAuthScreen) obj);
        return C19394m.f43287a;
    }

    public final void invoke(NativeAuthScreen nativeAuthScreen) {
        C19383o.m32797g(nativeAuthScreen, "nativeAuthScreen");
        ContentRouter.INSTANCE.loadNativeAuthFragment$pyplcheckout_externalThreedsRelease(this.this$0, nativeAuthScreen);
    }
}
