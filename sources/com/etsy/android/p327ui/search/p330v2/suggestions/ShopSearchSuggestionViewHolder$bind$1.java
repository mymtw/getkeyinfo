package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.ShopSearchSuggestionViewHolder$bind$1 */
final class ShopSearchSuggestionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11083w.C11097n $shop;
    public final /* synthetic */ C11101y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopSearchSuggestionViewHolder$bind$1(C11101y yVar, C11083w.C11097n nVar) {
        super(1);
        this.this$0 = yVar;
        this.$shop = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24577b.onShopClicked(this.$shop);
    }
}
