package com.paypal.android.platform.authsdk.stepup.p535ui;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeParam;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpViewModelFactory */
public final class StepUpViewModelFactory extends C2870k0.C2874d {
    private final StepUpChallengeParam data;

    public StepUpViewModelFactory(StepUpChallengeParam stepUpChallengeParam) {
        C19383o.m32797g(stepUpChallengeParam, "data");
        this.data = stepUpChallengeParam;
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        C19383o.m32797g(cls, "modelClass");
        if (cls.isAssignableFrom(StepUpChallengeViewModel.class)) {
            return new StepUpChallengeViewModel(this.data);
        }
        throw new IllegalArgumentException();
    }
}
