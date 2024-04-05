package com.etsy.android.p327ui;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C19383o;
import p357gf.C12794c;
import p392lf.C13020a;

/* renamed from: com.etsy.android.ui.a */
public final class C9090a extends FragmentManager.C2723k {

    /* renamed from: com.etsy.android.ui.a$a */
    public static abstract class C9091a {

        /* renamed from: a */
        public final boolean f19988a;

        /* renamed from: b */
        public final boolean f19989b;

        /* renamed from: com.etsy.android.ui.a$a$a */
        public static final class C9092a extends C9091a {

            /* renamed from: c */
            public static final C9092a f19990c = new C9092a();

            public C9092a() {
                super(false, false);
            }
        }

        /* renamed from: com.etsy.android.ui.a$a$b */
        public static final class C9093b extends C9091a {

            /* renamed from: c */
            public static final C9093b f19991c = new C9093b();

            public C9093b() {
                super(false, true);
            }
        }

        /* renamed from: com.etsy.android.ui.a$a$c */
        public static final class C9094c extends C9091a {

            /* renamed from: c */
            public static final C9094c f19992c = new C9094c();

            public C9094c() {
                super(false, false);
            }
        }

        /* renamed from: com.etsy.android.ui.a$a$d */
        public static final class C9095d extends C9091a {

            /* renamed from: c */
            public static final C9095d f19993c = new C9095d();

            public C9095d() {
                super(true, false);
            }
        }

        public C9091a(boolean z, boolean z2) {
            this.f19988a = z;
            this.f19989b = z2;
        }
    }

    /* renamed from: com.etsy.android.ui.a$b */
    public interface C9096b {
        C9091a getActionBarOverrides();
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        if (!(fragment instanceof C13020a) && (fragment instanceof C12794c) && (fragment.requireActivity() instanceof BOEActivity)) {
            C9091a actionBarOverrides = fragment instanceof C9096b ? ((C9096b) fragment).getActionBarOverrides() : C9091a.C9092a.f19990c;
            FragmentActivity requireActivity = fragment.requireActivity();
            C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
            BOEActivity bOEActivity = (BOEActivity) requireActivity;
            if (!actionBarOverrides.f19988a || !actionBarOverrides.f19989b) {
                bOEActivity.removeToolbarOverlay();
                if (!(actionBarOverrides instanceof C9091a.C9094c)) {
                    bOEActivity.clearActionBarCustomView();
                    if (actionBarOverrides.f19988a) {
                        ActionBar supportActionBar = bOEActivity.getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.mo1179h();
                        }
                    } else {
                        ActionBar supportActionBar2 = bOEActivity.getSupportActionBar();
                        if (supportActionBar2 != null) {
                            supportActionBar2.mo1170G();
                        }
                    }
                    if (actionBarOverrides.f19989b) {
                        bOEActivity.disableUpArrow();
                    } else {
                        bOEActivity.enableUpArrow();
                    }
                }
            } else {
                throw new IllegalStateException("We currently do not support both hiding the action bar and disabling the up arrow");
            }
        }
    }
}
