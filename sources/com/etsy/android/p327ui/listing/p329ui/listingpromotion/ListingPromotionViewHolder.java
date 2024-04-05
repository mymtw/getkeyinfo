package com.etsy.android.p327ui.listing.p329ui.listingpromotion;

import android.support.p013v4.media.C0069a;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.listingpromotion.ListingPromotionViewHolder */
public final class ListingPromotionViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22914b;

    /* renamed from: c */
    public final TextView f22915c;

    /* renamed from: d */
    public final TextView f22916d;

    public ListingPromotionViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_promotion, false));
        this.f22914b = cVar;
        View findViewById = this.itemView.findViewById(R.id.text_description);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_description)");
        this.f22915c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_disclaimer);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_disclaimer)");
        this.f22916d = (TextView) findViewById2;
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f22915c);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10447a) {
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12866j(view, new ListingPromotionViewHolder$bind$1(this, jVar));
            C10447a aVar = (C10447a) jVar;
            Spanned s0 = C18263b.m30867s0(aVar.f22920d);
            this.f22915c.setText(s0);
            URLSpan[] urls = this.f22915c.getUrls();
            C19383o.m32796f(urls, "description.urls");
            if (!(urls.length == 0)) {
                EtsyLinkify.m19608b(this.f22915c, true, false, new ListingPromotionViewHolder$bind$2(this, jVar));
            } else {
                this.f22915c.setText(s0.toString());
                EtsyLinkify.m19614h(this.f22915c);
            }
            if (C18263b.m30839d0(aVar.f22921e)) {
                ViewExtensions.m12869m(this.f22916d);
                this.f22916d.setText(aVar.f22921e);
                return;
            }
            this.f22916d.setText("");
            ViewExtensions.m12860d(this.f22916d);
            return;
        }
        throw new IllegalArgumentException();
    }
}
