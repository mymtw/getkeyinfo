package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10984a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10986c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.subjects.PublishSubject;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showTopLevelCategories$2 */
public final class SearchFiltersV2Fragment$showTopLevelCategories$2 extends Lambda implements C19857l<FacetCount, C19394m> {
    public final /* synthetic */ AttributeFacet $facet;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showTopLevelCategories$2(SearchFiltersV2Fragment searchFiltersV2Fragment, AttributeFacet attributeFacet) {
        super(1);
        this.this$0 = searchFiltersV2Fragment;
        this.$facet = attributeFacet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FacetCount) obj);
        return C19394m.f43287a;
    }

    public final void invoke(FacetCount facetCount) {
        C19383o.m32797g(facetCount, "selectedCategory");
        this.this$0.hasChangedCategory = true;
        C10767e viewModel = this.this$0.getViewModel();
        AttributeFacet attributeFacet = this.$facet;
        viewModel.getClass();
        C19383o.m32797g(attributeFacet, "facet");
        ArrayList arrayList = new ArrayList();
        if (C10767e.m18650r(viewModel.f23749n, arrayList, facetCount)) {
            String b = C10767e.m18647b(arrayList);
            AttributeValue attribute = attributeFacet.getAttribute();
            viewModel.f23761z.onNext(new C10984a(attribute != null ? attribute.getId() : null, new C11016s.C11023g(b)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(viewModel.mo35741c());
            PublishSubject<C10986c> publishSubject = viewModel.f23728A;
            C10987d.C10989b bVar = new C10987d.C10989b(viewModel.f23734G.get(SearchFiltersV2Type.CATEGORY));
            String id = facetCount.getId();
            C19383o.m32796f(id, "selectedCategory.id");
            publishSubject.onNext(new C10986c(bVar, linkedHashMap, new C11016s.C11023g(id), Boolean.TRUE));
        }
        if (!C19383o.m32792b(facetCount, viewModel.f23749n)) {
            viewModel.f23731D.setCategoryFacets(arrayList);
        } else {
            viewModel.f23731D.setCategoryFacets(EmptyList.INSTANCE);
        }
        viewModel.mo35748l();
    }
}
