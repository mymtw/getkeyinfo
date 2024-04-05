package com.etsy.android.p327ui.cart.viewholders;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;

/* renamed from: com.etsy.android.ui.cart.viewholders.p */
public final /* synthetic */ class C9402p implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C9405s f20837b;

    /* renamed from: c */
    public final /* synthetic */ CartGroupItem f20838c;

    public /* synthetic */ C9402p(C9405s sVar, CartGroupItem cartGroupItem) {
        this.f20837b = sVar;
        this.f20838c = cartGroupItem;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9405s sVar = this.f20837b;
        CartGroupItem cartGroupItem = this.f20838c;
        boolean isChecked = sVar.f20848h.isChecked();
        ServerDrivenAction action = cartGroupItem.getAction("gift_wrap");
        if (action != null) {
            action.addParam("value", String.valueOf(isChecked));
            sVar.f20843c.mo45936d(sVar.itemView, action);
        }
    }
}
