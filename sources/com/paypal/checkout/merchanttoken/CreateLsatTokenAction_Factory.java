package com.paypal.checkout.merchanttoken;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class CreateLsatTokenAction_Factory implements C17555d<CreateLsatTokenAction> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<LsatTokenRequestFactory> lsatTokenRequestFactoryProvider;
    private final C19011a<C20009t> okHttpClientProvider;

    public CreateLsatTokenAction_Factory(C19011a<DebugConfigManager> aVar, C19011a<LsatTokenRequestFactory> aVar2, C19011a<C20009t> aVar3, C19011a<CoroutineDispatcher> aVar4) {
        this.debugConfigManagerProvider = aVar;
        this.lsatTokenRequestFactoryProvider = aVar2;
        this.okHttpClientProvider = aVar3;
        this.ioDispatcherProvider = aVar4;
    }

    public static CreateLsatTokenAction_Factory create(C19011a<DebugConfigManager> aVar, C19011a<LsatTokenRequestFactory> aVar2, C19011a<C20009t> aVar3, C19011a<CoroutineDispatcher> aVar4) {
        return new CreateLsatTokenAction_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static CreateLsatTokenAction newInstance(DebugConfigManager debugConfigManager, LsatTokenRequestFactory lsatTokenRequestFactory, C20009t tVar, CoroutineDispatcher coroutineDispatcher) {
        return new CreateLsatTokenAction(debugConfigManager, lsatTokenRequestFactory, tVar, coroutineDispatcher);
    }

    public CreateLsatTokenAction get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.lsatTokenRequestFactoryProvider.get(), this.okHttpClientProvider.get(), this.ioDispatcherProvider.get());
    }
}
