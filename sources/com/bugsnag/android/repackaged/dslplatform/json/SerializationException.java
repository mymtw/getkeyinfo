package com.bugsnag.android.repackaged.dslplatform.json;

public class SerializationException extends RuntimeException {
    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(Throwable th) {
        super(th);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }
}
