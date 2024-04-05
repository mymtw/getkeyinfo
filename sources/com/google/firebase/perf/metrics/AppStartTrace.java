package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.C16676i;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.C16625a;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p616ln.C18206d;
import p616ln.C18208f;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    private static final int CORE_POOL_SIZE = 0;
    private static final long MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1);
    private static final int MAX_POOL_SIZE = 1;
    private static ExecutorService executorService;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private Timer appStartTime = null;
    private final C16625a clock;
    private boolean isRegisteredForLifecycleCallbacks = false;
    /* access modifiers changed from: private */
    public boolean isStartedFromBackground = false;
    private boolean isTooLateToInitUI = false;
    private WeakReference<Activity> launchActivity;
    /* access modifiers changed from: private */
    public Timer onCreateTime = null;
    private Timer onResumeTime = null;
    private Timer onStartTime = null;
    private PerfSession startSession;
    private final C18208f transportManager;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$a */
    public static class C16613a implements Runnable {

        /* renamed from: b */
        public final AppStartTrace f36853b;

        public C16613a(AppStartTrace appStartTrace) {
            this.f36853b = appStartTrace;
        }

        public final void run() {
            if (this.f36853b.onCreateTime == null) {
                boolean unused = this.f36853b.isStartedFromBackground = true;
            }
        }
    }

    public AppStartTrace(C18208f fVar, C16625a aVar, ExecutorService executorService2) {
        this.transportManager = fVar;
        this.clock = aVar;
        executorService = executorService2;
    }

    public static AppStartTrace getInstance() {
        if (instance != null) {
            return instance;
        }
        return getInstance(C18208f.f39882t, new C16625a());
    }

    /* access modifiers changed from: private */
    public void logAppStartTrace() {
        C16676i.C16678b R = C16676i.m27636R();
        R.mo59424y(Constants$TraceNames.APP_START_TRACE_NAME.toString());
        R.mo59422w(getappStartTime().getMicros());
        R.mo59423x(getappStartTime().getDurationMicros(this.onResumeTime));
        ArrayList arrayList = new ArrayList(3);
        C16676i.C16678b R2 = C16676i.m27636R();
        R2.mo59424y(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
        R2.mo59422w(getappStartTime().getMicros());
        R2.mo59423x(getappStartTime().getDurationMicros(this.onCreateTime));
        arrayList.add((C16676i) R2.mo59759s());
        C16676i.C16678b R3 = C16676i.m27636R();
        R3.mo59424y(Constants$TraceNames.ON_START_TRACE_NAME.toString());
        R3.mo59422w(this.onCreateTime.getMicros());
        R3.mo59423x(this.onCreateTime.getDurationMicros(this.onStartTime));
        arrayList.add((C16676i) R3.mo59759s());
        C16676i.C16678b R4 = C16676i.m27636R();
        R4.mo59424y(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
        R4.mo59422w(this.onStartTime.getMicros());
        R4.mo59423x(this.onStartTime.getDurationMicros(this.onResumeTime));
        arrayList.add((C16676i) R4.mo59759s());
        R.mo59761u();
        C16676i.m27629C((C16676i) R.f37158c, arrayList);
        C16672h build = this.startSession.build();
        R.mo59761u();
        C16676i.m27631E((C16676i) R.f37158c, build);
        C18208f fVar = this.transportManager;
        fVar.f39891j.execute(new C18206d(fVar, (C16676i) R.mo59759s(), ApplicationProcessState.FOREGROUND_BACKGROUND));
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @VisibleForTesting
    public Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    @VisibleForTesting
    public Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    @VisibleForTesting
    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    @VisibleForTesting
    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    @VisibleForTesting
    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    @VisibleForTesting
    public Timer getappStartTime() {
        return this.appStartTime;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r4 = r2.isStartedFromBackground     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            com.google.firebase.perf.util.Timer r4 = r2.onCreateTime     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r4.<init>(r3)     // Catch:{ all -> 0x0034 }
            r2.launchActivity = r4     // Catch:{ all -> 0x0034 }
            com.google.firebase.perf.util.a r3 = r2.clock     // Catch:{ all -> 0x0034 }
            r3.getClass()     // Catch:{ all -> 0x0034 }
            com.google.firebase.perf.util.Timer r3 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x0034 }
            r3.<init>()     // Catch:{ all -> 0x0034 }
            r2.onCreateTime = r3     // Catch:{ all -> 0x0034 }
            com.google.firebase.perf.util.Timer r3 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x0034 }
            com.google.firebase.perf.util.Timer r4 = r2.onCreateTime     // Catch:{ all -> 0x0034 }
            long r3 = r3.getDurationMicros(r4)     // Catch:{ all -> 0x0034 }
            long r0 = MAX_LATENCY_BEFORE_UI_INIT     // Catch:{ all -> 0x0034 }
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0030
            r3 = 1
            r2.isTooLateToInitUI = r3     // Catch:{ all -> 0x0034 }
        L_0x0030:
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isStartedFromBackground     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007a
            com.google.firebase.perf.util.Timer r0 = r4.onResumeTime     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007a
            boolean r0 = r4.isTooLateToInitUI     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x000e
            goto L_0x007a
        L_0x000e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x007c }
            r0.<init>(r5)     // Catch:{ all -> 0x007c }
            r4.appStartActivity = r0     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.util.a r0 = r4.clock     // Catch:{ all -> 0x007c }
            r0.getClass()     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.util.Timer r0 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x007c }
            r0.<init>()     // Catch:{ all -> 0x007c }
            r4.onResumeTime = r0     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.util.Timer r0 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x007c }
            r4.appStartTime = r0     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.session.PerfSession r0 = r0.perfSession()     // Catch:{ all -> 0x007c }
            r4.startSession = r0     // Catch:{ all -> 0x007c }
            fn.a r0 = p568fn.C17781a.m29823d()     // Catch:{ all -> 0x007c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r1.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "onResume(): "
            r1.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x007c }
            r1.append(r5)     // Catch:{ all -> 0x007c }
            java.lang.String r5 = ": "
            r1.append(r5)     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.util.Timer r5 = r4.appStartTime     // Catch:{ all -> 0x007c }
            com.google.firebase.perf.util.Timer r2 = r4.onResumeTime     // Catch:{ all -> 0x007c }
            long r2 = r5.getDurationMicros(r2)     // Catch:{ all -> 0x007c }
            r1.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.String r5 = " microseconds"
            r1.append(r5)     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x007c }
            r0.mo69014a(r5)     // Catch:{ all -> 0x007c }
            java.util.concurrent.ExecutorService r5 = executorService     // Catch:{ all -> 0x007c }
            androidx.core.widget.c r0 = new androidx.core.widget.c     // Catch:{ all -> 0x007c }
            r1 = 2
            r0.<init>(r4, r1)     // Catch:{ all -> 0x007c }
            r5.execute(r0)     // Catch:{ all -> 0x007c }
            boolean r5 = r4.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0078
            r4.unregisterActivityLifecycleCallbacks()     // Catch:{ all -> 0x007c }
        L_0x0078:
            monitor-exit(r4)
            return
        L_0x007a:
            monitor-exit(r4)
            return
        L_0x007c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.isStartedFromBackground     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            com.google.firebase.perf.util.Timer r1 = r0.onStartTime     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            boolean r1 = r0.isTooLateToInitUI     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x000e
            goto L_0x001c
        L_0x000e:
            com.google.firebase.perf.util.a r1 = r0.clock     // Catch:{ all -> 0x001e }
            r1.getClass()     // Catch:{ all -> 0x001e }
            com.google.firebase.perf.util.Timer r1 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            r0.onStartTime = r1     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)
            return
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public synchronized void onActivityStopped(Activity activity) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerActivityLifecycleCallbacks(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001c }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            r0 = r2
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x001c }
            r0.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x001c }
            r0 = 1
            r1.isRegisteredForLifecycleCallbacks = r0     // Catch:{ all -> 0x001c }
            r1.appContext = r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.registerActivityLifecycleCallbacks(android.content.Context):void");
    }

    @VisibleForTesting
    public void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    public static AppStartTrace getInstance(C18208f fVar, C16625a aVar) {
        if (instance == null) {
            synchronized (AppStartTrace.class) {
                if (instance == null) {
                    instance = new AppStartTrace(fVar, aVar, new ThreadPoolExecutor(0, 1, MAX_LATENCY_BEFORE_UI_INIT + 10, TimeUnit.SECONDS, new LinkedBlockingQueue(1)));
                }
            }
        }
        return instance;
    }
}
