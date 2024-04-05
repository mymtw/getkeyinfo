package com.cardinalcommerce.shared.models.exceptions;

public class InvalidInputException extends RuntimeException {

    /* renamed from: a */
    private final String f14063a;

    /* renamed from: b */
    private final Throwable f14064b;

    public InvalidInputException(String str, Throwable th) {
        this.f14063a = str;
        this.f14064b = th;
    }

    public Throwable getCause() {
        return this.f14064b;
    }

    public String getMessage() {
        return this.f14063a;
    }
}
