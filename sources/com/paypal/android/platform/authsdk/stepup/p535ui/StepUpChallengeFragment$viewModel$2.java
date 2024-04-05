package com.paypal.android.platform.authsdk.stepup.p535ui;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment$viewModel$2 */
public final class StepUpChallengeFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ StepUpChallengeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepUpChallengeFragment$viewModel$2(StepUpChallengeFragment stepUpChallengeFragment) {
        super(0);
        this.this$0 = stepUpChallengeFragment;
    }

    public final C2870k0.C2872b invoke() {
        StepUpChallengeFragment stepUpChallengeFragment = this.this$0;
        return new StepUpViewModelFactory(stepUpChallengeFragment.getChallengeData(stepUpChallengeFragment.getArguments()));
    }
}
