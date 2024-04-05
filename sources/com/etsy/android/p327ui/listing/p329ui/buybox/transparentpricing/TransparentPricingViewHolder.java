package com.etsy.android.p327ui.listing.p329ui.buybox.transparentpricing;

import android.support.p013v4.media.C0069a;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p398md.C13048a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.transparentpricing.TransparentPricingViewHolder */
public final class TransparentPricingViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22662b;

    /* renamed from: c */
    public final TextView f22663c;

    public TransparentPricingViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_transparent_pricing, false));
        this.f22662b = cVar;
        View findViewById = this.itemView.findViewById(R.id.text_transparent_pricing);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…text_transparent_pricing)");
        this.f22663c = (TextView) findViewById;
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f22663c);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        String url;
        if (jVar instanceof C13048a) {
            this.f22663c.setText(((C13048a) jVar).f28696a);
            URLSpan[] urls = this.f22663c.getUrls();
            C19383o.m32796f(urls, "textTransparentPricing.urls");
            URLSpan uRLSpan = (URLSpan) C19318k.m32613e1(urls);
            if (uRLSpan != null && (url = uRLSpan.getURL()) != null) {
                EtsyLinkify.m19608b(this.f22663c, true, false, new TransparentPricingViewHolder$bind$1$1(this, url));
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
