package com.etsy.android.p327ui.cart.viewholders;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;

/* renamed from: com.etsy.android.ui.cart.viewholders.m */
public final /* synthetic */ class C9398m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C9405s f20828b;

    /* renamed from: c */
    public final /* synthetic */ CartGroupItem f20829c;

    public /* synthetic */ C9398m(C9405s sVar, CartGroupItem cartGroupItem) {
        this.f20828b = sVar;
        this.f20829c = cartGroupItem;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9405s sVar = this.f20828b;
        CartGroupItem cartGroupItem = this.f20829c;
        boolean isChecked = sVar.f20844d.isChecked();
        ServerDrivenAction action = cartGroupItem.getAction("is_gift");
        if (action != null) {
            action.addParam("value", String.valueOf(isChecked));
            sVar.f20843c.mo45936d(sVar.itemView, action);
        }
    }
}
