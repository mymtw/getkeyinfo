package p145io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.disposables.Disposable;
import p494yp.C13940a;

/* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$InterruptibleRunnable */
final class ExecutorScheduler$ExecutorWorker$InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {
    public static final int FINISHED = 2;
    public static final int INTERRUPTED = 4;
    public static final int INTERRUPTING = 3;
    public static final int READY = 0;
    public static final int RUNNING = 1;
    private static final long serialVersionUID = -3603436687413320876L;
    public final Runnable run;
    public final C13940a tasks;
    public volatile Thread thread;

    public ExecutorScheduler$ExecutorWorker$InterruptibleRunnable(Runnable runnable, C13940a aVar) {
        this.run = runnable;
        this.tasks = aVar;
    }

    public void cleanup() {
        C13940a aVar = this.tasks;
        if (aVar != null) {
            aVar.mo19404c(this);
        }
    }

    public void dispose() {
        while (true) {
            int i = get();
            if (i < 2) {
                if (i == 0) {
                    if (compareAndSet(0, 4)) {
                        cleanup();
                        return;
                    }
                } else if (compareAndSet(1, 3)) {
                    Thread thread2 = this.thread;
                    if (thread2 != null) {
                        thread2.interrupt();
                        this.thread = null;
                    }
                    set(4);
                    cleanup();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public boolean isDisposed() {
        return get() >= 2;
    }

    public void run() {
        if (get() == 0) {
            this.thread = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.run.run();
                    this.thread = null;
                    if (compareAndSet(1, 2)) {
                        cleanup();
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } catch (Throwable th) {
                    this.thread = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        cleanup();
                    }
                    throw th;
                }
            } else {
                this.thread = null;
            }
        }
    }
}
