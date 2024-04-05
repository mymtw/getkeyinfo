package p145io.reactivex.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p145io.reactivex.disposables.C7092b;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.schedulers.h */
public final class C19232h extends C8066r {

    /* renamed from: d */
    public static final /* synthetic */ int f43017d = 0;

    /* renamed from: io.reactivex.internal.schedulers.h$a */
    public static final class C19233a implements Runnable {

        /* renamed from: b */
        public final Runnable f43018b;

        /* renamed from: c */
        public final C19235c f43019c;

        /* renamed from: d */
        public final long f43020d;

        public C19233a(Runnable runnable, C19235c cVar, long j) {
            this.f43018b = runnable;
            this.f43019c = cVar;
            this.f43020d = j;
        }

        public final void run() {
            if (!this.f43019c.f43028e) {
                C19235c cVar = this.f43019c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar.getClass();
                long a = C8066r.m16244a(timeUnit);
                long j = this.f43020d;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C18981a.m32123b(e);
                        return;
                    }
                }
                if (!this.f43019c.f43028e) {
                    this.f43018b.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.h$b */
    public static final class C19234b implements Comparable<C19234b> {

        /* renamed from: b */
        public final Runnable f43021b;

        /* renamed from: c */
        public final long f43022c;

        /* renamed from: d */
        public final int f43023d;

        /* renamed from: e */
        public volatile boolean f43024e;

        public C19234b(Runnable runnable, Long l, int i) {
            this.f43021b = runnable;
            this.f43022c = l.longValue();
            this.f43023d = i;
        }

        public final int compareTo(Object obj) {
            C19234b bVar = (C19234b) obj;
            int i = (this.f43022c > bVar.f43022c ? 1 : (this.f43022c == bVar.f43022c ? 0 : -1));
            int i2 = 1;
            int i3 = i < 0 ? -1 : i > 0 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            int i4 = this.f43023d;
            int i5 = bVar.f43023d;
            if (i4 < i5) {
                i2 = -1;
            } else if (i4 <= i5) {
                i2 = 0;
            }
            return i2;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.h$c */
    public static final class C19235c extends C8066r.C8069c {

        /* renamed from: b */
        public final PriorityBlockingQueue<C19234b> f43025b = new PriorityBlockingQueue<>();

        /* renamed from: c */
        public final AtomicInteger f43026c = new AtomicInteger();

        /* renamed from: d */
        public final AtomicInteger f43027d = new AtomicInteger();

        /* renamed from: e */
        public volatile boolean f43028e;

        /* renamed from: io.reactivex.internal.schedulers.h$c$a */
        public final class C19236a implements Runnable {

            /* renamed from: b */
            public final C19234b f43029b;

            public C19236a(C19234b bVar) {
                this.f43029b = bVar;
            }

            public final void run() {
                this.f43029b.f43024e = true;
                C19235c.this.f43025b.remove(this.f43029b);
            }
        }

        /* renamed from: a */
        public final Disposable mo20652a(Runnable runnable) {
            return mo71286c(runnable, C8066r.m16244a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + C8066r.m16244a(TimeUnit.MILLISECONDS);
            return mo71286c(new C19233a(runnable, this, millis), millis);
        }

        /* renamed from: c */
        public final Disposable mo71286c(Runnable runnable, long j) {
            if (this.f43028e) {
                return EmptyDisposable.INSTANCE;
            }
            C19234b bVar = new C19234b(runnable, Long.valueOf(j), this.f43027d.incrementAndGet());
            this.f43025b.add(bVar);
            if (this.f43026c.getAndIncrement() != 0) {
                return C7092b.m13751b(new C19236a(bVar));
            }
            int i = 1;
            while (!this.f43028e) {
                C19234b poll = this.f43025b.poll();
                if (poll == null) {
                    i = this.f43026c.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.f43024e) {
                    poll.f43021b.run();
                }
            }
            this.f43025b.clear();
            return EmptyDisposable.INSTANCE;
        }

        public final void dispose() {
            this.f43028e = true;
        }

        public final boolean isDisposed() {
            return this.f43028e;
        }
    }

    static {
        new C19232h();
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        return new C19235c();
    }

    /* renamed from: c */
    public final Disposable mo20647c(Runnable runnable) {
        C18981a.m32124c(runnable);
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: d */
    public final Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C18981a.m32124c(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C18981a.m32123b(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
