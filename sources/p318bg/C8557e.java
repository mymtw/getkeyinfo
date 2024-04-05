package p318bg;

/* renamed from: bg.e */
public final class C8557e implements Runnable {

    /* renamed from: b */
    public static final C8557e f18640b = new C8557e();

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r5 == false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[SYNTHETIC, Splitter:B:20:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r2 = com.facebook.appevents.p332ml.ModelManager.class
            boolean r3 = p401mg.C13080a.m20762b(r14)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Context r3 = p453tf.C13418j.m21106b()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r4 = 0
            java.lang.String r6 = r3.getString(r1, r4)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r7 = 1
            if (r6 == 0) goto L_0x0032
            int r8 = r6.length()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r8 != 0) goto L_0x0028
            r8 = r7
            goto L_0x0029
        L_0x0028:
            r8 = r5
        L_0x0029:
            if (r8 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            goto L_0x0037
        L_0x0032:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r8.<init>()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
        L_0x0037:
            r9 = 0
            long r11 = r3.getLong(r0, r9)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            com.facebook.internal.FeatureManager$Feature r6 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            boolean r6 = com.facebook.internal.FeatureManager.m20100c(r6)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r6 == 0) goto L_0x007d
            int r6 = r8.length()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r6 == 0) goto L_0x007d
            com.facebook.appevents.ml.ModelManager r6 = com.facebook.appevents.p332ml.ModelManager.f27310d     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            boolean r13 = p401mg.C13080a.m20762b(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r13 == 0) goto L_0x0054
            goto L_0x007b
        L_0x0054:
            r6.getClass()     // Catch:{ all -> 0x0077 }
            boolean r13 = p401mg.C13080a.m20762b(r6)     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x005e
            goto L_0x007b
        L_0x005e:
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0072 }
            long r9 = r9 - r11
            r6 = 259200000(0xf731400, float:1.1984677E-29)
            long r11 = (long) r6
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x007b
            r5 = r7
            goto L_0x007b
        L_0x0072:
            r7 = move-exception
            p401mg.C13080a.m20761a(r6, r7)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r6 = move-exception
            p401mg.C13080a.m20761a(r2, r6)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
        L_0x007b:
            if (r5 != 0) goto L_0x00a9
        L_0x007d:
            com.facebook.appevents.ml.ModelManager r5 = com.facebook.appevents.p332ml.ModelManager.f27310d     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            boolean r6 = p401mg.C13080a.m20762b(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r6 == 0) goto L_0x0086
            goto L_0x008f
        L_0x0086:
            org.json.JSONObject r4 = r5.mo39348c()     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r5 = move-exception
            p401mg.C13080a.m20761a(r2, r5)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
        L_0x008f:
            if (r4 == 0) goto L_0x00be
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r5)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r5)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r0.apply()     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            r8 = r4
        L_0x00a9:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p332ml.ModelManager.f27310d     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            com.facebook.appevents.p332ml.ModelManager.m20072a(r0, r8)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            boolean r1 = p401mg.C13080a.m20762b(r2)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            if (r1 == 0) goto L_0x00b5
            goto L_0x00c3
        L_0x00b5:
            r0.mo39347b()     // Catch:{ all -> 0x00b9 }
            goto L_0x00c3
        L_0x00b9:
            r0 = move-exception
            p401mg.C13080a.m20761a(r2, r0)     // Catch:{ Exception -> 0x00c3, all -> 0x00bf }
            goto L_0x00c3
        L_0x00be:
            return
        L_0x00bf:
            r0 = move-exception
            p401mg.C13080a.m20761a(r14, r0)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p318bg.C8557e.run():void");
    }
}
