package com.paypal.pyplcheckout.state.dagger;

import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDaoImpl;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepositoryImpl;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;

public final class CheckoutStateModule {
    public final CheckoutStateDao providesCheckoutStateDao() {
        return new CheckoutStateDaoImpl();
    }

    public final CheckoutStateRepository providesCheckoutStateRepository(CheckoutStateDao checkoutStateDao, C19525d0 d0Var) {
        C19383o.m32797g(checkoutStateDao, "dao");
        C19383o.m32797g(d0Var, "scope");
        return new CheckoutStateRepositoryImpl(checkoutStateDao, d0Var);
    }
}
