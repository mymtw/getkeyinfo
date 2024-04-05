package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.ISearchSuggestion;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SearchTermViewHolder$bind$1$1 */
final class SearchTermViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ISearchSuggestion $searchSuggestion;
    public final /* synthetic */ C9179g1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchTermViewHolder$bind$1$1(C9179g1 g1Var, ISearchSuggestion iSearchSuggestion) {
        super(1);
        this.this$0 = g1Var;
        this.$searchSuggestion = iSearchSuggestion;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20209c.mo31328c(this.$searchSuggestion);
    }
}
