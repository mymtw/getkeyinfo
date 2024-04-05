package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p407nf.C13113a;

/* renamed from: com.etsy.android.uikit.viewholder.c */
public final class C11987c extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ListingCard f26684b;

    /* renamed from: c */
    public final /* synthetic */ FavHeartButton f26685c;

    /* renamed from: d */
    public final /* synthetic */ C11988d f26686d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11987c(C11988d dVar, C8698l[] lVarArr, ListingCard listingCard, FavHeartButton favHeartButton) {
        super(lVarArr);
        this.f26686d = dVar;
        this.f26684b = listingCard;
        this.f26685c = favHeartButton;
    }

    public final void onViewClick(View view) {
        C11988d dVar = this.f26686d;
        C13113a aVar = dVar.f26687c;
        if (aVar != null) {
            aVar.mo31348d(this.f26684b, this.f26685c, dVar.getAdapterPosition());
        }
    }
}
