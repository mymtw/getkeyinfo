package com.etsy.android.p327ui.shop;

import java.util.Map;
import kotlin.coroutines.C19340c;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20198u;
import p771sr.C20202y;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.shop.j */
public interface C11169j {
    @C20183f("/etsyapps/v3/bespoke/public/shops/{shopId}/listings-view")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo36837a(@C20196s("shopId") String str, @C20198u Map<String, String> map);

    @C20183f
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo36838b(@C20202y String str, @C20198u Map<String, String> map);

    @C20183f
    /* renamed from: c */
    Object mo36839c(@C20202y String str, @C20198u Map<String, String> map, C19340c<? super C20145v<C19928a0>> cVar);
}
