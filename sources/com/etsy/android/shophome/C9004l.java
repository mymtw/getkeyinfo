package com.etsy.android.shophome;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20180c;
import p771sr.C20182e;
import p771sr.C20188k;
import p771sr.C20192o;
import p771sr.C20196s;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.shophome.l */
public interface C9004l {
    @C20188k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @C20182e
    @C20192o("/etsyapps/v3/member/shops/{shopId}/vacation-notification")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo30662a(@C20196s("shopId") String str, @C20180c("notification") boolean z);
}
