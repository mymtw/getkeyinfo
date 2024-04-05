package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;

/* renamed from: com.etsy.android.lib.network.j */
public final class C8734j {

    /* renamed from: a */
    public final C20009t f19180a;

    public C8734j(C20009t tVar) {
        this.f19180a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8734j) && C19383o.m32792b(this.f19180a, ((C8734j) obj).f19180a);
    }

    public final int hashCode() {
        return this.f19180a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CookieHarvesterOkHttpClient(cookieHarvesterOkHttpClient=");
        h.append(this.f19180a);
        h.append(')');
        return h.toString();
    }
}
