package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.C3422l;
import java.util.HashMap;
import java.util.Map;
import p252u2.C8119a;
import p252u2.C8121c;
import p252u2.C8129j;

public class SystemJobService extends JobService implements C8119a {
    private static final String TAG = C3422l.m8214e("SystemJobService");
    private final Map<String, JobParameters> mJobParameters = new HashMap();
    private C8129j mWorkManagerImpl;

    private static String getWorkSpecIdFromJobParameters(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C8129j e = C8129j.m16345e(getApplicationContext());
            this.mWorkManagerImpl = e;
            e.f17766f.mo20714a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C3422l.m8213c().mo12929f(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C8129j jVar = this.mWorkManagerImpl;
        if (jVar != null) {
            C8121c cVar = jVar.f17766f;
            synchronized (cVar.f17740l) {
                cVar.f17739k.remove(this);
            }
        }
    }

    public void onExecuted(String str, boolean z) {
        JobParameters remove;
        C3422l.m8213c().mo12926a(TAG, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = new androidx.work.WorkerParameters.C3371a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r3.f7870b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r3.f7869a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r2 < 28) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r8.mWorkManagerImpl.mo20728i(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            u2.j r0 = r8.mWorkManagerImpl
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r3 = TAG
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.mo12926a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = getWorkSpecIdFromJobParameters(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            androidx.work.l r9 = androidx.work.C3422l.m8213c()
            java.lang.String r0 = TAG
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.mo12927b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.mJobParameters
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.mJobParameters     // Catch:{ all -> 0x00a0 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x0051
            androidx.work.l r9 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a0 }
            r1[r2] = r0     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a0 }
            r9.mo12926a(r4, r0, r1)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x0051:
            androidx.work.l r4 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a0 }
            r7[r2] = r0     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a0 }
            r4.mo12926a(r5, r6, r2)     // Catch:{ all -> 0x00a0 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.mJobParameters     // Catch:{ all -> 0x00a0 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x0083
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f7870b = r4
        L_0x0083:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x0093
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f7869a = r4
        L_0x0093:
            r4 = 28
            if (r2 < r4) goto L_0x009a
            r9.getNetwork()
        L_0x009a:
            u2.j r9 = r8.mWorkManagerImpl
            r9.mo20728i(r0, r3)
            return r1
        L_0x00a0:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.mWorkManagerImpl == null) {
            C3422l.m8213c().mo12926a(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String workSpecIdFromJobParameters = getWorkSpecIdFromJobParameters(jobParameters);
        if (TextUtils.isEmpty(workSpecIdFromJobParameters)) {
            C3422l.m8213c().mo12927b(TAG, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C3422l.m8213c().mo12926a(TAG, String.format("onStopJob for %s", new Object[]{workSpecIdFromJobParameters}), new Throwable[0]);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(workSpecIdFromJobParameters);
        }
        this.mWorkManagerImpl.mo20729j(workSpecIdFromJobParameters);
        C8121c cVar = this.mWorkManagerImpl.f17766f;
        synchronized (cVar.f17740l) {
            contains = cVar.f17738j.contains(workSpecIdFromJobParameters);
        }
        return !contains;
    }
}
