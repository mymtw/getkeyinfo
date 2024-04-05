package com.paypal.pyplcheckout.billingagreements.viewmodel;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsCacheTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsSetBalancePrefUseCase;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserCountryUseCase;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class BillingAgreementsViewModel_Factory implements C17555d<BillingAgreementsViewModel> {
    private final C19011a<BillingAgreementsCacheTypeUseCase> billingAgreementsCacheTypeUseCaseProvider;
    private final C19011a<BillingAgreementsGetTypeUseCase> billingAgreementsGetTypeUseCaseProvider;
    private final C19011a<BillingAgreementsRepository> billingAgreementsRepositoryProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<BillingAgreementsGetBalancePrefUseCase> getBalancePrefUseCaseProvider;
    private final C19011a<GetSelectedFundingOptionUseCase> getSelectedFundingOptionUseCaseProvider;
    private final C19011a<GetUserCountryUseCase> getUserCountryUseCaseProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<BillingAgreementsSetBalancePrefUseCase> setBalancePrefUseCaseProvider;

    public BillingAgreementsViewModel_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<BillingAgreementsGetBalancePrefUseCase> aVar3, C19011a<BillingAgreementsSetBalancePrefUseCase> aVar4, C19011a<BillingAgreementsCacheTypeUseCase> aVar5, C19011a<BillingAgreementsGetTypeUseCase> aVar6, C19011a<GetSelectedFundingOptionUseCase> aVar7, C19011a<GetUserCountryUseCase> aVar8, C19011a<PYPLCheckoutUtils> aVar9, C19011a<BillingAgreementsRepository> aVar10) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.getBalancePrefUseCaseProvider = aVar3;
        this.setBalancePrefUseCaseProvider = aVar4;
        this.billingAgreementsCacheTypeUseCaseProvider = aVar5;
        this.billingAgreementsGetTypeUseCaseProvider = aVar6;
        this.getSelectedFundingOptionUseCaseProvider = aVar7;
        this.getUserCountryUseCaseProvider = aVar8;
        this.pyplCheckoutUtilsProvider = aVar9;
        this.billingAgreementsRepositoryProvider = aVar10;
    }

    public static BillingAgreementsViewModel_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<BillingAgreementsGetBalancePrefUseCase> aVar3, C19011a<BillingAgreementsSetBalancePrefUseCase> aVar4, C19011a<BillingAgreementsCacheTypeUseCase> aVar5, C19011a<BillingAgreementsGetTypeUseCase> aVar6, C19011a<GetSelectedFundingOptionUseCase> aVar7, C19011a<GetUserCountryUseCase> aVar8, C19011a<PYPLCheckoutUtils> aVar9, C19011a<BillingAgreementsRepository> aVar10) {
        return new BillingAgreementsViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static BillingAgreementsViewModel newInstance(Events events, Repository repository, BillingAgreementsGetBalancePrefUseCase billingAgreementsGetBalancePrefUseCase, BillingAgreementsSetBalancePrefUseCase billingAgreementsSetBalancePrefUseCase, BillingAgreementsCacheTypeUseCase billingAgreementsCacheTypeUseCase, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase, GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, GetUserCountryUseCase getUserCountryUseCase, PYPLCheckoutUtils pYPLCheckoutUtils, BillingAgreementsRepository billingAgreementsRepository) {
        return new BillingAgreementsViewModel(events, repository, billingAgreementsGetBalancePrefUseCase, billingAgreementsSetBalancePrefUseCase, billingAgreementsCacheTypeUseCase, billingAgreementsGetTypeUseCase, getSelectedFundingOptionUseCase, getUserCountryUseCase, pYPLCheckoutUtils, billingAgreementsRepository);
    }

    public BillingAgreementsViewModel get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.getBalancePrefUseCaseProvider.get(), this.setBalancePrefUseCaseProvider.get(), this.billingAgreementsCacheTypeUseCaseProvider.get(), this.billingAgreementsGetTypeUseCaseProvider.get(), this.getSelectedFundingOptionUseCaseProvider.get(), this.getUserCountryUseCaseProvider.get(), this.pyplCheckoutUtilsProvider.get(), this.billingAgreementsRepositoryProvider.get());
    }
}
