package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeFragment$challenge$2 */
public final class CaptchaChallengeFragment$challenge$2 extends Lambda implements C19846a<CaptchaChallenge> {
    public final /* synthetic */ CaptchaChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeFragment$challenge$2(CaptchaChallengeFragment captchaChallengeFragment) {
        super(0);
        this.this$0 = captchaChallengeFragment;
    }

    public final CaptchaChallenge invoke() {
        CaptchaChallengeFragment captchaChallengeFragment = this.this$0;
        return captchaChallengeFragment.getCaptchaChallengeData(captchaChallengeFragment.getArguments());
    }
}
