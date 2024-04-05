package com.etsy.android.p327ui.shop;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;

/* renamed from: com.etsy.android.ui.shop.i0 */
public final class C11168i0 extends GridLayoutManager.C3075b {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f24702d;

    /* renamed from: e */
    public final /* synthetic */ C11170j0 f24703e;

    public C11168i0(C11170j0 j0Var, RecyclerView recyclerView) {
        this.f24703e = j0Var;
        this.f24702d = recyclerView;
    }

    /* renamed from: d */
    public final int mo11265d(int i) {
        C11170j0 j0Var = this.f24703e;
        int itemViewType = this.f24702d.getAdapter().getItemViewType(i);
        return itemViewType == R.id.view_type_shop_home_icon ? j0Var.f24705b : itemViewType == R.id.view_type_shop_home_info ? j0Var.f24706c : itemViewType == R.id.view_type_shop_home_featured_listing ? j0Var.f24707d : itemViewType == R.id.view_type_shop_home_announcement_content ? j0Var.f24709f : itemViewType == R.id.view_type_shop_home_announcement_info ? j0Var.f24711h ? j0Var.f24708e : j0Var.f24704a : itemViewType == R.id.view_type_shop_home_listing ? j0Var.f24710g : j0Var.f24704a;
    }
}
