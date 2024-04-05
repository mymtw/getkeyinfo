package com.paypal.pyplcheckout.state.usecase;

import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.C19689x1;

public final class GetCheckoutStateUseCase {
    private final CheckoutStateRepository checkoutStateRepository;

    public GetCheckoutStateUseCase(CheckoutStateRepository checkoutStateRepository2) {
        C19383o.m32797g(checkoutStateRepository2, "checkoutStateRepository");
        this.checkoutStateRepository = checkoutStateRepository2;
    }

    public final C19689x1<CheckoutState> invoke() {
        return this.checkoutStateRepository.getCheckoutState();
    }
}
