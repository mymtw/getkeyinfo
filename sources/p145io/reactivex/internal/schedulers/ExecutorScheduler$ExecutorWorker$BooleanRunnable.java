package p145io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable */
final class ExecutorScheduler$ExecutorWorker$BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
    private static final long serialVersionUID = -2421395018820541164L;
    public final Runnable actual;

    public ExecutorScheduler$ExecutorWorker$BooleanRunnable(Runnable runnable) {
        this.actual = runnable;
    }

    public void dispose() {
        lazySet(true);
    }

    public boolean isDisposed() {
        return get();
    }

    public void run() {
        if (!get()) {
            try {
                this.actual.run();
            } finally {
                lazySet(true);
            }
        }
    }
}
