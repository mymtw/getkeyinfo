package com.etsy.android.p327ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import p357gf.C12794c;

/* renamed from: com.etsy.android.ui.v */
public final class C11787v extends FragmentManager.C2723k {
    /* renamed from: l */
    public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (fragment instanceof C12794c) {
            C15588c1.m25340p0(fragment.getView());
        }
    }
}
