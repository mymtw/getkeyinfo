package com.paypal.pyplcheckout.services;

import kotlin.jvm.internal.C19383o;

public class ApiErrorException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiErrorException(String str) {
        super(str);
        C19383o.m32797g(str, "message");
    }
}
