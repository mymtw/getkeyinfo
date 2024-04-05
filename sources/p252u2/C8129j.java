package p252u2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.room.C3259y;
import androidx.room.RoomDatabase;
import androidx.work.C3373b;
import androidx.work.C3422l;
import androidx.work.C3429n;
import androidx.work.C3437q;
import androidx.work.C3438r;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.impl.C3387a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p034c3.C4394q;
import p079d3.C6629b;
import p079d3.C6634g;
import p079d3.C6635h;
import p079d3.C6637j;
import p079d3.C6639k;
import p079d3.C6640l;
import p090e3.C6712a;
import p090e3.C6713b;
import p112g2.C6838e;
import p262v2.C8199c;
import p282x2.C8314b;

/* renamed from: u2.j */
public final class C8129j extends C3437q {

    /* renamed from: j */
    public static C8129j f17758j = null;

    /* renamed from: k */
    public static C8129j f17759k = null;

    /* renamed from: l */
    public static final Object f17760l = new Object();

    /* renamed from: a */
    public Context f17761a;

    /* renamed from: b */
    public C3373b f17762b;

    /* renamed from: c */
    public WorkDatabase f17763c;

    /* renamed from: d */
    public C6712a f17764d;

    /* renamed from: e */
    public List<C8123d> f17765e;

    /* renamed from: f */
    public C8121c f17766f;

    /* renamed from: g */
    public C6635h f17767g;

    /* renamed from: h */
    public boolean f17768h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f17769i;

    static {
        C3422l.m8214e("WorkManagerImpl");
    }

    /* JADX INFO: finally extract failed */
    public C8129j(Context context, C3373b bVar, C6713b bVar2) {
        RoomDatabase.C3213a<WorkDatabase> aVar;
        C3373b bVar3 = bVar;
        C6713b bVar4 = bVar2;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        C6637j jVar = bVar4.f14803a;
        int i = WorkDatabase.f7906n;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = new RoomDatabase.C3213a<>(applicationContext, cls, (String) null);
            aVar.f7479h = true;
        } else {
            String str = C8128i.f17756a;
            aVar = C3259y.m7913a(applicationContext, cls, "androidx.work.workdb");
            aVar.f7478g = new C8126g(applicationContext);
        }
        aVar.f7476e = jVar;
        C8127h hVar = new C8127h();
        if (aVar.f7475d == null) {
            aVar.f7475d = new ArrayList<>();
        }
        aVar.f7475d.add(hVar);
        aVar.mo11986a(C3387a.f7916a);
        aVar.mo11986a(new C3387a.C3395h(applicationContext, 2, 3));
        aVar.mo11986a(C3387a.f7917b);
        aVar.mo11986a(C3387a.f7918c);
        aVar.mo11986a(new C3387a.C3395h(applicationContext, 5, 6));
        aVar.mo11986a(C3387a.f7919d);
        aVar.mo11986a(C3387a.f7920e);
        aVar.mo11986a(C3387a.f7921f);
        aVar.mo11986a(new C3387a.C3396i(applicationContext));
        aVar.mo11986a(new C3387a.C3395h(applicationContext, 10, 11));
        aVar.mo11986a(C3387a.f7922g);
        aVar.f7481j = false;
        aVar.f7482k = true;
        WorkDatabase b = aVar.mo11987b();
        Context applicationContext2 = context.getApplicationContext();
        C3422l.C3423a aVar2 = new C3422l.C3423a(bVar3.f7878f);
        synchronized (C3422l.class) {
            try {
                C3422l.f8027a = aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        String str2 = C8124e.f17744a;
        C8314b bVar5 = new C8314b(applicationContext2, this);
        C6634g.m13017a(applicationContext2, SystemJobService.class, true);
        C3422l.m8213c().mo12926a(C8124e.f17744a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<C8123d> asList = Arrays.asList(new C8123d[]{bVar5, new C8199c(applicationContext2, bVar, bVar4, this)});
        C8121c cVar = new C8121c(context, bVar, bVar2, b, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f17761a = applicationContext3;
        this.f17762b = bVar3;
        this.f17764d = bVar4;
        this.f17763c = b;
        this.f17765e = asList;
        this.f17766f = cVar;
        this.f17767g = new C6635h(b);
        this.f17768h = false;
        if (!applicationContext3.isDeviceProtectedStorage()) {
            ((C6713b) this.f17764d).mo18901a(new ForceStopRunnable(applicationContext3, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static p252u2.C8129j m16345e(android.content.Context r2) {
        /*
            java.lang.Object r0 = f17760l
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            u2.j r1 = f17758j     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            u2.j r1 = f17759k     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof androidx.work.C3373b.C3375b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.b$b r1 = (androidx.work.C3373b.C3375b) r1     // Catch:{ all -> 0x0035 }
            androidx.work.b r1 = r1.mo12836a()     // Catch:{ all -> 0x0035 }
            m16346f(r2, r1)     // Catch:{ all -> 0x0035 }
            u2.j r1 = m16345e(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: p252u2.C8129j.m16345e(android.content.Context):u2.j");
    }

    /* renamed from: f */
    public static void m16346f(Context context, C3373b bVar) {
        synchronized (f17760l) {
            C8129j jVar = f17758j;
            if (jVar != null) {
                if (f17759k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (jVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f17759k == null) {
                    f17759k = new C8129j(applicationContext, bVar, new C6713b(bVar.f7874b));
                }
                f17758j = f17759k;
            }
        }
    }

    /* renamed from: a */
    public final C8125f mo12960a(String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        if (!list.isEmpty()) {
            return new C8125f(this, str, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    /* renamed from: b */
    public final C8120b mo12961b(String str) {
        C6629b bVar = new C6629b(this, str);
        ((C6713b) this.f17764d).mo18901a(bVar);
        return bVar.f14634b;
    }

    /* renamed from: c */
    public final C3429n mo12962c(List<? extends C3438r> list) {
        if (!list.isEmpty()) {
            return new C8125f(this, (String) null, ExistingWorkPolicy.KEEP, list, 0).mo20725M();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: d */
    public final C3429n mo12963d(ExistingWorkPolicy existingWorkPolicy, List list) {
        return new C8125f(this, "upload_ad_impressions", existingWorkPolicy, list).mo20725M();
    }

    /* renamed from: g */
    public final void mo20726g() {
        synchronized (f17760l) {
            this.f17768h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f17769i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f17769i = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo20727h() {
        ArrayList e;
        Context context = this.f17761a;
        String str = C8314b.f18250f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (e = C8314b.m16606e(context, jobScheduler)) == null || e.isEmpty())) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                C8314b.m16605b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C4394q qVar = (C4394q) this.f17763c.mo12857t();
        qVar.f9664a.mo11973b();
        C6838e a = qVar.f9672i.mo12028a();
        qVar.f9664a.mo11974c();
        try {
            a.mo18972s();
            qVar.f9664a.mo11984m();
            qVar.f9664a.mo11980i();
            qVar.f9672i.mo12030c(a);
            C8124e.m16338a(this.f17762b, this.f17763c, this.f17765e);
        } catch (Throwable th) {
            qVar.f9664a.mo11980i();
            qVar.f9672i.mo12030c(a);
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo20728i(String str, WorkerParameters.C3371a aVar) {
        ((C6713b) this.f17764d).mo18901a(new C6639k(this, str, aVar));
    }

    /* renamed from: j */
    public final void mo20729j(String str) {
        ((C6713b) this.f17764d).mo18901a(new C6640l(this, str, false));
    }
}
