package com.etsy.android.p327ui.cardview.clickhandlers;

import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.interfaces.ListingLike;
import p400mf.C13073a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.h */
public final class C9123h implements C13073a {

    /* renamed from: a */
    public final /* synthetic */ ListingLike f20049a;

    /* renamed from: b */
    public final /* synthetic */ boolean f20050b;

    /* renamed from: c */
    public final /* synthetic */ int f20051c;

    /* renamed from: d */
    public final /* synthetic */ C9125j f20052d;

    public C9123h(C9125j jVar, ListingCard listingCard, boolean z, int i) {
        this.f20052d = jVar;
        this.f20049a = listingCard;
        this.f20050b = z;
        this.f20051c = i;
    }

    /* renamed from: a */
    public final void mo31346a() {
        this.f20049a.setIsFavorite(true);
        if (!this.f20050b) {
            this.f20052d.f20056d.mo31300i(this.f20051c);
        }
        this.f20052d.mo31351h(this.f20049a, "favorite_item");
    }

    /* renamed from: b */
    public final void mo31347b() {
        this.f20049a.setIsFavorite(false);
        if (!this.f20050b) {
            this.f20052d.f20056d.mo31300i(this.f20051c);
        }
        this.f20052d.mo31351h(this.f20049a, "remove_favorite_item");
    }
}
