package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;

/* renamed from: com.etsy.android.lib.network.h */
public final class C8732h {

    /* renamed from: a */
    public final C20009t f19178a;

    public C8732h(C20009t tVar) {
        this.f19178a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8732h) && C19383o.m32792b(this.f19178a, ((C8732h) obj).f19178a);
    }

    public final int hashCode() {
        return this.f19178a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfiguredV3Okhttp(v3client=");
        h.append(this.f19178a);
        h.append(')');
        return h.toString();
    }
}
