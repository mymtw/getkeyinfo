package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.shop.viewholder.ShopItemsRedesignedSearchViewHolder$closeClickListener$1 */
public final class ShopItemsRedesignedSearchViewHolder$closeClickListener$1 extends TrackingOnClickListener {
    public final /* synthetic */ ShopItemsRedesignedSearchViewHolder this$0;

    public ShopItemsRedesignedSearchViewHolder$closeClickListener$1(ShopItemsRedesignedSearchViewHolder shopItemsRedesignedSearchViewHolder) {
        this.this$0 = shopItemsRedesignedSearchViewHolder;
    }

    public void onViewClick(View view) {
        this.this$0.f24849d.setText("");
        C11192q0 q0Var = this.this$0.f24850e;
        if (q0Var != null) {
            q0Var.f24745e = "";
            q0Var.f24744d = "";
            q0Var.f24748h = q0Var.f24749i.get(0);
            C11192q0.C11193a aVar = q0Var.f24741a;
            if (aVar != null) {
                aVar.didClearSearch();
            }
        }
    }
}
