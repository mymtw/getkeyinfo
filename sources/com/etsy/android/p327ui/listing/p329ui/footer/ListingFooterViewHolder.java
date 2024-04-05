package com.etsy.android.p327ui.listing.p329ui.footer;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.footer.ListingFooterViewHolder */
public final class ListingFooterViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22852b;

    /* renamed from: c */
    public final TextView f22853c;

    /* renamed from: d */
    public final Button f22854d;

    public ListingFooterViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_footer, false));
        this.f22852b = cVar;
        View findViewById = this.itemView.findViewById(R.id.item_listed_date_text);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.item_listed_date_text)");
        this.f22853c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.report_listing_button);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.report_listing_button)");
        this.f22854d = (Button) findViewById2;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10417a) {
            this.f22853c.setText(((C10417a) jVar).f22857c);
            ViewExtensions.m12866j(this.f22854d, new ListingFooterViewHolder$bind$1(this, jVar));
            return;
        }
        throw new IllegalArgumentException();
    }
}
