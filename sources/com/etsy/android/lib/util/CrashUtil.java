package com.etsy.android.lib.util;

import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.C3067i;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C5777k;
import com.bugsnag.android.C5934x1;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8906j;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p307aa.C8494a;
import p307aa.C8495b;
import p307aa.C8496c;
import p628nj.C18263b;

public final class CrashUtil implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static CrashUtil f19613e;

    /* renamed from: f */
    public static final Object f19614f = new Object();

    /* renamed from: g */
    public static final ConcurrentLinkedQueue<Pair<String, String>> f19615g = new ConcurrentLinkedQueue<>();

    /* renamed from: h */
    public static final ArrayList f19616h;

    /* renamed from: a */
    public Context f19617a;

    /* renamed from: b */
    public ConcurrentHashMap<CrashProvider, Thread.UncaughtExceptionHandler> f19618b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public Thread.UncaughtExceptionHandler f19619c;

    /* renamed from: d */
    public C8913l f19620d;

    public enum CrashProvider {
        BUGSNAG(new C8495b());
        
        public String mApiKey;
        public EtsyConfigKey mConfigKey;
        public final C8496c mDelegate;

        private CrashProvider(C8496c cVar) {
            this.mDelegate = cVar;
        }

        public String getApiKey() {
            return this.mApiKey;
        }

        public EtsyConfigKey getConfigKey() {
            return this.mConfigKey;
        }

        public C8496c getDelegate() {
            return this.mDelegate;
        }

        public void initialize(EtsyConfigKey etsyConfigKey, String str) {
            this.mConfigKey = etsyConfigKey;
            this.mApiKey = str;
        }
    }

    /* renamed from: com.etsy.android.lib.util.CrashUtil$a */
    public static class C8876a implements Runnable {

        /* renamed from: b */
        public CrashProvider f19621b;

        /* renamed from: c */
        public Runnable f19622c;

        public C8876a(CrashProvider crashProvider, C8494a aVar) {
            this.f19621b = crashProvider;
            this.f19622c = aVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|(1:11)|12|13) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                com.etsy.android.lib.util.CrashUtil r0 = com.etsy.android.lib.util.CrashUtil.m17307a()
                java.lang.Object r1 = com.etsy.android.lib.util.CrashUtil.f19614f
                monitor-enter(r1)
                com.etsy.android.lib.util.CrashUtil$CrashProvider r2 = r5.f19621b     // Catch:{ all -> 0x0034 }
                java.util.concurrent.ConcurrentHashMap<com.etsy.android.lib.util.CrashUtil$CrashProvider, java.lang.Thread$UncaughtExceptionHandler> r3 = r0.f19618b     // Catch:{ all -> 0x0034 }
                boolean r2 = r3.containsKey(r2)     // Catch:{ all -> 0x0034 }
                if (r2 != 0) goto L_0x0032
                r2 = 0
                java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)     // Catch:{ all -> 0x0034 }
                java.lang.Runnable r2 = r5.f19622c     // Catch:{ all -> 0x002f }
                r2.run()     // Catch:{ all -> 0x002f }
                java.lang.Thread$UncaughtExceptionHandler r2 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x002f }
                if (r2 == r0) goto L_0x002f
                java.util.concurrent.ConcurrentHashMap<com.etsy.android.lib.util.CrashUtil$CrashProvider, java.lang.Thread$UncaughtExceptionHandler> r3 = r0.f19618b     // Catch:{ all -> 0x002f }
                boolean r3 = r3.containsValue(r2)     // Catch:{ all -> 0x002f }
                if (r3 != 0) goto L_0x002f
                java.util.concurrent.ConcurrentHashMap<com.etsy.android.lib.util.CrashUtil$CrashProvider, java.lang.Thread$UncaughtExceptionHandler> r3 = r0.f19618b     // Catch:{ all -> 0x002f }
                com.etsy.android.lib.util.CrashUtil$CrashProvider r4 = r5.f19621b     // Catch:{ all -> 0x002f }
                r3.put(r4, r2)     // Catch:{ all -> 0x002f }
            L_0x002f:
                java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch:{ all -> 0x0034 }
            L_0x0032:
                monitor-exit(r1)     // Catch:{ all -> 0x0034 }
                return
            L_0x0034:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0034 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.util.CrashUtil.C8876a.run():void");
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f19616h = arrayList;
        arrayList.add(C8592b.f18744L0);
        arrayList.add(C8592b.f18746M0);
        arrayList.add(C8592b.f18848z);
    }

    /* renamed from: a */
    public static CrashUtil m17307a() {
        if (f19613e == null) {
            f19613e = new CrashUtil();
        }
        return f19613e;
    }

    /* renamed from: b */
    public final void mo30457b(Throwable th) {
        for (CrashProvider crashProvider : CrashProvider.values()) {
            if (mo30461f(crashProvider)) {
                ((C8495b) crashProvider.getDelegate()).getClass();
                C19383o.m32797g(th, "throwable");
                C5777k.m11576b().mo16685d(th, (C5934x1) null);
            }
        }
    }

    /* renamed from: c */
    public final void mo30458c(Throwable th, EtsyConfigKey etsyConfigKey) {
        List<String> list = C8591a.f18700r;
        C15588c1.m25313X(new C3067i(2, this, th), C18263b.f40056T.f18706f.mo21134d(etsyConfigKey));
    }

    /* renamed from: d */
    public final void mo30459d(Context context) {
        boolean z;
        for (CrashProvider crashProvider : CrashProvider.values()) {
            if (!this.f19618b.containsKey(crashProvider)) {
                if (crashProvider.getConfigKey() != null) {
                    List<String> list = C8591a.f18700r;
                    z = C18263b.f40056T.f18706f.mo21132b(crashProvider.getConfigKey());
                } else {
                    z = true;
                }
                if (z) {
                    C8495b bVar = (C8495b) crashProvider.getDelegate();
                    bVar.getClass();
                    C19383o.m32797g(context, ResponseConstants.CONTEXT);
                    new Thread(new C8876a(crashProvider, new C8494a(crashProvider, 0, bVar, context))).start();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo30460e(C8906j jVar) {
        BreadcrumbType breadcrumbType;
        for (CrashProvider crashProvider : CrashProvider.values()) {
            if (mo30461f(crashProvider)) {
                ((C8495b) crashProvider.getDelegate()).getClass();
                if (jVar instanceof C8906j.C8907a) {
                    breadcrumbType = BreadcrumbType.MANUAL;
                } else if (jVar instanceof C8906j.C8908b) {
                    breadcrumbType = BreadcrumbType.NAVIGATION;
                } else if (jVar instanceof C8906j.C8909c) {
                    breadcrumbType = BreadcrumbType.REQUEST;
                } else if (jVar instanceof C8906j.C8911e) {
                    breadcrumbType = BreadcrumbType.USER;
                } else if (jVar instanceof C8906j.C8910d) {
                    breadcrumbType = BreadcrumbType.STATE;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C5777k.m11576b().mo16683b(breadcrumbType, jVar.f19663a, jVar.f19664b);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo30461f(CrashProvider crashProvider) {
        boolean z;
        if (this.f19618b.containsKey(crashProvider)) {
            if (crashProvider.getConfigKey() != null) {
                List<String> list = C8591a.f18700r;
                z = C18263b.f40056T.f18706f.mo21132b(crashProvider.getConfigKey());
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
        for (CrashProvider crashProvider : CrashProvider.values()) {
            if (mo30461f(crashProvider) && (uncaughtExceptionHandler = this.f19618b.get(crashProvider)) != null) {
                try {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } catch (Throwable unused) {
                }
            }
        }
        EtsyApplication.get().setAwaitConfigsOnNextLaunch();
        try {
            EtsyApplication.get().getAnalyticsTracker().mo21333d("app_crash", (Map<? extends AnalyticsProperty, Object>) null);
        } catch (Throwable th2) {
            C8694h.f19097a.error(th2);
        }
        if (BuildTarget.getAudience().isInternal()) {
            Intent intent = new Intent();
            intent.setFlags(268468224);
            intent.setClassName("com.etsy.android.beta", "com.etsy.android.exceptions.CrashInfoActivity");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2.length() > 131071) {
                stringWriter2 = stringWriter2.substring(0, 131047) + " [stack trace too large]";
            }
            intent.putExtra("stacktrace", stringWriter2);
            intent.putExtra("bugsnag_userid", C5777k.m11576b().f12627f.f12663b.f12619b);
            this.f19617a.startActivity(intent);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f19619c;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        } else {
            System.exit(1);
        }
    }
}
