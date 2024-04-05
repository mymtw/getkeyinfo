package com.etsy.android.p327ui.cart;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.lib.models.apiv3.cart.ShippingDetails;
import com.etsy.android.lib.models.apiv3.cart.ShopHeader;
import com.etsy.android.p327ui.cart.viewholders.CartReceiptViewHolder;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.cart.w */
public final class C9419w extends RecyclerView.Adapter<C12086e<C13186o>> {

    /* renamed from: b */
    public ArrayList<C13186o> f20895b = new ArrayList<>();

    /* renamed from: c */
    public C9422z f20896c;

    public C9419w(C9422z zVar) {
        this.f20896c = zVar;
    }

    public final int getItemCount() {
        return this.f20895b.size();
    }

    public final int getItemViewType(int i) {
        return this.f20896c.mo36216f(this.f20895b.get(i));
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C12086e eVar = (C12086e) b0Var;
        if (this.f20895b.get(i) instanceof CartGroupItem) {
            CartGroupItem cartGroupItem = (CartGroupItem) this.f20895b.get(i);
            if ((cartGroupItem.getData() instanceof GiftOptions) || (cartGroupItem.getData() instanceof ShippingDetails)) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        i2 = -1;
                        break;
                    } else if (((CartGroupItem) this.f20895b.get(i2)).getData() instanceof ShopHeader) {
                        break;
                    } else {
                        i2--;
                    }
                }
                if (i2 >= 0) {
                    eVar.mo31843e(this.f20895b.get(i2));
                }
            }
        }
        eVar.mo19450a(this.f20895b.get(i));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f20896c.mo31854b(viewGroup, i);
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i, List list) {
        C12086e eVar = (C12086e) b0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(eVar, i, list);
            return;
        }
        for (Object next : list) {
            if (next instanceof CartReceipt) {
                int i2 = CartReceiptViewHolder.f20727s;
                C19383o.m32797g(eVar, "baseViewHolder");
                CartReceiptViewHolder cartReceiptViewHolder = null;
                try {
                    if (eVar instanceof CartReceiptViewHolder) {
                        cartReceiptViewHolder = (CartReceiptViewHolder) eVar;
                    }
                } catch (ClassCastException unused) {
                }
                if (cartReceiptViewHolder != null) {
                    cartReceiptViewHolder.mo31822g((CartReceipt) next);
                }
            }
        }
    }
}
