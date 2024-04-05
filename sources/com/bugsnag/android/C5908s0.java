package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.s0 */
public final class C5908s0 implements C5748g1.C5749a {

    /* renamed from: b */
    public final C5918u0 f12603b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5908s0(java.lang.Throwable r18, com.bugsnag.android.internal.C5763c r19, com.bugsnag.android.C5750g2 r20, com.bugsnag.android.C5829r1 r21, com.bugsnag.android.C5722b1 r22, com.bugsnag.android.C5816o1 r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r8 = r20
            r2 = r22
            com.bugsnag.android.u0 r12 = new com.bugsnag.android.u0
            java.lang.String r3 = "config"
            kotlin.jvm.internal.C19383o.m32798h(r1, r3)
            java.lang.String r3 = "severityReason"
            kotlin.jvm.internal.C19383o.m32798h(r8, r3)
            java.lang.String r3 = "data"
            r4 = r21
            kotlin.jvm.internal.C19383o.m32798h(r4, r3)
            java.lang.String r3 = "featureFlags"
            kotlin.jvm.internal.C19383o.m32798h(r2, r3)
            java.lang.String r3 = r1.f12311a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection<java.lang.String> r6 = r1.f12316f
            java.util.Set r6 = kotlin.collections.C19327t.m32664t1(r6)
            if (r0 != 0) goto L_0x0036
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r4 = r7
            goto L_0x008f
        L_0x0036:
            java.util.Collection<java.lang.String> r7 = r1.f12318h
            com.bugsnag.android.o1 r9 = r1.f12329s
            java.lang.String r10 = "projectPackages"
            kotlin.jvm.internal.C19383o.m32798h(r7, r10)
            java.lang.String r10 = "logger"
            kotlin.jvm.internal.C19383o.m32798h(r9, r10)
            java.util.List r10 = androidx.compose.foundation.layout.C0761x.m1674J0(r18)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0051:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x008e
            java.lang.Object r13 = r10.next()
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.StackTraceElement[] r14 = r13.getStackTrace()
            if (r14 == 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r14 = 0
            java.lang.StackTraceElement[] r14 = new java.lang.StackTraceElement[r14]
        L_0x0067:
            com.bugsnag.android.j2 r15 = new com.bugsnag.android.j2
            r15.<init>(r14, r7, r9)
            com.bugsnag.android.q0 r14 = new com.bugsnag.android.q0
            java.lang.Class r16 = r13.getClass()
            java.lang.String r4 = r16.getName()
            java.lang.String r13 = r13.getLocalizedMessage()
            r16 = r7
            com.bugsnag.android.ErrorType r7 = com.bugsnag.android.ErrorType.ANDROID
            r14.<init>(r4, r13, r15, r7)
            com.bugsnag.android.p0 r4 = new com.bugsnag.android.p0
            r4.<init>(r14, r9)
            r11.add(r4)
            r4 = r21
            r7 = r16
            goto L_0x0051
        L_0x008e:
            r4 = r11
        L_0x008f:
            com.bugsnag.android.r1 r7 = r21.mo16618d()
            com.bugsnag.android.b1 r9 = new com.bugsnag.android.b1
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f12158c
            java.util.LinkedHashMap r2 = kotlin.collections.C19294b0.m32558A0(r2)
            r9.<init>(r2)
            java.util.Collection<java.lang.String> r10 = r1.f12318h
            com.bugsnag.android.p2 r2 = new com.bugsnag.android.p2
            boolean r11 = r8.f12264g
            r2.<init>(r0, r11, r1)
            java.util.ArrayList r11 = r2.f12452b
            com.bugsnag.android.t2 r13 = new com.bugsnag.android.t2
            r0 = 0
            r13.<init>(r0, r0, r0)
            java.util.Collection<java.lang.String> r0 = r1.f12310B
            java.util.Set r14 = kotlin.collections.C19327t.m32664t1(r0)
            r0 = r12
            r1 = r3
            r2 = r5
            r3 = r6
            r5 = r7
            r6 = r9
            r7 = r10
            r8 = r20
            r9 = r11
            r10 = r13
            r11 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r17
            r1 = r23
            r0.<init>(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5908s0.<init>(java.lang.Throwable, com.bugsnag.android.internal.c, com.bugsnag.android.g2, com.bugsnag.android.r1, com.bugsnag.android.b1, com.bugsnag.android.o1):void");
    }

    /* renamed from: a */
    public final void mo16668a(String str, String str2, Object obj) {
        C5918u0 u0Var = this.f12603b;
        u0Var.getClass();
        u0Var.f12648c.mo16615a("BugsnagDiagnostics", str2, obj);
    }

    /* renamed from: b */
    public final void mo16669b(Severity severity) {
        C5918u0 u0Var = this.f12603b;
        u0Var.getClass();
        C19383o.m32798h(severity, "severity");
        C5750g2 g2Var = u0Var.f12647b;
        String str = g2Var.f12259b;
        boolean z = g2Var.f12264g;
        u0Var.f12647b = new C5750g2(str, severity, z, z != g2Var.f12265h, g2Var.f12261d, g2Var.f12260c);
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        this.f12603b.toStream(g1Var);
    }

    public C5908s0(C5918u0 u0Var, C5816o1 o1Var) {
        this.f12603b = u0Var;
    }
}
