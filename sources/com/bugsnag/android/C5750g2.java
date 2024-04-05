package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;

/* renamed from: com.bugsnag.android.g2 */
public final class C5750g2 implements C5748g1.C5749a {

    /* renamed from: b */
    public final String f12259b;

    /* renamed from: c */
    public final String f12260c;

    /* renamed from: d */
    public final String f12261d;

    /* renamed from: e */
    public final Severity f12262e;

    /* renamed from: f */
    public Severity f12263f;

    /* renamed from: g */
    public boolean f12264g;

    /* renamed from: h */
    public final boolean f12265h;

    public C5750g2(String str, Severity severity, boolean z, boolean z2, String str2, String str3) {
        this.f12259b = str;
        this.f12264g = z;
        this.f12265h = z2;
        this.f12262e = severity;
        this.f12263f = severity;
        this.f12261d = str2;
        this.f12260c = str3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ac, code lost:
        if (r9.equals("strictMode") == false) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bugsnag.android.C5750g2 m11538a(com.bugsnag.android.Severity r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "strictMode"
            boolean r2 = r9.equals(r0)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0021
            if (r10 == 0) goto L_0x0015
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = r3
            goto L_0x0016
        L_0x0015:
            r2 = r4
        L_0x0016:
            if (r2 != 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No reason supplied for strictmode"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            boolean r2 = r9.equals(r0)
            java.lang.String r5 = "log"
            if (r2 != 0) goto L_0x0046
            boolean r2 = r9.equals(r5)
            if (r2 != 0) goto L_0x0046
            if (r10 == 0) goto L_0x003a
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r2 = r3
            goto L_0x003b
        L_0x003a:
            r2 = r4
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "attributeValue should not be supplied"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            r2 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1876197364: goto L_0x00a8;
                case -1773746641: goto L_0x009d;
                case -1591166708: goto L_0x0092;
                case -1107031998: goto L_0x0087;
                case -845696980: goto L_0x007c;
                case -573976797: goto L_0x0071;
                case 107332: goto L_0x0068;
                case 87505361: goto L_0x005d;
                case 561970291: goto L_0x0051;
                default: goto L_0x004e;
            }
        L_0x004e:
            r3 = r2
            goto L_0x00af
        L_0x0051:
            java.lang.String r0 = "handledException"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x004e
        L_0x005a:
            r3 = 8
            goto L_0x00af
        L_0x005d:
            java.lang.String r0 = "unhandledPromiseRejection"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x004e
        L_0x0066:
            r3 = 7
            goto L_0x00af
        L_0x0068:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x006f
            goto L_0x004e
        L_0x006f:
            r3 = 6
            goto L_0x00af
        L_0x0071:
            java.lang.String r0 = "anrError"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x007a
            goto L_0x004e
        L_0x007a:
            r3 = 5
            goto L_0x00af
        L_0x007c:
            java.lang.String r0 = "handledError"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0085
            goto L_0x004e
        L_0x0085:
            r3 = 4
            goto L_0x00af
        L_0x0087:
            java.lang.String r0 = "userSpecifiedSeverity"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0090
            goto L_0x004e
        L_0x0090:
            r3 = 3
            goto L_0x00af
        L_0x0092:
            java.lang.String r0 = "unhandledException"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x004e
        L_0x009b:
            r3 = 2
            goto L_0x00af
        L_0x009d:
            java.lang.String r0 = "userCallbackSetSeverity"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00a6
            goto L_0x004e
        L_0x00a6:
            r3 = r4
            goto L_0x00af
        L_0x00a8:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00af
            goto L_0x004e
        L_0x00af:
            switch(r3) {
                case 0: goto L_0x0105;
                case 1: goto L_0x00f8;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00dc;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid argument for severityReason: '"
            r0.append(r2)
            r0.append(r9)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x00ce:
            com.bugsnag.android.g2 r7 = new com.bugsnag.android.g2
            r3 = 0
            r4 = 0
            java.lang.String r6 = "level"
            r0 = r7
            r1 = r9
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00dc:
            com.bugsnag.android.g2 r7 = new com.bugsnag.android.g2
            com.bugsnag.android.Severity r2 = com.bugsnag.android.Severity.WARNING
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00ea:
            com.bugsnag.android.g2 r7 = new com.bugsnag.android.g2
            com.bugsnag.android.Severity r2 = com.bugsnag.android.Severity.ERROR
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00f8:
            com.bugsnag.android.g2 r7 = new com.bugsnag.android.g2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0105:
            com.bugsnag.android.g2 r7 = new com.bugsnag.android.g2
            com.bugsnag.android.Severity r2 = com.bugsnag.android.Severity.WARNING
            r3 = 1
            r4 = 1
            java.lang.String r6 = "violationType"
            r0 = r7
            r1 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5750g2.m11538a(com.bugsnag.android.Severity, java.lang.String, java.lang.String):com.bugsnag.android.g2");
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        g1Var.mo16522d();
        g1Var.mo16514B("type");
        g1Var.mo16530k(this.f12262e == this.f12263f ? this.f12259b : "userCallbackSetSeverity");
        g1Var.mo16514B("unhandledOverridden");
        g1Var.mo16534u(this.f12264g != this.f12265h);
        if (!(this.f12260c == null || this.f12261d == null)) {
            g1Var.mo16514B(ResponseConstants.ATTRIBUTES);
            g1Var.mo16522d();
            g1Var.mo16514B(this.f12260c);
            g1Var.mo16530k(this.f12261d);
            g1Var.mo16526g();
        }
        g1Var.mo16526g();
    }
}
