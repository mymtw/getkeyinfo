package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.favorites.C9854i;
import com.etsy.android.p327ui.favorites.C9855j;
import com.etsy.android.p327ui.favorites.C9899x;
import com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment;
import com.etsy.android.p327ui.favorites.recommendations.C9875e;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p456ua.C13461f;
import p568fn.C17782b;

/* renamed from: c9.d7 */
public final class C4501d7 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9817b;

    /* renamed from: c */
    public final C4690r4 f9818c;

    public C4501d7(C4579j1 j1Var, C4690r4 r4Var) {
        this.f9817b = j1Var;
        this.f9818c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        FavoritesTabsContainerFragment favoritesTabsContainerFragment = (FavoritesTabsContainerFragment) obj;
        favoritesTabsContainerFragment.session = (C13265p) this.f9817b.f10101F0.get();
        favoritesTabsContainerFragment.favPerformanceTracker = this.f9817b.mo14412u();
        C4690r4 r4Var = this.f9818c;
        C17782b bVar = r4Var.f10574e;
        C8731g gVar = (C8731g) r4Var.f10577h.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C9854i.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…TabsEndpoint::class.java)");
        favoritesTabsContainerFragment.favoriteTabsRepository = new C9855j((C9854i) b, this.f9817b.f10146O0.get());
        favoritesTabsContainerFragment.rxSchedulers = new C13461f();
        favoritesTabsContainerFragment.tabsWithIconsEligibility = new C9899x(this.f9817b.mo14404m());
        favoritesTabsContainerFragment.resourceProvider = C4579j1.m10252c(this.f9817b);
        favoritesTabsContainerFragment.favoriteTabsSelectedState = this.f9817b.f10192X1.get();
        favoritesTabsContainerFragment.recommendationsOnFavoritesEligibility = new C9875e(this.f9817b.mo14404m());
        favoritesTabsContainerFragment.updatesNativeEligibility = this.f9817b.f10203Z2.get();
    }
}
