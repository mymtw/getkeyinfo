package com.facebook.bolts;

public final class UnobservedTaskException extends RuntimeException {
    public UnobservedTaskException(Throwable th) {
        super(th);
    }
}
