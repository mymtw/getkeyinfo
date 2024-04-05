package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.MoreShopsSearchSuggestionViewHolder$bind$1 */
final class MoreShopsSearchSuggestionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11083w.C11093j $moreShopsItem;
    public final /* synthetic */ C11080t this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreShopsSearchSuggestionViewHolder$bind$1(C11080t tVar, C11083w.C11093j jVar) {
        super(1);
        this.this$0 = tVar;
        this.$moreShopsItem = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f24546b.onMoreShopsClicked(this.$moreShopsItem);
    }
}
