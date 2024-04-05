package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.VariationTwoFromInventoryUiViewHolder */
public final class VariationTwoFromInventoryUiViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22676b;

    /* renamed from: c */
    public final CollageTextInput f22677c;

    static {
        CollageTextInput.C9047a aVar = CollageTextInput.Companion;
    }

    public VariationTwoFromInventoryUiViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_variation_two_from_inventory_ui, false));
        this.f22676b = cVar;
        View findViewById = this.itemView.findViewById(R.id.selector);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.selector)");
        this.f22677c = (CollageTextInput) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10336b) {
            CollageTextInput collageTextInput = this.f22677c;
            collageTextInput.setFocusable(false);
            C10336b bVar = (C10336b) jVar;
            collageTextInput.setLabelText(bVar.f22684a);
            collageTextInput.setRequired(true);
            collageTextInput.showCursor(false);
            AppsInventoryUiOption appsInventoryUiOption = bVar.f22687d;
            if (appsInventoryUiOption != null) {
                collageTextInput.setText(appsInventoryUiOption.toString());
            }
            ViewExtensions.m12866j(this.f22677c, new VariationTwoFromInventoryUiViewHolder$bind$2(this, jVar));
            this.f22677c.setErrorText(bVar.f22688e);
            return;
        }
        throw new IllegalStateException();
    }
}
