package p616ln;

import android.content.Context;
import androidx.compose.p015ui.platform.C1864q;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.google.android.datatransport.C6518e;
import com.google.firebase.installations.C16563d;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16656c;
import com.google.firebase.perf.p530v1.C16666f;
import com.google.firebase.perf.p530v1.C16676i;
import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p552dn.C17697b;
import p568fn.C17781a;
import p575gm.C17793c;
import p624mn.C18253a;
import p722ym.C18895a;

/* renamed from: ln.f */
public final class C18208f implements AppStateMonitor.C16591b {

    /* renamed from: s */
    public static final C17781a f39881s = C17781a.m29823d();

    /* renamed from: t */
    public static final C18208f f39882t = new C18208f();

    /* renamed from: b */
    public final ConcurrentHashMap f39883b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue<C18203b> f39884c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public final AtomicBoolean f39885d = new AtomicBoolean(false);

    /* renamed from: e */
    public C17793c f39886e;

    /* renamed from: f */
    public C17697b f39887f;

    /* renamed from: g */
    public C16563d f39888g;

    /* renamed from: h */
    public C18895a<C6518e> f39889h;

    /* renamed from: i */
    public C18202a f39890i;

    /* renamed from: j */
    public ThreadPoolExecutor f39891j = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: k */
    public Context f39892k;

    /* renamed from: l */
    public C16594a f39893l;

    /* renamed from: m */
    public C18204c f39894m;

    /* renamed from: n */
    public AppStateMonitor f39895n;

    /* renamed from: o */
    public C16656c.C16658b f39896o;

    /* renamed from: p */
    public String f39897p;

    /* renamed from: q */
    public String f39898q;

    /* renamed from: r */
    public boolean f39899r = false;

    public C18208f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f39883b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: a */
    public static String m30705a(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %.4fms)", new Object[]{networkRequestMetric.mo59380X(), networkRequestMetric.mo59383a0() ? String.valueOf(networkRequestMetric.mo59373Q()) : "UNKNOWN", Double.valueOf(((double) (networkRequestMetric.mo59387e0() ? networkRequestMetric.mo59378V() : 0)) / 1000.0d)});
    }

    /* renamed from: b */
    public static String m30706b(C16676i iVar) {
        long M = iVar.mo59417M();
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %.4fms)", new Object[]{iVar.mo59418N(), Double.valueOf(((double) M) / 1000.0d)});
    }

    /* renamed from: c */
    public static String m30707c(C18253a aVar) {
        if (aVar.mo59408o()) {
            return m30706b(aVar.mo59409p());
        }
        if (aVar.mo59406k()) {
            return m30705a(aVar.mo59407l());
        }
        if (!aVar.mo59405j()) {
            return AnalyticsLogDatabaseHelper.LOG;
        }
        C16666f q = aVar.mo59410q();
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(q.mo59401H()), Integer.valueOf(q.mo59399E()), Integer.valueOf(q.mo59398D())});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v50, resolved type: com.google.protobuf.GeneratedMessageLite$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: com.google.firebase.perf.v1.c$b} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ff, code lost:
        if (p616ln.C18204c.m30703a(r13.mo59409p().mo59419O()) == false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039f, code lost:
        if (p616ln.C18204c.m30703a(r13.mo59407l().mo59374R()) == false) goto L_0x0405;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x025b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69737d(com.google.firebase.perf.p530v1.C16669g.C16671b r13, com.google.firebase.perf.p530v1.ApplicationProcessState r14) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f39885d
            boolean r0 = r0.get()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x00af
            java.util.concurrent.ConcurrentHashMap r0 = r12.f39883b
            java.lang.String r6 = "KEY_AVAILABLE_TRACES_FOR_CACHING"
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.concurrent.ConcurrentHashMap r7 = r12.f39883b
            java.lang.String r8 = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.concurrent.ConcurrentHashMap r9 = r12.f39883b
            java.lang.String r10 = "KEY_AVAILABLE_GAUGES_FOR_CACHING"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r11 = r13.mo59408o()
            if (r11 == 0) goto L_0x004a
            if (r0 <= 0) goto L_0x004a
            java.util.concurrent.ConcurrentHashMap r1 = r12.f39883b
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r0)
            goto L_0x006f
        L_0x004a:
            boolean r6 = r13.mo59406k()
            if (r6 == 0) goto L_0x005d
            if (r7 <= 0) goto L_0x005d
            java.util.concurrent.ConcurrentHashMap r0 = r12.f39883b
            int r7 = r7 - r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.put(r8, r1)
            goto L_0x006f
        L_0x005d:
            boolean r6 = r13.mo59405j()
            if (r6 == 0) goto L_0x0071
            if (r9 <= 0) goto L_0x0071
            java.util.concurrent.ConcurrentHashMap r0 = r12.f39883b
            int r9 = r9 - r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0.put(r10, r1)
        L_0x006f:
            r0 = r4
            goto L_0x0093
        L_0x0071:
            fn.a r6 = f39881s
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = m30707c(r13)
            r3[r5] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3[r1] = r0
            java.lang.String r0 = "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."
            r6.mo69015b(r0, r3)
            r0 = r5
        L_0x0093:
            if (r0 == 0) goto L_0x00ae
            fn.a r0 = f39881s
            java.lang.String r1 = "Transport is not initialized yet, %s will be queued for to be dispatched later"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = m30707c(r13)
            r2[r5] = r3
            r0.mo69015b(r1, r2)
            java.util.concurrent.ConcurrentLinkedQueue<ln.b> r0 = r12.f39884c
            ln.b r1 = new ln.b
            r1.<init>(r13, r14)
            r0.add(r1)
        L_0x00ae:
            return
        L_0x00af:
            com.google.firebase.perf.config.a r0 = r12.f39893l
            boolean r0 = r0.mo59258o()
            if (r0 == 0) goto L_0x0128
            com.google.firebase.perf.v1.c$b r0 = r12.f39896o
            MessageType r0 = r0.f37158c
            com.google.firebase.perf.v1.c r0 = (com.google.firebase.perf.p530v1.C16656c) r0
            boolean r0 = r0.mo59394H()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r12.f39899r
            if (r0 != 0) goto L_0x00c8
            goto L_0x0128
        L_0x00c8:
            r0 = 0
            com.google.firebase.installations.d r6 = r12.f39888g     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            kk.a0 r6 = r6.getId()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            r7 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            java.lang.Object r6 = p605kk.C18126j.m30614b(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            r0 = r6
            goto L_0x010e
        L_0x00dc:
            r6 = move-exception
            fn.a r7 = f39881s
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r6 = r6.getMessage()
            r8[r5] = r6
            java.lang.String r6 = "Task to retrieve Installation Id is timed out: %s"
            r7.mo69016c(r6, r8)
            goto L_0x010e
        L_0x00ed:
            r6 = move-exception
            fn.a r7 = f39881s
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r6 = r6.getMessage()
            r8[r5] = r6
            java.lang.String r6 = "Task to retrieve Installation Id is interrupted: %s"
            r7.mo69016c(r6, r8)
            goto L_0x010e
        L_0x00fe:
            r6 = move-exception
            fn.a r7 = f39881s
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r6 = r6.getMessage()
            r8[r5] = r6
            java.lang.String r6 = "Unable to retrieve Installation Id: %s"
            r7.mo69016c(r6, r8)
        L_0x010e:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x0121
            com.google.firebase.perf.v1.c$b r6 = r12.f39896o
            r6.mo59761u()
            MessageType r6 = r6.f37158c
            com.google.firebase.perf.v1.c r6 = (com.google.firebase.perf.p530v1.C16656c) r6
            com.google.firebase.perf.p530v1.C16656c.m27558C(r6, r0)
            goto L_0x0128
        L_0x0121:
            fn.a r0 = f39881s
            java.lang.String r6 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.mo69018f(r6)
        L_0x0128:
            com.google.firebase.perf.v1.c$b r0 = r12.f39896o
            r0.mo59761u()
            MessageType r6 = r0.f37158c
            com.google.firebase.perf.v1.c r6 = (com.google.firebase.perf.p530v1.C16656c) r6
            com.google.firebase.perf.p530v1.C16656c.m27556A(r6, r14)
            boolean r14 = r13.mo59408o()
            if (r14 == 0) goto L_0x0186
            MessageType r14 = r0.f37157b
            r14.getClass()
            com.google.protobuf.GeneratedMessageLite$MethodToInvoke r6 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r14 = r14.mo59389t(r6)
            com.google.protobuf.GeneratedMessageLite$a r14 = (com.google.protobuf.GeneratedMessageLite.C16838a) r14
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo59760t()
            r14.mo59761u()
            MessageType r6 = r14.f37158c
            com.google.protobuf.GeneratedMessageLite.C16838a.m27973v(r6, r0)
            r0 = r14
            com.google.firebase.perf.v1.c$b r0 = (com.google.firebase.perf.p530v1.C16656c.C16658b) r0
            dn.b r14 = r12.f39887f
            if (r14 != 0) goto L_0x0168
            java.util.concurrent.atomic.AtomicBoolean r14 = r12.f39885d
            boolean r14 = r14.get()
            if (r14 == 0) goto L_0x0168
            dn.b r14 = p552dn.C17697b.m29701a()
            r12.f39887f = r14
        L_0x0168:
            dn.b r14 = r12.f39887f
            if (r14 == 0) goto L_0x0174
            java.util.HashMap r6 = new java.util.HashMap
            java.util.concurrent.ConcurrentHashMap r14 = r14.f38493a
            r6.<init>(r14)
            goto L_0x0178
        L_0x0174:
            java.util.Map r6 = java.util.Collections.emptyMap()
        L_0x0178:
            r0.mo59761u()
            MessageType r14 = r0.f37158c
            com.google.firebase.perf.v1.c r14 = (com.google.firebase.perf.p530v1.C16656c) r14
            com.google.protobuf.MapFieldLite r14 = com.google.firebase.perf.p530v1.C16656c.m27557B(r14)
            r14.putAll(r6)
        L_0x0186:
            r13.mo59761u()
            MessageType r14 = r13.f37158c
            com.google.firebase.perf.v1.g r14 = (com.google.firebase.perf.p530v1.C16669g) r14
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo59759s()
            com.google.firebase.perf.v1.c r0 = (com.google.firebase.perf.p530v1.C16656c) r0
            com.google.firebase.perf.p530v1.C16669g.m27603z(r14, r0)
            com.google.protobuf.GeneratedMessageLite r13 = r13.mo59759s()
            com.google.firebase.perf.v1.g r13 = (com.google.firebase.perf.p530v1.C16669g) r13
            com.google.firebase.perf.config.a r14 = r12.f39893l
            boolean r14 = r14.mo59258o()
            if (r14 != 0) goto L_0x01b5
            fn.a r14 = f39881s
            java.lang.String r0 = "Performance collection is not enabled, dropping %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = m30707c(r13)
            r6[r5] = r7
            r14.mo69017e(r0, r6)
            goto L_0x0460
        L_0x01b5:
            com.google.firebase.perf.v1.c r14 = r13.mo59403D()
            boolean r14 = r14.mo59394H()
            if (r14 != 0) goto L_0x01d0
            fn.a r14 = f39881s
            java.lang.String r0 = "App Instance ID is null or empty, dropping %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = m30707c(r13)
            r6[r5] = r7
            r14.mo69019g(r0, r6)
            goto L_0x0460
        L_0x01d0:
            android.content.Context r14 = r12.f39892k
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r6 = r13.mo59408o()
            if (r6 == 0) goto L_0x01e9
            hn.d r6 = new hn.d
            com.google.firebase.perf.v1.i r7 = r13.mo59409p()
            r6.<init>(r7)
            r0.add(r6)
        L_0x01e9:
            boolean r6 = r13.mo59406k()
            if (r6 == 0) goto L_0x01fb
            hn.c r6 = new hn.c
            com.google.firebase.perf.v1.NetworkRequestMetric r7 = r13.mo59407l()
            r6.<init>(r7, r14)
            r0.add(r6)
        L_0x01fb:
            boolean r14 = r13.mo59404E()
            if (r14 == 0) goto L_0x020d
            hn.a r14 = new hn.a
            com.google.firebase.perf.v1.c r6 = r13.mo59403D()
            r14.<init>(r6)
            r0.add(r14)
        L_0x020d:
            boolean r14 = r13.mo59405j()
            if (r14 == 0) goto L_0x021f
            hn.b r14 = new hn.b
            com.google.firebase.perf.v1.f r6 = r13.mo59410q()
            r14.<init>(r6)
            r0.add(r14)
        L_0x021f:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L_0x022f
            fn.a r14 = p568fn.C17781a.m29823d()
            java.lang.String r0 = "No validators found for PerfMetric."
            r14.mo69014a(r0)
            goto L_0x0245
        L_0x022f:
            java.util.Iterator r14 = r0.iterator()
        L_0x0233:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0247
            java.lang.Object r0 = r14.next()
            hn.e r0 = (p584hn.C17834e) r0
            boolean r0 = r0.mo69066a()
            if (r0 != 0) goto L_0x0233
        L_0x0245:
            r14 = r5
            goto L_0x0248
        L_0x0247:
            r14 = r4
        L_0x0248:
            if (r14 != 0) goto L_0x025b
            fn.a r14 = f39881s
            java.lang.String r0 = "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = m30707c(r13)
            r6[r5] = r7
            r14.mo69019g(r0, r6)
            goto L_0x0460
        L_0x025b:
            ln.c r14 = r12.f39894m
            r14.getClass()
            boolean r0 = r13.mo59408o()
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            if (r0 == 0) goto L_0x0306
            com.google.firebase.perf.config.a r0 = r14.f39858a
            r0.getClass()
            java.lang.Class<com.google.firebase.perf.config.r> r7 = com.google.firebase.perf.config.C16611r.class
            monitor-enter(r7)
            com.google.firebase.perf.config.r r8 = com.google.firebase.perf.config.C16611r.f36848e     // Catch:{ all -> 0x0303 }
            if (r8 != 0) goto L_0x027f
            com.google.firebase.perf.config.r r8 = new com.google.firebase.perf.config.r     // Catch:{ all -> 0x0303 }
            r8.<init>()     // Catch:{ all -> 0x0303 }
            com.google.firebase.perf.config.C16611r.f36848e = r8     // Catch:{ all -> 0x0303 }
        L_0x027f:
            com.google.firebase.perf.config.r r8 = com.google.firebase.perf.config.C16611r.f36848e     // Catch:{ all -> 0x0303 }
            monitor-exit(r7)
            com.google.firebase.perf.config.RemoteConfigManager r7 = r0.f36829a
            r8.getClass()
            java.lang.String r9 = "fpr_vc_trace_sampling_rate"
            com.google.firebase.perf.util.c r7 = r7.getFloat(r9)
            boolean r9 = r7.mo59369b()
            if (r9 == 0) goto L_0x02bf
            java.lang.Object r9 = r7.mo59368a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            boolean r9 = com.google.firebase.perf.config.C16594a.m27427p(r9)
            if (r9 == 0) goto L_0x02bf
            com.google.firebase.perf.config.s r0 = r0.f36831c
            java.lang.String r8 = "com.google.firebase.perf.TraceSamplingRate"
            java.lang.Object r9 = r7.mo59368a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r0.mo59262d(r8, r9)
            java.lang.Object r0 = r7.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x02e8
        L_0x02bf:
            com.google.firebase.perf.util.c r0 = r0.mo59249b(r8)
            boolean r7 = r0.mo59369b()
            if (r7 == 0) goto L_0x02e4
            java.lang.Object r7 = r0.mo59368a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = com.google.firebase.perf.config.C16594a.m27427p(r7)
            if (r7 == 0) goto L_0x02e4
            java.lang.Object r0 = r0.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x02e8
        L_0x02e4:
            float r0 = r6.floatValue()
        L_0x02e8:
            float r7 = r14.f39859b
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f0
            r0 = r4
            goto L_0x02f1
        L_0x02f0:
            r0 = r5
        L_0x02f1:
            if (r0 != 0) goto L_0x0306
            com.google.firebase.perf.v1.i r0 = r13.mo59409p()
            com.google.protobuf.v$f r0 = r0.mo59419O()
            boolean r0 = p616ln.C18204c.m30703a(r0)
            if (r0 != 0) goto L_0x0306
            goto L_0x0405
        L_0x0303:
            r13 = move-exception
            monitor-exit(r7)
            throw r13
        L_0x0306:
            boolean r0 = r13.mo59406k()
            if (r0 == 0) goto L_0x03a5
            com.google.firebase.perf.config.a r0 = r14.f39858a
            r0.getClass()
            java.lang.Class<com.google.firebase.perf.config.f> r7 = com.google.firebase.perf.config.C16599f.class
            monitor-enter(r7)
            com.google.firebase.perf.config.f r8 = com.google.firebase.perf.config.C16599f.f36836e     // Catch:{ all -> 0x03a2 }
            if (r8 != 0) goto L_0x031f
            com.google.firebase.perf.config.f r8 = new com.google.firebase.perf.config.f     // Catch:{ all -> 0x03a2 }
            r8.<init>()     // Catch:{ all -> 0x03a2 }
            com.google.firebase.perf.config.C16599f.f36836e = r8     // Catch:{ all -> 0x03a2 }
        L_0x031f:
            com.google.firebase.perf.config.f r8 = com.google.firebase.perf.config.C16599f.f36836e     // Catch:{ all -> 0x03a2 }
            monitor-exit(r7)
            com.google.firebase.perf.config.RemoteConfigManager r7 = r0.f36829a
            r8.getClass()
            java.lang.String r9 = "fpr_vc_network_request_sampling_rate"
            com.google.firebase.perf.util.c r7 = r7.getFloat(r9)
            boolean r9 = r7.mo59369b()
            if (r9 == 0) goto L_0x035f
            java.lang.Object r9 = r7.mo59368a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            boolean r9 = com.google.firebase.perf.config.C16594a.m27427p(r9)
            if (r9 == 0) goto L_0x035f
            com.google.firebase.perf.config.s r0 = r0.f36831c
            java.lang.String r6 = "com.google.firebase.perf.NetworkRequestSamplingRate"
            java.lang.Object r8 = r7.mo59368a()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r0.mo59262d(r6, r8)
            java.lang.Object r0 = r7.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0388
        L_0x035f:
            com.google.firebase.perf.util.c r0 = r0.mo59249b(r8)
            boolean r7 = r0.mo59369b()
            if (r7 == 0) goto L_0x0384
            java.lang.Object r7 = r0.mo59368a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = com.google.firebase.perf.config.C16594a.m27427p(r7)
            if (r7 == 0) goto L_0x0384
            java.lang.Object r0 = r0.mo59368a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0388
        L_0x0384:
            float r0 = r6.floatValue()
        L_0x0388:
            float r6 = r14.f39859b
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0390
            r0 = r4
            goto L_0x0391
        L_0x0390:
            r0 = r5
        L_0x0391:
            if (r0 != 0) goto L_0x03a5
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r13.mo59407l()
            com.google.protobuf.v$f r0 = r0.mo59374R()
            boolean r0 = p616ln.C18204c.m30703a(r0)
            if (r0 != 0) goto L_0x03a5
            goto L_0x0405
        L_0x03a2:
            r13 = move-exception
            monitor-exit(r7)
            throw r13
        L_0x03a5:
            boolean r0 = r13.mo59408o()
            if (r0 == 0) goto L_0x03de
            com.google.firebase.perf.v1.i r0 = r13.mo59409p()
            java.lang.String r0 = r0.mo59418N()
            com.google.firebase.perf.util.Constants$TraceNames r6 = com.google.firebase.perf.util.Constants$TraceNames.FOREGROUND_TRACE_NAME
            java.lang.String r6 = r6.toString()
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x03d3
            com.google.firebase.perf.v1.i r0 = r13.mo59409p()
            java.lang.String r0 = r0.mo59418N()
            com.google.firebase.perf.util.Constants$TraceNames r6 = com.google.firebase.perf.util.Constants$TraceNames.BACKGROUND_TRACE_NAME
            java.lang.String r6 = r6.toString()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x03de
        L_0x03d3:
            com.google.firebase.perf.v1.i r0 = r13.mo59409p()
            int r0 = r0.mo59414I()
            if (r0 <= 0) goto L_0x03de
            goto L_0x03e4
        L_0x03de:
            boolean r0 = r13.mo59405j()
            if (r0 == 0) goto L_0x03e6
        L_0x03e4:
            r0 = r5
            goto L_0x03e7
        L_0x03e6:
            r0 = r4
        L_0x03e7:
            if (r0 != 0) goto L_0x03eb
            r14 = r4
            goto L_0x0406
        L_0x03eb:
            boolean r0 = r13.mo59406k()
            if (r0 == 0) goto L_0x03f8
            ln.c$a r14 = r14.f39861d
            boolean r14 = r14.mo69734a()
            goto L_0x0406
        L_0x03f8:
            boolean r0 = r13.mo59408o()
            if (r0 == 0) goto L_0x0405
            ln.c$a r14 = r14.f39860c
            boolean r14 = r14.mo69734a()
            goto L_0x0406
        L_0x0405:
            r14 = r5
        L_0x0406:
            if (r14 != 0) goto L_0x0462
            boolean r14 = r13.mo59408o()
            r6 = 1
            if (r14 == 0) goto L_0x041c
            com.google.firebase.perf.application.AppStateMonitor r14 = r12.f39895n
            com.google.firebase.perf.util.Constants$CounterNames r0 = com.google.firebase.perf.util.Constants$CounterNames.TRACE_EVENT_RATE_LIMITED
            java.lang.String r0 = r0.toString()
            r14.incrementCount(r0, r6)
            goto L_0x042d
        L_0x041c:
            boolean r14 = r13.mo59406k()
            if (r14 == 0) goto L_0x042d
            com.google.firebase.perf.application.AppStateMonitor r14 = r12.f39895n
            com.google.firebase.perf.util.Constants$CounterNames r0 = com.google.firebase.perf.util.Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED
            java.lang.String r0 = r0.toString()
            r14.incrementCount(r0, r6)
        L_0x042d:
            boolean r14 = r13.mo59408o()
            if (r14 == 0) goto L_0x0447
            fn.a r14 = f39881s
            java.lang.String r0 = "Rate Limited - %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.google.firebase.perf.v1.i r7 = r13.mo59409p()
            java.lang.String r7 = m30706b(r7)
            r6[r5] = r7
            r14.mo69017e(r0, r6)
            goto L_0x0460
        L_0x0447:
            boolean r14 = r13.mo59406k()
            if (r14 == 0) goto L_0x0460
            fn.a r14 = f39881s
            java.lang.String r0 = "Rate Limited - %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.google.firebase.perf.v1.NetworkRequestMetric r7 = r13.mo59407l()
            java.lang.String r7 = m30705a(r7)
            r6[r5] = r7
            r14.mo69017e(r0, r6)
        L_0x0460:
            r14 = r5
            goto L_0x0463
        L_0x0462:
            r14 = r4
        L_0x0463:
            if (r14 == 0) goto L_0x051d
            boolean r14 = r13.mo59408o()
            if (r14 == 0) goto L_0x04c2
            fn.a r14 = f39881s
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r6 = m30707c(r13)
            r0[r5] = r6
            com.google.firebase.perf.v1.i r6 = r13.mo59409p()
            java.lang.String r6 = r6.mo59418N()
            java.lang.String r7 = "_st_"
            boolean r7 = r6.startsWith(r7)
            java.lang.String r8 = "android-ide"
            java.lang.String r9 = "perf-android-sdk"
            if (r7 == 0) goto L_0x04a2
            java.lang.String r7 = r12.f39898q
            java.lang.String r10 = r12.f39897p
            java.lang.String r7 = kotlinx.coroutines.C19543e0.m33303U(r7, r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r7
            r3[r4] = r6
            r3[r2] = r9
            r3[r1] = r8
            java.lang.String r1 = "%s/metrics/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            goto L_0x04ba
        L_0x04a2:
            java.lang.String r7 = r12.f39898q
            java.lang.String r10 = r12.f39897p
            java.lang.String r7 = kotlinx.coroutines.C19543e0.m33303U(r7, r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r5] = r7
            r3[r4] = r6
            r3[r2] = r9
            r3[r1] = r8
            java.lang.String r1 = "%s/metrics/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
        L_0x04ba:
            r0[r4] = r1
            java.lang.String r1 = "Logging %s. In a minute, visit the Firebase console to view your data: %s"
            r14.mo69017e(r1, r0)
            goto L_0x04d1
        L_0x04c2:
            fn.a r14 = f39881s
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = m30707c(r13)
            r0[r5] = r1
            java.lang.String r1 = "Logging %s"
            r14.mo69017e(r1, r0)
        L_0x04d1:
            ln.a r14 = r12.f39890i
            com.google.android.datatransport.d<com.google.firebase.perf.v1.g> r0 = r14.f39855c
            if (r0 != 0) goto L_0x04fd
            ym.a<com.google.android.datatransport.e> r0 = r14.f39854b
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.e r0 = (com.google.android.datatransport.C6518e) r0
            if (r0 == 0) goto L_0x04f6
            java.lang.String r1 = r14.f39853a
            com.google.android.datatransport.a r2 = new com.google.android.datatransport.a
            java.lang.String r3 = "proto"
            r2.<init>(r3)
            android.support.v4.media.e r3 = new android.support.v4.media.e
            r3.<init>()
            com.google.android.datatransport.runtime.r r0 = r0.mo18642a(r1, r2, r3)
            r14.f39855c = r0
            goto L_0x04fd
        L_0x04f6:
            fn.a r0 = p616ln.C18202a.f39852d
            java.lang.String r1 = "Flg TransportFactory is not available at the moment"
            r0.mo69018f(r1)
        L_0x04fd:
            com.google.android.datatransport.d<com.google.firebase.perf.v1.g> r14 = r14.f39855c
            if (r14 == 0) goto L_0x0502
            goto L_0x0503
        L_0x0502:
            r4 = r5
        L_0x0503:
            if (r4 != 0) goto L_0x050d
            fn.a r13 = p616ln.C18202a.f39852d
            java.lang.String r14 = "Unable to dispatch event because Flg Transport is not available"
            r13.mo69018f(r14)
            goto L_0x0516
        L_0x050d:
            com.google.android.datatransport.b r13 = com.google.android.datatransport.C6494b.ofData(r13)
            com.google.android.datatransport.runtime.r r14 = (com.google.android.datatransport.runtime.C6559r) r14
            r14.mo18729a(r13)
        L_0x0516:
            com.google.firebase.perf.session.SessionManager r13 = com.google.firebase.perf.session.SessionManager.getInstance()
            r13.updatePerfSessionIfExpired()
        L_0x051d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p616ln.C18208f.mo69737d(com.google.firebase.perf.v1.g$b, com.google.firebase.perf.v1.ApplicationProcessState):void");
    }

    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.f39899r = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (this.f39885d.get()) {
            this.f39891j.execute(new C1864q(this, 7));
        }
    }
}
