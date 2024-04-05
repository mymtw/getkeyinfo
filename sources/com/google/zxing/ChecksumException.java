package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: b */
    public static final ChecksumException f37344b;

    static {
        ChecksumException checksumException = new ChecksumException();
        f37344b = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.isStackTrace ? new ChecksumException() : f37344b;
    }

    public ChecksumException(Throwable th) {
        super(th);
    }

    public static ChecksumException getChecksumInstance(Throwable th) {
        return ReaderException.isStackTrace ? new ChecksumException(th) : f37344b;
    }
}
