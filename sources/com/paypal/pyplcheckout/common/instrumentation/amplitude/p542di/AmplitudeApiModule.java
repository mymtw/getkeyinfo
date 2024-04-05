package com.paypal.pyplcheckout.common.instrumentation.amplitude.p542di;

import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao;

/* renamed from: com.paypal.pyplcheckout.common.instrumentation.amplitude.di.AmplitudeApiModule */
public abstract class AmplitudeApiModule {
    public abstract AmplitudeDao provideAmplitudeDao$pyplcheckout_externalThreedsRelease(SharedPrefAmplitudeDao sharedPrefAmplitudeDao);
}
