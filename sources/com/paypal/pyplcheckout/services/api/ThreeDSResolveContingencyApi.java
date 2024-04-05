package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.ResolveThreeDsContingencyStatus;
import com.paypal.pyplcheckout.pojo.ThreeDSResolveContingencyResponse;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

public final class ThreeDSResolveContingencyApi {
    /* access modifiers changed from: private */
    public final String accessToken;

    public ThreeDSResolveContingencyApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public final Object resolveContingency(String str, String str2, String str3, ResolveThreeDsContingencyStatus resolveThreeDsContingencyStatus, String str4, C19340c<? super ThreeDSResolveContingencyResponse> cVar) {
        return C19697g.m33471i(cVar, C19760n0.f43720b, new ThreeDSResolveContingencyApi$resolveContingency$2(str4, str, resolveThreeDsContingencyStatus, str2, str3, this, (C19340c<? super ThreeDSResolveContingencyApi$resolveContingency$2>) null));
    }
}
