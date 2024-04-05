package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.DialogInterface;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.s */
public final /* synthetic */ class C9138s implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SavedCartClickHandler f20071b;

    /* renamed from: c */
    public final /* synthetic */ SavedCart f20072c;

    /* renamed from: d */
    public final /* synthetic */ int f20073d;

    public /* synthetic */ C9138s(SavedCartClickHandler savedCartClickHandler, SavedCart savedCart, int i) {
        this.f20071b = savedCartClickHandler;
        this.f20072c = savedCart;
        this.f20073d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20071b.mo31333e(this.f20072c, this.f20073d);
    }
}
