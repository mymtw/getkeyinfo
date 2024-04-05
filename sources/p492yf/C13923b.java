package p492yf;

import java.util.concurrent.ConcurrentHashMap;
import p401mg.C13080a;
import p492yf.C13926c;

/* renamed from: yf.b */
public final class C13923b {

    /* renamed from: a */
    public static final C13923b f30599a = new C13923b();

    /* renamed from: yf.b$a */
    public static final class C13924a implements Runnable {

        /* renamed from: b */
        public static final C13924a f30600b = new C13924a();

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    C13923b.m21431a(C13923b.f30599a);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: yf.b$b */
    public static final class C13925b implements Runnable {

        /* renamed from: b */
        public static final C13925b f30601b = new C13925b();

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    C13923b.m21431a(C13923b.f30599a);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m21431a(C13923b bVar) {
        ConcurrentHashMap b;
        Class<C13926c> cls;
        ConcurrentHashMap concurrentHashMap;
        Class<C13923b> cls2 = C13923b.class;
        if (!C13080a.m20762b(cls2)) {
            try {
                bVar.getClass();
                if (!C13080a.m20762b(bVar)) {
                    try {
                        C13926c.f30607x.getClass();
                        b = C13926c.C13928b.m21439b();
                        cls = C13926c.class;
                        if (!C13080a.m20762b(cls)) {
                            concurrentHashMap = C13926c.f30606w;
                            C13934f.m21456e(b, concurrentHashMap);
                            C13926c.C13928b.m21439b().clear();
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(bVar, th);
                        return;
                    }
                    concurrentHashMap = null;
                    C13934f.m21456e(b, concurrentHashMap);
                    C13926c.C13928b.m21439b().clear();
                }
            } catch (Throwable th2) {
                C13080a.m20761a(cls2, th2);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039 A[SYNTHETIC, Splitter:B:25:0x0039] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21432b(android.content.Context r5) {
        /*
            java.lang.Class<yf.c> r0 = p492yf.C13926c.class
            java.lang.Class<yf.b> r1 = p492yf.C13923b.class
            boolean r2 = p401mg.C13080a.m20762b(r1)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r5, r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "com.android.billingclient.api.Purchase"
            java.lang.Class r2 = p492yf.C13938i.m21464a(r2)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            yf.c$b r2 = p492yf.C13926c.f30607x     // Catch:{ all -> 0x0081 }
            monitor-enter(r2)     // Catch:{ all -> 0x0081 }
            boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x007e }
            r4 = 0
            if (r3 == 0) goto L_0x0025
        L_0x0023:
            r3 = r4
            goto L_0x002d
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r3 = p492yf.C13926c.f30602s     // Catch:{ all -> 0x0028 }
            goto L_0x002d
        L_0x0028:
            r3 = move-exception
            p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x007e }
            goto L_0x0023
        L_0x002d:
            boolean r3 = r3.get()     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0039
            yf.c r5 = p492yf.C13926c.m21433a()     // Catch:{ all -> 0x007e }
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            goto L_0x0053
        L_0x0039:
            p492yf.C13926c.C13928b.m21438a(r5)     // Catch:{ all -> 0x007e }
            boolean r5 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            java.util.concurrent.atomic.AtomicBoolean r4 = p492yf.C13926c.f30602s     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r5 = move-exception
            p401mg.C13080a.m20761a(r0, r5)     // Catch:{ all -> 0x007e }
        L_0x004a:
            r5 = 1
            r4.set(r5)     // Catch:{ all -> 0x007e }
            yf.c r5 = p492yf.C13926c.m21433a()     // Catch:{ all -> 0x007e }
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
        L_0x0053:
            if (r5 == 0) goto L_0x007d
            java.util.concurrent.atomic.AtomicBoolean r0 = p492yf.C13926c.C13928b.m21440c()     // Catch:{ all -> 0x0081 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007d
            boolean r0 = p492yf.C13934f.m21455d()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007a
            boolean r0 = p401mg.C13080a.m20762b(r5)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006c
            goto L_0x007d
        L_0x006c:
            yf.d r0 = new yf.d     // Catch:{ all -> 0x0075 }
            r0.<init>(r5)     // Catch:{ all -> 0x0075 }
            r5.mo46735c(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x007d
        L_0x0075:
            r0 = move-exception
            p401mg.C13080a.m20761a(r5, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x007d
        L_0x007a:
            r5.mo46734b()     // Catch:{ all -> 0x0081 }
        L_0x007d:
            return
        L_0x007e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0081 }
            throw r5     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
            p401mg.C13080a.m20761a(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p492yf.C13923b.m21432b(android.content.Context):void");
    }
}
