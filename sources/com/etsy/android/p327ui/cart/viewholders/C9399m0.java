package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.apiv3.cart.CartGroup;
import com.etsy.android.p327ui.cart.C9419w;
import com.etsy.android.p327ui.cart.C9422z;
import com.etsy.android.uikit.viewholder.C12016y;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.cart.viewholders.m0 */
public final class C9399m0 extends C12086e<CartGroup> {

    /* renamed from: c */
    public final RecyclerView f20830c;

    /* renamed from: d */
    public final C9419w f20831d;

    public C9399m0(ViewGroup viewGroup, C9422z zVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_vert_cart_group, viewGroup, false));
        RecyclerView recyclerView = (RecyclerView) this.itemView;
        this.f20830c = recyclerView;
        recyclerView.setRecycledViewPool(zVar.f28988g);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setDescendantFocusability(131072);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C9419w wVar = new C9419w(zVar);
        this.f20831d = wVar;
        recyclerView.setAdapter(wVar);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        CartGroup cartGroup = (CartGroup) obj;
        ((LinearLayoutManager) this.f20830c.getLayoutManager()).f7015C = cartGroup.getPaymentItems().size() + cartGroup.getItems().size();
        C9419w wVar = this.f20831d;
        wVar.f20895b.clear();
        wVar.f20895b.addAll(cartGroup.getItems());
        if (!cartGroup.getPaymentItems().isEmpty()) {
            wVar.f20895b.add(new C12016y.C12017a(0, EtsyApplication.get().getResources().getDimensionPixelOffset(R.dimen.clg_space_8), R.id.view_type_multishop_space));
        }
        wVar.f20895b.addAll(cartGroup.getPaymentItems());
        wVar.notifyDataSetChanged();
    }
}
