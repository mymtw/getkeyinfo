package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
public final class C15095t3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33848b;

    /* renamed from: c */
    public final Object f33849c;

    /* renamed from: d */
    public final Object f33850d;

    public /* synthetic */ C15095t3(int i, Object obj, Object obj2) {
        this.f33848b = i;
        this.f33850d = obj;
        this.f33849c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0328, code lost:
        if (android.text.TextUtils.isEmpty(r1.f33525m) == false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0487, code lost:
        if (android.text.TextUtils.isEmpty(r1.f33525m) == false) goto L_0x0489;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.f33848b
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x001e;
                case 2: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x050a
        L_0x0007:
            java.lang.Object r0 = r12.f33850d     // Catch:{ Exception -> 0x0015 }
            rl.a r0 = (p665rl.C18483a) r0     // Catch:{ Exception -> 0x0015 }
            java.lang.Object r1 = r12.f33849c     // Catch:{ Exception -> 0x0015 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ Exception -> 0x0015 }
            java.util.concurrent.atomic.AtomicReference r2 = p665rl.C18483a.f40713e     // Catch:{ Exception -> 0x0015 }
            r0.mo69991a(r1)     // Catch:{ Exception -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = "Failed to remove from splitcompat storage split that is already installed"
            android.util.Log.e(r1, r2, r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r0 = r12.f33849c
            com.google.android.play.core.assetpacks.g2 r0 = (com.google.android.play.core.assetpacks.C15605g2) r0
            java.lang.Object r1 = r12.f33850d
            com.google.android.play.core.assetpacks.f2 r1 = (com.google.android.play.core.assetpacks.C15601f2) r1
            com.google.android.play.core.assetpacks.b0 r0 = r0.f35156a
            java.lang.Object r2 = r1.f29575b
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r1.f35140d
            long r4 = r1.f35141e
            r0.mo55376a(r2, r3, r4)
            return
        L_0x0034:
            java.lang.Object r0 = r12.f33850d
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            java.lang.Object r1 = r12.f33849c
            com.google.android.gms.measurement.internal.q4 r1 = (com.google.android.gms.measurement.internal.C15069q4) r1
            com.google.android.gms.measurement.internal.s3 r2 = r0.mo52015a()
            r2.mo51995g()
            com.google.android.gms.measurement.internal.d r2 = r0.f33878h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            r2.getClass()
            com.google.android.gms.measurement.internal.l r2 = new com.google.android.gms.measurement.internal.l
            r2.<init>(r0)
            r2.mo52265j()
            r0.f33893w = r2
            com.google.android.gms.measurement.internal.g2 r2 = new com.google.android.gms.measurement.internal.g2
            long r3 = r1.f33773f
            r2.<init>(r0, r3)
            r2.mo51947i()
            r0.f33894x = r2
            com.google.android.gms.measurement.internal.i2 r1 = new com.google.android.gms.measurement.internal.i2
            r1.<init>(r0)
            r1.mo51947i()
            r0.f33891u = r1
            com.google.android.gms.measurement.internal.i6 r1 = new com.google.android.gms.measurement.internal.i6
            r1.<init>(r0)
            r1.mo51947i()
            r0.f33892v = r1
            com.google.android.gms.measurement.internal.k7 r1 = r0.f33883m
            boolean r3 = r1.f33708c
            java.lang.String r4 = "Can't initialize twice"
            if (r3 != 0) goto L_0x0504
            r1.mo52197K()
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            java.util.concurrent.atomic.AtomicInteger r3 = r3.f33870G
            r3.incrementAndGet()
            r3 = 1
            r1.f33708c = r3
            com.google.android.gms.measurement.internal.c3 r1 = r0.f33879i
            boolean r5 = r1.f33708c
            if (r5 != 0) goto L_0x04fe
            r1.mo51954l()
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f33870G
            r5.incrementAndGet()
            r1.f33708c = r3
            com.google.android.gms.measurement.internal.g2 r1 = r0.f33894x
            boolean r5 = r1.f33280c
            if (r5 != 0) goto L_0x04f8
            r1.mo52045k()
            com.google.android.gms.measurement.internal.o4 r4 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f33870G
            r4.incrementAndGet()
            r1.f33280c = r3
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33730m
            com.google.android.gms.measurement.internal.d r4 = r0.f33878h
            r4.mo51969l()
            r4 = 46000(0xb3b0, double:2.2727E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.mo52238b(r4, r5)
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33730m
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.mo52237a(r4)
            java.lang.String r1 = r2.mo52046l()
            java.lang.String r2 = r0.f33873c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0118
            com.google.android.gms.measurement.internal.k7 r2 = r0.mo52335w()
            boolean r2 = r2.mo52201O(r1)
            if (r2 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33730m
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.mo52237a(r2)
            goto L_0x0118
        L_0x00f9:
            com.google.android.gms.measurement.internal.o2 r2 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33730m
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r5 = r1.length()
            if (r5 == 0) goto L_0x0110
            java.lang.String r1 = r4.concat(r1)
            goto L_0x0115
        L_0x0110:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x0115:
            r2.mo52237a(r1)
        L_0x0118:
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33731n
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.mo52237a(r2)
            int r1 = r0.f33869F
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f33870G
            int r2 = r2.get()
            if (r1 == r2) goto L_0x0148
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            int r2 = r0.f33869F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f33870G
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.mo52239c(r2, r5, r4)
        L_0x0148:
            r0.f33895y = r3
            java.lang.Object r0 = r12.f33850d
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            java.lang.Object r1 = r12.f33849c
            com.google.android.gms.measurement.internal.q4 r1 = (com.google.android.gms.measurement.internal.C15069q4) r1
            com.google.android.gms.internal.measurement.zzcl r1 = r1.f33774g
            com.google.android.gms.measurement.internal.s3 r2 = r0.mo52015a()
            r2.mo51995g()
            com.google.android.gms.measurement.internal.c3 r2 = r0.mo52330q()
            com.google.android.gms.measurement.internal.e r2 = r2.mo51955m()
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            com.google.android.gms.measurement.internal.o4 r5 = r4.f33681b
            r4.mo51995g()
            android.content.SharedPreferences r4 = r4.mo51953k()
            r5 = 100
            java.lang.String r6 = "consent_source"
            int r4 = r4.getInt(r6, r5)
            com.google.android.gms.measurement.internal.d r6 = r0.f33878h
            com.google.android.gms.measurement.internal.o4 r7 = r6.f33681b
            java.lang.String r7 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r6 = r6.mo51972o(r7)
            com.google.android.gms.measurement.internal.d r7 = r0.f33878h
            com.google.android.gms.measurement.internal.o4 r8 = r7.f33681b
            java.lang.String r8 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r7 = r7.mo51972o(r8)
            r8 = -10
            r9 = 30
            r10 = 0
            if (r6 != 0) goto L_0x0195
            if (r7 == 0) goto L_0x01a7
        L_0x0195:
            com.google.android.gms.measurement.internal.c3 r11 = r0.mo52330q()
            boolean r11 = r11.mo51960r(r8)
            if (r11 == 0) goto L_0x01a7
            com.google.android.gms.measurement.internal.e r1 = new com.google.android.gms.measurement.internal.e
            r1.<init>(r6, r7)
            r5 = r8
            goto L_0x0217
        L_0x01a7:
            com.google.android.gms.measurement.internal.g2 r6 = r0.mo52327n()
            java.lang.String r6 = r6.mo52047m()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x01d1
            if (r4 == 0) goto L_0x01c5
            if (r4 == r9) goto L_0x01c5
            r6 = 10
            if (r4 == r6) goto L_0x01c5
            if (r4 == r9) goto L_0x01c5
            if (r4 == r9) goto L_0x01c5
            r6 = 40
            if (r4 != r6) goto L_0x01d1
        L_0x01c5:
            com.google.android.gms.measurement.internal.j5 r1 = r0.mo52331s()
            com.google.android.gms.measurement.internal.e r4 = com.google.android.gms.measurement.internal.C14956e.f33362c
            long r6 = r0.f33871H
            r1.mo52157s(r4, r8, r6)
            goto L_0x0216
        L_0x01d1:
            com.google.android.gms.internal.measurement.d9 r4 = com.google.android.gms.internal.measurement.C14617d9.f32811c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.e9> r4 = r4.f32812b
            java.lang.Object r4 = r4.zza()
            com.google.android.gms.internal.measurement.e9 r4 = (com.google.android.gms.internal.measurement.C14630e9) r4
            r4.zza()
            com.google.android.gms.measurement.internal.d r4 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C14959e2.f33422o0
            boolean r4 = r4.mo51973p(r10, r6)
            if (r4 == 0) goto L_0x01f6
            com.google.android.gms.measurement.internal.g2 r4 = r0.mo52327n()
            java.lang.String r4 = r4.mo52047m()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0216
        L_0x01f6:
            if (r1 == 0) goto L_0x0216
            android.os.Bundle r4 = r1.zzg
            if (r4 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            boolean r4 = r4.mo51960r(r9)
            if (r4 == 0) goto L_0x0216
            android.os.Bundle r1 = r1.zzg
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.C14956e.m24274a(r1)
            com.google.android.gms.measurement.internal.e r4 = com.google.android.gms.measurement.internal.C14956e.f33362c
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0216
            r5 = r9
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r1 == 0) goto L_0x0223
            com.google.android.gms.measurement.internal.j5 r2 = r0.mo52331s()
            long r6 = r0.f33871H
            r2.mo52157s(r1, r5, r6)
            r2 = r1
        L_0x0223:
            com.google.android.gms.measurement.internal.j5 r1 = r0.mo52331s()
            r1.mo52158t(r2)
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33301f
            long r1 = r1.mo52363a()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0256
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            long r4 = r0.f33871H
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Persisting first open"
            r1.mo52238b(r2, r4)
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33301f
            long r4 = r0.f33871H
            r1.mo52364b(r4)
        L_0x0256:
            com.google.android.gms.measurement.internal.j5 r1 = r0.mo52331s()
            com.google.android.gms.measurement.internal.m7 r1 = r1.f33609o
            boolean r2 = r1.mo52250b()
            if (r2 == 0) goto L_0x0273
            boolean r2 = r1.mo52251c()
            if (r2 == 0) goto L_0x0273
            com.google.android.gms.measurement.internal.u3 r1 = r1.f33685a
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33316u
            r1.mo51938b(r10)
        L_0x0273:
            boolean r1 = r0.mo52322g()
            r2 = 0
            if (r1 != 0) goto L_0x030d
            boolean r1 = r0.mo52321e()
            if (r1 == 0) goto L_0x04ee
            com.google.android.gms.measurement.internal.k7 r1 = r0.mo52335w()
            java.lang.String r4 = "android.permission.INTERNET"
            boolean r1 = r1.mo52200N(r4)
            if (r1 != 0) goto L_0x0297
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r4 = "App is missing INTERNET permission"
            r1.mo52237a(r4)
        L_0x0297:
            com.google.android.gms.measurement.internal.k7 r1 = r0.mo52335w()
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.mo52200N(r4)
            if (r1 != 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r4 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.mo52237a(r4)
        L_0x02ae:
            android.content.Context r1 = r0.f33872b
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            boolean r1 = r1.isCallerInstantApp()
            if (r1 != 0) goto L_0x0300
            com.google.android.gms.measurement.internal.d r1 = r0.f33878h
            boolean r1 = r1.mo51977t()
            if (r1 != 0) goto L_0x0300
            android.content.Context r1 = r0.f33872b
            boolean r1 = com.google.android.gms.measurement.internal.C15018k7.m24471T(r1)
            if (r1 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r4 = "AppMeasurementReceiver not registered/enabled"
            r1.mo52237a(r4)
        L_0x02d5:
            android.content.Context r1 = r0.f33872b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02f3 }
            if (r5 != 0) goto L_0x02e3
            goto L_0x02f3
        L_0x02e3:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x02f3 }
            r6.<init>(r1, r4)     // Catch:{ NameNotFoundException -> 0x02f3 }
            android.content.pm.ServiceInfo r1 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x02f3 }
            if (r1 == 0) goto L_0x02f3
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x02f3 }
            if (r1 == 0) goto L_0x02f3
            r2 = r3
        L_0x02f3:
            if (r2 != 0) goto L_0x0300
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.mo52237a(r2)
        L_0x0300:
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.mo52237a(r2)
            goto L_0x04ee
        L_0x030d:
            com.google.android.gms.measurement.internal.g2 r1 = r0.mo52327n()
            java.lang.String r1 = r1.mo52047m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x032a
            com.google.android.gms.measurement.internal.g2 r1 = r0.mo52327n()
            r1.mo51946h()
            java.lang.String r1 = r1.f33525m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03f3
        L_0x032a:
            com.google.android.gms.measurement.internal.k7 r1 = r0.mo52335w()
            com.google.android.gms.measurement.internal.g2 r4 = r0.mo52327n()
            java.lang.String r4 = r4.mo52047m()
            com.google.android.gms.measurement.internal.c3 r5 = r0.mo52330q()
            r5.mo51995g()
            android.content.SharedPreferences r5 = r5.mo51953k()
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r5 = r5.getString(r6, r10)
            com.google.android.gms.measurement.internal.g2 r7 = r0.mo52327n()
            r7.mo51946h()
            java.lang.String r7 = r7.f33525m
            com.google.android.gms.measurement.internal.c3 r8 = r0.mo52330q()
            r8.mo51995g()
            android.content.SharedPreferences r8 = r8.mo51953k()
            java.lang.String r9 = "admob_app_id"
            java.lang.String r8 = r8.getString(r9, r10)
            r1.getClass()
            boolean r1 = com.google.android.gms.measurement.internal.C15018k7.m24473V(r4, r5, r7, r8)
            if (r1 == 0) goto L_0x03b8
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33730m
            java.lang.String r4 = "Rechecking which service to use due to a GMP App Id change"
            r1.mo52237a(r4)
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            r1.mo51995g()
            java.lang.Boolean r4 = r1.mo51956n()
            android.content.SharedPreferences r5 = r1.mo51953k()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r5.clear()
            r5.apply()
            if (r4 == 0) goto L_0x0393
            r1.mo51957o(r4)
        L_0x0393:
            com.google.android.gms.measurement.internal.i2 r1 = r0.mo52328o()
            r1.mo52119l()
            com.google.android.gms.measurement.internal.i6 r1 = r0.f33892v
            r1.mo52136w()
            com.google.android.gms.measurement.internal.i6 r1 = r0.f33892v
            r1.mo52135v()
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.y2 r1 = r1.f33301f
            long r4 = r0.f33871H
            r1.mo52364b(r4)
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33302g
            r1.mo51938b(r10)
        L_0x03b8:
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.g2 r4 = r0.mo52327n()
            java.lang.String r4 = r4.mo52047m()
            r1.mo51995g()
            android.content.SharedPreferences r1 = r1.mo51953k()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r6, r4)
            r1.apply()
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.g2 r4 = r0.mo52327n()
            r4.mo51946h()
            java.lang.String r4 = r4.f33525m
            r1.mo51995g()
            android.content.SharedPreferences r1 = r1.mo51953k()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r9, r4)
            r1.apply()
        L_0x03f3:
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.e r1 = r1.mo51955m()
            boolean r1 = r1.mo51987f()
            if (r1 != 0) goto L_0x040a
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33302g
            r1.mo51938b(r10)
        L_0x040a:
            com.google.android.gms.measurement.internal.j5 r1 = r0.mo52331s()
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r4 = r4.f33302g
            java.lang.String r4 = r4.mo51937a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r1.f33602h
            r1.set(r4)
            com.google.android.gms.internal.measurement.a9 r1 = com.google.android.gms.internal.measurement.C14578a9.f32745c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.b9> r1 = r1.f32746b
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.b9 r1 = (com.google.android.gms.internal.measurement.C14591b9) r1
            r1.zza()
            com.google.android.gms.measurement.internal.d r1 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C14959e2.f33408h0
            boolean r1 = r1.mo51973p(r10, r4)
            if (r1 == 0) goto L_0x046c
            com.google.android.gms.measurement.internal.k7 r1 = r0.mo52335w()
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b     // Catch:{ ClassNotFoundException -> 0x0448 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1     // Catch:{ ClassNotFoundException -> 0x0448 }
            android.content.Context r1 = r1.f33872b     // Catch:{ ClassNotFoundException -> 0x0448 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0448 }
            java.lang.String r4 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0448 }
            goto L_0x046c
        L_0x0448:
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33315t
            java.lang.String r1 = r1.mo51937a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x046c
            com.google.android.gms.measurement.internal.o2 r1 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33727j
            java.lang.String r4 = "Remote config removed with active feature rollouts"
            r1.mo52237a(r4)
            com.google.android.gms.measurement.internal.c3 r1 = r0.mo52330q()
            com.google.android.gms.measurement.internal.a3 r1 = r1.f33315t
            r1.mo51938b(r10)
        L_0x046c:
            com.google.android.gms.measurement.internal.g2 r1 = r0.mo52327n()
            java.lang.String r1 = r1.mo52047m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0489
            com.google.android.gms.measurement.internal.g2 r1 = r0.mo52327n()
            r1.mo51946h()
            java.lang.String r1 = r1.f33525m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04ee
        L_0x0489:
            boolean r1 = r0.mo52321e()
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            android.content.SharedPreferences r4 = r4.f33299d
            if (r4 != 0) goto L_0x0497
            r4 = r2
            goto L_0x049d
        L_0x0497:
            java.lang.String r5 = "deferred_analytics_collection"
            boolean r4 = r4.contains(r5)
        L_0x049d:
            if (r4 != 0) goto L_0x04b0
            com.google.android.gms.measurement.internal.d r4 = r0.f33878h
            boolean r4 = r4.mo51975r()
            if (r4 != 0) goto L_0x04b0
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            r5 = r1 ^ 1
            r4.mo51958p(r5)
        L_0x04b0:
            if (r1 == 0) goto L_0x04b9
            com.google.android.gms.measurement.internal.j5 r1 = r0.mo52331s()
            r1.mo52147B()
        L_0x04b9:
            com.google.android.gms.measurement.internal.v6 r1 = r0.mo52334v()
            com.google.android.gms.measurement.internal.u6 r1 = r1.f33934e
            r1.mo52338a()
            com.google.android.gms.measurement.internal.i6 r1 = r0.mo52333u()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r1.mo52137x(r4)
            com.google.android.gms.measurement.internal.i6 r1 = r0.mo52333u()
            com.google.android.gms.measurement.internal.c3 r4 = r0.mo52330q()
            com.google.android.gms.measurement.internal.x2 r4 = r4.f33318w
            android.os.Bundle r4 = r4.mo52358a()
            r1.mo51995g()
            r1.mo51946h()
            com.google.android.gms.measurement.internal.zzp r2 = r1.mo52130p(r2)
            com.google.android.gms.measurement.internal.z5 r5 = new com.google.android.gms.measurement.internal.z5
            r5.<init>((com.google.android.gms.measurement.internal.C14999i6) r1, (com.google.android.gms.measurement.internal.zzp) r2, (android.os.Bundle) r4)
            r1.mo52133s(r5)
        L_0x04ee:
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            com.google.android.gms.measurement.internal.w2 r0 = r0.f33309n
            r0.mo52353a(r3)
            return
        L_0x04f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x04fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0504:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x050a:
            java.lang.Object r0 = r12.f33850d
            kotlinx.coroutines.k r0 = (kotlinx.coroutines.C19747k) r0
            java.lang.Object r1 = r12.f33849c
            kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
            kotlin.m r2 = kotlin.C19394m.f43287a
            r0.mo72504z(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15095t3.run():void");
    }

    public /* synthetic */ C15095t3(Object obj, Object obj2, int i) {
        this.f33848b = i;
        this.f33849c = obj;
        this.f33850d = obj2;
    }
}
