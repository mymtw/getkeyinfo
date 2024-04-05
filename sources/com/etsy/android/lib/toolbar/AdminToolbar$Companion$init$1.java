package com.etsy.android.lib.toolbar;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.toolbar.C8860a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p643op.C18335a;

public final class AdminToolbar$Companion$init$1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: com.etsy.android.lib.toolbar.AdminToolbar$Companion$init$1$a */
    public static final class C8859a extends FragmentManager.C2723k {
        /* renamed from: i */
        public final void mo10422i(FragmentManager fragmentManager, Fragment fragment) {
            C19383o.m32797g(fragmentManager, "fm");
            C19383o.m32797g(fragment, "f");
            int i = C8860a.f19556m;
            String simpleName = fragment.getClass().getSimpleName();
            if (C8860a.C8861a.m17264a() && !C19383o.m32792b(simpleName, "SupportRequestManagerFragment")) {
                C8860a aVar = C8860a.f19558o;
                C19383o.m32794d(aVar);
                aVar.f19564e = simpleName;
                C8860a aVar2 = C8860a.f19558o;
                C19383o.m32794d(aVar2);
                C8860a.m17262a(aVar2);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C19383o.m32797g(activity, "activity");
        if ((activity instanceof FragmentActivity) && (activity instanceof C18335a)) {
            ((FragmentActivity) activity).getSupportFragmentManager().mo10366S(new C8859a(), true);
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
        int i = C8860a.f19556m;
        if (C8860a.C8861a.m17264a()) {
            WeakReference<Activity> weakReference = new WeakReference<>(activity);
            C8860a.f19557n = weakReference;
            Activity activity2 = weakReference.get();
            C19383o.m32794d(activity2);
            String simpleName = activity2.getClass().getSimpleName();
            if (C8860a.C8861a.m17264a()) {
                C8860a aVar = C8860a.f19558o;
                C19383o.m32794d(aVar);
                aVar.f19565f = simpleName;
                C8860a aVar2 = C8860a.f19558o;
                C19383o.m32794d(aVar2);
                C8860a.m17262a(aVar2);
            }
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
    }
}
