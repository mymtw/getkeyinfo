package com.paypal.pyplcheckout.state.data.daos;

import com.paypal.pyplcheckout.state.data.model.CheckoutState;

public interface CheckoutStateDao {
    CheckoutState getCheckoutState();

    void setCheckoutState(CheckoutState checkoutState);
}
