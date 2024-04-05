package p461uf;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import p325cg.C8587b;
import p325cg.C8588c;
import p365hg.C12845c0;
import p365hg.C12869i0;
import p365hg.C12876l;
import p365hg.C12879l0;
import p365hg.C12917y;
import p365hg.C12919z;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13421k;

/* renamed from: uf.h */
public final class C13511h {

    /* renamed from: c */
    public static final String f29561c;

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f29562d;

    /* renamed from: e */
    public static AppEventsLogger$FlushBehavior f29563e = AppEventsLogger$FlushBehavior.AUTO;

    /* renamed from: f */
    public static final Object f29564f = new Object();

    /* renamed from: g */
    public static String f29565g;

    /* renamed from: h */
    public static boolean f29566h;

    /* renamed from: i */
    public static final C13512a f29567i = new C13512a();

    /* renamed from: a */
    public final String f29568a;

    /* renamed from: b */
    public AccessTokenAppIdPair f29569b;

    /* renamed from: uf.h$a */
    public static final class C13512a {

        /* renamed from: uf.h$a$a */
        public static final class C13513a implements C12917y.C12918a {
            /* renamed from: a */
            public final void mo45683a(String str) {
                C13511h.f29567i.getClass();
                C13418j.m21106b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", str).apply();
            }
        }

        /* renamed from: uf.h$a$b */
        public static final class C13514b implements Runnable {

            /* renamed from: b */
            public static final C13514b f29570b = new C13514b();

            public final void run() {
                HashSet<String> hashSet;
                Class<C13503d> cls;
                Set<AccessTokenAppIdPair> set;
                if (!C13080a.m20762b(this)) {
                    try {
                        hashSet = new HashSet<>();
                        String str = C13503d.f29545a;
                        cls = C13503d.class;
                        set = null;
                        if (!C13080a.m20762b(cls)) {
                            set = C13503d.f29547c.mo1419r();
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(this, th);
                        return;
                    }
                    for (AccessTokenAppIdPair applicationId : set) {
                        hashSet.add(applicationId.getApplicationId());
                    }
                    for (String f : hashSet) {
                        FetchedAppSettingsManager.m20107f(f, true);
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079 A[Catch:{ all -> 0x0072, all -> 0x0086 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m21283a(p461uf.C13511h.C13512a r6, com.facebook.appevents.AppEvent r7, com.facebook.appevents.AccessTokenAppIdPair r8) {
            /*
                r6.getClass()
                java.lang.Class<uf.h> r6 = p461uf.C13511h.class
                java.lang.String r0 = p461uf.C13503d.f29545a
                java.lang.Class<uf.d> r0 = p461uf.C13503d.class
                boolean r1 = p401mg.C13080a.m20762b(r0)
                if (r1 == 0) goto L_0x0010
                goto L_0x0024
            L_0x0010:
                java.lang.String r1 = "accessTokenAppId"
                kotlin.jvm.internal.C19383o.m32797g(r8, r1)     // Catch:{ all -> 0x0020 }
                java.util.concurrent.ScheduledExecutorService r1 = p461uf.C13503d.f29548d     // Catch:{ all -> 0x0020 }
                uf.c r2 = new uf.c     // Catch:{ all -> 0x0020 }
                r2.<init>(r8, r7)     // Catch:{ all -> 0x0020 }
                r1.execute(r2)     // Catch:{ all -> 0x0020 }
                goto L_0x0024
            L_0x0020:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)
            L_0x0024:
                com.facebook.internal.FeatureManager$Feature r0 = com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing
                boolean r0 = com.facebook.internal.FeatureManager.m20100c(r0)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x008a
                boolean r0 = p325cg.C8588c.m16985a()
                if (r0 == 0) goto L_0x008a
                java.lang.String r8 = r8.getApplicationId()
                java.lang.Class<cg.c> r0 = p325cg.C8588c.class
                boolean r3 = p401mg.C13080a.m20762b(r0)
                if (r3 == 0) goto L_0x0041
                goto L_0x008a
            L_0x0041:
                java.lang.String r3 = "applicationId"
                kotlin.jvm.internal.C19383o.m32797g(r8, r3)     // Catch:{ all -> 0x0086 }
                cg.c r3 = p325cg.C8588c.f18692b     // Catch:{ all -> 0x0086 }
                r3.getClass()     // Catch:{ all -> 0x0086 }
                boolean r4 = p401mg.C13080a.m20762b(r3)     // Catch:{ all -> 0x0086 }
                if (r4 == 0) goto L_0x0052
                goto L_0x0076
            L_0x0052:
                boolean r4 = r7.isImplicit()     // Catch:{ all -> 0x0072 }
                if (r4 == 0) goto L_0x0066
                java.util.Set<java.lang.String> r4 = p325cg.C8588c.f18691a     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r7.getName()     // Catch:{ all -> 0x0072 }
                boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0072 }
                if (r4 == 0) goto L_0x0066
                r4 = r1
                goto L_0x0067
            L_0x0066:
                r4 = r2
            L_0x0067:
                boolean r3 = r7.isImplicit()     // Catch:{ all -> 0x0072 }
                r3 = r3 ^ r1
                if (r3 != 0) goto L_0x0070
                if (r4 == 0) goto L_0x0076
            L_0x0070:
                r3 = r1
                goto L_0x0077
            L_0x0072:
                r4 = move-exception
                p401mg.C13080a.m20761a(r3, r4)     // Catch:{ all -> 0x0086 }
            L_0x0076:
                r3 = r2
            L_0x0077:
                if (r3 == 0) goto L_0x008a
                java.util.concurrent.Executor r3 = p453tf.C13418j.m21108d()     // Catch:{ all -> 0x0086 }
                cg.a r4 = new cg.a     // Catch:{ all -> 0x0086 }
                r4.<init>(r8, r7)     // Catch:{ all -> 0x0086 }
                r3.execute(r4)     // Catch:{ all -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r8 = move-exception
                p401mg.C13080a.m20761a(r0, r8)
            L_0x008a:
                boolean r8 = r7.getIsImplicit()
                if (r8 != 0) goto L_0x00c8
                java.lang.String r8 = p461uf.C13511h.f29561c
                boolean r8 = p401mg.C13080a.m20762b(r6)
                if (r8 == 0) goto L_0x0099
                goto L_0x00a0
            L_0x0099:
                boolean r2 = p461uf.C13511h.f29566h     // Catch:{ all -> 0x009c }
                goto L_0x00a0
            L_0x009c:
                r8 = move-exception
                p401mg.C13080a.m20761a(r6, r8)
            L_0x00a0:
                if (r2 != 0) goto L_0x00c8
                java.lang.String r7 = r7.getName()
                java.lang.String r8 = "fb_mobile_activate_app"
                boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
                if (r7 == 0) goto L_0x00bd
                boolean r7 = p401mg.C13080a.m20762b(r6)
                if (r7 == 0) goto L_0x00b5
                goto L_0x00c8
            L_0x00b5:
                p461uf.C13511h.f29566h = r1     // Catch:{ all -> 0x00b8 }
                goto L_0x00c8
            L_0x00b8:
                r7 = move-exception
                p401mg.C13080a.m20761a(r6, r7)
                goto L_0x00c8
            L_0x00bd:
                hg.c0$a r6 = p365hg.C12845c0.f28334f
                com.facebook.LoggingBehavior r7 = com.facebook.LoggingBehavior.APP_EVENTS
                java.lang.String r8 = "AppEvents"
                java.lang.String r0 = "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events."
                r6.mo45626b(r7, r8, r0)
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p461uf.C13511h.C13512a.m21283a(uf.h$a, com.facebook.appevents.AppEvent, com.facebook.appevents.AccessTokenAppIdPair):void");
        }

        /* renamed from: b */
        public static void m21284b(Application application, String str) {
            Class<C8588c> cls;
            if (C13418j.m21113i()) {
                if (!C13501b.f29541d) {
                    C13511h.f29567i.getClass();
                    if (C13511h.m21277b() == null) {
                        m21287e();
                    }
                    ScheduledThreadPoolExecutor b = C13511h.m21277b();
                    if (b != null) {
                        b.execute(C13500a.f29537b);
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                String str2 = C13523p.f29584a;
                Class<C13523p> cls2 = C13523p.class;
                if (!C13080a.m20762b(cls2)) {
                    try {
                        if (!C13523p.f29586c.get()) {
                            C13523p.f29589f.mo46183b();
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(cls2, th);
                    }
                }
                if (str == null) {
                    str = C13418j.m21107c();
                }
                Class<C13418j> cls3 = C13418j.class;
                if (!C13080a.m20762b(cls3)) {
                    try {
                        C13418j.m21108d().execute(new C13421k(application.getApplicationContext(), str));
                        if (FeatureManager.m20100c(FeatureManager.Feature.OnDeviceEventProcessing) && C8588c.m16985a()) {
                            cls = C8588c.class;
                            if (!C13080a.m20762b(cls)) {
                                Context b2 = C13418j.m21106b();
                                if (b2 != null) {
                                    C13418j.m21108d().execute(new C8587b(b2, str));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        C13080a.m20761a(cls3, th2);
                    }
                }
                ActivityLifecycleTracker.m20068b(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }

        /* renamed from: c */
        public static AppEventsLogger$FlushBehavior m21285c() {
            AppEventsLogger$FlushBehavior appEventsLogger$FlushBehavior;
            synchronized (C13511h.m21278c()) {
                Class<C13511h> cls = C13511h.class;
                appEventsLogger$FlushBehavior = null;
                if (!C13080a.m20762b(cls)) {
                    try {
                        appEventsLogger$FlushBehavior = C13511h.f29563e;
                    } catch (Throwable th) {
                        C13080a.m20761a(cls, th);
                    }
                }
            }
            return appEventsLogger$FlushBehavior;
        }

        /* renamed from: d */
        public static String m21286d() {
            C13513a aVar = new C13513a();
            if (!C13418j.m21106b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(C13418j.m21106b()).build();
                try {
                    build.startConnection(new C12919z(build, aVar));
                } catch (Exception unused) {
                }
            }
            return C13418j.m21106b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
            r3 = p461uf.C13511h.C13512a.C13514b.f29570b;
            r2 = p461uf.C13511h.m21277b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            if (r2 == null) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
            r2.scheduleAtFixedRate(r3, 0, (long) 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m21287e() {
            /*
                java.lang.Object r0 = p461uf.C13511h.m21278c()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = p461uf.C13511h.m21277b()     // Catch:{ all -> 0x0046 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0046 }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x0046 }
                java.lang.Class<uf.h> r2 = p461uf.C13511h.class
                boolean r3 = p401mg.C13080a.m20762b(r2)     // Catch:{ all -> 0x0046 }
                if (r3 == 0) goto L_0x001c
                goto L_0x0023
            L_0x001c:
                p461uf.C13511h.f29562d = r1     // Catch:{ all -> 0x001f }
                goto L_0x0023
            L_0x001f:
                r1 = move-exception
                p401mg.C13080a.m20761a(r2, r1)     // Catch:{ all -> 0x0046 }
            L_0x0023:
                kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)
                uf.h$a$b r3 = p461uf.C13511h.C13512a.C13514b.f29570b
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = p461uf.C13511h.m21277b()
                if (r2 == 0) goto L_0x003a
                r4 = 0
                r0 = 86400(0x15180, float:1.21072E-40)
                long r6 = (long) r0
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x003a:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0046:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p461uf.C13511h.C13512a.m21287e():void");
        }
    }

    static {
        String canonicalName = C13511h.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f29561c = canonicalName;
    }

    public C13511h(String str, String str2) {
        C19383o.m32797g(str, "activityName");
        C12879l0.m20603g();
        this.f29568a = str;
        AccessToken.Companion.getClass();
        AccessToken d = AccessToken.C12174c.m19981d();
        if (d == null || d.isExpired() || (str2 != null && !C19383o.m32792b(str2, d.getApplicationId()))) {
            if (str2 == null) {
                Context b = C13418j.m21106b();
                int i = C12869i0.f28368a;
                C12879l0.m20601e(b, ResponseConstants.CONTEXT);
                str2 = C13418j.m21107c();
            }
            this.f29569b = new AccessTokenAppIdPair((String) null, str2);
        } else {
            this.f29569b = new AccessTokenAppIdPair(d);
        }
        f29567i.getClass();
        C13512a.m21287e();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m21276a() {
        Class<C13511h> cls = C13511h.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f29565g;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m21277b() {
        Class<C13511h> cls = C13511h.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f29562d;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m21278c() {
        Class<C13511h> cls = C13511h.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f29564f;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo46168d(Bundle bundle, String str) {
        if (!C13080a.m20762b(this)) {
            try {
                mo46169e(str, (Double) null, bundle, false, ActivityLifecycleTracker.m20067a());
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: e */
    public final void mo46169e(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (!C13080a.m20762b(this) && str != null) {
            try {
                if (!(str.length() == 0)) {
                    if (C12876l.m20592b("app_events_killswitch", C13418j.m21107c(), false)) {
                        C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                    } else {
                        C13512a.m21283a(f29567i, new AppEvent(this.f29568a, str, d, bundle, z, ActivityLifecycleTracker.f27302j == 0, uuid), this.f29569b);
                    }
                }
            } catch (JSONException e) {
                C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: f */
    public final void mo46170f(String str, Bundle bundle) {
        if (!C13080a.m20762b(this)) {
            try {
                mo46169e(str, (Double) null, bundle, true, ActivityLifecycleTracker.m20067a());
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: g */
    public final void mo46171g(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!C13080a.m20762b(this)) {
            if (bigDecimal == null) {
                try {
                    f29567i.getClass();
                    C12845c0.f28334f.mo45626b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            } else if (currency == null) {
                f29567i.getClass();
                C12845c0.f28334f.mo45626b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                mo46169e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, ActivityLifecycleTracker.m20067a());
                f29567i.getClass();
                if (C13512a.m21285c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                    C13503d.m21268d(FlushReason.EAGER_FLUSHING_EVENT);
                }
            }
        }
    }

    public C13511h(Context context, String str) {
        this(C12869i0.m20573l(context), str);
    }
}
