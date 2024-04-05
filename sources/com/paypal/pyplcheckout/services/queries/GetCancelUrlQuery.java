package com.paypal.pyplcheckout.services.queries;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

public final class GetCancelUrlQuery {
    public static final GetCancelUrlQuery INSTANCE = new GetCancelUrlQuery();

    private GetCancelUrlQuery() {
    }

    public final String get(String str) {
        C19383o.m32797g(str, "checkoutToken");
        return C19457k.m33023a1(" { query: 'query GET_CHECKOUT_SESSION($token: String!) {\n    checkoutSession(token: $token) {\n      cart {\n        cancelUrl {\n          href\n        }}}}',\n    variables: { token: checkoutToken }}", "checkoutToken", str, false);
    }
}
