package com.paypal.pyplcheckout.state.usecase;

import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import kotlin.jvm.internal.C19383o;

public final class SetCheckoutStateUseCase {
    private final CheckoutStateRepository checkoutStateRepository;

    public SetCheckoutStateUseCase(CheckoutStateRepository checkoutStateRepository2) {
        C19383o.m32797g(checkoutStateRepository2, "checkoutStateRepository");
        this.checkoutStateRepository = checkoutStateRepository2;
    }

    public final void invoke(CheckoutState checkoutState) {
        C19383o.m32797g(checkoutState, "state");
        this.checkoutStateRepository.setCheckoutState(checkoutState);
    }
}
