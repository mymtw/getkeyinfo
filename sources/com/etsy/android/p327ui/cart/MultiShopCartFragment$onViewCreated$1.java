package com.etsy.android.p327ui.cart;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$onViewCreated$1 */
public final class MultiShopCartFragment$onViewCreated$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MultiShopCartFragment this$0;

    public MultiShopCartFragment$onViewCreated$1(MultiShopCartFragment multiShopCartFragment) {
        this.this$0 = multiShopCartFragment;
    }

    public void onGlobalLayout() {
        RecyclerView r0 = this.this$0.recyclerView;
        if (r0 != null && this.this$0.getPerformanceTrackerAdapter().mo21373e()) {
            r0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
