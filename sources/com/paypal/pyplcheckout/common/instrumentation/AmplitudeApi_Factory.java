package com.paypal.pyplcheckout.common.instrumentation;

import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import dagger.internal.C17555d;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class AmplitudeApi_Factory implements C17555d<AmplitudeApi> {
    private final C19011a<AmplitudeUtils> amplitudeUtilsProvider;
    private final C19011a<DeviceInfo> deviceInfoProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<C20009t> okHttpClientProvider;

    public AmplitudeApi_Factory(C19011a<AmplitudeUtils> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<DeviceInfo> aVar4) {
        this.amplitudeUtilsProvider = aVar;
        this.okHttpClientProvider = aVar2;
        this.gsonProvider = aVar3;
        this.deviceInfoProvider = aVar4;
    }

    public static AmplitudeApi_Factory create(C19011a<AmplitudeUtils> aVar, C19011a<C20009t> aVar2, C19011a<C16708i> aVar3, C19011a<DeviceInfo> aVar4) {
        return new AmplitudeApi_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static AmplitudeApi newInstance(AmplitudeUtils amplitudeUtils, C20009t tVar, C16708i iVar, DeviceInfo deviceInfo) {
        return new AmplitudeApi(amplitudeUtils, tVar, iVar, deviceInfo);
    }

    public AmplitudeApi get() {
        return newInstance(this.amplitudeUtilsProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.deviceInfoProvider.get());
    }
}
