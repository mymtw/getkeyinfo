package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroup;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.p327ui.cart.C9419w;
import com.etsy.android.p327ui.cart.C9422z;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;

/* renamed from: com.etsy.android.ui.cart.viewholders.t */
public final class C9406t extends C12086e<CartGroup> {

    /* renamed from: c */
    public final RecyclerView f20854c;

    /* renamed from: d */
    public final RecyclerView f20855d;

    /* renamed from: e */
    public final C9419w f20856e;

    /* renamed from: f */
    public final C9419w f20857f;

    public C9406t(ViewGroup viewGroup, C9422z zVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_horz_cart_group, viewGroup, false));
        RecyclerView recyclerView = (RecyclerView) mo38986f(R.id.items_left);
        this.f20854c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) mo38986f(R.id.items_right);
        this.f20855d = recyclerView2;
        recyclerView.setRecycledViewPool(zVar.f28988g);
        recyclerView2.setRecycledViewPool(zVar.f28988g);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView2.setNestedScrollingEnabled(false);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        C9419w wVar = new C9419w(zVar);
        this.f20856e = wVar;
        C9419w wVar2 = new C9419w(zVar);
        this.f20857f = wVar2;
        recyclerView.setAdapter(wVar);
        recyclerView2.setAdapter(wVar2);
        recyclerView.setDescendantFocusability(131072);
        recyclerView2.setDescendantFocusability(131072);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        CartGroup cartGroup = (CartGroup) obj;
        ((LinearLayoutManager) this.f20854c.getLayoutManager()).f7015C = cartGroup.getItems().size();
        ((LinearLayoutManager) this.f20855d.getLayoutManager()).f7015C = cartGroup.getPaymentItems().size();
        C9419w wVar = this.f20856e;
        List<CartGroupItem> items = cartGroup.getItems();
        wVar.f20895b.clear();
        wVar.f20895b.addAll(items);
        wVar.notifyDataSetChanged();
        C9419w wVar2 = this.f20857f;
        List<CartGroupItem> paymentItems = cartGroup.getPaymentItems();
        wVar2.f20895b.clear();
        wVar2.f20895b.addAll(paymentItems);
        wVar2.notifyDataSetChanged();
    }
}
