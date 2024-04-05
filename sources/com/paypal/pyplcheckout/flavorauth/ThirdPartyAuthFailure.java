package com.paypal.pyplcheckout.flavorauth;

import com.paypal.pyplcheckout.auth.AuthenticationFailure;
import kotlin.jvm.internal.C19383o;

public final class ThirdPartyAuthFailure extends AuthenticationFailure {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyAuthFailure(String str, Exception exc) {
        super(str, exc);
        C19383o.m32797g(str, "error");
    }
}
