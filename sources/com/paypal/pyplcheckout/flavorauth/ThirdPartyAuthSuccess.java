package com.paypal.pyplcheckout.flavorauth;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.auth.AuthenticationSuccess;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThirdPartyAuthSuccess extends AuthenticationSuccess {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyAuthSuccess(String str, Map<String, ? extends Object> map) {
        super(str, map);
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThirdPartyAuthSuccess(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
