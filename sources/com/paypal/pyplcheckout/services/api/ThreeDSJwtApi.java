package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.pojo.ThreeDSInitJWT;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

public final class ThreeDSJwtApi {
    /* access modifiers changed from: private */
    public final String accessToken;

    public ThreeDSJwtApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public static /* synthetic */ Object getThreeDSJwt$default(ThreeDSJwtApi threeDSJwtApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C19340c cVar, int i, Object obj) {
        int i2 = i;
        return threeDSJwtApi.getThreeDSJwt(str, str2, str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, cVar);
    }

    public final Object getThreeDSJwt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C19340c<? super ThreeDSInitJWT> cVar) {
        return C19697g.m33471i(cVar, C19760n0.f43720b, new ThreeDSJwtApi$getThreeDSJwt$2(this, str, str2, str3, str8, str4, str5, str6, str7, (C19340c<? super ThreeDSJwtApi$getThreeDSJwt$2>) null));
    }
}
