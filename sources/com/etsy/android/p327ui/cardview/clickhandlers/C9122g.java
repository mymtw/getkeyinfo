package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.DialogInterface;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.interfaces.ListingLike;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.g */
public final /* synthetic */ class C9122g implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ C9125j f20047b;

    /* renamed from: c */
    public final /* synthetic */ ListingLike f20048c;

    public /* synthetic */ C9122g(C9125j jVar, ListingCard listingCard) {
        this.f20047b = jVar;
        this.f20048c = listingCard;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f20047b.mo31351h(this.f20048c, "listing_card_action_cancel");
    }
}
