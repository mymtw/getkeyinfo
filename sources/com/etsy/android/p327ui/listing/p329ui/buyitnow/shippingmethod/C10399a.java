package com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingmethod;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingMethod;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.shippingmethod.a */
public final class C10399a extends RecyclerView.Adapter<C10400b> {

    /* renamed from: b */
    public final List<ShippingMethod> f22765b;

    /* renamed from: c */
    public final C10368a f22766c;

    public C10399a(List<ShippingMethod> list, C10368a aVar) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        C19383o.m32797g(aVar, "dispatcher");
        this.f22765b = list;
        this.f22766c = aVar;
    }

    public final int getItemCount() {
        return this.f22765b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10400b bVar = (C10400b) b0Var;
        C19383o.m32797g(bVar, "holder");
        ShippingMethod shippingMethod = this.f22765b.get(i);
        C19383o.m32797g(shippingMethod, "shippingMethod");
        bVar.f22768c.setText(shippingMethod.getTitle());
        bVar.f22769d.setText(shippingMethod.getEstimatedDeliveryDateLabel());
        bVar.f22770e.setText(shippingMethod.getCost());
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ChangeShippingMethodViewHolder$bind$1(bVar, shippingMethod));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C10400b(viewGroup, this.f22766c);
    }
}
