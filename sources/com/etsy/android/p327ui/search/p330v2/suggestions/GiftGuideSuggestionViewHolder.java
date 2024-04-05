package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11047d;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionViewHolder */
public final class GiftGuideSuggestionViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C11047d.C11049b f24464b;

    /* renamed from: c */
    public final ImageView f24465c;

    /* renamed from: d */
    public final TextView f24466d;

    /* renamed from: e */
    public final C19285c f24467e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftGuideSuggestionViewHolder(View view, C11047d.C11049b bVar) {
        super(view);
        C19383o.m32797g(bVar, "clickListener");
        this.f24464b = bVar;
        this.f24465c = (ImageView) view.findViewById(R.id.search_gift_guide_image);
        this.f24466d = (TextView) view.findViewById(R.id.search_gift_guide_title);
        this.f24467e = C19350d.m32677b(new GiftGuideSuggestionViewHolder$radius$2(view));
    }
}
