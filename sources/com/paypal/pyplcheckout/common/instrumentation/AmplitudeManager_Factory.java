package com.paypal.pyplcheckout.common.instrumentation;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeService;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AmplitudeManager_Factory implements C17555d<AmplitudeManager> {
    private final C19011a<AmplitudeSdk> amplitudeSdkProvider;
    private final C19011a<AmplitudeService> amplitudeServiceProvider;
    private final C19011a<FeatureFlagManager> featureFlagManagerProvider;

    public AmplitudeManager_Factory(C19011a<AmplitudeSdk> aVar, C19011a<AmplitudeService> aVar2, C19011a<FeatureFlagManager> aVar3) {
        this.amplitudeSdkProvider = aVar;
        this.amplitudeServiceProvider = aVar2;
        this.featureFlagManagerProvider = aVar3;
    }

    public static AmplitudeManager_Factory create(C19011a<AmplitudeSdk> aVar, C19011a<AmplitudeService> aVar2, C19011a<FeatureFlagManager> aVar3) {
        return new AmplitudeManager_Factory(aVar, aVar2, aVar3);
    }

    public static AmplitudeManager newInstance(AmplitudeSdk amplitudeSdk, AmplitudeService amplitudeService, FeatureFlagManager featureFlagManager) {
        return new AmplitudeManager(amplitudeSdk, amplitudeService, featureFlagManager);
    }

    public AmplitudeManager get() {
        return newInstance(this.amplitudeSdkProvider.get(), this.amplitudeServiceProvider.get(), this.featureFlagManagerProvider.get());
    }
}
