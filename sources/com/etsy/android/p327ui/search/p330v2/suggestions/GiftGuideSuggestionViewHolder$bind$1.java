package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionViewHolder$bind$1 */
final class GiftGuideSuggestionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ GiftGuide $item;
    public final /* synthetic */ GiftGuideSuggestionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftGuideSuggestionViewHolder$bind$1(GiftGuideSuggestionViewHolder giftGuideSuggestionViewHolder, GiftGuide giftGuide) {
        super(1);
        this.this$0 = giftGuideSuggestionViewHolder;
        this.$item = giftGuide;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24464b.onGiftGuideClicked(this.$item.getDeepLink());
    }
}
