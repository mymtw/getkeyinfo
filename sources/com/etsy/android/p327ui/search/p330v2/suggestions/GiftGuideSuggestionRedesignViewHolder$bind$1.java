package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionRedesignViewHolder$bind$1 */
final class GiftGuideSuggestionRedesignViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11083w.C11098o $item;
    public final /* synthetic */ GiftGuideSuggestionRedesignViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftGuideSuggestionRedesignViewHolder$bind$1(GiftGuideSuggestionRedesignViewHolder giftGuideSuggestionRedesignViewHolder, C11083w.C11098o oVar) {
        super(1);
        this.this$0 = giftGuideSuggestionRedesignViewHolder;
        this.$item = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24459b.onGiftGuideClicked(this.$item.f24574a.getDeepLink());
    }
}
