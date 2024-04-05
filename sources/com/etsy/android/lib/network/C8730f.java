package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.lib.network.f */
public final class C8730f {

    /* renamed from: a */
    public final C20146w f19176a;

    public C8730f(C20146w wVar) {
        this.f19176a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8730f) && C19383o.m32792b(this.f19176a, ((C8730f) obj).f19176a);
    }

    public final int hashCode() {
        return this.f19176a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredV3MoshiMultipartRetrofit(v3MoshiMultipartRetrofit=");
        h.append(this.f19176a);
        h.append(')');
        return h.toString();
    }
}
