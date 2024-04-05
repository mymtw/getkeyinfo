package com.paypal.pyplcheckout.services.queries;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

public final class UpdateCurrencyConversionQuery {
    public static final UpdateCurrencyConversionQuery INSTANCE = new UpdateCurrencyConversionQuery();

    private UpdateCurrencyConversionQuery() {
    }

    public final String get(String str, String str2) {
        C19383o.m32797g(str, "checkoutToken");
        C19383o.m32797g(str2, "conversionType");
        return C19457k.m33023a1(C19457k.m33023a1(" { query: 'mutation UPDATE_CURRENCY_CONVERSION(\n        $token: String!\n        $conversionType: CheckoutCurrencyConversionType!\n      ) {\n        updateCurrencyConversionType(token: $token, conversionType: $conversionType) {\n          state\n          }\n        }\n    ',\n    variables: {\n      token : checkoutToken,\n      conversionType: selectedConversionType\n    }}", "checkoutToken", str, false), "selectedConversionType", str2, false);
    }
}
