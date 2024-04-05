package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class BillingAgreementsSetBalancePrefUseCase_Factory implements C17555d<BillingAgreementsSetBalancePrefUseCase> {
    private final C19011a<BillingAgreementsRepository> repositoryProvider;

    public BillingAgreementsSetBalancePrefUseCase_Factory(C19011a<BillingAgreementsRepository> aVar) {
        this.repositoryProvider = aVar;
    }

    public static BillingAgreementsSetBalancePrefUseCase_Factory create(C19011a<BillingAgreementsRepository> aVar) {
        return new BillingAgreementsSetBalancePrefUseCase_Factory(aVar);
    }

    public static BillingAgreementsSetBalancePrefUseCase newInstance(BillingAgreementsRepository billingAgreementsRepository) {
        return new BillingAgreementsSetBalancePrefUseCase(billingAgreementsRepository);
    }

    public BillingAgreementsSetBalancePrefUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
