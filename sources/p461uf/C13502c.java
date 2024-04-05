package p461uf;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;

/* renamed from: uf.c */
public final class C13502c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AccessTokenAppIdPair f29543b;

    /* renamed from: c */
    public final /* synthetic */ AppEvent f29544c;

    public C13502c(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        this.f29543b = accessTokenAppIdPair;
        this.f29544c = appEvent;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066 A[Catch:{ all -> 0x0046, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC, Splitter:B:45:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097 A[SYNTHETIC, Splitter:B:52:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.Class<uf.d> r0 = p461uf.C13503d.class
            boolean r1 = p401mg.C13080a.m20762b(r6)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            androidx.appcompat.app.l r1 = p461uf.C13503d.m21265a()     // Catch:{ all -> 0x00a2 }
            com.facebook.appevents.AccessTokenAppIdPair r2 = r6.f29543b     // Catch:{ all -> 0x00a2 }
            com.facebook.appevents.AppEvent r3 = r6.f29544c     // Catch:{ all -> 0x00a2 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = "accessTokenAppIdPair"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "appEvent"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)     // Catch:{ all -> 0x009f }
            uf.n r2 = r1.mo1418p(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0025
            r2.mo46176a(r3)     // Catch:{ all -> 0x009f }
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x00a2 }
            uf.h$a r1 = p461uf.C13511h.f29567i     // Catch:{ all -> 0x00a2 }
            r1.getClass()     // Catch:{ all -> 0x00a2 }
            com.facebook.appevents.AppEventsLogger$FlushBehavior r1 = p461uf.C13511h.C13512a.m21285c()     // Catch:{ all -> 0x00a2 }
            com.facebook.appevents.AppEventsLogger$FlushBehavior r2 = com.facebook.appevents.AppEventsLogger$FlushBehavior.EXPLICIT_ONLY     // Catch:{ all -> 0x00a2 }
            if (r1 == r2) goto L_0x0052
            androidx.appcompat.app.l r1 = p461uf.C13503d.m21265a()     // Catch:{ all -> 0x00a2 }
            int r1 = r1.mo1416n()     // Catch:{ all -> 0x00a2 }
            boolean r2 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00a2 }
            r3 = 0
            if (r2 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            int r3 = p461uf.C13503d.f29546b     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r2 = move-exception
            p401mg.C13080a.m20761a(r0, r2)     // Catch:{ all -> 0x00a2 }
        L_0x004a:
            if (r1 <= r3) goto L_0x0052
            com.facebook.appevents.FlushReason r0 = com.facebook.appevents.FlushReason.EVENT_THRESHOLD     // Catch:{ all -> 0x00a2 }
            p461uf.C13503d.m21269e(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x009e
        L_0x0052:
            java.lang.String r1 = p461uf.C13503d.f29545a     // Catch:{ all -> 0x00a2 }
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r1 == 0) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            java.util.concurrent.ScheduledFuture<?> r1 = p461uf.C13503d.f29549e     // Catch:{ all -> 0x005f }
            goto L_0x0064
        L_0x005f:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x00a2 }
        L_0x0063:
            r1 = r2
        L_0x0064:
            if (r1 != 0) goto L_0x009e
            java.lang.String r1 = p461uf.C13503d.f29545a     // Catch:{ all -> 0x00a2 }
            boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x006f
            goto L_0x0076
        L_0x006f:
            java.util.concurrent.ScheduledExecutorService r1 = p461uf.C13503d.f29548d     // Catch:{ all -> 0x0072 }
            goto L_0x0077
        L_0x0072:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x00a2 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            java.lang.String r3 = p461uf.C13503d.f29545a     // Catch:{ all -> 0x00a2 }
            boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            uf.d$c r2 = p461uf.C13503d.f29550f     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r3 = move-exception
            p401mg.C13080a.m20761a(r0, r3)     // Catch:{ all -> 0x00a2 }
        L_0x0087:
            r3 = 15
            long r3 = (long) r3     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)     // Catch:{ all -> 0x00a2 }
            boolean r2 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0097
            goto L_0x009e
        L_0x0097:
            p461uf.C13503d.f29549e = r1     // Catch:{ all -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x00a2 }
        L_0x009e:
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            p401mg.C13080a.m20761a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461uf.C13502c.run():void");
    }
}
