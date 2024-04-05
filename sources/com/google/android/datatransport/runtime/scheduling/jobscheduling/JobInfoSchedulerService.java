package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.C6611t;
import p114g4.C6868h;
import p144ih.C7008a;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C6611t.m12980b(getApplicationContext());
        C6556p.C6557a priority = C6556p.builder().setBackendName(string).setPriority(C7008a.m13569b(i));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        C6573i iVar = C6611t.m12979a().f14593d;
        iVar.f14523e.execute(new C6567c(iVar, priority.build(), i2, new C6868h(1, this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
