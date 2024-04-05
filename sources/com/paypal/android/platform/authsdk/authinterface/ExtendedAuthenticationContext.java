package com.paypal.android.platform.authsdk.authinterface;

import java.util.List;
import java.util.Map;

public interface ExtendedAuthenticationContext extends AuthenticationContext {
    List<TokenType> getResponseType();

    Map<String, Object> getServiceMetadata();
}
