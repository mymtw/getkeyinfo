package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CarbonEmissionSignal;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.d */
public final class C9372d extends C9370c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9372d(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_msco_carbon_emissions_signal, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        BaseModel data = cartGroupItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.CarbonEmissionSignal");
        ((TextView) this.itemView.findViewById(R.id.carbon_signal_text)).setText(((CarbonEmissionSignal) data).getSignalText());
    }
}
