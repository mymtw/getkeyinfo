package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
public final class C15086s3 extends C15042n4 {

    /* renamed from: l */
    public static final AtomicLong f33826l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d */
    public C15077r3 f33827d;

    /* renamed from: e */
    public C15077r3 f33828e;

    /* renamed from: f */
    public final PriorityBlockingQueue<C15068q3<?>> f33829f = new PriorityBlockingQueue<>();

    /* renamed from: g */
    public final LinkedBlockingQueue f33830g = new LinkedBlockingQueue();

    /* renamed from: h */
    public final C15059p3 f33831h = new C15059p3(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: i */
    public final C15059p3 f33832i = new C15059p3(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: j */
    public final Object f33833j = new Object();

    /* renamed from: k */
    public final Semaphore f33834k = new Semaphore(2);

    public C15086s3(C15103u3 u3Var) {
        super(u3Var);
    }

    /* renamed from: g */
    public final void mo51995g() {
        if (Thread.currentThread() != this.f33827d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: h */
    public final boolean mo51952h() {
        return false;
    }

    /* renamed from: k */
    public final void mo52304k() {
        if (Thread.currentThread() != this.f33828e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5.length() == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r3.mo52237a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).mo52016b().f33727j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.mo52237a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r2 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r3 = ((com.google.android.gms.measurement.internal.C15103u3) r1.f33681b).mo52016b().f33727j;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo52305l(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()     // Catch:{ all -> 0x005a }
            r0.mo52308o(r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0036
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33727j
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002d
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0033
        L_0x002d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0033:
            r3.mo52237a(r4)
        L_0x0036:
            return r2
        L_0x0037:
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33727j     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.mo52237a(r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            r2 = 0
            return r2
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15086s3.mo52305l(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: m */
    public final C15068q3 mo52306m(Callable callable) throws IllegalStateException {
        mo52264i();
        Preconditions.checkNotNull(callable);
        C15068q3 q3Var = new C15068q3(this, callable, false);
        if (Thread.currentThread() == this.f33827d) {
            if (!this.f33829f.isEmpty()) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("Callable skipped the worker queue.");
            }
            q3Var.run();
        } else {
            mo52311r(q3Var);
        }
        return q3Var;
    }

    /* renamed from: n */
    public final void mo52307n(Runnable runnable) throws IllegalStateException {
        mo52264i();
        Preconditions.checkNotNull(runnable);
        C15068q3 q3Var = new C15068q3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f33833j) {
            this.f33830g.add(q3Var);
            C15077r3 r3Var = this.f33828e;
            if (r3Var == null) {
                C15077r3 r3Var2 = new C15077r3(this, "Measurement Network", this.f33830g);
                this.f33828e = r3Var2;
                r3Var2.setUncaughtExceptionHandler(this.f33832i);
                this.f33828e.start();
            } else {
                synchronized (r3Var.f33801b) {
                    r3Var.f33801b.notifyAll();
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo52308o(Runnable runnable) throws IllegalStateException {
        mo52264i();
        Preconditions.checkNotNull(runnable);
        mo52311r(new C15068q3(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: p */
    public final void mo52309p(Runnable runnable) throws IllegalStateException {
        mo52264i();
        Preconditions.checkNotNull(runnable);
        mo52311r(new C15068q3(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: q */
    public final boolean mo52310q() {
        return Thread.currentThread() == this.f33827d;
    }

    /* renamed from: r */
    public final void mo52311r(C15068q3<?> q3Var) {
        synchronized (this.f33833j) {
            this.f33829f.add(q3Var);
            C15077r3 r3Var = this.f33827d;
            if (r3Var == null) {
                C15077r3 r3Var2 = new C15077r3(this, "Measurement Worker", this.f33829f);
                this.f33827d = r3Var2;
                r3Var2.setUncaughtExceptionHandler(this.f33831h);
                this.f33827d.start();
            } else {
                synchronized (r3Var.f33801b) {
                    r3Var.f33801b.notifyAll();
                }
            }
        }
    }
}
