package com.etsy.android.p327ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.e0 */
public final class C9731e0 extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.e0$a */
    public interface C9732a {
        String getFragmentTitleString();
    }

    /* renamed from: com.etsy.android.ui.e0$b */
    public interface C9733b {
        int getFragmentTitle();
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (fragment instanceof C9733b) {
            fragment.requireActivity().setTitle(fragment.getResources().getString(((C9733b) fragment).getFragmentTitle()));
        } else if (fragment instanceof C9732a) {
            fragment.requireActivity().setTitle(((C9732a) fragment).getFragmentTitleString());
        }
    }
}
