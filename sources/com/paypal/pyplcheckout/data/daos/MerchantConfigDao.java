package com.paypal.pyplcheckout.data.daos;

import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.pyplcheckout.providerIntegration.ExtendedCheckoutConfig;

public interface MerchantConfigDao {
    CheckoutConfig getMerchantConfig();

    ExtendedCheckoutConfig getMerchantExtendedConfig();

    void setMerchantConfig(CheckoutConfig checkoutConfig);

    void setMerchantExtendedConfig(ExtendedCheckoutConfig extendedCheckoutConfig);
}
