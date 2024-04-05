package com.etsy.android.p327ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.etsy.android.uikit.BaseActivity;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.d0 */
public final class C9718d0 extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.d0$a */
    public interface C9719a {
        int getNavDrawableRes();
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        FragmentActivity requireActivity = fragment.requireActivity();
        C19383o.m32796f(requireActivity, "f.requireActivity()");
        if ((requireActivity instanceof BaseActivity) && (fragment instanceof C9719a)) {
            ((BaseActivity) requireActivity).getAppBarHelper().setNavigationIcon(VectorDrawableCompat.create(requireActivity.getResources(), ((C9719a) fragment).getNavDrawableRes(), requireActivity.getTheme()).mutate());
        }
    }
}
