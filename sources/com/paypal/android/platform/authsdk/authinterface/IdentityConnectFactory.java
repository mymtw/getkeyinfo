package com.paypal.android.platform.authsdk.authinterface;

import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IdentityConnectFactory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SdkSSOAuthenticationContext makeSdkSSOAuthenticationContext$default(Companion companion, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, Tenant tenant, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                authenticationState = AuthenticationState.LoggedIn;
            }
            if ((i & 2) != 0) {
                authenticationPrompt = AuthenticationPrompt.Undefined;
            }
            if ((i & 4) != 0) {
                tenant = Tenant.Paypal;
            }
            if ((i & 8) != 0) {
                map = C19294b0.m32559p0();
            }
            return companion.makeSdkSSOAuthenticationContext(authenticationState, authenticationPrompt, tenant, map);
        }

        public static /* synthetic */ WebSSOAuthenticationContext makeWebSSOAuthenticationContext$default(Companion companion, String str, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, Tenant tenant, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                authenticationState = AuthenticationState.LoggedIn;
            }
            AuthenticationState authenticationState2 = authenticationState;
            if ((i & 4) != 0) {
                authenticationPrompt = AuthenticationPrompt.Undefined;
            }
            AuthenticationPrompt authenticationPrompt2 = authenticationPrompt;
            if ((i & 8) != 0) {
                tenant = Tenant.Paypal;
            }
            Tenant tenant2 = tenant;
            if ((i & 16) != 0) {
                map = C19294b0.m32559p0();
            }
            return companion.makeWebSSOAuthenticationContext(str, authenticationState2, authenticationPrompt2, tenant2, map);
        }

        public final SdkSSOAuthenticationContext makeSdkSSOAuthenticationContext(AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, Tenant tenant, Map<String, ? extends Object> map) {
            C19383o.m32797g(authenticationState, "authState");
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
            C19383o.m32797g(tenant, "tenant");
            C19383o.m32797g(map, "serviceMetaData");
            return new C17068x2ee3ea43(tenant, map, authenticationState, authenticationPrompt);
        }

        public final WebSSOAuthenticationContext makeWebSSOAuthenticationContext(String str, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, Tenant tenant, Map<String, ? extends Object> map) {
            C19383o.m32797g(str, "redirectUri");
            C19383o.m32797g(authenticationState, "authState");
            C19383o.m32797g(authenticationPrompt, "loginPrompt");
            C19383o.m32797g(tenant, "tenant");
            C19383o.m32797g(map, "serviceMetaData");
            return new C17069xc11aecdd(str, tenant, authenticationState, authenticationPrompt, map);
        }
    }
}
