package com.etsy.android.p327ui.listing.p329ui.buybox.klarna;

import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.klarna.KlarnaInfoViewHolder */
public final class KlarnaInfoViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22550b;

    /* renamed from: c */
    public final TextView f22551c;

    public KlarnaInfoViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_klarna_info, false));
        this.f22550b = cVar;
        View findViewById = this.itemView.findViewById(R.id.listing_text_klarna_info);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…listing_text_klarna_info)");
        this.f22551c = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10260a) {
            C10260a aVar = (C10260a) jVar;
            C19543e0.m33318k0(this.f22551c, aVar.f22552a.getText(), aVar.f22552a.getInfoModal(), new KlarnaInfoViewHolder$bind$1(this));
            return;
        }
        throw new IllegalArgumentException();
    }
}
