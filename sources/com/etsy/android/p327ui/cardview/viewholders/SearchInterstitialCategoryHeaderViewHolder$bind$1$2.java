package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SearchInterstitialCategoryHeaderViewHolder$bind$1$2 */
final class SearchInterstitialCategoryHeaderViewHolder$bind$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ BaseActionableItem $data;
    public final /* synthetic */ C9173e1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInterstitialCategoryHeaderViewHolder$bind$1$2(BaseActionableItem baseActionableItem, C9173e1 e1Var) {
        super(1);
        this.$data = baseActionableItem;
        this.this$0 = e1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (C19543e0.m33306Y(this.$data.getActions())) {
            this.this$0.f20198c.mo31328c(this.$data);
        }
    }
}
