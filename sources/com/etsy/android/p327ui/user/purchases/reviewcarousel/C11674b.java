package com.etsy.android.p327ui.user.purchases.reviewcarousel;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.cardview.viewholders.ReviewCardViewHolder;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.reviewcarousel.b */
public final class C11674b extends RecyclerView.Adapter<ReviewCardViewHolder> {

    /* renamed from: b */
    public final List<C11675c> f25855b;

    /* renamed from: c */
    public final C9135p f25856c;

    public C11674b(List<C11675c> list, C9135p pVar) {
        C19383o.m32797g(list, "listItems");
        C19383o.m32797g(pVar, "clickHandler");
        this.f25855b = list;
        this.f25856c = pVar;
    }

    public final int getItemCount() {
        return this.f25855b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        ReviewCardViewHolder reviewCardViewHolder = (ReviewCardViewHolder) b0Var;
        C19383o.m32797g(reviewCardViewHolder, "holder");
        reviewCardViewHolder.mo31389e(this.f25855b.get(i));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new ReviewCardViewHolder(C0114h.m305j0(viewGroup, R.layout.list_item_carousel, false), viewGroup, this.f25856c);
    }
}
