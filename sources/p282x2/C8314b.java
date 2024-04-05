package p282x2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.C3376c;
import androidx.work.C3378d;
import androidx.work.C3422l;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p002a1.C0006a;
import p034c3.C4374d;
import p034c3.C4376f;
import p034c3.C4378g;
import p034c3.C4380i;
import p034c3.C4391o;
import p034c3.C4394q;
import p079d3.C6633f;
import p252u2.C8123d;
import p252u2.C8129j;
import p282x2.C8312a;

/* renamed from: x2.b */
public final class C8314b implements C8123d {

    /* renamed from: f */
    public static final String f18250f = C3422l.m8214e("SystemJobScheduler");

    /* renamed from: b */
    public final Context f18251b;

    /* renamed from: c */
    public final JobScheduler f18252c;

    /* renamed from: d */
    public final C8129j f18253d;

    /* renamed from: e */
    public final C8312a f18254e;

    public C8314b(Context context, C8129j jVar) {
        C8312a aVar = new C8312a(context);
        this.f18251b = context;
        this.f18253d = jVar;
        this.f18252c = (JobScheduler) context.getSystemService("jobscheduler");
        this.f18254e = aVar;
    }

    /* renamed from: b */
    public static void m16605b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C3422l.m8213c().mo12927b(f18250f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: e */
    public static ArrayList m16606e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C3422l.m8213c().mo12927b(f18250f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0016 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20722a(java.lang.String r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f18251b
            android.app.job.JobScheduler r1 = r7.f18252c
            java.util.ArrayList r0 = m16606e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0049
        L_0x000c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 2
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r0.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L_0x0035
            boolean r6 = r5.containsKey(r4)     // Catch:{ NullPointerException -> 0x0035 }
            if (r6 == 0) goto L_0x0035
            java.lang.String r4 = r5.getString(r4)     // Catch:{ NullPointerException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0016
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L_0x0016
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0078
            java.util.Iterator r0 = r1.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.app.job.JobScheduler r2 = r7.f18252c
            m16605b(r2, r1)
            goto L_0x0055
        L_0x006b:
            u2.j r0 = r7.f18253d
            androidx.work.impl.WorkDatabase r0 = r0.f17763c
            c3.h r0 = r0.mo12854q()
            c3.i r0 = (p034c3.C4380i) r0
            r0.mo14314c(r8)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p282x2.C8314b.mo20722a(java.lang.String):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo20723c(C4391o... oVarArr) {
        int i;
        int i2;
        C4391o[] oVarArr2 = oVarArr;
        WorkDatabase workDatabase = this.f18253d.f17763c;
        int length = oVarArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            C4391o oVar = oVarArr2[i4];
            workDatabase.mo11974c();
            try {
                C4391o i5 = ((C4394q) workDatabase.mo12857t()).mo14333i(oVar.f9644a);
                if (i5 == null) {
                    C3422l.m8213c().mo12929f(f18250f, "Skipping scheduling " + oVar.f9644a + " because it's no longer in the DB", new Throwable[i3]);
                    workDatabase.mo11984m();
                } else if (i5.f9645b != WorkInfo$State.ENQUEUED) {
                    C3422l.m8213c().mo12929f(f18250f, "Skipping scheduling " + oVar.f9644a + " because it is no longer enqueued", new Throwable[i3]);
                    workDatabase.mo11984m();
                } else {
                    C4378g a = ((C4380i) workDatabase.mo12854q()).mo14312a(oVar.f9644a);
                    if (a != null) {
                        i2 = a.f9632b;
                        i = i4;
                    } else {
                        this.f18253d.f17762b.getClass();
                        int i6 = this.f18253d.f17762b.f7879g;
                        synchronized (C6633f.class) {
                            workDatabase.mo11974c();
                            try {
                                Long a2 = ((C4376f) workDatabase.mo12853p()).mo14308a("next_job_scheduler_id");
                                int intValue = a2 != null ? a2.intValue() : i3;
                                i = i4;
                                ((C4376f) workDatabase.mo12853p()).mo14309b(new C4374d("next_job_scheduler_id", (long) (intValue == Integer.MAX_VALUE ? i3 : intValue + 1)));
                                workDatabase.mo11984m();
                                if (intValue >= 0) {
                                    if (intValue <= i6) {
                                        i2 = intValue;
                                    }
                                }
                                ((C4376f) workDatabase.mo12853p()).mo14309b(new C4374d("next_job_scheduler_id", (long) 1));
                                i2 = 0;
                            } finally {
                                workDatabase.mo11980i();
                            }
                        }
                    }
                    if (a == null) {
                        ((C4380i) this.f18253d.f17763c.mo12854q()).mo14313b(new C4378g(oVar.f9644a, i2));
                    }
                    mo20908f(oVar, i2);
                    workDatabase.mo11984m();
                    workDatabase.mo11980i();
                    i4 = i + 1;
                    i3 = 0;
                }
                i = i4;
                workDatabase.mo11980i();
                i4 = i + 1;
                i3 = 0;
            } catch (Throwable th) {
                workDatabase.mo11980i();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo20724d() {
        return true;
    }

    /* renamed from: f */
    public final void mo20908f(C4391o oVar, int i) {
        int i2;
        C4391o oVar2 = oVar;
        C8312a aVar = this.f18254e;
        aVar.getClass();
        C3376c cVar = oVar2.f9653j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar2.f9644a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.mo14319c());
        JobInfo.Builder extras = new JobInfo.Builder(i, aVar.f18248a).setRequiresCharging(cVar.f7883b).setRequiresDeviceIdle(cVar.f7884c).setExtras(persistableBundle);
        NetworkType networkType = cVar.f7882a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i4 = C8312a.C8313a.f18249a[networkType.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i2 = 4;
                        if (i4 == 4) {
                            i2 = 3;
                        } else if (i4 != 5) {
                            C3422l.m8213c().mo12926a(C8312a.f18247b, String.format("API version too low. Cannot convert network type value %s", new Object[]{networkType}), new Throwable[0]);
                        }
                    } else {
                        i2 = 2;
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f7884c) {
            extras.setBackoffCriteria(oVar2.f9656m, oVar2.f9655l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = Math.max(oVar.mo14317a() - System.currentTimeMillis(), 0);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!oVar2.f9660q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f7889h.f7894a.size() > 0) {
            Iterator it = cVar.f7889h.f7894a.iterator();
            while (it.hasNext()) {
                C3378d.C3379a aVar2 = (C3378d.C3379a) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar2.f7895a, aVar2.f7896b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f7887f);
            extras.setTriggerContentMaxDelay(cVar.f7888g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(cVar.f7885d);
        extras.setRequiresStorageNotLow(cVar.f7886e);
        boolean z = oVar2.f9654k > 0;
        boolean z2 = max > 0;
        if (C0006a.m80a() && oVar2.f9660q && !z && !z2) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        C3422l c = C3422l.m8213c();
        String str = f18250f;
        c.mo12926a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{oVar2.f9644a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f18252c.schedule(build) == 0) {
                C3422l.m8213c().mo12929f(str, String.format("Unable to schedule work ID %s", new Object[]{oVar2.f9644a}), new Throwable[0]);
                if (oVar2.f9660q && oVar2.f9661r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    oVar2.f9660q = false;
                    C3422l.m8213c().mo12926a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{oVar2.f9644a}), new Throwable[0]);
                    mo20908f(oVar, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList e2 = m16606e(this.f18251b, this.f18252c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(e2 != null ? e2.size() : 0), Integer.valueOf(((C4394q) this.f18253d.f17763c.mo12857t()).mo14329e().size()), Integer.valueOf(this.f18253d.f17762b.f7880h)});
            C3422l.m8213c().mo12927b(f18250f, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C3422l.m8213c().mo12927b(f18250f, String.format("Unable to schedule %s", new Object[]{oVar2}), th);
        }
    }
}
