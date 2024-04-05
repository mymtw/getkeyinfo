package com.etsy.android.lib.util;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8906j;
import com.google.android.play.core.appupdate.C15562d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p568fn.C17782b;

public final class Breadcrumbs {

    public static final class LifecycleCallbacks {

        /* renamed from: a */
        public static final List<String> f19610a = C17782b.m29864d0("SupportRequestManagerFragment");

        /* renamed from: b */
        public static final Breadcrumbs$LifecycleCallbacks$activityLifecycleCallbacks$1 f19611b = new Breadcrumbs$LifecycleCallbacks$activityLifecycleCallbacks$1();

        /* renamed from: c */
        public static final C8875a f19612c = new C8875a();

        /* renamed from: com.etsy.android.lib.util.Breadcrumbs$LifecycleCallbacks$a */
        public static final class C8875a extends FragmentManager.C2723k {
            /* renamed from: a */
            public final void mo10414a(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: b */
            public final void mo10415b(FragmentManager fragmentManager, Fragment fragment, Context context) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
            }

            /* renamed from: c */
            public final void mo10416c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                if (!LifecycleCallbacks.f19610a.contains(fragment.getClass().getSimpleName())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (bundle != null) {
                        C15562d.m25165C(bundle, "", linkedHashMap);
                    }
                    linkedHashMap.put("lifecycle", "onCreated");
                    Breadcrumbs.m17292a(fragment.getClass().getSimpleName(), linkedHashMap);
                }
            }

            /* renamed from: d */
            public final void mo10417d(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: e */
            public final void mo10418e(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: f */
            public final void mo10419f(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: g */
            public final void mo10420g(FragmentManager fragmentManager, Fragment fragment, Context context) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
            }

            /* renamed from: h */
            public final void mo10421h(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: i */
            public final void mo10422i(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: j */
            public final void mo10423j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }

            /* renamed from: k */
            public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                Breadcrumbs.m17292a(fragment.getClass().getSimpleName(), C19421p.m32931U(new Pair("lifecycle", "onStarted")));
            }

            /* renamed from: l */
            public final void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                Breadcrumbs.m17292a(fragment.getClass().getSimpleName(), C19421p.m32931U(new Pair("lifecycle", "onStopped")));
            }

            /* renamed from: m */
            public final void mo10426m(FragmentManager fragmentManager, Fragment fragment, View view) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
                C19383o.m32797g(view, "v");
            }

            /* renamed from: n */
            public final void mo10427n(FragmentManager fragmentManager, Fragment fragment) {
                C19383o.m32797g(fragmentManager, "fm");
                C19383o.m32797g(fragment, "f");
            }
        }
    }

    /* renamed from: a */
    public static final void m17292a(String str, Map<String, String> map) {
        CrashUtil.m17307a().mo30460e(new C8906j.C8908b(str, map));
    }
}
