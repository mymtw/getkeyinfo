package com.paypal.android.platform.authsdk.stepup.p535ui;

import android.content.Context;
import com.paypal.android.platform.authsdk.authcommon.utils.BuildConfigUtils;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment$urlSecurityManager$2 */
public final class StepUpChallengeFragment$urlSecurityManager$2 extends Lambda implements C19846a<UrlSecurityManager> {
    public final /* synthetic */ StepUpChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepUpChallengeFragment$urlSecurityManager$2(StepUpChallengeFragment stepUpChallengeFragment) {
        super(0);
        this.this$0 = stepUpChallengeFragment;
    }

    public final UrlSecurityManager invoke() {
        BuildConfigUtils.Companion companion = BuildConfigUtils.Companion;
        Context applicationContext = this.this$0.requireActivity().getApplicationContext();
        C19383o.m32796f(applicationContext, "requireActivity().applicationContext");
        return new UrlSecurityManager(companion.isAppDebuggable$auth_sdk_thirdPartyRelease(applicationContext));
    }
}
