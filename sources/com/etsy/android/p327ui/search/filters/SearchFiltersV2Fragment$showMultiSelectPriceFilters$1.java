package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10984a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11005m;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p414oe.C13163b;
import p414oe.C13164c;
import p414oe.C13166d;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showMultiSelectPriceFilters$1 */
public final class SearchFiltersV2Fragment$showMultiSelectPriceFilters$1 extends Lambda implements C19861p<C13166d, Boolean, C19394m> {
    public final /* synthetic */ C11005m.C11006a $priceFilterUi;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showMultiSelectPriceFilters$1(SearchFiltersV2Fragment searchFiltersV2Fragment, C11005m.C11006a aVar) {
        super(2);
        this.this$0 = searchFiltersV2Fragment;
        this.$priceFilterUi = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C13166d) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(C13166d dVar, boolean z) {
        C19383o.m32797g(dVar, "selectedOption");
        C10767e viewModel = this.this$0.getViewModel();
        C11005m.C11006a aVar = this.$priceFilterUi;
        viewModel.getClass();
        C19383o.m32797g(aVar, "priceFilterUi");
        viewModel.f23731D.setUserSpecifiedMax(false);
        viewModel.f23731D.setUserSpecifiedMin(false);
        C13163b bVar = aVar.f24409b;
        List<C13166d> list = bVar.f28955c;
        viewModel.f23746k.getClass();
        ArrayList h = C13164c.m20821h(dVar, list, z);
        bVar.f28955c = h;
        SearchOptions searchOptions = viewModel.f23731D;
        viewModel.f23746k.getClass();
        searchOptions.setMinPrice(C13164c.m20820f(dVar, h));
        SearchOptions searchOptions2 = viewModel.f23731D;
        viewModel.f23746k.getClass();
        searchOptions2.setMaxPrice(C13164c.m20819e(dVar, h));
        viewModel.f23759x.onNext(new C11005m.C11006a(viewModel.f23742g.mo35740a(bVar.f28954b), bVar, aVar.f24410c));
        viewModel.f23761z.onNext(new C10984a(viewModel.mo35742e(SearchFiltersV2Type.PRICE), new C11016s.C11023g(viewModel.f23746k.mo45883g(viewModel.f23731D.getMinPrice(), viewModel.f23731D.getMaxPrice()))));
        viewModel.mo35748l();
    }
}
