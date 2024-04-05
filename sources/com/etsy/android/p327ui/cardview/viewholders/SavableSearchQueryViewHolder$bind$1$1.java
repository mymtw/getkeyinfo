package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavableSearchQueryViewHolder$bind$1$1 */
final class SavableSearchQueryViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ SavableSearchQuery $savableSearchQuery;
    public final /* synthetic */ C9218u0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavableSearchQueryViewHolder$bind$1$1(C9218u0 u0Var, SavableSearchQuery savableSearchQuery) {
        super(1);
        this.this$0 = u0Var;
        this.$savableSearchQuery = savableSearchQuery;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20353c.mo31328c(this.$savableSearchQuery);
    }
}
