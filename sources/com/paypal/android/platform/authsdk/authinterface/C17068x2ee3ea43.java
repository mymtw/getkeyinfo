package com.paypal.android.platform.authsdk.authinterface;

import java.util.List;
import java.util.Map;
import p568fn.C17782b;

/* renamed from: com.paypal.android.platform.authsdk.authinterface.IdentityConnectFactory$Companion$makeSdkSSOAuthenticationContext$1 */
public final class C17068x2ee3ea43 implements SdkSSOAuthenticationContext {
    public final /* synthetic */ AuthenticationState $authState;
    public final /* synthetic */ AuthenticationPrompt $loginPrompt;
    public final /* synthetic */ Map<String, Object> $serviceMetaData;
    public final /* synthetic */ Tenant $tenant;

    public C17068x2ee3ea43(Tenant tenant, Map<String, ? extends Object> map, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt) {
        this.$tenant = tenant;
        this.$serviceMetaData = map;
        this.$authState = authenticationState;
        this.$loginPrompt = authenticationPrompt;
    }

    public AuthenticationState getAuthState() {
        return this.$authState;
    }

    public AuthenticationPrompt getLoginPrompt() {
        return this.$loginPrompt;
    }

    public String getPublicCredential() {
        return null;
    }

    public List<TokenType> getResponseType() {
        return C17782b.m29864d0(TokenType.AccessToken);
    }

    public Map<String, Object> getServiceMetadata() {
        return this.$serviceMetaData;
    }

    public Tenant getTenant() {
        return this.$tenant;
    }
}
