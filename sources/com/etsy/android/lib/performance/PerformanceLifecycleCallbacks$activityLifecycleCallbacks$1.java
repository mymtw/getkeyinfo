package com.etsy.android.lib.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.C19383o;
import p403na.C13099a;

public final class PerformanceLifecycleCallbacks$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        if (bundle == null && (activity instanceof AppCompatActivity)) {
            ((AppCompatActivity) activity).getSupportFragmentManager().mo10366S(new C13099a(), true);
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
