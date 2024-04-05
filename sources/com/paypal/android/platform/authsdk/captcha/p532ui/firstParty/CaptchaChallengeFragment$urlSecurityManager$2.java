package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import android.content.Context;
import com.paypal.android.platform.authsdk.authcommon.utils.BuildConfigUtils;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeFragment$urlSecurityManager$2 */
public final class CaptchaChallengeFragment$urlSecurityManager$2 extends Lambda implements C19846a<UrlSecurityManager> {
    public final /* synthetic */ CaptchaChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeFragment$urlSecurityManager$2(CaptchaChallengeFragment captchaChallengeFragment) {
        super(0);
        this.this$0 = captchaChallengeFragment;
    }

    public final UrlSecurityManager invoke() {
        BuildConfigUtils.Companion companion = BuildConfigUtils.Companion;
        Context applicationContext = this.this$0.requireActivity().getApplicationContext();
        C19383o.m32796f(applicationContext, "requireActivity().applicationContext");
        return new UrlSecurityManager(companion.isAppDebuggable$auth_sdk_thirdPartyRelease(applicationContext));
    }
}
