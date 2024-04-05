package com.etsy.android.p327ui.conversation.details.models;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import p010a9.C0048b;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.ListingPartialDatabaseModel */
public final class ListingPartialDatabaseModel {

    /* renamed from: a */
    public final long f21186a;

    /* renamed from: b */
    public final String f21187b;

    /* renamed from: c */
    public final String f21188c;

    /* renamed from: d */
    public final String f21189d;

    /* renamed from: e */
    public final String f21190e;

    /* renamed from: f */
    public final String f21191f;

    /* renamed from: g */
    public Integer f21192g;

    /* renamed from: h */
    public String f21193h;

    public ListingPartialDatabaseModel(@C17402n(name = "listing_id") long j, @C17402n(name = "title") String str, @C17402n(name = "url") String str2, @C17402n(name = "image_url") String str3, @C17402n(name = "price") String str4, @C17402n(name = "currency_code") String str5, @C17402n(name = "status") Integer num, @C17402n(name = "status_value") String str6) {
        C0048b.m167f(str, "title", str2, "url", str3, "imageUrl");
        this.f21186a = j;
        this.f21187b = str;
        this.f21188c = str2;
        this.f21189d = str3;
        this.f21190e = str4;
        this.f21191f = str5;
        this.f21192g = num;
        this.f21193h = str6;
    }
}
