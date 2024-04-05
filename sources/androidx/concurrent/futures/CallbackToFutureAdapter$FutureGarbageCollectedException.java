package androidx.concurrent.futures;

final class CallbackToFutureAdapter$FutureGarbageCollectedException extends Throwable {
    public CallbackToFutureAdapter$FutureGarbageCollectedException(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
