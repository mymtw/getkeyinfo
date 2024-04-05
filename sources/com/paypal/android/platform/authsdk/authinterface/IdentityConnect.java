package com.paypal.android.platform.authsdk.authinterface;

import java.io.IOException;

public interface IdentityConnect {

    public interface SdkSSOSessionProviderListener {
        void onError(IOException iOException);

        void onSuccess(SdkSSOSessionProvider sdkSSOSessionProvider);
    }

    public interface WebSSOSessionProviderListener {
        void onError(IOException iOException);

        void onSuccess(WebSSOSessionProvider webSSOSessionProvider);
    }

    void transferSdkSession(SdkSSOAuthenticationContext sdkSSOAuthenticationContext, SdkSSOSessionProviderListener sdkSSOSessionProviderListener);

    void transferWebSession(WebSSOAuthenticationContext webSSOAuthenticationContext, WebSSOSessionProviderListener webSSOSessionProviderListener);
}
