package com.etsy.android.p327ui.cart.viewholders;

import android.widget.CompoundButton;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.c0 */
public final /* synthetic */ class C9371c0 implements C19857l {

    /* renamed from: b */
    public final /* synthetic */ C9373d0 f20757b;

    /* renamed from: c */
    public final /* synthetic */ CartGroupItem f20758c;

    public /* synthetic */ C9371c0(C9373d0 d0Var, CartGroupItem cartGroupItem) {
        this.f20757b = d0Var;
        this.f20758c = cartGroupItem;
    }

    public final Object invoke(Object obj) {
        ServerDrivenAction action;
        C9373d0 d0Var = this.f20757b;
        CartGroupItem cartGroupItem = this.f20758c;
        CompoundButton compoundButton = (CompoundButton) obj;
        if (!(d0Var.f20759c == null || (action = cartGroupItem.getAction(ServerDrivenAction.TYPE_SET_PAYMENT_METHOD)) == null || compoundButton == null)) {
            action.addParam("payment_method", (String) compoundButton.getTag());
            d0Var.f20759c.mo45936d(d0Var.itemView, action);
        }
        return C19394m.f43287a;
    }
}
