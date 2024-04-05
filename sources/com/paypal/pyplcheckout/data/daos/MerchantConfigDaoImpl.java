package com.paypal.pyplcheckout.data.daos;

import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.pyplcheckout.providerIntegration.ExtendedCheckoutConfig;
import kotlin.jvm.internal.C19383o;

public final class MerchantConfigDaoImpl implements MerchantConfigDao {
    private CheckoutConfig checkoutConfig;
    private ExtendedCheckoutConfig extendedCheckoutConfig;

    public CheckoutConfig getMerchantConfig() {
        return this.checkoutConfig;
    }

    public ExtendedCheckoutConfig getMerchantExtendedConfig() {
        return this.extendedCheckoutConfig;
    }

    public void setMerchantConfig(CheckoutConfig checkoutConfig2) {
        C19383o.m32797g(checkoutConfig2, "config");
        this.checkoutConfig = checkoutConfig2;
    }

    public void setMerchantExtendedConfig(ExtendedCheckoutConfig extendedCheckoutConfig2) {
        C19383o.m32797g(extendedCheckoutConfig2, "config");
        this.extendedCheckoutConfig = extendedCheckoutConfig2;
    }
}
