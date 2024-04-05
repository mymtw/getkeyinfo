package com.paypal.android.platform.authsdk.authinterface;

public interface AuthenticationContext {
    AuthenticationState getAuthState();

    AuthenticationPrompt getLoginPrompt();

    String getPublicCredential();
}
