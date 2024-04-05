package com.paypal.checkout.order.billingagreements;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class ExecuteBillingAgreementActionImpl_Factory implements C17555d<ExecuteBillingAgreementActionImpl> {
    private final C19011a<BillingAgreementsRepository> billingAgreementsRepositoryProvider;
    private final C19011a<CreateLsatTokenAction> createLsatTokenActionProvider;
    private final C19011a<ExecuteBillingAgreementRequestFactory> executeBillingAgreementRequestFactoryProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;
    private final C19011a<Repository> repositoryProvider;

    public ExecuteBillingAgreementActionImpl_Factory(C19011a<BillingAgreementsRepository> aVar, C19011a<CreateLsatTokenAction> aVar2, C19011a<ExecuteBillingAgreementRequestFactory> aVar3, C19011a<Repository> aVar4, C19011a<C20009t> aVar5, C19011a<C16708i> aVar6, C19011a<CoroutineDispatcher> aVar7) {
        this.billingAgreementsRepositoryProvider = aVar;
        this.createLsatTokenActionProvider = aVar2;
        this.executeBillingAgreementRequestFactoryProvider = aVar3;
        this.repositoryProvider = aVar4;
        this.okHttpClientProvider = aVar5;
        this.gsonProvider = aVar6;
        this.ioDispatcherProvider = aVar7;
    }

    public static ExecuteBillingAgreementActionImpl_Factory create(C19011a<BillingAgreementsRepository> aVar, C19011a<CreateLsatTokenAction> aVar2, C19011a<ExecuteBillingAgreementRequestFactory> aVar3, C19011a<Repository> aVar4, C19011a<C20009t> aVar5, C19011a<C16708i> aVar6, C19011a<CoroutineDispatcher> aVar7) {
        return new ExecuteBillingAgreementActionImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ExecuteBillingAgreementActionImpl newInstance(BillingAgreementsRepository billingAgreementsRepository, CreateLsatTokenAction createLsatTokenAction, ExecuteBillingAgreementRequestFactory executeBillingAgreementRequestFactory, Repository repository, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        return new ExecuteBillingAgreementActionImpl(billingAgreementsRepository, createLsatTokenAction, executeBillingAgreementRequestFactory, repository, tVar, iVar, coroutineDispatcher);
    }

    public ExecuteBillingAgreementActionImpl get() {
        return newInstance(this.billingAgreementsRepositoryProvider.get(), this.createLsatTokenActionProvider.get(), this.executeBillingAgreementRequestFactoryProvider.get(), this.repositoryProvider.get(), this.okHttpClientProvider.get(), this.gsonProvider.get(), this.ioDispatcherProvider.get());
    }
}
