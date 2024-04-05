package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C19383o;

public abstract class AutoActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private final Activity targetActivity;

    public AutoActivityLifecycleCallback(Activity activity) {
        C19383o.m32797g(activity, "targetActivity");
        this.targetActivity = activity;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32797g(activity, "activity");
        Activity activity2 = this.targetActivity;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            onTargetActivityDestroyed();
        }
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32797g(activity, "activity");
    }

    public abstract void onTargetActivityDestroyed();
}
