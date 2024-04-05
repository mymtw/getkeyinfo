package com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.shippingaddress.b */
public final class C10398b extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C10368a f22761b;

    /* renamed from: c */
    public final TextView f22762c = ((TextView) this.itemView.findViewById(R.id.title));

    /* renamed from: d */
    public final TextView f22763d = ((TextView) this.itemView.findViewById(R.id.subtitle));

    /* renamed from: e */
    public final Button f22764e = ((Button) this.itemView.findViewById(R.id.edit));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10398b(ViewGroup viewGroup, C10368a aVar) {
        super(C0114h.m305j0(viewGroup, R.layout.view_native_buy_it_now_change_shipping_address_item, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(aVar, "dispatcher");
        this.f22761b = aVar;
    }
}
