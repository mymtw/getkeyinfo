package com.paypal.pyplcheckout.common.cache;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CacheConfigManager_Factory implements C17555d<CacheConfigManager> {
    private final C19011a<CheckoutCache> checkoutCacheProvider;

    public CacheConfigManager_Factory(C19011a<CheckoutCache> aVar) {
        this.checkoutCacheProvider = aVar;
    }

    public static CacheConfigManager_Factory create(C19011a<CheckoutCache> aVar) {
        return new CacheConfigManager_Factory(aVar);
    }

    public static CacheConfigManager newInstance(CheckoutCache checkoutCache) {
        return new CacheConfigManager(checkoutCache);
    }

    public CacheConfigManager get() {
        return newInstance(this.checkoutCacheProvider.get());
    }
}
