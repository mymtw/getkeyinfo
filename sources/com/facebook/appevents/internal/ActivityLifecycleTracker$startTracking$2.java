package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.codeless.CodelessMatcher;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p312ag.C8523a;
import p312ag.C8524b;
import p312ag.C8526c;
import p312ag.C8527d;
import p345eg.C12702e;
import p365hg.C12845c0;
import p365hg.C12869i0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;
import p461uf.C13503d;
import p461uf.C13508f;
import p461uf.C13511h;
import p469vf.C13789b;
import p469vf.C13791d;
import p476wf.C13837b;
import p476wf.C13838c;
import p476wf.C13841f;
import p492yf.C13935g;

public final class ActivityLifecycleTracker$startTracking$2 implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String str = ActivityLifecycleTracker.f27293a;
        aVar.mo45626b(loggingBehavior, ActivityLifecycleTracker.f27293a, "onActivityCreated");
        int i = C8527d.f18569a;
        ActivityLifecycleTracker.f27294b.execute(C8523a.f18562b);
    }

    public void onActivityDestroyed(Activity activity) {
        CodelessMatcher a;
        C19383o.m32797g(activity, "activity");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27304l;
        aVar.mo45626b(loggingBehavior, ActivityLifecycleTracker.f27293a, "onActivityDestroyed");
        activityLifecycleTracker.getClass();
        ViewIndexingTrigger viewIndexingTrigger = C13838c.f30456a;
        Class<C13838c> cls = C13838c.class;
        if (!C13080a.m20762b(cls)) {
            try {
                a = CodelessMatcher.f27258g.mo39307a();
                if (!C13080a.m20762b(a)) {
                    a.f27263e.remove(Integer.valueOf(activity.hashCode()));
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        ScheduledFuture<?> scheduledFuture;
        C19383o.m32797g(activity, "activity");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27304l;
        String str = ActivityLifecycleTracker.f27293a;
        aVar.mo45626b(loggingBehavior, str, "onActivityPaused");
        int i = C8527d.f18569a;
        activityLifecycleTracker.getClass();
        AtomicInteger atomicInteger = ActivityLifecycleTracker.f27297e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        synchronized (ActivityLifecycleTracker.f27296d) {
            if (!(ActivityLifecycleTracker.f27295c == null || (scheduledFuture = ActivityLifecycleTracker.f27295c) == null)) {
                scheduledFuture.cancel(false);
            }
            ActivityLifecycleTracker.f27295c = null;
            C19394m mVar = C19394m.f43287a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String l = C12869i0.m20573l(activity);
        ViewIndexingTrigger viewIndexingTrigger = C13838c.f30456a;
        Class<C13838c> cls = C13838c.class;
        if (!C13080a.m20762b(cls)) {
            try {
                if (C13838c.f30460e.get()) {
                    CodelessMatcher.f27258g.mo39307a().mo39303c(activity);
                    C13841f fVar = C13838c.f30458c;
                    if (fVar != null && !C13080a.m20762b(fVar)) {
                        try {
                            if (fVar.f30467b.get() != null) {
                                Timer timer = fVar.f30468c;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                fVar.f30468c = null;
                            }
                        } catch (Exception e) {
                            Log.e(C13841f.f30465e, "Error unscheduling indexing job", e);
                        } catch (Throwable th) {
                            C13080a.m20761a(fVar, th);
                        }
                    }
                    SensorManager sensorManager = C13838c.f30457b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(C13838c.f30456a);
                    }
                }
            } catch (Throwable th2) {
                C13080a.m20761a(cls, th2);
            }
        }
        ActivityLifecycleTracker.f27294b.execute(new C8524b(currentTimeMillis, l));
    }

    public void onActivityResumed(Activity activity) {
        ScheduledFuture<?> scheduledFuture;
        Class<C13838c> cls = C13838c.class;
        C19383o.m32797g(activity, "activity");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27304l;
        aVar.mo45626b(loggingBehavior, ActivityLifecycleTracker.f27293a, "onActivityResumed");
        int i = C8527d.f18569a;
        ActivityLifecycleTracker.f27303k = new WeakReference<>(activity);
        ActivityLifecycleTracker.f27297e.incrementAndGet();
        activityLifecycleTracker.getClass();
        synchronized (ActivityLifecycleTracker.f27296d) {
            if (!(ActivityLifecycleTracker.f27295c == null || (scheduledFuture = ActivityLifecycleTracker.f27295c) == null)) {
                scheduledFuture.cancel(false);
            }
            ActivityLifecycleTracker.f27295c = null;
            C19394m mVar = C19394m.f43287a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ActivityLifecycleTracker.f27301i = currentTimeMillis;
        String l = C12869i0.m20573l(activity);
        ViewIndexingTrigger viewIndexingTrigger = C13838c.f30456a;
        if (!C13080a.m20762b(cls)) {
            try {
                if (C13838c.f30460e.get()) {
                    CodelessMatcher.f27258g.mo39307a().mo39301a(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String c = C13418j.m21107c();
                    C12882n b = FetchedAppSettingsManager.m20104b(c);
                    if (b != null) {
                        if (b.f28406j) {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            C13838c.f30457b = sensorManager;
                            if (sensorManager != null) {
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                C13838c.f30458c = new C13841f(activity);
                                ViewIndexingTrigger viewIndexingTrigger2 = C13838c.f30456a;
                                viewIndexingTrigger2.setOnShakeListener(new C13837b(b, c));
                                SensorManager sensorManager2 = C13838c.f30457b;
                                if (sensorManager2 != null) {
                                    sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                                    if (b.f28406j) {
                                        C13841f fVar = C13838c.f30458c;
                                        if (fVar != null) {
                                            fVar.mo46678c();
                                        } else {
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                    }
                                    C13080a.m20762b(cls);
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                        }
                    }
                    C13080a.m20762b(cls);
                    C13080a.m20762b(cls);
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        String str = C13789b.f30347a;
        Class<C13789b> cls2 = C13789b.class;
        if (!C13080a.m20762b(cls2)) {
            try {
                if (C13789b.f30348b) {
                    C13791d.f30352e.getClass();
                    if (!new HashSet(C13791d.m21342a()).isEmpty()) {
                        MetadataViewObserver.Companion.getClass();
                        MetadataViewObserver.C12213a.m20038b(activity);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C13080a.m20761a(cls2, th2);
            }
        }
        C12702e.m20380c(activity);
        C13935g.m21461a();
        ActivityLifecycleTracker.f27294b.execute(new C8526c(activity.getApplicationContext(), l, currentTimeMillis));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(bundle, "outState");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String str = ActivityLifecycleTracker.f27293a;
        aVar.mo45626b(loggingBehavior, ActivityLifecycleTracker.f27293a, "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32797g(activity, "activity");
        String str = ActivityLifecycleTracker.f27293a;
        ActivityLifecycleTracker.f27302j++;
        C12845c0.f28334f.mo45626b(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.f27293a, "onActivityStarted");
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32797g(activity, "activity");
        C12845c0.C12846a aVar = C12845c0.f28334f;
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        String str = ActivityLifecycleTracker.f27293a;
        aVar.mo45626b(loggingBehavior, ActivityLifecycleTracker.f27293a, "onActivityStopped");
        C13511h.f29567i.getClass();
        String str2 = C13503d.f29545a;
        Class<C13503d> cls = C13503d.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C13503d.f29548d.execute(C13508f.f29559b);
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        String str3 = ActivityLifecycleTracker.f27293a;
        ActivityLifecycleTracker.f27302j--;
    }
}
