package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C19383o;

public final class AnrPlugin implements C5719a2 {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";
    public static final C5703a Companion = new C5703a();
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private C5917u client;
    private final C5720b collector = new C5720b();
    private final C5812n1 libraryLoader = new C5812n1();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    /* renamed from: com.bugsnag.android.AnrPlugin$a */
    public static final class C5703a {
    }

    /* renamed from: com.bugsnag.android.AnrPlugin$b */
    public static final class C5704b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AnrPlugin f12104b;

        public C5704b(AnrPlugin anrPlugin) {
            this.f12104b = anrPlugin;
        }

        public final void run() {
            this.f12104b.initNativePlugin();
        }
    }

    /* renamed from: com.bugsnag.android.AnrPlugin$c */
    public static final class C5705c implements C5934x1 {

        /* renamed from: a */
        public static final C5705c f12105a = new C5705c();

        /* renamed from: a */
        public final void mo16417a(C5908s0 s0Var) {
            C19383o.m32798h(s0Var, "it");
            C5819p0 p0Var = s0Var.f12603b.f12658m.get(0);
            C19383o.m32793c(p0Var, "error");
            p0Var.mo16610a("AnrLinkError");
            p0Var.f12445b.f12457d = AnrPlugin.LOAD_ERR_MSG;
        }
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    /* access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        C5917u uVar = this.client;
        if (uVar != null) {
            uVar.f12636o.mo16606f("Initialised ANR Plugin");
        } else {
            C19383o.m32805o("client");
            throw null;
        }
    }

    private final Class<?> loadClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[Catch:{ Exception -> 0x0112 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A[Catch:{ Exception -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void notifyAnrDetected(java.util.List<com.bugsnag.android.NativeStackframe> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "client"
            r1 = 0
            com.bugsnag.android.u r2 = r14.client     // Catch:{ Exception -> 0x0112 }
            if (r2 == 0) goto L_0x010e
            com.bugsnag.android.internal.c r2 = r2.f12622a     // Catch:{ Exception -> 0x0112 }
            boolean r3 = r2.mo16546c()     // Catch:{ Exception -> 0x0112 }
            r4 = 0
            r5 = 1
            java.lang.String r6 = "ANR"
            if (r3 != 0) goto L_0x001e
            java.util.Collection<java.lang.String> r2 = r2.f12316f     // Catch:{ Exception -> 0x0112 }
            boolean r2 = kotlin.collections.C19327t.m32634P0(r6, r2)     // Catch:{ Exception -> 0x0112 }
            if (r2 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = r4
            goto L_0x001f
        L_0x001e:
            r2 = r5
        L_0x001f:
            if (r2 == 0) goto L_0x0022
            return
        L_0x0022:
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = "Looper.getMainLooper()"
            kotlin.jvm.internal.C19383o.m32793c(r2, r3)     // Catch:{ Exception -> 0x0112 }
            java.lang.Thread r2 = r2.getThread()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = "Looper.getMainLooper().thread"
            kotlin.jvm.internal.C19383o.m32793c(r2, r3)     // Catch:{ Exception -> 0x0112 }
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.AnrPlugin$a r3 = Companion     // Catch:{ Exception -> 0x0112 }
            java.lang.String r7 = "stackTrace"
            kotlin.jvm.internal.C19383o.m32793c(r2, r7)     // Catch:{ Exception -> 0x0112 }
            r3.getClass()     // Catch:{ Exception -> 0x0112 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0112 }
            if (r3 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r5 = r4
        L_0x0047:
            if (r5 == 0) goto L_0x004b
            r3 = r4
            goto L_0x0055
        L_0x004b:
            java.lang.Object r3 = kotlin.collections.C19318k.m32612d1(r2)     // Catch:{ Exception -> 0x0112 }
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3     // Catch:{ Exception -> 0x0112 }
            boolean r3 = r3.isNativeMethod()     // Catch:{ Exception -> 0x0112 }
        L_0x0055:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0112 }
            r5.<init>()     // Catch:{ Exception -> 0x0112 }
            r5.setStackTrace(r2)     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.u r2 = r14.client     // Catch:{ Exception -> 0x0112 }
            if (r2 == 0) goto L_0x010a
            java.lang.String r7 = "anrError"
            com.bugsnag.android.g2 r7 = com.bugsnag.android.C5750g2.m11538a(r1, r7, r1)     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.s0 r13 = com.bugsnag.android.NativeInterface.createEvent(r5, r2, r7)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r2 = "NativeInterface.createEv…REASON_ANR)\n            )"
            kotlin.jvm.internal.C19383o.m32793c(r13, r2)     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.u0 r2 = r13.f12603b     // Catch:{ Exception -> 0x0112 }
            java.util.List<com.bugsnag.android.p0> r2 = r2.f12658m     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.p0 r2 = (com.bugsnag.android.C5819p0) r2     // Catch:{ Exception -> 0x0112 }
            java.lang.String r5 = "err"
            kotlin.jvm.internal.C19383o.m32793c(r2, r5)     // Catch:{ Exception -> 0x0112 }
            r2.mo16610a(r6)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r5 = "Application did not respond to UI input"
            com.bugsnag.android.q0 r6 = r2.f12445b     // Catch:{ Exception -> 0x0112 }
            r6.f12457d = r5     // Catch:{ Exception -> 0x0112 }
            if (r3 == 0) goto L_0x00e2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112 }
            int r5 = kotlin.collections.C19322o.m32624F0(r15)     // Catch:{ Exception -> 0x0112 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0112 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x0112 }
        L_0x0097:
            boolean r5 = r15.hasNext()     // Catch:{ Exception -> 0x0112 }
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r15.next()     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.NativeStackframe r5 = (com.bugsnag.android.NativeStackframe) r5     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.i2 r6 = new com.bugsnag.android.i2     // Catch:{ Exception -> 0x0112 }
            r6.<init>((com.bugsnag.android.NativeStackframe) r5)     // Catch:{ Exception -> 0x0112 }
            r3.add(r6)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0097
        L_0x00ac:
            com.bugsnag.android.q0 r15 = r2.f12445b     // Catch:{ Exception -> 0x0112 }
            java.util.List<com.bugsnag.android.i2> r15 = r15.f12455b     // Catch:{ Exception -> 0x0112 }
            r15.addAll(r4, r3)     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.u0 r15 = r13.f12603b     // Catch:{ Exception -> 0x0112 }
            java.util.List<com.bugsnag.android.Thread> r15 = r15.f12659n     // Catch:{ Exception -> 0x0112 }
            java.lang.String r2 = "event.threads"
            kotlin.jvm.internal.C19383o.m32793c(r15, r2)     // Catch:{ Exception -> 0x0112 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x0112 }
        L_0x00c0:
            boolean r2 = r15.hasNext()     // Catch:{ Exception -> 0x0112 }
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r15.next()     // Catch:{ Exception -> 0x0112 }
            r5 = r2
            com.bugsnag.android.Thread r5 = (com.bugsnag.android.Thread) r5     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.o2 r5 = r5.f12137b     // Catch:{ Exception -> 0x0112 }
            boolean r5 = r5.f12442f     // Catch:{ Exception -> 0x0112 }
            if (r5 == 0) goto L_0x00c0
            goto L_0x00d5
        L_0x00d4:
            r2 = r1
        L_0x00d5:
            com.bugsnag.android.Thread r2 = (com.bugsnag.android.Thread) r2     // Catch:{ Exception -> 0x0112 }
            if (r2 == 0) goto L_0x00e2
            com.bugsnag.android.o2 r15 = r2.f12137b     // Catch:{ Exception -> 0x0112 }
            java.util.ArrayList r15 = r15.f12438b     // Catch:{ Exception -> 0x0112 }
            if (r15 == 0) goto L_0x00e2
            r15.addAll(r4, r3)     // Catch:{ Exception -> 0x0112 }
        L_0x00e2:
            com.bugsnag.android.b r9 = r14.collector     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.u r10 = r14.client     // Catch:{ Exception -> 0x0112 }
            if (r10 == 0) goto L_0x0106
            r9.getClass()     // Catch:{ Exception -> 0x0112 }
            android.os.Handler r15 = new android.os.Handler     // Catch:{ Exception -> 0x0112 }
            android.os.HandlerThread r2 = r9.f12148a     // Catch:{ Exception -> 0x0112 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ Exception -> 0x0112 }
            r15.<init>(r2)     // Catch:{ Exception -> 0x0112 }
            java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ Exception -> 0x0112 }
            r11.<init>()     // Catch:{ Exception -> 0x0112 }
            com.bugsnag.android.a r2 = new com.bugsnag.android.a     // Catch:{ Exception -> 0x0112 }
            r8 = r2
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0112 }
            r15.post(r2)     // Catch:{ Exception -> 0x0112 }
            goto L_0x011e
        L_0x0106:
            kotlin.jvm.internal.C19383o.m32805o(r0)     // Catch:{ Exception -> 0x0112 }
            throw r1     // Catch:{ Exception -> 0x0112 }
        L_0x010a:
            kotlin.jvm.internal.C19383o.m32805o(r0)     // Catch:{ Exception -> 0x0112 }
            throw r1     // Catch:{ Exception -> 0x0112 }
        L_0x010e:
            kotlin.jvm.internal.C19383o.m32805o(r0)     // Catch:{ Exception -> 0x0112 }
            throw r1     // Catch:{ Exception -> 0x0112 }
        L_0x0112:
            r15 = move-exception
            com.bugsnag.android.u r2 = r14.client
            if (r2 == 0) goto L_0x011f
            com.bugsnag.android.o1 r0 = r2.f12636o
            java.lang.String r1 = "Internal error reporting ANR"
            r0.mo16603c(r1, r15)
        L_0x011e:
            return
        L_0x011f:
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.AnrPlugin.notifyAnrDetected(java.util.List):void");
    }

    private final void performOneTimeSetup(C5917u uVar) {
        T t;
        C5812n1 n1Var = this.libraryLoader;
        C5705c cVar = C5705c.f12105a;
        n1Var.getClass();
        try {
            uVar.f12645x.mo16512a(TaskType.IO, new C5808m1(n1Var, "bugsnag-plugin-android-anr", uVar, cVar)).get();
        } catch (Throwable unused) {
        }
        Class<?> loadClass = loadClass("com.bugsnag.android.NdkPlugin");
        if (loadClass != null) {
            C5723b2 b2Var = uVar.f12640s;
            b2Var.getClass();
            Iterator<T> it = b2Var.f12159a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C19383o.m32792b(((C5719a2) t).getClass(), loadClass)) {
                    break;
                }
            }
            C5719a2 a2Var = (C5719a2) t;
            if (a2Var != null) {
                Object invoke = a2Var.getClass().getMethod("getSignalUnwindStackFunction", new Class[0]).invoke(a2Var, new Object[0]);
                if (invoke != null) {
                    setUnwindFunction(((Long) invoke).longValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
            }
        }
    }

    private final native void setUnwindFunction(long j);

    public void load(C5917u uVar) {
        C19383o.m32798h(uVar, "client");
        this.client = uVar;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(uVar);
        }
        if (this.libraryLoader.f12432b) {
            Looper mainLooper = Looper.getMainLooper();
            if (C19383o.m32792b(Looper.myLooper(), mainLooper)) {
                initNativePlugin();
            } else {
                new Handler(mainLooper).postAtFrontOfQueue(new C5704b(this));
            }
        } else {
            uVar.f12636o.mo16605e(LOAD_ERR_MSG);
        }
    }

    public void unload() {
        if (this.libraryLoader.f12432b) {
            disableAnrReporting();
        }
    }
}
