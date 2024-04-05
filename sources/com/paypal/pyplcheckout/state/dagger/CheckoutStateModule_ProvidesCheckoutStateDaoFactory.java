package com.paypal.pyplcheckout.state.dagger;

import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import dagger.internal.C17555d;
import p568fn.C17782b;

public final class CheckoutStateModule_ProvidesCheckoutStateDaoFactory implements C17555d<CheckoutStateDao> {
    private final CheckoutStateModule module;

    public CheckoutStateModule_ProvidesCheckoutStateDaoFactory(CheckoutStateModule checkoutStateModule) {
        this.module = checkoutStateModule;
    }

    public static CheckoutStateModule_ProvidesCheckoutStateDaoFactory create(CheckoutStateModule checkoutStateModule) {
        return new CheckoutStateModule_ProvidesCheckoutStateDaoFactory(checkoutStateModule);
    }

    public static CheckoutStateDao providesCheckoutStateDao(CheckoutStateModule checkoutStateModule) {
        CheckoutStateDao providesCheckoutStateDao = checkoutStateModule.providesCheckoutStateDao();
        C17782b.m29841G(providesCheckoutStateDao);
        return providesCheckoutStateDao;
    }

    public CheckoutStateDao get() {
        return providesCheckoutStateDao(this.module);
    }
}
