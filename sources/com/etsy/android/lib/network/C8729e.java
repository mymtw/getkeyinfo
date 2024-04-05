package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;

/* renamed from: com.etsy.android.lib.network.e */
public final class C8729e {

    /* renamed from: a */
    public final C20009t f19175a;

    public C8729e(C20009t tVar) {
        this.f19175a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8729e) && C19383o.m32792b(this.f19175a, ((C8729e) obj).f19175a);
    }

    public final int hashCode() {
        return this.f19175a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredOAuth2Okhttp(OAuth2Client=");
        h.append(this.f19175a);
        h.append(')');
        return h.toString();
    }
}
