package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.C19689x1;

public final class BillingAgreementsGetTypeUseCase {
    private final BillingAgreementsRepository repository;

    public BillingAgreementsGetTypeUseCase(BillingAgreementsRepository billingAgreementsRepository) {
        C19383o.m32797g(billingAgreementsRepository, "repository");
        this.repository = billingAgreementsRepository;
    }

    public final C19689x1<BillingAgreementState> invoke() {
        return this.repository.getBillingAgreementSessionState();
    }
}
