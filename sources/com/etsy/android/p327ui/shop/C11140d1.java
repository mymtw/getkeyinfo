package com.etsy.android.p327ui.shop;

import androidx.recyclerview.widget.GridLayoutManager;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;

/* renamed from: com.etsy.android.ui.shop.d1 */
public final class C11140d1 extends GridLayoutManager.C3075b {

    /* renamed from: d */
    public final /* synthetic */ ShopSectionListingsFragment.ShopSectionListingsAdapter f24634d;

    public C11140d1(ShopSectionListingsFragment.ShopSectionListingsAdapter shopSectionListingsAdapter) {
        this.f24634d = shopSectionListingsAdapter;
    }

    /* renamed from: d */
    public final int mo11265d(int i) {
        return i == this.f24634d.getItemCount() - 1 ? 2 : 1;
    }
}
