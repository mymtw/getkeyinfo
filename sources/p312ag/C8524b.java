package p312ag;

/* renamed from: ag.b */
public final class C8524b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f18563b;

    /* renamed from: c */
    public final /* synthetic */ String f18564c;

    /* renamed from: ag.b$a */
    public static final class C8525a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C8524b f18565b;

        public C8525a(C8524b bVar) {
            this.f18565b = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
            p401mg.C13080a.m20761a(r4, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                boolean r0 = p401mg.C13080a.m20762b(r4)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.String r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27293a     // Catch:{ all -> 0x007a }
                ag.h r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f     // Catch:{ all -> 0x007a }
                r1 = 0
                if (r0 != 0) goto L_0x001d
                ag.h r0 = new ag.h     // Catch:{ all -> 0x007a }
                ag.b r2 = r4.f18565b     // Catch:{ all -> 0x007a }
                long r2 = r2.f18563b     // Catch:{ all -> 0x007a }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x007a }
                r0.<init>(r2, r1)     // Catch:{ all -> 0x007a }
                com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f = r0     // Catch:{ all -> 0x007a }
            L_0x001d:
                java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27297e     // Catch:{ all -> 0x007a }
                int r0 = r0.get()     // Catch:{ all -> 0x007a }
                if (r0 > 0) goto L_0x006e
                ag.b r0 = r4.f18565b     // Catch:{ all -> 0x007a }
                java.lang.String r0 = r0.f18564c     // Catch:{ all -> 0x007a }
                ag.h r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f     // Catch:{ all -> 0x007a }
                java.lang.String r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27300h     // Catch:{ all -> 0x007a }
                p312ag.C8534i.m16941c(r0, r2, r3)     // Catch:{ all -> 0x007a }
                android.content.Context r0 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x007a }
                android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ all -> 0x007a }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SessionInfo.sessionStartTime"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SessionInfo.sessionEndTime"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SessionInfo.interruptionCount"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SessionInfo.sessionId"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                r0.apply()     // Catch:{ all -> 0x007a }
                android.content.Context r0 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x007a }
                android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ all -> 0x007a }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                java.lang.String r2 = "com.facebook.appevents.SourceApplicationInfo.openedByApplink"
                r0.remove(r2)     // Catch:{ all -> 0x007a }
                r0.apply()     // Catch:{ all -> 0x007a }
                com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f = r1     // Catch:{ all -> 0x007a }
            L_0x006e:
                java.lang.Object r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27296d     // Catch:{ all -> 0x007a }
                monitor-enter(r0)     // Catch:{ all -> 0x007a }
                com.facebook.appevents.internal.ActivityLifecycleTracker.f27295c = r1     // Catch:{ all -> 0x0077 }
                kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0077 }
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                return
            L_0x0077:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                throw r1     // Catch:{ all -> 0x007a }
            L_0x007a:
                r0 = move-exception
                p401mg.C13080a.m20761a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p312ag.C8524b.C8525a.run():void");
        }
    }

    public C8524b(long j, String str) {
        this.f18563b = j;
        this.f18564c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        p401mg.C13080a.m20761a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            boolean r0 = p401mg.C13080a.m20762b(r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.facebook.appevents.internal.ActivityLifecycleTracker r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27304l     // Catch:{ all -> 0x0077 }
            ag.h r1 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x001b
            ag.h r1 = new ag.h     // Catch:{ all -> 0x0077 }
            long r2 = r6.f18563b     // Catch:{ all -> 0x0077 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0077 }
            r3 = 0
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0077 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f = r1     // Catch:{ all -> 0x0077 }
        L_0x001b:
            ag.h r1 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0027
            long r2 = r6.f18563b     // Catch:{ all -> 0x0077 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0077 }
            r1.f18587e = r2     // Catch:{ all -> 0x0077 }
        L_0x0027:
            java.util.concurrent.atomic.AtomicInteger r1 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27297e     // Catch:{ all -> 0x0077 }
            int r1 = r1.get()     // Catch:{ all -> 0x0077 }
            if (r1 > 0) goto L_0x005b
            ag.b$a r1 = new ag.b$a     // Catch:{ all -> 0x0077 }
            r1.<init>(r6)     // Catch:{ all -> 0x0077 }
            java.lang.Object r2 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27296d     // Catch:{ all -> 0x0077 }
            monitor-enter(r2)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.ScheduledExecutorService r3 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27294b     // Catch:{ all -> 0x0058 }
            r0.getClass()     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x0058 }
            hg.n r0 = com.facebook.internal.FetchedAppSettingsManager.m20104b(r0)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0049
            int r0 = r0.f28400d     // Catch:{ all -> 0x0058 }
            goto L_0x004b
        L_0x0049:
            r0 = 60
        L_0x004b:
            long r4 = (long) r0     // Catch:{ all -> 0x0058 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0058 }
            java.util.concurrent.ScheduledFuture r0 = r3.schedule(r1, r4, r0)     // Catch:{ all -> 0x0058 }
            com.facebook.appevents.internal.ActivityLifecycleTracker.f27295c = r0     // Catch:{ all -> 0x0058 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x005b:
            long r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27301i     // Catch:{ all -> 0x0077 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x006a
            long r2 = r6.f18563b     // Catch:{ all -> 0x0077 }
            long r2 = r2 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ all -> 0x0077 }
            long r2 = r2 / r0
        L_0x006a:
            java.lang.String r0 = r6.f18564c     // Catch:{ all -> 0x0077 }
            p312ag.C8528e.m16934b(r2, r0)     // Catch:{ all -> 0x0077 }
            ag.h r0 = com.facebook.appevents.internal.ActivityLifecycleTracker.f27298f     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0076
            r0.mo21059a()     // Catch:{ all -> 0x0077 }
        L_0x0076:
            return
        L_0x0077:
            r0 = move-exception
            p401mg.C13080a.m20761a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ag.C8524b.run():void");
    }
}
