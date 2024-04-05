package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.C16676i;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C16625a;
import com.google.firebase.perf.util.C16630e;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p250u0.C8086e;
import p568fn.C17781a;
import p616ln.C18206d;
import p616ln.C18208f;

public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static volatile AppStateMonitor instance;
    private static final C17781a logger = C17781a.m29823d();
    private final WeakHashMap<Activity, Boolean> activityToResumedMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, Trace> activityToScreenTraceMap = new WeakHashMap<>();
    private Set<C16590a> appColdStartSubscribers = new HashSet();
    private final Set<WeakReference<C16591b>> appStateSubscribers = new HashSet();
    private final C16625a clock;
    private final C16594a configResolver;
    private ApplicationProcessState currentAppState = ApplicationProcessState.BACKGROUND;
    private C8086e frameMetricsAggregator;
    private boolean hasFrameMetricsAggregator = false;
    private boolean isColdStart = true;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private final Map<String, Long> metricToCountMap = new HashMap();
    private Timer resumeTime;
    private Timer stopTime;
    private final C18208f transportManager;
    private final AtomicInteger tsnsCount = new AtomicInteger(0);

    /* renamed from: com.google.firebase.perf.application.AppStateMonitor$a */
    public interface C16590a {
        /* renamed from: a */
        void mo59230a();
    }

    /* renamed from: com.google.firebase.perf.application.AppStateMonitor$b */
    public interface C16591b {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(C18208f fVar, C16625a aVar) {
        this.transportManager = fVar;
        this.clock = aVar;
        this.configResolver = C16594a.m27423e();
        boolean hasFrameMetricsAggregatorClass = hasFrameMetricsAggregatorClass();
        this.hasFrameMetricsAggregator = hasFrameMetricsAggregatorClass;
        if (hasFrameMetricsAggregatorClass) {
            this.frameMetricsAggregator = new C8086e();
        }
    }

    public static AppStateMonitor getInstance() {
        if (instance == null) {
            synchronized (AppStateMonitor.class) {
                if (instance == null) {
                    instance = new AppStateMonitor(C18208f.f39882t, new C16625a());
                }
            }
        }
        return instance;
    }

    public static String getScreenTraceName(Activity activity) {
        StringBuilder h = C0072d.m201h("_st_");
        h.append(activity.getClass().getSimpleName());
        return h.toString();
    }

    private boolean hasFrameMetricsAggregatorClass() {
        return true;
    }

    private boolean isScreenTraceSupported(Activity activity) {
        return this.hasFrameMetricsAggregator;
    }

    private void sendAppColdStartUpdate() {
        synchronized (this.appStateSubscribers) {
            for (C16590a next : this.appColdStartSubscribers) {
                if (next != null) {
                    next.mo59230a();
                }
            }
        }
    }

    private void sendScreenTrace(Activity activity) {
        Trace trace;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (this.activityToScreenTraceMap.containsKey(activity) && (trace = this.activityToScreenTraceMap.get(activity)) != null) {
            this.activityToScreenTraceMap.remove(activity);
            C8086e.C8087a aVar = this.frameMetricsAggregator.f17613a;
            SparseIntArray[] sparseIntArrayArr = aVar.f17617b;
            aVar.f17617b = new SparseIntArray[9];
            int i3 = 0;
            if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
                i2 = 0;
                i = 0;
            } else {
                int i4 = 0;
                i2 = 0;
                i = 0;
                while (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    i4 += valueAt;
                    if (keyAt > 700) {
                        i += valueAt;
                    }
                    if (keyAt > 16) {
                        i2 += valueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 > 0) {
                trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), (long) i3);
            }
            if (i2 > 0) {
                trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), (long) i2);
            }
            if (i > 0) {
                trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), (long) i);
            }
            if (C16630e.m27495a(activity.getApplicationContext())) {
                C17781a aVar2 = logger;
                StringBuilder h = C0072d.m201h("sendScreenTrace name:");
                h.append(getScreenTraceName(activity));
                h.append(" _fr_tot:");
                h.append(i3);
                h.append(" _fr_slo:");
                h.append(i2);
                h.append(" _fr_fzn:");
                h.append(i);
                aVar2.mo69014a(h.toString());
            }
            trace.stop();
        }
    }

    private void sendSessionLog(String str, Timer timer, Timer timer2) {
        if (this.configResolver.mo59258o()) {
            C16676i.C16678b R = C16676i.m27636R();
            R.mo59424y(str);
            R.mo59422w(timer.getMicros());
            R.mo59423x(timer.getDurationMicros(timer2));
            C16672h build = SessionManager.getInstance().perfSession().build();
            R.mo59761u();
            C16676i.m27631E((C16676i) R.f37158c, build);
            int andSet = this.tsnsCount.getAndSet(0);
            synchronized (this.metricToCountMap) {
                try {
                    Map<String, Long> map = this.metricToCountMap;
                    R.mo59761u();
                    C16676i.m27627A((C16676i) R.f37158c).putAll(map);
                    if (andSet != 0) {
                        String constants$CounterNames = Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString();
                        constants$CounterNames.getClass();
                        R.mo59761u();
                        C16676i.m27627A((C16676i) R.f37158c).put(constants$CounterNames, Long.valueOf((long) andSet));
                    }
                    this.metricToCountMap.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            C18208f fVar = this.transportManager;
            fVar.f39891j.execute(new C18206d(fVar, (C16676i) R.mo59759s(), ApplicationProcessState.FOREGROUND_BACKGROUND));
        }
    }

    private void updateAppState(ApplicationProcessState applicationProcessState) {
        this.currentAppState = applicationProcessState;
        synchronized (this.appStateSubscribers) {
            Iterator<WeakReference<C16591b>> it = this.appStateSubscribers.iterator();
            while (it.hasNext()) {
                C16591b bVar = (C16591b) it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.currentAppState);
                } else {
                    it.remove();
                }
            }
        }
    }

    @VisibleForTesting
    public WeakHashMap<Activity, Trace> getActivity2ScreenTrace() {
        return this.activityToScreenTraceMap;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public Timer getPauseTime() {
        return this.stopTime;
    }

    @VisibleForTesting
    public Timer getResumeTime() {
        return this.resumeTime;
    }

    @VisibleForTesting
    public WeakHashMap<Activity, Boolean> getResumed() {
        return this.activityToResumedMap;
    }

    public void incrementCount(String str, long j) {
        synchronized (this.metricToCountMap) {
            Long l = this.metricToCountMap.get(str);
            if (l == null) {
                this.metricToCountMap.put(str, Long.valueOf(j));
            } else {
                this.metricToCountMap.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    public void incrementTsnsCount(int i) {
        this.tsnsCount.addAndGet(i);
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public boolean isForeground() {
        return this.currentAppState == ApplicationProcessState.FOREGROUND;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.activityToResumedMap.isEmpty()) {
            this.clock.getClass();
            this.resumeTime = new Timer();
            this.activityToResumedMap.put(activity, Boolean.TRUE);
            updateAppState(ApplicationProcessState.FOREGROUND);
            if (this.isColdStart) {
                sendAppColdStartUpdate();
                this.isColdStart = false;
            } else {
                sendSessionLog(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.stopTime, this.resumeTime);
            }
        } else {
            this.activityToResumedMap.put(activity, Boolean.TRUE);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (isScreenTraceSupported(activity) && this.configResolver.mo59258o()) {
            this.frameMetricsAggregator.mo20679a(activity);
            Trace trace = new Trace(getScreenTraceName(activity), this.transportManager, this.clock, this);
            trace.start();
            this.activityToScreenTraceMap.put(activity, trace);
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (isScreenTraceSupported(activity)) {
            sendScreenTrace(activity);
        }
        if (this.activityToResumedMap.containsKey(activity)) {
            this.activityToResumedMap.remove(activity);
            if (this.activityToResumedMap.isEmpty()) {
                this.clock.getClass();
                this.stopTime = new Timer();
                updateAppState(ApplicationProcessState.BACKGROUND);
                sendSessionLog(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.resumeTime, this.stopTime);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerActivityLifecycleCallbacks(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r1.isRegisteredForLifecycleCallbacks = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.AppStateMonitor.registerActivityLifecycleCallbacks(android.content.Context):void");
    }

    public void registerForAppColdStart(C16590a aVar) {
        synchronized (this.appStateSubscribers) {
            this.appColdStartSubscribers.add(aVar);
        }
    }

    public void registerForAppState(WeakReference<C16591b> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.add(weakReference);
        }
    }

    @VisibleForTesting
    public void setIsColdStart(boolean z) {
        this.isColdStart = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unregisterActivityLifecycleCallbacks(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isRegisteredForLifecycleCallbacks     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 0
            r1.isRegisteredForLifecycleCallbacks = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.AppStateMonitor.unregisterActivityLifecycleCallbacks(android.content.Context):void");
    }

    public void unregisterForAppState(WeakReference<C16591b> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.remove(weakReference);
        }
    }
}
