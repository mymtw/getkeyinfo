package p594jh;

import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import p513bj.C14046a;
import p513bj.C14075p;
import p513bj.C14083w;

/* renamed from: jh.b1 */
public final class C17894b1 {

    /* renamed from: a */
    public final C17896b f38859a;

    /* renamed from: b */
    public final C17895a f38860b;

    /* renamed from: c */
    public final C14046a f38861c;

    /* renamed from: d */
    public int f38862d;

    /* renamed from: e */
    public Object f38863e;

    /* renamed from: f */
    public Looper f38864f;

    /* renamed from: g */
    public boolean f38865g;

    /* renamed from: h */
    public boolean f38866h;

    /* renamed from: i */
    public boolean f38867i;

    /* renamed from: jh.b1$a */
    public interface C17895a {
    }

    /* renamed from: jh.b1$b */
    public interface C17896b {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public C17894b1(C17931k0 k0Var, C17896b bVar, C17939k1 k1Var, int i, C14046a aVar, Looper looper) {
        this.f38860b = k0Var;
        this.f38859a = bVar;
        this.f38864f = looper;
        this.f38861c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[SYNTHETIC, Splitter:B:16:0x003e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo69360a(long r6) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f38865g     // Catch:{ all -> 0x0046 }
            p513bj.C14075p.m21694f(r0)     // Catch:{ all -> 0x0046 }
            android.os.Looper r0 = r5.f38864f     // Catch:{ all -> 0x0046 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0046 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0046 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            p513bj.C14075p.m21694f(r0)     // Catch:{ all -> 0x0046 }
            bj.a r0 = r5.f38861c     // Catch:{ all -> 0x0046 }
            long r0 = r0.elapsedRealtime()     // Catch:{ all -> 0x0046 }
            long r0 = r0 + r6
        L_0x001f:
            boolean r2 = r5.f38867i     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003a
            bj.a r2 = r5.f38861c     // Catch:{ all -> 0x0046 }
            r2.mo46867c()     // Catch:{ all -> 0x0046 }
            r5.wait(r6)     // Catch:{ all -> 0x0046 }
            bj.a r6 = r5.f38861c     // Catch:{ all -> 0x0046 }
            long r6 = r6.elapsedRealtime()     // Catch:{ all -> 0x0046 }
            long r6 = r0 - r6
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x003e
            monitor-exit(r5)
            return
        L_0x003e:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x0046 }
            throw r6     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17894b1.mo69360a(long):void");
    }

    /* renamed from: b */
    public final synchronized void mo69361b(boolean z) {
        this.f38866h = z | this.f38866h;
        this.f38867i = true;
        notifyAll();
    }

    /* renamed from: c */
    public final void mo69362c() {
        C14075p.m21694f(!this.f38865g);
        this.f38865g = true;
        C17931k0 k0Var = (C17931k0) this.f38860b;
        synchronized (k0Var) {
            if (!k0Var.f39076z) {
                if (k0Var.f39059i.isAlive()) {
                    ((C14083w) k0Var.f39058h).mo46949a(14, this).mo46951a();
                    return;
                }
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            mo69361b(false);
        }
    }
}
