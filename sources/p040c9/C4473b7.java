package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.favorites.C9863o;
import com.etsy.android.p327ui.favorites.FavoritesTabFragment;
import com.etsy.android.p327ui.favorites.recommendations.C9875e;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p397mc.C13047a;
import p405nc.C13110a;
import p412oc.C13149a;
import p412oc.C13150b;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.b7 */
public final class C4473b7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9773b;

    /* renamed from: c */
    public final C4690r4 f9774c;

    public C4473b7(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9773b = j1Var;
        this.f9774c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        FavoritesTabFragment favoritesTabFragment = (FavoritesTabFragment) obj;
        favoritesTabFragment.adImpressionRepository = this.f9773b.f10336x3.get();
        favoritesTabFragment.deepLinkEligibility = this.f9773b.f10341y3.get();
        favoritesTabFragment.routeInspector = this.f9773b.mo14408q();
        favoritesTabFragment.deepLinkEntityChecker = this.f9773b.mo14400i();
        favoritesTabFragment.searchUriParser = C4579j1.m10250a(this.f9773b);
        favoritesTabFragment.logCat = this.f9773b.f10212b0.get();
        favoritesTabFragment.grafana = (C12703a) this.f9773b.f10308s0.get();
        favoritesTabFragment.favoritesPerformanceTracker = this.f9773b.mo14412u();
        favoritesTabFragment.qualtricsWrapper = this.f9773b.f10117I1.get();
        favoritesTabFragment.currentLocale = this.f9773b.f10298q0.get();
        favoritesTabFragment.eligibility = new C9863o(C4690r4.m10336a(this.f9774c));
        favoritesTabFragment.favoriteRepository = this.f9773b.mo14405n();
        favoritesTabFragment.rxSchedulers = new C13461f();
        favoritesTabFragment.recommendationsOnFavoritesEligibility = new C9875e(this.f9773b.mo14404m());
        C13149a aVar = new C13149a(this.f9773b.mo14404m(), this.f9773b.f10298q0.get());
        C4579j1 j1Var = this.f9773b;
        C13110a aVar2 = j1Var.f10302r;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        aVar2.getClass();
        C19383o.m32797g(gVar, "configuredV3MoshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C13047a.class);
        C19383o.m32796f(b, "configuredV3MoshiRetrofi…tersEndpoint::class.java)");
        C13150b bVar = new C13150b(aVar, (C13047a) b, this.f9773b.f10146O0.get());
        bVar.f28924d = (C13265p) this.f9773b.f10101F0.get();
        favoritesTabFragment.clusterRepository = bVar;
        favoritesTabFragment.clustersEligibility = new C13149a(this.f9773b.mo14404m(), this.f9773b.f10298q0.get());
        favoritesTabFragment.analyticsTracker = this.f9773b.f10198Y2.get();
    }
}
