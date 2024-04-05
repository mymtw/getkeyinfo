package com.paypal.checkout.order;

import dagger.internal.C17555d;

public final class UpdateOrderStatusRequestFactory_Factory implements C17555d<UpdateOrderStatusRequestFactory> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final UpdateOrderStatusRequestFactory_Factory INSTANCE = new UpdateOrderStatusRequestFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static UpdateOrderStatusRequestFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UpdateOrderStatusRequestFactory newInstance() {
        return new UpdateOrderStatusRequestFactory();
    }

    public UpdateOrderStatusRequestFactory get() {
        return newInstance();
    }
}
