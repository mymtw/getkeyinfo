package androidx.work.impl.utils.futures;

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
import p003a2.C0023f;
import p010a9.C0048b;

public abstract class AbstractFuture<V> implements C16388l<V> {

    /* renamed from: e */
    public static final boolean f7988e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f7989f = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: g */
    public static final C3412a f7990g;

    /* renamed from: h */
    public static final Object f7991h = new Object();

    /* renamed from: b */
    public volatile Object f7992b;

    /* renamed from: c */
    public volatile C3414c f7993c;

    /* renamed from: d */
    public volatile C3418g f7994d;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f7995b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f7996a;

        public Failure(Throwable th) {
            boolean z = AbstractFuture.f7988e;
            th.getClass();
            this.f7996a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$a */
    public static abstract class C3412a {
        /* renamed from: a */
        public abstract boolean mo12909a(AbstractFuture<?> abstractFuture, C3414c cVar, C3414c cVar2);

        /* renamed from: b */
        public abstract boolean mo12910b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo12911c(AbstractFuture<?> abstractFuture, C3418g gVar, C3418g gVar2);

        /* renamed from: d */
        public abstract void mo12912d(C3418g gVar, C3418g gVar2);

        /* renamed from: e */
        public abstract void mo12913e(C3418g gVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    public static final class C3413b {

        /* renamed from: c */
        public static final C3413b f7997c;

        /* renamed from: d */
        public static final C3413b f7998d;

        /* renamed from: a */
        public final boolean f7999a;

        /* renamed from: b */
        public final Throwable f8000b;

        static {
            if (AbstractFuture.f7988e) {
                f7998d = null;
                f7997c = null;
                return;
            }
            f7998d = new C3413b((Throwable) null, false);
            f7997c = new C3413b((Throwable) null, true);
        }

        public C3413b(Throwable th, boolean z) {
            this.f7999a = z;
            this.f8000b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    public static final class C3414c {

        /* renamed from: d */
        public static final C3414c f8001d = new C3414c((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f8002a;

        /* renamed from: b */
        public final Executor f8003b;

        /* renamed from: c */
        public C3414c f8004c;

        public C3414c(Runnable runnable, Executor executor) {
            this.f8002a = runnable;
            this.f8003b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    public static final class C3415d extends C3412a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C3418g, Thread> f8005a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C3418g, C3418g> f8006b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3418g> f8007c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C3414c> f8008d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f8009e;

        public C3415d(AtomicReferenceFieldUpdater<C3418g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3418g, C3418g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C3418g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C3414c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f8005a = atomicReferenceFieldUpdater;
            this.f8006b = atomicReferenceFieldUpdater2;
            this.f8007c = atomicReferenceFieldUpdater3;
            this.f8008d = atomicReferenceFieldUpdater4;
            this.f8009e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final boolean mo12909a(AbstractFuture<?> abstractFuture, C3414c cVar, C3414c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C3414c> atomicReferenceFieldUpdater = this.f8008d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != cVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo12910b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f8009e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo12911c(AbstractFuture<?> abstractFuture, C3418g gVar, C3418g gVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C3418g> atomicReferenceFieldUpdater = this.f8007c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, gVar, gVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != gVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public final void mo12912d(C3418g gVar, C3418g gVar2) {
            this.f8006b.lazySet(gVar, gVar2);
        }

        /* renamed from: e */
        public final void mo12913e(C3418g gVar, Thread thread) {
            this.f8005a.lazySet(gVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    public static final class C3416e<V> implements Runnable {

        /* renamed from: b */
        public final AbstractFuture<V> f8010b;

        /* renamed from: c */
        public final C16388l<? extends V> f8011c;

        public C3416e(AbstractFuture<V> abstractFuture, C16388l<? extends V> lVar) {
            this.f8010b = abstractFuture;
            this.f8011c = lVar;
        }

        public final void run() {
            if (this.f8010b.f7992b == this) {
                if (AbstractFuture.f7990g.mo12910b(this.f8010b, this, AbstractFuture.m8180f(this.f8011c))) {
                    AbstractFuture.m8178b(this.f8010b);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    public static final class C3417f extends C3412a {
        /* renamed from: a */
        public final boolean mo12909a(AbstractFuture<?> abstractFuture, C3414c cVar, C3414c cVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7993c != cVar) {
                    return false;
                }
                abstractFuture.f7993c = cVar2;
                return true;
            }
        }

        /* renamed from: b */
        public final boolean mo12910b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7992b != obj) {
                    return false;
                }
                abstractFuture.f7992b = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo12911c(AbstractFuture<?> abstractFuture, C3418g gVar, C3418g gVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7994d != gVar) {
                    return false;
                }
                abstractFuture.f7994d = gVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final void mo12912d(C3418g gVar, C3418g gVar2) {
            gVar.f8014b = gVar2;
        }

        /* renamed from: e */
        public final void mo12913e(C3418g gVar, Thread thread) {
            gVar.f8013a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    public static final class C3418g {

        /* renamed from: c */
        public static final C3418g f8012c = new C3418g(0);

        /* renamed from: a */
        public volatile Thread f8013a;

        /* renamed from: b */
        public volatile C3418g f8014b;

        public C3418g(int i) {
        }

        public C3418g() {
            AbstractFuture.f7990g.mo12913e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.AbstractFuture$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.AbstractFuture$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$g> r0 = androidx.work.impl.utils.futures.AbstractFuture.C3418g.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f7988e = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f7989f = r1
            androidx.work.impl.utils.futures.AbstractFuture$d r1 = new androidx.work.impl.utils.futures.AbstractFuture$d     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$c> r2 = androidx.work.impl.utils.futures.AbstractFuture.C3414c.class
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$f r1 = new androidx.work.impl.utils.futures.AbstractFuture$f
            r1.<init>()
        L_0x0054:
            f7990g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f7989f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f7991h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    /* renamed from: b */
    public static void m8178b(AbstractFuture<?> abstractFuture) {
        AbstractFuture<V> abstractFuture2;
        C3414c cVar;
        C3414c cVar2;
        C3414c cVar3 = null;
        AbstractFuture<?> abstractFuture3 = abstractFuture;
        while (true) {
            C3418g gVar = abstractFuture3.f7994d;
            if (f7990g.mo12911c(abstractFuture3, gVar, C3418g.f8012c)) {
                while (gVar != null) {
                    Thread thread = gVar.f8013a;
                    if (thread != null) {
                        gVar.f8013a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f8014b;
                }
                do {
                    cVar = abstractFuture3.f7993c;
                } while (!f7990g.mo12909a(abstractFuture3, cVar, C3414c.f8001d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f8004c;
                    cVar3.f8004c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f8004c;
                    Runnable runnable = cVar2.f8002a;
                    if (runnable instanceof C3416e) {
                        C3416e eVar = (C3416e) runnable;
                        AbstractFuture<V> abstractFuture4 = eVar.f8010b;
                        if (abstractFuture4.f7992b == eVar) {
                            if (f7990g.mo12910b(abstractFuture4, eVar, m8180f(eVar.f8011c))) {
                                abstractFuture2 = abstractFuture4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m8179c(runnable, cVar2.f8003b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
            abstractFuture2 = abstractFuture3;
            abstractFuture3 = abstractFuture2;
        }
    }

    /* renamed from: c */
    public static void m8179c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f7989f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m8180f(com.google.common.util.concurrent.C16388l<?> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture
            r1 = 0
            if (r0 == 0) goto L_0x0023
            androidx.work.impl.utils.futures.AbstractFuture r5 = (androidx.work.impl.utils.futures.AbstractFuture) r5
            java.lang.Object r5 = r5.f7992b
            boolean r0 = r5 instanceof androidx.work.impl.utils.futures.AbstractFuture.C3413b
            if (r0 == 0) goto L_0x0022
            r0 = r5
            androidx.work.impl.utils.futures.AbstractFuture$b r0 = (androidx.work.impl.utils.futures.AbstractFuture.C3413b) r0
            boolean r2 = r0.f7999a
            if (r2 == 0) goto L_0x0022
            java.lang.Throwable r5 = r0.f8000b
            if (r5 == 0) goto L_0x0020
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = new androidx.work.impl.utils.futures.AbstractFuture$b
            java.lang.Throwable r0 = r0.f8000b
            r5.<init>(r0, r1)
            goto L_0x0022
        L_0x0020:
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = androidx.work.impl.utils.futures.AbstractFuture.C3413b.f7998d
        L_0x0022:
            return r5
        L_0x0023:
            boolean r0 = r5.isCancelled()
            boolean r2 = f7988e
            r3 = 1
            r2 = r2 ^ r3
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0031
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = androidx.work.impl.utils.futures.AbstractFuture.C3413b.f7998d
            return r5
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = r5.get()     // Catch:{ InterruptedException -> 0x008a, all -> 0x004b }
            if (r2 == 0) goto L_0x003f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x003f:
            if (r3 != 0) goto L_0x004a
            java.lang.Object r3 = f7991h     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            goto L_0x0056
        L_0x0046:
            r2 = move-exception
            goto L_0x005c
        L_0x0048:
            r5 = move-exception
            goto L_0x0080
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            if (r2 == 0) goto L_0x0055
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0055:
            throw r3     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0056:
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            r0.<init>(r5)
            return r0
        L_0x005c:
            if (r0 != 0) goto L_0x007a
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L_0x007a:
            androidx.work.impl.utils.futures.AbstractFuture$b r5 = new androidx.work.impl.utils.futures.AbstractFuture$b
            r5.<init>(r2, r1)
            return r5
        L_0x0080:
            androidx.work.impl.utils.futures.AbstractFuture$Failure r0 = new androidx.work.impl.utils.futures.AbstractFuture$Failure
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
        L_0x008a:
            r2 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.m8180f(com.google.common.util.concurrent.l):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo12898a(StringBuilder sb) {
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

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.l<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7992b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C3416e
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f7988e
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = new androidx.work.impl.utils.futures.AbstractFuture$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.C3413b.f7997c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$b r3 = androidx.work.impl.utils.futures.AbstractFuture.C3413b.f7998d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$a r6 = f7990g
            boolean r6 = r6.mo12910b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            m8178b(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C3416e
            if (r4 == 0) goto L_0x005d
            androidx.work.impl.utils.futures.AbstractFuture$e r0 = (androidx.work.impl.utils.futures.AbstractFuture.C3416e) r0
            com.google.common.util.concurrent.l<? extends V> r0 = r0.f8011c
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0050
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f7992b
            if (r0 != 0) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C3416e
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f7992b
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.C3416e
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final V mo12900d(Object obj) throws ExecutionException {
        if (obj instanceof C3413b) {
            Throwable th = ((C3413b) obj).f8000b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f7996a);
        } else if (obj == f7991h) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: e */
    public final void mo7981e(Runnable runnable, Executor executor) {
        executor.getClass();
        C3414c cVar = this.f7993c;
        if (cVar != C3414c.f8001d) {
            C3414c cVar2 = new C3414c(runnable, executor);
            do {
                cVar2.f8004c = cVar;
                if (!f7990g.mo12909a(this, cVar, cVar2)) {
                    cVar = this.f7993c;
                } else {
                    return;
                }
            } while (cVar != C3414c.f8001d);
        }
        m8179c(runnable, executor);
    }

    /* renamed from: g */
    public final String mo12901g() {
        Object obj = this.f7992b;
        if (obj instanceof C3416e) {
            StringBuilder h = C0072d.m201h("setFuture=[");
            C16388l<? extends V> lVar = ((C3416e) obj).f8011c;
            return C0023f.m110k(h, lVar == this ? "this future" : String.valueOf(lVar), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder h2 = C0072d.m201h("remaining delay=[");
            h2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            h2.append(" ms]");
            return h2.toString();
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f7992b;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C3416e))) {
                return mo12900d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C3418g gVar = this.f7994d;
                if (gVar != C3418g.f8012c) {
                    C3418g gVar2 = new C3418g();
                    do {
                        C3412a aVar = f7990g;
                        aVar.mo12912d(gVar2, gVar);
                        if (aVar.mo12911c(this, gVar, gVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7992b;
                                    if ((obj2 != null) && (!(obj2 instanceof C3416e))) {
                                        return mo12900d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo12904h(gVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo12904h(gVar2);
                        } else {
                            gVar = this.f7994d;
                        }
                    } while (gVar != C3418g.f8012c);
                }
                return mo12900d(this.f7992b);
            }
            while (nanos > 0) {
                Object obj3 = this.f7992b;
                if ((obj3 != null) && (!(obj3 instanceof C3416e))) {
                    return mo12900d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
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
            throw new TimeoutException(C0048b.m163a(str, " for ", abstractFuture));
        }
        throw new InterruptedException();
    }

    /* renamed from: h */
    public final void mo12904h(C3418g gVar) {
        gVar.f8013a = null;
        while (true) {
            C3418g gVar2 = this.f7994d;
            if (gVar2 != C3418g.f8012c) {
                C3418g gVar3 = null;
                while (gVar2 != null) {
                    C3418g gVar4 = gVar2.f8014b;
                    if (gVar2.f8013a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f8014b = gVar4;
                        if (gVar3.f8013a == null) {
                        }
                    } else if (!f7990g.mo12911c(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f7992b instanceof C3413b;
    }

    public final boolean isDone() {
        Object obj = this.f7992b;
        return (!(obj instanceof C3416e)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7992b instanceof C3413b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo12898a(sb);
        } else {
            try {
                str = mo12901g();
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
                mo12898a(sb);
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
            Object obj2 = this.f7992b;
            if ((obj2 != null) && (!(obj2 instanceof C3416e))) {
                return mo12900d(obj2);
            }
            C3418g gVar = this.f7994d;
            if (gVar != C3418g.f8012c) {
                C3418g gVar2 = new C3418g();
                do {
                    C3412a aVar = f7990g;
                    aVar.mo12912d(gVar2, gVar);
                    if (aVar.mo12911c(this, gVar, gVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7992b;
                            } else {
                                mo12904h(gVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C3416e))));
                        return mo12900d(obj);
                    }
                    gVar = this.f7994d;
                } while (gVar != C3418g.f8012c);
            }
            return mo12900d(this.f7992b);
        }
        throw new InterruptedException();
    }
}
