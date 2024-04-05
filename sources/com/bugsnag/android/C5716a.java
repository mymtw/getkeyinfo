package com.bugsnag.android;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bugsnag.android.a */
public final class C5716a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5720b f12140b;

    /* renamed from: c */
    public final /* synthetic */ C5917u f12141c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f12142d;

    /* renamed from: e */
    public final /* synthetic */ Handler f12143e;

    /* renamed from: f */
    public final /* synthetic */ C5908s0 f12144f;

    public C5716a(C5720b bVar, C5917u uVar, AtomicInteger atomicInteger, Handler handler, C5908s0 s0Var) {
        this.f12140b = bVar;
        this.f12141c = uVar;
        this.f12142d = atomicInteger;
        this.f12143e = handler;
        this.f12144f = s0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ RuntimeException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.bugsnag.android.b r0 = r7.f12140b
            com.bugsnag.android.u r1 = r7.f12141c
            android.content.Context r1 = r1.f12628g
            java.lang.String r2 = "client.appContext"
            kotlin.jvm.internal.C19383o.m32793c(r1, r2)
            r0.getClass()
            r0 = 0
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0021 }
            boolean r2 = r1 instanceof android.app.ActivityManager     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x001a
            r1 = r0
        L_0x001a:
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = kotlin.Result.m35480constructorimpl(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x002a
        L_0x0021:
            r1 = move-exception
            kotlin.Result$Failure r1 = androidx.compose.foundation.layout.C0761x.m1673J(r1)
            java.lang.Object r1 = kotlin.Result.m35480constructorimpl(r1)
        L_0x002a:
            boolean r2 = kotlin.Result.m35485isFailureimpl(r1)
            if (r2 == 0) goto L_0x0031
            r1 = r0
        L_0x0031:
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            int r2 = android.os.Process.myPid()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            java.util.List r1 = r1.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x0063 }
            if (r1 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ RuntimeException -> 0x0063 }
        L_0x0044:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RuntimeException -> 0x0063 }
        L_0x0048:
            boolean r5 = r1.hasNext()     // Catch:{ RuntimeException -> 0x0063 }
            if (r5 == 0) goto L_0x005f
            java.lang.Object r5 = r1.next()     // Catch:{ RuntimeException -> 0x0063 }
            r6 = r5
            android.app.ActivityManager$ProcessErrorStateInfo r6 = (android.app.ActivityManager.ProcessErrorStateInfo) r6     // Catch:{ RuntimeException -> 0x0063 }
            int r6 = r6.pid     // Catch:{ RuntimeException -> 0x0063 }
            if (r6 != r2) goto L_0x005b
            r6 = r3
            goto L_0x005c
        L_0x005b:
            r6 = r4
        L_0x005c:
            if (r6 == 0) goto L_0x0048
            goto L_0x0060
        L_0x005f:
            r5 = r0
        L_0x0060:
            android.app.ActivityManager$ProcessErrorStateInfo r5 = (android.app.ActivityManager.ProcessErrorStateInfo) r5     // Catch:{ RuntimeException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r5 = r0
        L_0x0064:
            if (r5 != 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f12142d
            int r0 = r0.getAndIncrement()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L_0x00f3
            android.os.Handler r0 = r7.f12143e
            r1 = 100
            r0.postDelayed(r7, r1)
            goto L_0x00f3
        L_0x0079:
            com.bugsnag.android.b r1 = r7.f12140b
            com.bugsnag.android.s0 r2 = r7.f12144f
            r1.getClass()
            java.lang.String r1 = "event"
            kotlin.jvm.internal.C19383o.m32798h(r2, r1)
            java.lang.String r1 = r5.shortMsg
            com.bugsnag.android.u0 r5 = r2.f12603b
            java.util.List<com.bugsnag.android.p0> r5 = r5.f12658m
            java.lang.String r6 = "event.errors"
            kotlin.jvm.internal.C19383o.m32793c(r5, r6)
            boolean r5 = r5.isEmpty()
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x00ec
            com.bugsnag.android.u0 r2 = r2.f12603b
            java.util.List<com.bugsnag.android.p0> r2 = r2.f12658m
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r3 = "event.errors[0]"
            kotlin.jvm.internal.C19383o.m32793c(r2, r3)
            com.bugsnag.android.p0 r2 = (com.bugsnag.android.C5819p0) r2
            java.lang.String r3 = "msg"
            kotlin.jvm.internal.C19383o.m32793c(r1, r3)
            java.lang.String r3 = "ANR"
            boolean r5 = kotlin.text.C19457k.m33025c1(r1, r3, r4)
            if (r5 == 0) goto L_0x00e8
            r5 = 2
            int r3 = kotlin.text.C19459m.m33043l1(r1, r3, r4, r4, r5)
            if (r3 >= 0) goto L_0x00bb
            goto L_0x00e8
        L_0x00bb:
            int r5 = r3 + 3
            if (r5 < r3) goto L_0x00d8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1, r4, r3)
            java.lang.String r3 = ""
            r6.append(r3)
            int r3 = r1.length()
            r6.append(r1, r5, r3)
            java.lang.String r1 = r6.toString()
            goto L_0x00e8
        L_0x00d8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "End index ("
            java.lang.String r2 = ") is less than start index ("
            java.lang.String r4 = ")."
            java.lang.String r1 = android.support.p013v4.media.C0070b.m183e(r1, r5, r2, r3, r4)
            r0.<init>(r1)
            throw r0
        L_0x00e8:
            com.bugsnag.android.q0 r2 = r2.f12445b
            r2.f12457d = r1
        L_0x00ec:
            com.bugsnag.android.u r1 = r7.f12141c
            com.bugsnag.android.s0 r2 = r7.f12144f
            r1.mo16687f(r2, r0)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5716a.run():void");
    }
}
