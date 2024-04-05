package com.etsy.android.p327ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19383o;
import p357gf.C12794c;
import p392lf.C13020a;

/* renamed from: com.etsy.android.ui.t */
public final class C11324t extends FragmentManager.C2723k {

    /* renamed from: a */
    public final C10707p f24985a;

    /* renamed from: com.etsy.android.ui.t$a */
    public static abstract class C11325a {

        /* renamed from: a */
        public final boolean f24986a;

        /* renamed from: b */
        public final boolean f24987b;

        /* renamed from: com.etsy.android.ui.t$a$a */
        public static final class C11326a extends C11325a {

            /* renamed from: c */
            public static final C11326a f24988c = new C11326a();

            public C11326a() {
                super(false, false);
            }
        }

        /* renamed from: com.etsy.android.ui.t$a$b */
        public static final class C11327b extends C11325a {

            /* renamed from: c */
            public static final C11327b f24989c = new C11327b();

            public C11327b() {
                super(true, false);
            }
        }

        /* renamed from: com.etsy.android.ui.t$a$c */
        public static final class C11328c extends C11325a {
            public C11328c() {
                super(false, true);
            }
        }

        public C11325a(boolean z, boolean z2) {
            this.f24986a = z;
            this.f24987b = z2;
        }
    }

    /* renamed from: com.etsy.android.ui.t$b */
    public interface C11329b {
        C11325a getBottomTabsOverrides();
    }

    public C11324t(BOEActivity bOEActivity) {
        C19383o.m32797g(bOEActivity, "bottomNavBarProvider");
        this.f24985a = bOEActivity;
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c) && (fragment.requireActivity() instanceof BOEActivity)) {
            C11325a bottomTabsOverrides = fragment instanceof C11329b ? ((C11329b) fragment).getBottomTabsOverrides() : C11325a.C11326a.f24988c;
            if (!bottomTabsOverrides.f24986a || !bottomTabsOverrides.f24987b) {
                FragmentActivity requireActivity = fragment.requireActivity();
                C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
                BOEActivity bOEActivity = (BOEActivity) requireActivity;
                C10711s sVar = null;
                if (bottomTabsOverrides.f24986a) {
                    this.f24985a.allowBottomNavBarToHide(true, (C10711s) null);
                    bOEActivity.showBottomNav(false);
                    return;
                }
                if (bottomTabsOverrides instanceof C11325a.C11328c) {
                    sVar = null;
                    ((C11325a.C11328c) bottomTabsOverrides).getClass();
                }
                bOEActivity.allowBottomNavBarToHide(bottomTabsOverrides.f24987b, sVar);
                bOEActivity.showBottomNav(true);
                return;
            }
            throw new IllegalStateException("We currently do not support both full screen and hiding bottom nav on scrolling");
        }
    }
}
