package com.etsy.android.p327ui.cart.viewholders;

import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.jakewharton.rxbinding2.widget.C17032r;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.cart.viewholders.o */
public final /* synthetic */ class C9401o implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C9405s f20835b;

    /* renamed from: c */
    public final /* synthetic */ CartGroupItem f20836c;

    public /* synthetic */ C9401o(C9405s sVar, CartGroupItem cartGroupItem) {
        this.f20835b = sVar;
        this.f20836c = cartGroupItem;
    }

    public final void accept(Object obj) {
        C9405s sVar = this.f20835b;
        C17032r rVar = (C17032r) obj;
        sVar.mo31846l(this.f20836c, sVar.f20850j.getText().toString());
    }
}
