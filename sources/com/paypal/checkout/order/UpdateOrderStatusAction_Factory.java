package com.paypal.checkout.order;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class UpdateOrderStatusAction_Factory implements C17555d<UpdateOrderStatusAction> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<CoroutineDispatcher> defaultDispatcherProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;
    private final C19011a<UpdateOrderStatusRequestFactory> updateOrderStatusRequestFactoryProvider;
    private final C19011a<UpgradeLsatTokenAction> upgradeLsatTokenActionProvider;

    public UpdateOrderStatusAction_Factory(C19011a<UpdateOrderStatusRequestFactory> aVar, C19011a<UpgradeLsatTokenAction> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<C20009t> aVar4, C19011a<C16708i> aVar5, C19011a<CoroutineDispatcher> aVar6, C19011a<CoroutineDispatcher> aVar7) {
        this.updateOrderStatusRequestFactoryProvider = aVar;
        this.upgradeLsatTokenActionProvider = aVar2;
        this.debugConfigManagerProvider = aVar3;
        this.okHttpClientProvider = aVar4;
        this.gsonProvider = aVar5;
        this.ioDispatcherProvider = aVar6;
        this.defaultDispatcherProvider = aVar7;
    }

    public static UpdateOrderStatusAction_Factory create(C19011a<UpdateOrderStatusRequestFactory> aVar, C19011a<UpgradeLsatTokenAction> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<C20009t> aVar4, C19011a<C16708i> aVar5, C19011a<CoroutineDispatcher> aVar6, C19011a<CoroutineDispatcher> aVar7) {
        return new UpdateOrderStatusAction_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static UpdateOrderStatusAction newInstance(UpdateOrderStatusRequestFactory updateOrderStatusRequestFactory, UpgradeLsatTokenAction upgradeLsatTokenAction, DebugConfigManager debugConfigManager, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        return new UpdateOrderStatusAction(updateOrderStatusRequestFactory, upgradeLsatTokenAction, debugConfigManager, tVar, iVar, coroutineDispatcher, coroutineDispatcher2);
    }

    public UpdateOrderStatusAction get() {
        return newInstance(this.updateOrderStatusRequestFactoryProvider.get(), this.upgradeLsatTokenActionProvider.get(), this.debugConfigManagerProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.ioDispatcherProvider.get(), this.defaultDispatcherProvider.get());
    }
}
