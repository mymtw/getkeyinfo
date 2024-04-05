package com.paypal.android.platform.authsdk.authinterface;

public interface Token {
    AuthenticationState getAuthenticationState();

    long getExpiry();

    TokenType getType();

    String getValue();
}
