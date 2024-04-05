package com.etsy.android.push.onboarding;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PushOptInOnboardingDialogFragment$onCreateView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ PushOptInOnboardingDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushOptInOnboardingDialogFragment$onCreateView$1(PushOptInOnboardingDialogFragment pushOptInOnboardingDialogFragment) {
        super(1);
        this.this$0 = pushOptInOnboardingDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.requestNotificationPermission();
    }
}
