package com.paypal.android.platform.authsdk.captcha.p532ui;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaChallengeData;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaViewModelFactory */
public final class CaptchaViewModelFactory extends C2870k0.C2874d {
    private final CaptchaChallengeData data;

    public CaptchaViewModelFactory(CaptchaChallengeData captchaChallengeData) {
        C19383o.m32797g(captchaChallengeData, "data");
        this.data = captchaChallengeData;
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        C19383o.m32797g(cls, "modelClass");
        if (cls.isAssignableFrom(CaptchaChallengeViewModel.class)) {
            return new CaptchaChallengeViewModel(this.data);
        }
        throw new IllegalArgumentException();
    }
}
