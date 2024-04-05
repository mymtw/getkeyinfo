package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class BillingAgreementsCacheTypeUseCase_Factory implements C17555d<BillingAgreementsCacheTypeUseCase> {
    private final C19011a<BillingAgreementsRepository> billingAgreementsRepositoryProvider;

    public BillingAgreementsCacheTypeUseCase_Factory(C19011a<BillingAgreementsRepository> aVar) {
        this.billingAgreementsRepositoryProvider = aVar;
    }

    public static BillingAgreementsCacheTypeUseCase_Factory create(C19011a<BillingAgreementsRepository> aVar) {
        return new BillingAgreementsCacheTypeUseCase_Factory(aVar);
    }

    public static BillingAgreementsCacheTypeUseCase newInstance(BillingAgreementsRepository billingAgreementsRepository) {
        return new BillingAgreementsCacheTypeUseCase(billingAgreementsRepository);
    }

    public BillingAgreementsCacheTypeUseCase get() {
        return newInstance(this.billingAgreementsRepositoryProvider.get());
    }
}
