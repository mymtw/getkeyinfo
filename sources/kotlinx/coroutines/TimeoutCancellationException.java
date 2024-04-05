package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

public final class TimeoutCancellationException extends CancellationException {
    public final C19699g1 coroutine;

    public TimeoutCancellationException(String str, C19699g1 g1Var) {
        super(str);
        this.coroutine = g1Var;
    }

    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, (C19699g1) null);
    }
}
