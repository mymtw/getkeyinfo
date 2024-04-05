package com.paypal.pyplcheckout.state.data.repositories;

import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import kotlinx.coroutines.flow.C19689x1;

public interface CheckoutStateRepository {
    C19689x1<CheckoutState> getCheckoutState();

    void setCheckoutState(CheckoutState checkoutState);
}
