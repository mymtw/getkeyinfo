package com.etsy.android.p327ui.listing.p329ui.morefromshop.button;

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

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.button.MoreFromShopButtonViewHolder */
public final class MoreFromShopButtonViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22925b;

    /* renamed from: c */
    public final Button f22926c;

    public MoreFromShopButtonViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_more_from_shop_button, false));
        this.f22925b = cVar;
        View findViewById = this.itemView.findViewById(R.id.shop_all_items);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.shop_all_items)");
        this.f22926c = (Button) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10450b) {
            ViewExtensions.m12866j(this.f22926c, new MoreFromShopButtonViewHolder$bind$1(this));
            return;
        }
        throw new IllegalStateException();
    }
}
