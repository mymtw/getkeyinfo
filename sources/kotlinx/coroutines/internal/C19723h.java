package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19698g0;
import kotlinx.coroutines.C19744j0;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19766p0;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C19723h extends CoroutineDispatcher implements Runnable, C19744j0 {

    /* renamed from: c */
    public final CoroutineDispatcher f43667c;

    /* renamed from: d */
    public final int f43668d;

    /* renamed from: e */
    public final /* synthetic */ C19744j0 f43669e;

    /* renamed from: f */
    public final C19725j<Runnable> f43670f;

    /* renamed from: g */
    public final Object f43671g;
    private volatile int runningWorkers;

    public C19723h(CoroutineDispatcher coroutineDispatcher, int i) {
        this.f43667c = coroutineDispatcher;
        this.f43668d = i;
        C19744j0 j0Var = coroutineDispatcher instanceof C19744j0 ? (C19744j0) coroutineDispatcher : null;
        this.f43669e = j0Var == null ? C19698g0.f43633a : j0Var;
        this.f43670f = new C19725j<>();
        this.f43671g = new Object();
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        this.f43670f.mo72462a(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.f43668d)) {
            synchronized (this.f43671g) {
                if (this.runningWorkers >= this.f43668d) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f43667c.mo7108A0(this, this);
            }
        }
    }

    /* renamed from: B0 */
    public final void mo72075B0(CoroutineContext coroutineContext, Runnable runnable) {
        this.f43670f.mo72462a(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.f43668d)) {
            synchronized (this.f43671g) {
                if (this.runningWorkers >= this.f43668d) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f43667c.mo72075B0(this, this);
            }
        }
    }

    /* renamed from: i */
    public final C19766p0 mo72115i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f43669e.mo72115i(j, runnable, coroutineContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f43671g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f43670f.mo72464c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = kotlin.C19394m.f43287a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.j<java.lang.Runnable> r2 = r4.f43670f
            java.lang.Object r2 = r2.mo72465d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            p514bk.C14088a.m21785m(r2, r3)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f43667c
            boolean r2 = r2.mo10805C0(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f43667c
            r0.mo7108A0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f43671g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.j<java.lang.Runnable> r2 = r4.f43670f     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo72464c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C19723h.run():void");
    }

    /* renamed from: t */
    public final void mo72116t(long j, C19753l lVar) {
        this.f43669e.mo72116t(j, lVar);
    }
}
