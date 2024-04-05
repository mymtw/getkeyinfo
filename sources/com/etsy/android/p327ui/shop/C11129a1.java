package com.etsy.android.p327ui.shop;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.shop.a1 */
public interface C11129a1 {
    @C20183f("/etsyapps/v3/bespoke/public/shops/{shopId}/reviews")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo36826a(@C20196s("shopId") String str, @C20197t("referrer_listing_id") String str2, @C20197t("sort_option") String str3, @C20197t("reviews_dsml_models_variant") String str4, @C20197t("limit") int i, @C20197t("offset") int i2);
}
