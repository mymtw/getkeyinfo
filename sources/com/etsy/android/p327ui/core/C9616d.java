package com.etsy.android.p327ui.core;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.core.d */
public interface C9616d {
    @C20183f("/etsyapps/v3/bespoke/member/collections")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo32295a(@C20197t("collection_key") String str, @C20197t("collection_slug") String str2, @C20197t("username") String str3, @C20197t("limit") Integer num, @C20197t("offset") Integer num2, @C20197t("query") String str4, @C20197t("on_sale_only") Integer num3, @C20197t("available_only") Integer num4);
}
