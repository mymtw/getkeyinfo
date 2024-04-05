package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.network.i */
public final class C8733i {

    /* renamed from: a */
    public final C20146w f19179a;

    public C8733i(C20146w wVar) {
        this.f19179a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8733i) && C19383o.m32792b(this.f19179a, ((C8733i) obj).f19179a);
    }

    public final int hashCode() {
        return this.f19179a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredWebMoshiRetrofit(webMoshiRetrofit=");
        h.append(this.f19179a);
        h.append(')');
        return h.toString();
    }
}
