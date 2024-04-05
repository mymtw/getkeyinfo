package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.C16592a;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.C16625a;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p568fn.C17781a;
import p576gn.C17802c;
import p584hn.C17834e;
import p599jn.C18038a;
import p616ln.C18206d;
import p616ln.C18208f;

public class Trace extends C16592a implements Parcelable, C18038a {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C16615a();
    @VisibleForTesting
    public static final Parcelable.Creator<Trace> CREATOR_DATAONLY = new C16616b();
    private static final C17781a logger = C17781a.m29823d();
    private static final Map<String, Trace> traceNameToTraceMap = new ConcurrentHashMap();
    private final C16625a clock;
    private final Map<String, Counter> counterNameToCounterMap;
    private final Map<String, String> customAttributesMap;
    private Timer endTime;
    private final GaugeManager gaugeManager;
    private final String name;
    private final Trace parent;
    private final WeakReference<C18038a> sessionAwareObject;
    private final List<PerfSession> sessions;
    private Timer startTime;
    private final List<Trace> subtraces;
    private final C18208f transportManager;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    public class C16615a implements Parcelable.Creator<Trace> {
        public final Object createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, (C16615a) null);
        }

        public final Object[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    public class C16616b implements Parcelable.Creator<Trace> {
        public final Object createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (C16615a) null);
        }

        public final Object[] newArray(int i) {
            return new Trace[i];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z, C16615a aVar) {
        this(parcel, z);
    }

    private void checkAttribute(String str, String str2) {
        if (isStopped()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.name}));
        } else if (this.customAttributesMap.containsKey(str) || this.customAttributesMap.size() < 5) {
            String b = C17834e.m29957b(new AbstractMap.SimpleEntry(str, str2));
            if (b != null) {
                throw new IllegalArgumentException(b);
            }
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    public static Trace create(String str) {
        return new Trace(str);
    }

    public static synchronized Trace getTrace(String str) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = traceNameToTraceMap;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str);
                map.put(str, trace);
            }
        }
        return trace;
    }

    private Counter obtainOrCreateCounterByName(String str) {
        Counter counter = this.counterNameToCounterMap.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.counterNameToCounterMap.put(str, counter2);
        return counter2;
    }

    private void setEndTimeOfLastStage(Timer timer) {
        if (!this.subtraces.isEmpty()) {
            Trace trace = this.subtraces.get(this.subtraces.size() - 1);
            if (trace.endTime == null) {
                trace.endTime = timer;
            }
        }
    }

    public static Trace startTrace(String str) {
        Trace trace = traceNameToTraceMap.get(str);
        if (trace != null) {
            trace.start();
        }
        return trace;
    }

    public static Trace stopTrace(String str) {
        Map<String, Trace> map = traceNameToTraceMap;
        Trace trace = map.get(str);
        if (trace != null) {
            trace.stop();
            map.remove(str);
        }
        return trace;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            if (isActive()) {
                logger.mo69019g("Trace '%s' is started but not stopped when it is destructed!", this.name);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return this.customAttributesMap.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.customAttributesMap);
    }

    @VisibleForTesting
    public Map<String, Counter> getCounters() {
        return this.counterNameToCounterMap;
    }

    @VisibleForTesting
    public Timer getEndTime() {
        return this.endTime;
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter = str != null ? this.counterNameToCounterMap.get(str.trim()) : null;
        if (counter == null) {
            return 0;
        }
        return counter.getCount();
    }

    @VisibleForTesting
    public String getName() {
        return this.name;
    }

    @VisibleForTesting
    public List<PerfSession> getSessions() {
        List<PerfSession> unmodifiableList;
        synchronized (this.sessions) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession next : this.sessions) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @VisibleForTesting
    public Timer getStartTime() {
        return this.startTime;
    }

    @VisibleForTesting
    public List<Trace> getSubtraces() {
        return this.subtraces;
    }

    @VisibleForTesting
    public boolean hasStarted() {
        return this.startTime != null;
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String c = C17834e.m29958c(str);
        if (c != null) {
            logger.mo69016c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c);
        } else if (!hasStarted()) {
            logger.mo69019g("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.name);
        } else if (isStopped()) {
            logger.mo69019g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.name);
        } else {
            Counter obtainOrCreateCounterByName = obtainOrCreateCounterByName(str.trim());
            obtainOrCreateCounterByName.increment(j);
            logger.mo69015b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(obtainOrCreateCounterByName.getCount()), this.name);
        }
    }

    @VisibleForTesting
    public boolean isActive() {
        return hasStarted() && !isStopped();
    }

    @VisibleForTesting
    public boolean isStopped() {
        return this.endTime != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            checkAttribute(str, str2);
            logger.mo69015b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.name);
            z = true;
        } catch (Exception e) {
            logger.mo69016c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.customAttributesMap.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String c = C17834e.m29958c(str);
        if (c != null) {
            logger.mo69016c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c);
        } else if (!hasStarted()) {
            logger.mo69019g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.name);
        } else if (isStopped()) {
            logger.mo69019g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.name);
        } else {
            obtainOrCreateCounterByName(str.trim()).setCount(j);
            logger.mo69015b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.name);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (isStopped()) {
            C17781a aVar = logger;
            if (aVar.f38630b) {
                aVar.f38629a.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.customAttributesMap.remove(str);
    }

    @Keep
    public void start() {
        String str;
        if (!C16594a.m27423e().mo59258o()) {
            logger.mo69014a("Trace feature is disabled.");
            return;
        }
        String str2 = this.name;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else {
            if (str2.startsWith("_")) {
                Constants$TraceNames[] values = Constants$TraceNames.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (values[i].toString().equals(str2)) {
                            break;
                        }
                        i++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            logger.mo69016c("Cannot start trace '%s'. Trace name is invalid.(%s)", this.name, str);
        } else if (this.startTime != null) {
            logger.mo69016c("Trace '%s' has already started, should not start again!", this.name);
        } else {
            this.clock.getClass();
            this.startTime = new Timer();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.sessionAwareObject);
            updateSession(perfSession);
            if (perfSession.isGaugeAndEventCollectionEnabled()) {
                this.gaugeManager.collectGaugeMetricOnce(perfSession.getTimer());
            }
        }
    }

    public void startStage(String str) {
        this.clock.getClass();
        Timer timer = new Timer();
        setEndTimeOfLastStage(timer);
        this.subtraces.add(new Trace(this, str, timer, (Timer) null, (List<Trace>) null, (Map<String, Counter>) null, (Map<String, String>) null));
    }

    @Keep
    public void stop() {
        if (!hasStarted()) {
            logger.mo69016c("Trace '%s' has not been started so unable to stop!", this.name);
        } else if (isStopped()) {
            logger.mo69016c("Trace '%s' has already stopped, should not stop again!", this.name);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.sessionAwareObject);
            unregisterForAppState();
            this.clock.getClass();
            Timer timer = new Timer();
            this.endTime = timer;
            if (this.parent == null) {
                setEndTimeOfLastStage(timer);
                if (!this.name.isEmpty()) {
                    C18208f fVar = this.transportManager;
                    fVar.f39891j.execute(new C18206d(fVar, new C17802c(this).mo69043a(), getAppState()));
                    if (SessionManager.getInstance().perfSession().isGaugeAndEventCollectionEnabled()) {
                        this.gaugeManager.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().getTimer());
                        return;
                    }
                    return;
                }
                C17781a aVar = logger;
                if (aVar.f38630b) {
                    aVar.f38629a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                }
            }
        }
    }

    public void stopStage() {
        this.clock.getClass();
        setEndTimeOfLastStage(new Timer());
    }

    public void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            logger.mo69018f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (hasStarted() && !isStopped()) {
            this.sessions.add(perfSession);
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.parent, 0);
        parcel.writeString(this.name);
        parcel.writeList(this.subtraces);
        parcel.writeMap(this.counterNameToCounterMap);
        parcel.writeParcelable(this.startTime, 0);
        parcel.writeParcelable(this.endTime, 0);
        synchronized (this.sessions) {
            parcel.writeList(this.sessions);
        }
    }

    private Trace(Trace trace, String str, Timer timer, Timer timer2, List<Trace> list, Map<String, Counter> map, Map<String, String> map2) {
        this.sessionAwareObject = new WeakReference<>(this);
        this.parent = trace;
        this.name = str.trim();
        this.startTime = timer;
        this.endTime = timer2;
        this.subtraces = list == null ? new ArrayList<>() : list;
        this.counterNameToCounterMap = map == null ? new ConcurrentHashMap<>() : map;
        this.customAttributesMap = map2 == null ? new ConcurrentHashMap<>() : map2;
        this.clock = trace.clock;
        this.transportManager = trace.transportManager;
        this.sessions = Collections.synchronizedList(new ArrayList());
        this.gaugeManager = trace.gaugeManager;
    }

    @VisibleForTesting
    public static synchronized Trace getTrace(String str, C18208f fVar, C16625a aVar, AppStateMonitor appStateMonitor) {
        Trace trace;
        synchronized (Trace.class) {
            Map<String, Trace> map = traceNameToTraceMap;
            trace = map.get(str);
            if (trace == null) {
                trace = new Trace(str, fVar, aVar, appStateMonitor, GaugeManager.getInstance());
                map.put(str, trace);
            }
        }
        return trace;
    }

    private Trace(String str) {
        this(str, C18208f.f39882t, new C16625a(), AppStateMonitor.getInstance(), GaugeManager.getInstance());
    }

    public Trace(String str, C18208f fVar, C16625a aVar, AppStateMonitor appStateMonitor) {
        this(str, fVar, aVar, appStateMonitor, GaugeManager.getInstance());
    }

    public Trace(String str, C18208f fVar, C16625a aVar, AppStateMonitor appStateMonitor, GaugeManager gaugeManager2) {
        super(appStateMonitor);
        this.sessionAwareObject = new WeakReference<>(this);
        this.parent = null;
        this.name = str.trim();
        this.subtraces = new ArrayList();
        this.counterNameToCounterMap = new ConcurrentHashMap();
        this.customAttributesMap = new ConcurrentHashMap();
        this.clock = aVar;
        this.transportManager = fVar;
        this.sessions = Collections.synchronizedList(new ArrayList());
        this.gaugeManager = gaugeManager2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Trace(Parcel parcel, boolean z) {
        super(z ? null : AppStateMonitor.getInstance());
        this.sessionAwareObject = new WeakReference<>(this);
        this.parent = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.name = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.subtraces = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.counterNameToCounterMap = concurrentHashMap;
        this.customAttributesMap = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.startTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.endTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.sessions = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.transportManager = null;
            this.clock = null;
            this.gaugeManager = null;
            return;
        }
        this.transportManager = C18208f.f39882t;
        this.clock = new C16625a();
        this.gaugeManager = GaugeManager.getInstance();
    }
}
