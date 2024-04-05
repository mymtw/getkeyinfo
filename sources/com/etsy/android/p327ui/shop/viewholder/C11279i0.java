package com.etsy.android.p327ui.shop.viewholder;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p407nf.C13113a;

/* renamed from: com.etsy.android.ui.shop.viewholder.i0 */
public final class C11279i0 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ListingLike f24897b;

    /* renamed from: c */
    public final /* synthetic */ C11281j0 f24898c;

    public C11279i0(C11281j0 j0Var, ListingLike listingLike) {
        this.f24898c = j0Var;
        this.f24897b = listingLike;
    }

    public final void onViewClick(View view) {
        ListingLike listingLike;
        C13113a aVar = this.f24898c.f24904e;
        if (aVar != null && (listingLike = this.f24897b) != null) {
            aVar.mo31349e(listingLike, true, (Bundle) null);
        }
    }
}
