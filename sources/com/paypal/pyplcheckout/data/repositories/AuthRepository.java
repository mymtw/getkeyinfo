package com.paypal.pyplcheckout.data.repositories;

import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.pyplcheckout.auth.AuthHandler;
import com.paypal.pyplcheckout.auth.UserAuthentication;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth;
import kotlin.jvm.internal.C19383o;

public final class AuthRepository {
    private String accessToken;
    private final boolean is1p;
    private UserAuthentication userAuthentication;

    public AuthRepository(ThirdPartyAuth thirdPartyAuth, boolean z) {
        C19383o.m32797g(thirdPartyAuth, "thirdPartyAuth");
        this.is1p = z;
        this.userAuthentication = thirdPartyAuth;
    }

    private final void logDecision() {
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_AUTH_TYPE_CHOSEN, this.is1p ? PEnums.Outcome.FIRST_PARTY : PEnums.Outcome.THIRD_PARTY, PEnums.EventCode.E153, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void login(AuthHandler authHandler) {
        C19383o.m32797g(authHandler, ConstantsKt.AUTH_HANDLER);
        logDecision();
        this.userAuthentication.getUserAccessToken(authHandler);
    }

    public final void logout(AuthHandler authHandler) {
        C19383o.m32797g(authHandler, ConstantsKt.AUTH_HANDLER);
        this.accessToken = null;
        logDecision();
        this.userAuthentication.logoutUser(authHandler);
    }

    public final void set1pUserAuthentication(UserAuthentication userAuthentication2) {
        C19383o.m32797g(userAuthentication2, "auth");
        if (this.is1p) {
            this.userAuthentication = userAuthentication2;
            return;
        }
        throw new IllegalArgumentException("Unsupported operation in Authentication");
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }
}
