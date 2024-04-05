package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11047d;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.j */
public final class C11055j extends RecyclerView.Adapter<GiftGuideSuggestionViewHolder> {

    /* renamed from: b */
    public final List<GiftGuide> f24502b;

    /* renamed from: c */
    public final C11047d.C11049b f24503c;

    public C11055j(List<GiftGuide> list, C11047d.C11049b bVar) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        C19383o.m32797g(bVar, "clickListener");
        this.f24502b = list;
        this.f24503c = bVar;
    }

    public final int getItemCount() {
        return this.f24502b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        GiftGuideSuggestionViewHolder giftGuideSuggestionViewHolder = (GiftGuideSuggestionViewHolder) b0Var;
        C19383o.m32797g(giftGuideSuggestionViewHolder, "holder");
        GiftGuide giftGuide = this.f24502b.get(i);
        C19383o.m32797g(giftGuide, "item");
        C0114h.m270B0(giftGuideSuggestionViewHolder.itemView.getContext()).load(giftGuide.getImage().getUrl()).mo46145m0(new C6085i(), new C6105w(((Number) giftGuideSuggestionViewHolder.f24467e.getValue()).intValue())).mo16816M(giftGuideSuggestionViewHolder.f24465c);
        giftGuideSuggestionViewHolder.f24466d.setText(giftGuide.getTitle());
        View view = giftGuideSuggestionViewHolder.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new GiftGuideSuggestionViewHolder$bind$1(giftGuideSuggestionViewHolder, giftGuide));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_search_gift_guide, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new GiftGuideSuggestionViewHolder(h, this.f24503c);
    }
}
