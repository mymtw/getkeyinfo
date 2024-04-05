package com.etsy.android.lib.network.oauth2;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OAuth2AuthenticationException extends Throwable {
    public static final int $stable = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OAuth2AuthenticationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2AuthenticationException(String str, Throwable th) {
        super(str, th);
        C19383o.m32797g(str, "message");
    }
}
