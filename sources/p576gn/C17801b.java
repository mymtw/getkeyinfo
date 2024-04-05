package p576gn;

import com.google.firebase.perf.application.C16592a;
import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.List;
import p568fn.C17781a;
import p599jn.C18038a;
import p616ln.C18208f;

/* renamed from: gn.b */
public final class C17801b extends C16592a implements C18038a {

    /* renamed from: j */
    public static final C17781a f38696j = C17781a.m29823d();

    /* renamed from: b */
    public final List<PerfSession> f38697b;

    /* renamed from: c */
    public final GaugeManager f38698c;

    /* renamed from: d */
    public final C18208f f38699d;

    /* renamed from: e */
    public final NetworkRequestMetric.C16642b f38700e = NetworkRequestMetric.m27514g0();

    /* renamed from: f */
    public final WeakReference<C18038a> f38701f = new WeakReference<>(this);

    /* renamed from: g */
    public String f38702g;

    /* renamed from: h */
    public boolean f38703h;

    /* renamed from: i */
    public boolean f38704i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17801b(p616ln.C18208f r3) {
        /*
            r2 = this;
            com.google.firebase.perf.application.AppStateMonitor r0 = com.google.firebase.perf.application.AppStateMonitor.getInstance()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r2.<init>(r0)
            com.google.firebase.perf.v1.NetworkRequestMetric$b r0 = com.google.firebase.perf.p530v1.NetworkRequestMetric.m27514g0()
            r2.f38700e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.f38701f = r0
            r2.f38699d = r3
            r2.f38698c = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.f38697b = r3
            r2.registerForAppState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p576gn.C17801b.<init>(ln.f):void");
    }

    /* renamed from: b */
    public static C17801b m29927b(C18208f fVar) {
        return new C17801b(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69034a() {
        /*
            r7 = this;
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()
            java.lang.ref.WeakReference<jn.a> r1 = r7.f38701f
            r0.unregisterForSessionUpdates(r1)
            r7.unregisterForAppState()
            java.util.List<com.google.firebase.perf.session.PerfSession> r0 = r7.f38697b
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            java.util.List<com.google.firebase.perf.session.PerfSession> r2 = r7.f38697b     // Catch:{ all -> 0x0094 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0094 }
        L_0x001a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0094 }
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0094 }
            com.google.firebase.perf.session.PerfSession r3 = (com.google.firebase.perf.session.PerfSession) r3     // Catch:{ all -> 0x0094 }
            if (r3 == 0) goto L_0x001a
            r1.add(r3)     // Catch:{ all -> 0x0094 }
            goto L_0x001a
        L_0x002c:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            com.google.firebase.perf.v1.h[] r0 = com.google.firebase.perf.session.PerfSession.buildAndSort(r1)
            if (r0 == 0) goto L_0x0047
            com.google.firebase.perf.v1.NetworkRequestMetric$b r1 = r7.f38700e
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.mo59761u()
            MessageType r1 = r1.f37158c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = (com.google.firebase.perf.p530v1.NetworkRequestMetric) r1
            com.google.firebase.perf.p530v1.NetworkRequestMetric.m27509J(r1, r0)
        L_0x0047:
            com.google.firebase.perf.v1.NetworkRequestMetric$b r0 = r7.f38700e
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo59759s()
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = (com.google.firebase.perf.p530v1.NetworkRequestMetric) r0
            java.lang.String r1 = r7.f38702g
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.regex.Pattern r3 = p592in.C17876h.f38820a
            java.util.regex.Matcher r1 = r3.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            r1 = 0
            goto L_0x0066
        L_0x0063:
            java.util.regex.Pattern r1 = p592in.C17876h.f38820a
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 != 0) goto L_0x0070
            fn.a r0 = f38696j
            java.lang.String r1 = "Dropping network request from a 'User-Agent' that is not allowed"
            r0.mo69014a(r1)
            return
        L_0x0070:
            boolean r1 = r7.f38703h
            if (r1 != 0) goto L_0x0088
            ln.f r1 = r7.f38699d
            com.google.firebase.perf.v1.ApplicationProcessState r3 = r7.getAppState()
            java.util.concurrent.ThreadPoolExecutor r4 = r1.f39891j
            androidx.emoji2.text.f r5 = new androidx.emoji2.text.f
            r6 = 3
            r5.<init>(r1, r6, r0, r3)
            r4.execute(r5)
            r7.f38703h = r2
            return
        L_0x0088:
            boolean r0 = r7.f38704i
            if (r0 == 0) goto L_0x0093
            fn.a r0 = f38696j
            java.lang.String r1 = "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response"
            r0.mo69014a(r1)
        L_0x0093:
            return
        L_0x0094:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p576gn.C17801b.mo69034a():void");
    }

    /* renamed from: c */
    public final void mo69035c(String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod2 = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case 8:
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            NetworkRequestMetric.C16642b bVar = this.f38700e;
            bVar.mo59761u();
            NetworkRequestMetric.m27510K((NetworkRequestMetric) bVar.f37158c, httpMethod);
        }
    }

    /* renamed from: d */
    public final void mo69036d(int i) {
        NetworkRequestMetric.C16642b bVar = this.f38700e;
        bVar.mo59761u();
        NetworkRequestMetric.m27501B((NetworkRequestMetric) bVar.f37158c, i);
    }

    /* renamed from: e */
    public final void mo69037e(long j) {
        NetworkRequestMetric.C16642b bVar = this.f38700e;
        bVar.mo59761u();
        NetworkRequestMetric.m27511L((NetworkRequestMetric) bVar.f37158c, j);
    }

    /* renamed from: f */
    public final void mo69038f(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f38701f);
        NetworkRequestMetric.C16642b bVar = this.f38700e;
        bVar.mo59761u();
        NetworkRequestMetric.m27504E((NetworkRequestMetric) bVar.f37158c, j);
        updateSession(perfSession);
        if (perfSession.isGaugeAndEventCollectionEnabled()) {
            this.f38698c.collectGaugeMetricOnce(perfSession.getTimer());
        }
    }

    /* renamed from: g */
    public final void mo69039g(String str) {
        if (str == null) {
            NetworkRequestMetric.C16642b bVar = this.f38700e;
            bVar.mo59761u();
            NetworkRequestMetric.m27503D((NetworkRequestMetric) bVar.f37158c);
            return;
        }
        boolean z = false;
        if (str.length() <= 128) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt > 127) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            NetworkRequestMetric.C16642b bVar2 = this.f38700e;
            bVar2.mo59761u();
            NetworkRequestMetric.m27502C((NetworkRequestMetric) bVar2.f37158c, str);
            return;
        }
        f38696j.mo69018f("The content type of the response is not a valid content-type:" + str);
    }

    /* renamed from: h */
    public final void mo69040h(long j) {
        NetworkRequestMetric.C16642b bVar = this.f38700e;
        bVar.mo59761u();
        NetworkRequestMetric.m27512M((NetworkRequestMetric) bVar.f37158c, j);
    }

    /* renamed from: i */
    public final void mo69041i(long j) {
        NetworkRequestMetric.C16642b bVar = this.f38700e;
        bVar.mo59761u();
        NetworkRequestMetric.m27507H((NetworkRequestMetric) bVar.f37158c, j);
        if (SessionManager.getInstance().perfSession().isGaugeAndEventCollectionEnabled()) {
            this.f38698c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().getTimer());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r0 = r14.lastIndexOf(47, 1999);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69042j(java.lang.String r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0094
            okhttp3.p$b r0 = okhttp3.C19997p.f44238l
            r0.getClass()
            r0 = 0
            okhttp3.p r1 = okhttp3.C19997p.C19999b.m34234c(r14)     // Catch:{ IllegalArgumentException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r1 == 0) goto L_0x0046
            okhttp3.p$a r14 = r1.mo72970f()
            okhttp3.p$b r12 = okhttp3.C19997p.f44238l
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 251(0xfb, float:3.52E-43)
            java.lang.String r2 = ""
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            r1 = r12
            java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.f44250b = r1
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 251(0xfb, float:3.52E-43)
            java.lang.String r2 = ""
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            r1 = r12
            java.lang.String r1 = okhttp3.C19997p.C19999b.m34232a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.f44251c = r1
            r14.f44255g = r0
            r14.f44256h = r0
            java.lang.String r14 = r14.toString()
        L_0x0046:
            com.google.firebase.perf.v1.NetworkRequestMetric$b r1 = r13.f38700e
            r2 = 2000(0x7d0, float:2.803E-42)
            int r3 = r14.length()
            if (r3 > r2) goto L_0x0051
            goto L_0x008a
        L_0x0051:
            char r3 = r14.charAt(r2)
            r4 = 47
            r5 = 0
            if (r3 != r4) goto L_0x005f
            java.lang.String r14 = r14.substring(r5, r2)
            goto L_0x008a
        L_0x005f:
            okhttp3.p$b r3 = okhttp3.C19997p.f44238l
            r3.getClass()
            okhttp3.p r0 = okhttp3.C19997p.C19999b.m34234c(r14)     // Catch:{ IllegalArgumentException -> 0x0068 }
        L_0x0068:
            if (r0 != 0) goto L_0x006f
            java.lang.String r14 = r14.substring(r5, r2)
            goto L_0x008a
        L_0x006f:
            java.lang.String r0 = r0.mo72965b()
            int r0 = r0.lastIndexOf(r4)
            if (r0 < 0) goto L_0x0086
            r0 = 1999(0x7cf, float:2.801E-42)
            int r0 = r14.lastIndexOf(r4, r0)
            if (r0 < 0) goto L_0x0086
            java.lang.String r14 = r14.substring(r5, r0)
            goto L_0x008a
        L_0x0086:
            java.lang.String r14 = r14.substring(r5, r2)
        L_0x008a:
            r1.mo59761u()
            MessageType r0 = r1.f37158c
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = (com.google.firebase.perf.p530v1.NetworkRequestMetric) r0
            com.google.firebase.perf.p530v1.NetworkRequestMetric.m27516z(r0, r14)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p576gn.C17801b.mo69042j(java.lang.String):void");
    }

    public final void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            f38696j.mo69018f("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (((NetworkRequestMetric) this.f38700e.f37158c).mo59381Y() && !((NetworkRequestMetric) this.f38700e.f37158c).mo59387e0()) {
            this.f38697b.add(perfSession);
        }
    }
}
