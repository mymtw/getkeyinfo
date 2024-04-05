package p252u2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C3373b;
import androidx.work.C3382f;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C3409a;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.futures.C3419a;
import com.google.common.util.concurrent.C16388l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p023b3.C3473a;
import p079d3.C6641m;
import p090e3.C6712a;
import p090e3.C6713b;
import p252u2.C8132m;
import p260v0.C8184a;

/* renamed from: u2.c */
public final class C8121c implements C8119a, C3473a {

    /* renamed from: m */
    public static final String f17729m = C3422l.m8214e("Processor");

    /* renamed from: b */
    public PowerManager.WakeLock f17730b;

    /* renamed from: c */
    public Context f17731c;

    /* renamed from: d */
    public C3373b f17732d;

    /* renamed from: e */
    public C6712a f17733e;

    /* renamed from: f */
    public WorkDatabase f17734f;

    /* renamed from: g */
    public HashMap f17735g = new HashMap();

    /* renamed from: h */
    public HashMap f17736h = new HashMap();

    /* renamed from: i */
    public List<C8123d> f17737i;

    /* renamed from: j */
    public HashSet f17738j;

    /* renamed from: k */
    public final ArrayList f17739k;

    /* renamed from: l */
    public final Object f17740l;

    /* renamed from: u2.c$a */
    public static class C8122a implements Runnable {

        /* renamed from: b */
        public C8119a f17741b;

        /* renamed from: c */
        public String f17742c;

        /* renamed from: d */
        public C16388l<Boolean> f17743d;

        public C8122a(C8119a aVar, String str, C3419a aVar2) {
            this.f17741b = aVar;
            this.f17742c = str;
            this.f17743d = aVar2;
        }

        public final void run() {
            boolean z;
            try {
                z = this.f17743d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f17741b.onExecuted(this.f17742c, z);
        }
    }

    public C8121c(Context context, C3373b bVar, C6713b bVar2, WorkDatabase workDatabase, List list) {
        this.f17731c = context;
        this.f17732d = bVar;
        this.f17733e = bVar2;
        this.f17734f = workDatabase;
        this.f17737i = list;
        this.f17738j = new HashSet();
        this.f17739k = new ArrayList();
        this.f17730b = null;
        this.f17740l = new Object();
    }

    /* renamed from: b */
    public static boolean m16327b(String str, C8132m mVar) {
        boolean z;
        if (mVar != null) {
            mVar.f17794s = true;
            mVar.mo20740i();
            C16388l<ListenableWorker.C3367a> lVar = mVar.f17793r;
            if (lVar != null) {
                z = lVar.isDone();
                mVar.f17793r.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = mVar.f17781f;
            if (listenableWorker == null || z) {
                C3422l.m8213c().mo12926a(C8132m.f17776t, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{mVar.f17780e}), new Throwable[0]);
            } else {
                listenableWorker.mo12823g();
            }
            C3422l.m8213c().mo12926a(f17729m, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C3422l.m8213c().mo12926a(f17729m, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public final void mo20714a(C8119a aVar) {
        synchronized (this.f17740l) {
            this.f17739k.add(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo20715c(String str) {
        boolean z;
        synchronized (this.f17740l) {
            if (!this.f17736h.containsKey(str)) {
                if (!this.f17735g.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public final void mo20716d(String str, C3382f fVar) {
        synchronized (this.f17740l) {
            C3422l.m8213c().mo12928d(f17729m, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C8132m mVar = (C8132m) this.f17736h.remove(str);
            if (mVar != null) {
                if (this.f17730b == null) {
                    PowerManager.WakeLock a = C6641m.m13020a(this.f17731c, "ProcessorForegroundLck");
                    this.f17730b = a;
                    a.acquire();
                }
                this.f17735g.put(str, mVar);
                Intent c = C3409a.m8171c(this.f17731c, str, fVar);
                Context context = this.f17731c;
                Object obj = C8184a.f17966a;
                C8184a.C8190f.m16474a(context, c);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo20717e(String str, WorkerParameters.C3371a aVar) {
        synchronized (this.f17740l) {
            if (mo20715c(str)) {
                C3422l.m8213c().mo12926a(f17729m, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C8132m.C8133a aVar2 = new C8132m.C8133a(this.f17731c, this.f17732d, this.f17733e, this, this.f17734f, str);
            aVar2.f17801g = this.f17737i;
            if (aVar != null) {
                aVar2.f17802h = aVar;
            }
            C8132m mVar = new C8132m(aVar2);
            C3419a<Boolean> aVar3 = mVar.f17792q;
            aVar3.mo7981e(new C8122a(this, str, aVar3), ((C6713b) this.f17733e).f14805c);
            this.f17736h.put(str, mVar);
            ((C6713b) this.f17733e).f14803a.execute(mVar);
            C3422l.m8213c().mo12926a(f17729m, String.format("%s: processing %s", new Object[]{C8121c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: f */
    public final void mo20718f() {
        synchronized (this.f17740l) {
            if (!(!this.f17735g.isEmpty())) {
                Context context = this.f17731c;
                String str = C3409a.f7972l;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f17731c.startService(intent);
                } catch (Throwable th) {
                    C3422l.m8213c().mo12927b(f17729m, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f17730b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f17730b = null;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo20719g(String str) {
        boolean b;
        synchronized (this.f17740l) {
            C3422l.m8213c().mo12926a(f17729m, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            b = m16327b(str, (C8132m) this.f17735g.remove(str));
        }
        return b;
    }

    /* renamed from: h */
    public final boolean mo20720h(String str) {
        boolean b;
        synchronized (this.f17740l) {
            C3422l.m8213c().mo12926a(f17729m, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            b = m16327b(str, (C8132m) this.f17736h.remove(str));
        }
        return b;
    }

    public final void onExecuted(String str, boolean z) {
        synchronized (this.f17740l) {
            this.f17736h.remove(str);
            C3422l.m8213c().mo12926a(f17729m, String.format("%s %s executed; reschedule = %s", new Object[]{C8121c.class.getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            Iterator it = this.f17739k.iterator();
            while (it.hasNext()) {
                ((C8119a) it.next()).onExecuted(str, z);
            }
        }
    }
}
