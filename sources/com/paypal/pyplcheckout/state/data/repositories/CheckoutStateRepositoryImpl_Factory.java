package com.paypal.pyplcheckout.state.data.repositories;

import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class CheckoutStateRepositoryImpl_Factory implements C17555d<CheckoutStateRepositoryImpl> {
    private final C19011a<CheckoutStateDao> checkoutStateDaoProvider;
    private final C19011a<C19525d0> scopeProvider;

    public CheckoutStateRepositoryImpl_Factory(C19011a<CheckoutStateDao> aVar, C19011a<C19525d0> aVar2) {
        this.checkoutStateDaoProvider = aVar;
        this.scopeProvider = aVar2;
    }

    public static CheckoutStateRepositoryImpl_Factory create(C19011a<CheckoutStateDao> aVar, C19011a<C19525d0> aVar2) {
        return new CheckoutStateRepositoryImpl_Factory(aVar, aVar2);
    }

    public static CheckoutStateRepositoryImpl newInstance(CheckoutStateDao checkoutStateDao, C19525d0 d0Var) {
        return new CheckoutStateRepositoryImpl(checkoutStateDao, d0Var);
    }

    public CheckoutStateRepositoryImpl get() {
        return newInstance(this.checkoutStateDaoProvider.get(), this.scopeProvider.get());
    }
}
