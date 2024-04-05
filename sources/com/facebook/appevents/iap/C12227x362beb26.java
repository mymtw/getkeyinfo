package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p453tf.C13418j;
import p492yf.C13922a;
import p492yf.C13933e;

/* renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 */
public final class C12227x362beb26 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$a */
    public static final class C12228a implements Runnable {

        /* renamed from: b */
        public static final C12228a f27291b = new C12228a();

        public final void run() {
            Context b;
            Class<C13933e> cls;
            ArrayList<String> arrayList;
            if (!C13080a.m20762b(this)) {
                try {
                    b = C13418j.m21106b();
                    C13922a.m21429a(C13922a.f30598i, b, C13933e.m21444g(b, C13922a.f30597h), false);
                    Object obj = C13922a.f30597h;
                    cls = C13933e.class;
                    arrayList = null;
                    if (!C13080a.m20762b(cls)) {
                        C19383o.m32797g(b, ResponseConstants.CONTEXT);
                        C13933e eVar = C13933e.f30637f;
                        arrayList = eVar.mo46745a(eVar.mo46749f(b, obj, "subs"));
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                    return;
                }
                C13922a.m21429a(C13922a.f30598i, b, arrayList, true);
            }
        }
    }

    /* renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$b */
    public static final class C12229b implements Runnable {

        /* renamed from: b */
        public static final C12229b f27292b = new C12229b();

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    Context b = C13418j.m21106b();
                    C13922a aVar = C13922a.f30598i;
                    ArrayList<String> g = C13933e.m21444g(b, C13922a.f30597h);
                    if (g.isEmpty()) {
                        g = C13933e.m21443e(b, C13922a.f30597h);
                    }
                    C13922a.m21429a(aVar, b, g, false);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32797g(activity, "activity");
        try {
            C13418j.m21108d().execute(C12228a.f27291b);
        } catch (Exception unused) {
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32797g(activity, "activity");
        try {
            String str = C13922a.f30590a;
            if (C19383o.m32792b(C13922a.f30593d, Boolean.TRUE) && C19383o.m32792b(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                C13418j.m21108d().execute(C12229b.f27292b);
            }
        } catch (Exception unused) {
        }
    }
}
