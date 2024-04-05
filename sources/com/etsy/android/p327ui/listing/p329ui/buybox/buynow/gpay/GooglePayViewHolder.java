package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.gpay.GooglePayViewHolder */
public final class GooglePayViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22483b;

    /* renamed from: c */
    public final View f22484c;

    public GooglePayViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_google_pay, false));
        this.f22483b = cVar;
        View findViewById = this.itemView.findViewById(R.id.button_express_google_pay);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…utton_express_google_pay)");
        this.f22484c = findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10223a) {
            ViewExtensions.m12866j(this.f22484c, new GooglePayViewHolder$bind$1(this));
            return;
        }
        throw new IllegalStateException();
    }
}
