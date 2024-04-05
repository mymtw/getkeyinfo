package com.paypal.checkout.merchanttoken;

import kotlin.jvm.internal.C19383o;

public final class CreateLsatTokenException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLsatTokenException(String str, Throwable th) {
        super("Unable to create the LSAT Token for the given Client ID: " + str, th);
        C19383o.m32797g(str, "clientId");
        C19383o.m32797g(th, "cause");
    }
}
