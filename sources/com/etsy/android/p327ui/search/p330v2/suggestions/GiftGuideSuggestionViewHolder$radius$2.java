package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionViewHolder$radius$2 */
public final class GiftGuideSuggestionViewHolder$radius$2 extends Lambda implements C19846a<Integer> {
    public final /* synthetic */ View $itemView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftGuideSuggestionViewHolder$radius$2(View view) {
        super(0);
        this.$itemView = view;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$itemView.getContext().getResources().getDimensionPixelSize(R.dimen.search_gift_guide_corner_radius));
    }
}
