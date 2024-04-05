package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import java.util.Map;
import kotlin.coroutines.C19340c;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20198u;
import p771sr.C20202y;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.p */
public interface C11011p {
    @C20183f("/etsyapps/v3/bespoke/member/search-with-ads/mmx")
    /* renamed from: a */
    Object mo36563a(@C20198u Map<String, String> map, C19340c<? super C20145v<C19928a0>> cVar);

    @C20183f
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo36564b(@C20202y String str, @C20198u Map<String, String> map);

    @C20183f
    /* renamed from: c */
    Object mo36565c(@C20202y String str, @C20198u Map<String, String> map, C19340c<? super C20145v<C19928a0>> cVar);

    @C20183f("/etsyapps/v3/bespoke/member/search-with-ads/mmx")
    /* renamed from: d */
    C8071s<C20145v<C19928a0>> mo36566d(@C20198u Map<String, String> map);
}
