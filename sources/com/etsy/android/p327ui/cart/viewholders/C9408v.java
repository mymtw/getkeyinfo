package com.etsy.android.p327ui.cart.viewholders;

import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.MessageToSeller;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.shop.BaseShopHomeFragment;
import com.jakewharton.rxbinding2.widget.C17032r;
import java.io.Serializable;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.cart.viewholders.v */
public final /* synthetic */ class C9408v implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f20863b;

    /* renamed from: c */
    public final /* synthetic */ Object f20864c;

    /* renamed from: d */
    public final /* synthetic */ Serializable f20865d;

    public /* synthetic */ C9408v(Object obj, Serializable serializable, int i) {
        this.f20863b = i;
        this.f20864c = obj;
        this.f20865d = serializable;
    }

    public final void accept(Object obj) {
        switch (this.f20863b) {
            case 0:
                C9409w wVar = (C9409w) this.f20864c;
                CartGroupItem cartGroupItem = (CartGroupItem) this.f20865d;
                C17032r rVar = (C17032r) obj;
                wVar.getClass();
                String obj2 = wVar.f20867c.getText().toString();
                ((MessageToSeller) cartGroupItem.getData()).setMessage(obj2);
                ServerDrivenAction action = cartGroupItem.getAction("message_to_seller");
                if (action != null) {
                    action.addParam("message_to_seller", obj2);
                    wVar.f20868d.mo45936d(wVar.itemView, action);
                    return;
                }
                return;
            default:
                ((BaseShopHomeFragment) this.f20864c).lambda$translateFAQs$10((FAQs) this.f20865d, (Throwable) obj);
                return;
        }
    }
}
