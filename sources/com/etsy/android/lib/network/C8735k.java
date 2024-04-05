package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.network.k */
public final class C8735k {

    /* renamed from: a */
    public final C20146w f19181a;

    public C8735k(C20146w wVar) {
        this.f19181a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8735k) && C19383o.m32792b(this.f19181a, ((C8735k) obj).f19181a);
    }

    public final int hashCode() {
        return this.f19181a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CookieHarvesterRetrofit(cookieHarvesterRetrofit=");
        h.append(this.f19181a);
        h.append(')');
        return h.toString();
    }
}
