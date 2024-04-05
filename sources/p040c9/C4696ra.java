package p040c9;

import androidx.activity.C0114h;
import com.etsy.android.config.flags.C6381j;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.oauth2.C8757g0;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.googlepay.C9304b;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.search.C10864g;
import com.etsy.android.p327ui.search.listingresults.C10906f;
import com.etsy.android.p327ui.search.listingresults.C10907g;
import com.etsy.android.p327ui.search.listingresults.C10908h;
import com.etsy.android.p327ui.search.listingresults.C10924l;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsViewModel;
import com.etsy.android.p327ui.search.p330v2.filters.C10982c;
import com.etsy.android.p327ui.search.p330v2.filters.C10983d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.google.common.collect.ImmutableMap;
import com.squareup.moshi.C17414y;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import kotlin.jvm.internal.C19382n;
import p346fa.C12703a;
import p357gf.C12796e;
import p425q9.C13253e;
import p425q9.C13265p;
import p456ua.C13461f;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: c9.ra */
public final class C4696ra implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10625b;

    /* renamed from: c */
    public final C4690r4 f10626c;

    /* renamed from: d */
    public C10983d f10627d;

    /* renamed from: e */
    public C10924l f10628e;

    public C4696ra(C4579j1 j1Var, C4690r4 r4Var, C18263b bVar, C0114h hVar, C19382n nVar) {
        C4579j1 j1Var2 = j1Var;
        C4690r4 r4Var2 = r4Var;
        C19382n nVar2 = nVar;
        this.f10625b = j1Var2;
        this.f10626c = r4Var2;
        C17553b bVar2 = j1Var2.f10091D0;
        C8654m mVar = new C8654m(hVar, bVar2, 3);
        C19011a<C17414y> aVar = j1Var2.f10146O0;
        C10864g gVar = r7;
        C10864g gVar2 = new C10864g(mVar, aVar, 1);
        C13253e eVar = r4;
        C13253e eVar2 = new C13253e(new C8654m(bVar, bVar2, 4), aVar, 4);
        C19011a<C8694h> aVar2 = j1Var2.f10212b0;
        C19011a<C8694h> aVar3 = aVar2;
        C9304b bVar3 = r7;
        C9304b bVar4 = new C9304b(aVar2, j1Var2.f10164R3, j1Var2.f10169S3, aVar, j1Var2.f10278m0, 1);
        C8655n nVar3 = r4Var2.f10568Y1;
        C10906f fVar = r4;
        C10906f fVar2 = new C10906f(nVar2, nVar3);
        C10907g gVar3 = r8;
        C10907g gVar4 = new C10907g(nVar2, j1Var2.f10309s1, j1Var2.f10086C0, new C10908h(nVar2));
        C6381j jVar = r4;
        C6381j jVar2 = new C6381j(nVar2, 9);
        C8654m mVar2 = r4;
        C8654m mVar3 = new C8654m(nVar2, nVar3, 2);
        C4563i iVar = j1Var2.f10184V3;
        C19011a<C8629a> aVar4 = j1Var2.f10323v0;
        C10983d dVar = r7;
        C10983d dVar2 = new C10983d(iVar, aVar4, j1Var2.f10189W3, j1Var2.f10141N0, j1Var2.f10194X3);
        this.f10627d = dVar2;
        C19011a<PersistViewedBus> aVar5 = j1Var2.f10263j3;
        C8757g0 g0Var = r4;
        C8757g0 g0Var2 = new C8757g0(aVar5, j1Var2.f10248h0, 3);
        this.f10628e = new C10924l(gVar, eVar, bVar3, fVar, aVar4, gVar3, jVar, j1Var2.f10174T3, j1Var2.f10336x3, mVar2, j1Var2.f10179U3, j1Var2.f10172T1, j1Var2.f10090D, dVar, aVar5, aVar3, g0Var, j1Var2.f10154P3);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchResultsListingsFragment searchResultsListingsFragment = (SearchResultsListingsFragment) obj;
        searchResultsListingsFragment.imagesRepository = new C12796e(C4579j1.m10253d(this.f10625b));
        searchResultsListingsFragment.grafana = (C12703a) this.f10625b.f10308s0.get();
        searchResultsListingsFragment.schedulers = new C13461f();
        searchResultsListingsFragment.logCat = this.f10625b.f10212b0.get();
        searchResultsListingsFragment.workManager = this.f10625b.f10171T0.get();
        searchResultsListingsFragment.etsyMoneyFactory = this.f10625b.f10141N0.get();
        searchResultsListingsFragment.rxSchedulers = new C13461f();
        searchResultsListingsFragment.appCurrency = this.f10625b.f10323v0.get();
        searchResultsListingsFragment.qualtricsWrapper = this.f10625b.f10117I1.get();
        searchResultsListingsFragment.currentLocale = this.f10625b.f10298q0.get();
        searchResultsListingsFragment.connectivity = this.f10625b.f10086C0.get();
        searchResultsListingsFragment.sessionTimeManager = this.f10625b.f10309s1.get();
        searchResultsListingsFragment.savedSearchViewDelegate = this.f10625b.mo14410s();
        searchResultsListingsFragment.favoriteRepository = this.f10625b.mo14405n();
        C4579j1 j1Var = this.f10625b;
        searchResultsListingsFragment.viewModelFactory = new C8656o(ImmutableMap.m25858of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, SearchResultsListingsViewModel.class, this.f10628e, C10982c.class, this.f10627d));
        searchResultsListingsFragment.adImpressionRepository = this.f10625b.f10336x3.get();
        searchResultsListingsFragment.deepLinkEligibility = this.f10625b.f10341y3.get();
        searchResultsListingsFragment.routeInspector = this.f10625b.mo14408q();
        searchResultsListingsFragment.deepLinkEntityChecker = this.f10625b.mo14400i();
        searchResultsListingsFragment.searchUriParser = C4579j1.m10250a(this.f10625b);
        searchResultsListingsFragment.persistViewedBus = this.f10625b.f10263j3.get();
        searchResultsListingsFragment.session = (C13265p) this.f10625b.f10101F0.get();
        searchResultsListingsFragment.priceFilterHelper = this.f10625b.f10194X3.get();
        searchResultsListingsFragment.searchFiltersEligibility = new C11010o(C4690r4.m10336a(this.f10626c));
    }
}
