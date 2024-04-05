package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.EmptyCart;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p423pf.C13232c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.EmptyCartViewHolder$bind$1 */
final class EmptyCartViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ EmptyCart $data;
    public final /* synthetic */ C9193l this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyCartViewHolder$bind$1(C9193l lVar, EmptyCart emptyCart) {
        super(1);
        this.this$0 = lVar;
        this.$data = emptyCart;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13232c cVar = this.this$0.f20281c;
        if (cVar != null) {
            cVar.mo31328c(this.$data.getDeepLinkUrl());
        }
    }
}
