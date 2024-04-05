package com.paypal.android.platform.authsdk.authinterface;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AuthenticationKt {
    public static final CoreAuthContext toCoreAuthContext(AuthenticationState authenticationState) {
        C19383o.m32797g(authenticationState, "<this>");
        return new CoreAuthContext(authenticationState, (AuthenticationPrompt) null, (List) null, (Map) null, (String) null, 30, (DefaultConstructorMarker) null);
    }
}
