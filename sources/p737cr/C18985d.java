package p737cr;

import com.etsy.android.lib.requests.EtsyRequest;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p735br.C18979b;
import p735br.C18980c;

/* renamed from: cr.d */
public final class C18985d {

    /* renamed from: h */
    public static final C18985d f42320h;

    /* renamed from: i */
    public static final Logger f42321i;

    /* renamed from: j */
    public static final C18987b f42322j = new C18987b();

    /* renamed from: a */
    public int f42323a = EtsyRequest.DEFAULT_TIMEOUT;

    /* renamed from: b */
    public boolean f42324b;

    /* renamed from: c */
    public long f42325c;

    /* renamed from: d */
    public final ArrayList f42326d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f42327e = new ArrayList();

    /* renamed from: f */
    public final C18989e f42328f = new C18989e(this);

    /* renamed from: g */
    public final C18986a f42329g;

    /* renamed from: cr.d$a */
    public interface C18986a {
        /* renamed from: a */
        void mo70431a(C18985d dVar, long j);

        /* renamed from: b */
        void mo70432b(C18985d dVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* renamed from: cr.d$b */
    public static final class C18987b {
    }

    /* renamed from: cr.d$c */
    public static final class C18988c implements C18986a {

        /* renamed from: a */
        public final ThreadPoolExecutor f42330a;

        public C18988c(C18979b bVar) {
            this.f42330a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        }

        /* renamed from: a */
        public final void mo70431a(C18985d dVar, long j) throws InterruptedException {
            C19383o.m32797g(dVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        /* renamed from: b */
        public final void mo70432b(C18985d dVar) {
            C19383o.m32797g(dVar, "taskRunner");
            dVar.notify();
        }

        public final void execute(Runnable runnable) {
            C19383o.m32797g(runnable, "runnable");
            this.f42330a.execute(runnable);
        }

        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        String str = C18980c.f42307g + " TaskRunner";
        C19383o.m32797g(str, "name");
        f42320h = new C18985d(new C18988c(new C18979b(str, true)));
        Logger logger = Logger.getLogger(C18985d.class.getName());
        C19383o.m32796f(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f42321i = logger;
    }

    public C18985d(C18988c cVar) {
        this.f42329g = cVar;
    }

    /* renamed from: a */
    public static final void m32133a(C18985d dVar, C18982a aVar) {
        dVar.getClass();
        byte[] bArr = C18980c.f42301a;
        Thread currentThread = Thread.currentThread();
        C19383o.m32796f(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f42311c);
        try {
            long a = aVar.mo70418a();
            synchronized (dVar) {
                dVar.mo70426b(aVar, a);
                C19394m mVar = C19394m.f43287a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.mo70426b(aVar, -1);
                C19394m mVar2 = C19394m.f43287a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo70426b(C18982a aVar, long j) {
        byte[] bArr = C18980c.f42301a;
        C18984c cVar = aVar.f42309a;
        C19383o.m32794d(cVar);
        if (cVar.f42315b == aVar) {
            boolean z = cVar.f42317d;
            cVar.f42317d = false;
            cVar.f42315b = null;
            this.f42326d.remove(cVar);
            if (j != -1 && !z && !cVar.f42314a) {
                cVar.mo70423e(aVar, j, true);
            }
            if (!cVar.f42316c.isEmpty()) {
                this.f42327e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p737cr.C18982a mo70427c() {
        /*
            r14 = this;
            byte[] r0 = p735br.C18980c.f42301a
        L_0x0002:
            java.util.ArrayList r0 = r14.f42327e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            cr.d$a r0 = r14.f42329g
            long r2 = r0.nanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.ArrayList r0 = r14.f42327e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            cr.c r7 = (p737cr.C18984c) r7
            java.util.ArrayList r7 = r7.f42316c
            java.lang.Object r7 = r7.get(r9)
            cr.a r7 = (p737cr.C18982a) r7
            long r10 = r7.f42310b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = p735br.C18980c.f42301a
            r1 = -1
            r6.f42310b = r1
            cr.c r1 = r6.f42309a
            kotlin.jvm.internal.C19383o.m32794d(r1)
            java.util.ArrayList r2 = r1.f42316c
            r2.remove(r6)
            java.util.ArrayList r2 = r14.f42327e
            r2.remove(r1)
            r1.f42315b = r6
            java.util.ArrayList r2 = r14.f42326d
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f42324b
            if (r0 != 0) goto L_0x0081
            java.util.ArrayList r0 = r14.f42327e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            cr.d$a r0 = r14.f42329g
            cr.e r1 = r14.f42328f
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f42324b
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f42325c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            cr.d$a r0 = r14.f42329g
            r0.mo70432b(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f42324b = r8
            long r2 = r2 + r4
            r14.f42325c = r2
            cr.d$a r0 = r14.f42329g     // Catch:{ InterruptedException -> 0x00a0 }
            r0.mo70431a(r14, r4)     // Catch:{ InterruptedException -> 0x00a0 }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a0:
            r14.mo70428d()     // Catch:{ all -> 0x009e }
        L_0x00a3:
            r14.f42324b = r9
            goto L_0x0002
        L_0x00a7:
            r14.f42324b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p737cr.C18985d.mo70427c():cr.a");
    }

    /* renamed from: d */
    public final void mo70428d() {
        int size = this.f42326d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((C18984c) this.f42326d.get(size)).mo70421b();
        }
        int size2 = this.f42327e.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                C18984c cVar = (C18984c) this.f42327e.get(size2);
                cVar.mo70421b();
                if (cVar.f42316c.isEmpty()) {
                    this.f42327e.remove(size2);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo70429e(C18984c cVar) {
        C19383o.m32797g(cVar, "taskQueue");
        byte[] bArr = C18980c.f42301a;
        if (cVar.f42315b == null) {
            if (!cVar.f42316c.isEmpty()) {
                ArrayList arrayList = this.f42327e;
                C19383o.m32797g(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                this.f42327e.remove(cVar);
            }
        }
        if (this.f42324b) {
            this.f42329g.mo70432b(this);
        } else {
            this.f42329g.execute(this.f42328f);
        }
    }

    /* renamed from: f */
    public final C18984c mo70430f() {
        int i;
        synchronized (this) {
            i = this.f42323a;
            this.f42323a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C18984c(this, sb.toString());
    }
}
