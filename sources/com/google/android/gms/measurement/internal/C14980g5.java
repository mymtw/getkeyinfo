package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
public final class C14980g5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ boolean f33531b;

    /* renamed from: c */
    public final /* synthetic */ Uri f33532c;

    /* renamed from: d */
    public final /* synthetic */ String f33533d;

    /* renamed from: e */
    public final /* synthetic */ String f33534e;

    /* renamed from: f */
    public final /* synthetic */ C14989h5 f33535f;

    public C14980g5(C14989h5 h5Var, boolean z, Uri uri, String str, String str2) {
        this.f33535f = h5Var;
        this.f33531b = z;
        this.f33532c = uri;
        this.f33533d = str;
        this.f33534e = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[SYNTHETIC, Splitter:B:25:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ RuntimeException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6 A[Catch:{ RuntimeException -> 0x0170 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.gms.measurement.internal.h5 r0 = r15.f33535f
            boolean r1 = r15.f33531b
            android.net.Uri r2 = r15.f33532c
            java.lang.String r3 = r15.f33533d
            java.lang.String r7 = r15.f33534e
            com.google.android.gms.measurement.internal.j5 r4 = r0.f33556b
            r4.mo51995g()
            com.google.android.gms.measurement.internal.j5 r4 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.k7 r4 = r4.mo52335w()     // Catch:{ RuntimeException -> 0x0170 }
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r6 = "Activity created with data 'referrer' without required params"
            java.lang.String r8 = "_cis"
            java.lang.String r9 = "utm_medium"
            java.lang.String r10 = "utm_source"
            java.lang.String r11 = "utm_campaign"
            r12 = 0
            java.lang.String r13 = "gclid"
            if (r5 == 0) goto L_0x002d
            goto L_0x0052
        L_0x002d:
            boolean r5 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x0170 }
            if (r5 != 0) goto L_0x0054
            boolean r5 = r7.contains(r11)     // Catch:{ RuntimeException -> 0x0170 }
            if (r5 != 0) goto L_0x0054
            boolean r5 = r7.contains(r10)     // Catch:{ RuntimeException -> 0x0170 }
            if (r5 != 0) goto L_0x0054
            boolean r5 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x0170 }
            if (r5 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33731n     // Catch:{ RuntimeException -> 0x0170 }
            r4.mo52237a(r6)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x0052:
            r4 = r12
            goto L_0x0076
        L_0x0054:
            java.lang.String r5 = "https://google.com/search?"
            int r14 = r7.length()     // Catch:{ RuntimeException -> 0x0170 }
            if (r14 == 0) goto L_0x0061
            java.lang.String r5 = r5.concat(r7)     // Catch:{ RuntimeException -> 0x0170 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r14 = new java.lang.String     // Catch:{ RuntimeException -> 0x0170 }
            r14.<init>(r5)     // Catch:{ RuntimeException -> 0x0170 }
            r5 = r14
        L_0x0067:
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ RuntimeException -> 0x0170 }
            android.os.Bundle r4 = r4.mo52212j0(r5)     // Catch:{ RuntimeException -> 0x0170 }
            if (r4 == 0) goto L_0x0076
            java.lang.String r5 = "referrer"
            r4.putString(r8, r5)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x0076:
            java.lang.String r5 = "_cmp"
            r14 = 1
            if (r1 == 0) goto L_0x00be
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.k7 r1 = r1.mo52335w()     // Catch:{ RuntimeException -> 0x0170 }
            android.os.Bundle r1 = r1.mo52212j0(r2)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 == 0) goto L_0x00be
            java.lang.String r2 = "intent"
            r1.putString(r8, r2)     // Catch:{ RuntimeException -> 0x0170 }
            boolean r2 = r1.containsKey(r13)     // Catch:{ RuntimeException -> 0x0170 }
            if (r2 != 0) goto L_0x00b2
            if (r4 == 0) goto L_0x00b2
            boolean r2 = r4.containsKey(r13)     // Catch:{ RuntimeException -> 0x0170 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ RuntimeException -> 0x0170 }
            r8 = 0
            java.lang.String r14 = r4.getString(r13)     // Catch:{ RuntimeException -> 0x0170 }
            r2[r8] = r14     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r8 = "_cer"
            java.lang.String r14 = "gclid=%s"
            java.lang.String r2 = java.lang.String.format(r14, r2)     // Catch:{ RuntimeException -> 0x0170 }
            r1.putString(r8, r2)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x00b2:
            com.google.android.gms.measurement.internal.j5 r2 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            r2.mo52151m(r3, r1, r5)     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.j5 r2 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m7 r2 = r2.f33609o     // Catch:{ RuntimeException -> 0x0170 }
            r2.mo52249a(r1, r3)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x00be:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 == 0) goto L_0x00c6
            goto L_0x015f
        L_0x00c6:
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33731n     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r2 = "Activity created with referrer"
            r1.mo52238b(r7, r2)     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C14959e2.f33394a0     // Catch:{ RuntimeException -> 0x0170 }
            boolean r1 = r1.mo51973p(r12, r2)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 == 0) goto L_0x011d
            if (r4 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            r1.mo52151m(r3, r4, r5)     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m7 r1 = r1.f33609o     // Catch:{ RuntimeException -> 0x0170 }
            r1.mo52249a(r4, r3)     // Catch:{ RuntimeException -> 0x0170 }
            goto L_0x0107
        L_0x00f6:
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33731n     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r2 = "Referrer does not contain valid parameters"
            r1.mo52238b(r7, r2)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x0107:
            com.google.android.gms.measurement.internal.j5 r8 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r8.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.common.util.Clock r1 = r1.f33885o     // Catch:{ RuntimeException -> 0x0170 }
            long r13 = r1.currentTimeMillis()     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r9 = "auto"
            java.lang.String r10 = "_ldl"
            r12 = 1
            r11 = 0
            r8.mo52159u(r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x0170 }
            return
        L_0x011d:
            boolean r1 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 == 0) goto L_0x0160
            boolean r1 = r7.contains(r11)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 != 0) goto L_0x0145
            boolean r1 = r7.contains(r10)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 != 0) goto L_0x0145
            boolean r1 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = "utm_term"
            boolean r1 = r7.contains(r1)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 != 0) goto L_0x0145
            java.lang.String r1 = "utm_content"
            boolean r1 = r7.contains(r1)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 == 0) goto L_0x0160
        L_0x0145:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x0170 }
            if (r1 != 0) goto L_0x015f
            com.google.android.gms.measurement.internal.j5 r4 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r4.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.common.util.Clock r1 = r1.f33885o     // Catch:{ RuntimeException -> 0x0170 }
            long r9 = r1.currentTimeMillis()     // Catch:{ RuntimeException -> 0x0170 }
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_ldl"
            r8 = 1
            r4.mo52159u(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0170 }
        L_0x015f:
            return
        L_0x0160:
            com.google.android.gms.measurement.internal.j5 r1 = r0.f33556b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()     // Catch:{ RuntimeException -> 0x0170 }
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33731n     // Catch:{ RuntimeException -> 0x0170 }
            r1.mo52237a(r6)     // Catch:{ RuntimeException -> 0x0170 }
            return
        L_0x0170:
            r1 = move-exception
            com.google.android.gms.measurement.internal.j5 r0 = r0.f33556b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r0.mo52238b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14980g5.run():void");
    }
}
