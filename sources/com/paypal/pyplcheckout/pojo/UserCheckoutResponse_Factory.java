package com.paypal.pyplcheckout.pojo;

import dagger.internal.C17555d;

public final class UserCheckoutResponse_Factory implements C17555d<UserCheckoutResponse> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final UserCheckoutResponse_Factory INSTANCE = new UserCheckoutResponse_Factory();

        private InstanceHolder() {
        }
    }

    public static UserCheckoutResponse_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UserCheckoutResponse newInstance() {
        return new UserCheckoutResponse();
    }

    public UserCheckoutResponse get() {
        return newInstance();
    }
}
