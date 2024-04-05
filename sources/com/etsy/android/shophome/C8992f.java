package com.etsy.android.shophome;

import com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.shophome.f */
public interface C8992f {
    @C20183f("/etsyapps/v3/bespoke/member/shops/{shop_id}/listings-view")
    /* renamed from: a */
    C8071s<C20145v<ShopListingsSearchResult>> mo30657a(@C20196s("shop_id") String str, @C20197t("section_id") String str2, @C20197t("sort_order") String str3, @C20197t("offset") int i, @C20197t("limit") int i2, @C20197t("include_additional_listing_images") String str4);
}
