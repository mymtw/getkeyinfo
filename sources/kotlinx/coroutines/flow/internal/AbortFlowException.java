package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.C19600e;

public final class AbortFlowException extends CancellationException {
    private final C19600e<?> owner;

    public AbortFlowException(C19600e<?> eVar) {
        super("Flow was aborted, no more elements needed");
        this.owner = eVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final C19600e<?> getOwner() {
        return this.owner;
    }
}
