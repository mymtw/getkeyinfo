package p145io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.functions.Functions;

/* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable */
final class ExecutorScheduler$DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable {
    private static final long serialVersionUID = -4101336210206799084L;
    public final SequentialDisposable direct = new SequentialDisposable();
    public final SequentialDisposable timed = new SequentialDisposable();

    public ExecutorScheduler$DelayedRunnable(Runnable runnable) {
        super(runnable);
    }

    public void dispose() {
        if (getAndSet((Object) null) != null) {
            this.timed.dispose();
            this.direct.dispose();
        }
    }

    public Runnable getWrappedRunnable() {
        Runnable runnable = (Runnable) get();
        return runnable != null ? runnable : Functions.f28538b;
    }

    public boolean isDisposed() {
        return get() == null;
    }

    public void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet((Object) null);
                SequentialDisposable sequentialDisposable = this.timed;
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                sequentialDisposable.lazySet(disposableHelper);
                this.direct.lazySet(disposableHelper);
            } catch (Throwable th) {
                lazySet((Object) null);
                this.timed.lazySet(DisposableHelper.DISPOSED);
                this.direct.lazySet(DisposableHelper.DISPOSED);
                throw th;
            }
        }
    }
}
