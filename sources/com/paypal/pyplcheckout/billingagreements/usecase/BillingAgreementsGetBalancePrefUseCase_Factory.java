package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class BillingAgreementsGetBalancePrefUseCase_Factory implements C17555d<BillingAgreementsGetBalancePrefUseCase> {
    private final C19011a<BillingAgreementsRepository> billingAgreementsRepositoryProvider;
    private final C19011a<BillingAgreementsGetTypeUseCase> getTypeUseCaseProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;

    public BillingAgreementsGetBalancePrefUseCase_Factory(C19011a<C19525d0> aVar, C19011a<BillingAgreementsRepository> aVar2, C19011a<Repository> aVar3, C19011a<BillingAgreementsGetTypeUseCase> aVar4) {
        this.scopeProvider = aVar;
        this.billingAgreementsRepositoryProvider = aVar2;
        this.repositoryProvider = aVar3;
        this.getTypeUseCaseProvider = aVar4;
    }

    public static BillingAgreementsGetBalancePrefUseCase_Factory create(C19011a<C19525d0> aVar, C19011a<BillingAgreementsRepository> aVar2, C19011a<Repository> aVar3, C19011a<BillingAgreementsGetTypeUseCase> aVar4) {
        return new BillingAgreementsGetBalancePrefUseCase_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static BillingAgreementsGetBalancePrefUseCase newInstance(C19525d0 d0Var, BillingAgreementsRepository billingAgreementsRepository, Repository repository, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase) {
        return new BillingAgreementsGetBalancePrefUseCase(d0Var, billingAgreementsRepository, repository, billingAgreementsGetTypeUseCase);
    }

    public BillingAgreementsGetBalancePrefUseCase get() {
        return newInstance(this.scopeProvider.get(), this.billingAgreementsRepositoryProvider.get(), this.repositoryProvider.get(), this.getTypeUseCaseProvider.get());
    }
}
