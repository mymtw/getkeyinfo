package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.data.daos.MerchantConfigDao;
import com.paypal.pyplcheckout.data.daos.MerchantConfigDaoImpl;

/* renamed from: com.paypal.pyplcheckout.di.DaoModule */
public interface DaoModule {
    MerchantConfigDao provideMerchantConfigDao(MerchantConfigDaoImpl merchantConfigDaoImpl);
}
