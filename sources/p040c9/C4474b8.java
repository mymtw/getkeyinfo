package p040c9;

import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.b8 */
public final class C4474b8 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9775b;

    public C4474b8(C4579j1 j1Var) {
        this.f9775b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ListRecommendationsFragment listRecommendationsFragment = (ListRecommendationsFragment) obj;
        listRecommendationsFragment.favoriteRepository = this.f9775b.mo14405n();
        listRecommendationsFragment.rxSchedulers = new C13461f();
        listRecommendationsFragment.adImpressionRepository = this.f9775b.f10336x3.get();
        listRecommendationsFragment.deepLinkEligibility = this.f9775b.f10341y3.get();
        listRecommendationsFragment.routeInspector = this.f9775b.mo14408q();
        listRecommendationsFragment.deepLinkEntityChecker = this.f9775b.mo14400i();
        listRecommendationsFragment.searchUriParser = C4579j1.m10250a(this.f9775b);
    }
}
