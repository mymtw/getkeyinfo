package com.etsy.android.p327ui.search.filters.adapter;

import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.filters.adapter.C10759b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.adapter.FiltersCategoriesAdapter$ViewHolder$bind$2 */
final class FiltersCategoriesAdapter$ViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FacetCount $category;
    public final /* synthetic */ C10759b.C10761b this$0;
    public final /* synthetic */ C10759b this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FiltersCategoriesAdapter$ViewHolder$bind$2(FacetCount facetCount, C10759b.C10761b bVar, C10759b bVar2) {
        super(1);
        this.$category = facetCount;
        this.this$0 = bVar;
        this.this$1 = bVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        FacetCount facetCount = this.$category;
        if (facetCount != null) {
            C10759b.C10761b bVar = this.this$0;
            C10759b bVar2 = this.this$1;
            C10759b.C10761b.m18643e(bVar, facetCount);
            C19857l<FacetCount, C19394m> lVar = bVar2.f23709d;
            C19383o.m32796f(facetCount, ResponseConstants.CATEGORY);
            lVar.invoke(facetCount);
        }
    }
}
