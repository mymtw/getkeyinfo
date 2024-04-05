package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CheckoutDataStore_Factory implements C17555d<CheckoutDataStore> {
    private final C19011a<Context> contextProvider;

    public CheckoutDataStore_Factory(C19011a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static CheckoutDataStore_Factory create(C19011a<Context> aVar) {
        return new CheckoutDataStore_Factory(aVar);
    }

    public static CheckoutDataStore newInstance(Context context) {
        return new CheckoutDataStore(context);
    }

    public CheckoutDataStore get() {
        return newInstance(this.contextProvider.get());
    }
}
