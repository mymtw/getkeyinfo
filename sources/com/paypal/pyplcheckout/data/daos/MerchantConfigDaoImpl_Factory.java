package com.paypal.pyplcheckout.data.daos;

import dagger.internal.C17555d;

public final class MerchantConfigDaoImpl_Factory implements C17555d<MerchantConfigDaoImpl> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MerchantConfigDaoImpl_Factory INSTANCE = new MerchantConfigDaoImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static MerchantConfigDaoImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MerchantConfigDaoImpl newInstance() {
        return new MerchantConfigDaoImpl();
    }

    public MerchantConfigDaoImpl get() {
        return newInstance();
    }
}
