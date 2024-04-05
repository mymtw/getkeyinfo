package com.google.common.util.concurrent;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0023f;
import p010a9.C0048b;
import p697vl.C18658a;
import sun.misc.Unsafe;

@ReflectionSupport(ReflectionSupport.Level.FULL)
public abstract class AbstractFuture<V> extends C18658a implements C16388l<V> {

    /* renamed from: e */
    public static final boolean f36445e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    public static final Logger f36446f = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: g */
    public static final C16344a f36447g;

    /* renamed from: h */
    public static final Object f36448h = new Object();
    @NullableDecl

    /* renamed from: b */
    public volatile Object f36449b;
    @NullableDecl

    /* renamed from: c */
    public volatile C16346c f36450c;
    @NullableDecl

    /* renamed from: d */
    public volatile C16354j f36451d;

    public static final class Failure {

        /* renamed from: b */
        public static final Failure f36452b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f36453a;

        public Failure(Throwable th) {
            th.getClass();
            this.f36453a = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$a */
    public static abstract class C16344a {
        /* renamed from: a */
        public abstract boolean mo58320a(AbstractFuture<?> abstractFuture, C16346c cVar, C16346c cVar2);

        /* renamed from: b */
        public abstract boolean mo58321b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo58322c(AbstractFuture<?> abstractFuture, C16354j jVar, C16354j jVar2);

        /* renamed from: d */
        public abstract void mo58323d(C16354j jVar, C16354j jVar2);

        /* renamed from: e */
        public abstract void mo58324e(C16354j jVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$b */
    public static final class C16345b {

        /* renamed from: c */
        public static final C16345b f36454c;

        /* renamed from: d */
        public static final C16345b f36455d;

        /* renamed from: a */
        public final boolean f36456a;
        @NullableDecl

        /* renamed from: b */
        public final Throwable f36457b;

        static {
            if (AbstractFuture.f36445e) {
                f36455d = null;
                f36454c = null;
                return;
            }
            f36455d = new C16345b((Throwable) null, false);
            f36454c = new C16345b((Throwable) null, true);
        }

        public C16345b(@NullableDecl Throwable th, boolean z) {
            this.f36456a = z;
            this.f36457b = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$c */
    public static final class C16346c {

        /* renamed from: d */
        public static final C16346c f36458d = new C16346c((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f36459a;

        /* renamed from: b */
        public final Executor f36460b;
        @NullableDecl

        /* renamed from: c */
        public C16346c f36461c;

        public C16346c(Runnable runnable, Executor executor) {
            this.f36459a = runnable;
            this.f36460b = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$d */
    public static final class C16347d extends C16344a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C16354j, Thread> f36462a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C16354j, C16354j> f36463b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C16354j> f36464c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C16346c> f36465d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f36466e;

        public C16347d(AtomicReferenceFieldUpdater<C16354j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C16354j, C16354j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C16354j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C16346c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f36462a = atomicReferenceFieldUpdater;
            this.f36463b = atomicReferenceFieldUpdater2;
            this.f36464c = atomicReferenceFieldUpdater3;
            this.f36465d = atomicReferenceFieldUpdater4;
            this.f36466e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public final boolean mo58320a(AbstractFuture<?> abstractFuture, C16346c cVar, C16346c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C16346c> atomicReferenceFieldUpdater = this.f36465d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != cVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo58321b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f36466e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo58322c(AbstractFuture<?> abstractFuture, C16354j jVar, C16354j jVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C16354j> atomicReferenceFieldUpdater = this.f36464c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractFuture, jVar, jVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractFuture) != jVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public final void mo58323d(C16354j jVar, C16354j jVar2) {
            this.f36463b.lazySet(jVar, jVar2);
        }

        /* renamed from: e */
        public final void mo58324e(C16354j jVar, Thread thread) {
            this.f36462a.lazySet(jVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$e */
    public static final class C16348e<V> implements Runnable {

        /* renamed from: b */
        public final AbstractFuture<V> f36467b;

        /* renamed from: c */
        public final C16388l<? extends V> f36468c;

        public C16348e(AbstractFuture<V> abstractFuture, C16388l<? extends V> lVar) {
            this.f36467b = abstractFuture;
            this.f36468c = lVar;
        }

        public final void run() {
            if (this.f36467b.f36449b == this) {
                if (AbstractFuture.f36447g.mo58321b(this.f36467b, this, AbstractFuture.m26471h(this.f36468c))) {
                    AbstractFuture.m26468d(this.f36467b);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$f */
    public static final class C16349f extends C16344a {
        /* renamed from: a */
        public final boolean mo58320a(AbstractFuture<?> abstractFuture, C16346c cVar, C16346c cVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f36450c != cVar) {
                    return false;
                }
                abstractFuture.f36450c = cVar2;
                return true;
            }
        }

        /* renamed from: b */
        public final boolean mo58321b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f36449b != obj) {
                    return false;
                }
                abstractFuture.f36449b = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public final boolean mo58322c(AbstractFuture<?> abstractFuture, C16354j jVar, C16354j jVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f36451d != jVar) {
                    return false;
                }
                abstractFuture.f36451d = jVar2;
                return true;
            }
        }

        /* renamed from: d */
        public final void mo58323d(C16354j jVar, C16354j jVar2) {
            jVar.f36477b = jVar2;
        }

        /* renamed from: e */
        public final void mo58324e(C16354j jVar, Thread thread) {
            jVar.f36476a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$g */
    public interface C16350g<V> extends C16388l<V> {
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$h */
    public static abstract class C16351h<V> extends AbstractFuture<V> implements C16350g<V> {
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return AbstractFuture.super.cancel(z);
        }

        /* renamed from: e */
        public final void mo7981e(Runnable runnable, Executor executor) {
            AbstractFuture.super.mo7981e(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return AbstractFuture.super.get();
        }

        public final boolean isCancelled() {
            return this.f36449b instanceof C16345b;
        }

        public final boolean isDone() {
            return AbstractFuture.super.isDone();
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return AbstractFuture.super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$i */
    public static final class C16352i extends C16344a {

        /* renamed from: a */
        public static final Unsafe f36469a;

        /* renamed from: b */
        public static final long f36470b;

        /* renamed from: c */
        public static final long f36471c;

        /* renamed from: d */
        public static final long f36472d;

        /* renamed from: e */
        public static final long f36473e;

        /* renamed from: f */
        public static final long f36474f;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$i$a */
        public static class C16353a implements PrivilegedExceptionAction<Unsafe> {
            /* renamed from: a */
            public static Unsafe m26499a() throws Exception {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            public final /* bridge */ /* synthetic */ Object run() throws Exception {
                return m26499a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.AbstractFuture.C16352i.C16353a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture$j> r0 = com.google.common.util.concurrent.AbstractFuture.C16354j.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.AbstractFuture$i$a r1 = new com.google.common.util.concurrent.AbstractFuture$i$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f36471c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f36470b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "b"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f36472d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f36473e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f36474f = r2     // Catch:{ Exception -> 0x0053 }
                f36469a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.common.base.C15805t.m25629a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.C16352i.<clinit>():void");
        }

        /* renamed from: a */
        public final boolean mo58320a(AbstractFuture<?> abstractFuture, C16346c cVar, C16346c cVar2) {
            return C16371a.m26502a(f36469a, abstractFuture, f36470b, cVar, cVar2);
        }

        /* renamed from: b */
        public final boolean mo58321b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C16371a.m26502a(f36469a, abstractFuture, f36472d, obj, obj2);
        }

        /* renamed from: c */
        public final boolean mo58322c(AbstractFuture<?> abstractFuture, C16354j jVar, C16354j jVar2) {
            return C16371a.m26502a(f36469a, abstractFuture, f36471c, jVar, jVar2);
        }

        /* renamed from: d */
        public final void mo58323d(C16354j jVar, C16354j jVar2) {
            f36469a.putObject(jVar, f36474f, jVar2);
        }

        /* renamed from: e */
        public final void mo58324e(C16354j jVar, Thread thread) {
            f36469a.putObject(jVar, f36473e, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractFuture$j */
    public static final class C16354j {

        /* renamed from: c */
        public static final C16354j f36475c = new C16354j(0);
        @NullableDecl

        /* renamed from: a */
        public volatile Thread f36476a;
        @NullableDecl

        /* renamed from: b */
        public volatile C16354j f36477b;

        public C16354j(int i) {
        }

        public C16354j() {
            AbstractFuture.f36447g.mo58324e(this, Thread.currentThread());
        }
    }

    static {
        C16344a aVar;
        Class<C16354j> cls = C16354j.class;
        Throwable th = null;
        try {
            aVar = new C16352i();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new C16349f();
        }
        f36447g = aVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f36446f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: b */
    private void m26467b(StringBuilder sb) {
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

    /* renamed from: d */
    public static void m26468d(AbstractFuture<?> abstractFuture) {
        AbstractFuture<V> abstractFuture2;
        C16346c cVar;
        C16346c cVar2;
        C16346c cVar3 = null;
        AbstractFuture<?> abstractFuture3 = abstractFuture;
        while (true) {
            C16354j jVar = abstractFuture3.f36451d;
            if (f36447g.mo58322c(abstractFuture3, jVar, C16354j.f36475c)) {
                while (jVar != null) {
                    Thread thread = jVar.f36476a;
                    if (thread != null) {
                        jVar.f36476a = null;
                        LockSupport.unpark(thread);
                    }
                    jVar = jVar.f36477b;
                }
                abstractFuture3.mo58309c();
                do {
                    cVar = abstractFuture3.f36450c;
                } while (!f36447g.mo58320a(abstractFuture3, cVar, C16346c.f36458d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f36461c;
                    cVar3.f36461c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f36461c;
                    Runnable runnable = cVar2.f36459a;
                    if (runnable instanceof C16348e) {
                        C16348e eVar = (C16348e) runnable;
                        AbstractFuture<V> abstractFuture4 = eVar.f36467b;
                        if (abstractFuture4.f36449b == eVar) {
                            if (f36447g.mo58321b(abstractFuture4, eVar, m26471h(eVar.f36468c))) {
                                abstractFuture2 = abstractFuture4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m26469f(runnable, cVar2.f36460b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
            abstractFuture2 = abstractFuture3;
            abstractFuture3 = abstractFuture2;
        }
    }

    /* renamed from: f */
    public static void m26469f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f36446f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: g */
    private static Object m26470g(Object obj) throws ExecutionException {
        if (obj instanceof C16345b) {
            Throwable th = ((C16345b) obj).f36457b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f36453a);
        } else if (obj == f36448h) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m26471h(com.google.common.util.concurrent.C16388l<?> r6) {
        /*
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.C16350g
            r2 = 0
            if (r1 == 0) goto L_0x0025
            com.google.common.util.concurrent.AbstractFuture r6 = (com.google.common.util.concurrent.AbstractFuture) r6
            java.lang.Object r6 = r6.f36449b
            boolean r0 = r6 instanceof com.google.common.util.concurrent.AbstractFuture.C16345b
            if (r0 == 0) goto L_0x0024
            r0 = r6
            com.google.common.util.concurrent.AbstractFuture$b r0 = (com.google.common.util.concurrent.AbstractFuture.C16345b) r0
            boolean r1 = r0.f36456a
            if (r1 == 0) goto L_0x0024
            java.lang.Throwable r6 = r0.f36457b
            if (r6 == 0) goto L_0x0022
            com.google.common.util.concurrent.AbstractFuture$b r6 = new com.google.common.util.concurrent.AbstractFuture$b
            java.lang.Throwable r0 = r0.f36457b
            r6.<init>(r0, r2)
            goto L_0x0024
        L_0x0022:
            com.google.common.util.concurrent.AbstractFuture$b r6 = com.google.common.util.concurrent.AbstractFuture.C16345b.f36455d
        L_0x0024:
            return r6
        L_0x0025:
            boolean r1 = r6 instanceof p697vl.C18658a
            if (r1 == 0) goto L_0x0038
            r1 = r6
            vl.a r1 = (p697vl.C18658a) r1
            java.lang.Throwable r1 = r1.mo58308a()
            if (r1 == 0) goto L_0x0038
            com.google.common.util.concurrent.AbstractFuture$Failure r6 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r6.<init>(r1)
            return r6
        L_0x0038:
            boolean r1 = r6.isCancelled()
            boolean r3 = f36445e
            r4 = 1
            r3 = r3 ^ r4
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0046
            com.google.common.util.concurrent.AbstractFuture$b r6 = com.google.common.util.concurrent.AbstractFuture.C16345b.f36455d
            return r6
        L_0x0046:
            r3 = r2
        L_0x0047:
            java.lang.Object r4 = r6.get()     // Catch:{ InterruptedException -> 0x00d6, all -> 0x007b }
            if (r3 == 0) goto L_0x0054
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r3.interrupt()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
        L_0x0054:
            if (r1 == 0) goto L_0x0076
            com.google.common.util.concurrent.AbstractFuture$b r3 = new com.google.common.util.concurrent.AbstractFuture$b     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r5.<init>()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r5.append(r0)     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r5.append(r6)     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            java.lang.String r5 = r5.toString()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r4.<init>(r5)     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r3.<init>(r4, r2)     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            return r3
        L_0x0070:
            r6 = move-exception
            goto L_0x0086
        L_0x0072:
            r0 = move-exception
            goto L_0x008c
        L_0x0074:
            r3 = move-exception
            goto L_0x00b0
        L_0x0076:
            if (r4 != 0) goto L_0x007a
            java.lang.Object r4 = f36448h     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
        L_0x007a:
            return r4
        L_0x007b:
            r4 = move-exception
            if (r3 == 0) goto L_0x0085
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
            r3.interrupt()     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
        L_0x0085:
            throw r4     // Catch:{ ExecutionException -> 0x0074, CancellationException -> 0x0072, all -> 0x0070 }
        L_0x0086:
            com.google.common.util.concurrent.AbstractFuture$Failure r0 = new com.google.common.util.concurrent.AbstractFuture$Failure
            r0.<init>(r6)
            return r0
        L_0x008c:
            if (r1 != 0) goto L_0x00aa
            com.google.common.util.concurrent.AbstractFuture$Failure r1 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r0)
            r1.<init>(r2)
            return r1
        L_0x00aa:
            com.google.common.util.concurrent.AbstractFuture$b r6 = new com.google.common.util.concurrent.AbstractFuture$b
            r6.<init>(r0, r2)
            return r6
        L_0x00b0:
            if (r1 == 0) goto L_0x00cc
            com.google.common.util.concurrent.AbstractFuture$b r1 = new com.google.common.util.concurrent.AbstractFuture$b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r4.<init>(r6, r3)
            r1.<init>(r4, r2)
            return r1
        L_0x00cc:
            com.google.common.util.concurrent.AbstractFuture$Failure r6 = new com.google.common.util.concurrent.AbstractFuture$Failure
            java.lang.Throwable r0 = r3.getCause()
            r6.<init>(r0)
            return r6
        L_0x00d6:
            r3 = r4
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.m26471h(com.google.common.util.concurrent.l):java.lang.Object");
    }

    @NullableDecl
    /* renamed from: a */
    public final Throwable mo58308a() {
        if (!(this instanceof C16350g)) {
            return null;
        }
        Object obj = this.f36449b;
        if (obj instanceof Failure) {
            return ((Failure) obj).f36453a;
        }
        return null;
    }

    @ForOverride
    /* renamed from: c */
    public void mo58309c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.l<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f36449b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.C16348e
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f36445e
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.AbstractFuture$b r3 = new com.google.common.util.concurrent.AbstractFuture$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.AbstractFuture$b r3 = com.google.common.util.concurrent.AbstractFuture.C16345b.f36454c
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.AbstractFuture$b r3 = com.google.common.util.concurrent.AbstractFuture.C16345b.f36455d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            com.google.common.util.concurrent.AbstractFuture$a r6 = f36447g
            boolean r6 = r6.mo58321b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            m26468d(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.C16348e
            if (r4 == 0) goto L_0x005d
            com.google.common.util.concurrent.AbstractFuture$e r0 = (com.google.common.util.concurrent.AbstractFuture.C16348e) r0
            com.google.common.util.concurrent.l<? extends V> r0 = r0.f36468c
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.C16350g
            if (r4 == 0) goto L_0x0050
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture r4 = (com.google.common.util.concurrent.AbstractFuture) r4
            java.lang.Object r0 = r4.f36449b
            if (r0 != 0) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.C16348e
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f36449b
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.C16348e
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public void mo7981e(Runnable runnable, Executor executor) {
        C16346c cVar;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        } else if (isDone() || (cVar = this.f36450c) == C16346c.f36458d) {
            m26469f(runnable, executor);
        } else {
            C16346c cVar2 = new C16346c(runnable, executor);
            do {
                cVar2.f36461c = cVar;
                if (!f36447g.mo58320a(this, cVar, cVar2)) {
                    cVar = this.f36450c;
                } else {
                    return;
                }
            } while (cVar != C16346c.f36458d);
            m26469f(runnable, executor);
        }
    }

    @CanIgnoreReturnValue
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f36449b;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C16348e))) {
                return m26470g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C16354j jVar = this.f36451d;
                if (jVar != C16354j.f36475c) {
                    C16354j jVar2 = new C16354j();
                    do {
                        C16344a aVar = f36447g;
                        aVar.mo58323d(jVar2, jVar);
                        if (aVar.mo58322c(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f36449b;
                                    if ((obj2 != null) && (!(obj2 instanceof C16348e))) {
                                        return m26470g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo58316j(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo58316j(jVar2);
                        } else {
                            jVar = this.f36451d;
                        }
                    } while (jVar != C16354j.f36475c);
                }
                return m26470g(this.f36449b);
            }
            while (nanos > 0) {
                Object obj3 = this.f36449b;
                if ((obj3 != null) && (!(obj3 instanceof C16348e))) {
                    return m26470g(obj3);
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

    @NullableDecl
    /* renamed from: i */
    public String mo58313i() {
        Object obj = this.f36449b;
        if (obj instanceof C16348e) {
            StringBuilder h = C0072d.m201h("setFuture=[");
            C16388l<? extends V> lVar = ((C16348e) obj).f36468c;
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

    public boolean isCancelled() {
        return this.f36449b instanceof C16345b;
    }

    public boolean isDone() {
        Object obj = this.f36449b;
        return (!(obj instanceof C16348e)) & (obj != null);
    }

    /* renamed from: j */
    public final void mo58316j(C16354j jVar) {
        jVar.f36476a = null;
        while (true) {
            C16354j jVar2 = this.f36451d;
            if (jVar2 != C16354j.f36475c) {
                C16354j jVar3 = null;
                while (jVar2 != null) {
                    C16354j jVar4 = jVar2.f36477b;
                    if (jVar2.f36476a != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f36477b = jVar4;
                        if (jVar3.f36476a == null) {
                        }
                    } else if (!f36447g.mo58322c(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: k */
    public boolean mo58317k(Throwable th) {
        th.getClass();
        if (!f36447g.mo58321b(this, (Object) null, new Failure(th))) {
            return false;
        }
        m26468d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m26467b(sb);
        } else {
            try {
                str = mo58313i();
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
                m26467b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36449b;
            if ((obj2 != null) && (!(obj2 instanceof C16348e))) {
                return m26470g(obj2);
            }
            C16354j jVar = this.f36451d;
            if (jVar != C16354j.f36475c) {
                C16354j jVar2 = new C16354j();
                do {
                    C16344a aVar = f36447g;
                    aVar.mo58323d(jVar2, jVar);
                    if (aVar.mo58322c(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36449b;
                            } else {
                                mo58316j(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C16348e))));
                        return m26470g(obj);
                    }
                    jVar = this.f36451d;
                } while (jVar != C16354j.f36475c);
            }
            return m26470g(this.f36449b);
        }
        throw new InterruptedException();
    }
}
