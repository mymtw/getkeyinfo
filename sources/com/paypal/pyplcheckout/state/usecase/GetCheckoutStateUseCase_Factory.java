package com.paypal.pyplcheckout.state.usecase;

import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetCheckoutStateUseCase_Factory implements C17555d<GetCheckoutStateUseCase> {
    private final C19011a<CheckoutStateRepository> checkoutStateRepositoryProvider;

    public GetCheckoutStateUseCase_Factory(C19011a<CheckoutStateRepository> aVar) {
        this.checkoutStateRepositoryProvider = aVar;
    }

    public static GetCheckoutStateUseCase_Factory create(C19011a<CheckoutStateRepository> aVar) {
        return new GetCheckoutStateUseCase_Factory(aVar);
    }

    public static GetCheckoutStateUseCase newInstance(CheckoutStateRepository checkoutStateRepository) {
        return new GetCheckoutStateUseCase(checkoutStateRepository);
    }

    public GetCheckoutStateUseCase get() {
        return newInstance(this.checkoutStateRepositoryProvider.get());
    }
}
