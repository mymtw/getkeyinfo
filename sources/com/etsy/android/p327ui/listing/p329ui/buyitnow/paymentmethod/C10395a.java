package com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.paymentmethod.a */
public final class C10395a extends RecyclerView.Adapter<C10396b> {

    /* renamed from: b */
    public final List<PaymentMethod> f22752b;

    /* renamed from: c */
    public final C10368a f22753c;

    public C10395a(List<PaymentMethod> list, C10368a aVar) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        C19383o.m32797g(aVar, "dispatcher");
        this.f22752b = list;
        this.f22753c = aVar;
    }

    public final int getItemCount() {
        return this.f22752b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10396b bVar = (C10396b) b0Var;
        C19383o.m32797g(bVar, "holder");
        PaymentMethod paymentMethod = this.f22752b.get(i);
        C19383o.m32797g(paymentMethod, "paymentMethod");
        ImageView imageView = bVar.f22755c;
        Context context = bVar.itemView.getContext();
        int iconResId = paymentMethod.getCardType().getIconResId();
        Object obj = C8184a.f17966a;
        imageView.setImageDrawable(C8184a.C8187c.m16466b(context, iconResId));
        bVar.f22756d.setText(paymentMethod.getName());
        bVar.f22757e.setText(paymentMethod.getValue());
        Button button = bVar.f22758f;
        C19383o.m32796f(button, "editButton");
        ViewExtensions.m12866j(button, new ChangePaymentMethodViewHolder$bind$1(bVar, paymentMethod));
        View view = bVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ChangePaymentMethodViewHolder$bind$2(bVar, paymentMethod));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        return new C10396b(viewGroup, this.f22753c);
    }
}
