package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.codeless.internal.C12223b;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p312ag.C8527d;
import p345eg.C12700c;
import p401mg.C13080a;

public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final C12238a Companion = new C12238a();
    private static final int MAX_TEXT_LENGTH = 300;
    private static final Map<Integer, ViewObserver> observers = new HashMap();
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Handler uiThreadHandler;

    /* renamed from: com.facebook.appevents.suggestedevents.ViewObserver$a */
    public static final class C12238a {
        /* renamed from: a */
        public static void m20087a(Activity activity) {
            C19383o.m32797g(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = ViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new ViewObserver(activity, (DefaultConstructorMarker) null);
                access$getObservers$cp.put(valueOf, obj);
            }
            ViewObserver.access$startTracking((ViewObserver) obj);
        }

        /* renamed from: b */
        public static void m20088b(Activity activity) {
            C19383o.m32797g(activity, "activity");
            int hashCode = activity.hashCode();
            ViewObserver viewObserver = (ViewObserver) ViewObserver.access$getObservers$cp().get(Integer.valueOf(hashCode));
            if (viewObserver != null) {
                ViewObserver.access$getObservers$cp().remove(Integer.valueOf(hashCode));
                ViewObserver.access$stopTracking(viewObserver);
            }
        }
    }

    /* renamed from: com.facebook.appevents.suggestedevents.ViewObserver$b */
    public static final class C12239b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ViewObserver f27328b;

        public C12239b(ViewObserver viewObserver) {
            this.f27328b = viewObserver;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    View b = C8527d.m16931b((Activity) ViewObserver.access$getActivityWeakReference$p(this.f27328b).get());
                    Activity activity = (Activity) ViewObserver.access$getActivityWeakReference$p(this.f27328b).get();
                    if (b == null) {
                        return;
                    }
                    if (activity != null) {
                        Iterator it = C12700c.m20375a(b).iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            if (!C12223b.m20051b(view)) {
                                String d = C12700c.m20377d(view);
                                if ((d.length() > 0) && d.length() <= 300) {
                                    ViewOnClickListener.C12240a aVar = ViewOnClickListener.Companion;
                                    String localClassName = activity.getLocalClassName();
                                    C19383o.m32796f(localClassName, "activity.localClassName");
                                    aVar.getClass();
                                    ViewOnClickListener.C12240a.m20091c(view, b, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    private ViewObserver(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    public static final /* synthetic */ WeakReference access$getActivityWeakReference$p(ViewObserver viewObserver) {
        if (C13080a.m20762b(ViewObserver.class)) {
            return null;
        }
        try {
            return viewObserver.activityWeakReference;
        } catch (Throwable th) {
            C13080a.m20761a(ViewObserver.class, th);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (C13080a.m20762b(ViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            C13080a.m20761a(ViewObserver.class, th);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(ViewObserver viewObserver) {
        if (!C13080a.m20762b(ViewObserver.class)) {
            try {
                viewObserver.startTracking();
            } catch (Throwable th) {
                C13080a.m20761a(ViewObserver.class, th);
            }
        }
    }

    public static final /* synthetic */ void access$stopTracking(ViewObserver viewObserver) {
        if (!C13080a.m20762b(ViewObserver.class)) {
            try {
                viewObserver.stopTracking();
            } catch (Throwable th) {
                C13080a.m20761a(ViewObserver.class, th);
            }
        }
    }

    private final void process() {
        if (!C13080a.m20762b(this)) {
            try {
                C12239b bVar = new C12239b(this);
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C19383o.m32796f(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    bVar.run();
                } else {
                    this.uiThreadHandler.post(bVar);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private final void startTracking() {
        View b;
        if (!C13080a.m20762b(this)) {
            try {
                if (!this.isTracking.getAndSet(true) && (b = C8527d.m16931b(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                    C19383o.m32796f(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        process();
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (!C13080a.m20762b(ViewObserver.class)) {
            try {
                Companion.getClass();
                C12238a.m20087a(activity);
            } catch (Throwable th) {
                C13080a.m20761a(ViewObserver.class, th);
            }
        }
    }

    private final void stopTracking() {
        View b;
        if (!C13080a.m20762b(this)) {
            try {
                if (this.isTracking.getAndSet(false) && (b = C8527d.m16931b(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                    C19383o.m32796f(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (!C13080a.m20762b(ViewObserver.class)) {
            try {
                Companion.getClass();
                C12238a.m20088b(activity);
            } catch (Throwable th) {
                C13080a.m20761a(ViewObserver.class, th);
            }
        }
    }

    public void onGlobalLayout() {
        if (!C13080a.m20762b(this)) {
            try {
                process();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public /* synthetic */ ViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
