package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.C17133c;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17156f;
import com.paypal.pyplcheckout.auth.AuthListener;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p668ro.C18504c;

public final class WebBasedAuthAccessTokenUseCase$invoke$authDelegate$1 implements C17133c {
    public final /* synthetic */ AuthListener $authListener;
    public final /* synthetic */ WebBasedAuthAccessTokenUseCase this$0;

    public WebBasedAuthAccessTokenUseCase$invoke$authDelegate$1(AuthListener authListener, WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase) {
        this.$authListener = authListener;
        this.this$0 = webBasedAuthAccessTokenUseCase;
    }

    public void completeWithFailure(AuthorizationException authorizationException) {
        boolean z = false;
        if (authorizationException != null && authorizationException.code == AuthorizationException.C17147c.f37531a.code) {
            z = true;
        }
        if (z) {
            C18504c.f40748e.mo70011d();
            this.this$0.invoke(this.$authListener);
            return;
        }
        String nullIfNullOrEmpty = StringExtensionsKt.nullIfNullOrEmpty(authorizationException == null ? null : authorizationException.errorDescription);
        if (nullIfNullOrEmpty == null) {
            nullIfNullOrEmpty = "Unknown AuthorizationException";
        }
        String str = nullIfNullOrEmpty;
        AuthListener authListener = this.$authListener;
        if (authListener != null) {
            authListener.authFailure(new ThirdPartyAuthFailure(str, authorizationException));
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E301, "THIRD PARTY AUTH FAILURE", str, authorizationException, PEnums.TransitionName.NATIVE_XO_AUTH_RESPONSE, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
    }

    public void completeWithSuccess(C17156f fVar) {
        AuthListener authListener;
        AuthListener authListener2;
        C19383o.m32797g(fVar, "tokenResponse");
        String str = fVar.f37614c;
        C19394m mVar = null;
        if (!(str == null || (authListener2 = this.$authListener) == null)) {
            authListener2.authSuccess(new ThirdPartyAuthSuccess(str, (Map<String, ? extends Object>) null));
            mVar = C19394m.f43287a;
        }
        if (mVar == null && (authListener = this.$authListener) != null) {
            authListener.authFailure(new ThirdPartyAuthFailure("AccessToken is null", new Exception("Access Token is null exception")));
        }
    }

    public String getTrackingID() {
        return this.this$0.debugConfigManager.getCheckoutToken();
    }
}
