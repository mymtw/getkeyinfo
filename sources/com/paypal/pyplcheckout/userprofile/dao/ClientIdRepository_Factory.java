package com.paypal.pyplcheckout.userprofile.dao;

import dagger.internal.C17555d;

public final class ClientIdRepository_Factory implements C17555d<ClientIdRepository> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ClientIdRepository_Factory INSTANCE = new ClientIdRepository_Factory();

        private InstanceHolder() {
        }
    }

    public static ClientIdRepository_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ClientIdRepository newInstance() {
        return new ClientIdRepository();
    }

    public ClientIdRepository get() {
        return newInstance();
    }
}
