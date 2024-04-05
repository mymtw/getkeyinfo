package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.auth.UserAuthentication;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth;

/* renamed from: com.paypal.pyplcheckout.di.ThirdPartyAuthModule */
public interface ThirdPartyAuthModule {
    UserAuthentication provideUserAuthentication(ThirdPartyAuth thirdPartyAuth);
}
