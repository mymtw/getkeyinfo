package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.lib.models.apiv3.pastpurchase.ReceiptsWithModule;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReviewCarouselResult;
import kotlin.coroutines.C19340c;
import okhttp3.C19928a0;
import p771sr.C20183f;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.purchases.j */
public interface C11652j {
    @C20183f("/etsyapps/v3/bespoke/member/users/receipts")
    /* renamed from: a */
    Object mo37744a(@C20197t("offset") int i, @C20197t("limit") int i2, C19340c<? super C20145v<C19928a0>> cVar);

    @C20183f("/etsyapps/v3/bespoke/member/users/receipts-and-module")
    /* renamed from: b */
    Object mo37745b(@C20197t("offset") int i, @C20197t("limit") int i2, C19340c<? super C20145v<ReceiptsWithModule>> cVar);

    @C20183f("/etsyapps/v3/member/receipts/reviewable")
    /* renamed from: c */
    Object mo37746c(C19340c<? super C20145v<PastPurchaseReviewCarouselResult>> cVar);
}
