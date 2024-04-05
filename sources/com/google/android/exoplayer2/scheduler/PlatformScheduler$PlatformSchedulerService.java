package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.offline.DownloadService;
import p003a2.C0023f;
import p513bj.C14049b0;

public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int notMetRequirements = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).getNotMetRequirements(this);
        if (notMetRequirements == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            if (C14049b0.f30913a >= 26) {
                startForegroundService(intent);
                return false;
            }
            startService(intent);
            return false;
        }
        C0023f.m112m(33, "Requirements not met: ", notMetRequirements, "PlatformScheduler");
        jobFinished(jobParameters, true);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
