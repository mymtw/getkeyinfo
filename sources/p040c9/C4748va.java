package p040c9;

import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.p327ui.search.p330v2.taxonomy.C11110a;
import com.etsy.android.p327ui.search.p330v2.taxonomy.SearchTaxonomyCategoryPageFragment;
import dagger.android.C17550a;
import p456ua.C13461f;

/* renamed from: c9.va */
public final class C4748va implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10720b;

    /* renamed from: c */
    public final C4690r4 f10721c;

    public C4748va(C4579j1 j1Var, C4690r4 r4Var) {
        this.f10720b = j1Var;
        this.f10721c = r4Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment = (SearchTaxonomyCategoryPageFragment) obj;
        searchTaxonomyCategoryPageFragment.adImpressionRepository = this.f10720b.f10336x3.get();
        searchTaxonomyCategoryPageFragment.deepLinkEligibility = this.f10720b.f10341y3.get();
        searchTaxonomyCategoryPageFragment.routeInspector = this.f10720b.mo14408q();
        searchTaxonomyCategoryPageFragment.deepLinkEntityChecker = this.f10720b.mo14400i();
        searchTaxonomyCategoryPageFragment.searchUriParser = C4579j1.m10250a(this.f10720b);
        searchTaxonomyCategoryPageFragment.performanceTrackerAdapter = new C8704a(this.f10720b.mo14412u());
        searchTaxonomyCategoryPageFragment.favoriteRepository = this.f10720b.mo14405n();
        searchTaxonomyCategoryPageFragment.rxSchedulers = new C13461f();
        searchTaxonomyCategoryPageFragment.entityChecker = this.f10720b.mo14400i();
        searchTaxonomyCategoryPageFragment.currentLocale = this.f10720b.f10298q0.get();
        searchTaxonomyCategoryPageFragment.categoriesViewEligibility = new C11110a(C4690r4.m10336a(this.f10721c));
    }
}
