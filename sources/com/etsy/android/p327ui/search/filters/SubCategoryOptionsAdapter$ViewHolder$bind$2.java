package com.etsy.android.p327ui.search.filters;

import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SubCategoryOptionsAdapter$ViewHolder$bind$2 */
final class SubCategoryOptionsAdapter$ViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FacetCount $category;
    public final /* synthetic */ C10770g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubCategoryOptionsAdapter$ViewHolder$bind$2(FacetCount facetCount, C10770g gVar) {
        super(1);
        this.$category = facetCount;
        this.this$0 = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        FacetCount facetCount = this.$category;
        if (facetCount != null) {
            C10770g gVar = this.this$0;
            C19857l<FacetCount, C19394m> lVar = gVar.f23775c;
            C19383o.m32796f(facetCount, ResponseConstants.CATEGORY);
            lVar.invoke(facetCount);
            gVar.f23776d.invoke(facetCount);
        }
    }
}
