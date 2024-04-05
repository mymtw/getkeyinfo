package com.paypal.pyplcheckout.auth;

public interface NativeSSOListener {
    void ssoRedirectFetchFailed();

    void ssoRedirectFetchSuccess(String str);
}
