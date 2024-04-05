package p248tp;

import java.util.concurrent.TimeUnit;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.schedulers.C19227e;
import p145io.reactivex.internal.util.ExceptionHelper;
import p736cq.C18981a;

/* renamed from: tp.r */
public abstract class C8066r {

    /* renamed from: b */
    public static boolean f17576b = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: c */
    public static final long f17577c = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: tp.r$a */
    public static final class C8067a implements Disposable, Runnable {

        /* renamed from: b */
        public final Runnable f17578b;

        /* renamed from: c */
        public final C8069c f17579c;

        /* renamed from: d */
        public Thread f17580d;

        public C8067a(Runnable runnable, C8069c cVar) {
            this.f17578b = runnable;
            this.f17579c = cVar;
        }

        public final void dispose() {
            if (this.f17580d == Thread.currentThread()) {
                C8069c cVar = this.f17579c;
                if (cVar instanceof C19227e) {
                    C19227e eVar = (C19227e) cVar;
                    if (!eVar.f43007c) {
                        eVar.f43007c = true;
                        eVar.f43006b.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f17579c.dispose();
        }

        public final boolean isDisposed() {
            return this.f17579c.isDisposed();
        }

        public final void run() {
            this.f17580d = Thread.currentThread();
            try {
                this.f17578b.run();
            } finally {
                dispose();
                this.f17580d = null;
            }
        }
    }

    /* renamed from: tp.r$b */
    public static final class C8068b implements Disposable, Runnable {

        /* renamed from: b */
        public final Runnable f17581b;

        /* renamed from: c */
        public final C8069c f17582c;

        /* renamed from: d */
        public volatile boolean f17583d;

        public C8068b(Runnable runnable, C8069c cVar) {
            this.f17581b = runnable;
            this.f17582c = cVar;
        }

        public final void dispose() {
            this.f17583d = true;
            this.f17582c.dispose();
        }

        public final boolean isDisposed() {
            return this.f17583d;
        }

        public final void run() {
            if (!this.f17583d) {
                try {
                    this.f17581b.run();
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.f17582c.dispose();
                    throw ExceptionHelper.m32485d(th);
                }
            }
        }
    }

    /* renamed from: tp.r$c */
    public static abstract class C8069c implements Disposable {

        /* renamed from: tp.r$c$a */
        public final class C8070a implements Runnable {

            /* renamed from: b */
            public final Runnable f17584b;

            /* renamed from: c */
            public final SequentialDisposable f17585c;

            /* renamed from: d */
            public final long f17586d;

            /* renamed from: e */
            public long f17587e;

            /* renamed from: f */
            public long f17588f;

            /* renamed from: g */
            public long f17589g;

            public C8070a(long j, C8068b bVar, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.f17584b = bVar;
                this.f17585c = sequentialDisposable;
                this.f17586d = j3;
                this.f17588f = j2;
                this.f17589g = j;
            }

            public final void run() {
                long j;
                this.f17584b.run();
                if (!this.f17585c.isDisposed()) {
                    C8069c cVar = C8069c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    cVar.getClass();
                    long a = C8066r.m16244a(timeUnit);
                    long j2 = C8066r.f17577c;
                    long j3 = this.f17588f;
                    if (a + j2 >= j3) {
                        long j4 = this.f17586d;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f17589g;
                            long j6 = this.f17587e + 1;
                            this.f17587e = j6;
                            j = (j6 * j4) + j5;
                            this.f17588f = a;
                            this.f17585c.replace(C8069c.this.mo20653b(this, j - a, timeUnit));
                        }
                    }
                    long j7 = this.f17586d;
                    j = a + j7;
                    long j8 = this.f17587e + 1;
                    this.f17587e = j8;
                    this.f17589g = j - (j7 * j8);
                    this.f17588f = a;
                    this.f17585c.replace(C8069c.this.mo20653b(this, j - a, timeUnit));
                }
            }
        }

        /* renamed from: a */
        public Disposable mo20652a(Runnable runnable) {
            return mo20653b(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: b */
        public abstract Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public static long m16244a(TimeUnit timeUnit) {
        return !f17576b ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public abstract C8069c mo20646b();

    /* renamed from: c */
    public Disposable mo20647c(Runnable runnable) {
        return mo20648d(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: d */
    public Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        C8069c b = mo20646b();
        C18981a.m32124c(runnable);
        C8067a aVar = new C8067a(runnable, b);
        b.mo20653b(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: e */
    public Disposable mo20649e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        C8069c b = mo20646b();
        C18981a.m32124c(runnable);
        C8068b bVar = new C8068b(runnable, b);
        b.getClass();
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
        long nanos = timeUnit2.toNanos(j2);
        long a = m16244a(TimeUnit.NANOSECONDS);
        SequentialDisposable sequentialDisposable3 = sequentialDisposable2;
        C8068b bVar2 = bVar;
        C8069c.C8070a aVar = r3;
        C8069c.C8070a aVar2 = new C8069c.C8070a(timeUnit2.toNanos(j3) + a, bVar, a, sequentialDisposable2, nanos);
        Disposable b2 = b.mo20653b(aVar, j3, timeUnit2);
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (b2 != emptyDisposable) {
            sequentialDisposable.replace(b2);
            b2 = sequentialDisposable3;
        }
        return b2 == emptyDisposable ? b2 : bVar2;
    }
}
