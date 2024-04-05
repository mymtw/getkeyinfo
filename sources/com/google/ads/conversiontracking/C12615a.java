package com.google.ads.conversiontracking;

import androidx.work.C3436p;

/* renamed from: com.google.ads.conversiontracking.a */
public final class C12615a extends C3436p {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0107, code lost:
        if (r6 != false) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20298M(android.content.Context r13, android.net.Uri r14) {
        /*
            if (r14 != 0) goto L_0x000a
            java.lang.String r13 = "GoogleConversionReporter"
            java.lang.String r14 = "Failed to register referrer from a null click url"
            android.util.Log.e(r13, r14)
            return
        L_0x000a:
            java.lang.String r0 = "GoogleConversionReporter"
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1.length()
            int r3 = r3 + 13
            r2.<init>(r3)
            java.lang.String r3 = "Registering: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.i(r0, r1)
            java.util.HashMap r0 = com.google.ads.conversiontracking.C12619g.f27836a
            java.lang.String r0 = "referrer"
            java.lang.String r0 = r14.getQueryParameter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x003a
            goto L_0x0086
        L_0x003a:
            java.lang.String r1 = "http://hostname/?"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x004b
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0050
        L_0x004b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0050:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "conv"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r3 = "gclid"
            java.lang.String r3 = r0.getQueryParameter(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x0086
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x006d
            goto L_0x0086
        L_0x006d:
            java.lang.String r4 = "ai"
            java.lang.String r0 = r0.getQueryParameter(r4)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = ""
        L_0x0077:
            com.google.ads.conversiontracking.g$b r4 = new com.google.ads.conversiontracking.g$b
            com.google.ads.conversiontracking.g$a r5 = new com.google.ads.conversiontracking.g$a
            long r6 = java.lang.System.currentTimeMillis()
            r5.<init>(r3, r0, r6)
            r4.<init>(r1, r5)
            goto L_0x0087
        L_0x0086:
            r4 = r2
        L_0x0087:
            if (r4 != 0) goto L_0x00aa
            java.lang.String r13 = "GoogleConversionReporter"
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r14.length()
            int r1 = r1 + 31
            r0.<init>(r1)
            java.lang.String r1 = "Failed to parse referrer from: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r13, r14)
            return
        L_0x00aa:
            java.lang.String r0 = "google_conversion_click_referrer"
            r1 = 0
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r3 = r13.getAll()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00c2:
            boolean r5 = r3.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x0114
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x00dc
            goto L_0x0109
        L_0x00dc:
            java.lang.String r8 = " "
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            r9 = 3
            if (r8 == r9) goto L_0x00e7
            goto L_0x0109
        L_0x00e7:
            com.google.ads.conversiontracking.g$a r8 = new com.google.ads.conversiontracking.g$a     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = r7[r1]     // Catch:{ NumberFormatException -> 0x0109 }
            r10 = r7[r6]     // Catch:{ NumberFormatException -> 0x0109 }
            r11 = 2
            r7 = r7[r11]     // Catch:{ NumberFormatException -> 0x0109 }
            long r11 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0109 }
            r8.<init>(r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0109 }
            r9 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r11 = r11 + r9
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0109 }
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r6 = r1
        L_0x0107:
            if (r6 == 0) goto L_0x010a
        L_0x0109:
            r8 = r2
        L_0x010a:
            if (r8 != 0) goto L_0x00c2
            java.lang.Object r5 = r5.getKey()
            r0.add(r5)
            goto L_0x00c2
        L_0x0114:
            java.lang.String r3 = r4.f27840a
            java.lang.String r2 = r13.getString(r3, r2)
            if (r2 != 0) goto L_0x012f
            java.util.Map r2 = r13.getAll()
            int r2 = r2.size()
            r3 = 100
            if (r2 != r3) goto L_0x012f
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x012f
            goto L_0x018e
        L_0x012f:
            com.google.ads.conversiontracking.g$a r1 = r4.f27841b
            java.lang.String r2 = r1.f27837a
            java.lang.String r3 = " "
            java.lang.String r5 = r1.f27838b
            java.lang.String r7 = " "
            long r8 = r1.f27839c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = java.lang.String.valueOf(r2)
            int r10 = r10.length()
            int r10 = r10 + 20
            int r10 = r10 + r6
            java.lang.String r11 = java.lang.String.valueOf(r5)
            int r11 = r11.length()
            int r11 = r11 + r10
            int r11 = r11 + r6
            r1.<init>(r11)
            androidx.compose.animation.C0391c.m1061h(r1, r2, r3, r5, r7)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.util.HashMap r2 = com.google.ads.conversiontracking.C12619g.f27836a
            monitor-enter(r2)
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x0166:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r5 == 0) goto L_0x0178
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x01d2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01d2 }
            java.util.HashMap r7 = com.google.ads.conversiontracking.C12619g.f27836a     // Catch:{ all -> 0x01d2 }
            r7.remove(r5)     // Catch:{ all -> 0x01d2 }
            goto L_0x0166
        L_0x0178:
            java.util.HashMap r3 = com.google.ads.conversiontracking.C12619g.f27836a     // Catch:{ all -> 0x01d2 }
            java.lang.String r5 = r4.f27840a     // Catch:{ all -> 0x01d2 }
            r3.put(r5, r1)     // Catch:{ all -> 0x01d2 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d2 }
            java.lang.Thread r2 = new java.lang.Thread
            com.google.ads.conversiontracking.b r3 = new com.google.ads.conversiontracking.b
            r3.<init>(r13, r0, r4, r1)
            r2.<init>(r3)
            r2.start()
            r1 = r6
        L_0x018e:
            if (r1 == 0) goto L_0x01b1
            java.lang.String r13 = "GoogleConversionReporter"
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r14.length()
            int r1 = r1 + 25
            r0.<init>(r1)
            java.lang.String r1 = "Successfully registered: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            android.util.Log.i(r13, r14)
            goto L_0x01d1
        L_0x01b1:
            java.lang.String r13 = "GoogleConversionReporter"
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r14.length()
            int r1 = r1 + 20
            r0.<init>(r1)
            java.lang.String r1 = "Failed to register: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r13, r14)
        L_0x01d1:
            return
        L_0x01d2:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d2 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.C12615a.m20298M(android.content.Context, android.net.Uri):void");
    }
}
