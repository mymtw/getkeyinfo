package com.paypal.pyplcheckout.common.instrumentation.amplitude.logger;

import android.content.Context;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository;
import com.paypal.pyplcheckout.network.ConnectivityHandler;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class AmplitudeService_Factory implements C17555d<AmplitudeService> {
    private final C19011a<ConnectivityHandler> connectivityHandlerProvider;
    private final C19011a<Context> contextProvider;
    private final C19011a<DeviceInfo> deviceInfoProvider;
    private final C19011a<AmplitudeRepository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;

    public AmplitudeService_Factory(C19011a<AmplitudeRepository> aVar, C19011a<C19525d0> aVar2, C19011a<Context> aVar3, C19011a<DeviceInfo> aVar4, C19011a<ConnectivityHandler> aVar5) {
        this.repositoryProvider = aVar;
        this.scopeProvider = aVar2;
        this.contextProvider = aVar3;
        this.deviceInfoProvider = aVar4;
        this.connectivityHandlerProvider = aVar5;
    }

    public static AmplitudeService_Factory create(C19011a<AmplitudeRepository> aVar, C19011a<C19525d0> aVar2, C19011a<Context> aVar3, C19011a<DeviceInfo> aVar4, C19011a<ConnectivityHandler> aVar5) {
        return new AmplitudeService_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static AmplitudeService newInstance(AmplitudeRepository amplitudeRepository, C19525d0 d0Var, Context context, DeviceInfo deviceInfo, ConnectivityHandler connectivityHandler) {
        return new AmplitudeService(amplitudeRepository, d0Var, context, deviceInfo, connectivityHandler);
    }

    public AmplitudeService get() {
        return newInstance(this.repositoryProvider.get(), this.scopeProvider.get(), this.contextProvider.get(), this.deviceInfoProvider.get(), this.connectivityHandlerProvider.get());
    }
}
