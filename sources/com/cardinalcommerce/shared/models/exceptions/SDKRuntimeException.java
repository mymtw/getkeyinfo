package com.cardinalcommerce.shared.models.exceptions;

public class SDKRuntimeException extends RuntimeException {

    /* renamed from: a */
    private final String f14069a;

    /* renamed from: b */
    private final Throwable f14070b;

    public SDKRuntimeException(String str, Throwable th) {
        this.f14069a = str;
        this.f14070b = th;
    }

    public Throwable getCause() {
        return this.f14070b;
    }

    public String getMessage() {
        return this.f14069a;
    }
}
