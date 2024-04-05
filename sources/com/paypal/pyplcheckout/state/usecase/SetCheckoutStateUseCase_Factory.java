package com.paypal.pyplcheckout.state.usecase;

import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class SetCheckoutStateUseCase_Factory implements C17555d<SetCheckoutStateUseCase> {
    private final C19011a<CheckoutStateRepository> checkoutStateRepositoryProvider;

    public SetCheckoutStateUseCase_Factory(C19011a<CheckoutStateRepository> aVar) {
        this.checkoutStateRepositoryProvider = aVar;
    }

    public static SetCheckoutStateUseCase_Factory create(C19011a<CheckoutStateRepository> aVar) {
        return new SetCheckoutStateUseCase_Factory(aVar);
    }

    public static SetCheckoutStateUseCase newInstance(CheckoutStateRepository checkoutStateRepository) {
        return new SetCheckoutStateUseCase(checkoutStateRepository);
    }

    public SetCheckoutStateUseCase get() {
        return newInstance(this.checkoutStateRepositoryProvider.get());
    }
}
