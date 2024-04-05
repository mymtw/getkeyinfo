package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.ExpressCheckoutViewHolder */
public final class ExpressCheckoutViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22461b;

    /* renamed from: c */
    public final Button f22462c;

    public ExpressCheckoutViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_express_checkout, false));
        this.f22461b = cVar;
        View findViewById = this.itemView.findViewById(R.id.button_express_checkout);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.….button_express_checkout)");
        this.f22462c = (Button) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10212a) {
            ViewExtensions.m12866j(this.f22462c, new ExpressCheckoutViewHolder$bind$1(this, jVar));
            return;
        }
        throw new IllegalArgumentException();
    }
}
