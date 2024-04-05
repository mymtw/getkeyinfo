package com.google.firebase.perf.session.gauges;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.annotation.Keep;
import androidx.room.C3250p;
import com.etsy.android.p327ui.cart.googlepay.C9306d;
import com.etsy.android.p327ui.favorites.add.C9787v;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.config.C16603j;
import com.google.firebase.perf.config.C16604k;
import com.google.firebase.perf.config.C16606m;
import com.google.firebase.perf.config.C16607n;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16663e;
import com.google.firebase.perf.p530v1.C16666f;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.C16627c;
import com.google.firebase.perf.util.C16630e;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p520cj.C14163o;
import p568fn.C17781a;
import p608kn.C18150b;
import p608kn.C18151c;
import p608kn.C18152d;
import p608kn.C18153e;
import p608kn.C18154f;
import p608kn.C18156h;
import p616ln.C18207e;
import p616ln.C18208f;
import p649pm.C18411n;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C17781a logger = C17781a.m29823d();
    private ApplicationProcessState applicationProcessState;
    private final C16594a configResolver;
    private final C18411n<C18150b> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C18411n<ScheduledExecutorService> gaugeManagerExecutor;
    private C18154f gaugeMetadataManager;
    private final C18411n<C18156h> memoryGaugeCollector;
    private String sessionId;
    private final C18208f transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    public static /* synthetic */ class C16618a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36854a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.perf.v1.ApplicationProcessState[] r0 = com.google.firebase.perf.p530v1.ApplicationProcessState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36854a = r0
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p530v1.ApplicationProcessState.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36854a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p530v1.ApplicationProcessState.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.C16618a.<clinit>():void");
        }
    }

    private GaugeManager() {
        this(new C18411n(new C18151c()), C18208f.f39882t, C16594a.m27423e(), (C18154f) null, new C18411n(new C18152d()), new C18411n(new C18153e()));
    }

    private static void collectGaugeMetricOnce(C18150b bVar, C18156h hVar, Timer timer) {
        synchronized (bVar) {
            try {
                bVar.f39635b.schedule(new C9306d(2, bVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C17781a aVar = C18150b.f39632g;
                aVar.mo69018f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (hVar) {
            try {
                hVar.f39649a.schedule(new C9787v(1, hVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                C17781a aVar2 = C18156h.f39648f;
                aVar2.mo69018f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
        return;
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        C16603j jVar;
        C16604k kVar;
        int i = C16618a.f36854a[applicationProcessState2.ordinal()];
        boolean z = true;
        if (i == 1) {
            C16594a aVar = this.configResolver;
            aVar.getClass();
            synchronized (C16603j.class) {
                if (C16603j.f36840e == null) {
                    C16603j.f36840e = new C16603j();
                }
                jVar = C16603j.f36840e;
            }
            C16627c<Long> i2 = aVar.mo59255i(jVar);
            if (!i2.mo59369b() || !C16594a.m27426n(i2.mo59368a().longValue())) {
                C16627c<Long> k = aVar.mo59257k(jVar);
                if (!k.mo59369b() || !C16594a.m27426n(k.mo59368a().longValue())) {
                    C16627c<Long> c = aVar.mo59250c(jVar);
                    if (!c.mo59369b() || !C16594a.m27426n(c.mo59368a().longValue())) {
                        Long l = 0L;
                        j = l.longValue();
                    } else {
                        j = c.mo59368a().longValue();
                    }
                } else {
                    aVar.f36831c.mo59261c(k.mo59368a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    j = k.mo59368a().longValue();
                }
            } else {
                j = i2.mo59368a().longValue();
            }
        } else if (i != 2) {
            j = -1;
        } else {
            C16594a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (C16604k.class) {
                if (C16604k.f36841e == null) {
                    C16604k.f36841e = new C16604k();
                }
                kVar = C16604k.f36841e;
            }
            C16627c<Long> i3 = aVar2.mo59255i(kVar);
            if (!i3.mo59369b() || !C16594a.m27426n(i3.mo59368a().longValue())) {
                C16627c<Long> k2 = aVar2.mo59257k(kVar);
                if (!k2.mo59369b() || !C16594a.m27426n(k2.mo59368a().longValue())) {
                    C16627c<Long> c2 = aVar2.mo59250c(kVar);
                    if (!c2.mo59369b() || !C16594a.m27426n(c2.mo59368a().longValue())) {
                        Long l2 = 100L;
                        j = l2.longValue();
                    } else {
                        j = c2.mo59368a().longValue();
                    }
                } else {
                    aVar2.f36831c.mo59261c(k2.mo59368a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j = k2.mo59368a().longValue();
                }
            } else {
                j = i3.mo59368a().longValue();
            }
        }
        C17781a aVar3 = C18150b.f39632g;
        if (j > 0) {
            z = false;
        }
        if (z) {
            return -1;
        }
        return j;
    }

    private C16663e getGaugeMetadata() {
        C16663e.C16665b F = C16663e.m27580F();
        String str = this.gaugeMetadataManager.f39643d;
        F.mo59761u();
        C16663e.m27582z((C16663e) F.f37158c, str);
        C18154f fVar = this.gaugeMetadataManager;
        fVar.getClass();
        StorageUnit storageUnit = StorageUnit.BYTES;
        int b = C16630e.m27496b(storageUnit.toKilobytes(fVar.f39642c.totalMem));
        F.mo59761u();
        C16663e.m27578C((C16663e) F.f37158c, b);
        C18154f fVar2 = this.gaugeMetadataManager;
        fVar2.getClass();
        int b2 = C16630e.m27496b(storageUnit.toKilobytes(fVar2.f39640a.maxMemory()));
        F.mo59761u();
        C16663e.m27576A((C16663e) F.f37158c, b2);
        C18154f fVar3 = this.gaugeMetadataManager;
        fVar3.getClass();
        int b3 = C16630e.m27496b(StorageUnit.MEGABYTES.toKilobytes((long) fVar3.f39641b.getMemoryClass()));
        F.mo59761u();
        C16663e.m27577B((C16663e) F.f37158c, b3);
        return (C16663e) F.mo59759s();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        C16606m mVar;
        C16607n nVar;
        int i = C16618a.f36854a[applicationProcessState2.ordinal()];
        boolean z = true;
        if (i == 1) {
            C16594a aVar = this.configResolver;
            aVar.getClass();
            synchronized (C16606m.class) {
                if (C16606m.f36843e == null) {
                    C16606m.f36843e = new C16606m();
                }
                mVar = C16606m.f36843e;
            }
            C16627c<Long> i2 = aVar.mo59255i(mVar);
            if (!i2.mo59369b() || !C16594a.m27426n(i2.mo59368a().longValue())) {
                C16627c<Long> k = aVar.mo59257k(mVar);
                if (!k.mo59369b() || !C16594a.m27426n(k.mo59368a().longValue())) {
                    C16627c<Long> c = aVar.mo59250c(mVar);
                    if (!c.mo59369b() || !C16594a.m27426n(c.mo59368a().longValue())) {
                        Long l = 0L;
                        j = l.longValue();
                    } else {
                        j = c.mo59368a().longValue();
                    }
                } else {
                    aVar.f36831c.mo59261c(k.mo59368a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    j = k.mo59368a().longValue();
                }
            } else {
                j = i2.mo59368a().longValue();
            }
        } else if (i != 2) {
            j = -1;
        } else {
            C16594a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (C16607n.class) {
                if (C16607n.f36844e == null) {
                    C16607n.f36844e = new C16607n();
                }
                nVar = C16607n.f36844e;
            }
            C16627c<Long> i3 = aVar2.mo59255i(nVar);
            if (!i3.mo59369b() || !C16594a.m27426n(i3.mo59368a().longValue())) {
                C16627c<Long> k2 = aVar2.mo59257k(nVar);
                if (!k2.mo59369b() || !C16594a.m27426n(k2.mo59368a().longValue())) {
                    C16627c<Long> c2 = aVar2.mo59250c(nVar);
                    if (!c2.mo59369b() || !C16594a.m27426n(c2.mo59368a().longValue())) {
                        Long l2 = 100L;
                        j = l2.longValue();
                    } else {
                        j = c2.mo59368a().longValue();
                    }
                } else {
                    aVar2.f36831c.mo59261c(k2.mo59368a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j = k2.mo59368a().longValue();
                }
            } else {
                j = i3.mo59368a().longValue();
            }
        }
        C17781a aVar3 = C18156h.f39648f;
        if (j > 0) {
            z = false;
        }
        if (z) {
            return -1;
        }
        return j;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C18150b lambda$new$1() {
        return new C18150b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C18156h lambda$new$2() {
        return new C18156h();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.mo69014a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        C18150b bVar = this.cpuGaugeCollector.get();
        long j2 = bVar.f39637d;
        if (!(j2 == -1 || j2 == 0)) {
            if (!(j <= 0)) {
                ScheduledFuture scheduledFuture = bVar.f39638e;
                if (scheduledFuture == null) {
                    bVar.mo69698a(j, timer);
                } else if (bVar.f39639f != j) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        bVar.f39638e = null;
                        bVar.f39639f = -1;
                    }
                    bVar.mo69698a(j, timer);
                }
            }
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.mo69014a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        C18156h hVar = this.memoryGaugeCollector.get();
        C17781a aVar = C18156h.f39648f;
        if (j <= 0) {
            hVar.getClass();
        } else {
            ScheduledFuture scheduledFuture = hVar.f39652d;
            if (scheduledFuture == null) {
                hVar.mo69701a(j, timer);
            } else if (hVar.f39653e != j) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    hVar.f39652d = null;
                    hVar.f39653e = -1;
                }
                hVar.mo69701a(j, timer);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$4(String str, ApplicationProcessState applicationProcessState2) {
        C16666f.C16668b J = C16666f.m27589J();
        while (!this.cpuGaugeCollector.get().f39634a.isEmpty()) {
            J.mo59761u();
            C16666f.m27587C((C16666f) J.f37158c, this.cpuGaugeCollector.get().f39634a.poll());
        }
        while (!this.memoryGaugeCollector.get().f39650b.isEmpty()) {
            J.mo59761u();
            C16666f.m27585A((C16666f) J.f37158c, this.memoryGaugeCollector.get().f39650b.poll());
        }
        J.mo59761u();
        C16666f.m27591z((C16666f) J.f37158c, str);
        C18208f fVar = this.transportManager;
        fVar.f39891j.execute(new C18207e(fVar, (C16666f) J.mo59759s(), applicationProcessState2));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C18154f(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState2) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        C16666f.C16668b J = C16666f.m27589J();
        J.mo59761u();
        C16666f.m27591z((C16666f) J.f37158c, str);
        C16663e gaugeMetadata = getGaugeMetadata();
        J.mo59761u();
        C16666f.m27586B((C16666f) J.f37158c, gaugeMetadata);
        C18208f fVar = this.transportManager;
        fVar.f39891j.execute(new C18207e(fVar, (C16666f) J.mo59759s(), applicationProcessState2));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState2) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(applicationProcessState2, perfSession.getTimer());
        if (startCollectingGauges == -1) {
            logger.mo69018f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String sessionId2 = perfSession.sessionId();
        this.sessionId = sessionId2;
        this.applicationProcessState = applicationProcessState2;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new C14163o(this, 1, sessionId2, applicationProcessState2), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C17781a aVar = logger;
            StringBuilder h = C0072d.m201h("Unable to start collecting Gauges: ");
            h.append(e.getMessage());
            aVar.mo69018f(h.toString());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            ApplicationProcessState applicationProcessState2 = this.applicationProcessState;
            C18150b bVar = this.cpuGaugeCollector.get();
            ScheduledFuture scheduledFuture = bVar.f39638e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                bVar.f39638e = null;
                bVar.f39639f = -1;
            }
            C18156h hVar = this.memoryGaugeCollector.get();
            ScheduledFuture scheduledFuture2 = hVar.f39652d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                hVar.f39652d = null;
                hVar.f39653e = -1;
            }
            ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture3 != null) {
                scheduledFuture3.cancel(false);
            }
            this.gaugeManagerExecutor.get().schedule(new C3250p(this, 1, str, applicationProcessState2), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    public GaugeManager(C18411n<ScheduledExecutorService> nVar, C18208f fVar, C16594a aVar, C18154f fVar2, C18411n<C18150b> nVar2, C18411n<C18156h> nVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = nVar;
        this.transportManager = fVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = fVar2;
        this.cpuGaugeCollector = nVar2;
        this.memoryGaugeCollector = nVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState2, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == -1) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
