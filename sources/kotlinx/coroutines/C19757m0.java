package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import p768rq.C20152a;

/* renamed from: kotlinx.coroutines.m0 */
public final class C19757m0 implements Executor {

    /* renamed from: b */
    public final CoroutineDispatcher f43716b;

    public C19757m0(C20152a aVar) {
        this.f43716b = aVar;
    }

    public final void execute(Runnable runnable) {
        this.f43716b.mo7108A0(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public final String toString() {
        return this.f43716b.toString();
    }
}
