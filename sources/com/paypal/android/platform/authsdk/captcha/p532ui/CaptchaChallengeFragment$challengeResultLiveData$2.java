package com.paypal.android.platform.authsdk.captcha.p532ui;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeFragment$challengeResultLiveData$2 */
public final class CaptchaChallengeFragment$challengeResultLiveData$2 extends Lambda implements C19846a<C2895z<Result>> {
    public final /* synthetic */ CaptchaChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeFragment$challengeResultLiveData$2(CaptchaChallengeFragment captchaChallengeFragment) {
        super(0);
        this.this$0 = captchaChallengeFragment;
    }

    public final C2895z<Result> invoke() {
        CaptchaChallengeFragment captchaChallengeFragment = this.this$0;
        return captchaChallengeFragment.getChallengeResultLiveData(captchaChallengeFragment.getArguments());
    }
}
