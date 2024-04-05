package com.paypal.pyplcheckout.auth;

import kotlin.jvm.internal.C19383o;

public abstract class AuthenticationFailure {
    private final String error;
    private final Exception exception;

    public AuthenticationFailure(String str, Exception exc) {
        C19383o.m32797g(str, "error");
        this.error = str;
        this.exception = exc;
    }

    public final String getError() {
        return this.error;
    }

    public final Exception getException() {
        return this.exception;
    }

    public String toLog() {
        return this.error;
    }
}
