package com.paypal.pyplcheckout.data.repositories;

import com.paypal.pyplcheckout.data.daos.MerchantConfigDao;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class MerchantConfigRepository_Factory implements C17555d<MerchantConfigRepository> {
    private final C19011a<MerchantConfigDao> merchantConfigDaoProvider;

    public MerchantConfigRepository_Factory(C19011a<MerchantConfigDao> aVar) {
        this.merchantConfigDaoProvider = aVar;
    }

    public static MerchantConfigRepository_Factory create(C19011a<MerchantConfigDao> aVar) {
        return new MerchantConfigRepository_Factory(aVar);
    }

    public static MerchantConfigRepository newInstance(MerchantConfigDao merchantConfigDao) {
        return new MerchantConfigRepository(merchantConfigDao);
    }

    public MerchantConfigRepository get() {
        return newInstance(this.merchantConfigDaoProvider.get());
    }
}
