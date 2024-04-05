package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class BillingAgreementsGetTypeUseCase_Factory implements C17555d<BillingAgreementsGetTypeUseCase> {
    private final C19011a<BillingAgreementsRepository> repositoryProvider;

    public BillingAgreementsGetTypeUseCase_Factory(C19011a<BillingAgreementsRepository> aVar) {
        this.repositoryProvider = aVar;
    }

    public static BillingAgreementsGetTypeUseCase_Factory create(C19011a<BillingAgreementsRepository> aVar) {
        return new BillingAgreementsGetTypeUseCase_Factory(aVar);
    }

    public static BillingAgreementsGetTypeUseCase newInstance(BillingAgreementsRepository billingAgreementsRepository) {
        return new BillingAgreementsGetTypeUseCase(billingAgreementsRepository);
    }

    public BillingAgreementsGetTypeUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
