package com.paypal.pyplcheckout.state.data.daos;

import dagger.internal.C17555d;

public final class CheckoutStateDaoImpl_Factory implements C17555d<CheckoutStateDaoImpl> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CheckoutStateDaoImpl_Factory INSTANCE = new CheckoutStateDaoImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static CheckoutStateDaoImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CheckoutStateDaoImpl newInstance() {
        return new CheckoutStateDaoImpl();
    }

    public CheckoutStateDaoImpl get() {
        return newInstance();
    }
}
