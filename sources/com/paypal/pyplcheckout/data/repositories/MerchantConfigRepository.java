package com.paypal.pyplcheckout.data.repositories;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.pyplcheckout.addcard.UpgradeAccessToken;
import com.paypal.pyplcheckout.data.daos.MerchantConfigDao;
import com.paypal.pyplcheckout.providerIntegration.ExtendedCheckoutConfig;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;

public final class MerchantConfigRepository {
    private final MerchantConfigDao merchantConfigDao;
    private String merchantReturnURLScheme;
    private UpgradeAccessToken upgradeAccessToken;

    public MerchantConfigRepository(MerchantConfigDao merchantConfigDao2) {
        C19383o.m32797g(merchantConfigDao2, "merchantConfigDao");
        this.merchantConfigDao = merchantConfigDao2;
    }

    /* renamed from: getMerchantConfig-d1pmJ48  reason: not valid java name */
    public final Object m35247getMerchantConfigd1pmJ48() {
        CheckoutConfig merchantConfig = this.merchantConfigDao.getMerchantConfig();
        return merchantConfig != null ? Result.m35480constructorimpl(merchantConfig) : Result.m35480constructorimpl(C0761x.m1673J(new IllegalStateException("Config is null. Config needs to be set before retrieving")));
    }

    /* renamed from: getMerchantExtendedConfig-d1pmJ48  reason: not valid java name */
    public final Object m35248getMerchantExtendedConfigd1pmJ48() {
        ExtendedCheckoutConfig merchantExtendedConfig = this.merchantConfigDao.getMerchantExtendedConfig();
        return merchantExtendedConfig != null ? Result.m35480constructorimpl(merchantExtendedConfig) : Result.m35480constructorimpl(C0761x.m1673J(new IllegalStateException("Extended config is null, it needs to be set before retrieving")));
    }

    public final String getMerchantReturnURLScheme() {
        return this.merchantReturnURLScheme;
    }

    /* renamed from: getUpgradeAccessToken-d1pmJ48  reason: not valid java name */
    public final Object m35249getUpgradeAccessTokend1pmJ48() {
        UpgradeAccessToken upgradeAccessToken2 = this.upgradeAccessToken;
        Result r0 = upgradeAccessToken2 == null ? null : Result.m35479boximpl(Result.m35480constructorimpl(upgradeAccessToken2));
        return r0 == null ? Result.m35480constructorimpl(C0761x.m1673J(new IllegalStateException("UpgradeAccessToken was required but not initialized."))) : r0.m35488unboximpl();
    }

    public final void setMerchantConfig(CheckoutConfig checkoutConfig) {
        C19383o.m32797g(checkoutConfig, "config");
        this.merchantConfigDao.setMerchantConfig(checkoutConfig);
        this.merchantReturnURLScheme = checkoutConfig.getApplication().getPackageName();
    }

    public final void setMerchantExtendedConfig(ExtendedCheckoutConfig extendedCheckoutConfig) {
        C19383o.m32797g(extendedCheckoutConfig, "config");
        this.merchantConfigDao.setMerchantExtendedConfig(extendedCheckoutConfig);
    }

    public final void setMerchantReturnURLScheme(String str) {
        this.merchantReturnURLScheme = str;
    }

    public final void setUpgradeAccessToken(UpgradeAccessToken upgradeAccessToken2) {
        C19383o.m32797g(upgradeAccessToken2, "newUpgradeAccessToken");
        this.upgradeAccessToken = upgradeAccessToken2;
    }
}
