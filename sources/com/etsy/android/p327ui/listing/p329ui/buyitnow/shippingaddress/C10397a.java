package com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingAddress;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.shippingaddress.a */
public final class C10397a extends RecyclerView.Adapter<C10398b> {

    /* renamed from: b */
    public final List<ShippingAddress> f22759b;

    /* renamed from: c */
    public final C10368a f22760c;

    public C10397a(List<ShippingAddress> list, C10368a aVar) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        C19383o.m32797g(aVar, "dispatcher");
        this.f22759b = list;
        this.f22760c = aVar;
    }

    public final int getItemCount() {
        return this.f22759b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10398b bVar = (C10398b) b0Var;
        C19383o.m32797g(bVar, "holder");
        ShippingAddress shippingAddress = this.f22759b.get(i);
        C19383o.m32797g(shippingAddress, "shippingAddress");
        bVar.f22762c.setText(shippingAddress.getName());
        bVar.f22763d.setText(shippingAddress.getFormattedAddress());
        Button button = bVar.f22764e;
        C19383o.m32796f(button, "editButton");
        ViewExtensions.m12866j(button, ChangeShippingAddressViewHolder$bind$1.INSTANCE);
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ChangeShippingAddressViewHolder$bind$2(bVar, shippingAddress));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C10398b(viewGroup, this.f22760c);
    }
}
