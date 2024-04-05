package com.etsy.android.p327ui.user.addresses;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.addresses.b */
public final /* synthetic */ class C11390b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddressDetailFragment f25119b;

    public /* synthetic */ C11390b(AddressDetailFragment addressDetailFragment) {
        this.f25119b = addressDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AddressDetailFragment.m35057showDeleteConfirmation$lambda3(this.f25119b, dialogInterface, i);
    }
}
