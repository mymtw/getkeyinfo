package com.paypal.android.platform.authsdk.captcha.p532ui;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.captcha.analytics.ICaptchaTracker;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeHandler$getCaptchaChallengeFragment$bundle$1$1 */
public final class CaptchaChallengeHandler$getCaptchaChallengeFragment$bundle$1$1 implements ICaptchaTracker {
    public final /* synthetic */ CaptchaChallengeHandler this$0;

    public CaptchaChallengeHandler$getCaptchaChallengeFragment$bundle$1$1(CaptchaChallengeHandler captchaChallengeHandler) {
        this.this$0 = captchaChallengeHandler;
    }

    public void onTrack(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "trackingEvent");
        if (this.this$0.tracker != null) {
            this.this$0.tracker.onTrackEvent(trackingEvent);
        }
    }
}
