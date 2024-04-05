package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.C20009t;
import p753kq.C19846a;

public final class NetworkObject$okHttpClient$2 extends Lambda implements C19846a<C20009t> {
    public static final NetworkObject$okHttpClient$2 INSTANCE = new NetworkObject$okHttpClient$2();

    public NetworkObject$okHttpClient$2() {
        super(0);
    }

    public final C20009t invoke() {
        C20009t.C20010a aVar = new C20009t.C20010a();
        aVar.mo72993a(new NetworkRetryInterceptor());
        if (C19383o.m32792b(DebugConfigManager.getInstance().getCheckoutEnvironment().getEnvironment(), RunTimeEnvironment.STAGE.toString())) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.mo72994b(60, timeUnit);
            aVar.mo72995c(60, timeUnit);
        }
        return new C20009t(aVar);
    }
}
