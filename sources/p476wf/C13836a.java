package p476wf;

/* renamed from: wf.a */
public final class C13836a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f30453b;

    public C13836a(String str) {
        this.f30453b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2 A[Catch:{ all -> 0x00e3, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f3 A[Catch:{ all -> 0x00e3, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff A[SYNTHETIC, Splitter:B:46:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d A[Catch:{ all -> 0x00e3, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c A[Catch:{ all -> 0x00e3, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138 A[SYNTHETIC, Splitter:B:71:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.lang.Class<wf.c> r0 = p476wf.C13838c.class
            java.lang.String r1 = "0"
            boolean r2 = p401mg.C13080a.m20762b(r11)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            com.facebook.GraphRequest$c r2 = com.facebook.GraphRequest.f27224o     // Catch:{ all -> 0x0140 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = "%s/app_indexing_session"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = r11.f30453b     // Catch:{ all -> 0x0140 }
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x0140 }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = java.lang.String.format(r3, r4, r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)     // Catch:{ all -> 0x0140 }
            r2.getClass()     // Catch:{ all -> 0x0140 }
            r2 = 0
            com.facebook.GraphRequest r3 = com.facebook.GraphRequest.C12196c.m20008h(r2, r3, r2, r2)     // Catch:{ all -> 0x0140 }
            android.os.Bundle r4 = r3.f27228d     // Catch:{ all -> 0x0140 }
            if (r4 != 0) goto L_0x0037
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0140 }
            r4.<init>()     // Catch:{ all -> 0x0140 }
        L_0x0037:
            android.content.Context r6 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0140 }
            hg.b$a r7 = p365hg.C12831b.f28321h     // Catch:{ all -> 0x0140 }
            r7.getClass()     // Catch:{ all -> 0x0140 }
            hg.b r6 = p365hg.C12831b.C12832a.m20469a(r6)     // Catch:{ all -> 0x0140 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x0140 }
            r7.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0140 }
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r9 = r10
        L_0x0051:
            r7.put(r9)     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x005b
            java.lang.String r9 = r6.mo45613a()     // Catch:{ all -> 0x0140 }
            goto L_0x005c
        L_0x005b:
            r9 = r2
        L_0x005c:
            if (r9 == 0) goto L_0x0066
            java.lang.String r6 = r6.mo45613a()     // Catch:{ all -> 0x0140 }
            r7.put(r6)     // Catch:{ all -> 0x0140 }
            goto L_0x0069
        L_0x0066:
            r7.put(r10)     // Catch:{ all -> 0x0140 }
        L_0x0069:
            r7.put(r1)     // Catch:{ all -> 0x0140 }
            boolean r6 = p312ag.C8527d.m16932c()     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x0074
            java.lang.String r1 = "1"
        L_0x0074:
            r7.put(r1)     // Catch:{ all -> 0x0140 }
            int r1 = p365hg.C12869i0.f28368a     // Catch:{ all -> 0x0140 }
            android.content.Context r1 = p453tf.C13418j.m21106b()     // Catch:{ Exception -> 0x008d }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x008d }
            java.lang.String r6 = "FacebookSdk.getApplicationContext().resources"
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)     // Catch:{ Exception -> 0x008d }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ Exception -> 0x008d }
            java.util.Locale r1 = r1.locale     // Catch:{ Exception -> 0x008d }
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            if (r1 == 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "Locale.getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)     // Catch:{ all -> 0x0140 }
        L_0x009a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r6.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = r1.getLanguage()     // Catch:{ all -> 0x0140 }
            r6.append(r9)     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "_"
            r6.append(r9)     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r1.getCountry()     // Catch:{ all -> 0x0140 }
            r6.append(r1)     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0140 }
            r7.put(r1)     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "extInfoArray.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "device_session_id"
            java.lang.String r7 = p476wf.C13838c.m21378a()     // Catch:{ all -> 0x0140 }
            r4.putString(r6, r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r6 = "extinfo"
            r4.putString(r6, r1)     // Catch:{ all -> 0x0140 }
            r3.f27228d = r4     // Catch:{ all -> 0x0140 }
            com.facebook.GraphResponse r1 = r3.mo39226c()     // Catch:{ all -> 0x0140 }
            org.json.JSONObject r1 = r1.f27246c     // Catch:{ all -> 0x0140 }
            boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0140 }
            if (r3 == 0) goto L_0x00e0
        L_0x00de:
            r3 = r2
            goto L_0x00e8
        L_0x00e0:
            java.util.concurrent.atomic.AtomicBoolean r3 = p476wf.C13838c.f30461f     // Catch:{ all -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r3 = move-exception
            p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x00de
        L_0x00e8:
            if (r1 == 0) goto L_0x00f3
            java.lang.String r4 = "is_app_indexing_enabled"
            boolean r1 = r1.optBoolean(r4, r8)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r5 = r8
        L_0x00f4:
            r3.set(r5)     // Catch:{ all -> 0x0140 }
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x00ff
        L_0x00fd:
            r1 = r2
            goto L_0x0107
        L_0x00ff:
            java.util.concurrent.atomic.AtomicBoolean r1 = p476wf.C13838c.f30461f     // Catch:{ all -> 0x0102 }
            goto L_0x0107
        L_0x0102:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x0140 }
            goto L_0x00fd
        L_0x0107:
            boolean r1 = r1.get()     // Catch:{ all -> 0x0140 }
            if (r1 != 0) goto L_0x011c
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x0114
            goto L_0x012f
        L_0x0114:
            p476wf.C13838c.f30459d = r2     // Catch:{ all -> 0x0117 }
            goto L_0x012f
        L_0x0117:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x0140 }
            goto L_0x012f
        L_0x011c:
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            wf.f r2 = p476wf.C13838c.f30458c     // Catch:{ all -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x0140 }
        L_0x012a:
            if (r2 == 0) goto L_0x012f
            r2.mo46678c()     // Catch:{ all -> 0x0140 }
        L_0x012f:
            com.facebook.appevents.codeless.ViewIndexingTrigger r1 = p476wf.C13838c.f30456a     // Catch:{ all -> 0x0140 }
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x0138
            goto L_0x013f
        L_0x0138:
            p476wf.C13838c.f30462g = r8     // Catch:{ all -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x0140 }
        L_0x013f:
            return
        L_0x0140:
            r0 = move-exception
            p401mg.C13080a.m20761a(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p476wf.C13836a.run():void");
    }
}
