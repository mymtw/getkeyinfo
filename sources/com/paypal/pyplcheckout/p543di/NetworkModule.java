package com.paypal.pyplcheckout.p543di;

import com.google.gson.C16708i;
import com.google.gson.C16796j;
import com.paypal.pyplcheckout.data.api.OkHttpClientFactory;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.NetworkObject;
import com.paypal.pyplcheckout.services.api.interceptor.AccessTokenInterceptor;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.C20011u;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule */
public final class NetworkModule {
    public final AccessTokenInterceptor provideAccessTokenInterceptor(AuthRepository authRepository) {
        C19383o.m32797g(authRepository, "authRepository");
        return new AccessTokenInterceptor(authRepository);
    }

    public final NetworkRetryInterceptor provideNetworkRetryInterceptor() {
        return new NetworkRetryInterceptor();
    }

    public final C20009t providesAuthenticatedOkHttpClient(OkHttpClientFactory okHttpClientFactory, AccessTokenInterceptor accessTokenInterceptor) {
        C19383o.m32797g(okHttpClientFactory, "okHttpClientFactory");
        C19383o.m32797g(accessTokenInterceptor, "accessTokenInterceptor");
        C20009t.C20010a createOkHttpClientBuilder = okHttpClientFactory.createOkHttpClientBuilder();
        createOkHttpClientBuilder.mo72993a(accessTokenInterceptor);
        return new C20009t(createOkHttpClientBuilder);
    }

    public final C16708i providesGson() {
        return new C16708i();
    }

    public final C16796j providesGsonBuilder() {
        return new C16796j();
    }

    public final C20009t providesOkHttpClient() {
        return NetworkObject.INSTANCE.getOkHttpClient();
    }

    public final C20009t.C20010a providesOkHttpClientBuilder() {
        return new C20009t.C20010a();
    }

    public final OkHttpClientFactory providesOkHttpClientFactory(C20009t.C20010a aVar, NetworkRetryInterceptor networkRetryInterceptor, DebugConfigManager debugConfigManager) {
        C19383o.m32797g(aVar, "builder");
        C19383o.m32797g(networkRetryInterceptor, "networkRetryInterceptor");
        C19383o.m32797g(debugConfigManager, "debugConfigManager");
        return new OkHttpClientFactory(aVar, networkRetryInterceptor, debugConfigManager);
    }

    public final C20011u.C20012a providesRequestBuilder() {
        return new C20011u.C20012a();
    }
}
