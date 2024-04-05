package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import android.content.Context;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class DeviceInfo_Factory implements C17555d<DeviceInfo> {
    private final C19011a<Context> contextProvider;
    private final C19011a<Repository> repositoryProvider;

    public DeviceInfo_Factory(C19011a<Repository> aVar, C19011a<Context> aVar2) {
        this.repositoryProvider = aVar;
        this.contextProvider = aVar2;
    }

    public static DeviceInfo_Factory create(C19011a<Repository> aVar, C19011a<Context> aVar2) {
        return new DeviceInfo_Factory(aVar, aVar2);
    }

    public static DeviceInfo newInstance(Repository repository, Context context) {
        return new DeviceInfo(repository, context);
    }

    public DeviceInfo get() {
        return newInstance(this.repositoryProvider.get(), this.contextProvider.get());
    }
}
