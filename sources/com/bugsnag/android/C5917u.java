package com.bugsnag.android;

import android.content.Context;
import android.os.RemoteException;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.C5829r1;
import com.bugsnag.android.internal.C5763c;
import com.etsy.android.lib.models.cardviewelement.BaseMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;

/* renamed from: com.bugsnag.android.u */
public final class C5917u {

    /* renamed from: a */
    public final C5763c f12622a;

    /* renamed from: b */
    public final C5909s1 f12623b;

    /* renamed from: c */
    public final C5718a1 f12624c;

    /* renamed from: d */
    public final C5717a0 f12625d;

    /* renamed from: e */
    public final C5805m f12626e;

    /* renamed from: f */
    public final C5920u2 f12627f;

    /* renamed from: g */
    public final Context f12628g;

    /* renamed from: h */
    public final C5773j0 f12629h;

    /* renamed from: i */
    public final C5729d f12630i;

    /* renamed from: j */
    public final BreadcrumbState f12631j;

    /* renamed from: k */
    public final C5825q1 f12632k;

    /* renamed from: l */
    public final C5926w0 f12633l;

    /* renamed from: m */
    public final C5738e2 f12634m;

    /* renamed from: n */
    public final SystemBroadcastReceiver f12635n;

    /* renamed from: o */
    public final C5816o1 f12636o;

    /* renamed from: p */
    public final C5938z f12637p;

    /* renamed from: q */
    public final C5742f0 f12638q;

    /* renamed from: r */
    public final C5921v f12639r;

    /* renamed from: s */
    public C5723b2 f12640s;

    /* renamed from: t */
    public final C5914t1 f12641t;

    /* renamed from: u */
    public final C5758i1 f12642u;

    /* renamed from: v */
    public final C5775j1 f12643v;

    /* renamed from: w */
    public final C5803l1 f12644w;

    /* renamed from: x */
    public final C5746g f12645x;

    /* renamed from: y */
    public final C5936y0 f12646y;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02f9 A[SYNTHETIC, Splitter:B:66:0x02f9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5917u(com.bugsnag.android.C5932x r26, android.content.Context r27) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r0 = r27
            r25.<init>()
            com.bugsnag.android.q1 r15 = new com.bugsnag.android.q1
            r15.<init>()
            r7.f12632k = r15
            com.bugsnag.android.g r14 = new com.bugsnag.android.g
            r14.<init>()
            r7.f12645x = r14
            com.bugsnag.android.internal.dag.b r13 = new com.bugsnag.android.internal.dag.b
            r13.<init>(r0)
            android.content.Context r1 = r13.f12340b
            r7.f12628g = r1
            com.bugsnag.android.w r2 = r8.f12711a
            com.bugsnag.android.t1 r2 = r2.f12693w
            r7.f12641t = r2
            com.bugsnag.android.z r12 = new com.bugsnag.android.z
            com.bugsnag.android.n r2 = new com.bugsnag.android.n
            r2.<init>(r7)
            r12.<init>(r1, r2)
            r7.f12637p = r12
            com.bugsnag.android.internal.dag.a r11 = new com.bugsnag.android.internal.dag.a
            r11.<init>(r13, r8, r12)
            com.bugsnag.android.internal.c r2 = r11.f12339b
            r7.f12622a = r2
            com.bugsnag.android.o1 r3 = r2.f12329s
            r7.f12636o = r3
            boolean r0 = r0 instanceof android.app.Application
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration"
            r3.mo16608h(r0)
        L_0x0048:
            com.bugsnag.android.StorageModule r10 = new com.bugsnag.android.StorageModule
            r10.<init>(r1, r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bugsnag.android.internal.c r0 = r11.f12339b
            com.bugsnag.android.v r1 = new com.bugsnag.android.v
            r1.<init>()
            com.bugsnag.android.w r2 = r8.f12711a
            com.bugsnag.android.m r2 = r2.f12672b
            java.util.Collection<com.bugsnag.android.x1> r3 = r2.f12415a
            java.util.Collection<com.bugsnag.android.w1> r4 = r2.f12416b
            java.util.Collection<com.bugsnag.android.z1> r5 = r2.f12417c
            java.util.Collection<com.bugsnag.android.y1> r2 = r2.f12418d
            java.lang.String r6 = "onErrorTasks"
            kotlin.jvm.internal.C19383o.m32798h(r3, r6)
            java.lang.String r6 = "onBreadcrumbTasks"
            kotlin.jvm.internal.C19383o.m32798h(r4, r6)
            java.lang.String r6 = "onSessionTasks"
            kotlin.jvm.internal.C19383o.m32798h(r5, r6)
            java.lang.String r6 = "onSendTasks"
            kotlin.jvm.internal.C19383o.m32798h(r2, r6)
            com.bugsnag.android.m r6 = new com.bugsnag.android.m
            r6.<init>(r3, r4, r5, r2)
            com.bugsnag.android.a0 r2 = new com.bugsnag.android.a0
            r2.<init>()
            com.bugsnag.android.w r3 = r8.f12711a
            r3.getClass()
            kotlin.m r3 = kotlin.C19394m.f43287a
            com.bugsnag.android.BreadcrumbState r3 = new com.bugsnag.android.BreadcrumbState
            int r4 = r0.f12330t
            com.bugsnag.android.o1 r0 = r0.f12329s
            r3.<init>(r4, r6, r0)
            com.bugsnag.android.w r0 = r8.f12711a
            com.bugsnag.android.s1 r0 = r0.f12673c
            com.bugsnag.android.r1 r0 = r0.f12604b
            com.bugsnag.android.r1 r0 = r0.mo16618d()
            com.bugsnag.android.s1 r4 = new com.bugsnag.android.s1
            r4.<init>((com.bugsnag.android.C5829r1) r0)
            com.bugsnag.android.w r0 = r8.f12711a
            com.bugsnag.android.a1 r0 = r0.f12674d
            com.bugsnag.android.a1 r5 = new com.bugsnag.android.a1
            com.bugsnag.android.b1 r0 = r0.f12147b
            com.bugsnag.android.b1 r9 = new com.bugsnag.android.b1
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f12158c
            java.util.LinkedHashMap r0 = kotlin.collections.C19294b0.m32558A0(r0)
            r9.<init>(r0)
            r5.<init>((com.bugsnag.android.C5722b1) r9)
            r7.f12639r = r1
            r7.f12626e = r6
            r7.f12631j = r3
            r7.f12625d = r2
            r7.f12623b = r4
            r7.f12624c = r5
            com.bugsnag.android.internal.dag.c r9 = new com.bugsnag.android.internal.dag.c
            r9.<init>(r13)
            com.bugsnag.android.TaskType r0 = com.bugsnag.android.TaskType.IO
            r10.mo16553b(r14, r0)
            com.bugsnag.android.s2 r5 = new com.bugsnag.android.s2
            r1 = r5
            r2 = r11
            r3 = r10
            r4 = r25
            r8 = r5
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            com.bugsnag.android.l1 r1 = r8.f12605b
            r7.f12644w = r1
            com.bugsnag.android.e2 r1 = r8.f12606c
            r7.f12634m = r1
            com.bugsnag.android.b0 r1 = new com.bugsnag.android.b0
            kotlin.c r2 = r10.f12131d
            java.lang.Object r2 = r2.getValue()
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r2 = r9
            r9 = r1
            r3 = r10
            r10 = r13
            r4 = r11
            r5 = r12
            r12 = r2
            r6 = r13
            r13 = r8
            r27 = r14
            r17 = r15
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r27
            r1.mo16553b(r5, r0)
            kotlin.c r0 = r1.f12154g
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.d r0 = (com.bugsnag.android.C5729d) r0
            r7.f12630i = r0
            kotlin.c r0 = r1.f12156i
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.j0 r0 = (com.bugsnag.android.C5773j0) r0
            r7.f12629h = r0
            kotlin.c r0 = r3.f12132e
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            com.bugsnag.android.w2 r5 = (com.bugsnag.android.C5931w2) r5
            r9 = r8
            r8 = r26
            com.bugsnag.android.w r0 = r8.f12711a
            com.bugsnag.android.t2 r0 = r0.f12671a
            r5.getClass()
            java.lang.String r10 = "initialUser"
            kotlin.jvm.internal.C19383o.m32798h(r0, r10)
            java.lang.String r10 = r0.f12619b
            if (r10 != 0) goto L_0x013f
            java.lang.String r10 = r0.f12621d
            if (r10 != 0) goto L_0x013f
            java.lang.String r10 = r0.f12620c
            if (r10 == 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r10 = 0
            goto L_0x0140
        L_0x013f:
            r10 = 1
        L_0x0140:
            r13 = 0
            java.lang.String r14 = "install.iud"
            if (r10 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            boolean r0 = r5.f12706b
            if (r0 == 0) goto L_0x0195
            com.bugsnag.android.h2 r0 = r5.f12709e
            android.content.SharedPreferences r0 = r0.f12284a
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto L_0x017d
            com.bugsnag.android.h2 r0 = r5.f12709e
            java.lang.String r10 = r5.f12708d
            r0.getClass()
            com.bugsnag.android.t2 r15 = new com.bugsnag.android.t2
            android.content.SharedPreferences r11 = r0.f12284a
            java.lang.String r12 = "user.id"
            java.lang.String r10 = r11.getString(r12, r10)
            android.content.SharedPreferences r11 = r0.f12284a
            java.lang.String r12 = "user.email"
            java.lang.String r11 = r11.getString(r12, r13)
            android.content.SharedPreferences r0 = r0.f12284a
            java.lang.String r12 = "user.name"
            java.lang.String r0 = r0.getString(r12, r13)
            r15.<init>(r10, r11, r0)
            r5.mo16700a(r15)
            r0 = r15
            goto L_0x0196
        L_0x017d:
            com.bugsnag.android.n2<com.bugsnag.android.t2> r0 = r5.f12705a     // Catch:{ Exception -> 0x018d }
            com.bugsnag.android.UserStore$loadPersistedUser$1 r10 = new com.bugsnag.android.UserStore$loadPersistedUser$1     // Catch:{ Exception -> 0x018d }
            com.bugsnag.android.t2$a r11 = com.bugsnag.android.C5915t2.f12618e     // Catch:{ Exception -> 0x018d }
            r10.<init>(r11)     // Catch:{ Exception -> 0x018d }
            com.bugsnag.android.g1$a r0 = r0.mo16575a(r10)     // Catch:{ Exception -> 0x018d }
            com.bugsnag.android.t2 r0 = (com.bugsnag.android.C5915t2) r0     // Catch:{ Exception -> 0x018d }
            goto L_0x0196
        L_0x018d:
            r0 = move-exception
            com.bugsnag.android.o1 r10 = r5.f12710f
            java.lang.String r11 = "Failed to load user info"
            r10.mo16602b(r11, r0)
        L_0x0195:
            r0 = r13
        L_0x0196:
            if (r0 == 0) goto L_0x01b0
            java.lang.String r10 = r0.f12619b
            if (r10 != 0) goto L_0x01a7
            java.lang.String r10 = r0.f12621d
            if (r10 != 0) goto L_0x01a7
            java.lang.String r10 = r0.f12620c
            if (r10 == 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            r11 = 0
            goto L_0x01a8
        L_0x01a7:
            r11 = 1
        L_0x01a8:
            if (r11 == 0) goto L_0x01b0
            com.bugsnag.android.u2 r10 = new com.bugsnag.android.u2
            r10.<init>(r0)
            goto L_0x01bc
        L_0x01b0:
            com.bugsnag.android.u2 r10 = new com.bugsnag.android.u2
            com.bugsnag.android.t2 r0 = new com.bugsnag.android.t2
            java.lang.String r11 = r5.f12708d
            r0.<init>(r11, r13, r13)
            r10.<init>(r0)
        L_0x01bc:
            com.bugsnag.android.v2 r0 = new com.bugsnag.android.v2
            r0.<init>(r5)
            r10.addObserver(r0)
            r7.f12627f = r10
            kotlin.c r0 = r3.f12129b
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.h2 r0 = (com.bugsnag.android.C5755h2) r0
            android.content.SharedPreferences r5 = r0.f12284a
            boolean r5 = r5.contains(r14)
            if (r5 == 0) goto L_0x01e3
            android.content.SharedPreferences r0 = r0.f12284a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
        L_0x01e3:
            android.content.Context r0 = r7.f12628g
            boolean r5 = r0 instanceof android.app.Application
            if (r5 == 0) goto L_0x020c
            android.app.Application r0 = (android.app.Application) r0
            com.bugsnag.android.SessionLifecycleCallback r5 = new com.bugsnag.android.SessionLifecycleCallback
            com.bugsnag.android.e2 r10 = r7.f12634m
            r5.<init>(r10)
            r0.registerActivityLifecycleCallbacks(r5)
            com.bugsnag.android.internal.c r5 = r7.f12622a
            com.bugsnag.android.BreadcrumbType r10 = com.bugsnag.android.BreadcrumbType.STATE
            boolean r5 = r5.mo16545b(r10)
            if (r5 != 0) goto L_0x020c
            com.bugsnag.android.ActivityBreadcrumbCollector r5 = new com.bugsnag.android.ActivityBreadcrumbCollector
            com.bugsnag.android.o r10 = new com.bugsnag.android.o
            r10.<init>(r7)
            r5.<init>(r10)
            r0.registerActivityLifecycleCallbacks(r5)
        L_0x020c:
            com.bugsnag.android.EventStorageModule r0 = new com.bugsnag.android.EventStorageModule
            com.bugsnag.android.g r5 = r7.f12645x
            com.bugsnag.android.t1 r10 = r7.f12641t
            com.bugsnag.android.m r11 = r7.f12626e
            r16 = r0
            r17 = r6
            r18 = r4
            r19 = r1
            r20 = r5
            r21 = r9
            r22 = r2
            r23 = r10
            r24 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            com.bugsnag.android.g r1 = r7.f12645x
            com.bugsnag.android.TaskType r2 = com.bugsnag.android.TaskType.IO
            r0.mo16553b(r1, r2)
            kotlin.c r0 = r0.f12117d
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.w0 r0 = (com.bugsnag.android.C5926w0) r0
            r7.f12633l = r0
            com.bugsnag.android.f0 r1 = new com.bugsnag.android.f0
            com.bugsnag.android.o1 r15 = r7.f12636o
            com.bugsnag.android.internal.c r2 = r7.f12622a
            com.bugsnag.android.m r4 = r7.f12626e
            com.bugsnag.android.t1 r5 = r7.f12641t
            com.bugsnag.android.g r6 = r7.f12645x
            r14 = r1
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.f12638q = r1
            com.bugsnag.android.y0 r0 = new com.bugsnag.android.y0
            com.bugsnag.android.o1 r1 = r7.f12636o
            r0.<init>(r7, r1)
            r7.f12646y = r0
            com.bugsnag.android.internal.c r1 = r7.f12622a
            com.bugsnag.android.r0 r1 = r1.f12313c
            boolean r1 = r1.f12464c
            if (r1 == 0) goto L_0x026a
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
        L_0x026a:
            kotlin.c r0 = r3.f12133f
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.j1 r0 = (com.bugsnag.android.C5775j1) r0
            r7.f12643v = r0
            kotlin.c r0 = r3.f12135h
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.i1 r0 = (com.bugsnag.android.C5758i1) r0
            r7.f12642u = r0
            com.bugsnag.android.NativeInterface.setClient(r25)
            com.bugsnag.android.w r0 = r8.f12711a
            java.util.HashSet<com.bugsnag.android.a2> r0 = r0.f12694x
            com.bugsnag.android.b2 r1 = new com.bugsnag.android.b2
            com.bugsnag.android.internal.c r2 = r7.f12622a
            com.bugsnag.android.o1 r3 = r7.f12636o
            r1.<init>(r0, r2, r3)
            r7.f12640s = r1
            java.util.Set<com.bugsnag.android.a2> r0 = r1.f12159a
            java.util.Iterator r2 = r0.iterator()
        L_0x0296:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r2.next()
            r3 = r0
            com.bugsnag.android.a2 r3 = (com.bugsnag.android.C5719a2) r3
            java.lang.Class r0 = r3.getClass()     // Catch:{ all -> 0x02d3 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x02d3 }
            com.bugsnag.android.internal.c r4 = r1.f12163e     // Catch:{ all -> 0x02d3 }
            com.bugsnag.android.r0 r4 = r4.f12313c     // Catch:{ all -> 0x02d3 }
            java.lang.String r5 = "com.bugsnag.android.NdkPlugin"
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)     // Catch:{ all -> 0x02d3 }
            if (r5 == 0) goto L_0x02bf
            boolean r0 = r4.f12463b     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x0296
            r3.load(r7)     // Catch:{ all -> 0x02d3 }
            goto L_0x0296
        L_0x02bf:
            java.lang.String r5 = "com.bugsnag.android.AnrPlugin"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r4.f12462a     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x0296
            r3.load(r7)     // Catch:{ all -> 0x02d3 }
            goto L_0x0296
        L_0x02cf:
            r3.load(r7)     // Catch:{ all -> 0x02d3 }
            goto L_0x0296
        L_0x02d3:
            r0 = move-exception
            com.bugsnag.android.o1 r4 = r1.f12164f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to load plugin "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ", continuing with initialisation."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.mo16603c(r3, r0)
            goto L_0x0296
        L_0x02f0:
            com.bugsnag.android.w0 r1 = r7.f12633l
            com.bugsnag.android.internal.c r0 = r1.f12697h
            boolean r0 = r0.f12335y
            if (r0 != 0) goto L_0x02f9
            goto L_0x0325
        L_0x02f9:
            com.bugsnag.android.g r0 = r1.f12700k     // Catch:{ RejectedExecutionException -> 0x0307 }
            com.bugsnag.android.TaskType r2 = com.bugsnag.android.TaskType.ERROR_REQUEST     // Catch:{ RejectedExecutionException -> 0x0307 }
            com.bugsnag.android.x0 r3 = new com.bugsnag.android.x0     // Catch:{ RejectedExecutionException -> 0x0307 }
            r3.<init>(r1)     // Catch:{ RejectedExecutionException -> 0x0307 }
            java.util.concurrent.Future r13 = r0.mo16512a(r2, r3)     // Catch:{ RejectedExecutionException -> 0x0307 }
            goto L_0x030f
        L_0x0307:
            r0 = move-exception
            com.bugsnag.android.o1 r2 = r1.f12702m
            java.lang.String r3 = "Failed to flush launch crash reports, continuing."
            r2.mo16607g(r3, r0)
        L_0x030f:
            if (r13 == 0) goto L_0x0325
            r2 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b, TimeoutException -> 0x0319 }
            r13.get(r2, r0)     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b, TimeoutException -> 0x0319 }
            goto L_0x0325
        L_0x0319:
            r0 = move-exception
            goto L_0x031e
        L_0x031b:
            r0 = move-exception
            goto L_0x031e
        L_0x031d:
            r0 = move-exception
        L_0x031e:
            com.bugsnag.android.o1 r1 = r1.f12702m
            java.lang.String r2 = "Failed to send launch crash reports within 2s timeout, continuing."
            r1.mo16607g(r2, r0)
        L_0x0325:
            com.bugsnag.android.w0 r0 = r7.f12633l
            r0.mo16695j()
            com.bugsnag.android.e2 r0 = r7.f12634m
            r0.mo16504b()
            com.bugsnag.android.SystemBroadcastReceiver r0 = new com.bugsnag.android.SystemBroadcastReceiver
            com.bugsnag.android.o1 r1 = r7.f12636o
            r0.<init>(r7, r1)
            r7.f12635n = r0
            android.content.Context r0 = r7.f12628g
            com.bugsnag.android.ClientComponentCallbacks r1 = new com.bugsnag.android.ClientComponentCallbacks
            com.bugsnag.android.j0 r2 = r7.f12629h
            com.bugsnag.android.r r3 = new com.bugsnag.android.r
            r3.<init>(r7)
            com.bugsnag.android.s r4 = new com.bugsnag.android.s
            r4.<init>(r7)
            r1.<init>(r2, r3, r4)
            r0.registerComponentCallbacks(r1)
            com.bugsnag.android.g r0 = r7.f12645x     // Catch:{ RejectedExecutionException -> 0x035b }
            com.bugsnag.android.TaskType r1 = com.bugsnag.android.TaskType.DEFAULT     // Catch:{ RejectedExecutionException -> 0x035b }
            com.bugsnag.android.p r2 = new com.bugsnag.android.p     // Catch:{ RejectedExecutionException -> 0x035b }
            r2.<init>(r7)     // Catch:{ RejectedExecutionException -> 0x035b }
            r0.mo16512a(r1, r2)     // Catch:{ RejectedExecutionException -> 0x035b }
            goto L_0x0363
        L_0x035b:
            r0 = move-exception
            com.bugsnag.android.o1 r1 = r7.f12636o
            java.lang.String r2 = "Failed to register for system events"
            r1.mo16602b(r2, r0)
        L_0x0363:
            java.util.Map r0 = java.util.Collections.emptyMap()
            com.bugsnag.android.BreadcrumbType r1 = com.bugsnag.android.BreadcrumbType.STATE
            java.lang.String r2 = "Bugsnag loaded"
            r7.mo16682a(r1, r2, r0)
            com.bugsnag.android.o1 r0 = r7.f12636o
            r0.mo16604d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5917u.<init>(com.bugsnag.android.x, android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo16682a(BreadcrumbType breadcrumbType, String str, Map map) {
        if (!this.f12622a.mo16545b(breadcrumbType)) {
            this.f12631j.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f12636o));
        }
    }

    /* renamed from: b */
    public final void mo16683b(BreadcrumbType breadcrumbType, String str, Map map) {
        if (str == null || breadcrumbType == null || map == null) {
            mo16684c("leaveBreadcrumb");
            return;
        }
        this.f12631j.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f12636o));
    }

    /* renamed from: c */
    public final void mo16684c(String str) {
        C5816o1 o1Var = this.f12636o;
        o1Var.mo16605e("Invalid null value supplied to client." + str + ", ignoring");
    }

    /* renamed from: d */
    public final void mo16685d(Throwable th, C5934x1 x1Var) {
        if (th == null) {
            mo16684c(BaseMessage.TYPE_NOTIFY);
        } else if (!this.f12622a.mo16547d(th)) {
            Throwable th2 = th;
            mo16687f(new C5908s0(th2, this.f12622a, C5750g2.m11538a((Severity) null, "handledException", (String) null), this.f12623b.f12604b, this.f12624c.f12147b, this.f12636o), x1Var);
        }
    }

    /* renamed from: e */
    public final void mo16686e(Throwable th, C5829r1 r1Var, String str, String str2) {
        C5750g2 a = C5750g2.m11538a(Severity.ERROR, str, str2);
        C5829r1.C5830a aVar = C5829r1.f12466d;
        int i = 0;
        C5829r1[] r1VarArr = {this.f12623b.f12604b, r1Var};
        aVar.getClass();
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(r1VarArr[i2].mo16619e());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            C19324q.m32628J0(r1VarArr[i3].f12467b.f12669a, arrayList2);
        }
        ConcurrentHashMap a2 = C5829r1.C5830a.m11601a(arrayList);
        C19389t.m32909c(a2);
        C5829r1 r1Var2 = new C5829r1((Map<String, Map<String, Object>>) a2);
        Set<String> t1 = C19327t.m32664t1(arrayList2);
        C19383o.m32798h(t1, "value");
        C5923v1 v1Var = r1Var2.f12467b;
        v1Var.getClass();
        v1Var.f12669a = t1;
        mo16687f(new C5908s0(th, this.f12622a, a, r1Var2, this.f12624c.f12147b, this.f12636o), (C5934x1) null);
        C5758i1 i1Var = this.f12642u;
        if (i1Var != null) {
            i = i1Var.f12294a;
        }
        boolean z = this.f12644w.f12411b.get();
        if (z) {
            i++;
        }
        try {
            this.f12645x.mo16512a(TaskType.IO, new C5823q(this, new C5758i1(i, true, z)));
        } catch (RejectedExecutionException e) {
            this.f12636o.mo16602b("Failed to persist last run info", e);
        }
        C5746g gVar = this.f12645x;
        gVar.f12253d.shutdownNow();
        gVar.f12254e.shutdownNow();
        gVar.f12250a.shutdown();
        gVar.f12251b.shutdown();
        gVar.f12252c.shutdown();
        try {
            gVar.f12250a.awaitTermination(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        try {
            gVar.f12251b.awaitTermination(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused2) {
        }
        try {
            gVar.f12252c.awaitTermination(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused3) {
        }
    }

    /* renamed from: f */
    public final void mo16687f(C5908s0 s0Var, C5934x1 x1Var) {
        C5811n0 b = this.f12629h.mo16557b(new Date().getTime());
        C5918u0 u0Var = s0Var.f12603b;
        u0Var.getClass();
        u0Var.f12656k = b;
        HashMap c = this.f12629h.mo16558c();
        C5918u0 u0Var2 = s0Var.f12603b;
        u0Var2.getClass();
        u0Var2.f12648c.mo16616b("device", c);
        C5735e b2 = this.f12630i.mo16498b();
        C5918u0 u0Var3 = s0Var.f12603b;
        u0Var3.getClass();
        u0Var3.f12655j = b2;
        HashMap c2 = this.f12630i.mo16499c();
        C5918u0 u0Var4 = s0Var.f12603b;
        u0Var4.getClass();
        u0Var4.f12648c.mo16616b("app", c2);
        List<Breadcrumb> copy = this.f12631j.copy();
        C5918u0 u0Var5 = s0Var.f12603b;
        u0Var5.getClass();
        C19383o.m32798h(copy, "<set-?>");
        u0Var5.f12657l = copy;
        C5915t2 t2Var = this.f12627f.f12663b;
        String str = t2Var.f12619b;
        String str2 = t2Var.f12620c;
        String str3 = t2Var.f12621d;
        C5918u0 u0Var6 = s0Var.f12603b;
        u0Var6.getClass();
        u0Var6.f12662q = new C5915t2(str, str2, str3);
        String b3 = this.f12625d.mo16479b();
        C5918u0 u0Var7 = s0Var.f12603b;
        u0Var7.f12661p = b3;
        Set<String> set = this.f12623b.f12604b.f12467b.f12669a;
        C19383o.m32798h(set, "value");
        C5923v1 v1Var = u0Var7.f12652g;
        Set<String> t1 = C19327t.m32664t1(set);
        v1Var.getClass();
        C19383o.m32798h(t1, "<set-?>");
        v1Var.f12669a = t1;
        C5829r1 r1Var = u0Var7.f12648c;
        Set<String> t12 = C19327t.m32664t1(set);
        r1Var.getClass();
        C19383o.m32798h(t12, "value");
        C5923v1 v1Var2 = r1Var.f12467b;
        v1Var2.getClass();
        v1Var2.f12669a = t12;
        C5728c2 c2Var = this.f12634m.f12226j;
        String str4 = null;
        if (c2Var == null || c2Var.f12194n.get()) {
            c2Var = null;
        }
        if (c2Var != null && (this.f12622a.f12314d || !c2Var.f12190j.get())) {
            s0Var.f12603b.f12653h = c2Var;
        }
        C5805m mVar = this.f12626e;
        C5816o1 o1Var = this.f12636o;
        mVar.getClass();
        C19383o.m32798h(o1Var, "logger");
        boolean z = true;
        if (!mVar.f12415a.isEmpty()) {
            for (C5934x1 a : mVar.f12415a) {
                try {
                    a.mo16417a(s0Var);
                } catch (Throwable th) {
                    o1Var.mo16602b("OnBreadcrumbCallback threw an Exception", th);
                }
            }
        }
        if (x1Var != null) {
            x1Var.mo16417a(s0Var);
        }
        List<C5819p0> list = s0Var.f12603b.f12658m;
        if (list.size() > 0) {
            String str5 = list.get(0).f12445b.f12456c;
            String str6 = list.get(0).f12445b.f12457d;
            HashMap hashMap = new HashMap();
            hashMap.put("errorClass", str5);
            hashMap.put("message", str6);
            hashMap.put("unhandled", String.valueOf(s0Var.f12603b.f12647b.f12264g));
            Severity severity = s0Var.f12603b.f12647b.f12263f;
            C19383o.m32793c(severity, "severityReason.currentSeverity");
            hashMap.put("severity", severity.toString());
            this.f12631j.add(new Breadcrumb(str5, BreadcrumbType.ERROR, hashMap, new Date(), this.f12636o));
        }
        C5742f0 f0Var = this.f12638q;
        f0Var.f12233b.mo16604d("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        C5918u0 u0Var8 = s0Var.f12603b;
        C5728c2 c2Var2 = u0Var8.f12653h;
        if (c2Var2 != null) {
            if (u0Var8.f12647b.f12264g) {
                c2Var2.f12191k.incrementAndGet();
                s0Var.f12603b.f12653h = C5728c2.m11517a(c2Var2);
                f0Var.updateState(C5780k2.C5790j.f12394a);
            } else {
                c2Var2.f12192l.incrementAndGet();
                s0Var.f12603b.f12653h = C5728c2.m11517a(c2Var2);
                f0Var.updateState(C5780k2.C5789i.f12393a);
            }
        }
        C5750g2 g2Var = s0Var.f12603b.f12647b;
        if (g2Var.f12265h) {
            String str7 = g2Var.f12259b;
            C19383o.m32793c(str7, "severityReason.severityReasonType");
            boolean equals = "unhandledPromiseRejection".equals(str7);
            s0Var.f12603b.getClass();
            List<C5819p0> list2 = s0Var.f12603b.f12658m;
            C19383o.m32793c(list2, "event.errors");
            if (!list2.isEmpty()) {
                C5819p0 p0Var = list2.get(0);
                C19383o.m32793c(p0Var, "error");
                str4 = p0Var.f12445b.f12456c;
            }
            if (!C19383o.m32792b("ANR", str4) && !equals) {
                z = false;
            }
            f0Var.f12234c.mo16495g(s0Var);
            if (z) {
                f0Var.f12234c.mo16695j();
            }
        } else if (f0Var.f12237f.mo16570a(s0Var, f0Var.f12233b)) {
            try {
                f0Var.f12238g.mo16512a(TaskType.ERROR_REQUEST, new C5736e0(f0Var, new C5922v0(s0Var.f12603b.f12654i, s0Var, f0Var.f12236e, f0Var.f12235d), s0Var));
            } catch (RejectedExecutionException unused) {
                f0Var.f12234c.mo16495g(s0Var);
                f0Var.f12233b.mo16608h("Exceeded max queue count, saving to disk to send later");
            }
        }
    }

    public final void finalize() throws Throwable {
        SystemBroadcastReceiver systemBroadcastReceiver = this.f12635n;
        if (systemBroadcastReceiver != null) {
            try {
                Context context = this.f12628g;
                C5816o1 o1Var = this.f12636o;
                C19383o.m32798h(context, "$this$unregisterReceiverSafe");
                try {
                    context.unregisterReceiver(systemBroadcastReceiver);
                } catch (SecurityException e) {
                    if (o1Var != null) {
                        o1Var.mo16602b("Failed to register receiver", e);
                    }
                } catch (RemoteException e2) {
                    if (o1Var != null) {
                        o1Var.mo16602b("Failed to register receiver", e2);
                    }
                } catch (IllegalArgumentException e3) {
                    if (o1Var != null) {
                        o1Var.mo16602b("Failed to register receiver", e3);
                    }
                }
            } catch (IllegalArgumentException unused) {
                this.f12636o.mo16608h("Receiver not registered");
            }
        }
        super.finalize();
    }
}
