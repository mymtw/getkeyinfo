package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.g */
public final class C19230g extends C8066r {

    /* renamed from: e */
    public static final RxThreadFactory f43012e = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    public final AtomicReference<ScheduledExecutorService> f43013d;

    /* renamed from: io.reactivex.internal.schedulers.g$a */
    public static final class C19231a extends C8066r.C8069c {

        /* renamed from: b */
        public final ScheduledExecutorService f43014b;

        /* renamed from: c */
        public final C7091a f43015c = new C7091a();

        /* renamed from: d */
        public volatile boolean f43016d;

        public C19231a(ScheduledExecutorService scheduledExecutorService) {
            this.f43014b = scheduledExecutorService;
        }

        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f43016d) {
                return EmptyDisposable.INSTANCE;
            }
            C18981a.m32124c(runnable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f43015c);
            this.f43015c.mo19403b(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f43014b.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C18981a.m32123b(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f43014b.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }

        public final void dispose() {
            if (!this.f43016d) {
                this.f43016d = true;
                this.f43015c.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.f43016d;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
    }

    public C19230g() {
        RxThreadFactory rxThreadFactory = f43012e;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f43013d = atomicReference;
        boolean z = C19228f.f43008a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (C19228f.f43008a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C19228f.f43011d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C19231a(this.f43013d.get());
    }

    /* renamed from: d */
    public final Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C18981a.m32124c(runnable);
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        if (j <= 0) {
            try {
                future = this.f43013d.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C18981a.m32123b(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f43013d.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: e */
    public final Disposable mo20649e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        C18981a.m32124c(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f43013d.get();
            C19221b bVar = new C19221b(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(bVar);
                } catch (RejectedExecutionException e) {
                    C18981a.m32123b(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(bVar, j, timeUnit);
            }
            bVar.mo71278a(future);
            return bVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f43013d.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            C18981a.m32123b(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
