package com.etsy.android.p327ui.util;

import com.etsy.android.lib.models.ShopFollowResponse;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import java.util.List;
import java.util.Map;
import okhttp3.C19928a0;
import p248tp.C8048a;
import p248tp.C8071s;
import p771sr.C20179b;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.util.i */
public interface C11781i {
    @C20179b("/etsyapps/v3/bespoke/member/favorites/listings/{listingId}")
    /* renamed from: a */
    C8048a mo38049a(@C20196s("listingId") String str);

    @C20192o("/etsyapps/v3/bespoke/member/favorite-shop-with-share")
    @C20182e
    /* renamed from: b */
    C8071s<ShopFollowResponse> mo38050b(@C20181d Map<String, String> map);

    @C20192o("/etsyapps/v3/bespoke/member/favorite-listing-with-share")
    @C20182e
    /* renamed from: c */
    C8048a mo38051c(@C20181d Map<String, String> map);

    @C20179b("/etsyapps/v3/bespoke/member/users/favorites/shops/{targetId}")
    /* renamed from: d */
    C8071s<C20145v<C19928a0>> mo38052d(@C20196s("targetId") String str);

    @C20183f("/etsyapps/v3/member/users/{user_id}/favorites/listings")
    /* renamed from: e */
    C8071s<List<ListingCard>> mo38053e(@C20196s("user_id") String str, @C20197t("offset") int i, @C20197t("limit") int i2);
}
