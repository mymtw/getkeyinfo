package com.paypal.checkout.merchanttoken;

import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p740eq.C19011a;

public final class UpgradeLsatTokenAction_Factory implements C17555d<UpgradeLsatTokenAction> {
    private final C19011a<CoroutineDispatcher> defaultDispatcherProvider;
    private final C19011a<Repository> repositoryProvider;

    public UpgradeLsatTokenAction_Factory(C19011a<Repository> aVar, C19011a<CoroutineDispatcher> aVar2) {
        this.repositoryProvider = aVar;
        this.defaultDispatcherProvider = aVar2;
    }

    public static UpgradeLsatTokenAction_Factory create(C19011a<Repository> aVar, C19011a<CoroutineDispatcher> aVar2) {
        return new UpgradeLsatTokenAction_Factory(aVar, aVar2);
    }

    public static UpgradeLsatTokenAction newInstance(Repository repository, CoroutineDispatcher coroutineDispatcher) {
        return new UpgradeLsatTokenAction(repository, coroutineDispatcher);
    }

    public UpgradeLsatTokenAction get() {
        return newInstance(this.repositoryProvider.get(), this.defaultDispatcherProvider.get());
    }
}
