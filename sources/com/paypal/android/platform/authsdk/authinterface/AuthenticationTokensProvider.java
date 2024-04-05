package com.paypal.android.platform.authsdk.authinterface;

import java.util.Map;

public interface AuthenticationTokensProvider {
    String getAccessToken();

    Map<String, String> getAuthHeaders();

    String getIdToken();

    Map<String, Object> getResultServiceMetadata();
}
