package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.auth.AuthHandlerProvider;
import com.paypal.pyplcheckout.crypto.NativePayWithCryptoCheck;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.eligibility.EligibilityManager;
import com.paypal.pyplcheckout.eligibility.Native3pEligibilityCheck;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import com.paypal.pyplcheckout.state.usecase.SetCheckoutStateUseCase;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class MainPaysheetViewModel_Factory implements C17555d<MainPaysheetViewModel> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<AddressRepository> addressRepositoryProvider;
    private final C19011a<AuthHandlerProvider> authHandlerProvider;
    private final C19011a<AuthRepository> authRepositoryProvider;
    private final C19011a<EligibilityManager> eligibilityManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Native3pEligibilityCheck> native3pEligibilityCheckProvider;
    private final C19011a<NativePayWithCryptoCheck> nativePayWithCryptoCheckProvider;
    private final C19011a<PostAuthSuccessHandler> postAuthSuccessHandlerProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<SetCheckoutStateUseCase> setCheckoutStateUseCaseProvider;
    private final C19011a<ShippingCallbackHandler> shippingCallbackHandlerProvider;
    private final C19011a<ThreeDSDecisionFlow> threeDSDecisionFlowProvider;
    private final C19011a<ThreeDSUseCase> threeDSUseCaseProvider;

    public MainPaysheetViewModel_Factory(C19011a<Repository> aVar, C19011a<AbManager> aVar2, C19011a<ThreeDSDecisionFlow> aVar3, C19011a<Events> aVar4, C19011a<PYPLCheckoutUtils> aVar5, C19011a<EligibilityManager> aVar6, C19011a<ShippingCallbackHandler> aVar7, C19011a<PostAuthSuccessHandler> aVar8, C19011a<Native3pEligibilityCheck> aVar9, C19011a<NativePayWithCryptoCheck> aVar10, C19011a<ThreeDSUseCase> aVar11, C19011a<SetCheckoutStateUseCase> aVar12, C19011a<AuthRepository> aVar13, C19011a<AddressRepository> aVar14, C19011a<AuthHandlerProvider> aVar15) {
        this.repositoryProvider = aVar;
        this.abManagerProvider = aVar2;
        this.threeDSDecisionFlowProvider = aVar3;
        this.eventsProvider = aVar4;
        this.pyplCheckoutUtilsProvider = aVar5;
        this.eligibilityManagerProvider = aVar6;
        this.shippingCallbackHandlerProvider = aVar7;
        this.postAuthSuccessHandlerProvider = aVar8;
        this.native3pEligibilityCheckProvider = aVar9;
        this.nativePayWithCryptoCheckProvider = aVar10;
        this.threeDSUseCaseProvider = aVar11;
        this.setCheckoutStateUseCaseProvider = aVar12;
        this.authRepositoryProvider = aVar13;
        this.addressRepositoryProvider = aVar14;
        this.authHandlerProvider = aVar15;
    }

    public static MainPaysheetViewModel_Factory create(C19011a<Repository> aVar, C19011a<AbManager> aVar2, C19011a<ThreeDSDecisionFlow> aVar3, C19011a<Events> aVar4, C19011a<PYPLCheckoutUtils> aVar5, C19011a<EligibilityManager> aVar6, C19011a<ShippingCallbackHandler> aVar7, C19011a<PostAuthSuccessHandler> aVar8, C19011a<Native3pEligibilityCheck> aVar9, C19011a<NativePayWithCryptoCheck> aVar10, C19011a<ThreeDSUseCase> aVar11, C19011a<SetCheckoutStateUseCase> aVar12, C19011a<AuthRepository> aVar13, C19011a<AddressRepository> aVar14, C19011a<AuthHandlerProvider> aVar15) {
        return new MainPaysheetViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15);
    }

    public static MainPaysheetViewModel newInstance(Repository repository, AbManager abManager, ThreeDSDecisionFlow threeDSDecisionFlow, Events events, PYPLCheckoutUtils pYPLCheckoutUtils, EligibilityManager eligibilityManager, ShippingCallbackHandler shippingCallbackHandler, PostAuthSuccessHandler postAuthSuccessHandler, Native3pEligibilityCheck native3pEligibilityCheck, NativePayWithCryptoCheck nativePayWithCryptoCheck, ThreeDSUseCase threeDSUseCase, SetCheckoutStateUseCase setCheckoutStateUseCase, AuthRepository authRepository, AddressRepository addressRepository, AuthHandlerProvider authHandlerProvider2) {
        return new MainPaysheetViewModel(repository, abManager, threeDSDecisionFlow, events, pYPLCheckoutUtils, eligibilityManager, shippingCallbackHandler, postAuthSuccessHandler, native3pEligibilityCheck, nativePayWithCryptoCheck, threeDSUseCase, setCheckoutStateUseCase, authRepository, addressRepository, authHandlerProvider2);
    }

    public MainPaysheetViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.abManagerProvider.get(), this.threeDSDecisionFlowProvider.get(), this.eventsProvider.get(), this.pyplCheckoutUtilsProvider.get(), this.eligibilityManagerProvider.get(), this.shippingCallbackHandlerProvider.get(), this.postAuthSuccessHandlerProvider.get(), this.native3pEligibilityCheckProvider.get(), this.nativePayWithCryptoCheckProvider.get(), this.threeDSUseCaseProvider.get(), this.setCheckoutStateUseCaseProvider.get(), this.authRepositoryProvider.get(), this.addressRepositoryProvider.get(), this.authHandlerProvider.get());
    }
}
