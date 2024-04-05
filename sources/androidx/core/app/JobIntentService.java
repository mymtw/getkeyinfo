package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.support.p013v4.media.C0069a;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public static final HashMap<ComponentName, C2259g> sClassWorkEnqueuer = new HashMap<>();
    public static final Object sLock = new Object();
    public final ArrayList<C2254c> mCompatQueue = null;
    public C2259g mCompatWorkEnqueuer;
    public C2252a mCurProcessor;
    public boolean mDestroyed = false;
    public boolean mInterruptIfStopped = false;
    public C2253b mJobImpl;
    public boolean mStopped = false;

    /* renamed from: androidx.core.app.JobIntentService$a */
    public final class C2252a extends AsyncTask<Void, Void, Void> {
        public C2252a() {
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                C2255d dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.complete();
            }
        }

        public final void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }

        public final void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    public interface C2253b {
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    public final class C2254c implements C2255d {

        /* renamed from: a */
        public final Intent f5476a;

        /* renamed from: b */
        public final int f5477b;

        public C2254c(Intent intent, int i) {
            this.f5476a = intent;
            this.f5477b = i;
        }

        public final void complete() {
            JobIntentService.this.stopSelf(this.f5477b);
        }

        public final Intent getIntent() {
            return this.f5476a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    public interface C2255d {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    public static final class C2256e extends JobServiceEngine implements C2253b {

        /* renamed from: a */
        public final JobIntentService f5479a;

        /* renamed from: b */
        public final Object f5480b = new Object();

        /* renamed from: c */
        public JobParameters f5481c;

        /* renamed from: androidx.core.app.JobIntentService$e$a */
        public final class C2257a implements C2255d {

            /* renamed from: a */
            public final JobWorkItem f5482a;

            public C2257a(JobWorkItem jobWorkItem) {
                this.f5482a = jobWorkItem;
            }

            public final void complete() {
                synchronized (C2256e.this.f5480b) {
                    JobParameters jobParameters = C2256e.this.f5481c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f5482a);
                    }
                }
            }

            public final Intent getIntent() {
                return this.f5482a.getIntent();
            }
        }

        public C2256e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f5479a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f5481c = jobParameters;
            this.f5479a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f5479a.doStopCurrentWork();
            synchronized (this.f5480b) {
                this.f5481c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    public static final class C2258f extends C2259g {

        /* renamed from: c */
        public final JobInfo f5484c;

        /* renamed from: d */
        public final JobScheduler f5485d;

        public C2258f(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo8681b(i);
            this.f5484c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
            this.f5485d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        public final void mo8680a(Intent intent) {
            this.f5485d.enqueue(this.f5484c, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    public static abstract class C2259g {

        /* renamed from: a */
        public boolean f5486a;

        /* renamed from: b */
        public int f5487b;

        public C2259g(ComponentName componentName) {
        }

        /* renamed from: a */
        public abstract void mo8680a(Intent intent);

        /* renamed from: b */
        public final void mo8681b(int i) {
            if (!this.f5486a) {
                this.f5486a = true;
                this.f5487b = i;
            } else if (this.f5487b != i) {
                StringBuilder h = C0069a.m177h("Given job ID ", i, " is different than previous ");
                h.append(this.f5487b);
                throw new IllegalArgumentException(h.toString());
            }
        }

        /* renamed from: c */
        public void mo8682c() {
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static C2259g getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, C2259g> hashMap = sClassWorkEnqueuer;
        C2259g gVar = hashMap.get(componentName);
        if (gVar != null) {
            return gVar;
        }
        if (z) {
            C2258f fVar = new C2258f(context, componentName, i);
            hashMap.put(componentName, fVar);
            return fVar;
        }
        throw new IllegalArgumentException("Can't be here without a job id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r3.getIntent().setExtrasClassLoader(r0.f5479a.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return new androidx.core.app.JobIntentService.C2256e.C2257a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.core.app.JobIntentService.C2255d dequeueWork() {
        /*
            r4 = this;
            androidx.core.app.JobIntentService$b r0 = r4.mJobImpl
            r1 = 0
            if (r0 == 0) goto L_0x002d
            androidx.core.app.JobIntentService$e r0 = (androidx.core.app.JobIntentService.C2256e) r0
            java.lang.Object r2 = r0.f5480b
            monitor-enter(r2)
            android.app.job.JobParameters r3 = r0.f5481c     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0010
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            goto L_0x0029
        L_0x0010:
            android.app.job.JobWorkItem r3 = r3.dequeueWork()     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0029
            android.content.Intent r1 = r3.getIntent()
            androidx.core.app.JobIntentService r2 = r0.f5479a
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setExtrasClassLoader(r2)
            androidx.core.app.JobIntentService$e$a r1 = new androidx.core.app.JobIntentService$e$a
            r1.<init>(r3)
        L_0x0029:
            return r1
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            java.util.ArrayList<androidx.core.app.JobIntentService$c> r0 = r4.mCompatQueue
            monitor-enter(r0)
            java.util.ArrayList<androidx.core.app.JobIntentService$c> r2 = r4.mCompatQueue     // Catch:{ all -> 0x0045 }
            int r2 = r2.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0043
            java.util.ArrayList<androidx.core.app.JobIntentService$c> r1 = r4.mCompatQueue     // Catch:{ all -> 0x0045 }
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0045 }
            androidx.core.app.JobIntentService$d r1 = (androidx.core.app.JobIntentService.C2255d) r1     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.dequeueWork():androidx.core.app.JobIntentService$d");
    }

    public boolean doStopCurrentWork() {
        C2252a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C2252a();
            C2259g gVar = this.mCompatWorkEnqueuer;
            if (gVar != null && z) {
                gVar.getClass();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        C2253b bVar = this.mJobImpl;
        if (bVar != null) {
            return ((C2256e) bVar).getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new C2256e(this);
        this.mCompatWorkEnqueuer = null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C2254c> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo8682c();
        synchronized (this.mCompatQueue) {
            ArrayList<C2254c> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C2254c(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<C2254c> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<C2254c> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.getClass();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C2259g workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo8681b(i);
                workEnqueuer.mo8680a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
