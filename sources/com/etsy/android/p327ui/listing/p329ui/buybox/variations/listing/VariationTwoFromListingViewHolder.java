package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.VariationTwoFromListingViewHolder */
public final class VariationTwoFromListingViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22707b;

    /* renamed from: c */
    public final CollageTextInput f22708c;

    static {
        CollageTextInput.C9047a aVar = CollageTextInput.Companion;
    }

    public VariationTwoFromListingViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_variation_two_from_listing, false));
        this.f22707b = cVar;
        View findViewById = this.itemView.findViewById(R.id.selector);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.selector)");
        this.f22708c = (CollageTextInput) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10350b) {
            C10350b bVar = (C10350b) jVar;
            Variation variation = bVar.f22712a;
            CollageTextInput collageTextInput = this.f22708c;
            collageTextInput.setFocusable(false);
            collageTextInput.setLabelText(StringEscapeUtils.unescapeHtml4(variation.getName()));
            collageTextInput.setRequired(true);
            collageTextInput.showCursor(false);
            VariationValue variationValue = bVar.f22713b;
            if (variationValue != null) {
                collageTextInput.setText(variationValue.toString());
            }
            ViewExtensions.m12866j(this.f22708c, new VariationTwoFromListingViewHolder$bind$2(this, jVar));
            this.f22708c.setErrorText(bVar.f22714c);
            return;
        }
        throw new IllegalStateException();
    }
}
