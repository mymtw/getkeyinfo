package com.paypal.android.platform.authsdk.captcha.p532ui;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeFragment$viewModel$2 */
public final class CaptchaChallengeFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ CaptchaChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeFragment$viewModel$2(CaptchaChallengeFragment captchaChallengeFragment) {
        super(0);
        this.this$0 = captchaChallengeFragment;
    }

    public final C2870k0.C2872b invoke() {
        CaptchaChallengeFragment captchaChallengeFragment = this.this$0;
        return new CaptchaViewModelFactory(captchaChallengeFragment.getCaptchaChallengeData(captchaChallengeFragment.getArguments()));
    }
}
