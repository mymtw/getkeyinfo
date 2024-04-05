package com.etsy.android.p327ui;

import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.C0326j;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import p357gf.C12794c;
import p392lf.C13020a;

/* renamed from: com.etsy.android.ui.l0 */
public final class C10082l0 extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.l0$a */
    public static abstract class C10083a {

        /* renamed from: com.etsy.android.ui.l0$a$a */
        public static final class C10084a extends C10083a {

            /* renamed from: a */
            public static final C10084a f22217a = new C10084a();
        }

        /* renamed from: com.etsy.android.ui.l0$a$b */
        public static final class C10085b extends C10083a {

            /* renamed from: a */
            public static final C10085b f22218a = new C10085b();
        }
    }

    /* renamed from: com.etsy.android.ui.l0$b */
    public interface C10086b {
        C10083a getWindowInsetsOverrides();
    }

    /* renamed from: l */
    public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fragmentManager");
        C19383o.m32797g(fragment, "fragment");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c) && (fragment.requireActivity() instanceof BOEActivity)) {
            FragmentActivity requireActivity = fragment.requireActivity();
            C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
            ActionBar supportActionBar = ((BOEActivity) requireActivity).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo1170G();
            }
        }
    }

    /* renamed from: m */
    public final void mo10426m(FragmentManager fragmentManager, Fragment fragment, View view) {
        C19383o.m32797g(fragmentManager, "fragmentManager");
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(view, "view");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c) && (fragment.requireActivity() instanceof BOEActivity)) {
            Object windowInsetsOverrides = fragment instanceof C10086b ? ((C10086b) fragment).getWindowInsetsOverrides() : C10083a.C10084a.f22217a;
            FragmentActivity requireActivity = fragment.requireActivity();
            C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
            BOEActivity bOEActivity = (BOEActivity) requireActivity;
            C0326j jVar = new C0326j();
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5274u(view, jVar);
            if (C19383o.m32792b(windowInsetsOverrides, C10083a.C10084a.f22217a)) {
                C2364y.C2373i.m5274u(bOEActivity.getAppBarHelper().getToolbar(), new C10080k0(bOEActivity));
            }
        }
    }
}
