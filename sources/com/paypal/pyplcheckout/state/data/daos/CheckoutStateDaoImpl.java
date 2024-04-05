package com.paypal.pyplcheckout.state.data.daos;

import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import kotlin.jvm.internal.C19383o;

public final class CheckoutStateDaoImpl implements CheckoutStateDao {
    private CheckoutState checkoutState = CheckoutState.PreReview.INSTANCE;

    public CheckoutState getCheckoutState() {
        return this.checkoutState;
    }

    public void setCheckoutState(CheckoutState checkoutState2) {
        C19383o.m32797g(checkoutState2, "state");
        this.checkoutState = checkoutState2;
    }
}
