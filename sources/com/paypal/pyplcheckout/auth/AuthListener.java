package com.paypal.pyplcheckout.auth;

public interface AuthListener {
    void authFailure(AuthenticationFailure authenticationFailure);

    void authSuccess(AuthenticationSuccess authenticationSuccess);
}
