package com.etsy.android.p327ui.user.addresses;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.addresses.c */
public final /* synthetic */ class C11392c implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f25120b;

    public /* synthetic */ C11392c(int i) {
        this.f25120b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f25120b) {
            case 0:
                AddressDetailFragment.m35058showDeleteConfirmation$lambda4(dialogInterface, i);
                return;
            default:
                dialogInterface.cancel();
                return;
        }
    }
}
