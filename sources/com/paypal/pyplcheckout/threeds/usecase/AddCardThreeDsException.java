package com.paypal.pyplcheckout.threeds.usecase;

import kotlin.jvm.internal.C19383o;

public final class AddCardThreeDsException extends Exception {
    private final String message;

    public AddCardThreeDsException(String str) {
        C19383o.m32797g(str, "message");
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}
