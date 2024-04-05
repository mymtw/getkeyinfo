package com.paypal.pyplcheckout.auth;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AuthenticationSuccess {
    private final String accessToken;
    private final Map<String, Object> extras;

    public AuthenticationSuccess(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
        this.extras = map;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    public String toLog() {
        return String.valueOf(this.extras);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthenticationSuccess(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
