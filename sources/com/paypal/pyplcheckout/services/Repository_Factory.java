package com.paypal.pyplcheckout.services;

import com.paypal.pyplcheckout.fundingOptions.dao.FundingOptionsDao;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback;
import com.paypal.pyplcheckout.services.callbacks.UpdateCurrencyConversionCallback;
import com.paypal.pyplcheckout.userprofile.dao.UserDao;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import p634np.C18289a;
import p740eq.C19011a;

public final class Repository_Factory implements C17555d<Repository> {
    private final C19011a<ApprovePaymentCallback> approvePaymentCallbackProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<FundingOptionsDao> fundingOptionsDaoProvider;
    private final C19011a<UpdateCurrencyConversionCallback> updateCurrencyConversionCallbackProvider;
    private final C19011a<UserCheckoutResponse> userCheckoutResponseProvider;
    private final C19011a<UserDao> userDaoProvider;

    public Repository_Factory(C19011a<UserCheckoutResponse> aVar, C19011a<DebugConfigManager> aVar2, C19011a<FundingOptionsDao> aVar3, C19011a<UserDao> aVar4, C19011a<ApprovePaymentCallback> aVar5, C19011a<UpdateCurrencyConversionCallback> aVar6) {
        this.userCheckoutResponseProvider = aVar;
        this.debugConfigManagerProvider = aVar2;
        this.fundingOptionsDaoProvider = aVar3;
        this.userDaoProvider = aVar4;
        this.approvePaymentCallbackProvider = aVar5;
        this.updateCurrencyConversionCallbackProvider = aVar6;
    }

    public static Repository_Factory create(C19011a<UserCheckoutResponse> aVar, C19011a<DebugConfigManager> aVar2, C19011a<FundingOptionsDao> aVar3, C19011a<UserDao> aVar4, C19011a<ApprovePaymentCallback> aVar5, C19011a<UpdateCurrencyConversionCallback> aVar6) {
        return new Repository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static Repository newInstance(UserCheckoutResponse userCheckoutResponse, DebugConfigManager debugConfigManager, FundingOptionsDao fundingOptionsDao, UserDao userDao, C18289a<ApprovePaymentCallback> aVar, C18289a<UpdateCurrencyConversionCallback> aVar2) {
        return new Repository(userCheckoutResponse, debugConfigManager, fundingOptionsDao, userDao, aVar, aVar2);
    }

    public Repository get() {
        return newInstance(this.userCheckoutResponseProvider.get(), this.debugConfigManagerProvider.get(), this.fundingOptionsDaoProvider.get(), this.userDaoProvider.get(), C17554c.m29426a(this.approvePaymentCallbackProvider), C17554c.m29426a(this.updateCurrencyConversionCallbackProvider));
    }
}
