package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.internal.FeatureManager;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p312ag.C8532h;
import p401mg.C13080a;
import p476wf.C13838c;

public final class ActivityLifecycleTracker {

    /* renamed from: a */
    public static final String f27293a;

    /* renamed from: b */
    public static final ScheduledExecutorService f27294b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public static volatile ScheduledFuture<?> f27295c;

    /* renamed from: d */
    public static final Object f27296d = new Object();

    /* renamed from: e */
    public static final AtomicInteger f27297e = new AtomicInteger(0);

    /* renamed from: f */
    public static volatile C8532h f27298f;

    /* renamed from: g */
    public static final AtomicBoolean f27299g = new AtomicBoolean(false);

    /* renamed from: h */
    public static String f27300h;

    /* renamed from: i */
    public static long f27301i;

    /* renamed from: j */
    public static int f27302j;

    /* renamed from: k */
    public static WeakReference<Activity> f27303k;

    /* renamed from: l */
    public static final ActivityLifecycleTracker f27304l = new ActivityLifecycleTracker();

    /* renamed from: com.facebook.appevents.internal.ActivityLifecycleTracker$a */
    public static final class C12230a implements FeatureManager.C12256a {

        /* renamed from: b */
        public static final C12230a f27305b = new C12230a();

        /* renamed from: n */
        public final void mo20n(boolean z) {
            Class<C13838c> cls = C13838c.class;
            if (z) {
                ViewIndexingTrigger viewIndexingTrigger = C13838c.f30456a;
                if (!C13080a.m20762b(cls)) {
                    try {
                        C13838c.f30460e.set(true);
                    } catch (Throwable th) {
                        C13080a.m20761a(cls, th);
                    }
                }
            } else {
                ViewIndexingTrigger viewIndexingTrigger2 = C13838c.f30456a;
                if (!C13080a.m20762b(cls)) {
                    try {
                        C13838c.f30460e.set(false);
                    } catch (Throwable th2) {
                        C13080a.m20761a(cls, th2);
                    }
                }
            }
        }
    }

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f27293a = canonicalName;
    }

    /* renamed from: a */
    public static final UUID m20067a() {
        C8532h hVar;
        if (f27298f == null || (hVar = f27298f) == null) {
            return null;
        }
        return hVar.f18588f;
    }

    /* renamed from: b */
    public static final void m20068b(Application application, String str) {
        if (f27299g.compareAndSet(false, true)) {
            FeatureManager.m20098a(C12230a.f27305b, FeatureManager.Feature.CodelessEvents);
            f27300h = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleTracker$startTracking$2());
        }
    }
}
