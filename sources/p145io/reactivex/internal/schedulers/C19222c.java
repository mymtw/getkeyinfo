package p145io.reactivex.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p494yp.C13940a;

/* renamed from: io.reactivex.internal.schedulers.c */
public final class C19222c extends C8066r {

    /* renamed from: e */
    public static final RxThreadFactory f42985e;

    /* renamed from: f */
    public static final RxThreadFactory f42986f;

    /* renamed from: g */
    public static final long f42987g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: h */
    public static final TimeUnit f42988h = TimeUnit.SECONDS;

    /* renamed from: i */
    public static final C19225c f42989i;

    /* renamed from: j */
    public static boolean f42990j = Boolean.getBoolean("rx2.io-scheduled-release");

    /* renamed from: k */
    public static final C19223a f42991k;

    /* renamed from: d */
    public final AtomicReference<C19223a> f42992d;

    /* renamed from: io.reactivex.internal.schedulers.c$a */
    public static final class C19223a implements Runnable {

        /* renamed from: b */
        public final long f42993b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue<C19225c> f42994c;

        /* renamed from: d */
        public final C7091a f42995d;

        /* renamed from: e */
        public final ScheduledExecutorService f42996e;

        /* renamed from: f */
        public final ScheduledFuture f42997f;

        /* renamed from: g */
        public final ThreadFactory f42998g;

        public C19223a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f42993b = nanos;
            this.f42994c = new ConcurrentLinkedQueue<>();
            this.f42995d = new C7091a();
            this.f42998g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C19222c.f42986f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f42996e = scheduledExecutorService;
            this.f42997f = scheduledFuture;
        }

        public final void run() {
            if (!this.f42994c.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C19225c> it = this.f42994c.iterator();
                while (it.hasNext()) {
                    C19225c next = it.next();
                    if (next.f43003d > nanoTime) {
                        return;
                    }
                    if (this.f42994c.remove(next)) {
                        this.f42995d.mo19402a(next);
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.c$b */
    public static final class C19224b extends C8066r.C8069c implements Runnable {

        /* renamed from: b */
        public final C7091a f42999b;

        /* renamed from: c */
        public final C19223a f43000c;

        /* renamed from: d */
        public final C19225c f43001d;

        /* renamed from: e */
        public final AtomicBoolean f43002e = new AtomicBoolean();

        public C19224b(C19223a aVar) {
            C19225c cVar;
            C19225c cVar2;
            this.f43000c = aVar;
            this.f42999b = new C7091a();
            if (aVar.f42995d.f15781c) {
                cVar = C19222c.f42989i;
            } else {
                while (true) {
                    if (aVar.f42994c.isEmpty()) {
                        cVar2 = new C19225c(aVar.f42998g);
                        aVar.f42995d.mo19403b(cVar2);
                        break;
                    }
                    cVar2 = aVar.f42994c.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f43001d = cVar;
        }

        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f42999b.f15781c) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f43001d.mo71282c(runnable, j, timeUnit, this.f42999b);
        }

        public final void dispose() {
            if (this.f43002e.compareAndSet(false, true)) {
                this.f42999b.dispose();
                if (C19222c.f42990j) {
                    this.f43001d.mo71282c(this, 0, TimeUnit.NANOSECONDS, (C13940a) null);
                    return;
                }
                C19223a aVar = this.f43000c;
                C19225c cVar = this.f43001d;
                aVar.getClass();
                cVar.f43003d = System.nanoTime() + aVar.f42993b;
                aVar.f42994c.offer(cVar);
            }
        }

        public final boolean isDisposed() {
            return this.f43002e.get();
        }

        public final void run() {
            C19223a aVar = this.f43000c;
            C19225c cVar = this.f43001d;
            aVar.getClass();
            cVar.f43003d = System.nanoTime() + aVar.f42993b;
            aVar.f42994c.offer(cVar);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.c$c */
    public static final class C19225c extends C19227e {

        /* renamed from: d */
        public long f43003d = 0;

        public C19225c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C19225c cVar = new C19225c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f42989i = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f42985e = rxThreadFactory;
        f42986f = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        C19223a aVar = new C19223a(0, (TimeUnit) null, rxThreadFactory);
        f42991k = aVar;
        aVar.f42995d.dispose();
        ScheduledFuture scheduledFuture = aVar.f42997f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f42996e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C19222c() {
        boolean z;
        RxThreadFactory rxThreadFactory = f42985e;
        C19223a aVar = f42991k;
        AtomicReference<C19223a> atomicReference = new AtomicReference<>(aVar);
        this.f42992d = atomicReference;
        C19223a aVar2 = new C19223a(f42987g, f42988h, rxThreadFactory);
        while (true) {
            if (!atomicReference.compareAndSet(aVar, aVar2)) {
                if (atomicReference.get() != aVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            aVar2.f42995d.dispose();
            ScheduledFuture scheduledFuture = aVar2.f42997f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar2.f42996e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C19224b(this.f42992d.get());
    }
}
