package com.etsy.android.dagger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.C8694h;
import java.util.HashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p040c9.C4465b;
import p440s9.C13366a;
import p643op.C18335a;
import p753kq.C19857l;

public final class AppInjector$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        AppInjector$activityLifecycleCallbacks$1 appInjector$activityLifecycleCallbacks$1 = AppInjector.f14260a;
        if (activity instanceof C13366a) {
            C8694h.f19097a.mo21308c();
            C0761x.m1730j0(activity);
            HashMap<Object, C19857l<Object, C19394m>> hashMap = AppInjector.f14261b;
            C19857l lVar = hashMap.get(activity.getClass());
            if (lVar != null) {
                lVar.invoke(activity);
            }
            hashMap.remove(activity.getClass());
        }
        if ((activity instanceof FragmentActivity) && (activity instanceof C18335a)) {
            ((FragmentActivity) activity).getSupportFragmentManager().mo10366S(new C4465b(), true);
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
