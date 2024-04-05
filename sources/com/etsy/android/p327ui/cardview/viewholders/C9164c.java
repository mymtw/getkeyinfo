package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.stylekit.views.FavHeartButton;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.c */
public final /* synthetic */ class C9164c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9171e f20170b;

    /* renamed from: c */
    public final /* synthetic */ ListingCard f20171c;

    /* renamed from: d */
    public final /* synthetic */ FavHeartButton f20172d;

    public /* synthetic */ C9164c(C9171e eVar, ListingCard listingCard, FavHeartButton favHeartButton) {
        this.f20170b = eVar;
        this.f20171c = listingCard;
        this.f20172d = favHeartButton;
    }

    public final void onClick(View view) {
        C9171e eVar = this.f20170b;
        ListingCard listingCard = this.f20171c;
        FavHeartButton favHeartButton = this.f20172d;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(listingCard, "$listing");
        C19383o.m32797g(favHeartButton, "$favIcon");
        eVar.f20189c.f20044f.mo31348d(listingCard, favHeartButton, -1);
    }
}
