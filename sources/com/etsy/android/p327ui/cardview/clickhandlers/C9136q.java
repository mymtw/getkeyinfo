package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.DialogInterface;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import p367ib.C12924b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.q */
public final /* synthetic */ class C9136q implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SavedCartClickHandler f20068b;

    /* renamed from: c */
    public final /* synthetic */ SavedCart f20069c;

    /* renamed from: d */
    public final /* synthetic */ int f20070d;

    public /* synthetic */ C9136q(SavedCartClickHandler savedCartClickHandler, SavedCart savedCart, int i) {
        this.f20068b = savedCartClickHandler;
        this.f20069c = savedCart;
        this.f20070d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SavedCartClickHandler savedCartClickHandler = this.f20068b;
        SavedCart savedCart = this.f20069c;
        int i2 = this.f20070d;
        savedCartClickHandler.getClass();
        savedCartClickHandler.mo31336h(new C12924b.C12927c(savedCart), i2, (String) null);
    }
}
