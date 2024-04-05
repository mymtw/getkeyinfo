package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class ActivityBreadcrumbCollector implements Application.ActivityLifecycleCallbacks {

    /* renamed from: cb */
    private final C19861p<String, Map<String, ? extends Object>, C19394m> f12103cb;
    private String prevState;

    public ActivityBreadcrumbCollector(C19861p<? super String, ? super Map<String, ? extends Object>, C19394m> pVar) {
        C19383o.m32798h(pVar, "cb");
        this.f12103cb = pVar;
    }

    private final String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private final void leaveBreadcrumb(String str, String str2, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("hasBundle", bool);
        }
        String str3 = this.prevState;
        if (str3 != null) {
            linkedHashMap.put("previous", str3);
        }
        C19861p<String, Map<String, ? extends Object>, C19394m> pVar = this.f12103cb;
        pVar.invoke(str + '#' + str2, linkedHashMap);
        this.prevState = str2;
    }

    public static /* synthetic */ void leaveBreadcrumb$default(ActivityBreadcrumbCollector activityBreadcrumbCollector, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        activityBreadcrumbCollector.leaveBreadcrumb(str, str2, bool);
    }

    public final String getPrevState() {
        return this.prevState;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb(activityName, "onCreate()", Boolean.valueOf(bundle != null));
    }

    public void onActivityDestroyed(Activity activity) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onDestroy()", (Boolean) null, 4, (Object) null);
    }

    public void onActivityPaused(Activity activity) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onPause()", (Boolean) null, 4, (Object) null);
    }

    public void onActivityResumed(Activity activity) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onResume()", (Boolean) null, 4, (Object) null);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19383o.m32798h(activity, "activity");
        C19383o.m32798h(bundle, "outState");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onSaveInstanceState()", (Boolean) null, 4, (Object) null);
    }

    public void onActivityStarted(Activity activity) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onStart()", (Boolean) null, 4, (Object) null);
    }

    public void onActivityStopped(Activity activity) {
        C19383o.m32798h(activity, "activity");
        String activityName = getActivityName(activity);
        C19383o.m32793c(activityName, "getActivityName(activity)");
        leaveBreadcrumb$default(this, activityName, "onStop()", (Boolean) null, 4, (Object) null);
    }

    public final void setPrevState(String str) {
        this.prevState = str;
    }
}
