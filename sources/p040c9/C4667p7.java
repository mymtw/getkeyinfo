package p040c9;

import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.oauth2.signin.C8785m;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.home.C10010j;
import com.etsy.android.p327ui.home.home.HomeFragment;
import com.etsy.android.p327ui.home.home.HomeViewModel;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p346fa.C12703a;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.p7 */
public final class C4667p7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10481b;

    /* renamed from: c */
    public C10010j f10482c;

    public C4667p7(C4579j1 j1Var, C4690r4 r4Var) {
        this.f10481b = j1Var;
        this.f10482c = new C10010j(new C8785m(r4Var.f10570Z1, j1Var.f10148O2, j1Var.f10146O0, 2), j1Var.f10308s0, j1Var.f10278m0, j1Var.f10208a2, j1Var.f10336x3, j1Var.f10339y1, j1Var.f10260j0, j1Var.f10101F0, j1Var.f10132L1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        HomeFragment homeFragment = (HomeFragment) obj;
        homeFragment.adImpressionRepository = this.f10481b.f10336x3.get();
        homeFragment.deepLinkEligibility = this.f10481b.f10341y3.get();
        homeFragment.routeInspector = this.f10481b.mo14408q();
        homeFragment.deepLinkEntityChecker = this.f10481b.mo14400i();
        homeFragment.searchUriParser = C4579j1.m10250a(this.f10481b);
        homeFragment.logCat = this.f10481b.f10212b0.get();
        homeFragment.session = (C13265p) this.f10481b.f10101F0.get();
        homeFragment.grafana = (C12703a) this.f10481b.f10308s0.get();
        homeFragment.homeScreenPerformanceTracker = this.f10481b.mo14412u();
        homeFragment.userActionBus = C4579j1.m10255f(this.f10481b);
        C4579j1 j1Var = this.f10481b;
        homeFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, HomeViewModel.class, this.f10482c));
        homeFragment.favoriteRepository = this.f10481b.mo14405n();
        homeFragment.rxSchedulers = new C13461f();
        homeFragment.homeScreenEventManager = this.f10481b.f10208a2.get();
        homeFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f10481b));
    }
}
