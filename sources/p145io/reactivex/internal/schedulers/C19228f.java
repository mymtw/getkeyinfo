package p145io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.f */
public final class C19228f {

    /* renamed from: a */
    public static final boolean f43008a;

    /* renamed from: b */
    public static final int f43009b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f43010c = new AtomicReference<>();

    /* renamed from: d */
    public static final ConcurrentHashMap f43011d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.f$a */
    public static final class C19229a implements Runnable {
        public final void run() {
            Iterator it = new ArrayList(C19228f.f43011d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C19228f.f43011d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A[SYNTHETIC, Splitter:B:10:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[LOOP:0: B:19:0x0039->B:30:0x006f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            f43010c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f43011d = r0
            java.lang.String r0 = "rx2.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            f43008a = r0
            java.lang.String r2 = "rx2.purge-period-seconds"
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            f43009b = r0
            boolean r0 = f43008a
            if (r0 == 0) goto L_0x0073
        L_0x0039:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = f43010c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L_0x0044
            goto L_0x0073
        L_0x0044:
            io.reactivex.internal.schedulers.RxThreadFactory r3 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L_0x004f:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L_0x0057
            r0 = r1
            goto L_0x005e
        L_0x0057:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L_0x004f
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x006f
            io.reactivex.internal.schedulers.f$a r6 = new io.reactivex.internal.schedulers.f$a
            r6.<init>()
            int r0 = f43009b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L_0x0073
        L_0x006f:
            r5.shutdownNow()
            goto L_0x0039
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.schedulers.C19228f.<clinit>():void");
    }
}
