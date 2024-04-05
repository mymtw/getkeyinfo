package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: b */
    public static final FormatException f37345b;

    static {
        FormatException formatException = new FormatException();
        f37345b = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : f37345b;
    }

    public FormatException(Throwable th) {
        super(th);
    }

    public static FormatException getFormatInstance(Throwable th) {
        return ReaderException.isStackTrace ? new FormatException(th) : f37345b;
    }
}
