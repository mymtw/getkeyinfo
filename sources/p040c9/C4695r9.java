package p040c9;

import com.etsy.android.lib.currency.C8638i;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.network.oauth2.C8760j;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.C9310h;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.landingpage.LandingPageViewModel;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10038a;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10043d;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10044e;
import com.etsy.android.p327ui.home.recentlyviewedpage.C10045f;
import com.etsy.android.p327ui.home.recentlyviewedpage.RecentlyViewedPageFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import com.squareup.moshi.C17414y;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p357gf.C12796e;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p514bk.C14088a;
import p740eq.C19011a;

/* renamed from: c9.r9 */
public final class C4695r9 implements C17550a {

    /* renamed from: b */
    public final C19543e0 f10621b;

    /* renamed from: c */
    public final C4579j1 f10622c;

    /* renamed from: d */
    public C8638i f10623d;

    /* renamed from: e */
    public C8760j f10624e;

    public C4695r9(C4579j1 j1Var, C14088a aVar, C19543e0 e0Var) {
        this.f10622c = j1Var;
        this.f10621b = e0Var;
        C17553b bVar = j1Var.f10091D0;
        C4672q qVar = new C4672q(aVar, bVar, 6);
        C19011a<C17414y> aVar2 = j1Var.f10146O0;
        C9310h hVar = new C9310h(qVar, aVar2, 1);
        C8647f fVar = new C8647f(aVar, 1);
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f10623d = new C8638i(hVar, gVar, fVar, j1Var.f10308s0, j1Var.f10336x3, j1Var.f10199Y3, 1);
        this.f10624e = new C8760j(new C10044e(j1Var.f10260j0, new C8655n(e0Var, bVar, 2), aVar2), gVar, fVar, 3);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        RecentlyViewedPageFragment recentlyViewedPageFragment = (RecentlyViewedPageFragment) obj;
        recentlyViewedPageFragment.adImpressionRepository = this.f10622c.f10336x3.get();
        recentlyViewedPageFragment.deepLinkEligibility = this.f10622c.f10341y3.get();
        recentlyViewedPageFragment.routeInspector = this.f10622c.mo14408q();
        recentlyViewedPageFragment.deepLinkEntityChecker = this.f10622c.mo14400i();
        recentlyViewedPageFragment.searchUriParser = C4579j1.m10250a(this.f10622c);
        recentlyViewedPageFragment.performanceTrackerAdapter = new C8704a(this.f10622c.mo14412u());
        recentlyViewedPageFragment.rxSchedulers = new C13461f();
        recentlyViewedPageFragment.favoriteRepository = this.f10622c.mo14405n();
        recentlyViewedPageFragment.session = (C13265p) this.f10622c.f10101F0.get();
        recentlyViewedPageFragment.listingImagesRepository = new C12796e(C4579j1.m10253d(this.f10622c));
        C4579j1 j1Var = this.f10622c;
        recentlyViewedPageFragment.viewModelFactory = new C8656o(ImmutableMap.m25858of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, LandingPageViewModel.class, this.f10623d, C10045f.class, this.f10624e));
        C19543e0 e0Var = this.f10621b;
        C8731g gVar = (C8731g) this.f10622c.f10091D0.get();
        e0Var.getClass();
        C19383o.m32797g(gVar, "v3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C10038a.class);
        C19383o.m32796f(b, "v3MoshiRetrofit.v3moshiR…ewedEndpoint::class.java)");
        recentlyViewedPageFragment.recentlyViewedPageRepository = new C10043d(this.f10622c.f10260j0.get(), (C10038a) b, this.f10622c.f10146O0.get());
    }
}
