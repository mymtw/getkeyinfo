package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CartViewModel_Factory implements C17555d<CartViewModel> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<BillingAgreementsGetTypeUseCase> getBillingAgreementUseCaseProvider;
    private final C19011a<Repository> repositoryProvider;

    public CartViewModel_Factory(C19011a<Repository> aVar, C19011a<BillingAgreementsGetTypeUseCase> aVar2, C19011a<AbManager> aVar3, C19011a<DebugConfigManager> aVar4) {
        this.repositoryProvider = aVar;
        this.getBillingAgreementUseCaseProvider = aVar2;
        this.abManagerProvider = aVar3;
        this.debugConfigManagerProvider = aVar4;
    }

    public static CartViewModel_Factory create(C19011a<Repository> aVar, C19011a<BillingAgreementsGetTypeUseCase> aVar2, C19011a<AbManager> aVar3, C19011a<DebugConfigManager> aVar4) {
        return new CartViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static CartViewModel newInstance(Repository repository, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase, AbManager abManager, DebugConfigManager debugConfigManager) {
        return new CartViewModel(repository, billingAgreementsGetTypeUseCase, abManager, debugConfigManager);
    }

    public CartViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.getBillingAgreementUseCaseProvider.get(), this.abManagerProvider.get(), this.debugConfigManagerProvider.get());
    }
}
