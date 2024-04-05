package com.paypal.pyplcheckout.common.instrumentation.amplitude.repository;

import com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AmplitudeRepository_Factory implements C17555d<AmplitudeRepository> {
    private final C19011a<AmplitudeApi> apiProvider;
    private final C19011a<AmplitudeDao> daoProvider;

    public AmplitudeRepository_Factory(C19011a<AmplitudeDao> aVar, C19011a<AmplitudeApi> aVar2) {
        this.daoProvider = aVar;
        this.apiProvider = aVar2;
    }

    public static AmplitudeRepository_Factory create(C19011a<AmplitudeDao> aVar, C19011a<AmplitudeApi> aVar2) {
        return new AmplitudeRepository_Factory(aVar, aVar2);
    }

    public static AmplitudeRepository newInstance(AmplitudeDao amplitudeDao, AmplitudeApi amplitudeApi) {
        return new AmplitudeRepository(amplitudeDao, amplitudeApi);
    }

    public AmplitudeRepository get() {
        return newInstance(this.daoProvider.get(), this.apiProvider.get());
    }
}
