package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.ItemSearchSuggestionViewHolder$bindAutosuggest$1 */
final class ItemSearchSuggestionViewHolder$bindAutosuggest$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11083w.C11089f $item;
    public final /* synthetic */ C11063n this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemSearchSuggestionViewHolder$bindAutosuggest$1(C11063n nVar, C11083w.C11089f fVar) {
        super(1);
        this.this$0 = nVar;
        this.$item = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24514b.onSuggestionPopulationClicked(this.$item);
    }
}
