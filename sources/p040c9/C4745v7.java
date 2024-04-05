package p040c9;

import com.etsy.android.lib.currency.C8638i;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.C9310h;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.landingpage.LandingPageFragment;
import com.etsy.android.p327ui.home.landingpage.LandingPageViewModel;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p514bk.C14088a;

/* renamed from: c9.v7 */
public final class C4745v7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10714b;

    /* renamed from: c */
    public C8638i f10715c;

    public C4745v7(C4579j1 j1Var, C14088a aVar) {
        this.f10714b = j1Var;
        this.f10715c = new C8638i(new C9310h(new C4672q(aVar, j1Var.f10091D0, 6), j1Var.f10146O0, 1), C13462g.C13463a.f29482a, new C8647f(aVar, 1), j1Var.f10308s0, j1Var.f10336x3, j1Var.f10199Y3, 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        LandingPageFragment landingPageFragment = (LandingPageFragment) obj;
        landingPageFragment.adImpressionRepository = this.f10714b.f10336x3.get();
        landingPageFragment.deepLinkEligibility = this.f10714b.f10341y3.get();
        landingPageFragment.routeInspector = this.f10714b.mo14408q();
        landingPageFragment.deepLinkEntityChecker = this.f10714b.mo14400i();
        landingPageFragment.searchUriParser = C4579j1.m10250a(this.f10714b);
        landingPageFragment.performanceTrackerAdapter = new C8704a(this.f10714b.mo14412u());
        landingPageFragment.rxSchedulers = new C13461f();
        landingPageFragment.favoriteRepository = this.f10714b.mo14405n();
        landingPageFragment.session = (C13265p) this.f10714b.f10101F0.get();
        landingPageFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f10714b));
        C4579j1 j1Var = this.f10714b;
        landingPageFragment.viewModelFactory = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, LandingPageViewModel.class, this.f10715c));
    }
}
