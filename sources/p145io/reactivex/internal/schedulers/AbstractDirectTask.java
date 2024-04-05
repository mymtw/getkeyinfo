package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;

/* renamed from: io.reactivex.internal.schedulers.AbstractDirectTask */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable {
    public static final FutureTask<Void> DISPOSED;
    public static final FutureTask<Void> FINISHED;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    static {
        Functions.C12960e eVar = Functions.f28538b;
        FINISHED = new FutureTask<>(eVar, (Object) null);
        DISPOSED = new FutureTask<>(eVar, (Object) null);
    }

    public AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != FINISHED && future != (futureTask = DISPOSED) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.runner != Thread.currentThread());
        }
    }

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == FINISHED || future == DISPOSED;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != FINISHED) {
                if (future2 == DISPOSED) {
                    future.cancel(this.runner != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
