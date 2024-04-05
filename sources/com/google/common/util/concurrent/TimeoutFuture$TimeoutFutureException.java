package com.google.common.util.concurrent;

import java.util.concurrent.TimeoutException;

final class TimeoutFuture$TimeoutFutureException extends TimeoutException {
    public TimeoutFuture$TimeoutFutureException(String str, C16396s sVar) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
