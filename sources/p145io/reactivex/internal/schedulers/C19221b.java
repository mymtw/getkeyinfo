package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.b */
public final class C19221b implements Callable<Void>, Disposable {

    /* renamed from: g */
    public static final FutureTask<Void> f42979g = new FutureTask<>(Functions.f28538b, (Object) null);

    /* renamed from: b */
    public final Runnable f42980b;

    /* renamed from: c */
    public final AtomicReference<Future<?>> f42981c = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicReference<Future<?>> f42982d = new AtomicReference<>();

    /* renamed from: e */
    public final ExecutorService f42983e;

    /* renamed from: f */
    public Thread f42984f;

    public C19221b(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f42980b = runnable;
        this.f42983e = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo71278a(Future<?> future) {
        boolean z;
        do {
            Future<?> future2 = this.f42982d.get();
            z = false;
            if (future2 != f42979g) {
                AtomicReference<Future<?>> atomicReference = this.f42982d;
                while (true) {
                    if (!atomicReference.compareAndSet(future2, future)) {
                        if (atomicReference.get() != future2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (this.f42984f != Thread.currentThread()) {
                    z = true;
                }
                future.cancel(z);
                return;
            }
        } while (!z);
    }

    public final Object call() throws Exception {
        this.f42984f = Thread.currentThread();
        try {
            this.f42980b.run();
            Future submit = this.f42983e.submit(this);
            while (true) {
                Future<?> future = this.f42981c.get();
                boolean z = false;
                if (future != f42979g) {
                    AtomicReference<Future<?>> atomicReference = this.f42981c;
                    while (true) {
                        if (!atomicReference.compareAndSet(future, submit)) {
                            if (atomicReference.get() != future) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    if (this.f42984f != Thread.currentThread()) {
                        z = true;
                    }
                    submit.cancel(z);
                }
            }
            this.f42984f = null;
        } catch (Throwable th) {
            this.f42984f = null;
            C18981a.m32123b(th);
        }
        return null;
    }

    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f42982d;
        Future future = f42979g;
        Future andSet = atomicReference.getAndSet(future);
        boolean z = true;
        if (!(andSet == null || andSet == future)) {
            andSet.cancel(this.f42984f != Thread.currentThread());
        }
        Future andSet2 = this.f42981c.getAndSet(future);
        if (andSet2 != null && andSet2 != future) {
            if (this.f42984f == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }

    public final boolean isDisposed() {
        return this.f42982d.get() == f42979g;
    }
}
