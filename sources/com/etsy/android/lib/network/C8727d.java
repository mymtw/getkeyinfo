package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.network.d */
public final class C8727d {

    /* renamed from: a */
    public final C20146w f19172a;

    public C8727d(C20146w wVar) {
        this.f19172a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8727d) && C19383o.m32792b(this.f19172a, ((C8727d) obj).f19172a);
    }

    public final int hashCode() {
        return this.f19172a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredOAuth2MoshiRetrofit(moshiOAuth2Retrofit=");
        h.append(this.f19172a);
        h.append(')');
        return h.toString();
    }
}
