package com.etsy.android.p327ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p733ar.C18974a;

/* renamed from: com.etsy.android.ui.m0 */
public final class C10674m0 extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.m0$a */
    public interface C10675a {
        int softInputMode();
    }

    /* renamed from: com.etsy.android.ui.m0$b */
    public static final class C10676b implements C18974a {

        /* renamed from: a */
        public final BOEActivity f23511a;

        public C10676b(BOEActivity bOEActivity) {
            this.f23511a = bOEActivity;
        }

        /* renamed from: a */
        public final void mo31997a(boolean z) {
            if (z) {
                this.f23511a.showTransparentStatusBar(false);
            } else {
                this.f23511a.showTransparentStatusBar(true);
            }
        }
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (fragment instanceof C10675a) {
            int softInputMode = ((C10675a) fragment).softInputMode();
            Bundle arguments = fragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            FragmentActivity requireActivity = fragment.requireActivity();
            C19383o.m32796f(requireActivity, "fragment.requireActivity()");
            arguments.putInt("arg_soft_input_mode", requireActivity.getWindow().getAttributes().softInputMode);
            fragment.setArguments(arguments);
            requireActivity.getWindow().setSoftInputMode(softInputMode);
            if (requireActivity instanceof BOEActivity) {
                Boolean isFullScreen = ((BOEActivity) requireActivity).isFullScreen();
                C19383o.m32796f(isFullScreen, "activity.isFullScreen");
                if (isFullScreen.booleanValue()) {
                    FragmentActivity requireActivity2 = fragment.requireActivity();
                    C19383o.m32796f(requireActivity2, "fragment.requireActivity()");
                    FragmentActivity requireActivity3 = fragment.requireActivity();
                    C19383o.m32795e(requireActivity3, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
                    C19382n.m32700B0(requireActivity2, new C10676b((BOEActivity) requireActivity3));
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (fragment instanceof C10675a) {
            Bundle requireArguments = fragment.requireArguments();
            C19383o.m32796f(requireArguments, "fragment.requireArguments()");
            fragment.requireActivity().getWindow().setSoftInputMode(requireArguments.getInt("arg_soft_input_mode", 0));
        }
    }
}
