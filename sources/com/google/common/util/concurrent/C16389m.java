package com.google.common.util.concurrent;

import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.C16377f;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.common.util.concurrent.m */
public final class C16389m<V> extends FutureTask<V> implements C16388l<V> {

    /* renamed from: b */
    public final C16377f f36499b = new C16377f();

    public C16389m(CacheLoader.C15810a.C15811a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = r1.f36494c;
        r1.f36494c = r2;
        r2 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r2 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        com.google.common.util.concurrent.C16377f.m26505a(r2.f36492a, r2.f36493b);
        r2 = r2.f36494c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void done() {
        /*
            r3 = this;
            com.google.common.util.concurrent.f r0 = r3.f36499b
            monitor-enter(r0)
            boolean r1 = r0.f36491b     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0027
        L_0x0009:
            r1 = 1
            r0.f36491b = r1     // Catch:{ all -> 0x0028 }
            com.google.common.util.concurrent.f$a r1 = r0.f36490a     // Catch:{ all -> 0x0028 }
            r2 = 0
            r0.f36490a = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
        L_0x0012:
            if (r1 == 0) goto L_0x001b
            com.google.common.util.concurrent.f$a r0 = r1.f36494c
            r1.f36494c = r2
            r2 = r1
            r1 = r0
            goto L_0x0012
        L_0x001b:
            if (r2 == 0) goto L_0x0027
            java.lang.Runnable r0 = r2.f36492a
            java.util.concurrent.Executor r1 = r2.f36493b
            com.google.common.util.concurrent.C16377f.m26505a(r0, r1)
            com.google.common.util.concurrent.f$a r2 = r2.f36494c
            goto L_0x001b
        L_0x0027:
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C16389m.done():void");
    }

    /* renamed from: e */
    public final void mo7981e(Runnable runnable, Executor executor) {
        C16377f fVar = this.f36499b;
        fVar.getClass();
        if (executor != null) {
            synchronized (fVar) {
                if (!fVar.f36491b) {
                    fVar.f36490a = new C16377f.C16378a(runnable, executor, fVar.f36490a);
                } else {
                    C16377f.m26505a(runnable, executor);
                }
            }
        } else {
            throw new NullPointerException("Executor was null.");
        }
    }
}
