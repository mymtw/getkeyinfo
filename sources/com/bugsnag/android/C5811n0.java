package com.bugsnag.android;

import java.util.Date;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.n0 */
public final class C5811n0 extends C5753h0 {

    /* renamed from: l */
    public Long f12427l;

    /* renamed from: m */
    public Long f12428m;

    /* renamed from: n */
    public String f12429n;

    /* renamed from: o */
    public Date f12430o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5811n0(com.bugsnag.android.C5757i0 r10, java.lang.Boolean r11, java.lang.String r12, java.lang.String r13, java.lang.Long r14, java.util.LinkedHashMap r15, java.lang.Long r16, java.lang.Long r17, java.lang.String r18, java.util.Date r19) {
        /*
            r9 = this;
            r8 = r9
            r1 = r10
            java.lang.String r0 = "buildInfo"
            kotlin.jvm.internal.C19383o.m32798h(r10, r0)
            java.lang.String[] r2 = r1.f12293i
            r0 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r8.f12427l = r0
            r0 = r17
            r8.f12428m = r0
            r0 = r18
            r8.f12429n = r0
            r0 = r19
            r8.f12430o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5811n0.<init>(com.bugsnag.android.i0, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.util.LinkedHashMap, java.lang.Long, java.lang.Long, java.lang.String, java.util.Date):void");
    }

    /* renamed from: a */
    public final void mo16518a(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        super.mo16518a(g1Var);
        g1Var.mo16514B("freeDisk");
        g1Var.mo16533t(this.f12427l);
        g1Var.mo16514B("freeMemory");
        g1Var.mo16533t(this.f12428m);
        g1Var.mo16514B("orientation");
        g1Var.mo16530k(this.f12429n);
        if (this.f12430o != null) {
            g1Var.mo16514B("time");
            g1Var.mo16516M(this.f12430o, false);
        }
    }
}
