package com.etsy.android.p327ui.user.addresses;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.addresses.d */
public final /* synthetic */ class C11394d implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddressDetailFragment f25122b;

    public /* synthetic */ C11394d(AddressDetailFragment addressDetailFragment) {
        this.f25122b = addressDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AddressDetailFragment.m35055handleBackNavigation$lambda8(this.f25122b, dialogInterface, i);
    }
}
