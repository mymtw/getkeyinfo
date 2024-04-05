package com.etsy.android.lib.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p306z8.C8480g;
import p402n9.C13087g;
import p409o9.C13127g;
import p409o9.C13128h;
import p409o9.C13130j;
import p409o9.C13138q;
import p456ua.C13461f;
import p634np.C18289a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.lib.config.a */
public final class C8591a {

    /* renamed from: r */
    public static final List<String> f18700r = Arrays.asList(new String[]{"test_name", ResponseConstants.ENABLED, "selector", "pes"});

    /* renamed from: a */
    public String f18701a;

    /* renamed from: b */
    public boolean f18702b;

    /* renamed from: c */
    public final String f18703c;

    /* renamed from: d */
    public final String f18704d;

    /* renamed from: e */
    public final String f18705e;

    /* renamed from: f */
    public C8623e f18706f = null;

    /* renamed from: g */
    public boolean f18707g = false;

    /* renamed from: h */
    public SharedPreferences f18708h;

    /* renamed from: i */
    public String f18709i;

    /* renamed from: j */
    public final Object f18710j = new Object();

    /* renamed from: k */
    public final String f18711k;

    /* renamed from: l */
    public final String f18712l;

    /* renamed from: m */
    public ConsumerSingleObserver f18713m;

    /* renamed from: n */
    public final C13138q f18714n;

    /* renamed from: o */
    public final C18289a<C13128h> f18715o;

    /* renamed from: p */
    public final C13461f f18716p;

    /* renamed from: q */
    public final C8674c f18717q;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C8591a(android.content.Context r7, p409o9.C13135n r8, p409o9.C13138q r9, com.etsy.android.lib.logger.C8674c r10, p634np.C18289a<p409o9.C13128h> r11, p456ua.C13461f r12) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f18706f = r0
            r1 = 0
            r6.f18707g = r1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r6.f18710j = r2
            r6.f18714n = r9
            r6.f18715o = r11
            r6.f18716p = r12
            r6.f18717q = r10
            android.content.res.Resources r9 = r7.getResources()
            r10 = 2131951921(0x7f130131, float:1.954027E38)
            java.lang.String r10 = r9.getString(r10)
            r6.f18703c = r10
            r11 = 2131951919(0x7f13012f, float:1.9540266E38)
            java.lang.String r11 = r9.getString(r11)
            r6.f18704d = r11
            r12 = 2131951908(0x7f130124, float:1.9540244E38)
            java.lang.String r12 = r9.getString(r12)
            r6.f18705e = r12
            r2 = 2131951914(0x7f13012a, float:1.9540256E38)
            r9.getString(r2)
            r2 = 2131951915(0x7f13012b, float:1.9540258E38)
            java.lang.String r2 = r9.getString(r2)
            r6.f18709i = r2
            r2 = 2131951902(0x7f13011e, float:1.9540232E38)
            java.lang.String r9 = r9.getString(r2)
            android.content.SharedPreferences r9 = r7.getSharedPreferences(r9, r1)
            r6.f18708h = r9
            monitor-enter(r6)
            r9 = 3
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x00a4 }
            r2[r1] = r10     // Catch:{ all -> 0x00a4 }
            r10 = 1
            r2[r10] = r11     // Catch:{ all -> 0x00a4 }
            r10 = 2
            r2[r10] = r12     // Catch:{ all -> 0x00a4 }
            r10 = r1
        L_0x0060:
            if (r10 >= r9) goto L_0x0094
            r11 = r2[r10]     // Catch:{ all -> 0x00a4 }
            android.content.SharedPreferences r12 = r6.f18708h     // Catch:{ all -> 0x00a4 }
            java.lang.String r12 = r12.getString(r11, r0)     // Catch:{ all -> 0x00a4 }
            if (r12 == 0) goto L_0x0091
            monitor-enter(r6)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = r6.mo21108f(r11)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "configs"
            java.io.File r4 = r7.getDir(r4, r1)     // Catch:{ all -> 0x008e }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x008e }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x008e }
            com.etsy.android.lib.util.C8919r.m17362g(r5, r12)     // Catch:{ all -> 0x008e }
            monitor-exit(r6)     // Catch:{ all -> 0x00a4 }
            android.content.SharedPreferences r12 = r6.f18708h     // Catch:{ all -> 0x00a4 }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ all -> 0x00a4 }
            android.content.SharedPreferences$Editor r11 = r12.remove(r11)     // Catch:{ all -> 0x00a4 }
            r11.apply()     // Catch:{ all -> 0x00a4 }
            goto L_0x0091
        L_0x008e:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a4 }
            throw r7     // Catch:{ all -> 0x00a4 }
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x0060
        L_0x0094:
            monitor-exit(r6)
            java.lang.String r9 = r8.f28885a
            r6.f18711k = r9
            java.lang.String r8 = r8.f28886b
            r6.f18712l = r8
            r6.mo21105b(r7)
            r6.mo21106d(r7, r0)
            return
        L_0x00a4:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.config.C8591a.<init>(android.content.Context, o9.n, o9.q, com.etsy.android.lib.logger.c, np.a, ua.f):void");
    }

    /* renamed from: a */
    public static boolean m16992a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.config_preferences_file_name), 0);
        String string = context.getString(R.string.config_prefs_vm);
        String string2 = sharedPreferences.getString(string, "");
        if (!TextUtils.isEmpty(string2) && !string2.equals(" root ")) {
            return false;
        }
        sharedPreferences.edit().putString(string, m16993c()).apply();
        return true;
    }

    /* renamed from: c */
    public static String m16993c() {
        return (!TextUtils.isEmpty("") ? "" : " root .vm.dev.etsycloud.com").replaceAll(" ", "");
    }

    /* renamed from: g */
    public static void m16994g(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            C8694h hVar = C8694h.f19097a;
            hVar.mo21306a("Problem Fetching config: " + message);
            return;
        }
        C8694h.f19097a.mo21306a("Problem Fetching config");
    }

    /* renamed from: b */
    public final void mo21105b(Context context) {
        Resources resources = context.getResources();
        this.f18701a = this.f18708h.getString(resources.getString(R.string.config_prefs_environment), this.f18703c);
        this.f18702b = this.f18708h.getBoolean(resources.getString(R.string.config_prefs_dev_proxy), false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        com.etsy.android.lib.logger.C8694h.f19097a.mo21306a("Error reading saved config from file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        r11 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21106d(android.content.Context r10, com.fasterxml.jackson.databind.JsonNode r11) {
        /*
            r9 = this;
            com.etsy.android.lib.config.EtsyConfigKey$Environment r0 = com.etsy.android.lib.config.EtsyConfigKey.Environment.PRODUCTION
            android.content.SharedPreferences r1 = r9.f18708h
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131951922(0x7f130132, float:1.9540272E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = m16993c()
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x0022
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
            goto L_0x0026
        L_0x0022:
            java.lang.String r1 = m16993c()
        L_0x0026:
            com.etsy.android.lib.config.c$a r2 = new com.etsy.android.lib.config.c$a
            java.lang.String r3 = r9.f18711k
            java.lang.String r4 = r9.f18712l
            r2.<init>(r1, r3, r4)
            java.lang.String r3 = r9.f18705e
            java.lang.String r4 = r9.f18701a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0049
            com.etsy.android.lib.config.EtsyConfigKey$Environment r0 = com.etsy.android.lib.config.EtsyConfigKey.Environment.DEVELOPMENT
            boolean r3 = r9.f18702b
            if (r3 != 0) goto L_0x0055
            com.etsy.android.lib.config.c$a r2 = new com.etsy.android.lib.config.c$a
            java.lang.String r3 = "0l491asoic3251rbzpu6hk7b"
            java.lang.String r4 = "twc1vnfwcq"
            r2.<init>(r1, r3, r4)
            goto L_0x0055
        L_0x0049:
            java.lang.String r1 = r9.f18704d
            java.lang.String r3 = r9.f18701a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            com.etsy.android.lib.config.EtsyConfigKey$Environment r0 = com.etsy.android.lib.config.EtsyConfigKey.Environment.PRINCESS
        L_0x0055:
            r1 = 0
            r3 = 0
            if (r11 != 0) goto L_0x008a
            java.lang.String r11 = r9.f18701a
            monitor-enter(r9)
            java.lang.String r11 = r9.mo21108f(r11)     // Catch:{ all -> 0x0087 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "configs"
            java.io.File r5 = r10.getDir(r5, r1)     // Catch:{ all -> 0x0087 }
            r4.<init>(r5, r11)     // Catch:{ all -> 0x0087 }
            boolean r11 = r4.exists()     // Catch:{ all -> 0x0087 }
            if (r11 != 0) goto L_0x0074
            monitor-exit(r9)
            r11 = r3
            goto L_0x008a
        L_0x0074:
            q9.i r11 = p425q9.C13258i.f29122d     // Catch:{ IOException -> 0x007d }
            com.fasterxml.jackson.databind.ObjectMapper r11 = r11.f29123a     // Catch:{ IOException -> 0x007d }
            com.fasterxml.jackson.databind.JsonNode r11 = r11.readTree((java.io.File) r4)     // Catch:{ IOException -> 0x007d }
            goto L_0x0085
        L_0x007d:
            com.etsy.android.lib.logger.h r11 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "Error reading saved config from file"
            r11.mo21306a(r4)     // Catch:{ all -> 0x0087 }
            r11 = r3
        L_0x0085:
            monitor-exit(r9)
            goto L_0x008a
        L_0x0087:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x008a:
            com.etsy.android.lib.config.e r4 = new com.etsy.android.lib.config.e
            com.etsy.android.lib.logger.c r5 = r9.f18717q
            com.etsy.android.lib.util.e0 r6 = new com.etsy.android.lib.util.e0
            r6.<init>()
            r4.<init>(r5, r6, r0, r2)
            java.util.HashMap<java.lang.String, o9.l> r0 = r4.f18943c     // Catch:{ JSONException -> 0x00ad }
            r0.clear()     // Catch:{ JSONException -> 0x00ad }
            r4.mo21131a(r11)     // Catch:{ IOException -> 0x00a2 }
            r4.mo21138h()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00fe
        L_0x00a2:
            r11 = move-exception
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r11 = r11.getMessage()     // Catch:{ JSONException -> 0x00ad }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x00ad }
            throw r0     // Catch:{ JSONException -> 0x00ad }
        L_0x00ad:
            r11 = move-exception
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r2 = "!!!!Problem building config map in etsyConfigMapInit() "
            r0.mo21309d(r2, r11)
            java.lang.String r11 = r9.f18701a
            monitor-enter(r9)
            java.lang.String r2 = "configs"
            java.io.File r10 = r10.getDir(r2, r1)     // Catch:{ all -> 0x0173 }
            java.lang.String r11 = r9.mo21108f(r11)     // Catch:{ all -> 0x0173 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0173 }
            r2.<init>(r10, r11)     // Catch:{ all -> 0x0173 }
            boolean r10 = r2.exists()     // Catch:{ all -> 0x0173 }
            if (r10 == 0) goto L_0x00e1
            boolean r10 = r2.delete()     // Catch:{ all -> 0x0173 }
            if (r10 != 0) goto L_0x00e1
            java.lang.String r10 = "Couldn't remove config file: %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0173 }
            r2[r1] = r11     // Catch:{ all -> 0x0173 }
            java.lang.String r10 = java.lang.String.format(r10, r2)     // Catch:{ all -> 0x0173 }
            r0.mo21306a(r10)     // Catch:{ all -> 0x0173 }
        L_0x00e1:
            monitor-exit(r9)
            java.util.HashMap<java.lang.String, o9.l> r10 = r4.f18943c     // Catch:{ JSONException -> 0x00f6 }
            r10.clear()     // Catch:{ JSONException -> 0x00f6 }
            r4.mo21138h()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00fe
        L_0x00eb:
            r10 = move-exception
            org.json.JSONException r11 = new org.json.JSONException     // Catch:{ JSONException -> 0x00f6 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ JSONException -> 0x00f6 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x00f6 }
            throw r11     // Catch:{ JSONException -> 0x00f6 }
        L_0x00f6:
            r10 = move-exception
            com.etsy.android.lib.util.CrashUtil r11 = com.etsy.android.lib.util.CrashUtil.m17307a()
            r11.mo30457b(r10)
        L_0x00fe:
            r9.f18706f = r4
            com.etsy.android.lib.util.CrashUtil r10 = com.etsy.android.lib.util.CrashUtil.m17307a()
            java.util.HashMap<java.lang.String, o9.l> r11 = r4.f18943c
            r10.getClass()
            com.etsy.android.lib.util.CrashUtil$CrashProvider[] r0 = com.etsy.android.lib.util.CrashUtil.CrashProvider.values()
            int r2 = r0.length
        L_0x010e:
            if (r1 >= r2) goto L_0x0172
            r4 = r0[r1]
            boolean r5 = r10.mo30461f(r4)
            if (r5 == 0) goto L_0x016f
            aa.c r4 = r4.getDelegate()
            aa.b r4 = (p307aa.C8495b) r4
            r4.getClass()
            java.lang.String r4 = "Config"
            com.bugsnag.android.u r5 = com.bugsnag.android.C5777k.m11576b()
            com.bugsnag.android.s1 r5 = r5.f12623b
            r5.getClass()
            com.bugsnag.android.r1 r6 = r5.f12604b
            r6.getClass()
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r6 = r6.f12468c
            r6.remove(r4)
            r5.mo16670a(r4, r3)
            if (r11 == 0) goto L_0x016f
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r11.size()
            int r6 = kotlin.reflect.C19421p.m32930T(r6)
            r5.<init>(r6)
            java.util.Set r6 = r11.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0150:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016c
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            o9.l r7 = (p409o9.C13132l) r7
            java.lang.String r7 = r7.f28871b
            r5.put(r8, r7)
            goto L_0x0150
        L_0x016c:
            com.bugsnag.android.C5777k.m11575a(r4, r5)
        L_0x016f:
            int r1 = r1 + 1
            goto L_0x010e
        L_0x0172:
            return
        L_0x0173:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.config.C8591a.mo21106d(android.content.Context, com.fasterxml.jackson.databind.JsonNode):void");
    }

    /* renamed from: e */
    public final void mo21107e(Context context) {
        C8694h.f19097a.mo21310e("forceImmediateAsyncServerConfigRefresh");
        synchronized (this.f18710j) {
            ConsumerSingleObserver consumerSingleObserver = this.f18713m;
            if (consumerSingleObserver != null) {
                consumerSingleObserver.dispose();
            }
            C13138q qVar = this.f18714n;
            String str = qVar.f28896b;
            String str2 = qVar.f28895a;
            C19383o.m32797g(str, ResponseConstants.VERSION);
            C19383o.m32797g(str2, "deviceUdid");
            C13128h hVar = this.f18715o.get();
            C8071s<C20145v<C19928a0>> a = hVar.f28860a.mo45832a("android", "EtsyInc", str, str2);
            C13087g gVar = new C13087g(hVar, 1);
            a.getClass();
            C19211l lVar = new C19211l(new C19208j(a, gVar), new C13127g(hVar, 0));
            this.f18716p.getClass();
            this.f18713m = lVar.mo20660i(C13461f.m21235b()).mo20658g(new C13130j(0, this, context), new C8480g(this, 1));
        }
    }

    /* renamed from: f */
    public final String mo21108f(String str) {
        if (this.f18703c.equals(str)) {
            return this.f18703c;
        }
        if (this.f18705e.equals(str)) {
            return this.f18705e;
        }
        if (this.f18704d.equals(str)) {
            return this.f18704d;
        }
        throw new IllegalArgumentException("Attempted to read configs with unknown environment");
    }

    /* renamed from: h */
    public final boolean mo21109h(Context context, long j) {
        C8694h hVar = C8694h.f19097a;
        hVar.mo21310e("refreshServerConfigIfStale");
        ConsumerSingleObserver consumerSingleObserver = this.f18713m;
        if (!(consumerSingleObserver != null && !consumerSingleObserver.isDisposed())) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f18708h.getLong(this.f18709i, 0);
            hVar.mo21310e("getConfigFetchedTime " + j2);
            boolean z = currentTimeMillis > j2 && currentTimeMillis - j2 >= j;
            hVar.mo21310e("requiresConfigUpdate " + z);
            if (z) {
                hVar.mo21310e("refreshServerConfigIfStale - it's stale!");
                mo21107e(context);
                return true;
            }
        }
        return false;
    }
}
