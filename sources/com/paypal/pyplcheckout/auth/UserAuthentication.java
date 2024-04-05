package com.paypal.pyplcheckout.auth;

public interface UserAuthentication {
    void getUserAccessToken(AuthListener authListener);

    void logoutUser(AuthListener authListener);
}
