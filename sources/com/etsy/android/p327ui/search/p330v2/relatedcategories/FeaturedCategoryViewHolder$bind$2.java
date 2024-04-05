package com.etsy.android.p327ui.search.p330v2.relatedcategories;

import android.view.View;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder$bind$2 */
public final class FeaturedCategoryViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ IFormattedTaxonomyCategory $data;
    public final /* synthetic */ FeaturedCategoryViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturedCategoryViewHolder$bind$2(FeaturedCategoryViewHolder featuredCategoryViewHolder, IFormattedTaxonomyCategory iFormattedTaxonomyCategory) {
        super(1);
        this.this$0 = featuredCategoryViewHolder;
        this.$data = iFormattedTaxonomyCategory;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9134o oVar = this.this$0.f24453c;
        if (oVar != null) {
            oVar.mo31328c(this.$data);
        }
    }
}
