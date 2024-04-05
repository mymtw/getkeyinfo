package com.paypal.pyplcheckout.data.api;

import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;

public final class OkHttpClientFactory {
    private final C20009t.C20010a builder;
    private final DebugConfigManager debugConfigManager;
    private final NetworkRetryInterceptor networkRetryInterceptor;

    public OkHttpClientFactory(C20009t.C20010a aVar, NetworkRetryInterceptor networkRetryInterceptor2, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(aVar, "builder");
        C19383o.m32797g(networkRetryInterceptor2, "networkRetryInterceptor");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.builder = aVar;
        this.networkRetryInterceptor = networkRetryInterceptor2;
        this.debugConfigManager = debugConfigManager2;
    }

    public final C20009t.C20010a createOkHttpClientBuilder() {
        C20009t.C20010a aVar = this.builder;
        aVar.mo72993a(this.networkRetryInterceptor);
        if (C19383o.m32792b(this.debugConfigManager.getCheckoutEnvironment().getEnvironment(), RunTimeEnvironment.STAGE.toString())) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.mo72994b(60, timeUnit);
            aVar.mo72995c(60, timeUnit);
        }
        return aVar;
    }
}
