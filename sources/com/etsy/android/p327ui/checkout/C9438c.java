package com.etsy.android.p327ui.checkout;

import kotlin.coroutines.C19340c;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.checkout.c */
public interface C9438c {
    @C20192o("/etsyapps/v3/bespoke/member/checkout/{cart_id}/paypal/order/{order_id}/confirm")
    /* renamed from: a */
    Object mo31883a(@C20196s("cart_id") String str, @C20196s("order_id") String str2, @C20197t("dark_mode") String str3, C19340c<? super C20145v<PayPalOrderConfirmationResponse>> cVar);
}
