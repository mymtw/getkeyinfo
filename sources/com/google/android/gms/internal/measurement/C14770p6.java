package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p6 */
public final class C14770p6 extends C14724m {

    /* renamed from: c */
    public final C14594c f33046c;

    public C14770p6(C14594c cVar) {
        this.f33046c = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50486g(java.lang.String r17, com.google.android.gms.internal.measurement.C14598c3 r18, java.util.ArrayList r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = r6
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = r14
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = r15
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = r7
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = r5
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x013b
            if (r4 == r15) goto L_0x0111
            if (r4 == r14) goto L_0x00e2
            if (r4 == r7) goto L_0x00ce
            if (r4 == r6) goto L_0x0095
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.android.gms.internal.measurement.p r1 = super.mo50486g(r17, r18, r19)
            return r1
        L_0x0064:
            kotlin.jvm.internal.C19388s.m32840P0(r9, r3, r14)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r2.mo50400c(r1)
            java.lang.String r1 = r1.zzi()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            com.google.android.gms.internal.measurement.p r2 = r2.mo50400c(r3)
            com.google.android.gms.internal.measurement.c r3 = r0.f33046c
            com.google.android.gms.internal.measurement.b r3 = r3.f32769b
            java.lang.Object r4 = kotlin.jvm.internal.C19388s.m32836N0(r2)
            if (r4 != 0) goto L_0x008f
            java.util.HashMap r3 = r3.f32753c
            r3.remove(r1)
            goto L_0x0094
        L_0x008f:
            java.util.HashMap r3 = r3.f32753c
            r3.put(r1, r4)
        L_0x0094:
            return r2
        L_0x0095:
            kotlin.jvm.internal.C19388s.m32840P0(r8, r3, r15)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r2.mo50400c(r1)
            com.google.android.gms.internal.measurement.u r2 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.internal.measurement.n r2 = com.google.android.gms.internal.measurement.C14763p.f33034h0
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.internal.measurement.c r2 = r0.f33046c
            com.google.android.gms.internal.measurement.b r2 = r2.f32769b
            java.lang.String r3 = r1.zzi()
            r2.f32751a = r3
            com.google.android.gms.internal.measurement.t r2 = new com.google.android.gms.internal.measurement.t
            java.lang.String r1 = r1.zzi()
            r2.<init>(r1)
            return r2
        L_0x00c6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00ce:
            kotlin.jvm.internal.C19388s.m32840P0(r12, r3, r5)
            com.google.android.gms.internal.measurement.c r1 = r0.f33046c
            com.google.android.gms.internal.measurement.b r1 = r1.f32769b
            com.google.android.gms.internal.measurement.i r2 = new com.google.android.gms.internal.measurement.i
            long r3 = r1.f32752b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e2:
            kotlin.jvm.internal.C19388s.m32840P0(r10, r3, r5)
            com.google.android.gms.internal.measurement.c r1 = r0.f33046c
            com.google.android.gms.internal.measurement.b r1 = r1.f32769b
            java.util.HashMap r1 = r1.f32753c
            com.google.android.gms.internal.measurement.m r2 = new com.google.android.gms.internal.measurement.m
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0110
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.p r5 = androidx.compose.foundation.layout.C0761x.m1726h1(r5)
            r2.mo50484e(r4, r5)
            goto L_0x00f8
        L_0x0110:
            return r2
        L_0x0111:
            kotlin.jvm.internal.C19388s.m32840P0(r11, r3, r15)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r2.mo50400c(r1)
            java.lang.String r1 = r1.zzi()
            com.google.android.gms.internal.measurement.c r2 = r0.f33046c
            com.google.android.gms.internal.measurement.b r2 = r2.f32769b
            java.util.HashMap r3 = r2.f32753c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0135
            java.util.HashMap r2 = r2.f32753c
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            com.google.android.gms.internal.measurement.p r1 = androidx.compose.foundation.layout.C0761x.m1726h1(r1)
            return r1
        L_0x013b:
            kotlin.jvm.internal.C19388s.m32840P0(r13, r3, r5)
            com.google.android.gms.internal.measurement.c r1 = r0.f33046c
            com.google.android.gms.internal.measurement.b r1 = r1.f32769b
            com.google.android.gms.internal.measurement.t r2 = new com.google.android.gms.internal.measurement.t
            java.lang.String r1 = r1.f32751a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14770p6.mo50486g(java.lang.String, com.google.android.gms.internal.measurement.c3, java.util.ArrayList):com.google.android.gms.internal.measurement.p");
    }
}
