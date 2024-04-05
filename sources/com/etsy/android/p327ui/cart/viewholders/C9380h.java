package com.etsy.android.p327ui.cart.viewholders;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import kotlin.jvm.internal.C19383o;
import p396mb.C13042h;

/* renamed from: com.etsy.android.ui.cart.viewholders.h */
public final class C9380h implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ CartGroupItem f20767a;

    /* renamed from: b */
    public final /* synthetic */ CartListingViewHolder f20768b;

    public C9380h(CartGroupItem cartGroupItem, CartListingViewHolder cartListingViewHolder) {
        this.f20767a = cartGroupItem;
        this.f20768b = cartListingViewHolder;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        ServerDrivenAction action = this.f20767a.getAction("remove");
        if (action == null) {
            return true;
        }
        CartListingViewHolder cartListingViewHolder = this.f20768b;
        C9283h hVar = cartListingViewHolder.f20703c;
        View view = cartListingViewHolder.itemView;
        C19383o.m32796f(view, "rootView");
        hVar.mo45937e(view, action, R.string.toast_removed);
        return true;
    }
}
