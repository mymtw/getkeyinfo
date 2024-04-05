package com.paypal.pyplcheckout.home.view.activities;

import androidx.fragment.app.Fragment;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class PYPLHomeActivity$onResume$2 extends Lambda implements C19861p<Fragment, Boolean, C19394m> {
    public final /* synthetic */ PYPLHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLHomeActivity$onResume$2(PYPLHomeActivity pYPLHomeActivity) {
        super(2);
        this.this$0 = pYPLHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Fragment) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        ContentRouter.INSTANCE.dismissNativeAuthFragment$pyplcheckout_externalThreedsRelease(this.this$0, fragment, z);
    }
}
