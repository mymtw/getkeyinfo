package com.paypal.pyplcheckout.common.cache;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CheckoutCache_Factory implements C17555d<CheckoutCache> {
    private final C19011a<CheckoutDataStore> checkoutDataStoreProvider;

    public CheckoutCache_Factory(C19011a<CheckoutDataStore> aVar) {
        this.checkoutDataStoreProvider = aVar;
    }

    public static CheckoutCache_Factory create(C19011a<CheckoutDataStore> aVar) {
        return new CheckoutCache_Factory(aVar);
    }

    public static CheckoutCache newInstance(CheckoutDataStore checkoutDataStore) {
        return new CheckoutCache(checkoutDataStore);
    }

    public CheckoutCache get() {
        return newInstance(this.checkoutDataStoreProvider.get());
    }
}
