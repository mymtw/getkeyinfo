package com.etsy.android.p327ui.cart.viewholders;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.cart.clicklisteners.C9287l;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cart.viewholders.CheckoutSectionViewHolder$setUpButtonDescription$1 */
final class CheckoutSectionViewHolder$setUpButtonDescription$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C9287l $clickListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutSectionViewHolder$setUpButtonDescription$1(C9287l lVar) {
        super(0);
        this.$clickListener = lVar;
    }

    public final void invoke() {
        this.$clickListener.f28980b.mo21333d("klarna_learn_more_tapped_on_cart", (Map<? extends AnalyticsProperty, Object>) null);
    }
}
