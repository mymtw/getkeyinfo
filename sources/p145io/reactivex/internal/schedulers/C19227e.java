package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p494yp.C13940a;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.e */
public class C19227e extends C8066r.C8069c {

    /* renamed from: b */
    public final ScheduledExecutorService f43006b;

    /* renamed from: c */
    public volatile boolean f43007c;

    public C19227e(ThreadFactory threadFactory) {
        boolean z = C19228f.f43008a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (C19228f.f43008a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C19228f.f43011d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f43006b = newScheduledThreadPool;
    }

    /* renamed from: a */
    public final Disposable mo20652a(Runnable runnable) {
        return mo20653b(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: b */
    public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f43007c ? EmptyDisposable.INSTANCE : mo71282c(runnable, j, timeUnit, (C13940a) null);
    }

    /* renamed from: c */
    public final ScheduledRunnable mo71282c(Runnable runnable, long j, TimeUnit timeUnit, C13940a aVar) {
        Future future;
        C18981a.m32124c(runnable);
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, aVar);
        if (aVar != null && !aVar.mo19403b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.f43006b.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo19402a(scheduledRunnable);
                }
                C18981a.m32123b(e);
            }
        } else {
            future = this.f43006b.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.setFuture(future);
        return scheduledRunnable;
    }

    public final void dispose() {
        if (!this.f43007c) {
            this.f43007c = true;
            this.f43006b.shutdownNow();
        }
    }

    public final boolean isDisposed() {
        return this.f43007c;
    }
}
