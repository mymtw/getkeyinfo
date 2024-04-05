package com.cardinalcommerce.shared.models.exceptions;

public class SDKNotInitializedException extends RuntimeException {

    /* renamed from: a */
    private final String f14067a;

    /* renamed from: b */
    private final Throwable f14068b;

    public SDKNotInitializedException(String str, Throwable th) {
        this.f14067a = str;
        this.f14068b = th;
    }

    public Throwable getCause() {
        return this.f14068b;
    }

    public String getMessage() {
        return this.f14067a;
    }
}
