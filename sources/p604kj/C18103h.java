package p604kj;

/* renamed from: kj.h */
public final /* synthetic */ class C18103h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39527b;

    /* renamed from: c */
    public final /* synthetic */ Object f39528c;

    public /* synthetic */ C18103h(Object obj, int i) {
        this.f39527b = i;
        this.f39528c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f39527b
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0239;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x024c
        L_0x0008:
            java.lang.Object r0 = r14.f39528c
            com.google.android.gms.measurement.internal.j5 r0 = (com.google.android.gms.measurement.internal.C15007j5) r0
            r0.mo51995g()
            com.google.android.gms.measurement.internal.o4 r2 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.c3 r2 = r2.mo52330q()
            com.google.android.gms.measurement.internal.w2 r2 = r2.f33313r
            boolean r2 = r2.mo52354b()
            if (r2 != 0) goto L_0x0229
            com.google.android.gms.measurement.internal.o4 r2 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.c3 r2 = r2.mo52330q()
            com.google.android.gms.measurement.internal.y2 r2 = r2.f33314s
            long r2 = r2.mo52363a()
            com.google.android.gms.measurement.internal.o4 r4 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.c3 r4 = r4.mo52330q()
            com.google.android.gms.measurement.internal.y2 r4 = r4.f33314s
            r5 = 1
            long r5 = r5 + r2
            r4.mo52364b(r5)
            com.google.android.gms.measurement.internal.o4 r4 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            r4.getClass()
            r4 = 5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0068
            com.google.android.gms.measurement.internal.o4 r2 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            java.lang.String r3 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r2.mo52237a(r3)
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            com.google.android.gms.measurement.internal.w2 r0 = r0.f33313r
            r0.mo52353a(r1)
            goto L_0x0238
        L_0x0068:
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r2 = r0.mo52015a()
            r2.mo51995g()
            com.google.android.gms.measurement.internal.n5 r2 = r0.f33889s
            com.google.android.gms.measurement.internal.C15103u3.m24640i(r2)
            com.google.android.gms.measurement.internal.n5 r2 = r0.f33889s
            com.google.android.gms.measurement.internal.C15103u3.m24640i(r2)
            com.google.android.gms.measurement.internal.g2 r2 = r0.mo52327n()
            java.lang.String r2 = r2.mo52046l()
            com.google.android.gms.measurement.internal.c3 r3 = r0.mo52330q()
            r3.mo51995g()
            com.google.android.gms.measurement.internal.o4 r4 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.common.util.Clock r4 = r4.f33885o
            long r4 = r4.elapsedRealtime()
            java.lang.String r6 = r3.f33303h
            java.lang.String r7 = ""
            r8 = 0
            if (r6 == 0) goto L_0x00b0
            long r9 = r3.f33305j
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00a4
            goto L_0x00b0
        L_0x00a4:
            android.util.Pair r4 = new android.util.Pair
            boolean r3 = r3.f33304i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.<init>(r6, r3)
            goto L_0x00ff
        L_0x00b0:
            com.google.android.gms.measurement.internal.o4 r6 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6
            com.google.android.gms.measurement.internal.d r6 = r6.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C14959e2.f33397c
            long r9 = r6.mo51970m(r2, r9)
            long r9 = r9 + r4
            r3.f33305j = r9
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r1)
            com.google.android.gms.measurement.internal.o4 r4 = r3.f33681b     // Catch:{ Exception -> 0x00dd }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ Exception -> 0x00dd }
            android.content.Context r4 = r4.f33872b     // Catch:{ Exception -> 0x00dd }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r4)     // Catch:{ Exception -> 0x00dd }
            r3.f33303h = r7     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = r4.getId()     // Catch:{ Exception -> 0x00dd }
            if (r5 == 0) goto L_0x00d6
            r3.f33303h = r5     // Catch:{ Exception -> 0x00dd }
        L_0x00d6:
            boolean r4 = r4.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x00dd }
            r3.f33304i = r4     // Catch:{ Exception -> 0x00dd }
            goto L_0x00ef
        L_0x00dd:
            r4 = move-exception
            com.google.android.gms.measurement.internal.o4 r5 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33731n
            java.lang.String r6 = "Unable to get advertising id"
            r5.mo52238b(r4, r6)
            r3.f33303h = r7
        L_0x00ef:
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r8)
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = r3.f33303h
            boolean r3 = r3.f33304i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.<init>(r5, r3)
        L_0x00ff:
            com.google.android.gms.measurement.internal.d r3 = r0.f33878h
            java.lang.String r5 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r3 = r3.mo51972o(r5)
            if (r3 == 0) goto L_0x0112
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r3 = r8
            goto L_0x0113
        L_0x0112:
            r3 = r1
        L_0x0113:
            if (r3 == 0) goto L_0x021d
            java.lang.Object r3 = r4.second
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x021d
            java.lang.Object r3 = r4.first
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x012b
            goto L_0x021d
        L_0x012b:
            com.google.android.gms.measurement.internal.n5 r3 = r0.f33889s
            com.google.android.gms.measurement.internal.C15103u3.m24640i(r3)
            com.google.android.gms.measurement.internal.n5 r3 = r0.f33889s
            r3.mo52264i()
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            android.content.Context r3 = r3.f33872b
            java.lang.String r5 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            r5 = 0
            if (r3 == 0) goto L_0x014b
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x014b }
            goto L_0x014c
        L_0x014b:
            r3 = r5
        L_0x014c:
            if (r3 == 0) goto L_0x0211
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L_0x0211
            com.google.android.gms.measurement.internal.k7 r3 = r0.mo52335w()
            com.google.android.gms.measurement.internal.g2 r6 = r0.mo52327n()
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6
            com.google.android.gms.measurement.internal.d r6 = r6.f33878h
            r6.mo51969l()
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.c3 r6 = r0.mo52330q()
            com.google.android.gms.measurement.internal.y2 r6 = r6.f33314s
            long r6 = r6.mo52363a()
            r9 = -1
            long r6 = r6 + r9
            r3.getClass()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r12 = 46000(0xb3b0, double:2.2727E-319)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r11[r8] = r12     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r12 = r3.mo52210g0()     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r11[r1] = r12     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r12 = "v%s.%s"
            java.lang.String r11 = java.lang.String.format(r12, r11)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9[r8] = r11     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9[r1] = r4     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9[r10] = r2     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r1 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9[r1] = r4     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r1 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            com.google.android.gms.measurement.internal.o4 r4 = r3.f33681b     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            com.google.android.gms.measurement.internal.d r4 = r4.f33878h     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r4 = r4.mo51965h(r6)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r4 = r2.equals(r4)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r4 == 0) goto L_0x01c9
            java.lang.String r4 = "&ddl_test=1"
            java.lang.String r1 = r1.concat(r4)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x01c9:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r4.<init>(r1)     // Catch:{ MalformedURLException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r5 = r4
            goto L_0x01e6
        L_0x01d0:
            r1 = move-exception
            goto L_0x01d3
        L_0x01d2:
            r1 = move-exception
        L_0x01d3:
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r3.mo52238b(r1, r4)
        L_0x01e6:
            if (r5 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.n5 r1 = r0.f33889s
            com.google.android.gms.measurement.internal.C15103u3.m24640i(r1)
            com.google.android.gms.measurement.internal.n5 r1 = r0.f33889s
            androidx.appcompat.app.l r3 = new androidx.appcompat.app.l
            r3.<init>((java.lang.Object) r0)
            r1.mo51995g()
            r1.mo52264i()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            com.google.android.gms.measurement.internal.m5 r4 = new com.google.android.gms.measurement.internal.m5
            r4.<init>(r1, r2, r5, r3)
            r0.mo52307n(r4)
            goto L_0x0238
        L_0x0211:
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            r0.mo52237a(r1)
            goto L_0x0238
        L_0x021d:
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            r0.mo52237a(r1)
            goto L_0x0238
        L_0x0229:
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.mo52237a(r1)
        L_0x0238:
            return
        L_0x0239:
            java.lang.Object r0 = r14.f39528c
            kj.k r0 = (p604kj.C18106k) r0
            monitor-enter(r0)
            int r2 = r0.f39535b     // Catch:{ all -> 0x0249 }
            if (r2 != r1) goto L_0x0247
            java.lang.String r2 = "Timed out while binding"
            r0.mo69639a(r1, r2)     // Catch:{ all -> 0x0249 }
        L_0x0247:
            monitor-exit(r0)
            return
        L_0x0249:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x024c:
            java.lang.Object r0 = r14.f39528c
            com.google.android.play.core.assetpacks.q2 r0 = (com.google.android.play.core.assetpacks.C15645q2) r0
            com.google.android.play.core.internal.z r1 = r0.f35296b
            java.lang.Object r1 = r1.zza()
            com.google.android.play.core.assetpacks.y2 r1 = (com.google.android.play.core.assetpacks.C15677y2) r1
            com.google.android.play.core.assetpacks.b0 r2 = r0.f35295a
            java.util.HashMap r2 = r2.mo55387o()
            ul.o r1 = r1.mo55469f(r2)
            com.google.android.play.core.internal.z r2 = r0.f35299e
            java.lang.Object r2 = r2.zza()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.android.play.core.assetpacks.b0 r3 = r0.f35295a
            r3.getClass()
            com.google.android.play.core.assetpacks.p2 r4 = new com.google.android.play.core.assetpacks.p2
            r4.<init>(r3)
            r1.mo70116c(r2, r4)
            com.google.android.play.core.internal.z r0 = r0.f35299e
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            kotlin.jvm.internal.n r2 = kotlin.jvm.internal.C19382n.f43253c
            r1.mo70114a(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kj.C18103h.run():void");
    }
}
