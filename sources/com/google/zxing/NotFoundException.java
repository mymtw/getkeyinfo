package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: b */
    public static final NotFoundException f37346b;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f37346b = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return f37346b;
    }
}
