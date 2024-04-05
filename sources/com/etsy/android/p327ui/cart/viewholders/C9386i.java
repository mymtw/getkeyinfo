package com.etsy.android.p327ui.cart.viewholders;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import kotlin.jvm.internal.C19383o;
import p396mb.C13042h;

/* renamed from: com.etsy.android.ui.cart.viewholders.i */
public final class C9386i implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ CartGroupItem f20786a;

    /* renamed from: b */
    public final /* synthetic */ CartListingViewHolder f20787b;

    public C9386i(CartGroupItem cartGroupItem, CartListingViewHolder cartListingViewHolder) {
        this.f20786a = cartGroupItem;
        this.f20787b = cartListingViewHolder;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        ServerDrivenAction action = this.f20786a.getAction(ServerDrivenAction.TYPE_SAVE_CART_LISTING);
        if (action == null) {
            return true;
        }
        CartListingViewHolder cartListingViewHolder = this.f20787b;
        C9283h hVar = cartListingViewHolder.f20703c;
        View view = cartListingViewHolder.itemView;
        C19383o.m32796f(view, "rootView");
        hVar.mo45937e(view, action, R.string.toast_saved_for_later);
        return true;
    }
}
