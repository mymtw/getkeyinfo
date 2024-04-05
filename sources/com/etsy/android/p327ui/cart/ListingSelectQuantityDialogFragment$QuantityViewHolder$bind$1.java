package com.etsy.android.p327ui.cart;

import android.view.View;
import com.etsy.android.p327ui.cart.ListingSelectQuantityDialogFragment;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.ListingSelectQuantityDialogFragment$QuantityViewHolder$bind$1 */
final class ListingSelectQuantityDialogFragment$QuantityViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ int $value;
    public final /* synthetic */ ListingSelectQuantityDialogFragment.C9234b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingSelectQuantityDialogFragment$QuantityViewHolder$bind$1(ListingSelectQuantityDialogFragment.C9234b bVar, int i) {
        super(1);
        this.this$0 = bVar;
        this.$value = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20404b.invoke(Integer.valueOf(this.$value));
    }
}
