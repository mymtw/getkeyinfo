package androidx.concurrent.futures;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.common.util.concurrent.C16388l;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p010a9.C0048b;

public abstract class AbstractResolvableFuture<V> implements C16388l<V> {

    /* renamed from: e */
    public static final boolean f4737e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f4738f = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: g */
    public static final C2097a f4739g;

    /* renamed from: h */
    public static final Object f4740h = new Object();

    /* renamed from: b */
    public volatile Object f4741b;

    /* renamed from: c */
    public volatile C2099c f4742c;

    /* renamed from: d */
    public volatile C2103g f4743d;

    public static final class Failure {

        /* renamed from: a */
        public final Throwable f4744a;

        static {
            new Failure(new Throwable("Failure occurred while trying to finish a future.") {
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th) {
            boolean z = AbstractResolvableFuture.f4737e;
            th.getClass();
            this.f4744a = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$a */
    public static abstract class C2097a {
        /* renamed from: a */
        public abstract boolean mo7990a(AbstractResolvableFuture<?> abstractResolvableFuture, C2099c cVar, C2099c cVar2);

        /* renamed from: b */
        public abstract boolean mo7991b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo7992c(AbstractResolvableFuture<?> abstractResolvableFuture, C2103g gVar, C2103g gVar2);

        /* renamed from: d */
        public abstract void mo7993d(C2103g gVar, C2103g gVar2);

        /* renamed from: e */
        public abstract void mo7994e(C2103g gVar, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    public static final class C2098b {

        /* renamed from: b */
        public static final C2098b f4745b;

        /* renamed from: c */
        public static final C2098b f4746c;

        /* renamed from: a */
        public final Throwable f4747a;

        static {
            if (AbstractResolvableFuture.f4737e) {
                f4746c = null;
                f4745b = null;
                return;
            }
            f4746c = new C2098b((Throwable) null, false);
            f4745b = new C2098b((Throwable) null, true);
        }

        public C2098b(Throwable th, boolean z) {
            this.f4747a = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    public static final class C2099c {

        /* renamed from: d */
        public static final C2099c f4748d = new C2099c((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f4749a;

        /* renamed from: b */
        public final Executor f4750b;

        /* renamed from: c */
        public C2099c f4751c;

        public C2099c(Runnable runnable, Executor executor) {
            this.f4749a = runnable;
            this.f4750b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    public static final class C2100d extends C2097a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C2103g, Thread> f4752a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C2103g, C2103g> f4753b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2103g> f4754c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2099c> f4755d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f4756e;

        public C2100d(AtomicReferenceFieldUpdater<C2103g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C2103g, C2103g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2103g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2099c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f4752a = atomicReferenceFieldUpdater;
            this.f4753b = atomicReferenceFieldUpdater2;
            this.f4754c = atomicReferenceFieldUpdater3;
            this.f4755d = atomicReferenceFieldUpdater4;
            this.f4756e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final boolean mo7990a(AbstractResolvableFuture<?> abstractResolvableFuture, C2099c cVar, C2099c cVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2099c> atomicReferenceFieldUpdater = this.f4755d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != cVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo7991b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f4756e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo7992c(AbstractResolvableFuture<?> abstractResolvableFuture, C2103g gVar, C2103g gVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C2103g> atomicReferenceFieldUpdater = this.f4754c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, gVar, gVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractResolvableFuture) != gVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public final void mo7993d(C2103g gVar, C2103g gVar2) {
            this.f4753b.lazySet(gVar, gVar2);
        }

        /* renamed from: e */
        public final void mo7994e(C2103g gVar, Thread thread) {
            this.f4752a.lazySet(gVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    public static final class C2101e<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    public static final class C2102f extends C2097a {
        /* renamed from: a */
        public final boolean mo7990a(AbstractResolvableFuture<?> abstractResolvableFuture, C2099c cVar, C2099c cVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4742c != cVar) {
                    return false;
                }
                abstractResolvableFuture.f4742c = cVar2;
                return true;
            }
        }

        /* renamed from: b */
        public final boolean mo7991b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4741b != obj) {
                    return false;
                }
                abstractResolvableFuture.f4741b = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo7992c(AbstractResolvableFuture<?> abstractResolvableFuture, C2103g gVar, C2103g gVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4743d != gVar) {
                    return false;
                }
                abstractResolvableFuture.f4743d = gVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final void mo7993d(C2103g gVar, C2103g gVar2) {
            gVar.f4759b = gVar2;
        }

        /* renamed from: e */
        public final void mo7994e(C2103g gVar, Thread thread) {
            gVar.f4758a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    public static final class C2103g {

        /* renamed from: c */
        public static final C2103g f4757c = new C2103g(0);

        /* renamed from: a */
        public volatile Thread f4758a;

        /* renamed from: b */
        public volatile C2103g f4759b;

        public C2103g(int i) {
        }

        public C2103g() {
            AbstractResolvableFuture.f4739g.mo7994e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$g> r0 = androidx.concurrent.futures.AbstractResolvableFuture.C2103g.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4737e = r1
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r1 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4738f = r1
            androidx.concurrent.futures.AbstractResolvableFuture$d r1 = new androidx.concurrent.futures.AbstractResolvableFuture$d     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r2 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r5 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$c> r2 = androidx.concurrent.futures.AbstractResolvableFuture.C2099c.class
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$f r1 = new androidx.concurrent.futures.AbstractResolvableFuture$f
            r1.<init>()
        L_0x0054:
            f4739g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f4738f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4740h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.<clinit>():void");
    }

    /* renamed from: b */
    public static void m4528b(AbstractResolvableFuture<?> abstractResolvableFuture) {
        C2103g gVar;
        C2099c cVar;
        do {
            gVar = abstractResolvableFuture.f4743d;
        } while (!f4739g.mo7992c(abstractResolvableFuture, gVar, C2103g.f4757c));
        while (gVar != null) {
            Thread thread = gVar.f4758a;
            if (thread != null) {
                gVar.f4758a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f4759b;
        }
        do {
            cVar = abstractResolvableFuture.f4742c;
        } while (!f4739g.mo7990a(abstractResolvableFuture, cVar, C2099c.f4748d));
        C2099c cVar2 = null;
        while (cVar != null) {
            C2099c cVar3 = cVar.f4751c;
            cVar.f4751c = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            C2099c cVar4 = cVar2.f4751c;
            Runnable runnable = cVar2.f4749a;
            if (!(runnable instanceof C2101e)) {
                m4529c(runnable, cVar2.f4750b);
                cVar2 = cVar4;
            } else {
                ((C2101e) runnable).getClass();
                throw null;
            }
        }
    }

    /* renamed from: c */
    public static void m4529c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f4738f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: a */
    public final void mo7978a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final boolean cancel(boolean z) {
        Object obj = this.f4741b;
        if ((obj == null) || (obj instanceof C2101e)) {
            C2098b bVar = f4737e ? new C2098b(new CancellationException("Future.cancel() was called."), z) : z ? C2098b.f4745b : C2098b.f4746c;
            while (!f4739g.mo7991b(this, obj, bVar)) {
                obj = this.f4741b;
                if (!(obj instanceof C2101e)) {
                }
            }
            m4528b(this);
            if (!(obj instanceof C2101e)) {
                return true;
            }
            ((C2101e) obj).getClass();
            throw null;
        }
        return false;
    }

    /* renamed from: d */
    public final V mo7980d(Object obj) throws ExecutionException {
        if (obj instanceof C2098b) {
            Throwable th = ((C2098b) obj).f4747a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f4744a);
        } else if (obj == f4740h) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: e */
    public final void mo7981e(Runnable runnable, Executor executor) {
        executor.getClass();
        C2099c cVar = this.f4742c;
        if (cVar != C2099c.f4748d) {
            C2099c cVar2 = new C2099c(runnable, executor);
            do {
                cVar2.f4751c = cVar;
                if (!f4739g.mo7990a(this, cVar, cVar2)) {
                    cVar = this.f4742c;
                } else {
                    return;
                }
            } while (cVar != C2099c.f4748d);
        }
        m4529c(runnable, executor);
    }

    /* renamed from: f */
    public final String mo7982f() {
        Object obj = this.f4741b;
        if (obj instanceof C2101e) {
            StringBuilder h = C0072d.m201h("setFuture=[");
            ((C2101e) obj).getClass();
            h.append("null");
            h.append("]");
            return h.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder h2 = C0072d.m201h("remaining delay=[");
            h2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            h2.append(" ms]");
            return h2.toString();
        }
    }

    /* renamed from: g */
    public final void mo7983g(C2103g gVar) {
        gVar.f4758a = null;
        while (true) {
            C2103g gVar2 = this.f4743d;
            if (gVar2 != C2103g.f4757c) {
                C2103g gVar3 = null;
                while (gVar2 != null) {
                    C2103g gVar4 = gVar2.f4759b;
                    if (gVar2.f4758a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f4759b = gVar4;
                        if (gVar3.f4758a == null) {
                        }
                    } else if (!f4739g.mo7992c(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4741b;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C2101e))) {
                return mo7980d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C2103g gVar = this.f4743d;
                if (gVar != C2103g.f4757c) {
                    C2103g gVar2 = new C2103g();
                    do {
                        C2097a aVar = f4739g;
                        aVar.mo7993d(gVar2, gVar);
                        if (aVar.mo7992c(this, gVar, gVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4741b;
                                    if ((obj2 != null) && (!(obj2 instanceof C2101e))) {
                                        return mo7980d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo7983g(gVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo7983g(gVar2);
                        } else {
                            gVar = this.f4743d;
                        }
                    } while (gVar != C2103g.f4757c);
                }
                return mo7980d(this.f4741b);
            }
            while (nanos > 0) {
                Object obj3 = this.f4741b;
                if ((obj3 != null) && (!(obj3 instanceof C2101e))) {
                    return mo7980d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractResolvableFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String i = C0326j.m864i(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i2 != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i2 > 0) {
                    String str2 = i + convert + " " + lowerCase;
                    if (z) {
                        str2 = C0326j.m864i(str2, ",");
                    }
                    i = C0326j.m864i(str2, " ");
                }
                if (z) {
                    i = i + nanos2 + " nanoseconds ";
                }
                str = C0326j.m864i(i, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(C0326j.m864i(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(C0048b.m163a(str, " for ", abstractResolvableFuture));
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f4741b instanceof C2098b;
    }

    public final boolean isDone() {
        Object obj = this.f4741b;
        return (!(obj instanceof C2101e)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4741b instanceof C2098b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo7978a(sb);
        } else {
            try {
                str = mo7982f();
            } catch (RuntimeException e) {
                StringBuilder h = C0072d.m201h("Exception thrown from implementation: ");
                h.append(e.getClass());
                str = h.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo7978a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4741b;
            if ((obj2 != null) && (!(obj2 instanceof C2101e))) {
                return mo7980d(obj2);
            }
            C2103g gVar = this.f4743d;
            if (gVar != C2103g.f4757c) {
                C2103g gVar2 = new C2103g();
                do {
                    C2097a aVar = f4739g;
                    aVar.mo7993d(gVar2, gVar);
                    if (aVar.mo7992c(this, gVar, gVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4741b;
                            } else {
                                mo7983g(gVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C2101e))));
                        return mo7980d(obj);
                    }
                    gVar = this.f4743d;
                } while (gVar != C2103g.f4757c);
            }
            return mo7980d(this.f4741b);
        }
        throw new InterruptedException();
    }
}
