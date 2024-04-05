package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.countryselector.SearchCountrySelectorFragment;
import com.etsy.android.p327ui.util.countries.C11775a;
import com.etsy.android.p327ui.util.countries.CountrySelectorViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.da */
public final class C4504da implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9930b;

    /* renamed from: c */
    public C11775a f9931c;

    public C4504da(C4579j1 j1Var) {
        this.f9930b = j1Var;
        this.f9931c = new C11775a(j1Var.f10103F2, j1Var.f10212b0, j1Var.f10308s0, j1Var.f10278m0, j1Var.f10298q0);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchCountrySelectorFragment searchCountrySelectorFragment = (SearchCountrySelectorFragment) obj;
        searchCountrySelectorFragment.schedulers = new C13461f();
        C4579j1 j1Var = this.f9930b;
        searchCountrySelectorFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, CountrySelectorViewModel.class, this.f9931c));
        searchCountrySelectorFragment.logCat = this.f9930b.f10212b0.get();
        searchCountrySelectorFragment.currentLocale = this.f9930b.f10298q0.get();
    }
}
