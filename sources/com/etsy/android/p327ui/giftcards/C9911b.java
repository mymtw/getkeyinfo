package com.etsy.android.p327ui.giftcards;

import android.content.DialogInterface;
import com.etsy.android.p327ui.user.addresses.AddressDetailFragment;

/* renamed from: com.etsy.android.ui.giftcards.b */
public final /* synthetic */ class C9911b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21866b;

    public /* synthetic */ C9911b(int i) {
        this.f21866b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21866b) {
            case 0:
                GiftCardCreateFragment.m34984onGiftCardCreateError$lambda6(dialogInterface, i);
                return;
            default:
                AddressDetailFragment.m35056handleBackNavigation$lambda9(dialogInterface, i);
                return;
        }
    }
}
