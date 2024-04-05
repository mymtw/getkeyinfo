package com.etsy.android.p327ui.user;

import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.Transaction;

/* renamed from: com.etsy.android.ui.user.d */
public final class C11517d {

    /* renamed from: a */
    public final Listing f25404a;

    /* renamed from: b */
    public final boolean f25405b;

    /* renamed from: c */
    public final boolean f25406c;

    public C11517d(Transaction transaction) {
        this.f25404a = transaction.getListing();
        Listing listing = transaction.getListing();
        boolean z = true;
        this.f25405b = listing != null && listing.isActive() && !listing.isDigitalDownload() && !listing.isVintage() && !listing.isSoldOut() && !transaction.isGiftCard();
        Listing listing2 = transaction.getListing();
        this.f25406c = (listing2 == null || !listing2.isActive() || listing2.isPersonalizable()) ? false : z;
    }
}
