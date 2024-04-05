package p756lr;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.b */
public class C19883b extends C19890d0 {

    /* renamed from: h */
    public static final long f43860h;

    /* renamed from: i */
    public static final long f43861i;

    /* renamed from: j */
    public static C19883b f43862j;

    /* renamed from: e */
    public boolean f43863e;

    /* renamed from: f */
    public C19883b f43864f;

    /* renamed from: g */
    public long f43865g;

    /* renamed from: lr.b$a */
    public static final class C19884a {
        /* renamed from: a */
        public static C19883b m33874a() throws InterruptedException {
            Class<C19883b> cls = C19883b.class;
            C19883b bVar = C19883b.f43862j;
            C19383o.m32794d(bVar);
            C19883b bVar2 = bVar.f43864f;
            if (bVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C19883b.f43860h);
                C19883b bVar3 = C19883b.f43862j;
                C19383o.m32794d(bVar3);
                if (bVar3.f43864f != null || System.nanoTime() - nanoTime < C19883b.f43861i) {
                    return null;
                }
                return C19883b.f43862j;
            }
            long nanoTime2 = bVar2.f43865g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            C19883b bVar4 = C19883b.f43862j;
            C19383o.m32794d(bVar4);
            bVar4.f43864f = bVar2.f43864f;
            bVar2.f43864f = null;
            return bVar2;
        }
    }

    /* renamed from: lr.b$b */
    public static final class C19885b extends Thread {
        public C19885b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            r1.mo70524k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<lr.b> r0 = p756lr.C19883b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                lr.b r1 = p756lr.C19883b.f43862j     // Catch:{ all -> 0x001b }
                lr.b r1 = p756lr.C19883b.C19884a.m33874a()     // Catch:{ all -> 0x001b }
                lr.b r2 = p756lr.C19883b.f43862j     // Catch:{ all -> 0x001b }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                p756lr.C19883b.f43862j = r1     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo70524k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p756lr.C19883b.C19885b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f43860h = millis;
        f43861i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public final void mo72694h() {
        C19883b bVar;
        long j = this.f43874c;
        boolean z = this.f43872a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0 || z) {
            Class<C19883b> cls = C19883b.class;
            synchronized (cls) {
                if (!this.f43863e) {
                    this.f43863e = true;
                    if (f43862j == null) {
                        f43862j = new C19883b();
                        new C19885b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i != 0 && z) {
                        this.f43865g = Math.min(j, mo72701c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        this.f43865g = j + nanoTime;
                    } else if (z) {
                        this.f43865g = mo72701c();
                    } else {
                        throw new AssertionError();
                    }
                    long j2 = this.f43865g - nanoTime;
                    C19883b bVar2 = f43862j;
                    C19383o.m32794d(bVar2);
                    while (true) {
                        bVar = bVar2.f43864f;
                        if (bVar == null) {
                            break;
                        } else if (j2 < bVar.f43865g - nanoTime) {
                            break;
                        } else {
                            bVar2 = bVar;
                        }
                    }
                    this.f43864f = bVar;
                    bVar2.f43864f = this;
                    if (bVar2 == f43862j) {
                        cls.notify();
                    }
                    C19394m mVar = C19394m.f43287a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo72695i() {
        boolean z;
        synchronized (C19883b.class) {
            z = false;
            if (this.f43863e) {
                this.f43863e = false;
                C19883b bVar = f43862j;
                while (true) {
                    if (bVar == null) {
                        z = true;
                        break;
                    }
                    C19883b bVar2 = bVar.f43864f;
                    if (bVar2 == this) {
                        bVar.f43864f = this.f43864f;
                        this.f43864f = null;
                        break;
                    }
                    bVar = bVar2;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public IOException mo70523j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: k */
    public void mo70524k() {
    }
}
