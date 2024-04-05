package com.cardinalcommerce.shared.models.exceptions;

public class SDKAlreadyInitializedException extends RuntimeException {

    /* renamed from: a */
    private final String f14065a;

    /* renamed from: b */
    private final Throwable f14066b;

    public SDKAlreadyInitializedException(String str, Throwable th) {
        this.f14065a = str;
        this.f14066b = th;
    }

    public Throwable getCause() {
        return this.f14066b;
    }

    public String getMessage() {
        return this.f14065a;
    }
}
