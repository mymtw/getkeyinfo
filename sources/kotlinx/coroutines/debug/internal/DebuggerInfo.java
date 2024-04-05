package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19474b0;
import kotlinx.coroutines.C19479c0;

public final class DebuggerInfo implements Serializable {
    private final Long coroutineId;
    private final String dispatcher;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final String lastObservedThreadName;
    private final String lastObservedThreadState;
    private final String name;
    private final long sequenceNumber;
    private final String state;

    public DebuggerInfo(C19535b bVar, CoroutineContext coroutineContext) {
        this.coroutineId = ((C19474b0) coroutineContext.get(C19474b0.f43410b)) == null ? null : 0L;
        C19341d dVar = (C19341d) coroutineContext.get(C19341d.C19342a.f43195b);
        this.dispatcher = dVar == null ? null : dVar.toString();
        C19479c0 c0Var = (C19479c0) coroutineContext.get(C19479c0.f43413b);
        this.name = null;
        bVar.getClass();
        this.state = null;
        this.lastObservedThreadState = null;
        this.lastObservedThreadName = null;
        this.lastObservedStackTrace = EmptyList.INSTANCE;
        this.sequenceNumber = 0;
    }

    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    public final String getDispatcher() {
        return this.dispatcher;
    }

    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }
}
