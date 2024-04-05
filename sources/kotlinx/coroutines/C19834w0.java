package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: kotlinx.coroutines.w0 */
public abstract class C19834w0 extends CoroutineDispatcher implements Closeable {
    static {
        CoroutineDispatcher.Key key = CoroutineDispatcher.f43392b;
        ExecutorCoroutineDispatcher$Key$1 executorCoroutineDispatcher$Key$1 = ExecutorCoroutineDispatcher$Key$1.INSTANCE;
        C19383o.m32797g(key, "baseKey");
        C19383o.m32797g(executorCoroutineDispatcher$Key$1, "safeCast");
    }

    /* renamed from: E0 */
    public abstract Executor mo72680E0();
}
