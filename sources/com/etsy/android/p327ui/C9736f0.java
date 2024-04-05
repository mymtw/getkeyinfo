package com.etsy.android.p327ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19383o;
import p357gf.C12792a;
import p357gf.C12794c;
import p392lf.C13020a;

/* renamed from: com.etsy.android.ui.f0 */
public final class C9736f0 extends FragmentManager.C2723k {
    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c)) {
            FragmentActivity activity = fragment.getActivity();
            C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
            ((C12792a) activity).removeViewBelowAppBar(true);
        }
    }

    /* renamed from: l */
    public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c)) {
            FragmentActivity activity = fragment.getActivity();
            C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
            C12792a aVar = (C12792a) activity;
        }
    }

    /* renamed from: m */
    public final void mo10426m(FragmentManager fragmentManager, Fragment fragment, View view) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        C19383o.m32797g(view, "v");
        if (!(fragment instanceof C13020a)) {
            FragmentActivity activity = fragment.getActivity();
            C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
            C12792a aVar = (C12792a) activity;
            if (!(fragment instanceof C12794c)) {
                return;
            }
            if (!(fragment instanceof C11819z) || !((C11819z) fragment).displayTabs()) {
                aVar.removeTabLayout();
            } else {
                aVar.addTabLayout();
            }
        }
    }
}
