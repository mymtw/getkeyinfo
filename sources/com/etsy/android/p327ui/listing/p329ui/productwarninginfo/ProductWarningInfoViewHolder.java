package com.etsy.android.p327ui.listing.p329ui.productwarninginfo;

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

/* renamed from: com.etsy.android.ui.listing.ui.productwarninginfo.ProductWarningInfoViewHolder */
public final class ProductWarningInfoViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f23308b;

    /* renamed from: c */
    public final Button f23309c;

    public ProductWarningInfoViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_product_warning_info, false));
        this.f23308b = cVar;
        View findViewById = this.itemView.findViewById(R.id.product_warning_info);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.product_warning_info)");
        this.f23309c = (Button) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10621a) {
            ViewExtensions.m12869m(this.f23309c);
            this.f23309c.setText(((C10621a) jVar).f23310a);
            ViewExtensions.m12866j(this.f23309c, new ProductWarningInfoViewHolder$bind$1(this, jVar));
            return;
        }
        throw new IllegalArgumentException();
    }
}
