package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsResponse;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

public final class AddCardThreeDsApi {
    private final String accessToken;

    public AddCardThreeDsApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public static /* synthetic */ Object updateCheckoutSessionFundingOptions$default(AddCardThreeDsApi addCardThreeDsApi, String str, String str2, boolean z, C19340c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DebugConfigManager.getInstance().getCheckoutToken();
            C19383o.m32796f(str, "getInstance().checkoutToken");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return addCardThreeDsApi.updateCheckoutSessionFundingOptions(str, str2, z, cVar);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Object updateCheckoutSessionFundingOptions(String str, String str2, boolean z, C19340c<? super AddCardUpdateFundingOptionsResponse> cVar) {
        return C19697g.m33471i(cVar, C19760n0.f43720b, new AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2(str, str2, z, this, (C19340c<? super AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2>) null));
    }
}
