package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import kotlin.jvm.internal.C19383o;

public final class BillingAgreementsSetBalancePrefUseCase {
    private final BillingAgreementsRepository repository;

    public BillingAgreementsSetBalancePrefUseCase(BillingAgreementsRepository billingAgreementsRepository) {
        C19383o.m32797g(billingAgreementsRepository, "repository");
        this.repository = billingAgreementsRepository;
    }

    public final void invoke(boolean z) {
        this.repository.setAlwaysUseBalancePreference(z);
    }
}
