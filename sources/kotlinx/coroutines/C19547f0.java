package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19824u0;
import p001a0.C0005b;

/* renamed from: kotlinx.coroutines.f0 */
public final class C19547f0 extends C19824u0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i */
    public static final C19547f0 f43502i;

    /* renamed from: j */
    public static final long f43503j;

    static {
        Long l;
        C19547f0 f0Var = new C19547f0();
        f43502i = f0Var;
        f0Var.mo72659G0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f43503j = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: K0 */
    public final Thread mo72254K0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* renamed from: L0 */
    public final void mo72255L0(long j, C19824u0.C19827c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: M0 */
    public final void mo72256M0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.mo72256M0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: R0 */
    public final synchronized void mo72257R0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            mo72669P0();
            notifyAll();
        }
    }

    /* renamed from: i */
    public final C19766p0 mo72115i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long X = C0005b.m30X(j);
        if (X >= 4611686018427387903L) {
            return C19770q1.f43725b;
        }
        long nanoTime = System.nanoTime();
        C19824u0.C19826b bVar = new C19824u0.C19826b(runnable, X + nanoTime);
        mo72670Q0(nanoTime, bVar);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0096, code lost:
        _thread = null;
        mo72257R0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (mo72668O0() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        mo72254K0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal<kotlinx.coroutines.t0> r0 = kotlinx.coroutines.C19845z1.f43852a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch:{ all -> 0x0091 }
            int r0 = debugStatus     // Catch:{ all -> 0x0093 }
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L_0x0016
            if (r0 != r3) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r5
            goto L_0x0017
        L_0x0016:
            r0 = r6
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r5
            goto L_0x0023
        L_0x001c:
            debugStatus = r6     // Catch:{ all -> 0x0093 }
            r17.notifyAll()     // Catch:{ all -> 0x0093 }
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r6
        L_0x0023:
            if (r0 != 0) goto L_0x0034
            _thread = r2
            r17.mo72257R0()
            boolean r0 = r17.mo72668O0()
            if (r0 != 0) goto L_0x0033
            r17.mo72254K0()
        L_0x0033:
            return
        L_0x0034:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L_0x003a:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0091 }
            long r11 = r17.mo72661I0()     // Catch:{ all -> 0x0091 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L_0x006d
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0091 }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            long r9 = f43503j     // Catch:{ all -> 0x0091 }
            long r9 = r9 + r15
        L_0x0052:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            _thread = r2
            r17.mo72257R0()
            boolean r0 = r17.mo72668O0()
            if (r0 != 0) goto L_0x0066
            r17.mo72254K0()
        L_0x0066:
            return
        L_0x0067:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r11 = r15
            goto L_0x006e
        L_0x006d:
            r9 = r7
        L_0x006e:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            int r0 = debugStatus     // Catch:{ all -> 0x0091 }
            if (r0 == r4) goto L_0x007b
            if (r0 != r3) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = r5
            goto L_0x007c
        L_0x007b:
            r0 = r6
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            _thread = r2
            r17.mo72257R0()
            boolean r0 = r17.mo72668O0()
            if (r0 != 0) goto L_0x008c
            r17.mo72254K0()
        L_0x008c:
            return
        L_0x008d:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch:{ all -> 0x0091 }
            goto L_0x003a
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0096:
            _thread = r2
            r17.mo72257R0()
            boolean r2 = r17.mo72668O0()
            if (r2 != 0) goto L_0x00a4
            r17.mo72254K0()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19547f0.run():void");
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
