package com.paypal.pyplcheckout.flavorauth;

import android.util.Log;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.pyplcheckout.auth.AuthListener;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

public final class NativeAuthAccessTokenUseCase$handleAccessToken$1 implements Authentication.Listener {
    public final /* synthetic */ AuthListener $authListener;
    public final /* synthetic */ NativeAuthAccessTokenUseCase this$0;

    public NativeAuthAccessTokenUseCase$handleAccessToken$1(AuthListener authListener, NativeAuthAccessTokenUseCase nativeAuthAccessTokenUseCase) {
        this.$authListener = authListener;
        this.this$0 = nativeAuthAccessTokenUseCase;
    }

    public void onError(AuthenticationError authenticationError) {
        C19383o.m32797g(authenticationError, "error");
        Log.d("success", "Authentication.Listener.onError");
        String message = authenticationError.getMessage();
        if (message == null) {
            message = "Unknown AuthorizationException";
        }
        String str = message;
        AuthListener authListener = this.$authListener;
        if (authListener != null) {
            authListener.authFailure(new ThirdPartyAuthFailure(str, authenticationError));
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E301, "THIRD PARTY AUTH FAILURE", str, authenticationError, PEnums.TransitionName.NATIVE_XO_AUTH_RESPONSE, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        this.this$0.thirdPartyAuthPresenter.dismissAuthFlow();
    }

    public void onSuccess(AuthenticationTokensProvider authenticationTokensProvider) {
        AuthListener authListener;
        AuthListener authListener2;
        C19383o.m32797g(authenticationTokensProvider, "authTokensProvider");
        String accessToken = authenticationTokensProvider.getAccessToken();
        Log.d("success", "Authentication.Listener.onSuccess accessToken: " + accessToken);
        String accessToken2 = authenticationTokensProvider.getAccessToken();
        C19394m mVar = null;
        if (!(accessToken2 == null || (authListener2 = this.$authListener) == null)) {
            authListener2.authSuccess(new ThirdPartyAuthSuccess(accessToken2, (Map<String, ? extends Object>) null));
            mVar = C19394m.f43287a;
        }
        if (mVar == null && (authListener = this.$authListener) != null) {
            authListener.authFailure(new ThirdPartyAuthFailure("AccessToken is null", new Exception("Access Token is null exception")));
        }
        this.this$0.thirdPartyAuthPresenter.dismissAuthFlow();
    }
}
