package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.AmountInput;
import com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateResponse;
import com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

public final class ThreeDSAuthenticateApi {
    /* access modifiers changed from: private */
    public final String accessToken;

    public ThreeDSAuthenticateApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public final Object authenticate(String str, ThreeDSLookupPayload threeDSLookupPayload, String str2, AmountInput amountInput, C19340c<? super ThreeDSAuthenticateResponse> cVar) {
        return C19697g.m33471i(cVar, C19760n0.f43720b, new ThreeDSAuthenticateApi$authenticate$2(str, str2, threeDSLookupPayload, amountInput, this, (C19340c<? super ThreeDSAuthenticateApi$authenticate$2>) null));
    }
}
