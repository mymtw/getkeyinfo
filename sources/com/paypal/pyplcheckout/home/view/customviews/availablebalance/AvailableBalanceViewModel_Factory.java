package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AvailableBalanceViewModel_Factory implements C17555d<AvailableBalanceViewModel> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<BillingAgreementsGetTypeUseCase> getBillingAgreementTypeProvider;
    private final C19011a<Repository> repositoryProvider;

    public AvailableBalanceViewModel_Factory(C19011a<Repository> aVar, C19011a<Events> aVar2, C19011a<BillingAgreementsGetTypeUseCase> aVar3) {
        this.repositoryProvider = aVar;
        this.eventsProvider = aVar2;
        this.getBillingAgreementTypeProvider = aVar3;
    }

    public static AvailableBalanceViewModel_Factory create(C19011a<Repository> aVar, C19011a<Events> aVar2, C19011a<BillingAgreementsGetTypeUseCase> aVar3) {
        return new AvailableBalanceViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static AvailableBalanceViewModel newInstance(Repository repository, Events events, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase) {
        return new AvailableBalanceViewModel(repository, events, billingAgreementsGetTypeUseCase);
    }

    public AvailableBalanceViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.eventsProvider.get(), this.getBillingAgreementTypeProvider.get());
    }
}
