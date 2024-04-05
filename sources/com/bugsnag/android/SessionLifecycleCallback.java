package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import kotlin.jvm.internal.C19383o;

public final class SessionLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private final C5738e2 sessionTracker;

    public SessionLifecycleCallback(C5738e2 e2Var) {
        C19383o.m32798h(e2Var, "sessionTracker");
        this.sessionTracker = e2Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32798h(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32798h(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32798h(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32798h(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32798h(activity, "activity");
        C19383o.m32798h(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32798h(activity, "activity");
        C5738e2 e2Var = this.sessionTracker;
        String simpleName = activity.getClass().getSimpleName();
        e2Var.getClass();
        e2Var.mo16509g(SystemClock.elapsedRealtime(), simpleName, true);
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32798h(activity, "activity");
        C5738e2 e2Var = this.sessionTracker;
        String simpleName = activity.getClass().getSimpleName();
        e2Var.getClass();
        e2Var.mo16509g(SystemClock.elapsedRealtime(), simpleName, false);
    }
}
