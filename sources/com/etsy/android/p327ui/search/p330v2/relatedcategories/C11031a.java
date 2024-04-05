package com.etsy.android.p327ui.search.p330v2.relatedcategories;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.relatedcategories.a */
public final class C11031a extends RecyclerView.Adapter<FeaturedCategoryViewHolder> {

    /* renamed from: b */
    public final C9134o f24457b;

    /* renamed from: c */
    public List<? extends IFormattedTaxonomyCategory> f24458c = EmptyList.INSTANCE;

    public C11031a(C9134o oVar) {
        this.f24457b = oVar;
    }

    public final int getItemCount() {
        return this.f24458c.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        FeaturedCategoryViewHolder featuredCategoryViewHolder = (FeaturedCategoryViewHolder) b0Var;
        C19383o.m32797g(featuredCategoryViewHolder, "holder");
        featuredCategoryViewHolder.mo19450a((IFormattedTaxonomyCategory) this.f24458c.get(i));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new FeaturedCategoryViewHolder(viewGroup, this.f24457b);
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        FeaturedCategoryViewHolder featuredCategoryViewHolder = (FeaturedCategoryViewHolder) b0Var;
        C19383o.m32797g(featuredCategoryViewHolder, "holder");
        super.onViewRecycled(featuredCategoryViewHolder);
        featuredCategoryViewHolder.mo31374b();
    }
}
