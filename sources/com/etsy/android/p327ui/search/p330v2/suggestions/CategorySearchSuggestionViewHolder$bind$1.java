package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.CategorySearchSuggestionViewHolder$bind$1 */
final class CategorySearchSuggestionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11083w.C11084a $item;
    public final /* synthetic */ C11045b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategorySearchSuggestionViewHolder$bind$1(C11045b bVar, C11083w.C11084a aVar) {
        super(1);
        this.this$0 = bVar;
        this.$item = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24487b.onCategoryClicked(this.$item.f24554a);
    }
}
