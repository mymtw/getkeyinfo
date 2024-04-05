package com.paypal.pyplcheckout.state.dagger;

import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p568fn.C17782b;
import p740eq.C19011a;

public final class CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory implements C17555d<CheckoutStateRepository> {
    private final C19011a<CheckoutStateDao> daoProvider;
    private final CheckoutStateModule module;
    private final C19011a<C19525d0> scopeProvider;

    public CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory(CheckoutStateModule checkoutStateModule, C19011a<CheckoutStateDao> aVar, C19011a<C19525d0> aVar2) {
        this.module = checkoutStateModule;
        this.daoProvider = aVar;
        this.scopeProvider = aVar2;
    }

    public static CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory create(CheckoutStateModule checkoutStateModule, C19011a<CheckoutStateDao> aVar, C19011a<C19525d0> aVar2) {
        return new CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory(checkoutStateModule, aVar, aVar2);
    }

    public static CheckoutStateRepository providesCheckoutStateRepository(CheckoutStateModule checkoutStateModule, CheckoutStateDao checkoutStateDao, C19525d0 d0Var) {
        CheckoutStateRepository providesCheckoutStateRepository = checkoutStateModule.providesCheckoutStateRepository(checkoutStateDao, d0Var);
        C17782b.m29841G(providesCheckoutStateRepository);
        return providesCheckoutStateRepository;
    }

    public CheckoutStateRepository get() {
        return providesCheckoutStateRepository(this.module, this.daoProvider.get(), this.scopeProvider.get());
    }
}
