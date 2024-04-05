package com.etsy.android.http;

import com.google.android.material.badge.BadgeDrawable;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.etsy.android.http.a */
public final class C6489a {

    /* renamed from: a */
    public static final Map<String, String> f14393a = C19294b0.m32562s0(new Pair("*", "%2A"), new Pair(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20"), new Pair("%7E", "~"));

    /* renamed from: a */
    public static final String m12900a(LinkedHashMap linkedHashMap) {
        return C19327t.m32644Z0(linkedHashMap.entrySet(), "&", (String) null, (String) null, HttpExtensionsKt$joinToQueryString$1.INSTANCE, 30);
    }

    /* renamed from: b */
    public static final String m12901b(String str) {
        C19383o.m32797g(str, "<this>");
        String encode = URLEncoder.encode(str, "UTF-8");
        C19383o.m32796f(encode, "encode(this, UTF_8)");
        for (Map.Entry next : f14393a.entrySet()) {
            encode = C19457k.m33023a1(encode, (String) next.getKey(), (String) next.getValue(), false);
        }
        return encode;
    }
}
