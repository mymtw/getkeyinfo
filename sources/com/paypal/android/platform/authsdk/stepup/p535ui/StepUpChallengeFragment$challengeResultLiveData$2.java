package com.paypal.android.platform.authsdk.stepup.p535ui;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment$challengeResultLiveData$2 */
public final class StepUpChallengeFragment$challengeResultLiveData$2 extends Lambda implements C19846a<C2895z<Result>> {
    public final /* synthetic */ StepUpChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepUpChallengeFragment$challengeResultLiveData$2(StepUpChallengeFragment stepUpChallengeFragment) {
        super(0);
        this.this$0 = stepUpChallengeFragment;
    }

    public final C2895z<Result> invoke() {
        StepUpChallengeFragment stepUpChallengeFragment = this.this$0;
        return stepUpChallengeFragment.getChallengeResultLiveData(stepUpChallengeFragment.getArguments());
    }
}
