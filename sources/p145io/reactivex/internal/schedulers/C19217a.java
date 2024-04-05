package p145io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p494yp.C13941b;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.a */
public final class C19217a extends C8066r {

    /* renamed from: e */
    public static final C19219b f42966e;

    /* renamed from: f */
    public static final RxThreadFactory f42967f;

    /* renamed from: g */
    public static final int f42968g;

    /* renamed from: h */
    public static final C19220c f42969h;

    /* renamed from: d */
    public final AtomicReference<C19219b> f42970d;

    /* renamed from: io.reactivex.internal.schedulers.a$a */
    public static final class C19218a extends C8066r.C8069c {

        /* renamed from: b */
        public final C13941b f42971b;

        /* renamed from: c */
        public final C7091a f42972c;

        /* renamed from: d */
        public final C13941b f42973d;

        /* renamed from: e */
        public final C19220c f42974e;

        /* renamed from: f */
        public volatile boolean f42975f;

        public C19218a(C19220c cVar) {
            this.f42974e = cVar;
            C13941b bVar = new C13941b();
            this.f42971b = bVar;
            C7091a aVar = new C7091a();
            this.f42972c = aVar;
            C13941b bVar2 = new C13941b();
            this.f42973d = bVar2;
            bVar2.mo19403b(bVar);
            bVar2.mo19403b(aVar);
        }

        /* renamed from: a */
        public final Disposable mo20652a(Runnable runnable) {
            if (this.f42975f) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f42974e.mo71282c(runnable, 0, TimeUnit.MILLISECONDS, this.f42971b);
        }

        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f42975f) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f42974e.mo71282c(runnable, j, timeUnit, this.f42972c);
        }

        public final void dispose() {
            if (!this.f42975f) {
                this.f42975f = true;
                this.f42973d.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.f42975f;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$b */
    public static final class C19219b {

        /* renamed from: a */
        public final int f42976a;

        /* renamed from: b */
        public final C19220c[] f42977b;

        /* renamed from: c */
        public long f42978c;

        public C19219b(int i, ThreadFactory threadFactory) {
            this.f42976a = i;
            this.f42977b = new C19220c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f42977b[i2] = new C19220c(threadFactory);
            }
        }

        /* renamed from: a */
        public final C19220c mo71277a() {
            int i = this.f42976a;
            if (i == 0) {
                return C19217a.f42969h;
            }
            C19220c[] cVarArr = this.f42977b;
            long j = this.f42978c;
            this.f42978c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$c */
    public static final class C19220c extends C19227e {
        public C19220c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f42968g = availableProcessors;
        C19220c cVar = new C19220c(new RxThreadFactory("RxComputationShutdown"));
        f42969h = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f42967f = rxThreadFactory;
        C19219b bVar = new C19219b(0, rxThreadFactory);
        f42966e = bVar;
        for (C19220c dispose : bVar.f42977b) {
            dispose.dispose();
        }
    }

    public C19217a() {
        int i;
        boolean z;
        RxThreadFactory rxThreadFactory = f42967f;
        C19219b bVar = f42966e;
        AtomicReference<C19219b> atomicReference = new AtomicReference<>(bVar);
        this.f42970d = atomicReference;
        C19219b bVar2 = new C19219b(f42968g, rxThreadFactory);
        while (true) {
            if (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            for (C19220c dispose : bVar2.f42977b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C19218a(this.f42970d.get().mo71277a());
    }

    /* renamed from: d */
    public final Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C19220c a = this.f42970d.get().mo71277a();
        a.getClass();
        C18981a.m32124c(runnable);
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        if (j <= 0) {
            try {
                future = a.f43006b.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C18981a.m32123b(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = a.f43006b.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: e */
    public final Disposable mo20649e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        C19220c a = this.f42970d.get().mo71277a();
        a.getClass();
        C18981a.m32124c(runnable);
        if (j2 <= 0) {
            C19221b bVar = new C19221b(runnable, a.f43006b);
            if (j <= 0) {
                try {
                    future = a.f43006b.submit(bVar);
                } catch (RejectedExecutionException e) {
                    C18981a.m32123b(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = a.f43006b.schedule(bVar, j, timeUnit);
            }
            bVar.mo71278a(future);
            return bVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.setFuture(a.f43006b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            C18981a.m32123b(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
