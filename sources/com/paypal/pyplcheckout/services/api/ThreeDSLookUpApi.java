package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.AmountInput;
import com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse;
import com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

public final class ThreeDSLookUpApi {
    /* access modifiers changed from: private */
    public final String accessToken;

    public ThreeDSLookUpApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public static /* synthetic */ Object getThreeDSLookupResponse$default(ThreeDSLookUpApi threeDSLookUpApi, ThreeDSLookupPayload threeDSLookupPayload, AmountInput amountInput, String str, String str2, C19340c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        return threeDSLookUpApi.getThreeDSLookupResponse(threeDSLookupPayload, amountInput, str, str2, cVar);
    }

    public final Object getThreeDSLookupResponse(ThreeDSLookupPayload threeDSLookupPayload, AmountInput amountInput, String str, String str2, C19340c<? super ThreeDSLookUpResponse> cVar) {
        return C19697g.m33471i(cVar, C19760n0.f43720b, new ThreeDSLookUpApi$getThreeDSLookupResponse$2(this, str2, str, threeDSLookupPayload, amountInput, (C19340c<? super ThreeDSLookUpApi$getThreeDSLookupResponse$2>) null));
    }
}
