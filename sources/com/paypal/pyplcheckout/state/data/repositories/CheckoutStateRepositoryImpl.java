package com.paypal.pyplcheckout.state.data.repositories;

import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19689x1;

public final class CheckoutStateRepositoryImpl implements CheckoutStateRepository {
    /* access modifiers changed from: private */
    public final C19656n1<CheckoutState> _state = C19388s.m32862g(CheckoutState.PreReview.INSTANCE);
    private final CheckoutStateDao checkoutStateDao;
    private final C19525d0 scope;

    public CheckoutStateRepositoryImpl(CheckoutStateDao checkoutStateDao2, C19525d0 d0Var) {
        C19383o.m32797g(checkoutStateDao2, "checkoutStateDao");
        C19383o.m32797g(d0Var, "scope");
        this.checkoutStateDao = checkoutStateDao2;
        this.scope = d0Var;
    }

    private final void emitState(CheckoutState checkoutState) {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new CheckoutStateRepositoryImpl$emitState$1(this, checkoutState, (C19340c<? super CheckoutStateRepositoryImpl$emitState$1>) null), 3);
    }

    public C19689x1<CheckoutState> getCheckoutState() {
        emitState(this.checkoutStateDao.getCheckoutState());
        return this._state;
    }

    public final C19689x1<CheckoutState> getState() {
        return this._state;
    }

    public void setCheckoutState(CheckoutState checkoutState) {
        C19383o.m32797g(checkoutState, "state");
        this.checkoutStateDao.setCheckoutState(checkoutState);
        emitState(checkoutState);
    }
}
