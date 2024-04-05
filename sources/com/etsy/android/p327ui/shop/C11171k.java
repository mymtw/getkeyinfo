package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.datatypes.EtsyId;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.shop.k */
public interface C11171k {
    @C20183f("/etsyapps/v3/public/translations/shops/{shopId}/faqs")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo36840a(@C20196s("shopId") EtsyId etsyId, @C20197t("language") String str);
}
