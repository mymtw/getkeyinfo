package com.etsy.android.lib.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.lib.util.Breadcrumbs;
import com.google.android.play.core.appupdate.C15562d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

public final class Breadcrumbs$LifecycleCallbacks$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        if (!Breadcrumbs.LifecycleCallbacks.f19610a.contains(activity.getClass().getSimpleName())) {
            if (bundle == null && (activity instanceof AppCompatActivity)) {
                ((AppCompatActivity) activity).getSupportFragmentManager().mo10366S(Breadcrumbs.LifecycleCallbacks.f19612c, true);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (bundle != null) {
                C15562d.m25165C(bundle, "", linkedHashMap);
            }
            Breadcrumbs.m17292a(activity.getClass().getSimpleName(), linkedHashMap);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32797g(activity, "activity");
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
    }
}
