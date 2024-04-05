package com.paypal.pyplcheckout.billingagreements.usecase;

import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.services.Repository;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19689x1;

public final class BillingAgreementsGetBalancePrefUseCase {
    private final BillingAgreementsRepository billingAgreementsRepository;
    private final BillingAgreementsGetTypeUseCase getTypeUseCase;
    /* access modifiers changed from: private */
    public final Repository repository;
    private final C19525d0 scope;

    public BillingAgreementsGetBalancePrefUseCase(C19525d0 d0Var, BillingAgreementsRepository billingAgreementsRepository2, Repository repository2, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase) {
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(billingAgreementsRepository2, "billingAgreementsRepository");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(billingAgreementsGetTypeUseCase, "getTypeUseCase");
        this.scope = d0Var;
        this.billingAgreementsRepository = billingAgreementsRepository2;
        this.repository = repository2;
        this.getTypeUseCase = billingAgreementsGetTypeUseCase;
    }

    public final C19689x1<BillingAgreementBalancePreference> invoke() {
        return FlowExtensionsKt.merge(this.getTypeUseCase.invoke(), this.scope, this.billingAgreementsRepository.getAlwaysUseBalancePreference(), new BillingAgreementsGetBalancePrefUseCase$invoke$1(this));
    }
}
