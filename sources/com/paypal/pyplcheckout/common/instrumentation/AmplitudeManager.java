package com.paypal.pyplcheckout.common.instrumentation;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeLogger;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeService;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import kotlin.jvm.internal.C19383o;

public final class AmplitudeManager {
    private final AmplitudeSdk amplitudeSdk;
    private final AmplitudeService amplitudeService;
    private final FeatureFlagManager featureFlagManager;

    public AmplitudeManager(AmplitudeSdk amplitudeSdk2, AmplitudeService amplitudeService2, FeatureFlagManager featureFlagManager2) {
        C19383o.m32797g(amplitudeSdk2, "amplitudeSdk");
        C19383o.m32797g(amplitudeService2, "amplitudeService");
        C19383o.m32797g(featureFlagManager2, "featureFlagManager");
        this.amplitudeSdk = amplitudeSdk2;
        this.amplitudeService = amplitudeService2;
        this.featureFlagManager = featureFlagManager2;
    }

    private final boolean isAmplitudeRestApiEnabled() {
        return FeatureFlagManager.isEnabled$default(Feature.AMPLITUDE_REST_API, false, 2, (Object) null).isEnabled();
    }

    public final AmplitudeLogger getLogger() {
        return isAmplitudeRestApiEnabled() ? this.amplitudeService : this.amplitudeSdk;
    }

    public final void uploadFailedEvents() {
        if (isAmplitudeRestApiEnabled()) {
            this.amplitudeService.uploadFailedEvents();
        }
    }
}
