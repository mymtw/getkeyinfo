package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.services.ApiErrorException;
import p003a2.C0015b;

public final class AddCardAuthenticationException extends ApiErrorException {
    private final int errorCode;

    public AddCardAuthenticationException(int i) {
        super(C0015b.m88g("AddCardAuthenticationException : ", i));
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
