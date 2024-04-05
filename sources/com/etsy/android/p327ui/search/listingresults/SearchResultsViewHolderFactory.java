package com.etsy.android.p327ui.search.listingresults;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import com.etsy.android.p327ui.cardview.viewholders.C9170d1;
import com.etsy.android.p327ui.cardview.viewholders.C9208q;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.etsy.android.uikit.viewholder.C12014w;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p363he.C12821d;
import p414oe.C13166d;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13179h;
import p415of.C13180i;
import p415of.C13182k;
import p423pf.C13232c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsViewHolderFactory */
public final class SearchResultsViewHolderFactory extends C13172b {

    /* renamed from: j */
    public final C8703p f24194j;

    /* renamed from: k */
    public final C13173c f24195k;

    /* renamed from: l */
    public final C19857l<String, C19394m> f24196l;

    /* renamed from: m */
    public final C19857l<Boolean, C19394m> f24197m;

    /* renamed from: n */
    public final C19846a<C19394m> f24198n;

    /* renamed from: o */
    public final C19861p<C13166d, Boolean, C19394m> f24199o;

    /* renamed from: p */
    public final C11010o f24200p;

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsViewHolderFactory$a */
    public static final class C10898a extends C13232c {

        /* renamed from: d */
        public final /* synthetic */ SearchResultsViewHolderFactory f24201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10898a(SearchResultsViewHolderFactory searchResultsViewHolderFactory, Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
            this.f24201d = searchResultsViewHolderFactory;
            C19383o.m32796f(pVar, "mViewTracker");
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            String str = (String) obj;
            C19383o.m32797g(str, "data");
            if (str.length() > 0) {
                C12790b.m20430b(mo45889a(), new C12821d(str));
                this.f24201d.f28983b.mo21333d("guided_search_top", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsViewHolderFactory$b */
    public static final class C10899b extends C13232c {

        /* renamed from: d */
        public final /* synthetic */ SearchResultsViewHolderFactory f24202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10899b(SearchResultsViewHolderFactory searchResultsViewHolderFactory, Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
            this.f24202d = searchResultsViewHolderFactory;
            C19383o.m32796f(pVar, "mViewTracker");
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            String str = (String) obj;
            C19383o.m32797g(str, "data");
            if (str.length() > 0) {
                C12790b.m20430b(mo45889a(), new C12821d(str));
                this.f24202d.f28983b.mo21333d("guided_search_inline", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsViewHolderFactory$c */
    public static final class C10900c extends C13232c {

        /* renamed from: d */
        public final /* synthetic */ SearchResultsViewHolderFactory f24203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10900c(SearchResultsViewHolderFactory searchResultsViewHolderFactory, Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
            this.f24203d = searchResultsViewHolderFactory;
            C19383o.m32796f(pVar, "mViewTracker");
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            String str = (String) obj;
            C19383o.m32797g(str, "data");
            if (str.length() > 0) {
                C12790b.m20430b(mo45889a(), new C12821d(str));
                this.f24203d.f28983b.mo21333d("search_banner_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsViewHolderFactory(Fragment fragment, C8703p pVar, C13173c cVar, C19857l<? super String, C19394m> lVar, C19857l<? super Boolean, C19394m> lVar2, C19846a<C19394m> aVar, C19861p<? super C13166d, ? super Boolean, C19394m> pVar2, C11010o oVar) {
        super(new C13179h(fragment, pVar, (C13180i) null, (C13182k) null));
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(oVar, "searchFiltersEligibility");
        this.f24194j = pVar;
        this.f24195k = cVar;
        this.f24196l = lVar;
        this.f24197m = lVar2;
        this.f24198n = aVar;
        this.f24199o = pVar2;
        this.f24200p = oVar;
    }

    /* renamed from: b */
    public final C12086e<?> mo31854b(ViewGroup viewGroup, int i) {
        C12014w wVar;
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        switch (i) {
            case R.id.view_type_search_featured_categories_carousel:
                RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
                recyclerView.setId(R.id.recycler_formatted_taxonomy_carousel);
                return new C9208q(recyclerView);
            case R.id.view_type_search_filter_header:
                return new C9170d1(viewGroup, new C9141v(this.f24194j, new SearchResultsViewHolderFactory$create$1(this), new SearchResultsViewHolderFactory$create$2(this), new SearchResultsViewHolderFactory$create$3(this), this.f24199o), this.f24200p);
            case R.id.view_type_search_query_reformulations_list:
                C8623e eVar = this.f28983b.f19116n;
                C19383o.m32796f(eVar, "mViewTracker.configMap");
                Object f = this.f28982a.mo19993f(i, (Integer) null);
                C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.vespa.clickhandlers.DeepLinkClickHandler");
                wVar = new C12014w(viewGroup, eVar, (C13232c) f, false);
                break;
            case R.id.view_type_search_query_reformulations_list_inline:
                C8623e eVar2 = this.f28983b.f19116n;
                C19383o.m32796f(eVar2, "mViewTracker.configMap");
                Object f2 = this.f28982a.mo19993f(i, (Integer) null);
                C19383o.m32795e(f2, "null cannot be cast to non-null type com.etsy.android.vespa.clickhandlers.DeepLinkClickHandler");
                wVar = new C12014w(viewGroup, eVar2, (C13232c) f2, true);
                break;
            default:
                return null;
        }
        return wVar;
    }

    /* renamed from: g */
    public final int mo33127g(int i, int i2) {
        if (i2 >= this.f24195k.getItemCount()) {
            return 1;
        }
        return this.f28990i;
    }

    /* renamed from: h */
    public final void mo32273h() {
        this.f28982a.mo19994h(R.id.view_type_search_query_reformulations_list, new C10898a(this, mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_search_query_reformulations_list_inline, new C10899b(this, mo45892d(), this.f28983b));
        this.f28982a.mo19994h(R.id.view_type_search_banner, new C10900c(this, mo45892d(), this.f28983b));
    }
}
