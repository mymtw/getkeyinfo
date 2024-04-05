package com.etsy.android.lib.dagger;

import com.etsy.android.lib.models.apiv3.TestAccountToolResponse;
import com.etsy.android.lib.requests.apiv3.TestAccountToolEndpoint;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.single.C19204f;
import p248tp.C8071s;

/* renamed from: com.etsy.android.lib.dagger.k */
public final class C8652k implements TestAccountToolEndpoint {
    public final C8071s<TestAccountToolResponse> getTestAccountToolAuthTokenAndSecret(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        return new C19204f(new Functions.C12962g(new Throwable("Cannot use test account tool in production")));
    }
}
