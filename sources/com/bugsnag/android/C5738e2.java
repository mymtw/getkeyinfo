package com.bugsnag.android;

import android.app.ActivityManager;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5760a;
import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.e2 */
public final class C5738e2 extends C5756i {

    /* renamed from: b */
    public final ConcurrentLinkedQueue f12218b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final long f12219c;

    /* renamed from: d */
    public final C5763c f12220d;

    /* renamed from: e */
    public final C5805m f12221e;

    /* renamed from: f */
    public final C5917u f12222f;

    /* renamed from: g */
    public final C5733d2 f12223g;

    /* renamed from: h */
    public final AtomicLong f12224h = new AtomicLong(0);

    /* renamed from: i */
    public final AtomicLong f12225i = new AtomicLong(0);

    /* renamed from: j */
    public volatile C5728c2 f12226j = null;

    /* renamed from: k */
    public final C5732d1 f12227k;

    /* renamed from: l */
    public final C5746g f12228l;

    /* renamed from: m */
    public final C5816o1 f12229m;

    /* renamed from: com.bugsnag.android.e2$a */
    public class C5739a implements Runnable {
        public C5739a() {
        }

        public final void run() {
            C5738e2 e2Var = C5738e2.this;
            Iterator it = e2Var.f12223g.mo16492d().iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                e2Var.f12229m.mo16604d("SessionTracker#flushStoredSession() - attempting delivery");
                C5728c2 c2Var = new C5728c2(file, e2Var.f12222f.f12641t, e2Var.f12229m);
                File file2 = c2Var.f12182b;
                if (!(file2 != null && file2.getName().endsWith("_v2.json"))) {
                    c2Var.f12188h = e2Var.f12222f.f12630i.mo16497a();
                    c2Var.f12189i = e2Var.f12222f.f12629h.mo16556a();
                }
                int i = C5740b.f12231a[e2Var.mo16503a(c2Var).ordinal()];
                if (i == 1) {
                    e2Var.f12223g.mo16490b(Collections.singletonList(file));
                    e2Var.f12229m.mo16604d("Sent 1 new session to Bugsnag");
                } else if (i == 2) {
                    e2Var.f12223g.mo16489a(Collections.singletonList(file));
                    e2Var.f12229m.mo16608h("Leaving session payload for future delivery");
                } else if (i == 3) {
                    e2Var.f12229m.mo16608h("Deleting invalid session tracking payload");
                    e2Var.f12223g.mo16490b(Collections.singletonList(file));
                }
            }
        }
    }

    /* renamed from: com.bugsnag.android.e2$b */
    public static /* synthetic */ class C5740b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bugsnag.android.DeliveryStatus[] r0 = com.bugsnag.android.DeliveryStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12231a = r0
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12231a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.UNDELIVERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12231a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.FAILURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5738e2.C5740b.<clinit>():void");
        }
    }

    public C5738e2(C5763c cVar, C5805m mVar, C5917u uVar, C5733d2 d2Var, C5816o1 o1Var, C5746g gVar) {
        this.f12220d = cVar;
        this.f12221e = mVar;
        this.f12222f = uVar;
        this.f12219c = 30000;
        this.f12223g = d2Var;
        this.f12227k = new C5732d1(uVar.f12628g);
        this.f12228l = gVar;
        this.f12229m = o1Var;
        Boolean d = mo16506d();
        updateState(new C5780k2.C5794n(d != null ? d.booleanValue() : false, mo16505c()));
    }

    /* renamed from: a */
    public final DeliveryStatus mo16503a(C5728c2 c2Var) {
        C5763c cVar = this.f12220d;
        String str = cVar.f12326p.f12437b;
        String str2 = cVar.f12311a;
        C19383o.m32798h(str2, "apiKey");
        return this.f12220d.f12325o.mo16485a(c2Var, new C5747g0(str, C19294b0.m32562s0(new Pair("Bugsnag-Payload-Version", "1.0"), new Pair("Bugsnag-Api-Key", str2), new Pair("Content-Type", "application/json"), new Pair("Bugsnag-Sent-At", C5760a.m11557b(new Date())))));
    }

    /* renamed from: b */
    public final void mo16504b() {
        try {
            this.f12228l.mo16512a(TaskType.SESSION_REQUEST, new C5739a());
        } catch (RejectedExecutionException e) {
            this.f12229m.mo16602b("Failed to flush session reports", e);
        }
    }

    /* renamed from: c */
    public final String mo16505c() {
        if (this.f12218b.isEmpty()) {
            return null;
        }
        int size = this.f12218b.size();
        return ((String[]) this.f12218b.toArray(new String[size]))[size - 1];
    }

    /* renamed from: d */
    public final Boolean mo16506d() {
        this.f12227k.getClass();
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Boolean.valueOf(runningAppProcessInfo.importance <= 125);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final void mo16507e(C5728c2 c2Var) {
        updateState(new C5780k2.C5792l(c2Var.f12184d, C5760a.m11557b(c2Var.f12185e), c2Var.f12192l.intValue(), c2Var.f12191k.intValue()));
    }

    /* renamed from: f */
    public final C5728c2 mo16508f(Date date, C5915t2 t2Var, boolean z) {
        boolean z2;
        if (this.f12222f.f12622a.mo16548e(z)) {
            return null;
        }
        C5728c2 c2Var = new C5728c2(UUID.randomUUID().toString(), date, t2Var, z, this.f12222f.f12641t, this.f12229m);
        this.f12229m.mo16604d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        c2Var.f12188h = this.f12222f.f12630i.mo16497a();
        c2Var.f12189i = this.f12222f.f12629h.mo16556a();
        C5805m mVar = this.f12221e;
        C5816o1 o1Var = this.f12229m;
        mVar.getClass();
        C19383o.m32798h(o1Var, "logger");
        boolean z3 = false;
        if (!mVar.f12417c.isEmpty()) {
            Iterator<T> it = mVar.f12417c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    if (!((C5940z1) it.next()).mo16711a()) {
                        z2 = false;
                        break;
                    }
                } catch (Throwable th) {
                    o1Var.mo16602b("OnSessionCallback threw an Exception", th);
                }
            }
        }
        z2 = true;
        if (z2 && c2Var.f12193m.compareAndSet(false, true)) {
            this.f12226j = c2Var;
            mo16507e(c2Var);
            try {
                this.f12228l.mo16512a(TaskType.SESSION_REQUEST, new C5745f2(this, c2Var));
            } catch (RejectedExecutionException unused) {
                this.f12223g.mo16495g(c2Var);
            }
            mo16504b();
            z3 = true;
        }
        if (z3) {
            return c2Var;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo16509g(long j, String str, boolean z) {
        if (z) {
            long j2 = j - this.f12224h.get();
            if (this.f12218b.isEmpty()) {
                this.f12225i.set(j);
                if (j2 >= this.f12219c && this.f12220d.f12314d) {
                    mo16508f(new Date(), this.f12222f.f12627f.f12663b, true);
                }
            }
            this.f12218b.add(str);
        } else {
            this.f12218b.remove(str);
            if (this.f12218b.isEmpty()) {
                this.f12224h.set(j);
            }
        }
        C5717a0 a0Var = this.f12222f.f12625d;
        String c = mo16505c();
        if (a0Var.f12146c != "__BUGSNAG_MANUAL_CONTEXT__") {
            a0Var.f12146c = c;
            a0Var.mo16478a();
        }
        Boolean d = mo16506d();
        updateState(new C5780k2.C5794n(d != null ? d.booleanValue() : false, mo16505c()));
    }
}
