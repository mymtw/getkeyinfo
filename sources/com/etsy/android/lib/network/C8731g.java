package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.network.g */
public final class C8731g {

    /* renamed from: a */
    public final C20146w f19177a;

    public C8731g(C20146w wVar) {
        this.f19177a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8731g) && C19383o.m32792b(this.f19177a, ((C8731g) obj).f19177a);
    }

    public final int hashCode() {
        return this.f19177a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredV3MoshiRetrofit(v3moshiRetrofit=");
        h.append(this.f19177a);
        h.append(')');
        return h.toString();
    }
}
