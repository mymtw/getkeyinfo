package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import kotlin.jvm.internal.C19388s;
import p144ih.C7008a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
public final class C6566b implements C6577m {

    /* renamed from: a */
    public final Context f14498a;

    /* renamed from: b */
    public final C6580b f14499b;

    /* renamed from: c */
    public final SchedulerConfig f14500c;

    public C6566b(Context context, C6580b bVar, SchedulerConfig schedulerConfig) {
        this.f14498a = context;
        this.f14499b = bVar;
        this.f14500c = schedulerConfig;
    }

    /* renamed from: a */
    public final void mo18752a(C6556p pVar, int i) {
        mo18753b(pVar, i, false);
    }

    /* renamed from: b */
    public final void mo18753b(C6556p pVar, int i, boolean z) {
        boolean z2;
        C6556p pVar2 = pVar;
        int i2 = i;
        ComponentName componentName = new ComponentName(this.f14498a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f14498a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f14498a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C7008a.m13568a(pVar.getPriority())).array());
        if (pVar.getExtras() != null) {
            adler32.update(pVar.getExtras());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                C19388s.m32845S(pVar2, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long N = this.f14499b.mo18779N(pVar2);
        long j = N;
        JobInfo.Builder configureJob = this.f14500c.configureJob(new JobInfo.Builder(value, componentName), pVar.getPriority(), N, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", pVar.getBackendName());
        persistableBundle.putInt("priority", C7008a.m13568a(pVar.getPriority()));
        if (pVar.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.getExtras(), 0));
        }
        configureJob.setExtras(persistableBundle);
        long j2 = j;
        Log.d(C19388s.m32864h0("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{pVar2, Integer.valueOf(value), Long.valueOf(this.f14500c.getScheduleDelay(pVar.getPriority(), j2, i2)), Long.valueOf(j2), Integer.valueOf(i)}));
        jobScheduler.schedule(configureJob.build());
    }
}
