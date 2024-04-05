package com.paypal.android.platform.authsdk.authinterface;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@Keep
public final class CoreAuthContext implements ExtendedAuthenticationContext {
    private final AuthenticationState authState;
    private final AuthenticationPrompt loginPrompt;
    private final String publicCredential;
    private final List<TokenType> responseType;
    private final Map<String, Object> serviceMetadata;

    public CoreAuthContext() {
        this((AuthenticationState) null, (AuthenticationPrompt) null, (List) null, (Map) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public CoreAuthContext(AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, List<? extends TokenType> list, Map<String, ? extends Object> map, String str) {
        C19383o.m32797g(authenticationState, "authState");
        C19383o.m32797g(authenticationPrompt, "loginPrompt");
        C19383o.m32797g(list, "responseType");
        C19383o.m32797g(map, "serviceMetadata");
        this.authState = authenticationState;
        this.loginPrompt = authenticationPrompt;
        this.responseType = list;
        this.serviceMetadata = map;
        this.publicCredential = str;
    }

    public static /* synthetic */ CoreAuthContext copy$default(CoreAuthContext coreAuthContext, AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, List<TokenType> list, Map<String, Object> map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            authenticationState = coreAuthContext.getAuthState();
        }
        if ((i & 2) != 0) {
            authenticationPrompt = coreAuthContext.getLoginPrompt();
        }
        AuthenticationPrompt authenticationPrompt2 = authenticationPrompt;
        if ((i & 4) != 0) {
            list = coreAuthContext.getResponseType();
        }
        List<TokenType> list2 = list;
        if ((i & 8) != 0) {
            map = coreAuthContext.getServiceMetadata();
        }
        Map<String, Object> map2 = map;
        if ((i & 16) != 0) {
            str = coreAuthContext.getPublicCredential();
        }
        return coreAuthContext.copy(authenticationState, authenticationPrompt2, list2, map2, str);
    }

    public final AuthenticationState component1() {
        return getAuthState();
    }

    public final AuthenticationPrompt component2() {
        return getLoginPrompt();
    }

    public final List<TokenType> component3() {
        return getResponseType();
    }

    public final Map<String, Object> component4() {
        return getServiceMetadata();
    }

    public final String component5() {
        return getPublicCredential();
    }

    public final CoreAuthContext copy(AuthenticationState authenticationState, AuthenticationPrompt authenticationPrompt, List<? extends TokenType> list, Map<String, ? extends Object> map, String str) {
        C19383o.m32797g(authenticationState, "authState");
        C19383o.m32797g(authenticationPrompt, "loginPrompt");
        C19383o.m32797g(list, "responseType");
        C19383o.m32797g(map, "serviceMetadata");
        return new CoreAuthContext(authenticationState, authenticationPrompt, list, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreAuthContext)) {
            return false;
        }
        CoreAuthContext coreAuthContext = (CoreAuthContext) obj;
        return getAuthState() == coreAuthContext.getAuthState() && getLoginPrompt() == coreAuthContext.getLoginPrompt() && C19383o.m32792b(getResponseType(), coreAuthContext.getResponseType()) && C19383o.m32792b(getServiceMetadata(), coreAuthContext.getServiceMetadata()) && C19383o.m32792b(getPublicCredential(), coreAuthContext.getPublicCredential());
    }

    public AuthenticationState getAuthState() {
        return this.authState;
    }

    public AuthenticationPrompt getLoginPrompt() {
        return this.loginPrompt;
    }

    public String getPublicCredential() {
        return this.publicCredential;
    }

    public List<TokenType> getResponseType() {
        return this.responseType;
    }

    public Map<String, Object> getServiceMetadata() {
        return this.serviceMetadata;
    }

    public int hashCode() {
        int hashCode = getLoginPrompt().hashCode();
        return ((getServiceMetadata().hashCode() + ((getResponseType().hashCode() + ((hashCode + (getAuthState().hashCode() * 31)) * 31)) * 31)) * 31) + (getPublicCredential() == null ? 0 : getPublicCredential().hashCode());
    }

    public String toString() {
        AuthenticationState authState2 = getAuthState();
        AuthenticationPrompt loginPrompt2 = getLoginPrompt();
        List<TokenType> responseType2 = getResponseType();
        Map<String, Object> serviceMetadata2 = getServiceMetadata();
        String publicCredential2 = getPublicCredential();
        StringBuilder sb = new StringBuilder();
        sb.append("CoreAuthContext(authState=");
        sb.append(authState2);
        sb.append(", loginPrompt=");
        sb.append(loginPrompt2);
        sb.append(", responseType=");
        sb.append(responseType2);
        sb.append(", serviceMetadata=");
        sb.append(serviceMetadata2);
        sb.append(", publicCredential=");
        return C0023f.m110k(sb, publicCredential2, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CoreAuthContext(com.paypal.android.platform.authsdk.authinterface.AuthenticationState r4, com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt r5, java.util.List r6, java.util.Map r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            com.paypal.android.platform.authsdk.authinterface.AuthenticationState r4 = com.paypal.android.platform.authsdk.authinterface.AuthenticationState.LoggedIn
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt r5 = com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt.Undefined
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            com.paypal.android.platform.authsdk.authinterface.TokenType r5 = com.paypal.android.platform.authsdk.authinterface.TokenType.AccessToken
            java.util.List r6 = p568fn.C17782b.m29864d0(r5)
        L_0x0017:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0020
            java.util.Map r7 = kotlin.collections.C19294b0.m32559p0()
        L_0x0020:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0026
            r8 = 0
        L_0x0026:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authinterface.CoreAuthContext.<init>(com.paypal.android.platform.authsdk.authinterface.AuthenticationState, com.paypal.android.platform.authsdk.authinterface.AuthenticationPrompt, java.util.List, java.util.Map, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
