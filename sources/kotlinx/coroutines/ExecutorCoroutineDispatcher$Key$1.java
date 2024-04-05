package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements C19857l<CoroutineContext.C19335a, C19834w0> {
    public static final ExecutorCoroutineDispatcher$Key$1 INSTANCE = new ExecutorCoroutineDispatcher$Key$1();

    public ExecutorCoroutineDispatcher$Key$1() {
        super(1);
    }

    public final C19834w0 invoke(CoroutineContext.C19335a aVar) {
        if (aVar instanceof C19834w0) {
            return (C19834w0) aVar;
        }
        return null;
    }
}
