package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
public final class C15077r3 extends Thread {

    /* renamed from: b */
    public final Object f33801b;

    /* renamed from: c */
    public final BlockingQueue<C15068q3<?>> f33802c;

    /* renamed from: d */
    public boolean f33803d = false;

    /* renamed from: e */
    public final /* synthetic */ C15086s3 f33804e;

    public C15077r3(C15086s3 s3Var, String str, BlockingQueue<C15068q3<?>> blockingQueue) {
        this.f33804e = s3Var;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f33801b = new Object();
        this.f33802c = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo52297a() {
        synchronized (this.f33804e.f33833j) {
            try {
                if (!this.f33803d) {
                    this.f33804e.f33834k.release();
                    this.f33804e.f33833j.notifyAll();
                    C15086s3 s3Var = this.f33804e;
                    if (this == s3Var.f33827d) {
                        s3Var.f33827d = null;
                    } else if (this == s3Var.f33828e) {
                        s3Var.f33828e = null;
                    } else {
                        ((C15103u3) s3Var.f33681b).mo52016b().f33724g.mo52237a("Current scheduler thread is neither worker nor network");
                    }
                    this.f33803d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo52298b(InterruptedException interruptedException) {
        ((C15103u3) this.f33804e.f33681b).mo52016b().f33727j.mo52238b(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        mo52297a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0012
            com.google.android.gms.measurement.internal.s3 r2 = r6.f33804e     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f33834k     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r1 = r0
            goto L_0x0002
        L_0x000d:
            r2 = move-exception
            r6.mo52298b(r2)
            goto L_0x0002
        L_0x0012:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0081 }
        L_0x001a:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.q3<?>> r2 = r6.f33802c     // Catch:{ all -> 0x0081 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.q3 r2 = (com.google.android.gms.measurement.internal.C15068q3) r2     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.f33765c     // Catch:{ all -> 0x0081 }
            if (r0 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0081 }
            r2.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.f33801b     // Catch:{ all -> 0x0081 }
            monitor-enter(r2)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.q3<?>> r3 = r6.f33802c     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0052
            com.google.android.gms.measurement.internal.s3 r3 = r6.f33804e     // Catch:{ all -> 0x0050 }
            r3.getClass()     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r6.f33801b     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            r3 = move-exception
            r6.mo52298b(r3)     // Catch:{ all -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            goto L_0x007f
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.measurement.internal.s3 r2 = r6.f33804e     // Catch:{ all -> 0x0081 }
            java.lang.Object r2 = r2.f33833j     // Catch:{ all -> 0x0081 }
            monitor-enter(r2)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.q3<?>> r3 = r6.f33802c     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.s3 r0 = r6.f33804e     // Catch:{ all -> 0x0079 }
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b     // Catch:{ all -> 0x0079 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0079 }
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h     // Catch:{ all -> 0x0079 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C14959e2.f33412j0     // Catch:{ all -> 0x0079 }
            r3 = 0
            boolean r0 = r0.mo51973p(r3, r1)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0074
            r6.mo52297a()     // Catch:{ all -> 0x0079 }
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            r6.mo52297a()
            return
        L_0x0079:
            r0 = move-exception
            goto L_0x007d
        L_0x007b:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            goto L_0x001a
        L_0x007d:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r6.mo52297a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15077r3.run():void");
    }
}
