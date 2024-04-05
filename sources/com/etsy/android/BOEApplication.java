package com.etsy.android;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.appcompat.app.C0156f;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.fragment.app.FragmentActivity;
import androidx.work.C3437q;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.C8632d;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.ServerTimestampOffsetSynchronizer;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.network.DebugApiRequestDecorator;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.lib.requests.LocaleRepository;
import com.etsy.android.lib.requests.LocaleRequest;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.uikit.image.glide.C11855d;
import com.etsy.android.uikit.image.glide.C11856e;
import com.etsy.android.uikit.image.glide.C11860g;
import com.etsy.android.uikit.image.glide.C11863j;
import com.etsy.android.uikit.image.glide.ProgressiveJpegEligibility;
import com.etsy.android.uikit.util.C11905i;
import com.etsy.android.util.AppLifecycleObserver;
import com.etsy.android.util.C12050j;
import com.etsy.android.util.C12062s;
import com.etsy.android.util.C12069z;
import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.config.Environment;
import com.paypal.checkout.config.PaymentButtonIntent;
import com.paypal.checkout.config.SettingsConfig;
import com.paypal.checkout.config.UIConfig;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import com.squareup.moshi.C17414y;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p040c9.C4451a;
import p084d9.C6671a;
import p145io.reactivex.exceptions.UndeliverableException;
import p197o4.C7591p;
import p197o4.C7596r;
import p319ca.C8561b;
import p319ca.C8562c;
import p334da.C12639h;
import p340ea.C12658b;
import p340ea.C12673n;
import p346fa.C12703a;
import p350fe.C12737k;
import p402n9.C13092l;
import p409o9.C13128h;
import p425q9.C13251c;
import p425q9.C13265p;
import p425q9.C13267q;
import p448ta.C13388d;
import p456ua.C13455a;
import p456ua.C13460e;
import p456ua.C13461f;
import p464va.C13552e;
import p470w9.C13794b;
import p486y9.C13886b;
import p486y9.C13887c;
import p486y9.C13888d;
import p496za.C13943a;
import p643op.C18335a;

public class BOEApplication extends EtsyApplication implements C18335a {
    private static C4451a appComponent;
    public C8674c analyticsTracker;
    public C12639h analyticsUploader;
    public AppLifecycleObserver appLifecycleObserver;
    public C12050j appsFlyerInitializer;
    public C13455a asyncScheduler;
    public BoeUserInfoFetcher boeUserInfoFetcher;
    public C13092l brazeInitializer;
    public C6671a button;
    public C8618c configMap;
    public C13128h configRepository;
    public C13886b configUpdateStream;
    public Connectivity connectivity;
    public C13794b countriesRepository;
    public CrashUtil crashUtil;
    public C13888d currentLocale;
    public DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
    public C12658b elkLogDao;
    public C8687h elkLogUploader;
    public C12673n elkLogger;
    public C13251c epochRepository;
    public C8591a etsyConfig;
    public C8618c etsyConfigMap;
    public C8630b etsyMoneyFactory;
    public C8632d etsyMoneyFormatter;
    public C11905i followRepository;
    public C12062s foregroundBackgroundEventListener;
    public Exception googlePlayException = null;
    public C12703a grafana;
    public C12737k internalDeeplinkRouter;
    public LocaleRepository localeRepository;
    public LocaleRequest localeRequest;
    private final C8561b localizationDelegate = new C8561b();
    public C8694h logCat;
    public C12658b logDao;
    public C17414y moshi;
    public C8617e nativeConfigs;
    public C8837j pushRegistration;
    public C8951c qualtricsWrapper;
    public C13388d regionsRepository;
    public C13460e rxPlugins;
    public C13461f rxSchedulers;
    public C13461f schedulers;
    public C13552e sdlRepository;
    public ServerTimestampOffsetSynchronizer serverTimestampOffsetSynchronizer;
    public C13265p session;
    public C12069z sessionManager;
    public C13267q sessionTimeManager;
    public C13943a sharedPreferencesProvider;
    public C8890e0 systemTime;
    public C3437q workManager;

    static {
        int i = C0156f.f386b;
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(true);
    }

    private void configureGlide() {
        C8672b bVar = ProgressiveJpegEligibility.f26352a;
        C8672b analyticsTracker2 = getAnalyticsTracker();
        C19383o.m32797g(analyticsTracker2, "analyticsTracker");
        ProgressiveJpegEligibility.f26352a = analyticsTracker2;
        if (((Boolean) ProgressiveJpegEligibility.f26353b.getValue()).booleanValue()) {
            C11863j.C11865b bVar2 = new C11863j.C11865b(Glide.get(this), getResources().getDisplayMetrics(), this.grafana);
            C11855d dVar = new C11855d(getAnalyticsTracker());
            C20009t tVar = new C20009t(new C20009t.C20010a());
            Registry registry = Glide.get(this).getRegistry();
            Class<C11860g> cls = C11860g.class;
            Class<InputStream> cls2 = InputStream.class;
            C11856e.C11857a aVar = new C11856e.C11857a(tVar, dVar, bVar2);
            C7591p pVar = registry.f12725a;
            synchronized (pVar) {
                C7596r rVar = pVar.f16856a;
                synchronized (rVar) {
                    rVar.f16871a.add(0, new C7596r.C7598b(cls, cls2, aVar));
                }
                pVar.f16857b.f16858a.clear();
            }
        }
    }

    public static C4451a getAppComponent() {
        return appComponent;
    }

    private void initializePayPal() {
        String f = this.configMap.mo21136f(C8592b.C8603k.f18904c);
        if (!C8885d0.m17322f(f)) {
            EtsyConfigKey.Environment environment = this.configMap.f18941a;
            PayPalCheckout.setConfig(new CheckoutConfig(this, f, environment == EtsyConfigKey.Environment.DEVELOPMENT ? Environment.SANDBOX : Environment.LIVE, CurrencyCode.USD, UserAction.PAY_NOW, (PaymentButtonIntent) null, new SettingsConfig(environment != EtsyConfigKey.Environment.PRODUCTION, false), new UIConfig(false)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$0() {
        return getEtsyConfigMap().mo21132b(C8592b.f18787e1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(C13887c cVar) throws Exception {
        onConfigsFetched();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(Throwable th) throws Exception {
        if (th instanceof UndeliverableException) {
            this.crashUtil.mo30457b(th);
        } else {
            this.crashUtil.uncaughtException(Thread.currentThread(), th);
        }
    }

    private void onConfigsFetched() {
        initializePayPal();
    }

    public C17550a<Object> androidInjector() {
        return this.dispatchingAndroidInjector;
    }

    public void attachBaseContext(Context context) {
        this.localizationDelegate.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.attachBaseContext(C8562c.m16970b(context));
    }

    public C8672b getAnalyticsTracker() {
        return this.analyticsTracker;
    }

    public Context getApplicationContext() {
        C8561b bVar = this.localizationDelegate;
        Context applicationContext = super.getApplicationContext();
        bVar.getClass();
        C19383o.m32797g(applicationContext, "applicationContext");
        return C8562c.m16970b(applicationContext);
    }

    public C13128h getConfigRepository() {
        return this.configRepository;
    }

    public C13886b getConfigUpdateStream() {
        return this.configUpdateStream;
    }

    public C13794b getCountriesRepository() {
        return this.countriesRepository;
    }

    public Class<? extends FragmentActivity> getDeepLinkRoutingActivity() {
        return NotificationActivity.class;
    }

    public C8618c getEtsyConfigMap() {
        return this.etsyConfigMap;
    }

    public String getFileProviderAuthority() {
        return "com.etsy.android.contentproviders.FileProvider";
    }

    public C11905i getFollowRepository() {
        return this.followRepository;
    }

    public C12703a getGrafana() {
        return this.grafana;
    }

    public C12737k getInternalDeeplinkRouter() {
        return this.internalDeeplinkRouter;
    }

    public LocaleRepository getLocaleRepository() {
        return this.localeRepository;
    }

    public C17414y getMoshi() {
        return this.moshi;
    }

    public C8617e getNativeConfigs() {
        return this.nativeConfigs;
    }

    public C13388d getRegionsRepository() {
        return this.regionsRepository;
    }

    public Resources getResources() {
        C8561b bVar = this.localizationDelegate;
        Resources resources = super.getResources();
        bVar.getClass();
        C19383o.m32797g(resources, "resources");
        return C8562c.m16971c(this, resources);
    }

    public C13461f getRxSchedulers() {
        return this.rxSchedulers;
    }

    public String getVersionName() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C8694h.f19097a.mo21312f("Package name not found");
            return "";
        }
    }

    public boolean isAppInBackground() {
        return !this.foregroundBackgroundEventListener.f26899j;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.localizationDelegate.getClass();
        C8562c.m16970b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x088a A[LOOP:2: B:159:0x0884->B:161:0x088a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x08cc  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0984  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x09a6  */
    @android.annotation.SuppressLint({"UnsafeExperimentalUsageWarning", "CheckResult"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r60 = this;
            r15 = r60
            super.onCreate()
            p573gk.C17789a.m29916a(r60)     // Catch:{ GooglePlayServicesRepairableException -> 0x0011, GooglePlayServicesNotAvailableException -> 0x0009 }
            goto L_0x0018
        L_0x0009:
            r0 = move-exception
            r1 = r0
            r15.googlePlayException = r1
            r1.printStackTrace()
            goto L_0x0018
        L_0x0011:
            r0 = move-exception
            r1 = r0
            r15.googlePlayException = r1
            r1.printStackTrace()
        L_0x0018:
            int r0 = com.etsy.android.lib.toolbar.C8860a.f19556m
            com.etsy.android.lib.toolbar.AdminToolbar$Companion$init$1 r0 = new com.etsy.android.lib.toolbar.AdminToolbar$Companion$init$1
            r0.<init>()
            com.etsy.android.lib.toolbar.C8860a.f19559p = r0
            r15.unregisterActivityLifecycleCallbacks(r0)
            android.app.Application$ActivityLifecycleCallbacks r0 = com.etsy.android.lib.toolbar.C8860a.f19559p
            r15.registerActivityLifecycleCallbacks(r0)
            com.etsy.android.lib.util.Breadcrumbs$LifecycleCallbacks$activityLifecycleCallbacks$1 r0 = com.etsy.android.lib.util.Breadcrumbs.LifecycleCallbacks.f19611b
            r15.registerActivityLifecycleCallbacks(r0)
            com.etsy.android.a r0 = new com.etsy.android.a
            r0.<init>(r15)
            p388lb.C13007b.f28660a = r0
            com.etsy.android.lib.config.BuildTarget r0 = com.etsy.android.lib.config.BuildTarget.getAudience()
            boolean r14 = r0.isInternal()
            if (r14 == 0) goto L_0x0042
            com.facebook.stetho.Stetho.initializeWithDefaults(r60)
        L_0x0042:
            com.etsy.android.dagger.AppInjector$activityLifecycleCallbacks$1 r0 = com.etsy.android.dagger.AppInjector.f14260a
            java.lang.Class<com.etsy.android.BOEApplication> r0 = com.etsy.android.BOEApplication.class
            c9.j1 r0 = new c9.j1
            r1 = r0
            c9.c r3 = new c9.c
            r2 = r3
            r3.<init>()
            kotlinx.coroutines.e0 r4 = new kotlinx.coroutines.e0
            r3 = r4
            r4.<init>()
            kotlin.jvm.internal.n r5 = new kotlin.jvm.internal.n
            r4 = r5
            r5.<init>()
            androidx.activity.h r6 = new androidx.activity.h
            r5 = r6
            r6.<init>()
            bk.a r7 = new bk.a
            r6 = r7
            r7.<init>()
            kotlin.reflect.p r8 = new kotlin.reflect.p
            r7 = r8
            r8.<init>()
            androidx.compose.foundation.layout.x r9 = new androidx.compose.foundation.layout.x
            r8 = r9
            r9.<init>()
            lb.a r10 = new lb.a
            r9 = r10
            r10.<init>()
            m.a r11 = new m.a
            r10 = r11
            r11.<init>()
            kotlin.reflect.p r12 = new kotlin.reflect.p
            r11 = r12
            r12.<init>()
            com.google.android.play.core.assetpacks.c1 r13 = new com.google.android.play.core.assetpacks.c1
            r12 = r13
            r13.<init>()
            nj.b r16 = new nj.b
            r13 = r16
            r16.<init>()
            ke.a r16 = new ke.a
            r58 = r14
            r14 = r16
            r16.<init>()
            kp.c r16 = new kp.c
            r15 = r16
            r16.<init>()
            kotlin.jvm.internal.s r17 = new kotlin.jvm.internal.s
            r16 = r17
            r17.<init>()
            com.google.android.play.core.appupdate.d r18 = new com.google.android.play.core.appupdate.d
            r17 = r18
            r18.<init>()
            fn.b r19 = new fn.b
            r18 = r19
            r19.<init>()
            fn.b r20 = new fn.b
            r19 = r20
            r20.<init>()
            androidx.compose.foundation.layout.x r21 = new androidx.compose.foundation.layout.x
            r20 = r21
            r21.<init>()
            tq.a r22 = new tq.a
            r21 = r22
            r22.<init>()
            androidx.compose.foundation.layout.x r23 = new androidx.compose.foundation.layout.x
            r22 = r23
            r23.<init>()
            nc.a r24 = new nc.a
            r23 = r24
            r24.<init>()
            kotlin.jvm.internal.s r25 = new kotlin.jvm.internal.s
            r24 = r25
            r25.<init>()
            bk.a r26 = new bk.a
            r25 = r26
            r26.<init>()
            r59 = r0
            com.etsy.android.lib.requests.SaveLocaleModule r0 = new com.etsy.android.lib.requests.SaveLocaleModule
            r26 = r0
            r0.<init>()
            m.a r28 = new m.a
            r27 = r28
            r28.<init>()
            nc.a r29 = new nc.a
            r28 = r29
            r29.<init>()
            kotlin.jvm.internal.s r30 = new kotlin.jvm.internal.s
            r29 = r30
            r30.<init>()
            androidx.activity.h r31 = new androidx.activity.h
            r30 = r31
            r31.<init>()
            kotlin.jvm.internal.s r32 = new kotlin.jvm.internal.s
            r31 = r32
            r32.<init>()
            kotlin.jvm.internal.s r33 = new kotlin.jvm.internal.s
            r32 = r33
            r33.<init>()
            kotlin.reflect.p r34 = new kotlin.reflect.p
            r33 = r34
            r34.<init>()
            com.google.android.play.core.appupdate.d r35 = new com.google.android.play.core.appupdate.d
            r34 = r35
            r35.<init>()
            kotlin.reflect.p r36 = new kotlin.reflect.p
            r35 = r36
            r36.<init>()
            com.google.android.play.core.appupdate.d r37 = new com.google.android.play.core.appupdate.d
            r36 = r37
            r37.<init>()
            bk.a r38 = new bk.a
            r37 = r38
            r38.<init>()
            kotlin.jvm.internal.n r39 = new kotlin.jvm.internal.n
            r38 = r39
            r39.<init>()
            kotlin.jvm.internal.s r40 = new kotlin.jvm.internal.s
            r39 = r40
            r40.<init>()
            com.google.android.play.core.assetpacks.c1 r41 = new com.google.android.play.core.assetpacks.c1
            r40 = r41
            r41.<init>()
            androidx.compose.foundation.text.j r42 = new androidx.compose.foundation.text.j
            r41 = r42
            r42.<init>()
            nj.b r43 = new nj.b
            r42 = r43
            r43.<init>()
            a0.b r44 = new a0.b
            r43 = r44
            r44.<init>()
            fn.b r45 = new fn.b
            r44 = r45
            r45.<init>()
            androidx.compose.foundation.layout.x r46 = new androidx.compose.foundation.layout.x
            r45 = r46
            r46.<init>()
            androidx.activity.h r47 = new androidx.activity.h
            r46 = r47
            r47.<init>()
            ke.a r48 = new ke.a
            r47 = r48
            r48.<init>()
            androidx.activity.h r49 = new androidx.activity.h
            r48 = r49
            r49.<init>()
            nc.a r50 = new nc.a
            r49 = r50
            r50.<init>()
            com.google.android.play.core.assetpacks.c1 r51 = new com.google.android.play.core.assetpacks.c1
            r50 = r51
            r51.<init>()
            s6.a0 r52 = new s6.a0
            r51 = r52
            r52.<init>()
            a0.b r53 = new a0.b
            r52 = r53
            r53.<init>()
            bk.a r54 = new bk.a
            r53 = r54
            r54.<init>()
            tf.m r55 = new tf.m
            r54 = r55
            r55.<init>()
            nc.a r56 = new nc.a
            r55 = r56
            r56.<init>()
            kotlin.jvm.internal.n r57 = new kotlin.jvm.internal.n
            r56 = r57
            r57.<init>()
            r57 = r60
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            dagger.android.DispatchingAndroidInjector r1 = r59.mo14402k()
            r2 = r60
            r2.dispatchingAndroidInjector = r1
            com.etsy.android.lib.push.registration.j r4 = r59.mo14407p()
            ra.i r5 = new ra.i
            r1 = r59
            eq.a<android.app.NotificationManager> r3 = r1.f10343z0
            java.lang.Object r3 = r3.get()
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r5.<init>(r3)
            eq.a<com.etsy.android.lib.network.Connectivity> r3 = r1.f10086C0
            java.lang.Object r3 = r3.get()
            r6 = r3
            com.etsy.android.lib.network.Connectivity r6 = (com.etsy.android.lib.network.Connectivity) r6
            ua.f r7 = new ua.f
            r7.<init>()
            eq.a<com.etsy.android.ui.user.UserBadgeCountManager> r3 = r1.f10111H0
            java.lang.Object r3 = r3.get()
            r8 = r3
            com.etsy.android.ui.user.UserBadgeCountManager r8 = (com.etsy.android.p327ui.user.UserBadgeCountManager) r8
            eq.a<com.etsy.android.ui.conversation.details.c> r3 = r1.f10156Q0
            java.lang.Object r3 = r3.get()
            r9 = r3
            com.etsy.android.ui.conversation.details.c r9 = (com.etsy.android.p327ui.conversation.details.C9477c) r9
            eq.a<com.etsy.android.lib.network.w> r3 = r1.f10230e0
            java.lang.Object r3 = r3.get()
            r10 = r3
            com.etsy.android.lib.network.t r10 = (com.etsy.android.lib.network.C8809t) r10
            eq.a<za.a> r3 = r1.f10090D
            java.lang.Object r3 = r3.get()
            r11 = r3
            za.a r11 = (p496za.C13943a) r11
            eq.a<com.etsy.android.lib.logger.h> r3 = r1.f10212b0
            java.lang.Object r3 = r3.get()
            r12 = r3
            com.etsy.android.lib.logger.h r12 = (com.etsy.android.lib.logger.C8694h) r12
            com.etsy.android.util.z r13 = new com.etsy.android.util.z
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.sessionManager = r13
            com.etsy.android.lib.push.registration.j r3 = r1.mo14407p()
            r2.pushRegistration = r3
            eq.a<com.etsy.android.lib.logger.h> r3 = r1.f10212b0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.logger.h r3 = (com.etsy.android.lib.logger.C8694h) r3
            r2.logCat = r3
            dagger.internal.b r3 = r1.f10101F0
            java.lang.Object r3 = r3.get()
            q9.p r3 = (p425q9.C13265p) r3
            r2.session = r3
            eq.a<com.etsy.android.lib.currency.b> r3 = r1.f10141N0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.currency.b r3 = (com.etsy.android.lib.currency.C8630b) r3
            r2.etsyMoneyFactory = r3
            eq.a<ea.n> r3 = r1.f10131L0
            java.lang.Object r3 = r3.get()
            ea.n r3 = (p340ea.C12673n) r3
            r2.elkLogger = r3
            ea.b r3 = r1.mo14403l()
            r2.logDao = r3
            com.etsy.android.lib.config.c r3 = r1.mo14404m()
            r2.configMap = r3
            eq.a<androidx.work.q> r3 = r1.f10171T0
            java.lang.Object r3 = r3.get()
            androidx.work.q r3 = (androidx.work.C3437q) r3
            r2.workManager = r3
            d9.a r3 = new d9.a
            eq.a<android.content.Context> r4 = r1.f10085C
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            r3.<init>(r4)
            r2.button = r3
            com.etsy.android.lib.logger.ServerTimestampOffsetSynchronizer r3 = new com.etsy.android.lib.logger.ServerTimestampOffsetSynchronizer
            q9.c r4 = new q9.c
            eq.a<ja.c> r5 = r1.f10294p1
            java.lang.Object r5 = r5.get()
            ja.c r5 = (p373ja.C12969c) r5
            r4.<init>(r5)
            dagger.internal.b r5 = r1.f10101F0
            java.lang.Object r5 = r5.get()
            q9.p r5 = (p425q9.C13265p) r5
            eq.a<com.etsy.android.lib.util.e0> r6 = r1.f10248h0
            java.lang.Object r6 = r6.get()
            com.etsy.android.lib.util.e0 r6 = (com.etsy.android.lib.util.C8890e0) r6
            ua.f r7 = new ua.f
            r7.<init>()
            r3.<init>(r4, r5, r6, r7)
            r2.serverTimestampOffsetSynchronizer = r3
            eq.a<com.etsy.android.util.AppLifecycleObserver> r3 = r1.f10097E1
            java.lang.Object r3 = r3.get()
            com.etsy.android.util.AppLifecycleObserver r3 = (com.etsy.android.util.AppLifecycleObserver) r3
            r2.appLifecycleObserver = r3
            eq.a<com.etsy.android.util.f> r3 = r1.f10107G1
            java.lang.Object r3 = r3.get()
            com.etsy.android.util.f r3 = (com.etsy.android.util.C12043f) r3
            java.lang.String r4 = "appsFlyer"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            r2.appsFlyerInitializer = r3
            dagger.internal.b r3 = r1.f10308s0
            java.lang.Object r3 = r3.get()
            fa.a r3 = (p346fa.C12703a) r3
            r2.grafana = r3
            eq.a<com.etsy.android.lib.util.e0> r3 = r1.f10248h0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.util.e0 r3 = (com.etsy.android.lib.util.C8890e0) r3
            r2.systemTime = r3
            eq.a<com.etsy.android.lib.network.Connectivity> r3 = r1.f10086C0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.network.Connectivity r3 = (com.etsy.android.lib.network.Connectivity) r3
            r2.connectivity = r3
            eq.a<com.etsy.android.qualtrics.c> r3 = r1.f10117I1
            java.lang.Object r3 = r3.get()
            com.etsy.android.qualtrics.c r3 = (com.etsy.android.qualtrics.C8951c) r3
            r2.qualtricsWrapper = r3
            eq.a<n9.l> r3 = r1.f10127K1
            java.lang.Object r3 = r3.get()
            n9.l r3 = (p402n9.C13092l) r3
            r2.brazeInitializer = r3
            eq.a<q9.q> r3 = r1.f10309s1
            java.lang.Object r3 = r3.get()
            q9.q r3 = (p425q9.C13267q) r3
            r2.sessionTimeManager = r3
            da.h r3 = new da.h
            com.etsy.android.lib.config.c r4 = r1.mo14404m()
            eq.a<androidx.work.q> r5 = r1.f10171T0
            java.lang.Object r5 = r5.get()
            androidx.work.q r5 = (androidx.work.C3437q) r5
            r3.<init>(r4, r5)
            r2.analyticsUploader = r3
            ea.b r3 = r1.mo14403l()
            r2.elkLogDao = r3
            eq.a<com.etsy.android.lib.logger.elk.uploading.h> r3 = r1.f10082B1
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.logger.elk.uploading.h r3 = (com.etsy.android.lib.logger.elk.uploading.C8687h) r3
            r2.elkLogUploader = r3
            eq.a<com.etsy.android.lib.currency.d> r3 = r1.f10136M0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.currency.d r3 = (com.etsy.android.lib.currency.C8632d) r3
            r2.etsyMoneyFormatter = r3
            eq.a<y9.d> r3 = r1.f10298q0
            java.lang.Object r3 = r3.get()
            y9.d r3 = (p486y9.C13888d) r3
            r2.currentLocale = r3
            eq.a<com.etsy.android.lib.util.CrashUtil> r3 = r1.f10339y1
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.util.CrashUtil r3 = (com.etsy.android.lib.util.CrashUtil) r3
            r2.crashUtil = r3
            ua.f r3 = new ua.f
            r3.<init>()
            r2.schedulers = r3
            q9.c r3 = new q9.c
            eq.a<ja.c> r4 = r1.f10294p1
            java.lang.Object r4 = r4.get()
            ja.c r4 = (p373ja.C12969c) r4
            r3.<init>(r4)
            r2.epochRepository = r3
            fe.k r3 = new fe.k
            fe.j r4 = r1.mo14401j()
            r3.<init>(r4)
            r2.internalDeeplinkRouter = r3
            dagger.internal.b r3 = r1.f10272l0
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.config.a r3 = (com.etsy.android.lib.config.C8591a) r3
            r2.etsyConfig = r3
            eq.a<com.etsy.android.BoeUserInfoFetcher> r3 = r1.f10093D2
            java.lang.Object r3 = r3.get()
            com.etsy.android.BoeUserInfoFetcher r3 = (com.etsy.android.BoeUserInfoFetcher) r3
            r2.boeUserInfoFetcher = r3
            va.e r3 = r1.mo14411t()
            r2.sdlRepository = r3
            eq.a<com.squareup.moshi.y> r3 = r1.f10146O0
            java.lang.Object r3 = r3.get()
            com.squareup.moshi.y r3 = (com.squareup.moshi.C17414y) r3
            r2.moshi = r3
            ua.e r3 = new ua.e
            r3.<init>()
            r2.rxPlugins = r3
            eq.a<ua.a> r3 = r1.f10098E2
            java.lang.Object r3 = r3.get()
            ua.a r3 = (p456ua.C13455a) r3
            r2.asyncScheduler = r3
            com.etsy.android.lib.config.bucketing.e r3 = new com.etsy.android.lib.config.bucketing.e
            r3.<init>()
            r2.nativeConfigs = r3
            eq.a<y9.b> r3 = r1.f10116I0
            java.lang.Object r3 = r3.get()
            y9.b r3 = (p486y9.C13886b) r3
            r2.configUpdateStream = r3
            eq.a<com.etsy.android.util.s> r3 = r1.f10092D1
            java.lang.Object r3 = r3.get()
            com.etsy.android.util.s r3 = (com.etsy.android.util.C12062s) r3
            r2.foregroundBackgroundEventListener = r3
            eq.a<w9.b> r3 = r1.f10103F2
            java.lang.Object r3 = r3.get()
            w9.b r3 = (p470w9.C13794b) r3
            r2.countriesRepository = r3
            eq.a<za.a> r3 = r1.f10090D
            java.lang.Object r3 = r3.get()
            za.a r3 = (p496za.C13943a) r3
            r2.sharedPreferencesProvider = r3
            com.etsy.android.uikit.util.i r3 = new com.etsy.android.uikit.util.i
            dagger.internal.b r4 = r1.f10091D0
            java.lang.Object r4 = r4.get()
            com.etsy.android.lib.network.g r4 = (com.etsy.android.lib.network.C8731g) r4
            java.lang.String r5 = "v3MoshiRetrofit"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            retrofit2.w r4 = r4.f19177a
            java.lang.Class<com.etsy.android.uikit.util.h> r5 = com.etsy.android.uikit.util.C11904h.class
            java.lang.Object r4 = r4.mo74387b(r5)
            java.lang.String r5 = "v3MoshiRetrofit.v3moshiR…llowEndpoint::class.java)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            com.etsy.android.uikit.util.h r4 = (com.etsy.android.uikit.util.C11904h) r4
            r3.<init>(r4)
            r2.followRepository = r3
            ua.f r3 = new ua.f
            r3.<init>()
            r2.rxSchedulers = r3
            com.etsy.android.lib.requests.LocaleRepository r3 = new com.etsy.android.lib.requests.LocaleRepository
            dagger.internal.b r4 = r1.f10091D0
            java.lang.Object r4 = r4.get()
            com.etsy.android.lib.network.g r4 = (com.etsy.android.lib.network.C8731g) r4
            com.etsy.android.lib.requests.LocaleEndpoint r0 = com.etsy.android.lib.requests.SaveLocaleModule_ProvidesLocaleEndpointFactory.providesLocaleEndpoint(r0, r4)
            eq.a<com.squareup.moshi.y> r4 = r1.f10146O0
            java.lang.Object r4 = r4.get()
            com.squareup.moshi.y r4 = (com.squareup.moshi.C17414y) r4
            r3.<init>(r0, r4)
            r2.localeRepository = r3
            eq.a<ta.d> r0 = r1.f10108G2
            java.lang.Object r0 = r0.get()
            ta.d r0 = (p448ta.C13388d) r0
            r2.regionsRepository = r0
            eq.a<o9.h> r0 = r1.f10261j1
            java.lang.Object r0 = r0.get()
            o9.h r0 = (p409o9.C13128h) r0
            r2.configRepository = r0
            com.etsy.android.lib.config.c r0 = r1.mo14404m()
            r2.etsyConfigMap = r0
            eq.a<com.etsy.android.lib.logger.c> r0 = r1.f10266k0
            java.lang.Object r0 = r0.get()
            com.etsy.android.lib.logger.c r0 = (com.etsy.android.lib.logger.C8674c) r0
            r2.analyticsTracker = r0
            eq.a<com.etsy.android.lib.requests.LocaleRequest> r0 = r1.f10113H2
            java.lang.Object r0 = r0.get()
            com.etsy.android.lib.requests.LocaleRequest r0 = (com.etsy.android.lib.requests.LocaleRequest) r0
            r2.localeRequest = r0
            com.etsy.android.dagger.AppInjector$activityLifecycleCallbacks$1 r0 = com.etsy.android.dagger.AppInjector.f14260a
            r2.unregisterActivityLifecycleCallbacks(r0)
            r2.registerActivityLifecycleCallbacks(r0)
            appComponent = r1
            androidx.lifecycle.d0 r0 = androidx.lifecycle.C2851d0.f6469j
            androidx.lifecycle.t r0 = r0.f6475g
            com.etsy.android.util.AppLifecycleObserver r1 = r2.appLifecycleObserver
            r0.mo10733a(r1)
            com.etsy.android.lib.config.c r0 = r2.configMap
            com.etsy.android.lib.config.EtsyConfigKey r1 = com.etsy.android.lib.config.C8592b.f18826r1
            boolean r0 = r0.mo21132b(r1)
            if (r0 == 0) goto L_0x0452
            com.etsy.android.lib.performance.PerformanceLifecycleCallbacks$activityLifecycleCallbacks$1 r0 = com.etsy.android.lib.performance.PerformanceLifecycleCallbacks.f19373a
            r2.registerActivityLifecycleCallbacks(r0)
        L_0x0452:
            dn.b r3 = p552dn.C17697b.m29701a()
            com.etsy.android.lib.config.c r0 = r2.configMap
            boolean r0 = r0.mo21132b(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            monitor-enter(r3)
            p575gm.C17793c.m29919b()     // Catch:{ IllegalStateException -> 0x0513 }
            com.google.firebase.perf.config.a r1 = r3.f38494b     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r1 = r1.mo59252f()     // Catch:{ all -> 0x0510 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0510 }
            if (r1 == 0) goto L_0x0485
            fn.a r0 = p552dn.C17697b.f38492g     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = "Firebase Performance is permanently disabled"
            boolean r4 = r0.f38630b     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x0482
            fn.b r0 = r0.f38629a     // Catch:{ all -> 0x0510 }
            r0.getClass()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "FirebasePerformance"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0510 }
        L_0x0482:
            monitor-exit(r3)
            goto L_0x0514
        L_0x0485:
            com.google.firebase.perf.config.a r1 = r3.f38494b     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r4 = r1.mo59252f()     // Catch:{ all -> 0x0510 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x0492
            goto L_0x04c5
        L_0x0492:
            java.lang.Class<com.google.firebase.perf.config.c> r4 = com.google.firebase.perf.config.C16596c.class
            monitor-enter(r4)     // Catch:{ all -> 0x0510 }
            com.google.firebase.perf.config.c r5 = com.google.firebase.perf.config.C16596c.f36833e     // Catch:{ all -> 0x050d }
            if (r5 != 0) goto L_0x04a0
            com.google.firebase.perf.config.c r5 = new com.google.firebase.perf.config.c     // Catch:{ all -> 0x050d }
            r5.<init>()     // Catch:{ all -> 0x050d }
            com.google.firebase.perf.config.C16596c.f36833e = r5     // Catch:{ all -> 0x050d }
        L_0x04a0:
            com.google.firebase.perf.config.c r5 = com.google.firebase.perf.config.C16596c.f36833e     // Catch:{ all -> 0x050d }
            monitor-exit(r4)     // Catch:{ all -> 0x0510 }
            r5.getClass()     // Catch:{ all -> 0x0510 }
            java.lang.String r4 = "isEnabled"
            if (r0 == 0) goto L_0x04b6
            com.google.firebase.perf.config.s r1 = r1.f36831c     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0510 }
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x0510 }
            r1.mo59264f(r4, r5)     // Catch:{ all -> 0x0510 }
            goto L_0x04c5
        L_0x04b6:
            com.google.firebase.perf.config.s r1 = r1.f36831c     // Catch:{ all -> 0x0510 }
            android.content.SharedPreferences r1 = r1.f36851a     // Catch:{ all -> 0x0510 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0510 }
            android.content.SharedPreferences$Editor r1 = r1.remove(r4)     // Catch:{ all -> 0x0510 }
            r1.apply()     // Catch:{ all -> 0x0510 }
        L_0x04c5:
            if (r0 == 0) goto L_0x04ca
            r3.f38495c = r0     // Catch:{ all -> 0x0510 }
            goto L_0x04d2
        L_0x04ca:
            com.google.firebase.perf.config.a r0 = r3.f38494b     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r0 = r0.mo59253g()     // Catch:{ all -> 0x0510 }
            r3.f38495c = r0     // Catch:{ all -> 0x0510 }
        L_0x04d2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r1 = r3.f38495c     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x04ef
            fn.a r0 = p552dn.C17697b.f38492g     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = "Firebase Performance is Enabled"
            boolean r4 = r0.f38630b     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x050b
            fn.b r0 = r0.f38629a     // Catch:{ all -> 0x0510 }
            r0.getClass()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "FirebasePerformance"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0510 }
            goto L_0x050b
        L_0x04ef:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r1 = r3.f38495c     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x050b
            fn.a r0 = p552dn.C17697b.f38492g     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = "Firebase Performance is Disabled"
            boolean r4 = r0.f38630b     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x050b
            fn.b r0 = r0.f38629a     // Catch:{ all -> 0x0510 }
            r0.getClass()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "FirebasePerformance"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0510 }
        L_0x050b:
            monitor-exit(r3)
            goto L_0x0514
        L_0x050d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0510 }
            throw r0     // Catch:{ all -> 0x0510 }
        L_0x0510:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0513:
            monitor-exit(r3)
        L_0x0514:
            fa.a r0 = r2.grafana
            p628nj.C18263b.f40051O = r0
            ea.n r0 = r2.elkLogger
            p628nj.C18263b.f40052P = r0
            q9.q r0 = r2.sessionTimeManager
            p628nj.C18263b.f40054R = r0
            ea.b r0 = r2.elkLogDao
            p628nj.C18263b.f40053Q = r0
            ua.f r0 = r2.schedulers
            p628nj.C18263b.f40055S = r0
            com.etsy.android.lib.config.a r1 = r2.etsyConfig
            p628nj.C18263b.f40056T = r1
            va.e r1 = r2.sdlRepository
            p628nj.C18263b.f40058W = r1
            com.squareup.moshi.y r1 = r2.moshi
            p628nj.C18263b.f40059X = r1
            q9.p r1 = r2.session
            com.etsy.android.i r3 = new com.etsy.android.i
            com.etsy.android.lib.util.CrashUtil r4 = r2.crashUtil
            r3.<init>(r2, r1, r4, r0)
            java.util.List<q9.p$a> r0 = r1.f29143i
            r0.add(r3)
            com.etsy.android.lib.logger.ServerTimestampOffsetSynchronizer r0 = r2.serverTimestampOffsetSynchronizer
            r0.mo21325a()
            android.content.Context r0 = r60.getApplicationContext()
            o9.q r1 = p409o9.C13138q.f28894h
            if (r1 != 0) goto L_0x0556
            o9.q r1 = new o9.q
            r1.<init>(r0)
            p409o9.C13138q.f28894h = r1
        L_0x0556:
            com.etsy.android.lib.util.CrashUtil r0 = r2.crashUtil
            com.etsy.android.lib.util.CrashUtil$CrashProvider r1 = com.etsy.android.lib.util.CrashUtil.CrashProvider.BUGSNAG
            com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.f18848z
            java.lang.String r4 = com.etsy.android.util.C12051k.f26870d
            r0.getClass()
            r1.initialize(r3, r4)
            com.etsy.android.lib.util.CrashUtil r0 = r2.crashUtil
            android.content.Context r1 = r60.getApplicationContext()
            android.content.Context r3 = r0.f19617a
            if (r3 == 0) goto L_0x056f
            goto L_0x059b
        L_0x056f:
            android.content.Context r3 = r1.getApplicationContext()
            r0.f19617a = r3
            java.lang.Thread$UncaughtExceptionHandler r3 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r3 == r0) goto L_0x0581
            java.lang.Thread$UncaughtExceptionHandler r3 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r0.f19619c = r3
        L_0x0581:
            r0.mo30459d(r1)
            com.etsy.android.lib.util.l r3 = new com.etsy.android.lib.util.l
            r3.<init>(r0)
            r0.f19620d = r3
            u1.a r1 = p251u1.C8115a.m16322a(r1)
            com.etsy.android.lib.util.l r0 = r0.f19620d
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "com.etsy.etsyconfig.updated"
            r3.<init>(r4)
            r1.mo20708b(r0, r3)
        L_0x059b:
            com.etsy.android.lib.util.CrashUtil r0 = r2.crashUtil
            java.lang.String r1 = "12 Dec 2022 AD at 12:35 EST"
            java.lang.String r3 = "null"
            java.lang.String r4 = "unknown-branch"
            java.lang.String r5 = "721342691adb6fe703cf1c009722460dded732ed"
            r0.getClass()
            com.etsy.android.lib.util.CrashUtil$CrashProvider[] r6 = com.etsy.android.lib.util.CrashUtil.CrashProvider.values()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x05af:
            r10 = 2
            r11 = 0
            r12 = 1
            if (r9 >= r7) goto L_0x060f
            r13 = r6[r9]
            boolean r14 = r0.mo30461f(r13)
            if (r14 == 0) goto L_0x060c
            aa.c r13 = r13.getDelegate()
            aa.b r13 = (p307aa.C8495b) r13
            r13.getClass()
            java.lang.String r13 = "Build Info"
            com.bugsnag.android.u r14 = com.bugsnag.android.C5777k.m11576b()
            com.bugsnag.android.s1 r14 = r14.f12623b
            r14.getClass()
            com.bugsnag.android.r1 r15 = r14.f12604b
            r15.getClass()
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r15 = r15.f12468c
            r15.remove(r13)
            r14.mo16670a(r13, r11)
            r11 = 4
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r15 = "Build Timestamp"
            r14.<init>(r15, r1)
            r11[r8] = r14
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r15 = "Branch"
            r14.<init>(r15, r4)
            r11[r12] = r14
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r14 = "Commit Hash"
            r12.<init>(r14, r5)
            r11[r10] = r12
            r10 = 3
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r14 = "Unique Suffix"
            r12.<init>(r14, r3)
            r11[r10] = r12
            java.util.Map r10 = kotlin.collections.C19294b0.m32562s0(r11)
            com.bugsnag.android.C5777k.m11575a(r13, r10)
        L_0x060c:
            int r9 = r9 + 1
            goto L_0x05af
        L_0x060f:
            android.content.Context r0 = r60.getApplicationContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.etsy.android.lib.toolbar.a r1 = com.etsy.android.lib.toolbar.C8860a.f19558o
            if (r1 != 0) goto L_0x0626
            com.etsy.android.lib.toolbar.a r1 = new com.etsy.android.lib.toolbar.a
            r3 = r58
            r1.<init>(r0, r3)
            com.etsy.android.lib.toolbar.C8860a.f19558o = r1
            goto L_0x0628
        L_0x0626:
            r3 = r58
        L_0x0628:
            android.content.Context r0 = r60.getApplicationContext()
            z9.a r1 = p495z9.C13942a.f30655f
            if (r1 != 0) goto L_0x0637
            z9.a r1 = new z9.a
            r1.<init>(r0, r3)
            p495z9.C13942a.f30655f = r1
        L_0x0637:
            if (r3 == 0) goto L_0x0669
            z9.a r0 = p495z9.C13942a.f30655f
            if (r0 == 0) goto L_0x0654
            boolean r1 = r0.f30657a
            if (r1 == 0) goto L_0x0654
            android.content.SharedPreferences r1 = r0.f30661e
            android.content.Context r0 = r0.f30659c
            r4 = 2131951911(0x7f130127, float:1.954025E38)
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x0654
            r0 = r12
            goto L_0x0655
        L_0x0654:
            r0 = r8
        L_0x0655:
            if (r0 == 0) goto L_0x0669
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r60.getApplicationContext()
            java.lang.Class<com.etsy.android.lib.eventhorizon.EventHorizonService> r4 = com.etsy.android.lib.eventhorizon.EventHorizonService.class
            r0.<init>(r1, r4)
            android.content.Context r1 = r60.getApplicationContext()
            r1.startService(r0)
        L_0x0669:
            q9.p r0 = r2.session
            boolean r1 = r0.mo45960e()
            r0.mo45961f(r1)
            android.content.Context r0 = r60.getApplicationContext()
            o9.q r1 = p409o9.C13138q.m20808a()
            int r1 = r1.f28900f
            java.lang.String r4 = "EtsyUserPrefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r4 = "etsyVersionCode"
            r0.putInt(r4, r1)
            r0.apply()
            y9.b r0 = r2.configUpdateStream
            com.jakewharton.rxrelay2.b r0 = r0.mo46713a()
            com.etsy.android.b r1 = new com.etsy.android.b
            r1.<init>(r2, r8)
            r0.mo20637g(r1)
            com.etsy.android.lib.config.a r0 = r2.etsyConfig
            android.content.Context r1 = r60.getApplicationContext()
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r0 = r0.mo21109h(r1, r4)
            if (r0 != 0) goto L_0x06ae
            r60.onConfigsFetched()
        L_0x06ae:
            if (r3 == 0) goto L_0x06e1
            r60.setApiFeaturesOverride()
            p453tf.C13418j.f29389i = r12
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.String r1 = "behavior"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.util.HashSet<com.facebook.LoggingBehavior> r1 = p453tf.C13418j.f29382b
            monitor-enter(r1)
            r1.add(r0)     // Catch:{ all -> 0x06de }
            tf.j r0 = p453tf.C13418j.f29403w     // Catch:{ all -> 0x06de }
            r0.getClass()     // Catch:{ all -> 0x06de }
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO     // Catch:{ all -> 0x06de }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x06de }
            if (r0 == 0) goto L_0x06da
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING     // Catch:{ all -> 0x06de }
            boolean r4 = r1.contains(r0)     // Catch:{ all -> 0x06de }
            if (r4 != 0) goto L_0x06da
            r1.add(r0)     // Catch:{ all -> 0x06de }
        L_0x06da:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x06de }
            monitor-exit(r1)
            goto L_0x06e1
        L_0x06de:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06e1:
            kotlin.reflect.C19421p.m32939g0(r3)
            q9.p r0 = r2.session
            com.etsy.android.lib.network.Connectivity r1 = r0.f29147m
            io.reactivex.subjects.a<java.lang.Boolean> r1 = r1.f19165g
            ua.f r4 = r0.f29148n
            r4.getClass()
            tp.r r4 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r1 = r1.mo20639i(r4)
            ua.f r4 = r0.f29148n
            r4.getClass()
            tp.r r4 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r1.mo20635e(r4)
            n9.j r4 = new n9.j
            r4.<init>(r0, r12)
            r1.mo20637g(r4)
            q9.p r0 = r2.session
            boolean r0 = r0.mo45960e()
            if (r0 == 0) goto L_0x0780
            android.content.Context r0 = r60.getApplicationContext()
            o9.q r1 = p409o9.C13138q.m20808a()
            java.lang.String r1 = r1.f28897c
            java.lang.Class<com.etsy.android.lib.util.w> r4 = com.etsy.android.lib.util.C8925w.class
            monitor-enter(r4)
            java.lang.String r5 = com.etsy.android.lib.util.C8925w.f19687a     // Catch:{ all -> 0x077d }
            if (r5 == 0) goto L_0x0727
            monitor-exit(r4)
            goto L_0x0771
        L_0x0727:
            java.lang.String r5 = ""
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x077d }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x077d }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x077d }
            if (r0 == 0) goto L_0x076e
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x077d }
            int r7 = android.os.Process.myPid()     // Catch:{ all -> 0x077d }
        L_0x073f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x077d }
            if (r0 == 0) goto L_0x076e
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x077d }
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch:{ all -> 0x077d }
            int r9 = r0.pid     // Catch:{ Exception -> 0x0752 }
            if (r9 != r7) goto L_0x073f
            java.lang.String r5 = r0.processName     // Catch:{ Exception -> 0x0752 }
            goto L_0x073f
        L_0x0752:
            r0 = move-exception
            com.etsy.android.lib.logger.h r9 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ all -> 0x077d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x077d }
            r13.<init>()     // Catch:{ all -> 0x077d }
            java.lang.String r14 = "getProcessName Exception: "
            r13.append(r14)     // Catch:{ all -> 0x077d }
            java.lang.String r14 = r0.getMessage()     // Catch:{ all -> 0x077d }
            r13.append(r14)     // Catch:{ all -> 0x077d }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x077d }
            r9.mo21309d(r13, r0)     // Catch:{ all -> 0x077d }
            goto L_0x073f
        L_0x076e:
            com.etsy.android.lib.util.C8925w.f19687a = r5     // Catch:{ all -> 0x077d }
            monitor-exit(r4)
        L_0x0771:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x0780
            com.etsy.android.lib.requests.LocaleRequest r0 = r2.localeRequest
            r0.sendUserLocale()
            goto L_0x0780
        L_0x077d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0780:
            com.etsy.android.c r0 = new com.etsy.android.c
            r0.<init>(r2, r8)
            p736cq.C18981a.f42308a = r0
            q9.p r0 = r2.session
            r0.getClass()
            com.etsy.android.lib.core.EtsyApplication r1 = com.etsy.android.lib.core.EtsyApplication.get()
            y9.b r1 = r1.getConfigUpdateStream()
            com.jakewharton.rxrelay2.b r1 = r1.mo46713a()
            q9.k r4 = new q9.k
            r4.<init>(r8)
            io.reactivex.internal.operators.observable.q r5 = new io.reactivex.internal.operators.observable.q
            r5.<init>(r1, r4)
            im.b r1 = new im.b
            r1.<init>(r8)
            io.reactivex.internal.operators.observable.q r4 = new io.reactivex.internal.operators.observable.q
            r4.<init>(r5, r1)
            q9.l r1 = new q9.l
            r1.<init>(r0, r8)
            tp.n r1 = r4.mo20634d(r1)
            ua.f r4 = r0.f29148n
            r4.getClass()
            tp.r r4 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r1.mo20635e(r4)
            n9.e r4 = new n9.e
            r4.<init>(r0, r12)
            w8.d r5 = new w8.d
            r5.<init>(r0, r10)
            io.reactivex.internal.functions.Functions$c r6 = p145io.reactivex.internal.functions.Functions.f28539c
            io.reactivex.internal.functions.Functions$d r7 = p145io.reactivex.internal.functions.Functions.f28540d
            r1.mo20636f(r4, r5, r6, r7)
            pa.d r1 = r0.f29152r
            io.reactivex.internal.operators.observable.m r1 = r1.mo45909c()
            q9.m r4 = new q9.m
            r4.<init>(r8)
            io.reactivex.internal.operators.observable.ObservableFlatMapSingle r5 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle
            r5.<init>(r1, r4)
            n9.g r1 = new n9.g
            r1.<init>(r0, r10)
            io.reactivex.internal.operators.observable.ObservableFlatMapSingle r4 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle
            r4.<init>(r5, r1)
            ua.f r1 = r0.f29148n
            r1.getClass()
            tp.r r1 = p456ua.C13461f.m21235b()
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r1 = r4.mo20639i(r1)
            ua.f r4 = r0.f29148n
            r4.getClass()
            tp.r r4 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r1.mo20635e(r4)
            q9.n r4 = new q9.n
            r4.<init>(r0, r8)
            com.etsy.android.lib.logger.h r5 = r0.f29145k
            java.util.Objects.requireNonNull(r5)
            n9.i r9 = new n9.i
            r9.<init>(r5, r12)
            r1.mo20636f(r4, r9, r6, r7)
            com.etsy.android.lib.session.SessionRepository r0 = r0.f29154t
            r0.mo30398a()
            java.lang.String r0 = p145io.branch.referral.Branch.f15571w
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x082b
            java.lang.String r1 = "BranchSDK"
            android.util.Log.i(r1, r0)
        L_0x082b:
            p145io.branch.referral.C7077r.f15756g = r12
            com.etsy.android.lib.core.EtsyApplication r0 = com.etsy.android.lib.core.EtsyApplication.get()
            p145io.branch.referral.Branch.m13574h(r0)
            d9.a r0 = r2.button
            android.content.Context r0 = r0.f14724a
            java.lang.String r1 = com.etsy.android.util.C12051k.f26871e
            com.usebutton.merchant.k r4 = com.usebutton.merchant.C17496l.f38264b
            com.usebutton.merchant.q r5 = com.usebutton.merchant.C17496l.m29340a(r0)
            r4.getClass()
            if (r1 == 0) goto L_0x0853
            java.util.regex.Pattern r4 = com.usebutton.merchant.C17505s.f38282b
            java.util.regex.Matcher r4 = r4.matcher(r1)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x0855
            r4 = r12
            goto L_0x0856
        L_0x0853:
            java.text.SimpleDateFormat r4 = com.usebutton.merchant.C17505s.f38281a
        L_0x0855:
            r4 = r8
        L_0x0856:
            if (r4 != 0) goto L_0x0873
            java.lang.String r4 = com.usebutton.merchant.C17494k.f38258d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Application ID ["
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "] is not valid. You can find your Application ID in the dashboard by logging in at https://app.usebutton.com/"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r4, r6)
        L_0x0873:
            r5.mo68680e(r1)
            com.usebutton.merchant.r r1 = com.usebutton.merchant.C17496l.f38265c
            com.usebutton.merchant.q r0 = com.usebutton.merchant.C17496l.m29340a(r0)
            r1.f38279a = r0
            java.util.concurrent.CopyOnWriteArrayList r4 = r1.f38280b
            java.util.Iterator r4 = r4.iterator()
        L_0x0884:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0897
            java.lang.Object r5 = r4.next()
            com.usebutton.merchant.r$a r5 = (com.usebutton.merchant.C17503r.C17504a) r5
            r5.getClass()
            r0.mo68681f()
            goto L_0x0884
        L_0x0897:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f38280b
            r0.clear()
            if (r3 == 0) goto L_0x08c2
            boolean r0 = com.etsy.android.lib.config.C8591a.m16992a(r60)
            if (r0 == 0) goto L_0x08c2
            com.etsy.android.lib.config.a r0 = p628nj.C18263b.f40056T
            r0.mo21105b(r2)
            r0.mo21106d(r2, r11)
            q9.p r1 = r2.session
            eq.a<v9.b> r3 = r1.f29141g
            java.lang.Object r3 = r3.get()
            v9.b r3 = (p463v9.C13537b) r3
            r1.f29142h = r3
            q9.p r1 = r2.session
            q9.d r1 = r1.f29137c
            r1.mo45944a()
            r0.mo21107e(r2)
        L_0x08c2:
            q9.p r0 = r2.session
            com.etsy.android.BoeUserInfoFetcher r1 = r2.boeUserInfoFetcher
            r0.f29144j = r1
            java.lang.Exception r0 = r2.googlePlayException
            if (r0 == 0) goto L_0x08d5
            com.etsy.android.lib.util.CrashUtil r0 = com.etsy.android.lib.util.CrashUtil.m17307a()
            java.lang.Exception r1 = r2.googlePlayException
            r0.mo30457b(r1)
        L_0x08d5:
            fa.a r0 = r2.grafana
            com.etsy.android.lib.config.c r1 = r2.configMap
            com.etsy.android.lib.util.e0 r3 = r2.systemTime
            java.lang.String r4 = "grafana"
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            java.lang.String r4 = "configMap"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r4 = "systemTime"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            com.etsy.android.uikit.util.OnClickDebouncerFactory r4 = new com.etsy.android.uikit.util.OnClickDebouncerFactory
            r4.<init>(r0, r1, r3)
            com.etsy.android.uikit.util.OnClickDebouncerFactory.f26450f = r4
            com.etsy.android.util.j r0 = r2.appsFlyerInitializer
            r0.mo38930c()
            n9.l r0 = r2.brazeInitializer
            q9.p r1 = r0.f28782c
            pa.d r1 = r1.f29152r
            io.reactivex.internal.operators.observable.m r1 = r1.mo45909c()
            n9.f r3 = new n9.f
            r3.<init>(r8)
            io.reactivex.internal.operators.observable.q r4 = new io.reactivex.internal.operators.observable.q
            r4.<init>(r1, r3)
            tp.n<java.lang.Boolean> r1 = r0.f28784e
            a2.f r3 = new a2.f
            r3.<init>()
            io.reactivex.internal.operators.observable.ObservableCombineLatest r1 = p248tp.C8061n.m16234b(r1, r4, r3)
            io.reactivex.internal.operators.observable.c r3 = new io.reactivex.internal.operators.observable.c
            r3.<init>(r1)
            n9.g r1 = new n9.g
            r1.<init>(r0, r8)
            io.reactivex.internal.operators.observable.ObservableFlatMapSingle r4 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle
            r4.<init>(r3, r1)
            n9.h r1 = new n9.h
            r1.<init>(r8)
            io.reactivex.internal.functions.Functions$d r3 = p145io.reactivex.internal.functions.Functions.f28540d
            io.reactivex.internal.functions.Functions$c r5 = p145io.reactivex.internal.functions.Functions.f28539c
            io.reactivex.internal.operators.observable.d r6 = new io.reactivex.internal.operators.observable.d
            r6.<init>(r4, r1, r3)
            n9.i r1 = new n9.i
            r1.<init>(r0, r8)
            io.reactivex.internal.operators.observable.d r4 = new io.reactivex.internal.operators.observable.d
            r4.<init>(r6, r3, r1)
            ua.f r1 = r0.f28785f
            r1.getClass()
            tp.r r1 = p456ua.C13461f.m21236c()
            io.reactivex.internal.operators.observable.ObservableObserveOn r1 = r4.mo20635e(r1)
            io.reactivex.subjects.a<com.braze.d> r0 = r0.f28787h
            n9.j r4 = new n9.j
            r4.<init>(r0, r8)
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a
            n9.k r6 = new n9.k
            r6.<init>(r0, r8)
            r1.mo20636f(r4, r6, r5, r3)
            com.etsy.android.qualtrics.c r0 = r2.qualtricsWrapper
            com.etsy.android.lib.config.c r1 = r2.configMap
            com.etsy.android.lib.config.EtsyConfigKey r3 = com.etsy.android.lib.config.C8592b.C8606n.f18910b
            java.lang.String r1 = r1.mo21136f(r3)
            java.lang.String r3 = com.etsy.android.util.C12051k.f26874h
            com.etsy.android.lib.config.c r4 = r2.configMap
            com.etsy.android.lib.config.EtsyConfigKey r5 = com.etsy.android.lib.config.C8592b.C8606n.f18911c
            java.lang.String r4 = r4.mo21136f(r5)
            android.content.Context r5 = r60.getApplicationContext()
            r0.mo30563c(r5, r1, r3, r4)
            ua.e r0 = r2.rxPlugins
            ua.a r1 = r2.asyncScheduler
            r1.getClass()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            tp.r r3 = p269vp.C8221a.f18049a
            if (r1 == 0) goto L_0x09a6
            vp.b r3 = new vp.b
            android.os.Handler r4 = new android.os.Handler
            r4.<init>(r1)
            r3.<init>(r4, r12)
            r0.getClass()
            ua.c r0 = new ua.c
            r0.<init>(r3, r8)
            androidx.compose.p015ui.text.input.C1993m.f4502q = r0
            ua.d r0 = new ua.d
            r0.<init>(r3, r8)
            androidx.compose.p015ui.text.input.C1993m.f4503r = r0
            r60.configureGlide()
            r60.updateEtsyLensSharingTarget()
            return
        L_0x09a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "looper == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.BOEApplication.onCreate():void");
    }

    public void onLowMemory() {
        super.onLowMemory();
        Glide.get(this).onLowMemory();
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Glide.get(this).onTrimMemory(i);
    }

    public void setApiFeaturesOverride() {
        boolean z = false;
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.config_preferences_file_name), 0);
        String string = sharedPreferences.getString(getString(R.string.config_features_override), (String) null);
        if (C8885d0.m17324h(string)) {
            LinkedHashMap linkedHashMap = DebugApiRequestDecorator.f19167a;
            DebugApiRequestDecorator.Companion.m17150b(string);
        }
        String string2 = sharedPreferences.getString(getString(R.string.config_features_date_override), (String) null);
        if (C8885d0.m17324h(string2)) {
            LinkedHashMap linkedHashMap2 = DebugApiRequestDecorator.f19167a;
            C19383o.m32797g(string2, "date");
            if (string2.length() == 0) {
                z = true;
            }
            DebugApiRequestDecorator.f19168b = z ? 0 : Long.parseLong(string2);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void setAwaitConfigsOnNextLaunch() {
        this.sharedPreferencesProvider.mo46761a().edit().putBoolean("await_config_on_launch", true).commit();
    }

    public void updateEtsyLensSharingTarget() {
        getPackageManager().setComponentEnabledSetting(new ComponentName(getPackageName(), "alias.ImageShare"), this.analyticsTracker.mo21331a(C8617e.f18938g).f18927b ? 1 : 2, 1);
    }
}
