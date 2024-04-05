package com.etsy.android.p327ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.c0 */
public final class C9113c0 extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.c0$a */
    public interface C9114a {
        /* renamed from: a */
        void mo31308a();
    }

    /* renamed from: com.etsy.android.ui.c0$b */
    public interface C9115b {
        C9114a interceptSearchFABClick();
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        FragmentActivity requireActivity = fragment.requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
        BOEActivity bOEActivity = (BOEActivity) requireActivity;
        if (fragment instanceof C9115b) {
            bOEActivity.showSearchFAB(((C9115b) fragment).interceptSearchFABClick(), C12790b.m20432d(fragment));
        }
    }

    /* renamed from: l */
    public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        FragmentActivity requireActivity = fragment.requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
        BOEActivity bOEActivity = (BOEActivity) requireActivity;
        if (fragment instanceof C9115b) {
            bOEActivity.hideSearchFAB();
        }
    }
}
