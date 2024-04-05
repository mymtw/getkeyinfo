package com.etsy.android.uikit.viewholder;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p407nf.C13113a;

/* renamed from: com.etsy.android.uikit.viewholder.a */
public final class C11985a extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ListingCard f26681b;

    /* renamed from: c */
    public final /* synthetic */ C11988d f26682c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11985a(C11988d dVar, C8698l[] lVarArr, ListingCard listingCard) {
        super(lVarArr);
        this.f26682c = dVar;
        this.f26681b = listingCard;
    }

    public final void onViewClick(View view) {
        C13113a aVar = this.f26682c.f26687c;
        if (aVar != null) {
            aVar.mo31349e(this.f26681b, true, (Bundle) null);
        }
    }
}
