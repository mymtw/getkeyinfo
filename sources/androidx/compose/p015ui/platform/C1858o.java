package androidx.compose.p015ui.platform;

/* renamed from: androidx.compose.ui.platform.o */
public final /* synthetic */ class C1858o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f4111b;

    /* renamed from: c */
    public final /* synthetic */ Object f4112c;

    public /* synthetic */ C1858o(Object obj, int i) {
        this.f4111b = i;
        this.f4112c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0149, code lost:
        if (r3 == null) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f4111b
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x003b;
                case 2: goto L_0x0032;
                case 3: goto L_0x0025;
                case 4: goto L_0x000e;
                case 5: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x004b
        L_0x0006:
            java.lang.Object r0 = r10.f4112c
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = (com.google.android.exoplayer2.p526ui.StyledPlayerControlView) r0
            r0.updateProgress()
            return
        L_0x000e:
            java.lang.Object r0 = r10.f4112c
            ye.a r0 = (p491ye.C13915a) r0
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            android.app.Activity r1 = r0.f30576b
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L_0x0024
            android.widget.PopupWindow r0 = r0.f30575a
            r0.dismiss()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r0 = r10.f4112c
            android.view.View r0 = (android.view.View) r0
            java.lang.String r1 = "$this_apply"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.etsy.android.extensions.ViewExtensions.m12860d(r0)
            return
        L_0x0032:
            java.lang.Object r0 = r10.f4112c
            androidx.room.x r0 = (androidx.room.C3258x) r0
            r0.getClass()
            r0 = 0
            throw r0
        L_0x003b:
            java.lang.Object r0 = r10.f4112c
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            r0.lambda$new$1()
            return
        L_0x0043:
            java.lang.Object r0 = r10.f4112c
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p015ui.platform.AndroidComposeView) r0
            androidx.compose.p015ui.platform.AndroidComposeView.m34788sendHoverExitEvent$lambda5(r0)
            return
        L_0x004b:
            java.lang.Object r0 = r10.f4112c
            ln.f r0 = (p616ln.C18208f) r0
            gm.c r1 = r0.f39886e
            r1.mo69021a()
            android.content.Context r1 = r1.f38672a
            r0.f39892k = r1
            java.lang.String r1 = r1.getPackageName()
            r0.f39897p = r1
            com.google.firebase.perf.config.a r1 = com.google.firebase.perf.config.C16594a.m27423e()
            r0.f39893l = r1
            ln.c r1 = new ln.c
            android.content.Context r2 = r0.f39892k
            com.google.firebase.perf.util.d r9 = new com.google.firebase.perf.util.d
            r4 = 100
            r6 = 1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            r3 = r9
            r3.<init>(r4, r6, r8)
            r1.<init>(r2, r9)
            r0.f39894m = r1
            com.google.firebase.perf.application.AppStateMonitor r1 = com.google.firebase.perf.application.AppStateMonitor.getInstance()
            r0.f39895n = r1
            ln.a r1 = new ln.a
            ym.a<com.google.android.datatransport.e> r2 = r0.f39889h
            com.google.firebase.perf.config.a r3 = r0.f39893l
            r3.getClass()
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r4 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36825e
            java.lang.Class<com.google.firebase.perf.config.ConfigurationConstants$LogSourceName> r4 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.class
            monitor-enter(r4)
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r5 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36825e     // Catch:{ all -> 0x018c }
            if (r5 != 0) goto L_0x0098
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r5 = new com.google.firebase.perf.config.ConfigurationConstants$LogSourceName     // Catch:{ all -> 0x018c }
            r5.<init>()     // Catch:{ all -> 0x018c }
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36825e = r5     // Catch:{ all -> 0x018c }
        L_0x0098:
            com.google.firebase.perf.config.ConfigurationConstants$LogSourceName r5 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36825e     // Catch:{ all -> 0x018c }
            monitor-exit(r4)
            java.lang.Boolean r4 = p552dn.C17696a.f38491a
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00a9
            r5.getClass()
            java.lang.String r3 = "FIREPERF"
            goto L_0x00f4
        L_0x00a9:
            r5.getClass()
            java.lang.String r4 = "fpr_log_source"
            com.google.firebase.perf.config.RemoteConfigManager r6 = r3.f36829a
            r7 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r4 = r6.getRemoteConfigValueOrDefault(r4, r7)
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            java.lang.String r4 = "com.google.firebase.perf.LogSourceName"
            java.util.Map<java.lang.Long, java.lang.String> r8 = com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.f36826f
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            boolean r9 = r8.containsKey(r9)
            if (r9 == 0) goto L_0x00e1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00e1
            com.google.firebase.perf.config.s r3 = r3.f36831c
            r3.mo59263e(r4, r6)
            r3 = r6
            goto L_0x00f4
        L_0x00e1:
            com.google.firebase.perf.util.c r3 = r3.mo59251d(r5)
            boolean r4 = r3.mo59369b()
            if (r4 == 0) goto L_0x00f2
            java.lang.Object r3 = r3.mo59368a()
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r3 = "FIREPERF"
        L_0x00f4:
            r1.<init>(r2, r3)
            r0.f39890i = r1
            com.google.firebase.perf.application.AppStateMonitor r1 = r0.f39895n
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            ln.f r3 = p616ln.C18208f.f39882t
            r2.<init>(r3)
            r1.registerForAppState(r2)
            com.google.firebase.perf.v1.c$b r1 = com.google.firebase.perf.p530v1.C16656c.m27561K()
            r0.f39896o = r1
            gm.c r2 = r0.f39886e
            r2.mo69021a()
            gm.e r2 = r2.f38674c
            java.lang.String r2 = r2.f38685b
            r1.mo59761u()
            MessageType r3 = r1.f37158c
            com.google.firebase.perf.v1.c r3 = (com.google.firebase.perf.p530v1.C16656c) r3
            com.google.firebase.perf.p530v1.C16656c.m27563z(r3, r2)
            com.google.firebase.perf.v1.a$b r2 = com.google.firebase.perf.p530v1.C16650a.m27545F()
            java.lang.String r3 = r0.f39897p
            r2.mo59761u()
            MessageType r4 = r2.f37158c
            com.google.firebase.perf.v1.a r4 = (com.google.firebase.perf.p530v1.C16650a) r4
            com.google.firebase.perf.p530v1.C16650a.m27547z(r4, r3)
            r2.mo59761u()
            MessageType r3 = r2.f37158c
            com.google.firebase.perf.v1.a r3 = (com.google.firebase.perf.p530v1.C16650a) r3
            com.google.firebase.perf.p530v1.C16650a.m27542A(r3)
            android.content.Context r3 = r0.f39892k
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x014b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x014b }
            r5 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r5)     // Catch:{ NameNotFoundException -> 0x014b }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x014b }
            if (r3 != 0) goto L_0x014d
        L_0x014b:
            java.lang.String r3 = ""
        L_0x014d:
            r2.mo59761u()
            MessageType r4 = r2.f37158c
            com.google.firebase.perf.v1.a r4 = (com.google.firebase.perf.p530v1.C16650a) r4
            com.google.firebase.perf.p530v1.C16650a.m27543B(r4, r3)
            r1.mo59761u()
            MessageType r1 = r1.f37158c
            com.google.firebase.perf.v1.c r1 = (com.google.firebase.perf.p530v1.C16656c) r1
            com.google.protobuf.GeneratedMessageLite r2 = r2.mo59759s()
            com.google.firebase.perf.v1.a r2 = (com.google.firebase.perf.p530v1.C16650a) r2
            com.google.firebase.perf.p530v1.C16656c.m27559D(r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f39885d
            r2 = 1
            r1.set(r2)
        L_0x016d:
            java.util.concurrent.ConcurrentLinkedQueue<ln.b> r1 = r0.f39884c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018b
            java.util.concurrent.ConcurrentLinkedQueue<ln.b> r1 = r0.f39884c
            java.lang.Object r1 = r1.poll()
            ln.b r1 = (p616ln.C18203b) r1
            if (r1 == 0) goto L_0x016d
            java.util.concurrent.ThreadPoolExecutor r2 = r0.f39891j
            com.braze.ui.inappmessage.views.e r3 = new com.braze.ui.inappmessage.views.e
            r4 = 3
            r3.<init>(r4, r0, r1)
            r2.execute(r3)
            goto L_0x016d
        L_0x018b:
            return
        L_0x018c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1858o.run():void");
    }
}
