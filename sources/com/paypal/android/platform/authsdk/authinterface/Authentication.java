package com.paypal.android.platform.authsdk.authinterface;

public interface Authentication {

    public interface Listener {
        void onError(AuthenticationError authenticationError);

        void onSuccess(AuthenticationTokensProvider authenticationTokensProvider);
    }

    AuthenticationTokensProvider authTokensProvider();

    void authenticate(AuthenticationContext authenticationContext, Listener listener);

    boolean isAuthenticationNeeded(AuthenticationContext authenticationContext);

    void logout(boolean z);
}
