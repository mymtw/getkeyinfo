package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import p400mf.C13073a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.e */
public final class C11551e implements C13073a {

    /* renamed from: a */
    public final /* synthetic */ IANListingCard f25575a;

    /* renamed from: b */
    public final /* synthetic */ C11553g f25576b;

    /* renamed from: c */
    public final /* synthetic */ String f25577c;

    /* renamed from: d */
    public final /* synthetic */ Long f25578d;

    public C11551e(IANListingCard iANListingCard, C11553g gVar, String str, Long l) {
        this.f25575a = iANListingCard;
        this.f25576b = gVar;
        this.f25577c = str;
        this.f25578d = l;
    }

    /* renamed from: a */
    public final void mo31346a() {
        this.f25575a.setFav(true);
        Long listingId = this.f25575a.getListingId();
        if (listingId != null) {
            C11553g.m19344a(this.f25576b, listingId.longValue(), true, this.f25577c, this.f25578d);
        }
    }

    /* renamed from: b */
    public final void mo31347b() {
        this.f25575a.setFav(false);
        Long listingId = this.f25575a.getListingId();
        if (listingId != null) {
            C11553g.m19344a(this.f25576b, listingId.longValue(), false, this.f25577c, this.f25578d);
        }
    }
}
