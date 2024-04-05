package com.paypal.android.platform.authsdk.authinterface;

import java.util.List;
import java.util.Map;
import p568fn.C17782b;

/* renamed from: com.paypal.android.platform.authsdk.authinterface.IdentityConnectFactory$Companion$makeWebSSOAuthenticationContext$1 */
public final class C17069xc11aecdd implements WebSSOAuthenticationContext {
    public final /* synthetic */ AuthenticationState $authState;
    public final /* synthetic */ AuthenticationPrompt $loginPrompt;
    public final /* synthetic */ String $redirectUri;
    public final /* synthetic */ Map<String, Object> $serviceMetaData;
    public final /* synthetic */ Tenant $tenant;

    public C17069xc11aecdd(String str, Tenant tenant, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, Map<String, ? extends Object> map) {
        this.$redirectUri = str;
        this.$tenant = tenant;
        this.$authState = authenticationState;
        this.$loginPrompt = authenticationPrompt;
        this.$serviceMetaData = map;
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

    public String getRedirectUri() {
        return this.$redirectUri;
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
